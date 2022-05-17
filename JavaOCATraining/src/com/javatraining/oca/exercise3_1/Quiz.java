package com.javatraining.oca.exercise3_1;
/**
Write a program to grade a short multiple-choice quiz. The correct answers for the
quiz are
1. C 5. B
2. A 6. C
3. B 7. C
4. D 8. A
Assume that the passing marks are at least 5 out of 8. 
The program stores the correct answers in an array. 
The submitted answers are specified as program arguments. 
Let X represent a question that was not answered on the quiz. 
Use an enum type to represent the result of answering a question.
Example of running the program:
Click here to view code image
>java QuizGrader C B B D B C A X
Question Submitted Ans. Correct Ans. Result
1 C C CORRECT
2 B A WRONG
3 B B CORRECT
4 D D CORRECT
5 B B CORRECT
6 C C CORRECT
7 A C WRONG
8 X A UNANSWERED
No. of correct answers: 5
No. of wrong answers: 2
No. of questions unanswered: 1
The candidate PASSED.
*/

public class Quiz {

	final static char[] ANS = new char[] {'C', 'A', 'B', 'D', 'B', 'C', 'C', 'A'};
	
	public static void main(String[] args) {
		ResultTable[] table =  new ResultTable[args.length];
		
		for(int i=0; i<args.length; i++) {
			table[i] = new ResultTable();
			
			table[i].srNo = i;
			table[i].cAns = ANS[i];
			table[i].sAns = args[i].charAt(0);
			
			if(ANS[i] == args[i].charAt(0)) {
				table[i].result = Result.CORRECT;
			}else if(args[i].charAt(0) == 'X') {
				table[i].result = Result.UNANSWERED;
			}else {
				table[i].result = Result.WRONG;	
			}
		}
		
		for(ResultTable r: table) {
			System.out.println(r.srNo + "\t" + r.sAns + "\t" + r.cAns 
					+ "\t" + r.result);
		}
	}
	
	static class ResultTable{
		int srNo;
		char sAns;
		char cAns;
		Result result;
	}
}
