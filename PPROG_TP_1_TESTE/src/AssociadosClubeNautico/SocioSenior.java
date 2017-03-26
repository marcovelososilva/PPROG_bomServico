 package AssociadosClubeNautico;

import java.util.Calendar;

/**
 *
 * @author Marco-115883 | Joao-1161313 (1NB)
 */
public class SocioSenior extends Associados {

    private int valorBase = 150;
    private float descontobase = (float) 0.10;
    private boolean dirigente = false;
    
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

    
    public float getDesconto(int idade){
        return ((int)idade/10)/10;
    }

    @Override
    double calcularValorIntegral() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    double calcularDesconto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
