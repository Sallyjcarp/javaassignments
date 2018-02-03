/******************************************************************************
*
* Name: Sally Carpenter
* Course Number: SEIS601 - 01
*
* Description: Prints to the terminal window.
* Program 8.7
*****************************************************************************/
package assignments.resources;

//The Equipment Driver class instantiates the Electronics Equipment class
public class EquipmentDriver {

	public static void main(String[] args) {
		Equipment eq = new Equipment(12.00, 222.22, 120.00, "Samsung", "Cell phone Specs:");
		System.out.println(eq.getEquipmentType());
		System.out.println("Weight: " + eq.getWeight());
		System.out.println("Cost: $" + eq.getCost());
		System.out.println("Power Usage: " + eq.getPowerUsage());
		System.out.println("Manufacturer: " + eq.getManufacturer());
		System.out.println();
		Equipment co = new Equipment(10.00, 111.22, 150.00, "Asus", "Computer Specs:");
		System.out.println(co.getEquipmentType());
		System.out.println("Weight: " + co.getWeight());
		System.out.println("Cost: $" + co.getCost());
		System.out.println("Power Usage: " + co.getPowerUsage());
		System.out.println("Manufacturer: " + co.getManufacturer());
		System.out.println();
		Equipment dc = new Equipment(5.00, 811.22, 150.00, "Nikon", "Digital Camera Specs:");
		System.out.println(dc.getEquipmentType());
		System.out.println("Weight: " + dc.getWeight());
		System.out.println("Cost: $" + dc.getCost());
		System.out.println("Power Usage: " + dc.getPowerUsage());
		System.out.println("Manufacturer: " + dc.getManufacturer());
		System.out.println();
		Equipment pg = new Equipment(2.00, 50.00, 150.00, "Motorola", "Pager Specs:");
		System.out.println(pg.getEquipmentType());
		System.out.println("Weight: " + pg.getWeight());
		System.out.println("Cost: $" + pg.getCost());
		System.out.println("Power Usage: " + pg.getPowerUsage());
		System.out.println("Manufacturer: " + pg.getManufacturer());
	}

}
