package com.example.quizz;

public class Question
{
    public static String question1="מי הרג את סיסרא?";
    public static String question2="מי היה אבא של ישעיהו?";
    public static String question3="איך ה' כינה את יחזקאל?";
    public static String question4="איך קראו לחותן משה?";
    public static String question5="איך קראו למלך יהודה האחרון?";
    public static String question6="מה היה הכינוי של שמואל?";
    public static String question7="כמה נשים ופילגשים היו לשלמה?";
    public static String question8="איזה מלך משל על 120 מדינות?";
    public static String question9="איפה גר ירמיהו(בתחילת הספר)?";
    public static String question10=" מי מהבאים היה נביא שקר?";
    public static String question11="מאיזה שבט היה חור?";
    public static String question12="בן כמה ישמעאל בן אברהם היה במותו?";
    public static String question13="מי היה נשיא שבט שמעון שגרם למגפה?";
    public static String question14="השלם:'הגם ____ בנביאים'";
    public static String question15="מי מהבאים מת עיוור?";
    public static String question16="";

    public static Answer answer1_1=new Answer("יעל אשת חבר הקיני",true);
    public static Answer answer1_2=new Answer("שמשון הגיבור",false);
    public static Answer answer1_3=new Answer("דבורה הנביאה",false);
    public static Answer answer1_4=new Answer("ברק בן אבינעם",false);

    public static Answer answer2_1=new Answer("אמציה",false);
    public static Answer answer2_2=new Answer("אמוץ",true);
    public static Answer answer2_3=new Answer("ירמיהו",false);
    public static Answer answer2_4=new Answer("חלקיהו",false);

    public static Answer answer3_1=new Answer("בני",false);
    public static Answer answer3_2=new Answer("יחזקאל",false);
    public static Answer answer3_3=new Answer("עבדי",false);
    public static Answer answer3_4=new Answer("בן אדם",true);

    public static Answer answer4_1=new Answer("יתרו",false);
    public static Answer answer4_2=new Answer("חובב",false);
    public static Answer answer4_3=new Answer("כל התשובות נכונות",true);
    public static Answer answer4_4=new Answer("קיני",false);

    public static Answer answer5_1=new Answer("צדקיהו",false);
    public static Answer answer5_2=new Answer("יאשיהו",false);
    public static Answer answer5_3=new Answer("גדליה",true);
    public static Answer answer5_4=new Answer("יהויכין",false);

    public static Answer answer6_1=new Answer("הרואה",true);
    public static Answer answer6_2=new Answer("השומע",false);
    public static Answer answer6_3=new Answer("המתנבא",false);
    public static Answer answer6_4=new Answer("המאזין",false);

    public static Answer answer7_1=new Answer("עשר",false);
    public static Answer answer7_2=new Answer("אלף",true);
    public static Answer answer7_3=new Answer("מאה",false);
    public static Answer answer7_4=new Answer("אחת",false);

    public static Answer answer8_1=new Answer("אחשורוש",false);
    public static Answer answer8_2=new Answer("אחאב",false);
    public static Answer answer8_3=new Answer("כורש",false);
    public static Answer answer8_4=new Answer("דריוש",true);

    public static Answer answer9_1=new Answer("ירושלים",false);
    public static Answer answer9_2=new Answer("ענתות",true);
    public static Answer answer9_3=new Answer("רמה",false);
    public static Answer answer9_4=new Answer("הר הכרמל",false);

    public static Answer answer10_1=new Answer("חנניה בן עזור",true);
    public static Answer answer10_2=new Answer("ירמיהו בן חלקיהו",false);
    public static Answer answer10_3=new Answer("אוריהו בן שמעיהו",false);
    public static Answer answer10_4=new Answer("אחיה השילוני",false);

    public static Answer answer11_1=new Answer("שמעון",false);
    public static Answer answer11_2=new Answer("דן",false);
    public static Answer answer11_3=new Answer("יהודה",true);
    public static Answer answer11_4=new Answer("לוי",false);

    public static Answer answer12_1=new Answer("157",false);
    public static Answer answer12_2=new Answer("127",false);
    public static Answer answer12_3=new Answer("147",false);
    public static Answer answer12_4=new Answer("137",true);

