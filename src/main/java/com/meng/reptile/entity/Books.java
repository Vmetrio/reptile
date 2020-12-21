package com.meng.reptile.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "books", schema = "douban")
public class Books {

    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Id
    private Integer id;

    @Column(name="bookurl", columnDefinition="varchar(200) COMMENT '书的链接'")
    private String bookurl;

    @Column(name="imgurl", columnDefinition="varchar(200) COMMENT '书的封面链接'")
    private String imgurl;

    @Column(name="bookname", columnDefinition="varchar(100) COMMENT '书的名称'")
    private String bookname;

//    @Column(name="bookurl", columnDefinition="varchar(200) COMMENT '书的作者'")
//    private String author;

    @Column(name="detail", columnDefinition="varchar(200) COMMENT '书的详情'")
    private String detail;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="inputtime")//创建时间
    private Date inputtime;
}
