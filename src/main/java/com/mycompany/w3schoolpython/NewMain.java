/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.w3schoolpython;

import java.net.URL;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 *
 * @author user
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        Document doc=Jsoup.parse(new URL("https://www.w3school.com.cn/python/index.asp").openStream(), "utf-8", "https://www.w3school.com.cn");
        Element element=doc.getElementById("course");
        Elements links=element.select("a");
        for(int i=0; i<links.size(); i++){
            System.out.println(links.get(i).text()+":"+links.get(i).attr("abs:href"));
        }
    }
    
}
