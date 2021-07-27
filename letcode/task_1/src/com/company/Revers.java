package com.company;

public class Revers {
    String str_to_revers_word;
    public Revers(String str){
        this.str_to_revers_word = str;
    }

    public String make(){
        var word_lst = this.str_to_revers_word.split(" ");
        for (int i=0; i<word_lst.length; i++){
            word_lst[i] = this.revers(word_lst[i]);
        }

        return String.join(" ", word_lst);
    }

    private String revers(String word){
        var index_end = word.length()-1;
        var index_start = 0;
        char[] char_init = word.toCharArray();

        while (index_end >= index_start){
            var tmp = char_init[index_start];
            char_init[index_start] = char_init[index_end];
            char_init[index_end] = tmp;
            index_end-=1;
            index_start+=1;
        }
        return String.valueOf(char_init);
    }
}
