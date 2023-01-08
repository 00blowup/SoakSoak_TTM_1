package com.soaksoak.ttm_1.letter;

public class LetterBasicDomain {

    /*
    필드
     */
    private Long id;            //ID
    private String title;       //제목
    private String src;         //발신인아이디
    private String dest;        //수신인아이디
    private String content;     //내용
    private Integer donation;   //후원금액

    /*
    생성자. 모든 필드가 필수 데이터이므로 모든 필드를 매개변수로 받음.
     */
    public LetterBasicDomain(Long id, String title, String src, String dest, String content, Integer donation) {
        this.id = id;
        this.title = title;
        this.src = src;
        this.dest = dest;
        this.content = content;
        this.donation = donation;
    }

    /*
    모든 필드의 getter, setter
     */

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public String getDest() {
        return dest;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getDonation() {
        return donation;
    }

    public void setDonation(Integer donation) {
        this.donation = donation;
    }



}
