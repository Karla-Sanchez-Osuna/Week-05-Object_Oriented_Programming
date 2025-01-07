
public class App {

	public static void main(String[] args) {
		
		Logger log = new AsteriskLogger();
		log.log("Week five Coding Project");
		
		System.out.println("\n");
		
		log.error("Week five Coding Project");
		
		System.out.println("\n");

		Logger logger = new SpacedLogger();
		logger.log("Finished");
		
		System.out.println("\n");

		logger.error("Done!");
	}

}
