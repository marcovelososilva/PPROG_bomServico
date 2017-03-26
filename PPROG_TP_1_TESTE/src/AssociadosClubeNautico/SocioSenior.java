 package AssociadosClubeNautico;

import java.util.Calendar;

/**
 *
 * @author Marco-115883 | Joao-1161313 (1NB)
 */
public class SocioSenior extends Associados {

    private int valorBase;
    private float descontobase;
    private boolean dirigente;
    
    private final String tagAdulto = "SAdulto-";
    private static final int VALORBASE_POR_DEFEITO = 150;
    private static final float DESCONTOBASE_POR_DEFEITO = (float) 0.10;
    private static final boolean DIRIGENTE_POR_DEFEITO = false;
    private static final int yeartoday = Calendar.getInstance().get(Calendar.YEAR);
    private static int numeroSociosAdultos = 0;
    
    
    
    /**
     * Get the value of dirigente
     *
     * @return the value of dirigente
     */
    public boolean isDirigente() {
        return dirigente;
    }

    /**
     * Get the value of desconto
     *
     * @return the value of desconto
     */
    public float getDescontoBase() {
        return descontobase;
    }

    /**
     * Get the value of valorBase
     *
     * @return the value of valorBase
     */
    public int getValorBase() {
        return valorBase;
    }

    /**
     * Set the value of desconto
     *
     * @param desconto new value of desconto
     */
    public void setDescontoBase(float desconto) {
        this.descontobase = desconto;
    }
    
    /**
     * Set the value of valorBase
     *
     * @param valorBase new value of valorBase
     */
    public void setValorBase(int valorBase) {
        this.valorBase = valorBase;
    }

        /**
     * Set the value of dirigente
     *
     * @param dirigente new value of dirigente
     */
    public void setDirigente(boolean dirigente) {
        this.dirigente = dirigente;
    }

    
    public SocioSenior(String nome, int nContribuinte, int anoNascimento,boolean dirigente) {
        super(nome, nContribuinte, anoNascimento);
        this.dirigente = dirigente;
        
    }

    public SocioSenior() {
    }

   
    @Override
    double calcularDesconto(){
        if (this.dirigente){
            return 1;
        }else{
            int decada=(int)((yeartoday-this.getAnoNascimento())/10);
        return (double) (decada*0.1);
        }
    }
    @Override
    double calcularValorIntegral() {
        return 150;
    }
    
}
