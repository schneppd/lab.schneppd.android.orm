package lab.schneppd.testorm;

import org.greenrobot.greendao.converter.PropertyConverter;

/**
 * Created by schneppd on 6/18/17.
 */

public class NoteTypeConverter implements PropertyConverter<NoteType, String> {
    @Override
    public NoteType convertToEntityProperty(String databaseValue) {
        return NoteType.valueOf(databaseValue);
    }

    @Override
    public String convertToDatabaseValue(NoteType entityProperty) {
        return entityProperty.name();
    }
}
