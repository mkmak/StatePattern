/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Owner
 */
public class StateFive implements StateInterface {
    
    private Context context;
    private boolean finalState;
    
    public StateFive(Context c) {
        System.out.println("current state: 5");
        context = c;
        finalState = true;
    }

    @Override
    public void A() {
        context.setState(new StateFive(context));
    }

    @Override
    public void B() {
        context.setState(new StateSix(context));
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
