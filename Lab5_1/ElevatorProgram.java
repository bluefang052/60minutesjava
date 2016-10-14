public class ElevatorProgram {

    public static void main(String[] args) {
        boolean isMissingData = false;
		if (args.length < 1) {
	        System.out.println("Missing Current floor.");
			isMissingData = true;
		}
        if (args.length < 2) {
		    System.out.println("Missing next floor.");
			isMissingData = true;
	    }
		if (isMissingData) {
		    return;
		}
        Elevator elevator= new Elevator(Integer.parseInt(args[0]));
        elevator.goToFloor(Integer.parseInt(args[1]));
    }

}
