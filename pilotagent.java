agent Pilot extends Agent
{
	#private data Position myPosition;
	#private data Position airportPosition;
	#private data FuelLevel fuelRemaining;

	#handles event TakeOffClearance clearedForTakeOff;
	#posts event StormDetected detectedStorm;
	#sends event RequestLanding landingRequest;

	#uses plan TakeOff;
	#uses plan Cruise;
	#uses plan LandAircraft;
	#uses plan AvoidStorm;

	#has capability EmergencyLanding elanding;

	Pilot(String name)
	{
		super(name);
		... 
    }
}
