package guilherme_lopes.aula20200728.introdução.Atividade;

public class AreaConhecimento extends Objetc{

    private String nome;

    public AreaConhecimento() {
        
    }

    public AreaConhecimento(String nome) {
        this.nome = nome;
    }




    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        if (nome != "Medicina") {
            throw new RuntimeException("As áreas devem ser Medicina ou Meio Ambiente!");
        }
        return nome;
    }
}
