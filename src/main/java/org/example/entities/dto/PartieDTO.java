package org.example.entities.dto;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class PartieDTO {

    ArrayList<JoueurDTO> listeJoueurs ;

    public PartieDTO( ) {
        this.listeJoueurs = new ArrayList<>() ;
    }

}
