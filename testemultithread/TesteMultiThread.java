package testemultithread;

public class TesteMultiThread {

    public static void main(String[] args) {
        
        /*
        GatoFluxo gato1 = new GatoFluxo("1");
        GatoFluxo gato2 = new GatoFluxo("2");
        
        gato1.start();
        gato2.start();
        */
        
        for (int i=0; i<10; i++){
            GatoFluxo g = new GatoFluxo(Integer.toString(i+1));
            g.start();
        }
        
        
        
    }
    
}
