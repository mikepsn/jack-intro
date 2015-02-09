initialize-state();
repeat
	options := option-generator(event-queue);
	selected-options := deliberate(options);
	update-intentions(selected-options);
	execute();
	get-new-external-events();
	drop-successful-attitudes();
	drop-impossible-attitudes();
end repeat
