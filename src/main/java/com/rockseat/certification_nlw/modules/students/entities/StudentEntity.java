package com.rockseat.certification_nlw.modules.students.entities;

import java.util.List;
import java.util.UUID;

public class StudentEntity {

    private UUID id;
    private String email;
    private List<CertificationStudentEntity> certificationStudentEntities;
}
