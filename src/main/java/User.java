import org.apache.commons.collections.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dong
 */
public class User {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name) {
        this.name = name;
    }

    public User() {
    }

    public static void main(String[] args) {
        User user =new User(null);
        String name = user.getName();
        System.out.println(name);

        List<String> list = new ArrayList<>();
        list.add("djddj");
        boolean notEmpty = CollectionUtils.isNotEmpty(list);
        System.out.println(notEmpty);


    }
}
