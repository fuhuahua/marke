package com.marke.marketmaker.webmagic;

import org.jsoup.Connection;
import us.codecraft.webmagic.ResultItems;
import us.codecraft.webmagic.Task;
import us.codecraft.webmagic.pipeline.Pipeline;

/**
 * @author huxingkong
 * @date 2019/8/11 9:14 PM
 */
public class HuobiPipeline implements Pipeline {


    @Override
    public void process(ResultItems resultItems, Task task) {

        Connection.Response response = resultItems.get("result");

    }
}
