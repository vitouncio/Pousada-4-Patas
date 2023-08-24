/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 14892160652
 */
public class Proprietario {
    private int id;
    private String nome;
    private List<Pet> lstPets;
    
    public Proprietario(int id, String nome, String email, String senha) {
        super(email,senha);
        this.id = id;
        this.nome = nome;
        this.lstPets = new ArrayList<>();
        
        for(int i=0; i<lstPets.size();i++){
        
            lstPets.set(i, new Pet());
        }
    }
    
    public void copiar(Proprietario outro){
        
        this.id = outro.getId();
        this.nome = outro.getNome();
        
        for(int i=0; i<lstPets.size();i++){
        
        }
            
        }



}
