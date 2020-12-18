package com.community.Amanda.entity;

public class Page {
    private int current = 1;
    private int limit = 10;
    private int sum = 0;
    private String path;
    public int getoffset(){
        return (current-1)*limit;
    }
    public int getTotal(){
        if (sum%limit==0)
            return sum/limit;
        else{
            return sum/limit +1;
        }
    }
    public int getFrom(){
        int from = current-2;
        return from<1?1:from;
    }
    public int getTo(){
        int to = current+2;
        int total = getTotal();
        return to>total?total:to;

    }
    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        if (current>=1)
            this.current = current;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        if (limit>=1&&limit<=100)
            this.limit = limit;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        if (sum>=0)
            this.sum = sum;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Page() {
    }

    public Page(int current, int limit, int sum, String path) {
        this.current = current;
        this.limit = limit;
        this.sum = sum;
        this.path = path;
    }

    @Override
    public String toString() {
        return "Page{" +
                "current=" + current +
                ", limit=" + limit +
                ", sum=" + sum +
                ", path='" + path + '\'' +
                '}';
    }
}
