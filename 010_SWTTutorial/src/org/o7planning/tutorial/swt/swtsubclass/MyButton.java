package org.o7planning.tutorial.swt.swtsubclass;
 
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
 
public class MyButton extends Button {
 
   public MyButton(Composite parent, int style) {
       super(parent, style);
   }
 
   // You have to override this method.
   @Override
   protected void checkSubclass() {
       // No need to do anything.
   }
 
    
}