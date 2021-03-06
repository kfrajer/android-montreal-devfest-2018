package android.montreal.devfest.stuff.usecases;

import android.montreal.devfest.stuff.entities.RandomStuffEntity;

class DataToEntityMapper {
    static RandomStuffEntity map(RandomStuffData data) {
        if (data == null) {
            return null;
        }
        return new RandomStuffEntity(data.text, data.number);
    }
}
