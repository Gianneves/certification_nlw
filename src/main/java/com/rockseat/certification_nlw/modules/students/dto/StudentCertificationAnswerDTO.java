package com.rockseat.certification_nlw.modules.students.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.aspectj.weaver.patterns.TypePatternQuestions;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StudentCertificationAnswerDTO {

    private String email;
    private String technology;
    private List<QuestionAnswerDTO> questionAnswerDTOS;
}
