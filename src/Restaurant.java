import java.util.*;
public class Restaurant extends inheritance{     // Resturent_Management_System_Java_Code
     public static void main(String[] args){
        full();
     }
     public static void full(){
         System.out.println("\t\t\t\t\t\t-----------------------------------");
         System.out.println("\t\t\t\t\t\t\tFOOK HING RESTAURANT");
         System.out.println("\t\t\t\t\t\t===================================");
         product();
         System.out.println("\n\n\t\t\t1.New Customer");
         System.out.println("\t\t\t2.Old Customer");
         char c;
         Scanner sc=new Scanner(System.in);
         System.out.print("\n\t\t\tPlease Press(1/2) :");
         c=sc.nextLine().charAt(0);
         if(c=='1'){
            newc obj=new newc(); //for newcustomer;
            obj.cni();
         }
         else if(c=='2'){
            oldc obj2=new oldc(); //for oldcustomer;
            obj2.cid();
         }
         else
           full();
           Scanner bc=new Scanner(System.in);
           System.out.println("\n\n\t\tPress m to return main menu or press any other key to exit");
           int b=bc.nextLine().charAt(0);
           if(b=='m'){
           full();
           }
          
     }
     
     }
    

class inheritance{
         public static void product(){
         System.out.println("\t\t------------------------------");
         System.out.println("\t\t|Product Name|| Product Code|");
         System.out.println("\t\t------------------------------");
         System.out.println("\t\t|Daryabadi Biryani|| DB11|");
         System.out.println("\t\t------------------------------");
           System.out.println("\t\t|Beef|| BF11|");
         System.out.println("\t\t------------------------------");
          System.out.println("\t\t|Vegetable Biryani|| VG11|");
         System.out.println("\t\t------------------------------");
          System.out.println("\t\t|Burger|| BU11|");
         System.out.println("\t\t------------------------------");
          System.out.println("\t\t|Mutton Rezala|| MR11|");
          System.out.println("\t\t------------------------------");
          System.out.println("\t\t|Fish Tikka|| FT11|");
         System.out.println("\t\t------------------------------");
           System.out.println("\t\t|Mutton Fry|| MV11|");
         System.out.println("\t\t------------------------------");
           System.out.println("\t\t|Chicken Biryani|| CB11|");
         System.out.println("\t\t------------------------------");
           System.out.println("\t\t|Cold Drinks|| CD11|");
         System.out.println("\t\t------------------------------");
         }
}
class newc{
  static int i=235;
  static double t;//total;
  public static void cni(){
  String cname;
  Scanner sc=new Scanner(System.in);
   System.out.print("\n\t\t\tCustomer Name: ");
   cname=sc.nextLine();
   System.out.print("\t\t\tCustomer ID: "+(i++));
    prices();
    footer();
  }
  public static void  prices(){
     String pcode;
     double tp=0,tv=0;//tp=total price &tv=total vat;
     int j;
     for(j=0;j<20;j++){
         System.out.println("\n\t\t\t\t\t\t(Press t for calculate total :)\n");
          System.out.print("\n\t\t\tCode :");
          Scanner pr=new Scanner(System.in);
          pcode=pr.nextLine();
          int price;
          double vat;
          if("t".equals(pcode))
              break;
          switch(pcode){
              case "DB11":case"db11":
                  price=200;
                  vat=0*price;
                  tp=tp+price;
                  tv=tv+vat;
                   System.out.println("\t\t\tProduct :Daryabadi Biryani");
                   System.out.println("\t\t\tOld Price : "+price+"TK");
                   System.out.println("\t\t\tOld Vat : "+vat+"TK");
                  break;
                   case "BF11":case"bf11":
                  price=200;
                  vat=0*price;
                  tp=tp+price;
                  tv=tv+vat;
                   System.out.println("\t\t\tProduct :Beef");
                   System.out.println("\t\t\tOld Price : "+price+"TK");
                   System.out.println("\t\t\tOld Vat : "+vat+"TK");    
                       break;
                  case "VG11":case"vg11":
                  price=300;
                  vat=0*price;
                  tp=tp+price;
                  tv=tv+vat;
                   System.out.println("\t\t\tProduct :Vegetable Biryani");
                   System.out.println("\t\t\tOld Price : "+price+"TK");
                   System.out.println("\t\t\tOld Vat : "+vat+"TK");    
                       break;
                  case "BU11":case"bu11":
                  price=60;
                  vat=Math.ceil(0.1*price);//math.ceil() is used for round value;
                  tp=tp+price;
                  tv=tv+vat;
                   System.out.println("\t\t\tProduct :Burger");
                   System.out.println("\t\t\tOld Price : "+price+"TK");
                   System.out.println("\t\t\tOld Vat : "+vat+"TK");    
                       break;
                  case "MR11":case"mr11":
                  price=50;
                   vat=Math.ceil(0.1*price);//math.ceil() is used for round value;
                   tp=tp+price;
                   tv=tv+vat;
                   System.out.println("\t\t\tProduct :Mutton Rezala");
                   System.out.println("\t\t\tOld Price : "+price+"TK");
                   System.out.println("\t\t\tOld Vat : "+vat+"TK");    
                       break;
                  case "FT11":case"ft11":
                  price=215;
                   vat=Math.ceil(0.1*price);//math.ceil() is used for round value;
                   tp=tp+price;
                   tv=tv+vat;
                   System.out.println("\t\t\tProduct :Fish Tikka");
                   System.out.println("\t\t\tOld Price : "+price+"TK");
                   System.out.println("\t\t\tOld Vat : "+vat+"TK");    
                       break;
                 case "MV11":case"mv11":
                  price=50;
                   vat=Math.ceil(0.1*price);//math.ceil() is used for round value;
                   tp=tp+price;
                   tv=tv+vat;
                   System.out.println("\t\t\tProduct :Mutton Fry");
                   System.out.println("\t\t\tOld Price : "+price+"TK");
                   System.out.println("\t\t\tOld Vat : "+vat+"TK");    
                       break;
                  case "CB11":case"cb11":
                  price=220;
                   vat=Math.ceil(0.1*price);//math.ceil() is used for round value;
                   tp=tp+price;
                   tv=tv+vat;
                   System.out.println("\t\t\tProduct :Chicken Biryani");
                   System.out.println("\t\t\tOld Price : "+price+"TK");
                   System.out.println("\t\t\tOld Vat : "+vat+"TK");    
                       break;
                  case "CD11":case"cd11":
                  price=82;
                   vat=Math.ceil(0.1*price);//math.ceil() is used for round value;
                   tp=tp+price;
                   tv=tv+vat;
                   System.out.println("\t\t\tProduct :Cold Drinks(2 Litr)");
                   System.out.println("\t\t\tOld Price : "+price+"TK");
                   System.out.println("\t\t\tOld Vat : "+vat+"TK");    
                       break;
                  default:
                        System.out.println("\t\t\tPlease enter correct code");
          }
     }
      System.out.println("\n\t\t\tTotal Price: "+tp+"TK");
      System.out.println("\n\t\t\tTotal Vat: "+tv+"TK");
      t=tp+tv;
       System.out.println("\n\t\t\tTotal : "+t+"TK");
  }
  public static void footer(){
   System.out.println("\n\t\t\t\t Thank you....");
      System.out.println("\t\t\t\t\t\t\t\t\tMD.SUMON SORDER");
       System.out.println("\t\t\t\t\t\t\t\t\t---------------");
      System.out.println("\t\t\t\t\t\t\t\t\tSignature");
  }
 
}
class oldc{
public static void cid(){
 newc obj3=new newc();
 Scanner pr=new Scanner(System.in);
  System.out.print("\n\t\t\tCustomer Id:");
  int id;
  id=pr.nextInt();
  if(id>=235 && id<=obj3.i){
  obj3.prices();
   System.out.println("\t\t\t You got 5% discount");
   obj3.t=(obj3.t)-(.05*(obj3.t));
    System.out.println("\t\t\t Total with Discount:"+(Math.ceil(obj3.t))+"TK");
    obj3.footer();
    
  }else{
  System.out.println("\t\t Sorry.You are not our old Customer");
  obj3.cni();
  }
}
}