package br.ufc.crateus.dsdm.model;

import br.ufc.crateus.dsdm.R;

public enum Country {

    EUA(0, "Estados Unidos", R.mipmap.american_flag, "Os Estados Unidos da América são um país com 50 estados que cobrem uma vasta faixa da América do Norte, com o Alasca ao noroeste e o Havaí no Oceano Pacífico, estendendo a presença do país. As principais cidades da costa atlântica são Nova York, um centro financeiro e cultural global, e a capital, Washington, DC. Chicago, uma metrópole do centro-oeste, é conhecida por sua importante arquitetura, enquanto Los Angeles, na costa oeste, é famosa pelas produções cinematográficas de Hollywood."),
    INDIA(1, "Índia", R.mipmap.indian_flag, "A Índia é um extenso país do Sul da Ásia com geografia diversificada, incluindo desde os picos do Himalaia até a costa do Oceano Índico, e uma história que remonta a cinco milênios. No norte, alguns dos monumentos do império mogol são o complexo do Forte Vermelho, em Délhi, e a imponente mesquita Jama Masjid, bem como o clássico mausoléu Taj Mahal, em Agra. Os peregrinos tomam banho no Ganges, em Varanasi. Rishikesh é um centro de ioga que serve de base para trilhas no Himalaia."),
    CHINA(2, "China", R.mipmap.chinese_flag, "A China é uma nação muito populosa da Ásia Oriental cuja ampla paisagem abrange pradarias, desertos, montanhas, lagos, rios e mais de 14.000 km de litoral. A capital Pequim combina a arquitetura moderna com locais históricos, como o complexo de palácios da Cidade Proibida e a Praça da Paz Celestial. Xangai é um centro financeiro global repleto de arranha-céus. A emblemática Muralha da China corta a região norte do país de leste a oeste."),
    JAPAN(3, "Japão", R.mipmap.japanese_flag, "O Japão, país insular no Oceano Pacífico, tem cidades densas, palácios imperiais, parques nacionais montanhosos e milhares de santuários e templos. Os trens-bala Shinkansen conectam as principais ilhas: Kyushu (com as praias subtropicais de Okinawa), Honshu (onde ficam Tóquio e a sede do memorial da bomba atômica de Hiroshima) e Hokkaido (famosa como destino para a prática de esqui). Tóquio, a capital, é conhecida por seus arranha-céus e lojas e pela cultura pop.");

    private int id;
    private String displayName;
    private int resourceFlag;
    private String info;

    Country(int id, String name, int resource_flag, String info) {
        this.id = id;
        this.displayName = name;
        this.resourceFlag = resource_flag;
        this.info = info;
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

    public String getInfo() {
        return info;
    }

    public static Country[] getCountries() {
        return new Country[]{ EUA, INDIA, CHINA, JAPAN };
    }

    public static String[] getDisplayNames() {
        return new String[]{ EUA.getDisplayName(), INDIA.getDisplayName(), CHINA.getDisplayName(), JAPAN.getDisplayName() };
    }
}
