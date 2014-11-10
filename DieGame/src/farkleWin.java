import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Panel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.AbstractAction;
import javax.swing.Action;


public class farkleWin extends JFrame {
	farkle theGame = new farkle();
	public farkleWin() {
		getContentPane().setLayout(null);
		
		JLabel lblLetsPlayFarkle = new JLabel("Let's Play Farkle");
		lblLetsPlayFarkle.setHorizontalAlignment(SwingConstants.CENTER);
		lblLetsPlayFarkle.setBounds(125, 36, 200, 50);
		getContentPane().add(lblLetsPlayFarkle);
		
		JButton btnPlay = new JButton("Play");
		btnPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			//theGame.newGame();
			}
			
			
		});
		btnPlay.setAction(action);
		btnPlay.setBounds(125, 119, 200, 50);
		getContentPane().add(btnPlay);
		
		JButton btnHowToPlay = new JButton("How To Play");
		btnHowToPlay.setBounds(125, 175, 200, 50);
		getContentPane().add(btnHowToPlay);
	}

	private JPanel contentPane;
	private final Action action = new SwingAction();

	public static void main(String[] args) {
		
		
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
	private class SwingAction_1 extends AbstractAction {
		public SwingAction_1() {
			putValue(NAME, "SwingAction_1");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
