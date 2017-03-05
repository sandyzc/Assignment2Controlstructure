
public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y;
		for(x = 1; x <= 5; x++)
		{
			for(y = 1; y <= 5; y++){
				if(y == x || y == 5-x+1){
				System.out.print("*");}
				
				else if(y < 5-x+1){
					System.out.print("_");
				}
				
				else if(y < x){
					System.out.print("_");
				}
			}
			System.out.println();
			
		}

	}

}
