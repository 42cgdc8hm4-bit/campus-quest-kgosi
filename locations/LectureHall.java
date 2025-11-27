package locations;

import core.Student;
import events.QuizEvent;
import events.StudyEvent;

public class LectureHall extends Location {

    @Override
    public String getName() {
        return "Lecture Hall";
    }

    @Override
    public void interact(Student s) {
        System.out.println("You attend a lecture on Principles of programming languages");
        // TODO: maybe random event? say a test?
        QuizEvent firstQuiz = new QuizEvent();
        firstQuiz.perform(s);
        StudyEvent studysession1 = new StudyEvent();
        studysession1.perform(s);
    }
}
