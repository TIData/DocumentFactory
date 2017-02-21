package domein;

public class StatisticsDocument implements Document {

	public void open() {
            System.out.println("Statistics document is open");
	}

	public void close() {
            System.out.println("Statistics document is closed");
	}

}