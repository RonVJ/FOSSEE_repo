INPUT:
Input to the problem is provided through the "probB_input.txt" file.
"probB_input.txt" input file format:
Suppose n students information is to be stored.Information of each student is stored on a single line.
Format for storing information of a student on each line:
rollno Name(without space) Lang1_marks Lang2_marks Math_marks Sci_marks Env_sci_marks
(Note:Check probB_input.txt file for reference input)

OUTPUT:
Output format:
on each line rank and name of the student is displayed in increasing order of rank.

HOW TO RUN:
Save "probB_input.txt" at some location.Suppose it is saved at C:\Users\LENOVO\Desktop\Internship\FOSSEE.
On line number 127 of the file StudentRankingSystem.java,in double quotes provide this path and append the path with '\probB_input.txt'.
So the path in double quotes becomes "C:\Users\LENOVO\Desktop\Internship\FOSSEE\probB_input.txt".
Now replace all the '\' in the path with '\\'.Hence path in double quotes becomes  "C:\\Users\\LENOVO\\Desktop\\Internship\\FOSSEE\\probB_input.txt"
Save the files probB_input.txt and StudentRankingSystem.java

Open command prompt change directory to the folder in which the file StudentRankingSystem.java is stored.
write command -> javac StudentRankingSystem.java
It will compile the file.
To run the file write the following command
-> java StudentRankingSystem