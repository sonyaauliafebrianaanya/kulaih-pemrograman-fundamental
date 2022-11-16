import java.util.Scanner;
  
class LuasPersegipanjang {
  public static void main(String args[]){
           
    Scanner input = new Scanner(System.in);
      
    System.out.println("##  Program Java Menghitung Luas persegipanjang  ##");
    System.out.println("=============================================");
    System.out.println();
     
    int panjang, lebar, luas, keliling;
 
    System.out.print("Input panjang : ");
    panjang = input.nextInt();
      
    System.out.print("Input lebar : ");
    lebar = input.nextInt();
  
    luas = panjang * lebar;
	keliling = 2* panjang + lebar;
      
    System.out.println("Luas persegipanjang: "+luas);
	System.out.println("keliling persegipanjang: "+keliling);
	
 
  }
}