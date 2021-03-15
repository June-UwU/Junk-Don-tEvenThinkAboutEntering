import java.awt.*;
import java.awt.event.*;

class prime implements ActionListener,KeyListener
{
    Frame f;
    Label one,two;
    TextField three,four;
    Button five;
    int i,t,j;
    String s1="";
    public prime()
    {
        f=new Frame("Prime Number");
        one=new Label("Enter the number");
        two=new Label("Prime  ");
        three=new TextField(5);
        four=new TextField(5);
        five=new Button("OK");
        f.setSize(400,400);
        f.setVisible(true);
        f.add(one);
        f.add(two);
        f.add(three);
        f.add(four);
        f.add(five);
        f.setLayout(null);
        one.setBounds(20,20,140,40);
        two.setBounds(20,80,140,40);
        three.setBounds(180,30,140,40);
        four.setBounds(180,85,140,40);
        five.setBounds(240,240,40,40);
        three.addKeyListener(this);
        five.addActionListener(this);
    }
    public void keyPressed(KeyEvent k)
    {
        System.out.print("");
    }
    public void keyTyped(KeyEvent k)
    {
        s1+= k.getKeyChar();
    }
    public void keyReleased(KeyEvent k)
    {
        System.out.print("");
    }
    public void actionPerformed(ActionEvent ae)
    {
        t=Integer.parseInt(s1);
        for(i=1;i<t;i++)
        {
            if((i*i)>t)
                break;
        }
        for(j=2;j<i;j++)
        {
            if((t%j)==0)
            {
                four.setText("false");
                break;
            }
            if(j==(i-1))
                four.setText("true");
        }
    }

    public static void main(String s[])
    {
        new prime();
    }
}
