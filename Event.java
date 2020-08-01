
package pruebas;

import java.io.Serializable;

/**
 * @author Mario Becerra Mondejo
 */
public class Event {
    private Listener listener;
    private int[]array={1,2,3,4,5,6,7,8,9,0};

    public void setActionListener(Event.Listener listener){
        this.listener=listener;
    }
    
    /**
     * Example of how to collect an event.
     */
    public int getArrayValue(int pos){
        int value=array[pos];
        if(value==5){
            listener.action();
        }
        return value;
    }
    
    public interface Listener{
        public void action();
    }
}
