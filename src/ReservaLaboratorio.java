public class ReservaLaboratorio {
    private String professor;
    private Lab laboratorio;

    public ReservaLaboratorio(String Professor, Lab laboratorio) {
        this.professor = professor;
        this.laboratorio = laboratorio;
    }
    public Lab getLaboratorio() {
        return laboratorio;
    }

    public String getProfessor() {
        return professor;
    }
}
