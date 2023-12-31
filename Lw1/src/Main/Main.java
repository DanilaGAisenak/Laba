package Main;

import Package1.*;
import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
       Order order = new Order();
       CashMachine cash = new CashMachine();
       int choice = 0;
       Scanner console = new Scanner(System.in);
       FileWriter writer = new FileWriter("Bill.txt", false);

       Parts part1 = new Parts();
       part1.setpName("������������");
       part1.setpType("��������� ������������");
       part1.setpPrice(150);
       part1.setManufacturer("Bilstein");
       part1.setNds();

       Parts part2 = new Parts();
       part2.setpName("��������� ������");
       part2.setpType("�������");
       part2.setpPrice(25);
       part2.setManufacturer("Mann");
       part2.setNds();

       Parts part3 = new Parts();
       part3.setpName("�������");
       part3.setpType("�������");
       part3.setpPrice(170);
       part3.setManufacturer("Mann");
       part3.setNds();

       Parts part4 = new Parts();
       part4.setpName("�������� ������");
       part4.setpType("�������");
       part4.setpPrice(20);
       part4.setManufacturer("Mann");
       part4.setNds();

       Tires tires1 = new Tires();
       tires1.setpName("Breeze");
       tires1.setpType("������ ������");
       tires1.setpPrice(205);
       tires1.setManufacturer("Kama");
       tires1.setSpeedIndex("S");

       Tires tires2 = new Tires();
       tires2.setpName("Pilot Sport 4S");
       tires2.setpType("������ ������");
       tires2.setpPrice(405);
       tires2.setManufacturer("Michelin");
       tires2.setSpeedIndex("X");

       while(choice!=4){
          System.out.println("1. ������ ��������\n2. ������ ����\n3. ������� ���\n4. �����\n>> ");
          choice = console.nextInt();
          switch (choice){
             case 1: {
                int chParts = 0;
                while(chParts!=5) {
                   System.out.println("1) "+part1.toString());
                   System.out.println("2) "+part2.toString());
                   System.out.println("3) "+part3.toString());
                   System.out.println("4) "+part4.toString());
                   chParts = console.nextInt();
                   switch (chParts) {
                      case 1: {
                         order.add(part1);
                         System.out.println("���������");
                      }
                      break;
                      case 2: {
                         order.add(part2);
                         System.out.println("���������");
                      }
                      break;
                      case 3: {
                         order.add(part3);
                         System.out.println("���������");
                      }
                      break;
                      case 4: {
                         order.add(part4);
                         System.out.println("���������");
                      }
                      break;
                   }
                }
             } break;
             case 2: {
                int chTires = 0;
                while(chTires!=3){
                   System.out.println("1) "+tires1.toString());
                   System.out.println("2) "+tires2.toString());
                   chTires = console.nextInt();
                   switch (chTires){
                      case 1: {
                         order.add(tires1);
                         System.out.println("���������");
                      }break;
                      case 2: {
                         order.add(tires2);
                         System.out.println("���������");
                      }

                   }
                }
             }
             case 3: {
                cash.add(order);
                cash.CountSum();
                System.out.println(cash.getPrice());
                cash.Print();
                String str = cash.print();
                writer.write(str);
                writer.flush();
             }
          }
       }
    }
}
