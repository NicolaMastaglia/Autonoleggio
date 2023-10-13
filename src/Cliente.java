import java.time.LocalDate;

class Cliente {
    private String nome;
    private String cognome;
    private LocalDate dataNascita;
    private String numeroTelefono;

    public Cliente(String nome, String cognome, LocalDate dataNascita, String numeroTelefono) {
        this.nome = nome;
        this.cognome = cognome;
        this.dataNascita = dataNascita;
        this.numeroTelefono = numeroTelefono;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public LocalDate getDataNascita() {
        return dataNascita;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", dataNascita=" + dataNascita +
                ", numeroTelefono='" + numeroTelefono + '\'' +
                '}';
    }
}