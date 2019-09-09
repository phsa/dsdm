package br.ufc.crateus.dsdm.model;

import br.ufc.crateus.dsdm.R;

public enum Country {

    EUA(0, "Estados Unidos", R.mipmap.american_flag),
    INDIA(1, "Índia", R.mipmap.indian_flag),
    CHINA(2, "China", R.mipmap.chinese_flag),
    JAPAN(3, "Japão", R.mipmap.japanese_flag);

    private int id;
    private String displayName;
    private int resourceFlag;

    Country(int id, String name, int resource_flag) {
        this.id = id;
        this.displayName = name;
        this.resourceFlag = resource_flag;
    }

    public int getId() {
        return id;
    }

    public String getDisplayName() {
        return displayName;
    }

    public int getResourceFlag() {
        return resourceFlag;
    }

    public static Country[] getCountries() {
        return new Country[]{ EUA, INDIA, CHINA, JAPAN };
    }

    public static String[] getDisplayNames() {
        return new String[]{ EUA.getDisplayName(), INDIA.getDisplayName(), CHINA.getDisplayName(), JAPAN.getDisplayName() };
    }
}
