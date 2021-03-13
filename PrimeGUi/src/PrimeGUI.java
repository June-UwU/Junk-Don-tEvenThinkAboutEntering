import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Layout
{
    Layout()
    {
        Wnd.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Wnd.setSize(width,height);
        Wnd.setLayout(new GridLayout(4,3));
    }
    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public JFrame getWnd() {
        return Wnd;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    private JFrame Wnd = new JFrame();
    private int height = 480;
    private int width = 720;
}

class Window implements ActionListener
{
    Window()
    {

        Label l1,l2,l3,l4,l6,l7,l8,l9,l10,l11;
        l1 = new Label();
        layout.getWnd().add(l1);
        l2 = new Label();
        layout.getWnd().add(l2);
        l3 = new Label();
        layout.getWnd().add(l3);
        l4 = new Label();
        layout.getWnd().add(l4);
        l5 = new TextField("no..?");
        layout.getWnd().add(l5);
        l6 = new Label();
        layout.getWnd().add(l6);
        l7 = new Label();
        layout.getWnd().add(l7);
        l8 = new Label();
        layout.getWnd().add(l8);
        l9 = new Label();
        layout.getWnd().add(l9);
        l10 = new Label();
        layout.getWnd().add(l10);
        l11 = new Label();
        layout.getWnd().add(l11);
        l12 = new Button("check");
        l12.addActionListener(this);
        layout.getWnd().add(l12);
        layout.getWnd().setVisible(true);

    }
    private Layout layout = new Layout();
    TextField l5 ;
    Button l12;
    public void actionPerformed(ActionEvent e)
    {
        usrname = l5.getText();
        int cond = Integer.parseInt(usrname);
        boolean check = true;
        for(int i = 2;i<10;i++)
        {
            if(cond%i == 0 && i != cond)
            {
                check = false;
                break;
            }
        }
        if(check)
        {
            JOptionPane.showMessageDialog(layout.getWnd(),"The number is palidrome");
        }
        else
        {
            JOptionPane.showMessageDialog(layout.getWnd(),"The number is not a palidrome");
        }
    }
    private String usrname = "null";
}
class PrimeGUI
{
    public static void main(String []args)
    {
        Window window = new Window();
    }
}
