package com.rockseat.certification_nlw.modules.students.entities;

import java.util.UUID;

public class AnswersCertificationEntity {

    private UUID id;
    private UUID certificationID;
    private UUID studentID;
    private  UUID questionID;
    private UUID answerID;
    private boolean isCorrect;
}
