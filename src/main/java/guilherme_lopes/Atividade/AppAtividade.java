package guilherme_lopes.aula20200728.introdução.Atividade;

public class AppAtividade extends Objetc{

    public static void main(String[] args) {
        
        AreaConhecimento ConhecimentosGeraisMed = new AreaConhecimento ("Medicina");
        AreaConhecimento ConhecimentosGeraisMA = new AreaConhecimento ("Meio Ambiente");

        AreaConhecimento LinguaPortuguesa = new AreaConhecimento();
        
        System.out.printf("%s", ConhecimentosGeraisMA.getNome());
    }
    
}
