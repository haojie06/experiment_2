package experiment_2;
import java.util.*;
//文献库类
public class Library {


    public static void main(String[] args) {

        Scanner cho = new Scanner(System.in);
        ArrayList<Author> authorlist = new ArrayList<Author>(); //放的位置
        ArrayList<Publication> publist = new ArrayList<Publication>();
        Publication.pubCount = 0;
        System.out.println("文献管理系统V1");
        while (true) {
            System.out.println("1，添加文献记录 2，查找文献  3,以APA格式打印所有的文献");
            int choice = 0;
            //文献索引及list长度
            int index, length;
            do {
                System.out.printf("请输入您的选择:");
                choice = cho.nextInt();
            } while ((choice != 1) && (choice != 2) && (choice != 3) && (choice != 4));


            switch (choice) {
                case 1:
                    while (true) {
                        System.out.println("新增文献类型: 1,Article 2,ConferencePaper");
                        System.out.printf("\n你选择：  ");
                        choice = cho.nextInt();

                        //输入文章信息

                        //计数变量
                        Publication.pubCount++;

                        Publication publication = new Publication();
                        Author author = new Author();
                        publication.type = 1;
                        String temp;
                        System.out.println("*****正在录入第" + (Publication.pubCount) + "份文献信息****");
                        switch (choice) {
                            case 1:
                                System.out.println("录入类型：Article");
                                break;

                            case 2:
                                System.out.println("录入类型: Conference");
                                break;

                            default:
                                System.out.println("对不起，输入错误");
                                System.exit(1);
                                break;
                        }

                        System.out.println("请录入文献信息");


                        System.out.println("请输入标题");
                        temp = cho.next();
                        publication.setHeadLine(temp);
                        //Article 与 conference 有不同的输入
                        if (choice == 1) {
                            publication.type = 1;
                            System.out.println("请输入刊号");
                            temp = cho.next();
                            publication.setPubNumber(temp);
                            System.out.println("请输入期刊名");
                            temp = cho.next();
                            publication.setArtName(temp);
                        }

                        if (choice == 2) {
                            publication.type = 2;
                            System.out.println("请输入会议文集名");
                            temp = cho.next();
                            publication.setConName(temp);
                        }

                        System.out.println("请输入页码");
                        temp = cho.next();
                        publication.setPage(temp);

                        System.out.println("请输入文献年份");
                        int year = cho.nextInt();
                        publication.setYear(year);

                        //下面录入作者信息
                        System.out.println("请输入作者的名：");
                        temp = cho.next();
                        author.setFirstname(temp);

                        System.out.println("请输入作者的姓: ");
                        temp = cho.next();
                        author.setLastname(temp);

                        System.out.println("请输入作者的邮箱");
                        temp = cho.next();
                        author.setMailbox(temp);

                        System.out.println("请输入作者的单位");
                        temp = cho.next();
                        author.setOrganization(temp);

                        //录入完毕，将author 与 pub 对象add至arraylist中

                        authorlist.add(author);
                        publist.add(publication);

                        System.out.println("是否继续录入?  1,continue 2,quit");
                        int judge = cho.nextInt();

                        if (judge == 2) {
                            break;
                        }

                    }

                    System.out.printf("1,退至上一级 2,退出系统");
                    int judge = cho.nextInt();
                    if (judge == 2)
                        System.exit(0);
                    continue;
                    //case 查找作者 文献
                case 2:
                    System.out.println("系统可根据标题查找文献信息");

                    String wantName;
                    System.out.println("请输入要查找的文献的标题");
                    wantName = cho.next();
                    length = publist.size();
                    //遍历publist进行查找，找到一样的返回索引值加一
                    for (int i = 0; i < length; i++) {
                        if (wantName.equals(publist.get(i).getHeadLine()))
                            System.out.println("已找到相同标题的文献，文献索引 【" + i + "】");      //功能还可完善,是否直接打印？

                    }
                    System.out.println("接下来？ 1，返回上一级 2，退出系统");
                    int choose = cho.nextInt();
                    if (choose == 2)
                        System.exit(0);
                    continue;

                case 4:
                    System.out.println("根据文献索引打印文献信息");
                    System.out.println("请输入文件索引");
                    int dex = cho.nextInt();
                    System.out.println("*************************");
                    break;

                case 3:
                    length = publist.size();
                    System.out.println("共有" + (length + 1) + "条信息");

                    for (int i = 0; i < length; i++) {
                        //type 为Article时
                        if (publist.get(i).type == 1) {
                            System.out.println("************************");
                            System.out.printf("Article ：" + authorlist.get(i).getFirstname() + " " + authorlist.get(i).getLastname() + "(" + publist.get(i).getYear() + ")");  //现在系统只支持作者名为一个。。。。。
                            System.out.printf("," + publist.get(i).getHeadLine() + "," + publist.get(i).getArtName());
                            System.out.println("," + publist.get(i).getPubNumber() + "," + publist.get(i).getPage());
                            System.out.println("*************************");
                        }

                        //type conf
                        if (publist.get(i).type == 2) {
                            System.out.println("************************");
                            System.out.printf("Conference ：" + authorlist.get(i).getFirstname() + " " + authorlist.get(i).getLastname() + "(" + publist.get(i).getYear() + ")");  //现在系统只支持作者名为一个。。。。。
                            System.out.printf("," + publist.get(i).getHeadLine() + "," + publist.get(i).getConName());
                            System.out.println("," + "," + publist.get(i).getPage());
                            System.out.println("*************************");

                        }
                    }

            }


            System.out.println("接下来作什么？ 1，返回主界面 2，退出系统");
            int choose = cho.nextInt();
            if (choose == 2)
                System.exit(0);
            else
                continue;
        }

    }
}





