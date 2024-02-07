package com.rockseat.certification_nlw.modules.students.controllers;

import com.rockseat.certification_nlw.modules.students.dto.VerifyIfHasCertificationDTO;
import com.rockseat.certification_nlw.modules.students.useCases.VerifyIfHasCertificationUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private VerifyIfHasCertificationUseCase verifyIfHasCertificationUseCase;

    @PostMapping("/verifyIfHasCertification")
    public String verifyIfHasCertification(@RequestBody VerifyIfHasCertificationDTO certificationDTO) {
        var result = this.verifyIfHasCertificationUseCase.execute(certificationDTO);
        if (result) {
            return  "user já fez a prova";
        }
        return "Usuário pode fazer a prova";
    }
}
