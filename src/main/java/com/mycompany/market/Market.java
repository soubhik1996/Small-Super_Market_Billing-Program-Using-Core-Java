package com.mycompany.market;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SOUBHIK
 */
import java.util.*;
class Market {
    public static int cal(int count , int pr){
    int c=count*pr;
    return c;
    }
    public static float cal1(float q , int p){
        float q1=q*p;
        return q1;
    }
    public static void main (String args[]){
    
        String ch,item="";
        int chos,chos1,q,sum=0;
        float price=0.00f;
        Scanner x=new Scanner(System.in);
        HashMap<String, Integer> map = new HashMap<>();
        HashMap<String, Float> map1 = new HashMap<>();
        HashMap<String, Float> map3=new HashMap<>();
        System.out.println("\t\t\t\t \"Welcome to Brothers shop\" \t\t\t");
        String line = new String(new char[56]).replace('\0', '-');
        System.out.println("\t\t"+line);
        System.out.println("\t\tReg no :- 913547 \t\t Owner :- Soubhik Biswas \t\t\t");
        do{
            do{
                
                System.out.println("\n1. Fruits & Vegetables \n2. Foodgrains , Oil & Masala \n3. Bakery ,Cakes & Dairy \n4. Snakes & Branded Foods ");
                System.out.println("For Exit Enter \"0\"");
                System.out.println("Enter your choice : ");
                chos=x.nextInt();
                
                switch(chos){
                    case 1:
                        do{
                            System.out.println("Items are availables in \"Fruits & Vegetables\"");
                            System.out.println("\n1. Tomato(5 pc)  ( Price 35  )\n2. Banana(12 pc)  ( Price 30 )\n3. Apple(4 pc)  ( Price 65 )\n4. Potato(6 pc)  ( Price 15)\n5. Pinaple(1 pc)  ( Price 80 )\n6. Litchi( 500 GM )  ( Price 60)");
                            System.out.println("For Previous Menu enter \"0\"");
                            System.out.println("Enetr Your choice : ");
                            
                            chos1=x.nextInt();
                            switch(chos1){
                                case 1:
                                    price=35;
                                    item="Tomato";
                                    System.out.println("Place the number of packs of "+item+ " : ");
                                    q=x.nextInt();
                                    float amount=cal1(price,q);
                                    if(map1.containsKey(item)== true){
                                        float amount1=map1.get(item);
                                        amount=amount1+amount;
                                        int q1=map.get(item);
                                        q=q+q1;
                                    }
                                    map1.put(item, amount);
                                    map.put(item, q);
                                    break;
                                case 2:
                                    price=30;
                                    item="Banana";
                                    System.out.println("Place the number of packs of "+item+ " : ");
                                    q=x.nextInt();
                                    amount=cal1(price,q);
                                    if(map1.containsKey(item)== true){
                                        float amount1=map1.get(item);
                                        amount=amount1+amount;
                                        int q1=map.get(item);
                                        q=q+q1;
                                    }
                                    map1.put(item, amount);
                                    map.put(item, q);
                                    break;
                                case 3:
                                    price=65;
                                    item="Apple";
                                    System.out.println("Place the number of packs of "+item+ " : ");
                                    q=x.nextInt();
                                    amount=cal1(price,q);
                                    if(map1.containsKey(item)== true){
                                        float amount1=map1.get(item);
                                        amount=amount1+amount;
                                        int q1=map.get(item);
                                        q=q+q1;
                                    }
                                    map1.put(item, amount);
                                    map.put(item, q);
                                    break;
                                case 4:
                                    price=15;
                                    item="Potato";
                                    System.out.println("Place the number of packs of "+item+ " : ");
                                    q=x.nextInt();
                                    amount=cal1(price,q);
                                    if(map1.containsKey(item)== true){
                                        float amount1=map1.get(item);
                                        amount=amount1+amount;
                                        int q1=map.get(item);
                                        q=q+q1;
                                    }
                                    map1.put(item, amount);
                                    map.put(item, q);
                                    break;
                                case 5:
                                    price=80;
                                    item="Pinaple";
                                    System.out.println("Place enter the no of Pack of  "+item+ " : ");
                                    q=x.nextInt();
                                    amount=cal1(price,q);
                                    if(map1.containsKey(item)== true){
                                        float amount1=map1.get(item);
                                        amount=amount1+amount;
                                        int q1=map.get(item);
                                        q=q+q1;
                                    }
                                    map1.put(item, amount);
                                    map.put(item, q);
                                    break;
                                case 6:
                                    price=65;
                                    item="Litchi";
                                    System.out.println("Place the number of packs of "+item+ " : ");
                                    q=x.nextInt();
                                    amount=cal1(price,q);
                                    if(map1.containsKey(item)== true){
                                        float amount1=map1.get(item);
                                        amount=amount1+amount;
                                        int q1=map.get(item);
                                        q=q+q1;
                                    }
                                    map1.put(item, amount);
                                    map.put(item, q);
                                    break;
                                default:
                                    if(chos1 != 0){
                                    System.out.println("Wrong choose .....");
                                    }break;
                                    
                            }
                        }while(chos1 != 0);
                        break;
                    case 2:
                        do{
                            System.out.println("Items are availables in \"Foodgrains , Oil & Masala\"");
                            System.out.println("\n1. Rice(1 pack)  ( Price 95  )\n2. Atta(1 pack)  ( Price 70 )\n3. Sugar(1 pack)  ( Price 85 )\n4. Almond(1 pack)  ( Price 85)\n5. Salt(1 pack)  ( Price 40 )\n6. Oil( 1 pack )  ( Price 75)");
                            System.out.println("For Previous Menu enter \"0\"");
                            System.out.println("Enetr Your choice : ");
                            chos1=x.nextInt();
                            switch(chos1){
                                case 1:
                                    price=95;
                                    item="Rice";
                                    System.out.println("Place the number of packs of "+item+ " : ");
                                    q=x.nextInt();
                                    float amount=cal1(price,q);
                                    if(map1.containsKey(item)== true){
                                        float amount1=map1.get(item);
                                        amount=amount1+amount;
                                        int q1=map.get(item);
                                        q=q+q1;
                                    }
                                    map1.put(item, amount);
                                    map.put(item, q);
                                    break;
                                case 2:
                                    price=70;
                                    item="Atta";
                                    System.out.println("Place the number of packs of "+item+ " : ");
                                    q=x.nextInt();
                                    amount=cal1(price,q);
                                    if(map1.containsKey(item)== true){
                                        float amount1=map1.get(item);
                                        amount=amount1+amount;
                                        int q1=map.get(item);
                                        q=q+q1;
                                    }
                                    map1.put(item, amount);
                                    map.put(item, q);
                                    break;
                                case 3:
                                    price=85;
                                    item="Sugar";
                                    System.out.println("Place the number of packs of "+item+ " : ");
                                    q=x.nextInt();
                                    amount=cal1(price,q);
                                    if(map1.containsKey(item)== true){
                                        float amount1=map1.get(item);
                                        amount=amount1+amount;
                                        int q1=map.get(item);
                                        q=q+q1;
                                    }
                                    map1.put(item, amount);
                                    map.put(item, q);
                                    break;
                                case 4:
                                    price=85;
                                    item="Almond";
                                    System.out.println("Place the number of packs of "+item+ " : ");
                                    q=x.nextInt();
                                    amount=cal1(price,q);
                                    if(map1.containsKey(item)== true){
                                        float amount1=map1.get(item);
                                        amount=amount1+amount;
                                        int q1=map.get(item);
                                        q=q+q1;
                                    }
                                    map1.put(item, amount);
                                    map.put(item, q);
                                    break;
                                case 5:
                                    price=40;
                                    item="Salt";
                                    System.out.println("Place enter the no of Pack of  "+item+ " : ");
                                    q=x.nextInt();
                                    amount=cal1(price,q);
                                    if(map1.containsKey(item)== true){
                                        float amount1=map1.get(item);
                                        amount=amount1+amount;
                                        int q1=map.get(item);
                                        q=q+q1;
                                    }
                                    map1.put(item, amount);
                                    map.put(item, q);
                                    break;
                                case 6:
                                    price=75;
                                    item="Oil";
                                    System.out.println("Place the number of packs of "+item+ " : ");
                                    q=x.nextInt();
                                    amount=cal1(price,q);
                                    if(map1.containsKey(item)== true){
                                        float amount1=map1.get(item);
                                        amount=amount1+amount;
                                        int q1=map.get(item);
                                        q=q+q1;
                                    }
                                    map1.put(item, amount);
                                    map.put(item, q);
                                    break;
                                default:
                                    if(chos1 != 0){
                                    System.out.println("Wrong choose .....");
                                    }break;
                                    
                            }
                        }while(chos1 != 0);
                        break;
                    case 3:
                        do{
                            System.out.println("Items are availables in \"Bakery ,Cakes & Dairy\"");
                            System.out.println("\n1. Toned Milk(1 pack)  ( Price 23  )\n2. Butter(1 pack)  ( Price 51 )\n3. Bread(1 pack)  ( Price 76 )\n4. Paneer(1 pack)  ( Price 136.62)\n5. Choco cake(1 pack)  ( Price 29 )\n6. Biscuit( 1 pack )  ( Price 35)");
                            System.out.println("For Previous Menu enter \"0\"");
                            System.out.println("Enetr Your choice : ");
                            chos1=x.nextInt();
                            switch(chos1){
                                case 1:
                                    price=23;
                                    item="Toned Milk";
                                    System.out.println("Place the number of packs of "+item+ " : ");
                                    q=x.nextInt();
                                    float amount=cal1(price,q);
                                    if(map1.containsKey(item)== true){
                                        float amount1=map1.get(item);
                                        amount=amount1+amount;
                                        int q1=map.get(item);
                                        q=q+q1;
                                    }
                                    map1.put(item, amount);
                                    map.put(item, q);
                                    break;
                                case 2:
                                    price=51;
                                    item="Butter";
                                    System.out.println("Place the number of packs of "+item+ " : ");
                                    q=x.nextInt();
                                    amount=cal1(price,q);
                                    if(map1.containsKey(item)== true){
                                        float amount1=map1.get(item);
                                        amount=amount1+amount;
                                        int q1=map.get(item);
                                        q=q+q1;
                                    }
                                    map1.put(item, amount);
                                    map.put(item, q);
                                    break;
                                case 3:
                                    price=76;
                                    item="Bread";
                                    System.out.println("Place the number of packs of "+item+ " : ");
                                    q=x.nextInt();
                                    amount=cal1(price,q);
                                    if(map1.containsKey(item)== true){
                                        float amount1=map1.get(item);
                                        amount=amount1+amount;
                                        int q1=map.get(item);
                                        q=q+q1;
                                    }
                                    map1.put(item, amount);
                                    map.put(item, q);
                                    break;
                                case 4:
                                    price=136.62f;
                                    item="Paneer";
                                    System.out.println("Place the number of packs of "+item+ " : ");
                                    q=x.nextInt();
                                    amount=cal1(price,q);
                                    if(map1.containsKey(item)== true){
                                        float amount1=map1.get(item);
                                        amount=amount1+amount;
                                        int q1=map.get(item);
                                        q=q+q1;
                                    }
                                    map1.put(item, amount);
                                    map.put(item, q);
                                    break;
                                case 5:
                                    price=29;
                                    item="Choco cake";
                                    System.out.println("Place enter the no of Pack of  "+item+ " : ");
                                    q=x.nextInt();
                                    amount=cal1(price,q);
                                    if(map1.containsKey(item)== true){
                                        float amount1=map1.get(item);
                                        amount=amount1+amount;
                                        int q1=map.get(item);
                                        q=q+q1;
                                    }
                                    map1.put(item, amount);
                                    map.put(item, q);
                                    break;
                                case 6:
                                    price=35;
                                    item="Biscuit";
                                    System.out.println("Place the number of packs of "+item+ " : ");
                                    q=x.nextInt();
                                    amount=cal1(price,q);
                                    if(map1.containsKey(item)== true){
                                        float amount1=map1.get(item);
                                        amount=amount1+amount;
                                        int q1=map.get(item);
                                        q=q+q1;
                                    }
                                    map1.put(item, amount);
                                    map.put(item, q);
                                    break;
                                default:
                                    if(chos1 != 0){
                                    System.out.println("Wrong choose .....");
                                    }break;
                                    
                            }
                        }while(chos1 != 0);
                        break;
                    case 4:
                        do{
                            System.out.println("Items are availables in \"Snakes & Branded Foods\"");
                            System.out.println("\n1. Maggi(1 pack)  ( Price 20  )\n2. Honey(1 pack)  ( Price 41 )\n3. Jam(1 pack)  ( Price 76 )\n4. Cold Drinks(1 pack)  ( Price 30)\n5. Oats(1 pack)  ( Price 65.20 )\n6. Ghee( 1 pack )  ( Price 281)");
                            System.out.println("For Previous Menu enter \"0\"");
                            System.out.println("Enetr Your choice : ");
                            chos1=x.nextInt();
                            
                            switch(chos1){
                                case 1:
                                    price=20;
                                    item="Maggi";
                                    System.out.println("Place the number of packs of "+item+ " : ");
                                    q=x.nextInt();
                                    float amount=cal1(price,q);
                                    if(map1.containsKey(item)== true){
                                        float amount1=map1.get(item);
                                        amount=amount1+amount;
                                        int q1=map.get(item);
                                        q=q+q1;
                                    }
                                    map1.put(item, amount);
                                    map.put(item, q);
                                    break;
                                case 2:
                                    price=41;
                                    item="Honey";
                                    System.out.println("Place the number of packs of "+item+ " : ");
                                    q=x.nextInt();
                                    amount=cal1(price,q);
                                    if(map1.containsKey(item)== true){
                                        float amount1=map1.get(item);
                                        amount=amount1+amount;
                                        int q1=map.get(item);
                                        q=q+q1;
                                    }
                                    map1.put(item, amount);
                                    map.put(item, q);
                                    break;
                                case 3:
                                    price=76;
                                    item="Jam";
                                    System.out.println("Place the number of packs of "+item+ " : ");
                                    q=x.nextInt();
                                    amount=cal1(price,q);
                                    if(map1.containsKey(item)== true){
                                        float amount1=map1.get(item);
                                        amount=amount1+amount;
                                        int q1=map.get(item);
                                        q=q+q1;
                                    }
                                    map1.put(item, amount);
                                    map.put(item, q);
                                    break;
                                case 4:
                                    price=30;
                                    item="Cold Drinks";
                                    System.out.println("Place the number of packs of "+item+ " : ");
                                    q=x.nextInt();
                                    amount=cal1(price,q);
                                    if(map1.containsKey(item)== true){
                                        float amount1=map1.get(item);
                                        amount=amount1+amount;
                                        int q1=map.get(item);
                                        q=q+q1;
                                    }
                                    map1.put(item, amount);
                                    map.put(item, q);
                                    break;
                                case 5:
                                    price=65.20f;
                                    item="Oats";
                                    System.out.println("Place enter the no of Pack of  "+item+ " : ");
                                    q=x.nextInt();
                                    amount=cal1(price,q);
                                    if(map1.containsKey(item)== true){
                                        float amount1=map1.get(item);
                                        amount=amount1+amount;
                                        int q1=map.get(item);
                                        q=q+q1;
                                    }
                                    map1.put(item, amount);
                                    map.put(item, q);
                                    break;
                                case 6:
                                    price=281;
                                    item="Ghee";
                                    System.out.println("Place the number of packs of "+item+ " : ");
                                    q=x.nextInt();
                                    amount=cal1(price,q);
                                    if(map1.containsKey(item)== true){
                                        float amount1=map1.get(item);
                                        amount=amount1+amount;
                                        int q1=map.get(item);
                                        q=q+q1;
                                    }
                                    map1.put(item, amount);
                                    map.put(item, q);
                                    break;
                                default:
                                    if(chos1 != 0){
                                    System.out.println("Wrong choose .....");
                                    }break;
                                    
                            }
                        }while(chos1 != 0);
                        break;
                    default:
                        if(chos != 0){
                            System.out.println("Wrong choose .....");
                            }break;
                        
                }
            }while(chos != 0);
            String j="Items";
            String k="Price";
            String h="Quentity";
            //String line = new String(new char[48]).replace('\0', '-');
            String line1 = new String(new char[54]).replace('\0', '-');
            System.out.println(line1);
            System.out.printf("|%-15s | %-15s | %-15s | %n",j,h,k);
            System.out.println(line1);
            map1.entrySet().forEach((entry) -> {
                String key = entry.getKey();
                String value = entry.getValue().toString();
                String value1=map.get(key).toString();
                System.out.printf("|%-15s | %-15s | %-15s | %n",key,value1,value);
            });
            System.out.println(line1);
            System.out.println("Total Items are : "+map1.size()+"\n\n");
            for(float val : map1.values()){
                sum += val;
            }
            String line2 = new String(new char[54]).replace('\0', '-');
            System.out.println(line1);
            System.out.println("Total Price : "+sum+"\n\n");
            System.out.println(line1);
            System.out.println("Do you want shop again then \"y\" and \"Y\"");
            ch = x.next();
            map.clear();
            map1.clear();
            System.out.println("\n\n");
        }while(ch.equals("y"));
    }
    
}

