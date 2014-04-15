package pl.maku.angular.backend;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Created with IntelliJ IDEA.
 * User: Maciek
 * Date: 15.04.14
 * Time: 22:55
 * To change this template use File | Settings | File Templates.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Tag {

    private String id;
    private String name;
    private String description;


}
