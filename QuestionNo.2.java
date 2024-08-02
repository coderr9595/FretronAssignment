//Problem 2 : My Money My Shares
import java.util.*;
public class Main
{
	static void helper(List<Integer> applesWeight,int start,int destinationWeight,int currentWeight,String key,List<Integer> weigths,HashMap<String,List<Integer>> result,int visited[]) {
		if(currentWeight==destinationWeight) {
			result.put(key,new ArrayList<>(weigths));
			return;
		}
		if(currentWeight>destinationWeight) {
			return;
		}
		for(int i=start; i<applesWeight.size(); i++) {
			if(visited[i]==0) {
				currentWeight+=applesWeight.get(i);
				weigths.add(applesWeight.get(i));
				helper(applesWeight,i+1,destinationWeight,currentWeight,key,weigths,result,visited);
				currentWeight-=applesWeight.get(i);
				weigths.remove(weigths.size()-1);
				if(result.containsKey(key)) {
					return;
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<Integer> applesWeight=new ArrayList<>();
		System.out.println("run distribute_apple");
		while(true) {
			System.out.print("Enter apple weight in gram (-1 to stop ) : ");
			int temp=sc.nextInt();
			if(temp==-1) {
				break;
			}
			applesWeight.add(temp);
		}
		int weightSum=0;
		for(int num:applesWeight) {
			weightSum+=num;
		}
		weightSum/=100;
		int ram=50*weightSum;
		int sham=30*weightSum;
		int rahim=20*weightSum;
		int visited[]=new int[applesWeight.size()];
		HashMap<String,List<Integer>> result=new HashMap<>();
		helper(applesWeight,0,ram,0,"Ram",new ArrayList<>(),result,visited);
		for(int i=0;i<result.get("Ram").size();i++){
		    for(int j=0;j<applesWeight.size();j++){
		        if(result.get("Ram").get(i)==applesWeight.get(j)){
		            visited[j]=1;
		            break;
		        }
		    }
		}
		helper(applesWeight,0,sham,0,"Sham",new ArrayList<>(),result,visited);
		for(int i=0;i<result.get("Sham").size();i++){
		    for(int j=0;j<applesWeight.size();j++){
		        if(result.get("Sham").get(i)==applesWeight.get(j)){
		            visited[j]=1;
		            break;
		        }
		    }
		}
		helper(applesWeight,0,rahim,0,"Rahim",new ArrayList<>(),result,visited);
		System.out.println("Distribution Result :");
		System.out.println("Ram: "+result.get("Ram"));
		System.out.println("Sham: "+result.get("Sham"));
		System.out.println("Rahim: "+result.get("Rahim"));
	}
}
// 400
// 100
// 400
// 300
// 200
// 300
// 100
// 200
// -1
