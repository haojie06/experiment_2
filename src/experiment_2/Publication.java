package experiment_2;
//文献类
    /*文献一般分为两类，在期刊（Journal）上发表的称为 Article，
而在会议文集（Proceeding）上发表的称为 ConferencePaper。期刊的出版频率
有一年一刊至一月一刊不等，每一刊都有相应的刊号。而会议文章则有所不同，
并无刊号，只需记录完整的会议文集名称。
*/
//期刊：作者（年份）标题，期刊名，刊号，页码
//会议：作者（年份）标题，会议文集名，页码
public class Publication {
    static int pubCount;
    private int year;
    //标题
    private String headLine,pubNumber,page;
    //书的种类，用于输入与输出时确认参数
    int type;
    //ARTICLE 与 CONFERENCE 特有 期刊名与会议文集名
    private String artName,conName;


    //setter


    public void setYear(int year) {
        this.year = year;
    }

    public void setPubNumber(String pubNumber) {
        this.pubNumber = pubNumber;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public void setArtName(String artName) {
        this.artName = artName;
    }

    public void setConName(String conName) {
        this.conName = conName;
    }

    public void setHeadLine(String headLine) {
        this.headLine = headLine;
    }

    //getter

    public int getYear() {
        return year;
    }

    public String getPubNumber() {
        return pubNumber;
    }

    public String getPage() {
        return page;
    }

    public String getArtName() {
        return artName;
    }

    public String getConName() {
        return conName;
    }

    public String getHeadLine() {
        return headLine;
    }
}
