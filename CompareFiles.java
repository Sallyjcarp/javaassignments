/******************************************************************************
 *
 * Name: Sally Carpenter
 * Course Number: SEIS601 - 01
 *
 * Description: Prints to the terminal window.
 * Program 4.18
 *****************************************************************************/
	package fourth.Assignment;
	import java.io.BufferedReader;
	import java.io.FileReader;
	import java.io.IOException;

	    public class CompareFiles
	    {
	        public static void main(String[] args) throws IOException
	        {
	            BufferedReader reader1 = new BufferedReader(new FileReader("C:\\Files\\file1.txt"));

	            BufferedReader reader2 = new BufferedReader(new FileReader("C:\\Files\\file2.txt"));

	            String line1 = reader1.readLine();

	            String line2 = reader2.readLine();

	            boolean areEqual = true;

	            int lineNum = 1;

	            while (line1 != null || line2 != null)
	            {
	                if(line1 == null || line2 == null)
	                {
	                    areEqual = false;

	                    break;
	                }
	                else if(! line1.equalsIgnoreCase(line2))
	                {
	                    areEqual = false;

	                    break;
	                }

	                line1 = reader1.readLine();

	                line2 = reader2.readLine();

	                lineNum++;
	            }

	            if(areEqual)
	            {
	                System.out.println("Both files have same content.");
	            }
	            else
	            {
	                System.out.println("Both files have different content. They differ at line "+lineNum);

	                System.out.println("File1 has "+line1+" and File2 has "+line2+" at line "+lineNum);
	            }

	            reader1.close();

	            reader2.close();
	        }
	    }


