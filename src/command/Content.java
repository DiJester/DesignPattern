package command;

class Content {
    private String cnt;
    public Content(String cnt){
        this.cnt = cnt;
    }
    public String toString(){
        return cnt;
    }
    public String getContent(){
        return cnt;
    }
    public void setContent(String cnt){
        this.cnt=cnt;
    }
    public int length(){
        return cnt.length();
    }
}
