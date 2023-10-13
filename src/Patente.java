import java.time.LocalDate;


class Patente extends Cliente {
    private String numeroPatente;
    private LocalDate scadenzaPatente;

    public Patente(String nome, String cognome, LocalDate dataNascita, String numeroTelefono,
                   String numeroPatente, LocalDate scadenzaPatente) {
        super(nome, cognome, dataNascita, numeroTelefono);
        this.numeroPatente = numeroPatente;
        this.scadenzaPatente = scadenzaPatente;
    }

    public String getNumeroPatente() {
        return numeroPatente;
    }

    public LocalDate getScadenzaPatente() {
        return scadenzaPatente;
    }

    @Override
    public String toString() {
        return "Patente{" +
                "numeroPatente='" + numeroPatente + '\'' +
                ", scadenzaPatente=" + scadenzaPatente +
                "} " + super.toString();
    }
}
