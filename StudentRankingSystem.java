import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

class StudentInfo {
	String rollno;
	String name;
	int math;
	int sci;
	int lang1;
	int lang2;
	int env_sci;
}

class PriorityComparator implements Comparator<StudentInfo> {
    @Override
    public int compare(StudentInfo a, StudentInfo b) {
    	int totalmarksa,totalmarksb;
    	
    	totalmarksa=a.math+a.sci+a.lang1+a.lang2+a.env_sci;
    	totalmarksb=b.math+b.sci+b.lang1+b.lang2+b.env_sci;
    	if(totalmarksa>totalmarksb)
    		return(-1);
    	if(totalmarksa<totalmarksb)
    		return(1);
    	if(totalmarksa==totalmarksb)
    	{
    		String priorstra=null,priorstrb=null;
    		
    		if(a.math<10)
    			priorstra="00"+Integer.toString(a.math);
    		else if(a.math>=10 && a.math!=100)
    			priorstra="0"+Integer.toString(a.math);
    		else if(a.math==100)
    			priorstra=Integer.toString(a.math);
    		
    		if(a.sci<10)
    			priorstra=priorstra+" 00"+Integer.toString(a.sci);
    		else if(a.sci>=10 && a.sci!=100)
    			priorstra=priorstra+" 0"+Integer.toString(a.sci);
    		else if(a.sci==100)
    			priorstra=priorstra+" "+Integer.toString(a.sci);
    		
    		
    		if(a.env_sci<10)
    			priorstra=priorstra+" 00"+Integer.toString(a.env_sci);
    		else if(a.env_sci>=10 && a.env_sci!=100)
    			priorstra=priorstra+" 0"+Integer.toString(a.env_sci);
    		else if(a.env_sci==100)
    			priorstra=priorstra+" "+Integer.toString(a.env_sci);
    		
    		if(a.lang1<10)
    			priorstra=priorstra+" 00"+Integer.toString(a.lang1);
    		else if(a.lang1>=10 && a.lang1!=100)
    			priorstra=priorstra+" 0"+Integer.toString(a.lang1);
    		else if(a.lang1==100)
    			priorstra=priorstra+" "+Integer.toString(a.lang1);
    		
    		
    		if(a.lang2<10)
    			priorstra=priorstra+" 00"+Integer.toString(a.lang2);
    		else if(a.lang2>=10 && a.lang2!=100)
    			priorstra=priorstra+" 0"+Integer.toString(a.lang2);
    		else if(a.lang2==100)
    			priorstra=priorstra+" "+Integer.toString(a.lang2);
    		

    		
    		if(b.math<10)
    			priorstrb="00"+Integer.toString(b.math);
    		else if(b.math>=10 && b.math!=100)
    			priorstrb="0"+Integer.toString(b.math);
    		else if(b.math==100)
    			priorstrb=Integer.toString(b.math);
    		
    		if(b.sci<10)
    			priorstrb=priorstrb+" 00"+Integer.toString(b.sci);
    		else if(b.sci>=10 && b.sci!=100)
    			priorstrb=priorstrb+" 0"+Integer.toString(b.sci);
    		else if(b.sci==100)
    			priorstrb=priorstrb+" "+Integer.toString(b.sci);
    		
    		
    		if(b.env_sci<10)
    			priorstrb=priorstrb+" 00"+Integer.toString(b.env_sci);
    		else if(b.env_sci>=10 && b.env_sci!=100)
    			priorstrb=priorstrb+" 0"+Integer.toString(b.env_sci);
    		else if(b.env_sci==100)
    			priorstrb=priorstrb+" "+Integer.toString(b.env_sci);
    		
    		if(b.lang1<10)
    			priorstrb=priorstrb+" 00"+Integer.toString(b.lang1);
    		else if(b.lang1>=10 && b.lang1!=100)
    			priorstrb=priorstrb+" 0"+Integer.toString(b.lang1);
    		else if(b.lang1==100)
    			priorstrb=priorstrb+" "+Integer.toString(b.lang1);
    		
    		
    		if(b.lang2<10)
    			priorstrb=priorstrb+" 00"+Integer.toString(b.lang2);
    		else if(b.lang2>=10 && b.lang2!=100)
    			priorstrb=priorstrb+" 0"+Integer.toString(b.lang2);
    		else if(b.lang2==100)
    			priorstrb=priorstrb+" "+Integer.toString(b.lang2);
    		
    		//System.out.println("priorstra:"+priorstra+" priorstrb:"+priorstrb);
    		if(priorstra.compareTo(priorstrb)!=0)
    			return priorstrb.compareTo(priorstra);
    		else
    			return a.name.compareToIgnoreCase(b.name);

    	}
    	return(0);
    }
}
	
public class StudentRankingSystem {
	public static void main(String[] args)
	{
        String str;
        int i;
        ArrayList<StudentInfo> infoarr=new ArrayList<StudentInfo>();
        try
		{
			BufferedReader brin=new BufferedReader(new FileReader("C:\\Users\\LENOVO\\Desktop\\Internship\\FOSSEE\\probB_input.txt"));
			i=0;
			while((str=brin.readLine())!=null)
			{
				String []spltstr= str.split(" ");
				StudentInfo obj=new StudentInfo();
				obj.rollno=spltstr[0];
				obj.name=spltstr[1];
				obj.lang1=Integer.parseInt(spltstr[2]);
				obj.lang2=Integer.parseInt(spltstr[3]);
				obj.math=Integer.parseInt(spltstr[4]);
				obj.sci=Integer.parseInt(spltstr[5]);
				obj.env_sci=Integer.parseInt(spltstr[6]);
				//System.out.println(obj.name);
				infoarr.add(obj);
			}	
			
			/*for(StudentInfo temp: infoarr){
			   System.out.println(temp.name);
			}*/
			
			Collections.sort(infoarr, new PriorityComparator());
	        
			//System.out.println();
			i=1;
			for(StudentInfo temp: infoarr){
			   System.out.println("rank "+i+":"+temp.name);
			   i++;
			}
			
			brin.close();
		}
		catch(FileNotFoundException er)
		{
			er.printStackTrace();
		}
		catch(IOException er1)
		{
			er1.printStackTrace();
		}
        
    }
}
