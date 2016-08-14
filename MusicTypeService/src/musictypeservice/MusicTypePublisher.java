/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musictypeservice;

import javax.xml.ws.Endpoint;

/**
 *
 * @author Raphael
 */
public class MusicTypePublisher {

    public static void main(String[] args) {
        final String url = "http://localhost:8000/mts";
        System.out.println("Publicando MusicTypeService no endpoint " + url);
        Endpoint.publish(url, new MusicTypeService());
    }
}
