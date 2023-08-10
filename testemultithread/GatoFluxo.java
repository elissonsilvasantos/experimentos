package testemultithread;

public class GatoFluxo extends Thread{
    
    private String nome;
    
    public GatoFluxo(String nome){
        this.nome = nome;
        //System.out.println("gato " + nome + " criado!");
    }
    
    public void run (){
        System.out.println("o gato " + nome + " está funcionando!");
    }
    
}
