package jwp.model;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Objects;

public class Answer {
    private Long answerId;
    private Long questionId;
    private String author;
    private String contents;
    private Date createdDate;

    public Answer(Long questionId, String author, String contents) {
        this.answerId = 0L;
        this.questionId = questionId;
        this.author = author;
        this.contents = contents;
        this.createdDate = Date.valueOf(LocalDate.now());
    }

    public Long getAnswerId(){ return this.answerId;}
    public Long getQuestionId(){ return this.questionId;}
    public String getAuthor(){ return this.author;}
    public String getContents(){ return this.contents;}
    public Date getCreatedDate(){ return this.createdDate;}
    public void setAnswerId(Long aId){ this.answerId = aId;}

    public void updateContents(String contents) {
        this.contents = contents;
    }

    public void update(Answer answer) {
        this.answerId = answer.answerId;
        this.questionId = answer.questionId;
        this.author = answer.author;
        this.contents = answer.contents;
        this.createdDate = answer.createdDate;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Answer answer = (Answer) o;
        return getQuestionId() == answer.getQuestionId() && Objects.equals(getAuthor(), answer.getAuthor()) && Objects.equals(getContents(), answer.getContents()) && Objects.equals(getCreatedDate(), answer.getCreatedDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getQuestionId(), getAuthor(), getContents(), getCreatedDate());
    }

    @Override
    public String toString() {
        return "Answer{" +
                "answerId=" + answerId +
                ", questionId=" + questionId +
                ", author='" + author + '\'' +
                ", contents='" + contents + '\'' +
                ", createdDate=" + createdDate +
                '}';
    }
}
