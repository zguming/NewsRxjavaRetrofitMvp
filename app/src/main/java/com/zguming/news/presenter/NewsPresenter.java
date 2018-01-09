package com.zguming.news.presenter;

import android.content.Intent;


import com.zguming.news.entity.News;
import com.zguming.news.manager.DataManager;
import com.zguming.news.view.NewsView;
import com.zguming.news.view.View;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;


/**
 * Created by win764-1 on 2016/12/12.
 */

public class NewsPresenter implements Presenter {
    private DataManager manager;
    private NewsView mNewsView;
    private News mNews;
    public NewsPresenter(){

    }
    @Override
    public void onCreate() {
        manager = new DataManager();
    }

    @Override
    public void onStart() {

    }

    @Override
    public void onStop() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void attachView(View view) {
        mNewsView = (NewsView)view;
    }

    @Override
    public void attachIncomingIntent(Intent intetn) {
}
    public void getNewsData(String channel,int start,int num,String appkey){
        manager.getNewsData(channel,start,num,appkey)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<News>() {

                    @Override
                    public void onComplete() {
                        if (mNews != null){
                            mNewsView.onSuccess(mNews);
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                        e.printStackTrace();
                        mNewsView.onError("请求失败！！");
                    }

                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(News news) {
                        mNews = news;
                    }
                });

    }
}
