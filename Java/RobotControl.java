import java.awt.AWTException;
import java.awt.GraphicsEnvironment;
import java.awt.MouseInfo;
import java.awt.PointerInfo;
import java.awt.Robot;
import java.io.File;
import java.io.IOException;


public class mouse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
			PointerInfo point = MouseInfo.getPointerInfo();
			System.out.println(point.getLocation());
		
			Robot robot = null;
			try {
				// Essa chamada � o que o construtor sem par�metros faz
				// internamente.
				robot = new Robot();//new Robot(GraphicsEnvironment.getLocalGraphicsEnvironment()
							//.getDefaultScreenDevice());
			} catch (AWTException e) {
				System.out.println("Erro ao criar o Rob�");
			}
			

				robot.mouseMove(700, 700);
				System.out.println(robot.getPixelColor(700, 700));
				
				java.awt.image.BufferedImage bf = robot.createScreenCapture(new java.awt.Rectangle(0, 0,
						1000, 1000));
				// Salvando a imagem
				try {
					javax.imageio.ImageIO.write(bf, "PNG", new File("C:/vaniomeurer.PNG"));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
	}

}
