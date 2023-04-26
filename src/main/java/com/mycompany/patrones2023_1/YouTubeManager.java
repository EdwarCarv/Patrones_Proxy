/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patrones2023_1;

import java.util.List;

/**
 *
 * @author Carvajal
 */
public class YouTubeManager {
    protected ThirdPartyYouTubeLib service;

    public YouTubeManager(ThirdPartyYouTubeLib service) {
        this.service = service;
    }

    public void renderizarPagina(String id) {
        service.getLibroInfo(id);
        // Representa la página del video.
    }

    public void MostrarListaDeLibro() {        
        System.out.println("Lista de libros");
        service.listLibros();
        // Representa la lista de libros.
    }

    public void reactOnUserInput() {
        MostrarPortadaDelLibro();
        MostrarListaDeLibro();
    }

    private void MostrarPortadaDelLibro() {
        throw new UnsupportedOperationException("No disponible por el momento."); 
    }
}
