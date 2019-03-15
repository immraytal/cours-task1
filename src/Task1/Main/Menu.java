package Task1.Main;
import Task1.Electric_appliance;
import Task1.Equipments.Fridge;
import Task1.Equipments.TV;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.UUID;

public class Menu {

    public static void menu()
    {


        ArrayList<Electric_appliance> fridges = randomSet();
        ArrayList<Electric_appliance> psc = randomSet();
        ArrayList<Electric_appliance> teapots = randomSet();
        ArrayList<Electric_appliance> tvs = randomSet();
        Scanner in = new Scanner(System.in);

        while(true)
        {
            System.out.println("Enter number");
            int check = Integer.parseInt(in.nextLine());
            switch (check)
            {
                case 1: //Add new appliance
                    //Which app
                    System.out.println("New check - enter appliance");
                    String newCheck = in.nextLine();
                    switch (newCheck)
                    {
                        case "TV":
                            System.out.println("Enter parameters");
                            String model = in.nextLine();
                            double capacity = in.nextDouble();
                            int fps =  in.nextInt();
                            int resX =  in.nextInt();
                            int resY = in.nextInt();
                            int channels =  in.nextInt();
                            tvs.add(new TV(model,capacity,channels, resX, resY, fps));
                            break;
                        case "PC":
                            break;
                        case "Teapot":
                            break;
                        case "Fridge":
                            break;
                            default:
                    }
                    break;
                case 2://Remove appliance
                    break;
                case 3://Show appliance
                    System.out.println("Fridges:");
                    for(Electric_appliance  a: fridges)
                    {
                        System.out.println("model: "+a.getModel() + "  capacity: " + a.getCapacity() + " W");
                    }
                    System.out.println("PCs:");
                    for(Electric_appliance  a: psc)
                    {
                        System.out.println("model: "+a.getModel() + "  capacity: " + a.getCapacity() + " W");
                    }
                    System.out.println("Teapots:");
                    for(Electric_appliance  a: teapots)
                    {
                        System.out.println("model: "+a.getModel() + "  capacity: " + a.getCapacity() + " W");
                    }
                    System.out.println("TVs:");
                    for(Electric_appliance  a: tvs)
                    {
                        System.out.println("model: "+a.getModel() + "  capacity: " + a.getCapacity() + " W");
                    }
                    break;
                case 4://Sort by capacity
                    break;
                case 5://Search by diapozon
                    break;
                case 6://on/off appliance
                    break;

                    default:
            }

        }
    }
    private static ArrayList<Electric_appliance> randomSet()
    {
        Random random = new Random();
        ArrayList<Electric_appliance> someList = new ArrayList<>();
        int size=0;
        while(size<1) {
            size = random.nextInt(5);
            System.out.println(size);
        }

        for(int i=0;i<size;i++)
        {
            someList.add(i,new Fridge( UUID.randomUUID().toString().substring(0,5), (100+random.nextInt(900))*1.0+random.nextDouble()));
        }
        return someList;
    }
}
