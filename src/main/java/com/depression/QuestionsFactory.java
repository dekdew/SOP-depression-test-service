package com.depression;

import java.util.ArrayList;

public class QuestionsFactory {
    private ArrayList<Question> questions = new ArrayList<>();

    public QuestionsFactory() {
        Choice choice0 = new Choice(0, "ไม่มีเลย", 0);
        Choice choice1 = new Choice(1, "มีบางวัน", 1);
        Choice choice2 = new Choice(2, "มีมากกว่า 7 วัน", 2);
        Choice choice3 = new Choice(3, "มีแทบทุกวัน", 3);
        Choice choice4 = new Choice(1, "มีบางวัน", 1);

        ArrayList<Choice> choices = new ArrayList<>();

        choices.add(choice0);
        choices.add(choice1);
        choices.add(choice2);
        choices.add(choice3);

        Question question1 = new Question(1, "รู้สึกซึม เศร้า หงุดหงิด หรือสิ้นหวัง", choices);
        Question question2 = new Question(2, "เบื่อ ไม่ค่อยสนใจหรือไม่เพลิดเพลิน เวลาทำสิ่งต่างๆ", choices);
        Question question3 = new Question(3, "นอนหลับยาก รู้สึกง่วงทั้งวัน หรือนอนมากเกินไป", choices);
        Question question4 = new Question(4, "ไม่อยากอาหาร น้ำหนักลด หรือกินมากกว่าปกติ", choices);
        Question question5 = new Question(5, "รู้สึกเหนื่อยล้า หรือไม่ค่อยมีพลัง", choices);
        Question question6 = new Question(6, "รู้สึกแย่กับตัวเอง หรือรู้สึกว่าตัวเองล้มเหลว หรือทำให้ตัวเองหรือครอบครัวผิดหวัง", choices);
        Question question7 = new Question(7, "จดจ่อกับสิ่งต่างๆ ได้ยาก เช่น ทำการบ้าน อ่านหนังสือหรือดูโทรทัศน์", choices);
        Question question8 = new Question(8, "พูดหรือทำอะไรช้าลงมากจนคนอื่นสังเกตุเห็นได้ หรือ ในทางตรงกันข้าม คือ กระสับกระส่าย หรือ กระวนกระวาย จนต้องเคลื่อนไหวไปมามากกว่าปกติ", choices);
        Question question9 = new Question(9, "คิดว่าถ้าตายไปเสียจะดีกว่า หรือคิดจะทำร้ายตัวเองด้วยวิธีใดวิธีหนึ่ง", choices);

        questions.add(question1);
        questions.add(question2);
        questions.add(question3);
        questions.add(question4);
        questions.add(question5);
        questions.add(question6);
        questions.add(question7);
        questions.add(question8);
        questions.add(question9);
    }

    public ArrayList<Question> getQuestions() {
        return questions;
    }

    public Question getQuestionByID(int id) {
        for (Question question : questions) {
            if (question.getQuestionID() == id) {
                return question;
            }
        }
        return null;
    }
}
