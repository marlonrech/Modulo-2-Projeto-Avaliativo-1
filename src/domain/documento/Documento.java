package domain.documento;

public class Documento {

    private long identificador;

    private static long contador = 0;

    private int identificadorDoResponsavel;

    private int identificadoDoCriador;

    private String linkDoDocumento;

    private String StatusDoDocumento;


    public Documento(int identificadorDoResponsavel, int identificadoDoCriador, String linkDoDocumento) {
        this.identificadorDoResponsavel = identificadorDoResponsavel;
        this.identificadoDoCriador = identificadoDoCriador;
        this.linkDoDocumento = linkDoDocumento;
        this.identificador = contador++;
        this.StatusDoDocumento = "Ativo";

    }


    public long getIdentificador() {
        return identificador;
    }

    public void setIdentificador(long identificador) {
        this.identificador = identificador;
    }

    public static long getContador() {
        return contador;
    }

    public static void setContador(long contador) {
        Documento.contador = contador;
    }

    public int getIdentificadorDoResponsavel() {
        return identificadorDoResponsavel;
    }

    public void setIdentificadorDoResponsavel(int identificadorDoResponsavel) {
        this.identificadorDoResponsavel = identificadorDoResponsavel;
    }

    public int getIdentificadoDoCriador() {
        return identificadoDoCriador;
    }

    public void setIdentificadoDoCriador(int identificadoDoCriador) {
        this.identificadoDoCriador = identificadoDoCriador;
    }

    public String getLinkDoDocumento() {
        return linkDoDocumento;
    }

    public void setLinkDoDocumento(String linkDoDocumento) {
        this.linkDoDocumento = linkDoDocumento;
    }

    public String getStatusDoDocumento() {
        return StatusDoDocumento;
    }

    public void setStatusDoDocumento(String statusDoDocumento) {
        StatusDoDocumento = statusDoDocumento;
    }

    @Override
    public String toString() {
        return "Documento{" +
                "identificador=" + identificador +
                ", identificadorDoResponsavel=" + identificadorDoResponsavel +
                ", identificadoDoCriador=" + identificadoDoCriador +
                ", linkDoDocumento='" + linkDoDocumento + '\'' +
                ", StatusDoDocumento='" + StatusDoDocumento + '\'' +
                '}';
    }
}


