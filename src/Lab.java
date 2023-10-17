import java.util.ArrayList;

public class Lab {
    private String Nome;
    private Integer Codigo;
    private Integer limiteDeReservas;
    private ArrayList<String> reservas = new ArrayList<>();

    public Lab(String Nome, Integer Codigo){
        this.Nome = Nome;
        this.Codigo = Codigo;
        limiteDeReservas = 1;
    }

    public void criarReserva(String lab, String nome) throws Exception {
        if (this.reservas.size() == this.limiteDeReservas) {
            throw new Exception("Labortório já reservado.");
        }
        String reserva = lab + "/" + nome;
        this.reservas.add(reserva);
    }

    public void setNome(String Nome){
        this.Nome = Nome;
    }

    public void setCodigo(Integer Codigo){
        this.Codigo = Codigo;
    }

    public String getNome(){
        return Nome;
    }

    public Integer getCodigo(){
        return Codigo;
    }


}
