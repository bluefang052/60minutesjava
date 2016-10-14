    public class Elevator {
        int currentFloor;
        int nextFloor;
        boolean isGoingUp;
        boolean isDoorOpen;
        
		Elevator (){
			this(0);			
		}
		
		Elevator (int currentFloor){
			System.out.println("Elevator constructor here !");
			setFloor(currentFloor);			
		}
        
        void goToFloor(int nextFloor) {
			System.out.println("The next floor is going to be : " + nextFloor + ".");
           	closeDoors();
            this.nextFloor = nextFloor;
            reportElevator();                        
            openDoors();            
            }  

		void openDoors() {
            this.isDoorOpen = true;
            System.out.println("The door is open.");
            }
        
        void closeDoors() {
            this.isDoorOpen = false;
            System.out.println("The door is closed.");
            }
        
        boolean IsDoorOpen() {
            return this.isDoorOpen;    
            }
        
        boolean goingUp() {
            System.out.println("Elevator is going Up.");
        	return this.isGoingUp;
            
            }
        
        boolean goingDown() {
            System.out.println("Elevator is going Down.");
            return this.isGoingUp;	
        }
        
        void reportElevator() {
            if(currentFloor < nextFloor) {
            	goingUp();
            	this.isGoingUp = true;                
            }
            
            else if(currentFloor > nextFloor) {
            	goingDown();
            	this.isGoingUp = false;	               
            }
            
            else{
            	System.out.println("Elevator not moving.");
                }			
		}
        void setFloor(int floor) {
        	this.currentFloor = floor;
			System.out.println("Current floor is " + floor + ".");
        }
        
    }
