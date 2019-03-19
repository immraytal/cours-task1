package com.java.task1.main;

import com.java.task1.Electric_appliance;
import com.java.task1.equipments.Fridge;
import com.java.task1.equipments.Pc;
import com.java.task1.equipments.Tv;
import com.java.task1.equipments.Teapot;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.UUID;

public class Menu {

    private ArrayList<Electric_appliance> fridges = randomSet("Fridge");
    private ArrayList<Electric_appliance> psc = randomSet("Pc");
    private ArrayList<Electric_appliance> teapots = randomSet("Teapot");
    private ArrayList<Electric_appliance> tvs = randomSet("Tv");

    public int menu()
    {
        int check;
        double board1;
        double board2;
        String checkString;
        Scanner in = new Scanner(System.in);

        while(true)
        {
            System.out.println("Menu:\n" +
                    "1. Add new appliance\n" +
                    "2. Remove appliance\n" +
                    "3. Show all appliance\n" +
                    "4. Sort by capacity\n" +
                    "5. Search by diapozon\n" +
                    "6. On/Off some appliance\n" +
                    "0. Exit\n");
            check = Integer.parseInt(in.next());

            switch (check)
            {
                case 1: //Add new appliance
                    //Which app
                    System.out.println("New check - enter appliance");
                    in.nextLine();
                    checkString = in.nextLine();
                    switch (checkString)
                    {
                        case "Tv":
                            System.out.println("Enter parameters");
                            in.nextLine();
                            String model = in.nextLine();
                            double capacity = Double.parseDouble(in.nextLine());
                            int fps =  Integer.parseInt(in.nextLine());
                            int resX =  Integer.parseInt(in.nextLine());
                            int resY = Integer.parseInt(in.nextLine());
                            int channels =  Integer.parseInt(in.nextLine());
                            tvs.add(new Tv(model, capacity, channels, resX, resY, fps));
                            break;
                        case "Pc":
                            break;
                        case "Teapot":
                            break;
                        case "Fridge":
                            System.out.println("Enter parameters");
                            in.nextLine();
                            String modelf = in.nextLine();
                            double capacityf = Double.parseDouble(in.nextLine());

                            break;
                            default:
                    }
                    break;
                case 2://Remove appliance
                    System.out.println("New check - enter appliance");
                    String newCheck1 = in.nextLine();
                    System.out.println("Which one remove");
                    int whichOne = Integer.parseInt(in.nextLine());
                    switch (newCheck1)
                    {
                        case "Tv":
                            tvs.remove(whichOne);
                            break;
                        case "Pc":
                            psc.remove(whichOne);
                            break;
                        case "Teapot":
                            teapots.remove(whichOne);
                            break;
                        case "Fridge":
                            fridges.remove(whichOne);
                            break;
                        default:
                            System.out.println("Enter one of {Tv, Pc, Teapot, Fridge}");
                    }
                    break;
                case 3://Show appliance
                    System.out.println("\nFridges:\n");
                    for(Electric_appliance  a: fridges)
                    {
                        System.out.println(a.toString());
                    }
                    System.out.println("\nPCs:\n");
                    for (Electric_appliance b : psc)
                    {
                        System.out.println(b.toString());
                    }
                    System.out.println("\nTeapots:\n");
                    for (Electric_appliance c : teapots)
                    {
                        System.out.println(c.toString());
                    }
                    System.out.println("\nTVs:\n");
                    for (Electric_appliance d : tvs)
                    {
                        System.out.println(d.toString());
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
                        case "Tv":
                            int which1 = Integer.parseInt(in.nextLine());
                            tvs.get(which1).setOn(true);

                            break;
                        case "Pc":
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
                        System.out.println("Enter number [0..6]");
            }
            System.out.println("Press any key to continue..");
            in.nextLine();
            in.nextLine();
            System.out.flush();

        }


    }

    private static ArrayList<Electric_appliance> randomSet(String choose)
    {
        Random random = new Random();
        ArrayList<Electric_appliance> someList = new ArrayList<>();
        int size=0;
        while(size<1) {
            size = random.nextInt(5);
        }
        switch (choose) {
            case "Fridge":
                for (int i = 0; i < size; i++) {
                    someList.add(i, new Fridge(UUID.randomUUID().toString().substring(0, 5), (100 + random.nextInt(900)) * 1.0 + random.nextDouble()));
                }
                break;
            case "Pc":
                for (int i = 0; i < size; i++) {
                    someList.add(i, new Pc(UUID.randomUUID().toString().substring(0, 5), (100 + random.nextInt(900)) * 1.0 + random.nextDouble()));
                }
                break;
            case "Tv":
                for (int i = 0; i < size; i++) {
                    someList.add(i, new Tv(UUID.randomUUID().toString().substring(0, 5), (100 + random.nextInt(900)) * 1.0 + random.nextDouble()));
                }
                break;
            case "Teapot":
                for (int i = 0; i < size; i++) {
                    someList.add(i, new Teapot(UUID.randomUUID().toString().substring(0, 5), (100 + random.nextInt(900)) * 1.0 + random.nextDouble()));
                }
                break;
            default:
                System.out.println("Encorrect input");
                break;
        }
        return someList;
    }

    private Electric_appliance whichOne() {
        System.out.println("Choose appliance");
        Scanner in = new Scanner(System.in);
        Electric_appliance someApp;
        while(true) {
            switch (in.nextLine()) {
                case "Tv":
                    System.out.println("Choose ID[0.." + (tvs.size()-1) + "] ");
                    someApp = tvs.get(Integer.parseInt(in.nextLine()));
                    return someApp;
                case "Pc":
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
