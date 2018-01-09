package com.zguming.news.retrofit;
import com.zguming.news.entity.News;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;


public interface RetrofitService {
    @GET("news/get")
    Observable<News> getNewsData(@Query("channel") String channel,
                                 @Query("start") int start,
                                 @Query("num") int num,
                                 @Query("appkey") String appkey);


}
