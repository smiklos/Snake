import java.awt.Color;
import java.util.ArrayList;

public class DataOfSquare {

	// ArrayList that'll contain the colors
	public static final ArrayList<Color> COLORS = new ArrayList<Color>();

	// Lets add the color to the arrayList
	static {
		COLORS.add(Color.darkGray);// 0
		COLORS.add(Color.BLUE); // 1
		COLORS.add(Color.white); // 2
	}

	private SquarePanel square;

	public DataOfSquare(int color) {
		square = new SquarePanel(COLORS.get(color));
	}

	public void lightMeUp(int c) {
		square.ChangeColor(COLORS.get(c));
	}

	public SquarePanel getSquare() {
		return square;
	}
}
