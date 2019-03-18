package Task1.Equipments;

import Task1.Electric_appliance;

import java.text.DecimalFormat;

public class PC extends Electric_appliance {
    private String nameOfCpu;
    private float frequencyOfCpu;
    private String nameOfGpu;
    private float frequencyOfGpu;
    private float volumeHdd;
    public void setNameOfCpu(String nameOfCpu)
    {
        this.nameOfCpu=nameOfCpu;
    }
    public String getNameOfCpu()
    {
        return nameOfCpu;
    }
    public void setFrequencyOfCpu(float frequencyOfCpu)
    {
        this.frequencyOfCpu = frequencyOfCpu;
    }
    public float getFrequencyOfCpu()
    {
        return frequencyOfCpu;
    }
    public void setNameOfGpu(String nameOfGpu)
    {
        this.nameOfGpu=nameOfGpu;
    }
    public String getNameOfGpu()
    {
        return nameOfGpu;
    }
    public void setFrequencyOfGpu(float frequencyOfGpu)
    {
        this.frequencyOfGpu=frequencyOfGpu;
    }
    public float getFrequencyOfGpu()
    {
        return frequencyOfGpu;
    }
    public void setVolumeHdd(float volumeHdd)
    {
        this.volumeHdd=volumeHdd;
    }
    public float getVolumeHdd()
    {
        return volumeHdd;
    }

    public PC(String model, double capacity, String nameOfCpu, float frequencyOfCpu, String nameOfGpu, float frequencyOfGpu, float volumeHdd) {
        super(model, capacity);
        this.nameOfCpu = nameOfCpu;
        this.frequencyOfCpu = frequencyOfCpu;
        this.nameOfGpu = nameOfGpu;
        this.frequencyOfGpu = frequencyOfGpu;
        this.volumeHdd = volumeHdd;
    }

    public PC()
    {
        super("Unknown PC", 0.0);
        this.nameOfCpu = "Unknown";
        this.nameOfGpu = "Unknown";
        this.frequencyOfCpu = 0.0f;
        this.frequencyOfGpu = 0.0f;
        this.volumeHdd = 0.0f;
    }
    public PC(String model, double capacity)
    {
        super(model,capacity);
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.##");
        return "PC{" +
                "nameOfCpu='" + nameOfCpu + '\'' +
                ", frequencyOfCpu=" + frequencyOfCpu +
                ", nameOfGpu='" + nameOfGpu + '\'' +
                ", frequencyOfGpu=" + frequencyOfGpu +
                ", volumeHdd=" + volumeHdd +
                '}';
    }
}
