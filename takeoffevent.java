event TakeOffClearance extends Event
{
	String airTrafficController;
	String runway;

	#posted as clearedForTakeOff(String atc, String rwy)
	{
		airTrafficController = atc;
		runway = rwy;
	}
}
