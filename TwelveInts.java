/**
 * Created by Yating Lei on 19/04/2020.
 */
import javax.swing.JOptionPane;
public class TwelveInts {
    public static void main(String[] args) {
        // Declare variables
        int numOfInts=12;
        String array[] = new String[numOfInts];
        StringBuffer forward = new StringBuffer("Numbers from First to Last are:\n");
        StringBuffer backward = new StringBuffer("Numbers from Last to First are:\n");
        // Get int variables and assign to arrays
        for (int i=0;i<numOfInts;i++) {
            array[i] = JOptionPane.showInputDialog(null, "Enter Int Number: " + (i+1), "Twelve Ints - Enter " + numOfInts + " Ints", JOptionPane.INFORMATION_MESSAGE);
        }
        // Build strings for display
        for (int i=0;i<numOfInts;i++) {
            forward.append(array[i]);
            forward.append("\n");
            backward.append(array[((numOfInts-1)-i)]);
            backward.append("\n");
        }
        // Display Ints listed message
        JOptionPane.showMessageDialog(null,forward, "Twelve Ints - Numbers entered forwards" ,JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null,backward, "Twelve Ints - Numbers entered backwards" ,JOptionPane.PLAIN_MESSAGE);
    }
}