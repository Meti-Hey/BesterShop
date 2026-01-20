import utils.Client;

public abstract class ShopClient extends Client {
    public ShopClient(String pServerIP, int pServerPort)
    {
        super(pServerIP, pServerPort);
    }

    public void groesseFarbeWaehlen (String pGroesse ,String pFarbe){
        this.send("TSHIRT:"+ pGroesse+ ":" +pFarbe);
    }
    public void bestaetigen (String pAntwort)
    {
        this.send ("BESTAETIGUNG:"+pAntwort);
    }
    public void abmelden()
    {
        this.send("ABMELDEN");
    }
}
