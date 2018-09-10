/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *  Escenario para la configuracion de un escenario
 * @author ElJuano
 * @since 10/09/2018
 * @version 1.0 recharged
 */
import becker.robots.*;
import java.awt.Color;
public class Escenario {
    private City ciudad;
    private Robot robot;
    /**
     * Descripcion del constructor
     */
    public Escenario() {
        this.ciudad = new City();
        for(int i=1; i<=6; i++){
            Wall pared = new Wall(ciudad, 1, i, Direction.NORTH);
        }
        for(int i=1; i<=6; i++){
            Wall pared = new Wall(ciudad, i, 1, Direction.WEST);
        }
        for(int i=1; i<=6; i++){
            Wall pared = new Wall(ciudad, 6, i, Direction.SOUTH);
        }
        for(int i=1; i<=6; i++){
            Wall pared = new Wall(ciudad, i, 6, Direction.EAST);
        }
        Thing thing= new Thing(ciudad, 2, 2);
        thing.getIcon().setColor(Color.RED);
        thing.getIcon().setLabel("To");
        
        this.robot = new  Robot(ciudad, 4, 1, Direction.EAST);
        this.robot.setLabel("PRRON");
    }
    
    
    /**
     * 
     * @param pasos fggfg
     */

    public void ejecutar(int pasos){
        for (int i = 0; i<pasos; i++){
            this.robot.move();
    }
        
    }
    
}
