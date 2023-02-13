package WeitingGame_Synchronization_16;

public class Explicit_wait_Concept_2 {
	// (Question_1):
	// Explicit wait is a Highlevel wait Concept,
	// It is a Concept
	// It's Dynamic in nature
	// Not a Global wait
	// It can be applied for a Specific Element
	// It can be customised for a Specific Element as per use case
	// It can be applied for all non webElements also like :alert url title

	// (1).wait(I)
	// Q2:To Applied Explicit wait what are different things Available in selenium ?
	// A: WebDriverWait(C) extends ---->FluentWait(C) --->implements Wait(I)

	// wait(I) having only 1 method i.e until()
	// (2).FluentWait(C):
	// ---------------
	// (1).until ---is a overridden() method in wait(I)

	// (2).Individual class methods Of Fluent_wait :
	// (A).ignoring(),
	// (B).withMessage(),
	// (C).pollingEvery()

	// (3) webDrivertWait(C):
	// --------------------
	// (1). timeOutException() method -- 1 protected method Avalble in
	// webDrivertWait(C): ----Not much useful
	// these below methods are coming from fluentwait & wait
	// (1).until ---overridden the wait(I) until method
	// (2).Individual class methods Of Fluent_wait :
	// (A).ignoring(),
	// (B).withMessage(),
	// (C).pollingEvery()

	// (Question_2):- Is there any difference b/w fluent_wait & webDriver_wait??
	// A:As end user It's really doesn't matter either you are using fluent_wait(or)
	// webDriverwait
	public static void main(String[] args) {

	}
}
