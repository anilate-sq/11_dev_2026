class Report{
    protected String content;
    protected String date;
    Report(String content, String date){
        this.content = content;
        this.date = date;
    }

    void printReport(){
        System.out.println("Отчет от " + date + "\n" + content);
    }    
}

class WordReport extends Report{
    WordReport(String content, String date){
        super(content, date);
    }

    @Override void printReport(){
        System.out.println("Word отчет от " + date + "\n" + content);
    }    
}

class PDFReport extends Report{
    PDFReport(String content, String date){
        super(content, date);
    }

    @Override void printReport(){
        System.out.println("PDF отчет от " + date + "\n" + content);
    }    
}

public class ex_03_Reports {
   public static void main(String[] args) {
        Report[] reports = {new PDFReport("Продали 20 корейских", "12.04.2024"), new WordReport("Продали 2 пиццы", "23.12.2025")};

        for(Report report : reports){
            report.printReport();
        }
    } 
}
