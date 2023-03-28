package mobile.com.springshopbe.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import mobile.com.springshopbe.domain.CategoryStatus;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class CategoryDto implements Serializable {
    private final Long id;
    private final String name;
    private final CategoryStatus status;
}
