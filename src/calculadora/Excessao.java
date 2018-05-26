/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author Meu computador
 */
public class Excessao {
    boolean flag;
    
    public Excessao(){
        flag = false;
    }
    
    public boolean flagFalse(){
        return flag = false;
    }
    public boolean flagTrue(){
        return flag = true;
    }
    
    public boolean revisao(String s){
        String str = s;
        char c;
        boolean f=false;
        int i=0,j=48;
        StringBuilder stringBuilder = new StringBuilder(s);
        
        while(j<58){
            i=0;
            while(i < str.length()){
                c = str.charAt(i);
                if(c == j || c == ' ' || c == '-'){
                    stringBuilder.insert(i, '*');
                }
                i++;
            }
            j++;
        }
        i=0;
        while(i < stringBuilder.length()){
            c = stringBuilder.charAt(i);
            if(c != '*')
                f = true;
        }
        return f;
    }
    
}
