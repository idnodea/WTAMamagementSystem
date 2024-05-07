package izo.wtamamagementsystem.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Syllabus")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Syllabus {
    @Id
    @Column(name = "id_syllabus")
    private String idSyllabus;

    @Column(name = "course_overview", nullable = false)
    private String courseOverview;

    @Column(name = "book")
    private String book;

    @Column(name = "teaching")
    private String teaching;

    @Column(name = "evaluation")
    private String evaluation;

    @Column(name = "remarks")
    private String remarks;

    @Column(name = "id_prof", nullable = false)
    private String idProf;


}
