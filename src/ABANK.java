public class ABANK implements CBANK {
    private String bankName;
    private  String id;
    private String password;

    public ABANK(String bankName, String id, String password) {
        this.bankName = bankName;
        this.id = id;
        this.password = password;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public void connect(){
        System.out.println(getBankName()+"HAS CONNECTED SUCCESSFULLY");
    }
    public void sendCardInfo(String price){
        System.out.println("WAITING A REPLY FROM BANK");
        System.out.println("PROCESS IS SUCCESSFULL");



    }
}
