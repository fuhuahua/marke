package com.marke.marketmaker.webmagic;

import com.marke.marketmaker.utils.HttpUtil;
import org.jsoup.Connection;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.processor.PageProcessor;

import java.io.IOException;

/**
 * @author huxingkong
 * @date 2019/8/11 9:05 PM
 */
public class HuobiProcessor implements PageProcessor {

    private Site site = Site.me()
            .setDomain("huobi.com")
            .setSleepTime(100)
            .setUserAgent("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_10_5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.116 Safari/537.36");

    @Override
    public void process(Page page) {
        try {
            Connection.Response response =  HttpUtil.get("https://api.huobi.br.com/market/history/trade?symbol=ethusdt&size=2");
            page.putField("result",response);
        }catch (IOException e){
            e.printStackTrace();
        }

    }

    @Override
    public Site getSite() {
        return null;
    }


    public static void main(String[] args) {
        Spider spider = Spider.create(new HuobiProcessor());
        spider.addUrl("https://api.huobi.br.com/market/history/trade?symbol=ethusdt&size=2");
        spider.thread(5);
        spider.setExitWhenComplete(true);
        spider.start();
    }
}
