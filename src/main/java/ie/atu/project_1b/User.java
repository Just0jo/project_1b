package ie.atu.project_1b;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Valid
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Max(value = 8, message = "id cannot be greater than 8")
    private String id;
    @NotBlank(message = " Genre is required")
    private String Genre;
    @NotBlank(message = "Artist is required")
    private String artist;
    @NotBlank(message = " Album is required")
    private String Album;
    @NotBlank(message = " release year is required")
    private String releaseYear;

}