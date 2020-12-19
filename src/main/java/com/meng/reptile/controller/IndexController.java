package com.meng.reptile.controller;

import com.meng.reptile.entity.Books;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

@RestController
public class IndexController {

    @GetMapping("/reptile")
    public List<Books> Index() throws Exception {
        //获取url请求
        String url = "https://book.douban.com/latest?icn=index-latestbook-all";
        //解析网页,Jsoup返回的是Document对象（浏览器Document对象）
        Document document = Jsoup.parse(new URL(url), 30000);
        //所有在js中使用的方法，这里都能使用
        Element element = document.getElementById("content");
        //在获得网页内容后，获取所有的li标签
        Elements elements = element.getElementsByTag("li");

        ArrayList<Books> booksList = new ArrayList<Books>();

        //获取元素的标签后，再获取标签中的内容
        for (Element el : elements) {
            String bookurl = el.getElementsByClass("cover").attr("href");
            String imgurl = el.getElementsByTag("img").attr("src");
            String bookname = el.getElementsByTag("h2").eq(0).text();
            String author = el.getElementsByClass("color-gray").eq(0).text();
            String detail = el.getElementsByClass("detail").eq(0).text();

            Books books = new Books();
            books.setBookurl(bookurl);
            books.setImgurl(imgurl);
            books.setBookname(bookname);
            books.setAuthor(author);
            books.setDetail(detail);
            booksList.add(books);
        }
        return booksList;
    }
}
