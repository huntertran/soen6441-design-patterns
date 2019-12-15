public abstract class ShelterBuilder {
    protected Shelter shelterProduct;

    public Shelter getShelter() {
        return shelterProduct;
    }

    public void createNewShelter() {
        shelterProduct = new Shelter();
    }

    abstract void buildRoof();

    abstract void buildStructure();

    abstract void buildFloor();
}