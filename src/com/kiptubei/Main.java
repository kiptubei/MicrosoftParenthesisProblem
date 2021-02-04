/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kiptubei;

/**
 *
 * @author kiptubei
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Solution sol =  new Solution();
        
        String input_str1 = "{{}}()[()]";
        String input_str2 = "(][)";
        String input_str3 = ")";
        sol.solution(input_str1);
        sol.solution(input_str2);
        sol.solution(input_str3);
    }

}
