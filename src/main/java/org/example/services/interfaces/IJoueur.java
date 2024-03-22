package org.example.services.interfaces;

import org.example.entities.dto.JoueurDTO;
import org.example.utils.pseudoNonUniqueException;

public interface IJoueur {

    public void ajouterJoueur (JoueurDTO j) throws pseudoNonUniqueException;

}
