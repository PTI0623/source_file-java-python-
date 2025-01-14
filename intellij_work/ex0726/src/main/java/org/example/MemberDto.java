package org.example;

public class MemberDto {
    private String name,pwd,email;

    @Override
    public String toString() {
        return "MemberDto{" +
                "name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public MemberDto(String name, String pwd, String email) {
        this.name = name;
        this.pwd = pwd;
        this.email = email;
    }
}
