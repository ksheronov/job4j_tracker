package ru.job4j.inheritance;

public class ReportUsage {
    public static void main(String[] args) {
        TextReport report = new TextReport();
        String text = report.generate("Report's name", "Report's body");
        System.out.println(text);
        JSONReport json = new JSONReport();
        System.out.println(json.generate("It's NAME", "It's BODY"));
    }
}
