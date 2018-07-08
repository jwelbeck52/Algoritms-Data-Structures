import java.util.*;
public class BinarySearch {

  
    public static void main(String[] args) 
    {
       int start,middle,end,n,num;
       Scanner input = new Scanner(System.in);
       
       //getting the size of the array
       System.out.println("Please enter the size of the array: ");
       n = input.nextInt();
       int values[] = new int[n];
        
       //taking values for the array
       System.out.println("Please enter the values for the array ");
       for (int i=0;i<n;i++)
       {
           System.out.print("value[" + i + "] : ");
           values[i] = input.nextInt(); 
       }
    
       //sorting the array in ascending order
       	for (int i=0; i<n-1; i++)
        {
            for (int j=i; j<n; j++)
            {
		if(values[i]>values[j]){
                    int temp= values[i];
                    values[i]=values[j];
                    values[j]=temp;
                                        
                      }
            }
        }
       
       start = 0;
       end = n-1;
       
       System.out.print("Please enter the number you want to search for: ");
       num = input.nextInt();
       
       //Print out the sorted array
       System.out.println("Sorted array : ");
        for(int i=0; i<n;i++)
            {
                 System.out.print(values[i] + "  ");
            }
        System.out.println(" ");
       
       //binary search operation
        while(start <= end)
       { 
                middle = (start + end)/2;
           
           if (num == values[middle])
                {
                    System.out.println(num + " was found at index " + middle);
                    return;
                }
           else if (num > values[middle])
                {
                    start = middle + 1;
                }
           else {
                    end = middle - 1;
           }
       }
        System.out.println(num + " was not found!");
    }
    
    
}
