package Task1.Equipments;

import Task1.Electric_appliance;

public class Fridge extends Electric_appliance {
    private float refrigeratorVolume;
    private float freezerVolume;
    private float height;
    private float width;
    private float length;

    public double getFreezerVolume() {
        return freezerVolume;
    }

    public double getHeight() {
        return height;
    }

    public double getLength() {
        return length;
    }

    public double getRefrigeratorVolume() {
        return refrigeratorVolume;
    }

    public double getWidth() {
        return width;
    }

    public void setFreezerVolume(float freezerVolume) {
        this.freezerVolume = freezerVolume;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public void setRefrigeratorVolume(float refrigeratorVolume) {
        this.refrigeratorVolume = refrigeratorVolume;
    }

    public void setWidth(float width) {
        this.width = width;
    }
    public Fridge()
    {
        super("Unknown fridge", 0.0);
        this.refrigeratorVolume = 0.0f;
        this.freezerVolume = 0.0f;
        this.height = 0.0f;
        this.width = 0.0f;
        this.length = 0.0f;
    }
    public Fridge(String model, double capacity, float height, float width, float length, float freezerVolume, float refrigeratorVolume)
    {
        super(model, capacity);
        this.length= length;
        this.height = height;
        this.width = width;
        this.freezerVolume = freezerVolume;
        this.refrigeratorVolume = refrigeratorVolume;
    }
    public Fridge (String model, double capacity)
    {
        super(model, capacity);
        this.refrigeratorVolume = 0.0f;
        this.freezerVolume = 0.0f;
        this.height = 0.0f;
        this.width = 0.0f;
        this.length = 0.0f;
    }

    @Override
    public String toString() {
        return "Fridge {" +
                "model= " + getModel() +
                ", capacity= " + (getCapacity()*1000)/1000 +
                " W, refrigeratorVolume=" + refrigeratorVolume +
                ", freezerVolume=" + freezerVolume +
                ", height=" + height +
                ", width=" + width +
                ", length=" + length +
                '}';
    }
}
