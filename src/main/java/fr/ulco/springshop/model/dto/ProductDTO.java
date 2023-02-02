package fr.ulco.springshop.model.dto;

import fr.ulco.springshop.model.entities.CategoryEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Collection;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO {

    private int id;
    private String name;
    private float price;
    private int quantity;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String description;
    private String thumbnail;
    private Collection<CategoryDTO> categories;
}
