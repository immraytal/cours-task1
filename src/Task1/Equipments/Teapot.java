package Task1.Equipments;

import Task1.Electric_appliance;

public class Teapot extends Electric_appliance {
    private float volume;
    private boolean isElectric;
    private String material;

    public void setVolume(float volume)
    {
        this.volume=volume;
    }
    public float getVolume()
    {
        return volume;
    }
    public void setIsElectric(boolean isElectric)
    {
        this.isElectric=isElectric;
    }
    public boolean getIsElectric()
    {
        return isElectric;
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
        this.isElectric = false;
        this.material = "Unknown";
    }

    public Teapot(String model, double capacity, float volume, boolean isElectric, String material) {
        super(model, capacity);
        this.volume = volume;
        this.isElectric = isElectric;
        this.material = material;
    }

    public Teapot(String model, double capacity)
    {
        super(model, capacity);
    }
}
