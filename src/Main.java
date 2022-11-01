import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {

        String[] names = {"Tom", "Dick","Harry"}; //array literal

        System.out.println(names.length);

        System.out.println(names[0]); // prints out Tom

        // a traversal
        for (int r = 0; r < names.length; r++)
            System.out.println(names[r]);

        // below is the for each loop
        for(String r: names)
            System.out.println(r);

        int [] values = new int [100];
        Random gen = new Random();
        String [] items = new String [100]; // sizes the array to hold 100 strings
        int itemCount = 0;

        items [0] = "Radio";
        itemCount++;

        for (int l=0; l < values.length; l++)
            values[l] = gen.nextInt(100)+ 1;

        for (int l=0; l < values.length; l++)
            System.out.printf("%4d", values[l]);

        //Algorithms
        //Sum
        int sum = 0;
        for (int l=0; l < values.length; l++)
            sum += values[l];
        System.out.println("\nThe sum of the array values is " + sum);
        System.out.println("The average is " + sum/values.length);

        int min = values[0];
        int max = values [0];
        for (int l=0; l < values.length; l++)
        {
            if(values[l] < min) //get a new min
                min = values[l];
            if(values[l] > max) //get a new max
                max = values[l];
        }
        System.out.println("The min is " + min);
        System.out.println("The max is " + max);

        // Search algorithms
        int target = 53;
        boolean found = false;

        for (int t = 0; t < values.length; t++)
        {
            if(values[t] ==  target)
            {
                System.out.println("Found at: " + t);
                found = true;
            }
        }
        System.out.println("Finished the search!");
        if (!found)
            System.out.println("Did not find the values " + target);

        //Find First - terminate the search after finding first occurance
        found = false;
        for (int t = 0; t < values.length; t++)
        {
            if(values[t] ==  target)
            {
                System.out.println("Found at: " + t);
                found = true;
                break;
            }
        }
        System.out.println("Finished the search!");
        if (!found)
            System.out.println("Did not find the values " + target);

        //Write a loop that traverses backwards to implement find last

        //Find Last
        found = false;
        for (int t = values.length - 1; t >= 0; t--)
        {
            if(values[t] ==  target)
            {
                System.out.println("Found at: " + t);
                found = true;
                break;
            }
        }
        System.out.println("Finished the search!");
        if (!found)
            System.out.println("Did not find the values " + target);
    }




}

