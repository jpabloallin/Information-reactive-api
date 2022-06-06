package com.example.reactive.api.collection;

import lombok.*;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Information {
    @Id
    private String id;
    private String note;

}
