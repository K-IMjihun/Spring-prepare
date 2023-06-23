package com.sparta.springprepare;

import lombok.*;

@Getter
@Setter
//@AllArgsConstructor
//@NoArgsConstructor
@RequiredArgsConstructor
public class Memo {
    private final String username;
    private final String contents;
}

class Main {
    public static void main(String[] args) {
        Memo memo = new Memo("Robbie", "hi");
//        memo.setUsername("Robbie");
        System.out.println(memo.getUsername());
    }
}