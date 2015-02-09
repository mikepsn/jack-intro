plan TakeOff extends Plan
{
	#handles event TakeOffClearance clearance;
	#reads data FuelLevel fuelLevel;

	static boolean relevant(TakeOffClearance toc)
	{
		return true;
	}

	context()
	{
		fuelLevel.get(“FULL-TANK”);
	}

	body()
	{
		. . . // put reasoning statements here
	}
}
