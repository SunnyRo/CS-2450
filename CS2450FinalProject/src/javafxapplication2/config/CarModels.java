package javafxapplication2.config;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public final class CarModels {
    private static final String MODEL_LIST_NAME_FORMAT = "%s_MODELS";



    public static final ObservableList<String> MAKES = FXCollections.unmodifiableObservableList(
            FXCollections.observableArrayList(
                    "Acura", "Alfa Romeo", "Audi", "BMW", "Buick", "Cadillac",
                    "Chevrolet", "Chrysler", "Dodge", "FIAT", "Ford", "Genesis", "GMC",
                    "Honda", "Hyundai", "INFINITI", "Jaguar", "Jeep", "Kia", "Land Rover",
                    "Lexus", "Lincoln", "Maserati", "Mazda", "Mercedes-Benz", "MINI",
                    "Mitsubishi", "Nissan", "Porsche", "RAM", "smart", "Toyota", "Volkswagen", "Volvo"
            ).sorted(String.CASE_INSENSITIVE_ORDER)
    );


    public static final ObservableList<String> ACURA_MODELS = FXCollections.unmodifiableObservableList(
            FXCollections.observableArrayList(
                    "ILX", "MDX", "MDX Sport Hybrid", "RDX", "RLX", "TLX"
            ).sorted(String.CASE_INSENSITIVE_ORDER)
    );

    public static final ObservableList<String> ALFA_ROMEO_MODELS = FXCollections.unmodifiableObservableList(
            FXCollections.observableArrayList(
                "Guilia", "Stelvio"
            ).sorted(String.CASE_INSENSITIVE_ORDER)
    );

    public static final ObservableList<String> AUDI_MODELS = FXCollections.unmodifiableObservableList(
            FXCollections.observableArrayList(
                "A3", "A4", "A4 allroad", "A5", "A6", "A7", "A8",
                    "e-tron", "Q3", "Q5", "Q5 e", "Q7", "Q8", "RS 5", "S3",
                    "S4", "S5", "SQ5", "TT"
            ).sorted(String.CASE_INSENSITIVE_ORDER)
    );

    public static final ObservableList<String> BMW_MODELS = FXCollections.unmodifiableObservableList(
            FXCollections.observableArrayList(
                "230", "330", "430 Gran Coupe", "440", "440 Gran Coupe", "530", "530e",
                    "540", "740", "750", "i3", "M2", "M240", "M340",
                    "M4", "M5", "M550", "M850", "X1", "X2", "X3",
                    "X3 M", "X4", "X5", "X6", "X7", "Z4"
            ).sorted(String.CASE_INSENSITIVE_ORDER)
    );

    public static final ObservableList<String> BUICK_MODELS = FXCollections.unmodifiableObservableList(
            FXCollections.observableArrayList(
                "Enclave", "Encore", "Encore GX", "Envision", "LaCrosse", "Regal Sportback", "Regal TourX"
            ).sorted(String.CASE_INSENSITIVE_ORDER)
    );
    public static final ObservableList<String> CADILLAC_MODELS = FXCollections.unmodifiableObservableList(
            FXCollections.observableArrayList(
                "CT4", "CT5", "CT6", "CTS", "Escalade",
                    "Escalade ESV", "XT4", "XT5", "XT6", "XTS"
            ).sorted(String.CASE_INSENSITIVE_ORDER)
    );

    public static final ObservableList<String> CHEVROLET_MODELS = FXCollections.unmodifiableObservableList(
            FXCollections.observableArrayList(
                "Blazer", "Bolt EV", "Camaro", "Colorado", "Corvette", "Cruze",
                    "Cruze", "Equinox", "Express 2500", "Express 3500", "Impala", "Malibu",
                    "Malibu Hybrid", "Silverado 1500", "Silverado 1500 LD", "Silverado 2500HD", "Silverado 3500HD", "Sonic",
                    "Spark", "Suburban", "Tahoe", "TrailBlazer", "Traverse", "Trax", "Volt"
            ).sorted(String.CASE_INSENSITIVE_ORDER)
    );

    public static final ObservableList<String> CHRYSLER_MODELS = FXCollections.unmodifiableObservableList(
            FXCollections.observableArrayList(
                "300", "Pacifica","Pacifica Hybrid", "Yoyager"
            ).sorted(String.CASE_INSENSITIVE_ORDER)
    );

    public static final ObservableList<String> DODGE_MODELS = FXCollections.unmodifiableObservableList(
            FXCollections.observableArrayList(
                "Challenger", "Charger", "Durango", "Grand Caravan", "Journey"
            ).sorted(String.CASE_INSENSITIVE_ORDER)
    );

    public static final ObservableList<String> FIAT_MODELS = FXCollections.unmodifiableObservableList(
            FXCollections.observableArrayList(
                "124 Spider", "500", "500e", "500L", "500X"
            ).sorted(String.CASE_INSENSITIVE_ORDER)
    );

    public static final ObservableList<String> FORD_MODELS = FXCollections.unmodifiableObservableList(
            FXCollections.observableArrayList(
                "EcoSport", "Edge", "Escape", "Escape PHEV", "Expedition", "Expedition Max",
                    "Explorer", "F-150", "F-250", "F-350", "F-450", "Fiesta",
                    "Flex", "Fusion", "Fusion Energi", "Fusion Hybrid", "Mustang", "Ranger",
                    "Shelby GT350", "Taurus", "Transit Connect", "Transit-150", "Transit-250", "Transit-350"
            ).sorted(String.CASE_INSENSITIVE_ORDER)
    );

    public static final ObservableList<String> GENESIS_MODELS = FXCollections.unmodifiableObservableList(
            FXCollections.observableArrayList(
                "G70", "G80", "G90"
            ).sorted(String.CASE_INSENSITIVE_ORDER)
    );

    public static final ObservableList<String> GMC_MODELS = FXCollections.unmodifiableObservableList(
            FXCollections.observableArrayList(
                "Acadia", "Canyon", "Savana 2500", "Sierra 1500", "Sierra 1500 Limited",
                    "Sierra 2500HD", "Sierra 3500HD", "Terrain", "Yukon", "Yukon XL"
            ).sorted(String.CASE_INSENSITIVE_ORDER)
    );

    public static final ObservableList<String> HONDA_MODELS = FXCollections.unmodifiableObservableList(
            FXCollections.observableArrayList(
                "Accord", "Accord Hybrid", "Civic", "Civic Si",
                    "Civic Type R", "Clarity Plug-In Hybrid", "CR-V", "Fit", "HR-V",
                    "Insight", "Odyssey", "Passport", "Pilot", "Ridgeline"
            ).sorted(String.CASE_INSENSITIVE_ORDER)
    );

    public static final ObservableList<String> HYUNDAI_MODELS = FXCollections.unmodifiableObservableList(
            FXCollections.observableArrayList(
                "Accent", "Elantra", "Elantra GT", "Ioniq EV", "Ioniq Plug-In Hybrid",
                    "Kona", "Kona EV", "Palisade", "Santa Fe",
                    "Santa Fe XL", "Sonata", "Sonata Hybrid", "Sonata Plug-In Hybrid",
                    "Tucson", "Veloster", "Venue"
            ).sorted(String.CASE_INSENSITIVE_ORDER)
    );

    public static final ObservableList<String> INFINITI_MODELS = FXCollections.unmodifiableObservableList(
            FXCollections.observableArrayList(
                "Q50", "Q60", "QX50", "QX60", "QX80"
            ).sorted(String.CASE_INSENSITIVE_ORDER)
    );

    public static final ObservableList<String> JAGUAR_MODELS = FXCollections.unmodifiableObservableList(
            FXCollections.observableArrayList(
                "E-PACE", "F-PACE", "F-TYPE", "I-PACE", "XE", "XF", "XJ"
            ).sorted(String.CASE_INSENSITIVE_ORDER)
    );

    public static final ObservableList<String> JEEP_MODELS = FXCollections.unmodifiableObservableList(
            FXCollections.observableArrayList(
                "Cherokee", "Compass", "Gladiator", "Grand Cherokee", "Renegade", "Wrangler", "Wrangler Unlimited"
            ).sorted(String.CASE_INSENSITIVE_ORDER)
    );

    public static final ObservableList<String> KIA_MODELS = FXCollections.unmodifiableObservableList(
            FXCollections.observableArrayList(
                "Canzda", "Forte", "K900", "Niro", "Niro EV",
                    "Niro Plug-In Hybrid", "Optima", "Rio", "Sedona", "Seltos",
                    "Sorento", "Soul", "Sportage", "Stinger", "Telluride"
            ).sorted(String.CASE_INSENSITIVE_ORDER)
    );

    public static final ObservableList<String> LAND_ROVER_MODELS = FXCollections.unmodifiableObservableList(
            FXCollections.observableArrayList(
                "Discover", "Discovery Sport", "Range Rover",
                    "Range Rover Envoque", "Range Rover Sport", "Range Rover Velar"
            ).sorted(String.CASE_INSENSITIVE_ORDER)
    );

    public static final ObservableList<String> LEXUS_MODELS = FXCollections.unmodifiableObservableList(
            FXCollections.observableArrayList(
                "ES 300h", "ES 350", "GS 350", "GX 460", "IS 300", "LS 500",
                    "LX 570", "NX 300", "NX 300h", "RC 300", "RC 350", "RX 350",
                    "RX 350L", "RX 450h", "RX 450hL", "UX 200", "UX 250h"
            ).sorted(String.CASE_INSENSITIVE_ORDER)
    );

    public static final ObservableList<String> LINCOLN_MODELS = FXCollections.unmodifiableObservableList(
            FXCollections.observableArrayList(
                "Aviator", "Continental", "Corsair", "MKC", "MKT",
                    "MKZ", "MKZ Hybrid", "Nautilus", "Navigator", "Navigator L"
            ).sorted(String.CASE_INSENSITIVE_ORDER)
    );

    public static final ObservableList<String> MASERATI_MODELS = FXCollections.unmodifiableObservableList(
            FXCollections.observableArrayList(
                "Ghibli", "Levante", "Quattroporte"
            ).sorted(String.CASE_INSENSITIVE_ORDER)
    );

    public static final ObservableList<String> MAZDA_MODELS = FXCollections.unmodifiableObservableList(
            FXCollections.observableArrayList(
                "CX-3", "CX-30", "CX-5", "CX-9",
                    "Mazda3", "Mazda6", "MX-5 Miata", "MX-5 Miata RF"
            ).sorted(String.CASE_INSENSITIVE_ORDER)
    );

    public static final ObservableList<String> MERCEDES_BENZ_MODELS = FXCollections.unmodifiableObservableList(
            FXCollections.observableArrayList(
                "A-Class", "AMG C 43", "AMG C 63", "AMG CLA 45", "AMG E 53",
                    "AMG GLC 43", "AMG GLC 63", "AMG GLE 43", "AMG GLE 63", "C-Class",
                    "CLA 250", "CLS 450", "E-Class", "GLA 250", "GLB 250",
                    "GLC 300", "GLC 350e", "GLE 350", "GLE 400", "GLS 450",
                    "GLS 550", "Metris", "S-Class", "SL 450", "SL 550",
                    "SLC 300", "Sprinter 2500", "Sprinter 3500", "Sprinter 3500XD"
            ).sorted(String.CASE_INSENSITIVE_ORDER)
    );

    public static final ObservableList<String> MINI_MODELS = FXCollections.unmodifiableObservableList(
            FXCollections.observableArrayList(
                "MINI-Clubman", "MINI-Convertible", "MINI-Countryman", "MINI-E Countryman", "MINI-Hardtop"
            ).sorted(String.CASE_INSENSITIVE_ORDER)
    );

    public static final ObservableList<String> MITSUBISHI_MODELS = FXCollections.unmodifiableObservableList(
            FXCollections.observableArrayList(
                "Eclipse Cross", "Mirage", "Mirage G4",
                    "Outlander", "Outlander PHEV", "Outlander Sport"
            ).sorted(String.CASE_INSENSITIVE_ORDER)
    );

    public static final ObservableList<String> NISSAN_MODELS = FXCollections.unmodifiableObservableList(
            FXCollections.observableArrayList(
                "370Z", "Altima", "Armada", "Frontier", "Kicks",
                    "LEAF", "Maxima", "Murango", "NV Cargo NV1500", "NV Cargo NV2500 HD",
                    "NV Cargo NV3500 HD", "NV Passenger NV3500 HD", "NV200", "Pathfinder", "Rouge",
                    "Rouge Sport", "Sentra", "Titan", "Titan XD", "Versa", "Versa Note"
            ).sorted(String.CASE_INSENSITIVE_ORDER)
    );

    public static final ObservableList<String> PORSCHE_MODELS = FXCollections.unmodifiableObservableList(
            FXCollections.observableArrayList(
                "718 Boxster", "718 Cayman", "911", "Cayenne", "Macan", "Panamera"
            ).sorted(String.CASE_INSENSITIVE_ORDER)
    );

    public static final ObservableList<String> RAM_MODELS = FXCollections.unmodifiableObservableList(
            FXCollections.observableArrayList(
                "1500", "1500 Classic", "2500", "3500",
                    "ProMaster 1500", "ProMaster 2500", "ProMaster 3500", "ProMaster city"
            ).sorted(String.CASE_INSENSITIVE_ORDER)
    );

    public static final ObservableList<String> SMART_MODELS = FXCollections.singletonObservableList("EQ fortwo");

    public static final ObservableList<String> TOYOTA_MODELS = FXCollections.unmodifiableObservableList(
            FXCollections.observableArrayList(
                "4Runner", "86", "Avalon", "Avalon Hybrid",
                    "C-HR", "Camry", "Camry Hybrid", "Corolla",
                    "Corolla Hatchback", "Corolla Hybrid", "Highlander", "Highlander Hybrid",
                    "Land Cruiser", "Prius", "Prius c", "Prius Prime",
                    "RAV4", "RAV4 Hybrid", "Sequoia", "Sienna",
                    "Tacoma", "Tundra", "Yaris", "Yaris Sedan"
            ).sorted(String.CASE_INSENSITIVE_ORDER)
    );

    public static final ObservableList<String> VOLKSWAGEN_MODELS = FXCollections.unmodifiableObservableList(
            FXCollections.observableArrayList(
                "Arteon", "Atlas", "Atlas Cross Sport", "Beetle",
                    "e-Golf", "Golf", "Golf Alltrack", "Golf GTI",
                    "Golf R", "Gold SportWagen", "Jetta", "Jetta GLI", "Passat", "Tiguan"
            ).sorted(String.CASE_INSENSITIVE_ORDER)
    );

    public static final ObservableList<String> VOLVO_MODELS = FXCollections.unmodifiableObservableList(
            FXCollections.observableArrayList(
                    "S60", "S90", "V60", "V60 Cross Country", "V90",
                    "V90 Cross Country", "XC40", "XC60", "XC60 Hybrid", "XC90"
            ).sorted(String.CASE_INSENSITIVE_ORDER)
    );

    public static final ObservableList<String> DEFAULT = FXCollections.singletonObservableList("Models to Be Added :(");


    private static final Map<String, ObservableList<String>> MODELS = new LinkedHashMap<>();


    static {
        Map<String, ObservableList<String>> map = Arrays.stream(CarModels.class.getDeclaredFields())
                .filter(f -> Modifier.isStatic(f.getModifiers()))
                .peek(f -> f.setAccessible(true))
                .filter(f -> f.getName().endsWith("_MODELS"))
                .collect(
                        Collectors.toMap(
                                Field::getName,
                                CarModels::getFieldValue,
                                (k0, k1) -> k0
                        )
                );

        MAKES.forEach(m -> MODELS.put(m, map.get(format(m))));
    }


    public static Map<String, ObservableList<String>> getModels(){
        return Collections.unmodifiableMap(MODELS);
    }


    public static ObservableList<String> getModels(String make){
        return MODELS.getOrDefault(make, DEFAULT);
    }

    public static ObservableList<String> getMakes(){
        return FXCollections.observableArrayList(MODELS.keySet());
    }

    private static String format(String s){
        return String.format(
                MODEL_LIST_NAME_FORMAT,
                s.replace(" ", "_").replace("-", "_").toUpperCase()
        );
    }

    @SuppressWarnings("unchecked")
    private static ObservableList<String> getFieldValue(Field field){
        try {
            return (ObservableList<String>) field.get(null);
        } catch (IllegalAccessException e) {
            return FXCollections.emptyObservableList();
        }
    }


}
