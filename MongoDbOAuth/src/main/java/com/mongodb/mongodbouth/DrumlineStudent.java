/*
 * This class will serve as the Domain Class to be able to add, update, delete, 
 * and list all the properties of a student
 */
package com.mongodb.mongodbouth;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author Mitchell Ibarra
 */
@Document // Makes this class as defining a MongoDB document data model
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DrumlineStudent 
{
    @Id
    private String _ID;   // Id number for student
    private String _Name; // Name of student
    private String _Role; // What instrument the student plays
    private Date _Year;   // What school year student is in
} 
