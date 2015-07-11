package b3wi.gsm.model.entity.common.converter;

import java.sql.Timestamp;
import java.time.LocalDateTime;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class LocalDateTimeToTimestampConverter implements AttributeConverter<LocalDateTime, Timestamp>
{

    @Override
    public Timestamp convertToDatabaseColumn(LocalDateTime datetime)
    {
        return Timestamp.valueOf(datetime);
    }

    @Override
    public LocalDateTime convertToEntityAttribute(Timestamp timestamp)
    {
        return timestamp.toLocalDateTime();
    }

}
