package com.xxx.asus.meishijie.model;

import java.util.List;

/**
 * Created by asus on 2016/3/1.
 */
public class KnowLikeEntity {
    /**
     * code : 1
     * obj : {"customized":{"title":"猜你喜欢","time":"20:37为您更新","total":4,"data":[{"id":"192728","title":"杭州卤鸭","titlepic":"http://images.meishij.net/p/20110107/a51a112b1673b0e1f919d8faf15bb7d2_150x150.jpg","is_recipe":1},{"id":"612976","title":"麻辣烤鸡","titlepic":"http://site.meishij.net/r/188/125/2281438/a2281438_34018.jpg","is_recipe":1},{"id":"1638311","title":"青菜烧肉丸","titlepic":"http://site.meishij.net/r/147/198/4174647/a4174647_143556289135937.jpg","is_recipe":1},{"id":"611729","title":"烟熏三文鱼水波蛋","titlepic":"http://site.meishij.net/r/19/208/1364519/a1364519_27883.jpg","is_recipe":1},{"id":"612160","title":"杏仁贝果","titlepic":"http://site.meishij.net/r/17/110/2090017/a2090017_19638.jpg","is_recipe":1},{"id":"1664545","title":"杭州木须肉","titlepic":"http://site.meishij.net/r/238/152/2913238/a2913238_145567285283301.jpg","is_recipe":1},{"id":"1643588","title":"美式果缤纷","titlepic":"http://site.meishij.net/r/204/199/4487454/a4487454_143917694397126.jpg","is_recipe":1},{"id":"1615050","title":"河南烩面","titlepic":"http://site.meishij.net/r/41/203/113291/a113291_91498.jpg","is_recipe":1},{"id":"1658184","title":"红枣枸杞银耳羹（","titlepic":"http://site.meishij.net/r/72/184/4796072/a4796072_145066708295499.jpg","is_recipe":1},{"id":"611887","title":"蔓越莓玛格丽特饼","titlepic":"http://site.meishij.net/r/71/49/2824821/a2824821_34785.jpg","is_recipe":1},{"id":"1634023","title":"杭州素烧鹅","titlepic":"http://site.meishij.net/r/120/69/3829870/a3829870_143299693821489.jpg","is_recipe":1},{"id":"1620007","title":"辫子面包","titlepic":"http://site.meishij.net/r/52/75/2268802/a2268802_142217331094708.jpg","is_recipe":1},{"id":"610768","title":"椒盐鱼腩骨","titlepic":"http://site.meishij.net/r/205/47/1324455/a1324455_96833.jpg","is_recipe":1},{"id":"613864","title":"东北糖酥饼","titlepic":"http://site.meishij.net/r/177/03/1563427/a1563427_39372.jpg","is_recipe":1},{"id":"1658286","title":"粉蒸牛肉","titlepic":"http://site.meishij.net/r/86/218/4367086/a4367086_145071770856222.jpg","is_recipe":1},{"id":"1658195","title":"日式亲子盖饭","titlepic":"http://site.meishij.net/r/215/166/5041715/a5041715_145067470610028.jpg","is_recipe":1},{"id":"1643307","title":"松茸饭","titlepic":"http://site.meishij.net/r/169/14/66169/a66169_143893413228988.jpg","is_recipe":1},{"id":"1658262","title":"西芹香干","titlepic":"http://site.meishij.net/r/47/93/1210797/a1210797_145069753796889.jpg","is_recipe":1},{"id":"1658261","title":"10寸南瓜模具蛋糕","titlepic":"http://site.meishij.net/r/130/227/5119380/a5119380_145069740913157.jpg","is_recipe":1},{"id":"1658269","title":"手撕香葱面包","titlepic":"http://site.meishij.net/r/108/183/358358/a358358_145042462070088.jpg","is_recipe":1}]},"like_mem_key":"c6dba83944009870f3e61739e385a8b8"}
     */

