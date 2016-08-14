/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musictypeclient;

/**
 *
 * @author Raphael
 */
public class MusicTypeClient {

    public static void main(String[] args) {
        MusicTypeServiceService mts = new MusicTypeServiceService();
        HeaderHandlerResolver handlerResolver = new HeaderHandlerResolver();
        mts.setHandlerResolver(handlerResolver);
        MusicTypeService service = mts.getMusicTypeServicePort();
        System.out.println(service.isEletronic("eletronica"));
        System.out.println(service.isRock("rock"));
        System.out.println(service.isRap("rap"));
        System.out.println(service.isFunk("funk"));
    }

}
