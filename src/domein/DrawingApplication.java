package domein;

public class DrawingApplication extends Application {

	protected Document createDocument() {
		// TODO - implement DrawingApplication.createDocument
		return new DrawingDocument();
	}

}