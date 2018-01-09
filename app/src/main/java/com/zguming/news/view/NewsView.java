package com.zguming.news.view;


import com.zguming.news.entity.News;

/**
 * Created by win764-1 on 2016/12/12.
 */

public interface NewsView extends View {
    void onSuccess(News news);
    void onError(String result);
}
