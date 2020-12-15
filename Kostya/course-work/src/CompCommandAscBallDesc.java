import java.util.*;

public class CompCommandAscBallDesc implements Comparator{
    public int compare (Object ob1, Object ob2){
    	
        Result res1 = (Result) ob1;
        Result res2 = (Result) ob2;
        
        if (res1.getBaseName().compareTo(res2.getBaseName())<0) return -1;
        else if (res1.getBaseName().compareTo(res2.getBaseName())> 0) return 1;
        else if (res1.getVacationerStatus().compareTo(res2.getVacationerStatus())<0) return 1; 
        else if (res1.getVacationerStatus().compareTo(res2.getVacationerStatus())>0) return 0;
        else return -1;       
    }   
}