package com.example.demo;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.util.List;

@Document(indexName = "polls2")
public class Entity {

    @Id
    private String _id;

    @Field(type = FieldType.Nested, name = "option1")
    private Option option1;

    @Field(type = FieldType.Nested, name = "option2")
    private Option option2;

    @Field(type = FieldType.Nested, name = "option3")
    private Option option3;

    @Field(type = FieldType.Nested, name = "option4")
    private Option option4;

    @Field(type = FieldType.Text, name = "question")
    private String question;

    @Field(type = FieldType.Keyword, name = "tags")
    private List<String> tags;

    @Field(type = FieldType.Text, name = "mediaUrl")
    private String mediaUrl;

    @Field(type = FieldType.Text, name = "userUrl")
    private String userUrl;

    @Field(type = FieldType.Text, name = "extractedFrom")
    private String extractedFrom;

    @Field(type = FieldType.Keyword, name = "esUid")
    private String esUid;

    @Field(type = FieldType.Text, name = "time")
    private String time;

    @Field(type = FieldType.Integer, name = "totalInteraction")
    private int totalInteraction;

    // Getters and setters

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public Option getOption1() {
        return option1;
    }

    public void setOption1(Option option1) {
        this.option1 = option1;
    }

    public Option getOption2() {
        return option2;
    }

    public void setOption2(Option option2) {
        this.option2 = option2;
    }

    public Option getOption3() {
        return option3;
    }

    public void setOption3(Option option3) {
        this.option3 = option3;
    }

    public Option getOption4() {
        return option4;
    }

    public void setOption4(Option option4) {
        this.option4 = option4;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public String getMediaUrl() {
        return mediaUrl;
    }

    public void setMediaUrl(String mediaUrl) {
        this.mediaUrl = mediaUrl;
    }

    public String getUserUrl() {
        return userUrl;
    }

    public void setUserUrl(String userUrl) {
        this.userUrl = userUrl;
    }

    public String getExtractedFrom() {
        return extractedFrom;
    }

    public void setExtractedFrom(String extractedFrom) {
        this.extractedFrom = extractedFrom;
    }

    public String getEsUid() {
        return esUid;
    }

    public void setEsUid(String esUid) {
        this.esUid = esUid;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getTotalInteraction() {
        return totalInteraction;
    }

    public void setTotalInteraction(int totalInteraction) {
        this.totalInteraction = totalInteraction;
    }
}
