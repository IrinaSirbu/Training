import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;

/**
 * Created by isirbu on 11/10/2016.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class Find {


    public List<Comment> comment;
    public Find _embedded;

    public List<Comment> getComment(){
        return comment;
    }

    public Find getF(){
        return _embedded;
    }
}
