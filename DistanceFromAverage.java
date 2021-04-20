/* Created by the sick and tired Yating Lei on 19/04/2020. */
import javax.swing.JOptionPane;
public class DistanceFromAverage {
    public static void main(String[] args) {
        // Declare variables
        int maxNumOfDoubles=20;
        int count=-1;
        double average=0.0;
        boolean myError=false;
        String temp="start", check="99999";
        double array[] = new double[maxNumOfDoubles];
        StringBuffer theList = new StringBuffer("Numbers from First to Last are:\n");

        // Get Doubles
        do{
            count++;
            temp = JOptionPane.showInputDialog(null, "Enter Double Number: ", "Distance From Average - 99999 to finish", JOptionPane.INFORMATION_MESSAGE);
            if(count==0&&temp==""){temp="99999";myError=true;}
            array[count] = Double.parseDouble(temp);
        }while(!temp.equals(check)&&count<maxNumOfDoubles);

        // Display Error else calculate
        if(myError){JOptionPane.showMessageDialog(null,"Error Message", "Distance From Average - Error Message" ,JOptionPane.PLAIN_MESSAGE);}
        else
        {
            // Find average
            for (int i=0;i<count;i++)
            {
                average += array[i];
            }
            average = average/count;

            // Build List of Doubles to display
            for (int i=0;i<count;i++)
            {
                theList.append(array[i]);
                theList.append(" is " + (average-array[i]) + " from the Average: " + average);
                theList.append("\n");
            }
            // Display the List
            JOptionPane.showMessageDialog(null,theList, "Distance From Average - 99999 to finish" ,JOptionPane.PLAIN_MESSAGE);
        }
    }
}