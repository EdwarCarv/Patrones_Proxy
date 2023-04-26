/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patrones2023_1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Carvajal
 */
public class CachedYouTubeClass {
    private ThirdPartyYouTubeLib service;
    private List<String> listCache, videoCache;
    private boolean NecesitaReset;
    
    public CachedYouTubeClass(ThirdPartyYouTubeLib service) {
        this.service = service;
    }
    
    public List<String> listVideos() {
        if (listCache == null || NecesitaReset) {
            listCache = new ArrayList<>();
            service.listLibros();
        }
        return listCache;
    }
    
    public String getLibroInfo(String id) {
        if (videoCache == null || NecesitaReset) {
            System.out.println("No hay informacion al respecto");
        }
        String info = "";
        return info;
    }

    public void getLibro(String id) {
        if (ExitenciaDeLibro(id) || NecesitaReset) {
            service.getLibro(id);
        }
    }

    private boolean ExitenciaDeLibro(String id) {        
        if (id == "service.listLibros()") {
            return true;
        }
        return false;
        // verifica si el libro ya fue prestado
    }
}
