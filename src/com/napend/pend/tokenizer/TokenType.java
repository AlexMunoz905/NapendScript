package com.napend.pend.tokenizer;

public enum TokenType {
	
	/** A token for example, ( ) - , **/

	//Absoultly nothing
	
	EMPTY,
	
	TOKEN,
	
	//First character is a letter, any proceeding characters are letters or numbers.
	IDENTIFIER,
	
	//A number
	INTEGER_LITERAL,
	
	//Anything enclosed in double quotes. "Hello" "1" 
	STRING_LITERAL
	

	
}
