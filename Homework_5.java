package Homework_5;

public class Homework_5 {

    public static void main(String[] args){
        Workers[] workers = new Workers[5];
        workers[0] = new Workers("Иванов Иван Иванович", "Cантехник", "RussianMario@job.ru", "8-905-123-45-67", 25500, 53);
        workers[1] = new Workers("Семён Семёнович Горбунков", "Старший экономист", "St.Ec@job.ru", "8-925-123-45-62", 65500, 46);
        workers[2] = new Workers("Михайлов Михаил Михайлович", "Директор", "Boss@job.ru", "8-905-123-45-61", 65500, 34);
        workers[3] = new Workers("Сергеев Сергей Сергеевич", "Охранник", "Security@job.ru", "8-905-123-75-61", 29000, 32);
        workers[4] = new Workers("Иван Васильевич Бунша", "Управдом", "Bunshcha@job.ru", "8-905-123-78-90", 37000, 39);
        infoOver40(workers);
        Lesnik.output();
    }
    private static void infoOver40(Workers[] workers){
        for(int i = 0; i < 5; ++i){
            if(workers[i].age > 40){
                workers[i].workersInfo();
            }
        }
    }
}
