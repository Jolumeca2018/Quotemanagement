package objects;

public class Conarray {
    private String conlast;
    private String conname;
    private String conphone;
    private String conemail;
    
    public Conarray(String conlast, String conname, String conphone, String conemail){
        this.conlast = conlast;
        this.conname = conname;
        this.conphone = conphone;
        this.conemail = conemail;
    }

    public String getConlast(){
        return conlast;
    }

    public String getConname(){
        return conname;
    }

    public String getConphone() {
        return conphone;
    }

    public String getConemail() {
        return conemail;
    }

}
