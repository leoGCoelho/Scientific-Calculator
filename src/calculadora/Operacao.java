/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;
import java.lang.Math;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Meu computador
 */
public class Operacao {
    
    public Operacao(){
    }
    
    public Double Soma(Double x, Double y){
        return x+y;
    }
    public Double Sub(Double x, Double y){
        return x-y;
    }
    public Double Mul(Double x, Double y){
        return x*y;
    }
    public Double Div(Double x, Double y){
        return x/y;
    }
    public Double Pot(Double x, Double y){
        return Math.pow(x, y);
    }
    public Double Sqr(Double x){
        if(x>-1){
            return Math.sqrt(x);
        }
        else{
            JOptionPane.showMessageDialog(new JFrame(), "Raiz inexistente!\n");
            return null;
        }
    }
    public Double SqrN(Double x, Double y){
        if(y>0){
            if((x < 0) && (y%2 == 0)){
                JOptionPane.showMessageDialog(new JFrame(), "Raiz inexistente!\n");
                return null;
            }
            else return Math.ceil(Math.pow(x, 1.0 / y));
        }
        else{
            JOptionPane.showMessageDialog(new JFrame(), "Raiz inexistente!\n");
            return null;
        }
    }
    public Double Mod(Double x, Double y){
        return x % y;
    }
    public Double Fat(Double x){
        int i;
        Double a=1.0;
        for(i = 2; i <= x; i++ ){  a *= i; }
        
        return a;  
    }
    public Double Porc(Double x, Double y){
        return (x * y)/100;
    }
    
    public Double Sin(Double x){
        Double n;
        while(x > 360.0){ 
            x = x - 360;
        }
        n = Math.sin(x*2.0*Math.PI/360.0);
        
        if(x == 30.0 || x == 150.0) n = 0.5;
        if(x == 210.0 || x == 330.0) n = -0.5;
        if(x == 180.0 || x == 360.0) n = 0.0;
        
        return n;
        
    }
    public Double Cos(Double x){
        Double n;
        while(x > 360.0){ 
            x = x - 360;
        }
        n = Math.cos(x*2.0*Math.PI/360.0);
        
        if(x == 60.0 || x == 300.0) n = 0.5;
        if(x == 120.0 || x == 240.0) n = -0.5;
        if(x == 90.0 || x == 270.0) n = 0.0;
        
        return n;
    }
    public Double Tan(Double x){
        Double n;
        while(x > 360.0){ 
            x = x - 360;
        }
        n = Sin(x)/Cos(x);
        
        if(x == 45.0 || x == 225.0) n = 1.0;
        if(x == 135.0 || x == 315.0) n = -1.0;
        if(x == 180) n = 0.0;
        
        return n;
    }
    
    public Double Log(Double x){
        return Math.log(x);
    }  
    public Double Negative(Double x){
        return x * -1;
    }
    public Double Round(Double x){
        return Math.ceil(x);
    }
    public Double Bin(Double x){
        Double z=0.0;
        while(x > 0){
            Double mod = x % 2;
            z = x* 1 + mod;
            x /= 2;
        }
        
        return z;
    }
    
}
