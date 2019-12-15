public class Expedition {
    public static void main(String[] args) {
        Explorer robinson;
        Shelter hut;
        Shelter igloo;

        ShelterBuilder tropicalBuilder = new TropicalShelterBuilder();
        ShelterBuilder polarBuilder = new PolarShelterBuilder();

        robinson = new Explorer();

        robinson.setBuilder(tropicalBuilder);
        robinson.constructShelter();
        hut = robinson.getShelter();
        System.out.println(hut);

        robinson.setBuilder(polarBuilder);
        robinson.constructShelter();
        igloo = robinson.getShelter();
        System.out.println(igloo);
    }
}