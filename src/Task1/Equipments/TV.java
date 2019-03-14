package Task1.Equipments;

import Task1.Electric_appliance;

public class TV extends Electric_appliance {
    private int numberChannels;
    private int resolutionX;
    private int resolutionY;
    private int fps;

    public void setNumberChannels(int numberChannels)
    {
        this.numberChannels = numberChannels;
    }
    public int getNumberChannels()
    {
        return numberChannels;
    }
    public void setResolutionX(int resolutionX)
    {
        this.resolutionX=resolutionX;
    }
    public int getResolutionX()
    {
        return resolutionX;
    }
    public void setFps(int fps)
    {
        this.fps = fps;
    }
    public int getFps()
    {
        return fps;
    }
    public int getResolutionY()
    {
        return resolutionY;
    }
    public void setResolutionY(int resolutionY)
    {
        this.resolutionY = resolutionY;
    }

    public TV(String model, double capacity, int numberChannels, int resolutionX, int resolutionY, int fps) {
        super(model, capacity);
        this.numberChannels = numberChannels;
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
        this.fps = fps;
    }

    public TV(String model, double capacity) {
        super(model, capacity);
        this.fps=0;
        this.numberChannels=0;
        this.resolutionX = 0;
        this.resolutionY=0;
    }

    public TV() {
        super("Unknown TV" , 0.0);
        this.fps=0;
        this.numberChannels=0;
        this.resolutionX = 0;
        this.resolutionY=0;
    }
    public TV(String[] args)
    {
        super(args[0], Double.parseDouble(args[1]));
        this.fps=0;
        this.numberChannels=0;
        this.resolutionX = 0;
        this.resolutionY=0;
    }
}
