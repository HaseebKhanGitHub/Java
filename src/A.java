
public class A {
public static void main(String[] args) {
int [][] uneven = {{1,2,3},{4,5},{6,7,8,9,0}};

for(int row=0; row<uneven.length; row++)
{
	System.out.print("Row"+row+":");
	for(int col=0; col<uneven[row].length; col++)
		System.out.print(uneven[row][col] + " " );
	System.out.println();
		
}
}		
}