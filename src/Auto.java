public class Auto {

    private String Marca;
    private String Modello;
    private String Trazione;
    private int Potenza;
    private int Cilindrata;
    private String Targa;
    private int NPosti;

    public Auto(String Marca, String Modello, String Trazione, int Potenza, int Cilindrata, String Targa, int NPosti) {

        this.Marca = Marca;
        this.Modello = Modello;
        this.Trazione = Trazione;
        this.Potenza = Potenza;
        this.Cilindrata = Cilindrata;
        this.Targa = Targa;
        this.NPosti = NPosti;

    }


    public String GetMarca() {
        return Marca;
    }

    public String GetModello() {
        return Modello;
    }

    public String GetTrazione() {
        return Trazione;
    }

    public int GetPotenza() {
        return Potenza;
    }

    public int GetCilindrata() {
        return Cilindrata;
    }
    
    public String GetTarga() {
        return Targa;
    }

    public int GetNPosti() {
        return NPosti;
    }


    public void SetMarca(String Marca) {
        this.Marca = Marca;
    }

    public void SetModello(String Modello) {
        this.Modello = Modello;
    }

    public void SetTrazione(String Trazione) {
        this.Trazione = Trazione;
    }

    public void SetPotenza(int Potenza) {
        this.Potenza = Potenza;
    }

    public void SetCilindrata(int Cilindrata) {
        this.Cilindrata = Cilindrata;
    }

    public void SetTarga(String Targa) {
        this.Targa = Targa;
    }

    public void SetNPosti(int NPosti)  {
        this.NPosti = NPosti;
    }

}
