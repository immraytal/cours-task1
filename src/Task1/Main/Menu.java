package Task1.Main;
import Task1.Electric_appliance;
import Task1.Equipments.Fridge;
import Task1.Equipments.TV;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.UUID;

public class Menu {

  private ArrayList<Electric_appliance> fridges = randomSet();
  private ArrayList<Electric_appliance> psc = randomSet();
  private ArrayList<Electric_appliance> teapots = randomSet();
  private ArrayList<Electric_appliance> tvs = randomSet();

    public int menu()
    {
        int check=0;
        double board1=0.0;
        double board2=10000.0;
        String checkString;
        Scanner in = new Scanner(System.in);

        while(true)
        {
            System.out.println("Enter number");
            check = Integer.parseInt(in.next());

            switch (check)
            {
                case 1: //Add new appliance
                    //Which app
                    System.out.println("New check - enter appliance");
                    checkString = in.nextLine();
                    switch (checkString)
                    {
                        case "TV":
                            System.out.println("Enter parameters");
                            String model = in.nextLine();
                            double capacity = Double.parseDouble(in.nextLine());
                            int fps =  Integer.parseInt(in.nextLine());
                            int resX =  Integer.parseInt(in.nextLine());
                            int resY = Integer.parseInt(in.nextLine());
                            int channels =  Integer.parseInt(in.nextLine());
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
                    System.out.println("New check - enter appliance");
                    String newCheck1 = in.nextLine();
                    switch (newCheck1)
                    {
                        case "TV":
                            int whichOne = Integer.parseInt(in.nextLine());
                            tvs.remove(whichOne);
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
                case 3://Show appliance
                    System.out.println("Fridges:");
                    for(Electric_appliance  a: fridges)
                    {
                        System.out.println("model: "+a.getModel() + "  capacity: " + a.getCapacity() + " W isOn=" + a.getOn());
                    }
                    System.out.println("PCs:");
                    for(Electric_appliance  a: psc)
                    {
                        System.out.println("model: "+a.getModel() + "  capacity: " + a.getCapacity() + " W isOn=" + a.getOn());
                    }
                    System.out.println("Teapots:");
                    for(Electric_appliance  a: teapots)
                    {
                        System.out.println("model: "+a.getModel() + "  capacity: " + a.getCapacity() +  " W isOn=" + a.getOn());
                    }
                    System.out.println("TVs:");
                    for(Electric_appliance  a: tvs)
                    {
                        System.out.println("model: "+a.getModel() + "  capacity: " + a.getCapacity() + " W isOn=" + a.getOn());
                    }
                    break;
                case 4://Sort by capacity
                    System.out.println(whichOne().getModel());
                    break;
                case 5://Search by diapozon
                    System.out.println("Enter diapozon");
                    in.nextLine();
                    board1 = Double.parseDouble(in.nextLine());
                    board2 = Double.parseDouble(in.nextLine());
                    for(Electric_appliance a:searchByDiapozon(board1,board2))
                    {
                        System.out.println("model: "+a.getModel() + "  capacity: " + a.getCapacity() + " W isOn=" + a.getOn());
                    }
                    break;
                case 6://on/off appliance
                    System.out.println("New check - enter appliance");
                    String newCheck2 = in.nextLine();
                    switch (newCheck2)
                    {
                        case "TV":
                            int which1 = Integer.parseInt(in.nextLine());
                            tvs.get(which1).setOn(true);

                            break;
                        case "PC":
                            int which2 = Integer.parseInt(in.nextLine());
                            psc.get(which2).setOn(true);

                            break;
                        case "Teapot":
                            int which3 = Integer.parseInt(in.nextLine());
                            teapots.get(which3).setOn(true);
                            break;
                        case "Fridge":
                            int which4 = Integer.parseInt(in.nextLine());
                            fridges.get(which4).setOn(true);
                            break;
                        default:
                            System.out.println("Default switch");
                    }
                    break;
                case 0://exit
                    return 0;
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

    private Electric_appliance whichOne() {
        System.out.println("Choose appliance");
        Scanner in = new Scanner(System.in);
        Electric_appliance someApp;
        while(true) {
            switch (in.nextLine()) {
                case "TV":
                    System.out.println("Choose ID[0.." + (tvs.size()-1) + "] ");
                    someApp = tvs.get(Integer.parseInt(in.nextLine()));
                    return someApp;
                case "PC":
                    System.out.println("Choose ID[0.." + (psc.size()-1) + "] ");
                    someApp = psc.get(Integer.parseInt(in.nextLine()));
                    return someApp;
                case "Fridge":
                    System.out.println("Choose ID[0.." + (fridges.size()-1) + "] ");
                    someApp = fridges.get(Integer.parseInt(in.nextLine()));
                    return someApp;
                case "Teatpot":
                    System.out.println("Choose ID[0.." + (teapots.size()-1) + "] ");
                    someApp = teapots.get(Integer.parseInt(in.nextLine()));
                    return someApp;
                default:
                    System.out.println("Encorrect input");
                    break;
            }
        }
    }
    private ArrayList<Electric_appliance> searchByDiapozon(double board1, double board2)
    {
        ArrayList<Electric_appliance> someArrayList = new ArrayList<>();
        for(Electric_appliance  a: fridges)
            if (a.getCapacity()>board1 && a.getCapacity()<board2)
                someArrayList.add(a);
        for(Electric_appliance  a: psc)
            if (a.getCapacity() > board1 && a.getCapacity() < board2)
                someArrayList.add(a);
        for(Electric_appliance  a: teapots)
            if (a.getCapacity()>board1 && a.getCapacity()<board2)
                someArrayList.add(a);
        for(Electric_appliance  a: tvs)
            if (a.getCapacity()>board1 && a.getCapacity()<board2)
                someArrayList.add(a);
        return someArrayList;
    }

}
