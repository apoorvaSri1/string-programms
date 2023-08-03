package com.jsp.allstringprog;

import java.util.Stack;

public class BalancedString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str="hello{ja[v(a)dev]el}oper";
        System.out.println(isBalanced(str));
	}
	
	static boolean Pair(char c1, char c2) {
		if((c1=='('&& c2==')')|| (c1=='{'&&c2=='}')||(c1=='['&&c2==']')) return true;
		return false;
	}
	
	static boolean isBalanced(String s) {
		Stack<Character> stack= new Stack<>();
		for(int i=0;i<=s.length();i++) {
		char c=s.charAt(i);
		if(c=='('||c=='{'||c=='[') stack.push(c);
		else if(c==')'||c=='}'||c==']') {
			if(stack.isEmpty()||!Pair(stack.pop(),c)) return false;
		}		
	}
		return stack.isEmpty();
	}
}
