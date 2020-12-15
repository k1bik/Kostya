public class Result implements Comparable <Result>{

    private final static String REZ_FORMAT_STRING = "%10s | %10s | %10s | %8d |";

    private String baseName; 
    private String mounth; 
    private String vacationerStatus;
    private int price;

    public Result(){
    	baseName="";
    	mounth="";
    	vacationerStatus="";
        price=0;
    }

    public Result(String baseName,String mounth, String vacationerStatus, int price){
        this.baseName=baseName;
        this.mounth=mounth;
        this.vacationerStatus=vacationerStatus;
        this.price=price;
    }

    public String getBaseName(){return baseName;}
    public String getMounth(){return mounth;}
    public String getVacationerStatus(){return vacationerStatus;}
    public int getPrice(){return price;}
 
    public void setBaseName(String baseName){this.baseName = baseName;}
    public void setMounth(String mounth){this.mounth = mounth;}
    public void setVacationerStatus(String vacationerStatus){this.vacationerStatus = vacationerStatus;}
    public void setWins(int price){this.price = price;}

    @Override
    public String toString(){
        return String.format(REZ_FORMAT_STRING,baseName,mounth,vacationerStatus,price);
    } 
   
    @Override
    public boolean equals (Object ob){ 
        if (ob==this) return true; 
        if (ob==null) return false;
        if (getClass()!=ob.getClass())return false;
        Result rez=(Result)ob;
        return (baseName.equals(rez.baseName) &&
        		mounth.equals(rez.mounth) && vacationerStatus.equals(rez.vacationerStatus));                 
    }

    public int hashCode(){
        return 7*baseName.hashCode()+
        13*mounth.hashCode()+
        17*vacationerStatus.hashCode()+
        19*(new Integer(price)).hashCode();
    }

    public int compareTo(Result rez){
        if (baseName.compareTo(rez.baseName) < 0) return -1;
        if ((baseName.compareTo(rez.baseName) == 0) && (mounth.compareTo(rez.mounth) < 0)) return -1;
        if ((baseName.compareTo(rez.baseName) == 0) && (mounth.compareTo(rez.mounth) == 0)&& (vacationerStatus.compareTo(rez.vacationerStatus) < 0)) return -1;
        else return 1;     
    }
}


