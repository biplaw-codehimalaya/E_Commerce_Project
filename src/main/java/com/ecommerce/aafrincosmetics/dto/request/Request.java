package com.ecommerce.aafrincosmetics.dto.request;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Request {
    @NotNull
//    @Min(4)
    private Long amount;
//    @Email
    private String email;
//    @NotBlank
//    @Size(min = 5, max = 200)
    private String productName;
}