    private String code;
    /**
     * customized : {"title":"猜你喜欢","time":"20:37为您更新","total":4,"data":[{"id":"192728","title":"杭州卤鸭","titlepic":"http://images.meishij.net/p/20110107/a51a112b1673b0e1f919d8faf15bb7d2_150x150.jpg","is_recipe":1},{"id":"612976","title":"麻辣烤鸡","titlepic":"http://site.meishij.net/r/188/125/2281438/a2281438_34018.jpg","is_recipe":1},{"id":"1638311","title":"青菜烧肉丸","titlepic":"http://site.meishij.net/r/147/198/4174647/a4174647_143556289135937.jpg","is_recipe":1},{"id":"611729","title":"烟熏三文鱼水波蛋","titlepic":"http://site.meishij.net/r/19/208/1364519/a1364519_27883.jpg","is_recipe":1},{"id":"612160","title":"杏仁贝果","titlepic":"http://site.meishij.net/r/17/110/2090017/a2090017_19638.jpg","is_recipe":1},{"id":"1664545","title":"杭州木须肉","titlepic":"http://site.meishij.net/r/238/152/2913238/a2913238_145567285283301.jpg","is_recipe":1},{"id":"1643588","title":"美式果缤纷","titlepic":"http://site.meishij.net/r/204/199/4487454/a4487454_143917694397126.jpg","is_recipe":1},{"id":"1615050","title":"河南烩面","titlepic":"http://site.meishij.net/r/41/203/113291/a113291_91498.jpg","is_recipe":1},{"id":"1658184","title":"红枣枸杞银耳羹（","titlepic":"http://site.meishij.net/r/72/184/4796072/a4796072_145066708295499.jpg","is_recipe":1},{"id":"611887","title":"蔓越莓玛格丽特饼","titlepic":"http://site.meishij.net/r/71/49/2824821/a2824821_34785.jpg","is_recipe":1},{"id":"1634023","title":"杭州素烧鹅","titlepic":"http://site.meishij.net/r/120/69/3829870/a3829870_143299693821489.jpg","is_recipe":1},{"id":"1620007","title":"辫子面包","titlepic":"http://site.meishij.net/r/52/75/2268802/a2268802_142217331094708.jpg","is_recipe":1},{"id":"610768","title":"椒盐鱼腩骨","titlepic":"http://site.meishij.net/r/205/47/1324455/a1324455_96833.jpg","is_recipe":1},{"id":"613864","title":"东北糖酥饼","titlepic":"http://site.meishij.net/r/177/03/1563427/a1563427_39372.jpg","is_recipe":1},{"id":"1658286","title":"粉蒸牛肉","titlepic":"http://site.meishij.net/r/86/218/4367086/a4367086_145071770856222.jpg","is_recipe":1},{"id":"1658195","title":"日式亲子盖饭","titlepic":"http://site.meishij.net/r/215/166/5041715/a5041715_145067470610028.jpg","is_recipe":1},{"id":"1643307","title":"松茸饭","titlepic":"http://site.meishij.net/r/169/14/66169/a66169_143893413228988.jpg","is_recipe":1},{"id":"1658262","title":"西芹香干","titlepic":"http://site.meishij.net/r/47/93/1210797/a1210797_145069753796889.jpg","is_recipe":1},{"id":"1658261","title":"10寸南瓜模具蛋糕","titlepic":"http://site.meishij.net/r/130/227/5119380/a5119380_145069740913157.jpg","is_recipe":1},{"id":"1658269","title":"手撕香葱面包","titlepic":"http://site.meishij.net/r/108/183/358358/a358358_145042462070088.jpg","is_recipe":1}]}
     * like_mem_key : c6dba83944009870f3e61739e385a8b8
     */

    private ObjEntity obj;

    public void setCode(String code) {
        this.code = code;
    }

    public void setObj(ObjEntity obj) {
        this.obj = obj;
    }

    public String getCode() {
        return code;
    }

    public ObjEntity getObj() {
        return obj;
    }

