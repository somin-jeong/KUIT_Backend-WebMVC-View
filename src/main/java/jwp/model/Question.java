package jwp.model;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Objects;

public class Question {
    private Long questionId;
    private String author;
    private String title;
    private String contents;
    private Date createdDate;
    private int countOfAnswer;

    public Question(String author, String title, String contents) {
        this.questionId = 0L;
        this.author = author;
        this.title = title;
        this.contents = contents;
        this.createdDate = Date.valueOf(LocalDate.now());
        this.countOfAnswer = 0;
    }

    public Long getQuestionId(){ return this.questionId;}
    public String getAuthor(){ return this.author;}
    public String getTitle(){ return this.title;}
    public String getContents(){ return this.contents;}
    public Date getCreatedDate(){ return this.createdDate;}
    public int getCountOfAnswer() {return this.countOfAnswer;}
    public void setQuestionId(Long qId){ this.questionId = qId;}

    public void increaseCountOfAnswer() {
        countOfAnswer += 1;
    }

    public void decreaseCountOfAnswer() {
        countOfAnswer -= 1;
    }

    public void updateTitleAndContents(String title, String contents) {
        this.title = title;
        this.contents = contents;
    }

    public void update(Question question) {
        this.questionId = question.questionId;
        this.author = question.author;
        this.title = question.title;
        this.contents = question.contents;
        this.createdDate = question.createdDate;
        this.countOfAnswer = question.countOfAnswer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Question question = (Question) o;
        return getCountOfAnswer() == question.getCountOfAnswer() && Objects.equals(getAuthor(), question.getAuthor()) && Objects.equals(getTitle(), question.getTitle()) && Objects.equals(getContents(), question.getContents());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAuthor(), getTitle(), getContents(), getCountOfAnswer());
    }

    @Override
    public String toString() {
        return "Question{" +
                "questionId=" + questionId +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", contents='" + contents + '\'' +
                ", createdDate=" + createdDate +
                ", countOfAnswer=" + countOfAnswer +
                '}';
    }
}
