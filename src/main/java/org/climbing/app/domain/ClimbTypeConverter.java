package org.climbing.app.domain;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class ClimbTypeConverter implements AttributeConverter<ClimbType, String> {

    @Override
    public String convertToDatabaseColumn(ClimbType attribute) {
        return attribute == null ? null : attribute.name().toLowerCase();
    }

    @Override
    public ClimbType convertToEntityAttribute(String dbData) {
        return dbData == null ? null : ClimbType.valueOf(dbData.toUpperCase());
    }
}
