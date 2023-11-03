import java.util.Stack;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		System.out.println("Shopping Mall \n" + "Enter the number of your choice");
		Stack <String> item = new Stack<>();
		item.push("Table");
		item.push("Chair");
		item.push("Plate");
		Scanner scanner = new Scanner (System.in);
		while(true){
			System.out.println(" 1- Add Item" + 
			                   "\n 2- Read Item" + 
			                   "\n 3- Update Item" + 
			                   "\n 4- Delete Item");
			System.out.println("Enter Number: ");
			int choice = scanner.nextInt();
			if(choice==1){
			 System.out.print("Enter Item: ");
			 String name = scanner.next();
			 item.push(name);
			 System.out.println("Item is added successfully!");
			}
			else if(choice==2){
				if(item.isEmpty()){
					System.out.println("The item is empty");
				}
				else{
					item.forEach(System.out::println);
				}
			}
			else if(choice==3){
				System.out.println("Enter the item you want to update:" +item);
				String update = scanner.next();
				if(item.contains(update)){
					System.out.println("Enter the new item: ");
					String value = scanner.next();
					int index = item.lastIndexOf(update);
					item.set(index, value);
					System.out.println("Item updated" + item);				}
				else{
					System.out.println("Item is not in the list");
				}
			}
			else if(choice==4){
				System.out.println("Enter item you want to delete: " + item);
				String delete = scanner.next();
				if(item.contains(delete)){
					item.removeElement(delete);
					System.out.println("You just deleted " + delete + " from the list");
					System.out.println("Current items available: " + item);
				}
				else{
					System.out.println("Item is not in the list");
				}
			}
		}
	}
}
			 
			 