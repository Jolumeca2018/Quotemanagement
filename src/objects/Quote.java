package objects;
import java.sql.Date;

public class Quote {
	private int num_quo;
    private Date dat_quo;
    private int sta_quo;
    private String id_cus;
    private String name_cus;
    
    public Quote(int numquote, Date datequote, int state, String idcustomers, String customername){
        this.num_quo = numquote;
        this.dat_quo = datequote;
        this.sta_quo = state;
        this.id_cus = idcustomers;
        this.name_cus = customername;
    }

    public int getNum_Quo(){
        return num_quo;
    }

    public Date getDat_Quo(){
        return dat_quo;
    }

    public int getSta_Quo() {
        return sta_quo;
    }

    public String getIde_Cus() {
        return id_cus;
    }

    public String getNom_cus() {
        return name_cus;
    }
}
