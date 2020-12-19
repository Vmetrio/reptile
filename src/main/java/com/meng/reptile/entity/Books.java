package com.meng.reptile.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Books {
    String bookurl;
    String imgurl;
    String bookname;
    String author;
    String detail;
}
