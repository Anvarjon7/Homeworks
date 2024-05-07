package de.telran.module_1.lesson_1.module_1.lesson_1.homework16.task2;

import com.github.javafaker.Faker;

import java.util.HashMap;
import java.util.Map;

interface ReportGenerator<T>{
    public String generatorReport(T data);
}


class TextGenerator implements ReportGenerator<String>{

    @Override
    public String generatorReport(String data) {
        return "Text report: " + data;
    }
}

class HtmlReportGenerator implements ReportGenerator<String>{

    @Override
    public String generatorReport(String data) {
        return "<html><body><p>HTML report: " + data + " </p></body></html>";
    }
}
public abstract class Notifications <T>{

    final Faker faker;

    public Notifications() {
        this.faker = new Faker();
    }

    public abstract Map<String,T> prepareData();

    public abstract void sendReport(String report);
    public String generateReport(ReportGenerator<T> reportGenerator,T data){
        return reportGenerator.generatorReport(data);
    }
}
class Telegram extends Notifications<String>{
    @Override
    public Map<String, String> prepareData() {
        Map<String,String> telegramData = new HashMap<>();
        telegramData.put("charId",faker.number().digits(9));
        telegramData.put("messageText", faker.lorem().sentence());
        return telegramData;
    }
    @Override
    public void sendReport(String report) {
        System.out.println("Sending a report to: " + faker.name() + ": " + report);
    }
}
class Viber extends Notifications<String>{
    @Override
    public Map<String, String> prepareData() {
        Map<String,String> viberData = new HashMap<>();
        viberData.put("viberUserId",faker.number().digits(11));
        viberData.put("messageText",faker.lorem().sentence());
        return viberData;
    }

    @Override
    public void sendReport(String report) {
        System.out.println("Sending Viber report to: " + faker.name().fullName() + ": " + report);
    }
}
class WhatsApp extends Notifications<String>{
    @Override
    public Map<String, String> prepareData() {
        Map<String,String> whatsAppData = new HashMap<>();
        whatsAppData.put("whatsAppUserId", faker.number().digits(15));
        whatsAppData.put("messageText",faker.lorem().sentence());
        return whatsAppData;
    }

    @Override
    public void sendReport(String report) {
        System.out.println("Sending WhatsApp report to: " + faker.name().fullName() + ": " + report);
    }
}
class EmailSender extends Notifications<String>{
    @Override
    public Map<String, String> prepareData() {
        Map<String,String> emailData = new HashMap<>();
        emailData.put("EmailDataId",faker.number().digits(10));
        emailData.put("messageText",faker.lorem().sentence());
        return emailData;
    }

    @Override
    public void sendReport(String report) {
        System.out.println("Sending Email report to: " + faker.name().fullName() + ": " + report);
    }
}

class NotificationApp{
    public static void main(String[] args) {
        Telegram telegram = new Telegram();
        Map<String,String> telegramData = telegram.prepareData();
        TextGenerator textGenerator = new TextGenerator();
        String telegramReport = telegram.generateReport(textGenerator,telegramData.get("messageText") + " Id -> " + telegramData.get("charId"));
        telegram.sendReport(telegramReport);

        Viber viber = new Viber();
        Map<String,String> viberData = viber.prepareData();
        String viberReport = viber.generateReport(textGenerator, viberData.get("messageText") + " User Id -> " + viberData.get("viberUserId"));
        viber.sendReport(viberReport);

        WhatsApp whatsApp = new WhatsApp();
        Map<String,String> whatsAppData = whatsApp.prepareData();
        String whatsAppReport = whatsApp.generateReport(textGenerator,whatsAppData.get("messageText") + " User Id -> " + whatsAppData.get("whatsAppUserId"));
        whatsApp.sendReport(whatsAppReport);

        EmailSender emailSender = new EmailSender();
        HtmlReportGenerator htmlReportGenerator = new HtmlReportGenerator();
        Map<String,String> emailData = emailSender.prepareData();
        String emailReport = emailSender.generateReport(htmlReportGenerator,emailData.get("messageText") + " User Id -> " + emailData.get("EmailDataId"));
        emailSender.sendReport(emailReport);
    }

}