    public static Answer answer13_1=new Answer("שפט בן חורי",false);
    public static Answer answer13_2=new Answer("זמרי בן סלוא",true);
    public static Answer answer13_3=new Answer("שלומיאל בן צורישדי",false);
    public static Answer answer13_4=new Answer("אף אחד מהם",false);

    public static Answer answer14_1=new Answer("שאול",true);
    public static Answer answer14_2=new Answer("דוד",false);
    public static Answer answer14_3=new Answer("שלמה",false);
    public static Answer answer14_4=new Answer("רחבעם",false);

    public static Answer answer15_1=new Answer("יעקב",false);
    public static Answer answer15_2=new Answer("צדקיהו",false);
    public static Answer answer15_3=new Answer("שני התשובות נכונות",true);
    public static Answer answer15_4=new Answer("אף אחד מהתשובות נכונה",false);

    public static Answer answer16_1=new Answer("",false);
    public static Answer answer16_2=new Answer("",true);
    public static Answer answer16_3=new Answer("",false);
    public static Answer answer16_4=new Answer("",false);


    //רק ליתר ביטחון
    public static String getQuestion1()
    {
        return question1;
    }

    public static String getQuestion2()
    {
        return question2;
    }

    public static String getQuestion3()
    {
        return question3;
    }

    public static String getQuestion4()
    {
        return question4;
    }

    public static String getQuestion5()
    {
        return question5;
    }

    public static String getQuestion6()
    {
        return question6;
    }

    public static String getQuestion7()
    {
        return question7;
    }

    public static String getQuestion8()
    {
        return question8;
    }

    public static String getQuestion9()
    {
        return question9;
    }

    public static String getQuestion10()
    {
        return question10;
    }

    public static String getQuestion11()
    {
        return question11;
    }

    public String getQuestion12()
    {
        return this.question12;
    }

    public String getQuestion13()
    {
        return this.question13;
    }

    public String getQuestion14()
    {
        return this.question14;
    }

    public String getQuestion15()
    {
        return this.question15;
    }

    public String getQuestion16()
    {
        return this.question16;
    }



    public static Answer getAnswer1_1()
    {
        return answer1_1;
    }

    public static Answer getAnswer1_2()
    {
        return answer1_2;
    }

    public static Answer getAnswer1_3()
    {
        return answer1_3;
    }

    public static Answer getAnswer1_4()
    {
        return answer1_4;
    }

    public static Answer getAnswer2_1()
    {
        return answer2_1;
    }

    public static Answer getAnswer2_2()
    {
        return answer2_2;
    }

    public static Answer getAnswer2_3()
    {
        return answer2_3;
    }

    public static Answer getAnswer2_4()
    {
        return answer2_4;
    }

    public static Answer getAnswer3_1()
    {
        return answer3_1;
    }

    public static Answer getAnswer3_2()
    {
        return answer3_2;
    }

    public static Answer getAnswer3_3()
    {
        return answer3_3;
    }

    public static Answer getAnswer3_4()
    {
        return answer3_4;
    }

    public static Answer getAnswer4_1()
    {
        return answer4_1;
    }

    public static Answer getAnswer4_2()
    {
        return answer4_2;
    }

    public static Answer getAnswer4_3()
    {
        return answer4_3;
    }

    public static Answer getAnswer4_4()
    {
        return answer4_4;
    }

    public static Answer getAnswer5_1()
    {
        return answer5_1;
    }

    public static Answer getAnswer5_2()
    {
        return answer5_2;
    }

    public static Answer getAnswer5_3()
    {
        return answer5_3;
    }

    public static Answer getAnswer5_4()
    {
        return answer5_4;
    }

    public static Answer getAnswer6_1()
    {
        return answer6_1;
    }

    public static Answer getAnswer6_2()
    {
        return answer6_2;
    }

    public Answer getAnswer6_3()
    {
        return answer6_3;
    }
    public Answer getAnswer6_4()
    {
        return answer6_4;
    }

    public Answer getAnswer7_1()
    {
        return answer7_1;
    }

    public Answer getAnswer7_2()
    {
        return answer7_2;
    }

    public Answer getAnswer7_3()
    {
        return answer7_3;
    }

    public Answer getAnswer7_4()
    {
        return answer7_4;
    }


}
