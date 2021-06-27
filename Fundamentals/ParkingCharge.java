import java.util.Scanner;
class ParkingCharge {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    String code;
    System.out.println("Enter Airpot code :");
    code = scan.nextLine();
    
    switch(code){
    case "AUH":
        System.out.println("The Parking charge is 100");
        break;
    case "DXB":
        System.out.println("The Parking charge is 85");
        break;
    case "AAN":
        System.out.println("The Parking charge is 70");
        break;
    default: 
        System.out.println("Invalid Airport Code"); 
        break;

    }
    
}
}
