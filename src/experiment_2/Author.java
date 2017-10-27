package experiment_2;
//作者类
//作者信息 包括姓名（姓 lastname 和名 firstname 分开记录）、邮箱、所在单位（机构）
public class Author {
    private String lastname,firstname;
    private String mailbox;
    private String organization;

    //setter
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setMailbox(String mailbox) {
        this.mailbox = mailbox;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    //getter

    public String getLastname() {
        return lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getMailbox() {
        return mailbox;
    }

    public String getOrganization() {
        return organization;
    }
}
