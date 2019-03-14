package Task1;

public abstract class Electric_appliance {
    private String model;
    private double capacity;
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
