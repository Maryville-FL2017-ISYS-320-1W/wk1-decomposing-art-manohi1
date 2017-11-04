/*
  	ISYS 320
  	Name(s): Mohammed Anohi
  	Date: 11/04/2017
*/

// 4. Your pseudocode algorithm for how to break down the figure
/*
drawDiamond5Line
	print("*****")
	print("*****")
 	print(" * * ")
  	print("  *  ") 
	print(" * * ") 
end

drawDiamond2Line
	print("*****")
	print("*****")
end

drawDiamond3Line
	print("  *  ") 
	print("  *  ") 
	print("  *  ") 
end

drawDiamond5Line()
drawDiamond5Line()
drawDiamond2Line()
drawDiamond3Line()
drawDiamond5Line()

 */

public class StarFigures {

	public static void main(String[] args) {
		drawDiamond5Line();
		drawDiamond5Line();
		drawDiamond2Line();
		drawDiamond3Line();
		drawDiamond5Line();
	}
	
	public static void drawDiamond5Line() {
        System.out.println("*****");
        System.out.println("*****");
        System.out.println(" * * ");
        System.out.println("  *  ");
        System.out.println(" * * ");
    }
	public static void drawDiamond2Line() {
        System.out.println("*****");
        System.out.println("*****");
    }
	public static void drawDiamond3Line() {
		System.out.println("  *  ");
		System.out.println("  *  ");
		System.out.println("  *  ");
    }
	
}
