package ru.gontarenko.webquizengine.entity;

import java.util.Set;

public final class Answer {
    private Set<Integer> answer;

    public Set<Integer> getAnswer() {
        return answer;
    }

    public void setAnswers(Set<Integer> answer) {
        this.answer = answer;
    }
}
