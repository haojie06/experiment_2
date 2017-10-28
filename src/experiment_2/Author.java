package experiment_2;
//作者类
//作者信息 包括姓名（姓 lastname 和名 firstname 分开记录）、邮箱、所在单位（机构）
public class Author implements Comparable<Author> {
    private String lastname,firstname;
    private String mailbox;
    private String organization;
    private int citationCount;

    //不知道怎么让一个list 根据另一个list的顺序排序，只好暂时先 两边都采用引用数排序，排两次
    public int compareTo(Author o) {
        //return getCitationCount() - o.citationCount;
        if (this.getCitationCount() < o.citationCount) return 1;

        if (this.getCitationCount() > o.citationCount ) return -1;

        if (this.getCitationCount() == o.citationCount) return 0;

        return 0;

    }

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

    public void setCitationCount(int citationCount) {
        this.citationCount = citationCount;
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

    public int getCitationCount() {
        return citationCount;
    }
}
