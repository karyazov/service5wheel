package ru.buh4me.base;

import java.util.HashMap;
import java.util.List;

public class Bases1c {
    private HashMap<String, Base1c> dictBases1c;

    public HashMap<String, Base1c> getDictBases1c() {
        return dictBases1c;
    }

    public void setDictBases1c(List<Base1c> listOfBases) {
        HashMap<String, Base1c> dictBases1c = new HashMap<>();

        for (Base1c b : listOfBases) {
            dictBases1c.put(b.getBaseName(), b);
            b.setServer_1c(b.getServer_1c());
            b.setServer_SQL(b.getServer_SQL());
        }

        this.dictBases1c = dictBases1c;
    }
}
