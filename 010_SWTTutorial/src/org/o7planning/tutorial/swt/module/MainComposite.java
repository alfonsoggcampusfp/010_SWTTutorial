package org.o7planning.tutorial.swt.module;
 
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
 
public class MainComposite extends Composite {
 
  /**
   * Create the composite.
   * @param parent
   * @param style
   */
  public MainComposite(Composite parent, int style) {
      super(parent, style);
      setLayout(new FillLayout(SWT.HORIZONTAL));
      
      Composite composite = new Composite(this, SWT.NONE);
      composite.setLayout(new GridLayout(1, false));
      
      TopComposite topComposite = new TopComposite(composite, SWT.BORDER);
      topComposite.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
      
      BottomComposite bottomComposite = new BottomComposite(composite, SWT.BORDER);
      bottomComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
 
  }
 
  @Override
  protected void checkSubclass() {
  }
 
}