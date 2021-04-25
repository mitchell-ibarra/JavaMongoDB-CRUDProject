/*
 * This class will be used to define a Spring Data repository. 
 */
package com.mongodb.mongodbouth;

// This is a superclass that includes all necessary code for reading and writing
// To the domain class DrumlineStudent to and from MongoDB database
import org.springframework.data.mongodb.repository.MongoRepository; 
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 *
 * @author Mitchell Ibarra
 */
//The @RepositoryRestResource tells Spring Boot to automatically generate a REST
// endpoint for the data using the HAL JSON spec
@RepositoryRestResource(collectionResourceRel = "SouthCountyDrumline", path = "SouthCountyDrumline")
public interface StudentRepository extends MongoRepository<DrumlineStudent, String>
{
    
}
