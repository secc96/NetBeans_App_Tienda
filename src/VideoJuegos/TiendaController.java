/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VideoJuegos;

import Juegos.CompraJuegos;






/**
 *
 * @author Sebas
 */
public class TiendaController  {
    
    private static TiendaController instancia;   
    private String videojuegos[][];
    private String nJuego;
    
    public static TiendaController getInstance(){
        if(instancia == null)
            instancia = new TiendaController();
        return instancia;
    }
    
    
    private TiendaController(){
        this.videojuegos=new String[2][6];
        this.nJuego="";
    }
    
    @Override
    public String GuardarVideoJuego( ){
        
   return nJuego;
    }
}
