public class Explorer {
    private ShelterBuilder builder;

    public void setBuilder(ShelterBuilder shelterBuilder) {
        builder = shelterBuilder;
    }

    public void constructShelter() {
        builder.createNewShelter();
        builder.buildFloor();
        builder.buildStructure();
        builder.buildRoof();
    }

    public Shelter getShelter() {
        return builder.getShelter();
    }
}