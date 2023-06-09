import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Map.Entry;

public class task1{
    public static void main(String[] args) {
        notebook not1=new notebook("HYM-W56",123,"Honor");
        not1.setColor("grey");
        not1.setHDD(512);
        not1.setOS("Windows");
        not1.setRAM(16);
        
        notebook not2=new notebook("IdeaPad 3 ",4576,"Lenovo");
        not2.setColor("black");
        not2.setHDD(256);
        not2.setOS("Windows");
        not2.setRAM(8);

        notebook not3=new notebook("D 14 NbD-WDI9",7589,"HUAWEI");
        not3.setColor("grey");
        not3.setHDD(900);
        not3.setOS("Windows");
        not3.setRAM(8);

        notebook not4=new notebook("M1702QA-AU081",9874,"ASUS");
        not4.setColor("white");
        not4.setHDD(700);
        not4.setOS("Linux");
        not4.setRAM(16);

        notebook not5=new notebook("MAC101",6541,"Apple");
        not5.setColor("silver");
        not5.setHDD(1000);
        not5.setOS("macOS");
        not5.setRAM(8);

        HashSet <notebook> notebooks = new HashSet<>(Arrays.asList(not1,not2,not3,not4,not5));
        HashSet <notebook> res = new HashSet<>();

        System.out.println("Здравствуйте");
        System.out.print("Введите цифру, соответствующую необходимому критерию:\n 1 - ОЗУ \n 2 - Объем ЖД \n 3 - Операционная система \n 4 - цвет \n или 5, чтобы осуществить поиск\n");
        try(Scanner scanner = new Scanner(System.in)){
        Integer n = scanner.nextInt();
        scanner.nextLine();
        HashMap<String, Object> filters = new HashMap<>();
        while(n!=5){
        if(n==1){
            System.out.println("Введите минимальную оперативную память");
            Integer temp = scanner.nextInt();
            scanner.nextLine();
            filters.put("RAM", temp);
        }
        if(n==2){
            System.out.println("Введите минимальный объем ЖД" );
            Integer temp = scanner.nextInt();
            scanner.nextLine();
            filters.put("HDD", temp);
        }
        if(n==3){
            System.out.println("Введите ОС");
            String temp = scanner.nextLine();
            filters.put("OS", temp);
        }
        if(n==4){
            System.out.println("Введите цвет");
            String temp = scanner.nextLine();
            filters.put("color", temp);
        }
        System.out.print("Введите цифру, соответствующую необходимому критерию:\n 1 - ОЗУ \n 2 - Объем ЖД \n 3 - Операционная система \n 4 - цвет \n или 5, чтобы осуществить поиск\n");
        n = scanner.nextInt();
        scanner.nextLine();
    }
        for (Entry<String, Object> entry : filters.entrySet()) {
            if(entry.getKey().equals("RAM")){
                Iterator<notebook> itr = notebooks.iterator();
                while(itr.hasNext()){
                    notebook not = (notebook) itr.next();
                    if(not.getRAM()>=(Integer)entry.getValue()){
                        res.add(not);
                        }
                    }
                    }
        if(entry.getKey().equals("HDD")){
            Iterator<notebook> itr = notebooks.iterator();
            while(itr.hasNext()){
                notebook not = (notebook)itr.next();
                    if(not.getHDD()>=(Integer)entry.getValue()){
                        res.add(not);
                        }
                    }
                    }
        if(entry.getKey().equals("OS")){
            Iterator<notebook> itr = notebooks.iterator();
            while(itr.hasNext()){
                notebook not = (notebook)itr.next();
                    if(not.getOS().equals(entry.getValue())){
                        res.add(not);
                        }
                    }
                    }
        if(entry.getKey().equals("color")){
            Iterator<notebook> itr = notebooks.iterator();
            while(itr.hasNext()){
                notebook not = (notebook)itr.next();
                    if(not.getColor().equals(entry.getValue())){
                        res.add(not);
                        }
                    }
                    }
        }
                
        Iterator<notebook> itr = res.iterator();
        while(itr.hasNext()){
            notebook not = (notebook)itr.next();
            System.out.println(not.toString());
            System.out.println();
        }
                
                
    }}
}
        
        
        
        