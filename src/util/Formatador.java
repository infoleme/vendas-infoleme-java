/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author leme_
 */
public class Formatador {
    
    /**
     * converter a virguala de uma string para ponto
     * @return double
     */
    public double converterVirgulaParaPonto(String pString){
        String retorno = new String();
        int tamanhoString = pString.length();
        for(int i = 0; i < tamanhoString; i++){
            if(pString.charAt(i) == ','){
                retorno += '.';
            }else{
                retorno += pString.charAt(i);
            }
            
        }
        return Float.parseFloat(retorno);        
    }
    
}
