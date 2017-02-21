package domein;

public class DrawingDocument implements Document {

	public void open() {
            System.out.println("Drawing document is open");
	}

	public void close() {
            System.out.println("Drawing document is closed");
	}

}