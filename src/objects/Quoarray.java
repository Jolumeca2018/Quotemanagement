package objects;

import java.sql.Date;

public class Quoarray {
	private int num_quo;
    private Date dat_quo;
    private int sta_quo;
    private int id_cus;
    private String name_cus;
    
    public Quoarray(int num_quo, Date dat_quo, int sta_quo, int id_cus, String name_cus){
        this.num_quo = num_quo;
        this.dat_quo = dat_quo;
        this.sta_quo = sta_quo;
        this.id_cus = id_cus;
        this.name_cus = name_cus;
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

    public int getIde_Cus() {
        return id_cus;
    }

    public String getNom_cus() {
        return name_cus;
    }
}
