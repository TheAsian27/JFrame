import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class J extends JFrame implements KeyListener, MouseListener {
	private JLabel hello, pbjTime;
	private JPanel grid;
	private boolean yes = false;
	private BufferedImage animeGrill, banana;

	private final int ROWS = 10, COLS = 10;
	private thing things[][] = new thing[ROWS][COLS];

	public static void main(String args[]) throws IOException {
		new J();
	}

	public J() throws IOException {
		super("JFrame Stuff");
		addMouseListener(this);
		addKeyListener(this);
		this.setLayout(null);

		grid = new JPanel();
		grid.setLayout(new GridLayout(ROWS, COLS));

		for (int r = 0; r < ROWS; r++) {
			for (int c = 0; c < COLS; c++) {
				things[r][c] = new thing();

				if ((r + c) % 2 == 0)
					things[r][c].setBackground(Color.white);
				grid.add(things[r][c]);
			}
		}

		animeGrill = ImageIO.read(new File("./src/animegirl.png"));
		banana = ImageIO.read(new File("./src/download (1).jfif"));
		hello = new JLabel(new ImageIcon(animeGrill));
		pbjTime = new JLabel(new ImageIcon(banana));
		hello.setBounds(50, 50, 300, 300);
		pbjTime.setBounds(1000, 300, 150, 150);
		grid.setBounds(600, 300, 600, 600);
		// this.setSize(1000, 500);
		// this.setLocationRelativeTo(null);

		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.getContentPane().setBackground(Color.PINK);
		this.add(grid);
		// pbjTime.setLocation(pbjTime.getX() + 200, pbjTime.getY());
		this.add(pbjTime);
		this.add(hello);
		this.setVisible(true);
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		int code = arg0.getKeyCode();
		switch (code) {
		case KeyEvent.VK_LEFT:
			hello.setLocation(hello.getX() - 10, hello.getY());
			break;
		case KeyEvent.VK_RIGHT:
			hello.setLocation(hello.getX() + 10, hello.getY());
			break;
		case KeyEvent.VK_DOWN:
			hello.setLocation(hello.getX(), hello.getY() + 10);
			break;
		case KeyEvent.VK_UP:
			hello.setLocation(hello.getX(), hello.getY() - 10);
			break;
		}
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}
}
