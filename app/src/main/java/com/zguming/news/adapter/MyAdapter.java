package com.zguming.news.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.zguming.n.R;
import com.zguming.news.entity.News;
import java.util.List;
import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Administrator on 2017/12/26.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    private List<News.ResultBean.ListBean> data;
    private Context mContext;
    static class MyViewHolder extends RecyclerView.ViewHolder{
        @BindView(R.id.news_pic)
        ImageView newsPic;
        @BindView(R.id.news_title)
        TextView newsTitle;
        @BindView(R.id.news_src)
        TextView newsSrc;
        @BindView(R.id.news_time)
        TextView newsTime;
        public MyViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }

    public MyAdapter(Context mContext, List<News.ResultBean.ListBean> data) {
        this.mContext = mContext;
        this.data=data;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.listview_item,null);
        MyViewHolder myViewHolder=new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        News.ResultBean.ListBean news=data.get(position);
        holder.newsTitle.setText(news.getTitle());
        holder.newsSrc.setText(news.getSrc());
        holder.newsTime.setText(news.getTime());
        Glide.with(mContext).load(news.getPic())
                .override(160, 110)
                .centerCrop()
                .into(holder.newsPic);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}