import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;

public class GUI extends Frame{
    private String s1= "",s2="";
    private TextField f1;
    private TextField f2;
    private JButton f3,button1;
    private String username2;
    private String password2;
    private boolean success=false;

    public class WindowLauncher extends WindowAdapter{
        public void windowClosing(WindowEvent e){
            System.exit(0);
        }
    }
    public class GUI_auth extends Frame{

        public GUI_auth() {
            setTitle("LOGGED IN");
            setSize(400, 200);
            setVisible(true);
            setLocation(400,200);
            setBackground(Color.green);
            setLayout(new FlowLayout());
            Panel panel2 = new Panel();
            button1 = new JButton("CLOSE");
            // b1.setBackground(Color.white);
            panel2.add(new Label("   you logged in: "));
            panel2.add(button1);
            setVisible(true);
            add(panel2);
            class ActionLauncher2 implements ActionListener{
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    System.exit(0);
                }
            }
            button1.addActionListener(new ActionLauncher2());
            addWindowListener(new WindowLauncher());
        }
    }

    public GUI(UserList userL){
        setTitle("Authentifizierung");
        setSize(600,200);
        setLocation(400,200);
        setVisible(true);
        setLayout(new FlowLayout());
        Panel panel = new Panel();
        panel.setLayout(new GridLayout(3,2,10,10));
        f1 = new TextField(" ",10);
        f2 = new TextField(" ",10);
        f3 = new JButton("LOG IN");
        f1.selectAll();
        panel.add(new Label("   username: "));
        panel.add(f1);
        f2.selectAll();
        panel.add(new Label("   password: "));
        panel.add(f2);
        panel.add(f3);
        add(panel);

        class ActionLauncher implements ActionListener{
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                f1.setEnabled(false);
                f2.setEnabled(false);

                username2 =f1.getText();
                password2 = f2.getText();

                success=false;
                for(int index=0; index<userL.size(); index++)
                {
                    String user = userL.get(index).getUserName();
                    String passi = userL.get(index).getPassword();

                    if(username2.equals(user) && password2.equals(passi))
                    {
                        success= true;
                        break;
                    }
                }

                if (success==true)
                {
                    System.out.println("Authentication Successful");
                    panel.setEnabled(false);
                    GUI_auth gui2 = new GUI_auth();
                    gui2.setVisible(true);
                }
                else
                {
                    System.out.println("Authentication Failed");
                    f3.setBackground(Color.red);
                    f3.setText("LOG IN AGAIN");
                    f1.setEnabled(true);
                    f2.setEnabled(true);

                }
            }
        }
        f3.addActionListener(new ActionLauncher());
        addWindowListener(new WindowLauncher());
        setVisible(true);
    }

}
