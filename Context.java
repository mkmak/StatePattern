/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Owner
 */
public class Context {
    private StateInterface current;
    
    public Context() {
        current = new StateOne(this);
    }
    
    public void setState(StateInterface s) {
        current = s;
    }
    
    public boolean acceptedWord(String w) {
        current = new StateOne(this);
        char[] charArr = w.toCharArray();
        
        for(char c : charArr) {
            if(c == 'a')
                current.A();
            else if(c == 'b')
                current.B();
            else if(c == 'c')
                current.C();
            else {
                System.out.println("Invalid word");
                return false;
            }
        }
        
        return current.isFinal();
    }
}
