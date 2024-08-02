//Problem 3 : Kill All And Return Home
//In this we will apply backtracking for find all paths for duplicate paths we store all path in hashset 
import java.util.*;
public class Main
{
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int chessBoard[][]=new int[10][10];
		System.out.print("find_my_home_castle –soldiers ");
		int soldier=sc.nextInt();
		for(int i=0;i<soldier;i++){
		    System.out.print("Enter coordinates for soldier "+i+1+": ");
		    int col=sc.nextInt();
		    int row=sc.nextInt();
		    chessBoard[col][row]=1;
		}
		System.out.print("Enter the coordinates for your “special” castle: ");0
		int specialCol=sc.nextInt();
		int specialRow=sc.nextInt();
		
	}
}
