import java.awt.*;
import java.util.Random;
import javax.swing.*;

public class Loopy {

    private final Random rad = new Random();
    private final static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    private final int width = (int) screenSize.getWidth();
    private final int height = (int) screenSize.getHeight();

    public void Bl0K31M0() throws AWTException {
        Robot bot = new Robot();
        bot.mouseMove(rad.nextInt(width), rad.nextInt(height));
    }

    public void L0091() {
        JWindow win = new JWindow();
        JLabel label = new JLabel();
        label.setIcon(new ImageIcon("output.jpg"));
        win.add(label);
        win.setSize(255, 259);
        win.setLocation(rad.nextInt(width), rad.nextInt(height));
        win.setVisible(true);
    }

    public static void main(String[] args) throws AWTException {
        Loopy instance = new Loopy();

        while(true) //for (int i = 0; i < 8; i++)
        {
            instance.Bl0K31M0();
            instance.L0091();
        }
    }
}
