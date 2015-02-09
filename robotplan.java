plan MovementResponse extends Plan 
{ 
	#handles event RobotMoveEvent moveResponse; 
	#uses agent implementing RobotInterface robot; 

	static boolean relevant (RobotMoveQEvent ev) 
	{ 
		return (ev.ID == RobotMoveQEvent.REPLY_SAFE || ev.ID == RobotMoveQEvent.REPLY_DEAD); 
	} 

	body() 
	{ 
		if (moveResponse.ID==REPLAY_SAFE) 
		{ 	
                System.err.println("Robot Safe to Move"); 
                robot.updatePosition(moveResponse.Lane, moveResponse.Displacement); 
		} 
		else 
		{ 
			// robot didn't make it 	
			System.err.println("Robot is Dead"); 	
			robot.die(); 
		} 
	} 
}  
