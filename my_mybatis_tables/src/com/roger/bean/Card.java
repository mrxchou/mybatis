package com.roger.bean;

/**
 * @ClassName: Card
 * @Author Administrator
 * @Date 2021/1/11 14:43
 * @Description:
 * @Version 1.0
 */
public class Card {
    private Integer id; //主键id
    private String number;  //身份证号

    public Card() {
    }

    public Card(Integer id, String number) {
        this.id = id;
        this.number = number;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Card{" +
                "id=" + id +
                ", number='" + number + '\'' +
                '}';
    }
}
