package javafxapplication2.config;

import javafx.geometry.Insets;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafxapplication2.model.CarMake;

import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public final class CarMakes {

        /*
    public static final CarMake _CAR_MAKE = CarMake.of(
            "",
            "car-pics/.png",
            "car-pics/logo-.png",
            ""
    );

     */


    public static final CarMake ACURA_CAR_MAKE = CarMake.of(
            "Acura",
            "car-pics/Acura.png",
            "car-pics/logo-acura.png",
            "The luxury division of Honda, Acura offers a five-car lineup of sedans and crossovers. Their combination of Honda reliability with high-quality materials and  cabins loaded with standard  features."
    );

    public static final CarMake ALFA_ROMEO_CAR_MAKE = CarMake.of(
            "Alfa Romeo",
            "car-pics/Alfa-Romeo.png",
            "car-pics/logo-alfa-romeo.png",
            "Alfa Romeo is an Italian luxury  automaker that has returned  to the North American  market with style. Alfa Romeo  models make a bold statement  and are easily identified on  the road! "
   );

    public static final CarMake AUDI_CAR_MAKE = CarMake.of(
            "Audi",
            "car-pics/Audi.png",
            "car-pics/logo-audi.png",
            "Known for its four-ring logo and sharp, minimalistic designs,  the German luxury automaker  offers a full lineup of cars and  SUVs of all sizes, from the  ultra-luxurious S8 sedan to  the bite-sized Q3 crossover."
    );

    public static final CarMake BMW_CAR_MAKE = CarMake.of(
            "BMW",
            "car-pics/BMW.png",
            "car-pics/logo-bmw.png",
            "BMW has one of the largest  fleets of vehicles in a wide range of sizes and body types, from  convertibles to SUVs. It focuses  on performance and is fittingly  home to the legendary M  performance division."
    );

    public static final CarMake BUICK_CAR_MAKE = CarMake.of(
            "Buick",
            "car-pics/Buick.png",
            "car-pics/logo-buick.png",
            "Part of General Motors, Buicks  can easily be identified by their  signature portholes which can be found on all of their models, including the tiny Encore, one  of the most unique SUVs on  the road today."
    );

    public static final CarMake CADILLAC_CAR_MAKE = CarMake.of(
            "Cadillac",
            "car-pics/Cadillac.png",
            "car-pics/logo-cadillac.png",
            "The luxury division of GM was  traditionally known for making  comfortable cruisers, but Cadillac  has changed gears with a new  focus on performance and  design with the introduction  of cars like the CTS and ATS."
    );


    public static final CarMake CHEVROLET_CAR_MAKE = CarMake.of(
            "Chevrolet",
            "car-pics/Chevrolet.png",
            "car-pics/logo-chevrolet.png",
            "The largest of GM's four divisions offers a diverse lineup from tiny sedans to giant heavy duty pickup trucks. Chevy is also home to two American muscle car legends: the Camaro and Corvette."
    );

    public static final CarMake CHRYSLER_CAR_MAKE = CarMake.of(
            "Chrysler",
            "car-pics/Chrysler.png",
            "car-pics/logo-chrysler.png",
            "With a tidy, four-vehicle lineup that includes three sedans and a minivan, Chrysler offers near luxury levels of comfort and brash styling — especially on the 300 sedan, its most recognizable model."
    );

    public static final CarMake DODGE_CAR_MAKE = CarMake.of(
            "Dodge",
            "car-pics/Dodge.png",
            "car-pics/logo-dodge.png",
            "Dodge remains the home for American muscle and retro styling, with cars like the Charger and Challenger which combine the latest in technology and comfort with rear-wheel drive for tire shredding fun."
    );



    public static final CarMake FIAT_CAR_MAKE = CarMake.of(
            "FIAT",
            "car-pics/fiat.png",
            "car-pics/logo-fiat.png",
            "Gone from U.S. shores for more than two decades, the Italian automaker returned to America with the tiny 500 microcar in 2010. It now offers several varieties of the 500, including an emissions-free electric version."
    );



    public static final CarMake FORD_CAR_MAKE = CarMake.of(
            "Ford",
            "car-pics/ford.png",
            "car-pics/logo-ford.png",
            "The \"Blue Oval\" made the first mass produced car, the Model T, and is now one of the largest carmakers in the world. Its F-series pickup trucks have been the best-selling vehicles in America for over 30 years."
    );


    public static final CarMake GENESIS_CAR_MAKE = CarMake.of(
            "Genesis",
            "car-pics/genesis.png",
            "car-pics/logo-genesis.png",
            "Genesis is the luxury division of the Hyundai Motor Company. Earning a great reputation on value and warranty for all its vehicles, the Korean automaker is now targeting the luxury car companies on style and classiness."
    );


    public static final CarMake GMC_CAR_MAKE = CarMake.of(
            "GMC",
            "car-pics/GMC.png",
            "car-pics/logo-gmc.png",
            "GMC is the heavy-duty branch of GM, with a lineup full of SUVs, trucks, and work vans. GMC vehicles also offer better materials and features than their Chevrolet counterparts, with upscale cabins and bolder styling."
    );


    public static final CarMake HONDA_CAR_MAKE = CarMake.of(
            "Honda",
            "car-pics/honda.png",
            "car-pics/logo-honda.png",
            "Renowned for the reliability and value of its vehicles, Honda also keeps a close eye on safety — all of the vehicles in the Japanese automaker's lineup now come with a standard rearview camera."
    );


    public static final CarMake HYUNDAI_CAR_MAKE = CarMake.of(
            "Hyundai",
            "car-pics/hyundai.png",
            "car-pics/logo-hyundai.png",
            "Hyundai offers one of the best warranties in the business (10 year/100,000 mile powertrain warranty) and has extensively overhauled many of its vehicles recently, giving them modern styling and even more standard equipment."
    );


    public static final CarMake INFINITI_CAR_MAKE = CarMake.of(
            "INFINITI",
            "car-pics/infiniti.png",
            "car-pics/logo-infiniti.png",
            "Nissan's luxury division focuses on performance and driver enjoyment. INFINITI renamed all of its vehicles recently to make them simpler to understand: passenger cars get a Q, while SUVs feature a QX."
    );


    public static final CarMake JAGUAR_CAR_MAKE = CarMake.of(
            "Jaguar",
            "car-pics/jaguar.png",
            "car-pics/logo-jaguar.png",
            "British luxury meets high-performance in Jaguar's four-car lineup, ranging from the high-performance F-TYPE coupe and roadster to the ultra-sleek XJ flagship sedan, which has an interior fit for a queen."
    );


    public static final CarMake JEEP_CAR_MAKE = CarMake.of(
            "Jeep",
            "car-pics/jeep.png",
            "car-pics/logo-jeep.png",
            "Synonymous with off-road capability, Jeeps are known for their ability to drive over (or through) anything to get you where you need to go, especially the iconic Wrangler and Wrangler Unlimited."
    );


    public static final CarMake KIA_CAR_MAKE = CarMake.of(
            "Kia",
            "car-pics/kia.png",
            "car-pics/logo-kia.png",
            "Kia's lineup features some of the best values in all of automotive, with affordable vehicles that don't skimp on the standard features or modern styling, and one of the best warranties around."
    );


    public static final CarMake LAND_ROVER_CAR_MAKE = CarMake.of(
            "Land Rover",
            "car-pics/land-rover.png",
            "car-pics/logo-land-rover.png",
            "Land Rover features a lineup of SUVs designed to get you anywhere in elegant comfort and style, with richly-appointed cabins full of leather and technology riding on very capable four-wheel-drive platforms."
    );



    public static final CarMake LEXUS_CAR_MAKE = CarMake.of(
            "Lexus",
            "car-pics/lexus.png",
            "car-pics/logo-lexus.png",
            "Toyota's luxury division is renowned for the reliability and quiet comfort of its cars. Lexus has also embraced hybrid technology in its lineup with vehicles like the CT 200h hatchback and RX 450h SUV."
    );


    public static final CarMake LINCOLN_CAR_MAKE = CarMake.of(
            "Lincoln",
            "car-pics/lincoln.png",
            "car-pics/logo-lincoln.png",
            "Ford's upscale marque offers a diverse lineup of passenger cars and SUVs that seek to provide luxury features at non-luxury prices. Lincoln vehicles can be easily identified by their large, split-wing front grilles."
    );


    public static final CarMake MASERATI_CAR_MAKE = CarMake.of(
            "Maserati",
            "car-pics/maserati.png",
            "car-pics/logo-maserati.png",
            "Maserati is an Italian luxury car maker with a long history in competitive motorsports. In recent years, Maserati has increased their production and presence in the U.S. They offer a small lineup of highly coveted sports cars as well as a new SUV – the Levante!"
    );


    public static final CarMake MAZDA_CAR_MAKE = CarMake.of(
            "Mazda",
            "car-pics/mazda.png",
            "car-pics/logo-mazda.png",
            "The Japanese automaker places a heavy emphasis on the fun side of driving, making some of the most driver-friendly cars on the road today, including the iconic Miata roadster and the CX-5 compact crossover."
    );


    public static final CarMake MERCEDES_BENZ_CAR_MAKE = CarMake.of(
            "Mercedes-Benz",
            "car-pics/mercedes-benz.png",
            "car-pics/logo-mercedes-benz.png",
            "German luxury epitomized, Mercedes-Benz doesn't just make comfortable cars — it also produces some of the safest vehicles on the road today and offers the latest advancements in safety technology and driver aids."
    );


    public static final CarMake MINI_CAR_MAKE = CarMake.of(
            "MINI",
            "car-pics/mini.png",
            "car-pics/logo-mini.png",
            "Quintessentially British, MINIs come with a unique style and feel all their own. Since its return to American shores, MINI's lineup has expanded to include a crossover and the cargo-friendly Clubman as well."
    );


    public static final CarMake MITSUBISHI_CAR_MAKE = CarMake.of(
            "Mitsubishi",
            "car-pics/mitsubishi.png",
            "car-pics/logo-mitsubishi.png",
            "The smallest of the Japanese automakers still on American shores, Mitsubishi's lineup has shrunk over the past few years but still includes one of the most affordable new cars anywhere — the Mirage, which starts at under $13,000."
    );


    public static final CarMake NISSAN_CAR_MAKE = CarMake.of(
            "Nissan",
            "car-pics/nissan.png",
            "car-pics/logo-nissan.png",
            "Nissan is the Japanese company that takes the most risks with its styling. It offers a full range of vehicles, from the affordable Versa sedan and hatchback to the versatile Pathfinder three-row crossover."
    );


    public static final CarMake PORSCHE_CAR_MAKE = CarMake.of(
            "Porsche",
            "car-pics/porsche.png",
            "car-pics/logo-porsche.png",
            "Porsche is most known for its sports cars, which are exceptional, but the German automaker from Stuttgart also offers a high-performance sedan and two SUVs to keep up with the times."
    );



    public static final CarMake RAM_CAR_MAKE = CarMake.of(
            "RAM",
            "car-pics/RAM.png",
            "car-pics/logo-ram.png",
            "Specializing in work vehicles, RAM broke off from Dodge and is the home to Chrysler's lineup of work vans and pickup trucks. They come in a variety of sizes and capabilities, enough to handle any job thrown at them."
    );



    public static final CarMake SMART_CAR_MAKE = CarMake.of(
            "smart",
            "car-pics/smart.png",
            "car-pics/logo-smart.png",
            "smart only makes one car, the diminutive fortwo, which is designed to thrive in urban environments. There is no parking space too small or alleyway too narrow for the fortwo."
    );


    public static final CarMake SUBARU_CAR_MAKE = CarMake.of(
            "Subaru",
            "car-pics/subaru.png",
            "car-pics/logo-subaru.png",
            "Known for safety and reliability, Subaru is the only automaker to offer standard all-wheel drive on each vehicle it sells. Impressively, every car in its lineup is an IIHS Top Safety Pick award winner."
    );


    public static final CarMake TOYOTA_CAR_MAKE = CarMake.of(
            "Toyota",
            "car-pics/toyota.png",
            "car-pics/logo-toyota.png",
            "Now one of the largest carmakers on the planet, Toyota helped to put hybrid cars into the mainstream and continues to lead the way for alternative fuels like hydrogen. And remember — reliability is spelled T-o-y-o-t-a."
    );


    public static final CarMake VOLKSWAGEN_CAR_MAKE = CarMake.of(
            "Volkswagen",
            "car-pics/volkswagen.png",
            "car-pics/logo-volkswagen.png",
            "The only non-luxury German automaker currently in the United States, Volkswagen offers German engineering at affordable prices. It also produces the fun-to-drive Golf and GTI, two of the best small cars on the market."
    );


    public static final CarMake VOLVO_CAR_MAKE = CarMake.of(
            "Volvo",
            "car-pics/volvo.png",
            "car-pics/logo-volvo.png",
            "Volvo's ambitious goal is to have zero fatalities in their vehicles by 2020, a fitting vision for a company that puts safety first. Its cars also feature premium cabin materials and understated Swedish styling."
    );



    public static CarMake[] getAllCarMakes(){
        return Arrays.stream(CarMakes.class.getDeclaredFields())
                .filter(f -> Modifier.isStatic(f.getModifiers()))
                .filter(f -> f.getGenericType() == CarMake.class)
                .peek(f -> f.setAccessible(true))
                .map(f -> {
                    try {
                        return f.get(null);
                    } catch (IllegalAccessException e) {
                        return null;
                    }
                })
                .filter(v -> v instanceof CarMake)
                .map(c -> (CarMake) c)
                .toArray(CarMake[]::new);
    }

    public static Pane[] getAllCarMakeContainers(){
        return Arrays.stream(getAllCarMakes()).map(CarMake::getContainer).toArray(Pane[]::new);
    }



    public static Pane getCarMakeDisplayRoot(){
        List<Pane> containers = Arrays.asList(getAllCarMakeContainers());
        HBox[] rows = split(containers, 3).stream()
                .map(p -> new HBox(10, p.toArray(Pane[]::new)))
                .toArray(HBox[]::new);

        VBox root = new VBox(10, rows);
        root.setPadding(new Insets(10, 10, 10, 10));


        return root;
    }



    private static List<List<Pane>> split(List<Pane> list, int l){
        List<List<Pane>> split = new ArrayList<>();

        final int n = list.size();
        for(int i = 0; i < n; i += l){
            split.add(new ArrayList<>(list.subList(i, Math.min(n, i + l))));
        }

        return split;
    }


}
