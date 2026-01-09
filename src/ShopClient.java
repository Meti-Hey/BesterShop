public class ShopClient {

    ShopClient(String ServerIP, int pServerPort)
    {
        super(pServerIP, pServerport);
    }

    public void groesse farbeWaehlen (String pGroesse ,String pFarbe){
        this.send("TSHIRT:")
    }
}
