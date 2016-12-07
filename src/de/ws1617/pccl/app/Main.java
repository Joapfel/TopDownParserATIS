package de.ws1617.pccl.app;

import java.io.IOException;
import java.util.HashSet;

import de.ws1617.pccl.grammar.*;

public class Main {

	public static void main(String[] args) {

		try {
			Grammar grammar = GrammarUtils.readGrammar(args[0]);
			Lexicon lexicon = GrammarUtils.readLexicon(args[1]);
			NonTerminal startSymbol = new NonTerminal(args[2]);
			String input = args[3];

			// TODO implement me !
			
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
