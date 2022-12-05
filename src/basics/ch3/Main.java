package basics.ch3;

public class Main {

    public static int[] removeDuplicates(int[] myArray)
    {
        int[] newArray = new int[myArray.length];
        int nr=0;
         for(int i=0; i<myArray.length; i++)
         {
             boolean added=false;
             for(int j=0; j<nr; j++)
             {
                 if(myArray[i]== newArray[j])
                 {
                     added = true;
                 }
             }
             if(added == false)
             {
                 newArray[nr++] = myArray[i];
             }
         }
         return newArray;
    }



    public static void main(String[] args) {
        int[] myArray = new int[]{3, 2, -3, -2, 0, 2};
        for(int i=0; i<myArray.length; i++)
        {
            System.out.println(myArray[i] + " ");
        }

        int[] newArray = removeDuplicates(myArray);
        System.out.println("");
        for(int i=0; i<newArray.length; i++)
        {
            System.out.println(newArray[i] + " ");
        }



    }
}
