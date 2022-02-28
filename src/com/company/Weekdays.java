package com.company;

public enum Weekdays {
    ДУЙШОМБУ(" Дуйшомбу куну java лекция болот"),
    ШЕЙШЕМБИ(" Шейшемби куну soft skills + java практика болот"),
    ШАРШЕМБИ(" Шаршемби куну java лекция болот"),
    БЕЙШЕМБИ(" Бейшемби куну soft skills + java практика болот"),
    ЖУМА(" Жума куну java лекция болот"),
    ИШЕМБИ(" Ишемби куну java доп.практика болот"),
    ЖЕКШЕМБИ(" Дем алуу");
   private String lesson;
    Weekdays(String lesson) {
        this.lesson = lesson;
    }

    public String getLesson() {
        return lesson;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson;
    }

    @Override
    public String toString() {
        return super.toString() + lesson + "\n";
    }
}
