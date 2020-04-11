package objects;

public class Cusarray {
    private int cus_no;
    private String name;
    
    public Cusarray(int cus_no, String name){
        this.cus_no = cus_no;
        this.name = name;
 
    }

    public int getCus_no(){
        return cus_no;
    }

    public String getName(){
        return name;
    }


}
