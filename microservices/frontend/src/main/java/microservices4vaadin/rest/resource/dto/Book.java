package microservices4vaadin.rest.resource.dto;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Book {

    private String name;
    private LocalDate releaseDate;

}
