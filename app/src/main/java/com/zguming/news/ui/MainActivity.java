package com.zguming.news.ui;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.widget.TextView;
import android.widget.Toast;
import com.jcodecraeer.xrecyclerview.ProgressStyle;
import com.jcodecraeer.xrecyclerview.XRecyclerView;
import com.zguming.n.R;
import com.zguming.news.adapter.MyAdapter;
import com.zguming.news.entity.News;
import com.zguming.news.presenter.NewsPresenter;
import com.zguming.news.view.NewsView;
import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    private NewsPresenter mNewsPresenter = new NewsPresenter();
    @BindView(R.id.news_rv)
    XRecyclerView recyclerView;
    @BindView(R.id.text)
    TextView text;
    MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mNewsPresenter.onCreate();
        mNewsPresenter.attachView(mNewsView);
        mNewsPresenter.getNewsData("新闻", 0, 20,"beba7be7334e27c0");
        LinearLayoutManager xLinearLayoutManager = new LinearLayoutManager(this);
        //xLinearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(xLinearLayoutManager);
        recyclerView.setRefreshProgressStyle(ProgressStyle.BallZigZag); //设定下拉刷新样式
        recyclerView.setLoadingMoreProgressStyle(ProgressStyle.BallZigZag);//设定上拉加载样式
        //recyclerView.setArrowImageView(R.drawable.qwe);     //设定下拉刷新显示图片（不必须）
        initData();   //初始化数据
        //adapter=new MyAdapter(this, News.ResultBean.getList());
        //recyclerView.setAdapter(adapter);
        /**
         *设定下拉刷新和上拉加载监听
         */
        recyclerView.setLoadingListener(new XRecyclerView.LoadingListener() {
            //上拉加载监听
            @Override
            public void onLoadMore() {
                addData();  //上拉加载添加数据
                recyclerView.loadMoreComplete();    //加载数据完成（取消加载动画）
            }
            //下拉刷新监听
            @Override
            public void onRefresh() {
                initData();     //初始化数据
                adapter.notifyDataSetChanged();
                recyclerView.refreshComplete();     //刷新数据完成（取消刷新动画）
            }
        });
    }
    /**
     *上拉加载添加数据
     */
    private void addData() {

        adapter.notifyDataSetChanged();
    }
    /**
     *初始化数据
     */
    private void initData() {
        //News.ResultBean.getList().clear();

    }
    private NewsView mNewsView = new NewsView() {
        @Override
        public void onSuccess(News mNews) {
            text.setText("我是");
            adapter=new MyAdapter(MainActivity.this, mNews.getResult().getList());
            recyclerView.setAdapter(adapter);
        }

        @Override
        public void onError(String result) {
            Toast.makeText(MainActivity.this,result, Toast.LENGTH_SHORT).show();
        }
    };
    @Override
    protected void onDestroy(){
        super.onDestroy();
        mNewsPresenter.onStop();
    }
}
