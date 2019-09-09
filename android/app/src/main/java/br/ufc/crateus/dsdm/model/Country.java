package br.ufc.crateus.dsdm.model;

public enum Country {

    EUA(0, "Estados Unidos"),
    INDIA(1, "Índia"),
    CHINA(2, "China"),
    JAPAN(3, "Japão");

    private int id;
    private String displayName;

    Country(int id, String name) {
        this.id = id;
        this.displayName = name;
    }

    public int getId() {
        return id;
    }

    public String getDisplayName() {
        return displayName;
    }



    public static Country[] getCountries() {
        return new Country[]{ EUA, INDIA, CHINA, JAPAN };
    }

    public static String[] getDisplayNames() {
        return new String[]{ EUA.getDisplayName(), INDIA.getDisplayName(), CHINA.getDisplayName(), JAPAN.getDisplayName() };
    }
}
