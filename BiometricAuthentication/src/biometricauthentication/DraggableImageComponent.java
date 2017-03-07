    /*
    * To change this license header, choose License Headers in Project Properties.
    * To change this template file, choose Tools | Templates
    * and open the template in the editor.
    */
    package biometricauthentication;

    import java.awt.Color;
    import java.awt.Dimension;
    import java.awt.Graphics;
    import java.awt.Graphics2D;
    import java.awt.Image;
    import java.awt.image.ImageObserver;

    /**
    *
    * @author Lahiru
    */
    public class DraggableImageComponent extends DraggableComponent implements ImageObserver{

     protected Image image;
    private boolean autoSize = false;
    private Dimension autoSizeDimension = new Dimension(0, 0);

    public DraggableImageComponent() {
        super();
        setLayout(null);
        setBackground(Color.black);
    }

    @Override
    protected void paintComponent(Graphics g) {
       Graphics2D g2d = (Graphics2D) g;
       g2d.clearRect(0, 0, getWidth(), getHeight());
       if (image != null) {
           setAutoSizeDimension();
           g2d.drawImage(image, 0, 0, getWidth(), getHeight(), this);
       } else {
           g2d.setColor(getBackground());
           g2d.fillRect(0, 0, getWidth(), getHeight());
       }
    }

    private void setAutoSizeDimension() {    }  

    private Dimension adaptDimension(Dimension source, Dimension dest) { return null;    }

    public boolean imageUpdate(Image img, int infoflags, int x, int y, int w, int h) {
       if (infoflags == ALLBITS) {
           repaint();
           setAutoSizeDimension();
           return false;
       }
       return true;
    }
    }
