/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automovil;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;


/**
 *
 * @author Stephanie
 */
public class Automovil {
    
    private static int Placa =0;
    private String Marca;
    private int Costo;
    private String Color;
    private Date fechaCompra;
    private String Duenio;
    private String Telefono;
    private boolean isChocado;
    
     public Automovil(String pNombre, String pTelefono,String pMarca,String pColor){
        Placa++;
        Random aleatorio= new Random();
        Costo = (int) (aleatorio.nextInt(5000-3000+1)+3000) ;
        System.out.println("aleatorio es:" + Costo);
        setPlaca(Placa);
        setCosto(Costo);
        setTelefono(pTelefono);
        setIsChocado(false);
        setDuenio(pNombre);
        setColor(pColor);
        setMarca(pMarca);
        setFechaCompra(); 
    }
    
    public String cambiarColor(String pNuevoColor){
        setColor(pNuevoColor);
        
        return "El color del automovil ha sido cambiado por:" + Color;
    }
    
    public String cambiarDuenio(String pNombre, String pTelefono){
        if(getIsChocado()==true){
            return "El automovilplaca:" + getPlaca() +"no puede cambiar de dueño, debido a que esta chocado";
        }
        setDuenio(pNombre);
        setTelefono(pTelefono);
        return "El automovil"+ getPlaca() +"ha cambiado de Dueño exitosamente";
        
        
    }
    public String repararAutomovil(){
        if(getIsChocado()==true){
            setIsChocado(false);
            return "El automovil ha sido reparado con exito";
        }
        return "No es necesario reparar el automovil";
    }
    
    public String chocarAutomovil(){
        
        setIsChocado(true);
        return "El automovil ha sido chocado";   
    }
    
    public String toString(){
        String msg;
        
        msg ="Dueño:" + getDuenio() + "\n";
        msg += "Telefono del dueño: " + getTelefono() + "\n";
        msg+= "Fecha Compra: " + getFechaCompra() + "\n";
        msg += "Marca: " + getMarca() + "\n";
        msg += "Color " + getColor() + "\n";
        msg += "Costo: " + getCosto() + "\n";
        msg += "Placa N°: " + getPlaca() + "\n";
        if(getIsChocado()==true){
            msg += "Estado:    Chocado \n";
        }
        else{
            msg += "Estado:   Sin Chocar \n";
        }
        
        return msg;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public int getCosto() {
        return Costo;
    }

    public void setCosto(int Costo) {
        this.Costo = Costo;
    }

    public static int getPlaca() {
        return Placa;
    }

    public static void setPlaca(int Placa) {
        Automovil.Placa = Placa;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getFechaCompra() {
        SimpleDateFormat mascara = new SimpleDateFormat( "dd/MM/yy" );
        return mascara.format( fechaCompra);
    }

    public void setFechaCompra() {
        Calendar calendario;
        calendario = Calendar.getInstance();
        fechaCompra = calendario.getTime();
    }

    public String getDuenio() {
        return Duenio;
    }

    public void setDuenio(String Duenio) {
        this.Duenio = Duenio;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public boolean getIsChocado() {
        return isChocado;
    }

    public void setIsChocado(boolean isChocado) {
        this.isChocado = isChocado;
    }
     
    
}
