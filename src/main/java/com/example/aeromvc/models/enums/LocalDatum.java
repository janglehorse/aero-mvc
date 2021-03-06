package com.example.aeromvc.models.enums;

import com.example.aeromvc.models.Wpt;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
public class LocalDatum {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    private String name;

    @OneToMany
    @JoinColumn(name = "arincrgn_id")
    private List<Wpt> waypoints = new ArrayList<>();

    public LocalDatum() {}

    public LocalDatum(String name) { this.name = name; }

    public int getId() { return id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public List<Wpt> getWaypoints() { return waypoints; }

}
//package com.example.aeromvc.models.enums;
//
//public class  LocalDatum {
//
//    ADI	("ADINDAN	MEAN FOR Ethiopia, Sudan"),
//    AFG	("AFGOOYE	Somalia"),
//    AIA	("ANTIGUA ISLAND ASTRO 1943	Antigua, Leeward Islands"),
//    AIN	("AIN EL ABD 1970	Bahrain Island"),
//    AMA	("AMERICAN SAMOA 1962	America Samoa Islands"),
//    ANO	("ANNA 1 ASTRO 1965	Cocos Islands"),
//    ARF	("ARC 1950	MEAN(BC,BY,UG,UE,LT,MI,MZ,WZ,ZA,ZI,CG(Za"),
//    ARS	("ARC 1960	MEAN FOR Kenya, Tanzania, Uganda"),
//    ASC	("ASCENSION ISLAND 1958	Ascension Island"),
//    ASM	("MONTSERRAT ISLAND ASTRO 1958	Montserrat, Leeward Islands"),
//    ASQ	("ASTRO STATION 1952	Marcus Island"),
//    ATF	("ASTRO BEACON E 1845	Iwo Jima"),
//    AUA	("AUSTRALIAN GEODETIC 1966	Australia, Tasmania"),
//    AUG	("AUSTRALIAN GEODETIC 1984	Australia, Tasmania, Papua New Guinea"),
//    BAT	("DJAKARTA (BATAVI	Sumatra (Indonesia)"),
//    BER	("BERMUDA 1957	Bermuda Islands"),
//    BID	("BISSAU	Guinea-Bissau"),
//    BOO	("BOGOTA OBSERVATORY	Columbia"),
//    BUR	("BUKIT RIMPAH	Bangka and Belitung Islands (Indonesia)"),
//    CAC	("CAPE CANAVERAL	Fla & Bahamas"),
//    CAI	("CAMPO INCHAUSPE 1969	Argentina"),
//    CAO	("CANTON ASTRO 1966	Phoenix Islands"),
//    CAP	("CAPE	South Africa"),
//    CAZ	("CAMP AREA ASTRO	Camp McMurdo Area, Antarctica"),
//    CCD	("S-JTSK	Czechoslovakia"),
//    CGE	("CARTHAGE	Tunisia"),
//    CHI	("CHATHAM ISLAND ASTRO 1971	Chatham Island (New Zealand)"),
//    CHU	("CHUA ASTRO	Paraguay"),
//    COA	("CORREGO ALEGRE	Brazil"),
//    DAL	("DABOLA	Guinea"),
//    DID	("DECEPTION ISLAND	Deception Island, Antarctica"),
//    DOB	("GUX 1 ASTRO	Guadalcanal Island"),
//    EAS	("EASTER ISLAND 1967	Easter Island"),
//    ENW	("WAKE-ENIWETOK 1960	Marshall Islands"),
//    EST	("CO-ORDINATE SYSTEM 1937 OF ESTONIA	Estonia"),
//    EUR	("EUROPEAN 1950	MEAN(AU,BE,DA,FI,FR,GM,GI,GR,IT,LU,NL..."),
//    EUS	("EUROPEAN 1979	MEAN(AU,FI,NL,NO,SP,SW,SZ)"),
//    FAH	("OMAN	Oman"),
//    FLO	("OBSERVATORIO METEOROLOGICO 1939	Corvo and Flores Islands (Azores)"),
//    FOT	("FORT THOMAS 1955	Nevis, St. Kitts, Leeward Islands"),
//    GAA	("GAN 1970	Republic of Maldives"),
//    GEO	("GEODETIC DATUM 1949	New Zealand"),
//    GIZ	("DOS 1968	Gizo Island (New Georgia Islands)"),
//    GRA	("GRACIOSA BASE SW 1948	Azores"),
//    GSE	("GUNUNG SEGARA	Kalimantan (Indonesia)"),
//    GUA	("GUAM 1963	Guam"),
//    HEN	("HERAT NORTH	Afghanistan"),
//    HER	("HERMANNSKOGEL	Slovenia,Croatia,Bosnia,Herzgovna,Serbia"),
//    HIT	("PROVISIONAL SOUTH CHILEAN 1963	Southern Chile (near 53°S)"),
//    HJO	("HJORSEY 1955	Iceland"),
//    HKD	("HONG KONG 1963	Hong Kong"),
//    HTN	("HU-TZU-SHAN	Taiwan"),
//    IBE	("BELLEVUE (IGN)	Efate and Erromango Islands"),
//    IDN	("INDONESIAN 1974	Indonesia(Banka,Belitung,Sumatra,Kaliman)"),
//    IND	("INDIAN	India & Nepal"),
//    INF	("INDIAN 1954	Thailand"),
//    INH	("INDIAN 1975, Thailand	Thailand"),
//    IRL	("IRELAND 1965	Ireland"),
//    ISG	("ISTS 061 ASTRO 1968	South Georgia Island"),
//    IST	("ISTS 073 ASTRO 1969	Diego Garcia"),
//    JOH	("JOHNSTON ISLAND 1961	Johnston Island"),
//    KAN	("KANDAWALA	Sri Lanka"),
//    KEA	("KERTAU 1948	West Malaysia & Singapore"),
//    KEG	("KERGUELEN ISLAND 1949	Kerguelen Island"),
//    KGS	("KOREAN GEO DATUM 1995	South Korea"),
//    KUS	("KUSAIE ASTRO 1951	Caroline Is., Fed. States of Micronesia"),
//    LCF	("L.C. 5 ASTRO 1961	Cayman Brac Island"),
//    LEH	("LEIGON	Ghana"),
//    LIB	("LIBERIA 1964	Liberia"),
//    LUZ	("LUZON	Philippines (Excluding MindanaoIsland)"),
//    MAS	("MASSAWA, Ethiopia	Ethiopia (Eritrea)"),
//    MER	("MERCHICH	Morocco"),
//    MID	("MIDWAY ASTRO 1961	Midway Islands"),
//    MIK	("MAHE 1971	Mahe Island"),
//    MIN	("MINNA	Nigeria"),
//    MOD	("ROME 1940	Sardinia"),
//    MPO	("M'PORALOKO	Gabon"),
//    MVS	("VITI LEVU 1916	Viti Levu Islands (Fiji Islands)"),
//    N	("WGS 1984	Over Water"),
//    NAH	("NAHRWAN	Saudi Arabia"),
//    NAP	("NAPARIMA, BWI	Trinidad & Tobago"),
//    NAR	("NORTH AMERICAN 1983	Alaska, Canada, CONUS, Mexico, C.America"),
//    NAS	("NORTH AMERICAN 1927	CONUS"),
//    NSD	("NORTH SAHARA 1959	Algeria"),
//    OEG	("OLD EGYPTIAN 1907	Egypt"),
//    OGB	("ORDNANCE SURVEY OF GB 1936	Eng'd,Isle of Man,Scot'd,Shet'd Is,Wales"),
//    OHA	("OLD HAWAIIAN (CC)	Mean (Hawai'i, Kauai, Maui, Oahu)"),
//    PHA	("AYABELLA LIGHTHOUSE	Djibouti"),
//    PIT	("PITCAIRN ASTRO 1967	Pitcairn Island"),
//    PLN	("PICO DE LAS NIEVES	Canary Islands"),
//    POS	("PORTO SANTO 1936	Porto Santo and Madeira Islands"),
//    PRP	("PROVISIONAL S AMERICAN 1956	Mean(Bol.,Ch.,Col.,Ecu.,Guy.,Peru,Vnz.)"),
//    PTB	("POINT 58	Mean (Burkina Faso and Niger)"),
//    PTN	("POINT NOIRE 1948	Congo"),
//    PUK	("PULKOVO 1942 (S-42)	Russia (KG, KZ, TI, TX, UZ)"),
//    PUR	("PUERTO RICO	Puerto Rico, Virgin Islands"),
//    QAT	("QATAR NATIONAL	Qatar"),
//    QUO	("QORNOQ	South Greenland"),
//    REU	("REUNION	Mascarene Islands"),
//    SAE	("SANTO (DOS) 1965	Espirito Santo Island"),
//    SAN	("SOUTH AMERICAN 1969	Mean(AR,BL,BR, CI,CO,EC,GY,PA,PE,TD,VE)"),
//    SAO	("SAO BRAZ	Sao Miguel, Santa Maria Islands (Azores)"),
//    SAP	("SAPPER HILL 1943	East Falkland Island"),
//    SCK	("SCHWARZECK	Namibia"),
//    SGB	("GLONASS (PZ-90)	Russian GPS"),
//    SGM	("SELVAGEM GRADE 1938	Salvage Islands"),
//    SHB	("ASTRO DOS 71/4	St. Helena Island"),
//    SIR	("SIRGAS South America	South America"),
//    SOA	("SOUTH ASIA	Singapore"),
//    SRL	("SIERRA LEONE 1960	Sierra Leone"),
//    TAN	("TANANARIVE OBSERVATORY 1925	Madagascar"),
//    TDC	("TRISTAN ASTRO 1968	Tristan da Cunha"),
//    TIL	("TIMBALAI 1948	Brunei, East Malaysia (Sarwak, Sabah)"),
//    TOY	("TOKYO	Mean (Japan, Okinawa, South Korea)"),
//    TRN	("ASTRO TERN ISLAND (FRIG) 1961	Tern Island"),
//    U	("WGS 1984	Unknown"),
//    VOI	("VOIROL 1874	Algeria"),
//    VOR	("VOIROL 1960	Algeria"),
//    WAK	("WAKE ISLAND ASTRO 1952	Wake Atoll"),
//    WGC	("WGS 1972	Global Definition"),
//    WGE	("WGS 1984	Global Definition"),
//    WGX	("WGS 1984	GPS"),
//    YAC	("YACARE	Uruguay"),
//    ZAN	("ZANDERIJ	Suriname");
//
//    private final String displayName;
//
//    LocalDatum(String displayName) {
//        this.displayName = displayName;
//    }
//
//    public String getDisplayName() {
//        return displayName;
//    }
//}
