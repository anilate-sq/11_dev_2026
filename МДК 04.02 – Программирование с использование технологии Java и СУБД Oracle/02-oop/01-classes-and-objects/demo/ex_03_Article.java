public class ex_03_Article {
    public static void main(String[] args) {
        Article article = new Article();
        article.title = "Продажа ноутбука";
        article.views = 0;
        article.view();
        article.printInfo();
    }
}

// Рекламный пост
class Article {
    String title;
    int views;
    void view() { views++; }
    void printInfo(){
        System.out.println("Количество просмотров события " + title + " = " + views);
    }
}

