/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Owner
 */
public class StateThree implements StateInterface {
    
    private Context context;
    private boolean finalState;
    
    public StateThree(Context c) {
        System.out.println("current state: 3");
        context = c;
        finalState = false;
    }

    @Override
    public void A() {
        context.setState(new StateTwo(context));
    }

    @Override
    public void B() {
        context.setState(new StateOne(context));
    }

    @Override
    public void C() {
        context.setState(new StateFour(context));
    }
    
    @Override
    public boolean isFinal() {
        return finalState;
    } 
}
