/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Owner
 */
public class StateSix implements StateInterface {
    
    private Context context;
    private boolean finalState;
    
    public StateSix(Context c) {
        System.out.println("current state: 6");
        context = c;
        finalState = true;
    }

    @Override
    public void A() {
        context.setState(new StateFive(context));
    }

    @Override
    public void B() {
        context.setState(new StateFour(context));
    }

    @Override
    public void C() {
        context.setState(new StateOne(context));
    }
    
    @Override
    public boolean isFinal() {
        return finalState;
    } 
}
