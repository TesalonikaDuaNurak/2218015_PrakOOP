/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kuiz;

/**
 *
 * @author march
 */
public class PIN {
    
    String nama, hasil; 
    private String pin;
    private String input;
    

    public PIN() {
    
       pin = "2218015";
    }

    public void setInput(String input) {
        this.input = input;
    } 
    
    String cocokanPIN(){
        if(pin.compareTo(input)==0)
        {
          hasil = "PIN Benar";
        }
        else
        {
          hasil = "PIN Salah ";
        }
        return hasil;
    }
}