    public static class ObjEntity {
        /**
         * title : 猜你喜欢
         * time : 20:37为您更新
         * total : 4
         * data : [{"id":"192728","title":"杭州卤鸭","titlepic":"http://images.meishij.net/p/20110107/a51a112b1673b0e1f919d8faf15bb7d2_150x150.jpg","is_recipe":1},{"id":"612976","title":"麻辣烤鸡","titlepic":"http://site.meishij.net/r/188/125/2281438/a2281438_34018.jpg","is_recipe":1},{"id":"1638311","title":"青菜烧肉丸","titlepic":"http://site.meishij.net/r/147/198/4174647/a4174647_143556289135937.jpg","is_recipe":1},{"id":"611729","title":"烟熏三文鱼水波蛋","titlepic":"http://site.meishij.net/r/19/208/1364519/a1364519_27883.jpg","is_recipe":1},{"id":"612160","title":"杏仁贝果","titlepic":"http://site.meishij.net/r/17/110/2090017/a2090017_19638.jpg","is_recipe":1},{"id":"1664545","title":"杭州木须肉","titlepic":"http://site.meishij.net/r/238/152/2913238/a2913238_145567285283301.jpg","is_recipe":1},{"id":"1643588","title":"美式果缤纷","titlepic":"http://site.meishij.net/r/204/199/4487454/a4487454_143917694397126.jpg","is_recipe":1},{"id":"1615050","title":"河南烩面","titlepic":"http://site.meishij.net/r/41/203/113291/a113291_91498.jpg","is_recipe":1},{"id":"1658184","title":"红枣枸杞银耳羹（","titlepic":"http://site.meishij.net/r/72/184/4796072/a4796072_145066708295499.jpg","is_recipe":1},{"id":"611887","title":"蔓越莓玛格丽特饼","titlepic":"http://site.meishij.net/r/71/49/2824821/a2824821_34785.jpg","is_recipe":1},{"id":"1634023","title":"杭州素烧鹅","titlepic":"http://site.meishij.net/r/120/69/3829870/a3829870_143299693821489.jpg","is_recipe":1},{"id":"1620007","title":"辫子面包","titlepic":"http://site.meishij.net/r/52/75/2268802/a2268802_142217331094708.jpg","is_recipe":1},{"id":"610768","title":"椒盐鱼腩骨","titlepic":"http://site.meishij.net/r/205/47/1324455/a1324455_96833.jpg","is_recipe":1},{"id":"613864","title":"东北糖酥饼","titlepic":"http://site.meishij.net/r/177/03/1563427/a1563427_39372.jpg","is_recipe":1},{"id":"1658286","title":"粉蒸牛肉","titlepic":"http://site.meishij.net/r/86/218/4367086/a4367086_145071770856222.jpg","is_recipe":1},{"id":"1658195","title":"日式亲子盖饭","titlepic":"http://site.meishij.net/r/215/166/5041715/a5041715_145067470610028.jpg","is_recipe":1},{"id":"1643307","title":"松茸饭","titlepic":"http://site.meishij.net/r/169/14/66169/a66169_143893413228988.jpg","is_recipe":1},{"id":"1658262","title":"西芹香干","titlepic":"http://site.meishij.net/r/47/93/1210797/a1210797_145069753796889.jpg","is_recipe":1},{"id":"1658261","title":"10寸南瓜模具蛋糕","titlepic":"http://site.meishij.net/r/130/227/5119380/a5119380_145069740913157.jpg","is_recipe":1},{"id":"1658269","title":"手撕香葱面包","titlepic":"http://site.meishij.net/r/108/183/358358/a358358_145042462070088.jpg","is_recipe":1}]
         */

        private CustomizedEntity customized;
        private String like_mem_key;

        public void setCustomized(CustomizedEntity customized) {
            this.customized = customized;
        }

        public void setLike_mem_key(String like_mem_key) {
            this.like_mem_key = like_mem_key;
        }

        public CustomizedEntity getCustomized() {
            return customized;
        }

        public String getLike_mem_key() {
            return like_mem_key;
        }

        public static class CustomizedEntity {
            private String title;
            private String time;
            private int total;
            /**
             * id : 192728
             * title : 杭州卤鸭
             * titlepic : http://images.meishij.net/p/20110107/a51a112b1673b0e1f919d8faf15bb7d2_150x150.jpg
             * is_recipe : 1
             */

            private List<DataEntity> data;

            public void setTitle(String title) {
                this.title = title;
            }

            public void setTime(String time) {
                this.time = time;
            }

            public void setTotal(int total) {
                this.total = total;
            }

            public void setData(List<DataEntity> data) {
                this.data = data;
            }

            public String getTitle() {
                return title;
            }

            public String getTime() {
                return time;
            }

            public int getTotal() {
                return total;
            }

            public List<DataEntity> getData() {
                return data;
            }

            public static class DataEntity {
                private String id;
                private String title;
                private String titlepic;

                public void setId(String id) {
                    this.id = id;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public void setTitlepic(String titlepic) {
                    this.titlepic = titlepic;
                }

                public String getId() {
                    return id;
                }

                public String getTitle() {
                    return title;
                }

                public String getTitlepic() {
                    return titlepic;
                }
            }
        }
    }
}
