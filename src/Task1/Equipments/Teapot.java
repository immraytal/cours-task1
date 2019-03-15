package Task1.Equipments;

import Task1.Electric_appliance;

public class Teapot extends Electric_appliance {
    private float volume;
    private String material;

    public void setVolume(float volume)
    {
        this.volume=volume;
    }
    public float getVolume()
    {
        return volume;
    }
    public void setMaterial(String material)
    {
        this.material=material;
    }
    public String getMaterial()
    {
        return material;
    }

    public Teapot()
    {
        super("Unknown teapot", 0.0);
        this.volume = 0.0f;
        this.material = "Unknown";
    }

    public Teapot(String model, double capacity, float volume, String material) {
        super(model, capacity);
        this.volume = volume;
        this.material = material;
    }

    public Teapot(String model, double capacity)
    {
        super(model, capacity);
    }
}
