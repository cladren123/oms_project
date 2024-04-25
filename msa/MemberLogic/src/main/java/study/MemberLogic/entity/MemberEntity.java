package study.MemberLogic.entity;


import lombok.Data;

@Data
public class MemberEntity {

    private int seq;
    private String name;

    public MemberEntity() {
        super();
    }

    public MemberEntity(int seq, String name) {
        super();
        this.seq = seq;
        this.name = name;
    }



}
