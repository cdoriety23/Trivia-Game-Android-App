package com.example.triviagame;

public class Questions {


    public String quest[] =
            {
                    "How Big Can An Anacoda Snake Grow (LBS)?",
                    "What year was the Constituion Ratified?",
                    "What team won the most Super Bowls?",
                    " Who painted the famous 'Whining Clock' ?",
                    " What year did Alaska join the USA?,"

            };


    private String choices[][] =
            {
                    {"215","130","305","100"},
                    {"1967","1788","1620","1800"},
                    {"Packers ","Patriots","Bears","Chargers"},
                    {"Picasso ","Van Gogh","Matisse","Raphael"},
                    {"2001","1959","1801","1620"}
            };

    private String correct[] = {"215","1788","Patriots","Van Gogh","1959"};

    public String getQuest(int a)
    {
        String question = quest[a];
        return question;
    }

    public String getAnswer(int a)
    {
        String answer = correct[a];
        return answer;
    }

    public String getChoice1(int a)
    {
        String choice = choices[a][0];
        return choice;
    }

    public String getChoice2(int a)
    {
        String choice = choices[a][1];
        return choice;
    }

    public String getChoice3(int a)
    {
        String choice = choices[a][2];
        return choice;
    }

    public String getChoice4(int a)
    {
        String choice = choices[a][3];
        return choice;
    }





}
