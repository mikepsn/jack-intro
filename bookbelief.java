public beliefset BookData extends ClosedWorld
{
	#key field String title;
	#key field String author;
	#value field double price;

	#indexed query get(String t, String a, logical double p);
} 
