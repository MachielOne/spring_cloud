package org.homeboy.springcloud.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Customer implements Serializable {

    private long id;
    private String firstName;

    private String lastName;

    private int gender;

    private String phoneNumber;

    private String source;
}
