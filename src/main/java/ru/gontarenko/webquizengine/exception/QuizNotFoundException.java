package ru.gontarenko.webquizengine.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "quiz not found")
public class QuizNotFoundException extends RuntimeException {

}