import java.awt.BorderLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

public class Main extends JFrame {

	private static final long serialVersionUID = 1L;

	public Main() {
        init();
    }

    private void init() {
        setTitle("Java 2D Game");
        setSize(380, 540);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        PanelGame panelGame = new PanelGame();
        add(panelGame);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
                panelGame.start();
            }
        });
        
        
    }
    
    
    public static void main(String[] args) {
        Main main = new Main();
        main.setVisible(true);
    }
}