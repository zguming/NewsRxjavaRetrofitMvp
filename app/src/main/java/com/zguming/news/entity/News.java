package com.zguming.news.entity;

import java.util.List;

/**
 * Created by Administrator on 2017/12/26.
 */

public class News {

    /**
     * status : 0
     * msg : ok
     * result : {"channel":"新闻","num":"1","list":[{"title":"男粉丝冲上台熊抱土耳其总统 令其措手不及(视频)","time":"2017-12-26 16:23","src":"澎湃新闻","category":"news","pic":"","content":" 原标题：疯狂男粉丝送熊抱，土耳其总统吓一跳<\/p>  当地时间12月24日，土耳其总统埃尔多安在一场活动现场遭遇疯狂粉丝熊抱。一名男子趁埃尔多安上台与观众打招呼时冲向埃尔多安，试图紧紧抱住他，令其措手不及。<\/p>","url":"http://news.sina.cn/gj/2017-12-26/detail-ifypyuvc3721119.d.html?cre=tianyi&mod=wnews&loc=8&r=25&doct=0&rfunc=100&tj=none&tr=25","weburl":"http://news.sina.com.cn/w/zx/2017-12-26/doc-ifypyuvc3721119.shtml"}]}
     */

    private String status;
    private String msg;
    private ResultBean result;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public class ResultBean {
        /**
         * channel : 新闻
         * num : 1
         * list : [{"title":"男粉丝冲上台熊抱土耳其总统 令其措手不及(视频)","time":"2017-12-26 16:23","src":"澎湃新闻","category":"news","pic":"","content":" 原标题：疯狂男粉丝送熊抱，土耳其总统吓一跳<\/p>  当地时间12月24日，土耳其总统埃尔多安在一场活动现场遭遇疯狂粉丝熊抱。一名男子趁埃尔多安上台与观众打招呼时冲向埃尔多安，试图紧紧抱住他，令其措手不及。<\/p>","url":"http://news.sina.cn/gj/2017-12-26/detail-ifypyuvc3721119.d.html?cre=tianyi&mod=wnews&loc=8&r=25&doct=0&rfunc=100&tj=none&tr=25","weburl":"http://news.sina.com.cn/w/zx/2017-12-26/doc-ifypyuvc3721119.shtml"}]
         */

        private String channel;
        private String num;
        private  List<ListBean> list;

        public String getChannel() {
            return channel;
        }

        public void setChannel(String channel) {
            this.channel = channel;
        }

        public String getNum() {
            return num;
        }

        public void setNum(String num) {
            this.num = num;
        }

        public  List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public  class ListBean {
            /**
             * title : 男粉丝冲上台熊抱土耳其总统 令其措手不及(视频)
             * time : 2017-12-26 16:23
             * src : 澎湃新闻
             * category : news
             * pic :
             * content :  原标题：疯狂男粉丝送熊抱，土耳其总统吓一跳</p>  当地时间12月24日，土耳其总统埃尔多安在一场活动现场遭遇疯狂粉丝熊抱。一名男子趁埃尔多安上台与观众打招呼时冲向埃尔多安，试图紧紧抱住他，令其措手不及。</p>
             * url : http://news.sina.cn/gj/2017-12-26/detail-ifypyuvc3721119.d.html?cre=tianyi&mod=wnews&loc=8&r=25&doct=0&rfunc=100&tj=none&tr=25
             * weburl : http://news.sina.com.cn/w/zx/2017-12-26/doc-ifypyuvc3721119.shtml
             */

            private String title;
            private String time;
            private String src;
            private String category;
            private String pic;
            private String content;
            private String url;
            private String weburl;

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }

            public String getSrc() {
                return src;
            }

            public void setSrc(String src) {
                this.src = src;
            }

            public String getCategory() {
                return category;
            }

            public void setCategory(String category) {
                this.category = category;
            }

            public String getPic() {
                return pic;
            }

            public void setPic(String pic) {
                this.pic = pic;
            }

            public String getContent() {
                return content;
            }

            public void setContent(String content) {
                this.content = content;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getWeburl() {
                return weburl;
            }

            public void setWeburl(String weburl) {
                this.weburl = weburl;
            }
        }
    }
}
