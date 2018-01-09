package com.zguming.news.manager;
import android.content.Context;
import com.zguming.news.entity.News;
import com.zguming.news.retrofit.RetrofitHelper;
import com.zguming.news.retrofit.RetrofitService;

import io.reactivex.Observable;

/**
 * Created by win764-1 on 2016/12/12.
 */

public class DataManager {
    private RetrofitService mRetrofitService;
    public DataManager(){
        this.mRetrofitService = RetrofitHelper.getInstance().getServer();
    }
    public Observable<News> getNewsData(String channel, int start, int num, String appkey){
        return mRetrofitService.getNewsData(channel,start,num,appkey);
    }
}
