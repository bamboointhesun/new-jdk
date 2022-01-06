package vip.leemy.demo1.optional;

import lombok.*;

import java.util.List;

/**
 * @Author: Carmine
 * @Date: 2022/1/6-19:17
 * @Description: 小说
 */
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Novel extends Books{
    private List<String> topic;
}
