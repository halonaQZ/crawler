package cn.edu.lnu.pojo;

/**
 * 评论回复内容
 */
public class Reply2Comment {

   private String user;
   private String content;
   private String replyDate;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getReplyDate() {
        return replyDate;
    }

    public void setReplyDate(String replyDate) {
        this.replyDate = replyDate;
    }

    @Override
    public String toString() {
        return "Reply2Comment{" +
                "user='" + user + '\'' +
                ", content='" + content + '\'' +
                ", replyDate='" + replyDate + '\'' +
                '}';
    }
}
