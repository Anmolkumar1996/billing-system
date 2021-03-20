import java.util.*;
class billing
{
	public static void main(String[] args) 
	{
		ArrayList allItems=new ArrayList();
		ArrayList allPrice=new ArrayList();
		ArrayList allquantity=new ArrayList();
		ArrayList allsubTotal=new ArrayList();
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter the name");
		String name=sc1.nextLine();
		System.out.println("Enter the mobile number");
		long number=sc.nextLong();
		String choice="Y",item="";
		int selection,quantity=0,price=0,subTotal=0,grandTotal=0;


		System.out.println("                                 MENU          \n__________________________________________________________________________\n");
		System.out.println("Sl.no.                         Item                         Price                                         \n__________________________________________________________________________\n");
        System.out.println(" 1                             Coffee 	                    10\n 2                             Tea                          8\n 3                             Water                        20\n 4                             Dosa                         35\n 5                             Idly                         30");
		while(choice.equals("Y"))
		{
			System.out.println("Enter your choice");
			selection=sc.nextInt();
			System.out.println("Enter the quantity");
			quantity=sc.nextInt();
			switch(selection)
			{
				case 1:
					item="Coffee";
				    price=10;
					subTotal=price*quantity;
					break;
					case 2:
					item="Tea";
				    price=8;
					subTotal=price*quantity;
					break;
					case 3:
					item="Water";
				    price=20;
					subTotal=price*quantity;
					break;
					case 4:
					item="Dosa";
				    price=35;
					subTotal=price*quantity;
					break;
					case 5:
					item="Idly";
				    price=30;
					subTotal=price*quantity;
					break;
					default:System.out.println("item not found");
			}
			allItems.add(item);
			allPrice.add(price);
			allquantity.add(quantity);
			allsubTotal.add(subTotal);
		
			grandTotal+=subTotal;  //grandTotal=grandTotal+subTotal;
			System.out.println("do you want more?(Y/N)");
			choice=sc1.nextLine();
		}
		System.out.println("_______________________________________________________________________________________________________________ ");
		System.out.println("Customer Name:"+name+"\nMobile number:"+number+"");                    
        System.out.println("_______________________________________________________________________________________________________________");
		System.out.println("Item              Price                   Quantity                subTotal");
        System.out.println("_______________________________________________________________________________________________________________ ");
		for(int i=0;i<=allItems.size()-1;i++)
		{
        System.out.println(          allItems.get(i)+"                "+allPrice.get(i)+"                 "+allquantity.get(i)+"                       "+allsubTotal.get(i));
		}
        System.out.println("_______________________________________________________________________________________________________________");                   
        System.out.println("Grand Total:                                                                            "+grandTotal+"");
        System.out.println("_______________________________________________________________________________________________________________");                   
	}
}
