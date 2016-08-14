/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musictypeservice;

import javax.jws.HandlerChain;
import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 *
 * @author Raphael
 */
@WebService
@HandlerChain(file = "handler-chain.xml")
public class MusicTypeService {

    @WebMethod
    public boolean isEletronic(String music) {
        if (music.equalsIgnoreCase("eletronica")) {
            System.out.println("Música do tipo eletronica");
            return true;
        } else {
            return false;
        }
    }

    @WebMethod
    public boolean isRock(String music) {
        if (music.equalsIgnoreCase("rock")) {
            System.out.println("Música do tipo rock");
            return true;
        } else {
            return false;
        }
    }

    @WebMethod
    public boolean isRap(String music) {
        if (music.equalsIgnoreCase("rap")) {
            System.out.println("Música do tipo rap");
            return true;
        } else {
            return false;
        }
    }

    @WebMethod
    public boolean isFunk(String music) {
        if (music.equalsIgnoreCase("funk")) {
            System.out.println("Música do funk");
            return true;
        } else {
            return false;
        }
    }

}
