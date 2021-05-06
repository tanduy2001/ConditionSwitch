package basic.dev;
/**
 * Lab10
 */
import java.util.Scanner;
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap vao so nguyen can kiem tra: ");
		int number1 = sc.nextInt();
		
		if(number1 > 0) {
			System.out.println("So do la so duong");
		}	else {	
				if(number1 < 0) {
					System.out.println("So do la so am");
				}	else {
					System.out.println("so do la so 0");
					}
			
			}
		
		System.out.println("Nhap vao so nguyen can kiem tra chia het cho 3 hay 5: ");
		int number2 = sc.nextInt();
		
		if(number2 % 3 == 0) {
			System.out.println("So do chia het cho 3");
		}	else { 
					if(number2 % 5 == 0){
						System.out.println("So do chia het cho 5");
					} else {
						System.out.println("So nhap vao k chia het cho 3 va 5");
					  }
			}
					
			System.out.println("Nhap vao thang can tinh ngay: ");
			byte month = sc.nextByte();
			
			switch(month) {
			case 1,3,5,7,8,10,12:
				System.out.println("Thang do co 31 ngay");
				break;
			case 4,6,9,11:
				System.out.println("Thang do co 30 ngay");
				break;
			case 2:
				System.out.println("Thang do co 28 ngay voi nam binh thuong va 29 ngay voi nam nhuan");
				break;
			}
			
		    System.out.println("nhap cac he so cua ptr bac 2: ");
		    
		    System.out.println("Nhap va he so a = ");
		    int ax2 = sc.nextInt();
		    
		    System.out.println("Nhap vao he so b = ");
		    int bx = sc.nextInt();
		    
		    System.out.println("Nhap vao he so c = ");
		    int c0 = sc.nextInt();
		    
		    if((ax2 == 0) && (bx == 0) && (c0 == 0)) {
		    	System.out.println("ptrinh co vo so nghiem");
		    }
		    
		    if((ax2 == 0) && (bx == 0) && (c0 != 0)) {
		    	System.out.println("Phuong trinh vo nghiem");
		    }
		    
		    if((ax2 == 0) && (bx != 0)) {
		    	System.out.println("Phuong trinh co 1 nghiem duy nhat: " + (float) (-c0/bx));
		    }
		    
		    float denTa = bx * bx - 4 * ax2 * c0;
		    
		    if(denTa > 0) {
		    	
		    System.out.println("nghiem cua ptrinh la:");
		    System.out.println("x1 = " + (float) ((-bx + Math.sqrt(denTa))/(2 * ax2)));
		    System.out.println("x2 = " + (float) ((-bx - Math.sqrt(denTa))/(2 * ax2)));
		    
		    }else {  if(denTa == 0 ) {
		    			System.out.println("phuong trinh co nghiem kep x1 = x2 = " +(float) + (-bx)/(2 * ax2));
		    		  }else {
		    			  System.out.println("Ptrinh vo nghiem");
		    		  }
		    
		    }
		    
		    System.out.println("Nhap vao canh thu nhat cua tam giac: ");
		    float canh1 = sc.nextFloat();
		    
		    System.out.println("Nhap vao canh thu hai cua tam giac");
		    float canh2 = sc.nextFloat();
		    
		    System.out.println("Nhap vao canh thu ba cua tam giac");
		    float canh3 = sc.nextFloat();
		    
		    if((canh1 + canh2>canh3) || (canh2 + canh3 > canh1) || (canh1 + canh3 > canh2)){
		    	System.out.println("ba canh da nhap la ba canh cua tam giac");
		    }		else {
		    		System.out.println("Ba canh da nhap ko phai la ba canh cua tam giac");
		    		}
	}

}

