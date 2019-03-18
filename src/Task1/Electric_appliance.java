package Task1;

import java.text.DecimalFormat;

public abstract class Electric_appliance {
    private String model;
    private double capacity;
    private Boolean isOn=false;

    public Boolean getOn() {
        return isOn;
    }

    public void setOn(Boolean on) {
        isOn = on;
    }

    public double getCapacity()
        {
            return capacity;
        }
        public void setCapacity(double capacity)
        {
            this.capacity = capacity;
        }
        public String getModel()
        {
            return model;
        }
        public void setModel(String model)
        {
            this.model=model;
        }
        public Electric_appliance(String model, double capacity)
        {
            this.model = model;
            this.capacity = capacity;
        }


}
