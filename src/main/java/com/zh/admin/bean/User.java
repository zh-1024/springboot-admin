package com.zh.admin.bean;

import lombok.*;

/**
 * @ClassName User
 * @Date 2021/10/9 21:39
 * @Author zhang hui
 * @Description TODO
 */

@Data
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String username;
    private String password;
}
