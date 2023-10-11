import java.util.Date;


class PatenteCliente extends Cliente {
    private Date dataRilascio;
    private Date dataScadenza;

    public PatenteCliente(String nome, String cognome, String numeroTelefono, String indirizzo, Date dataRilascio, Date dataScadenza) {
        super(nome, cognome, numeroTelefono, indirizzo);
        this.dataRilascio = dataRilascio;
        this.dataScadenza = dataScadenza;
    }


    public Date getDataRilascio() {
        return dataRilascio;
    }

    public void setDataRilascio(Date dataRilascio) {
        this.dataRilascio = dataRilascio;
    }

    public Date getDataScadenza() {
        return dataScadenza;
    }

    public void setDataScadenza(Date dataScadenza) {
        this.dataScadenza = dataScadenza;
    }
}
