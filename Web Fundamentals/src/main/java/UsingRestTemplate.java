import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;
import java.util.List;

/**
 * Created by fstancu on 11/9/2016.
 */

public class UsingRestTemplate implements CommentWebServiceClient {

    public static String getID(String url){

        int id;
        int length = url.length() - 1;
        int c = url.charAt(length);

        while (c < 48 || c > 57){
            length --;
            c = url.charAt(length);
        }

        id = c - 48;
        length --;
        c = url.charAt(length);

        while (c > 47 && c < 58) {
            id = (c - 48) * 10 + id;
            length --;
            c = url.charAt(length);
        }

        return  id + "";
    }

    /**
     * http://localhost:8080/api/comment
     *
     * Content-Type: application/json
     *
     * {
     "name": "Florin2",
     "email": "stancu.florin23@gmail.com",
     "comment": "test",
     "date": "2016-01-02"
     }
     *
     * @param comment
     * @return
     */
    public Comment save(Comment comment) {
        RestTemplate restTemplate = new RestTemplate();

        MappingJackson2HttpMessageConverter jsonHttpMessageConverter = new MappingJackson2HttpMessageConverter();
        restTemplate.getMessageConverters().add(jsonHttpMessageConverter);

        return restTemplate.postForObject("http://localhost:8080/restfulapi/comment", comment, Comment.class);
    }

    public Comment update(Comment comment) {

        comment.setComment("new comment");
        RestTemplate restTemplate = new RestTemplate();

        MappingJackson2HttpMessageConverter jsonHttpMessageConverter = new MappingJackson2HttpMessageConverter();
        restTemplate.getMessageConverters().add(jsonHttpMessageConverter);

        String id = getID(comment.get_links().toString());

        restTemplate.put("http://localhost:8080/restfulapi/comment/" + id, comment);
        return comment;
    }

    /**
     * http://localhost:8080/api/comment/4
     *
     * @param commentId
     * @return
     */

    public Comment findById(Long commentId) {
        RestTemplate restTemplate = new RestTemplate();

        MappingJackson2HttpMessageConverter jsonHttpMessageConverter = new MappingJackson2HttpMessageConverter();
        restTemplate.getMessageConverters().add(jsonHttpMessageConverter);

        return restTemplate.getForObject("http://localhost:8080/restfulapi/comment/" + commentId, Comment.class);
    }

    public List<Comment> findAll() {

        List<Comment> list;
        RestTemplate restTemplate = new RestTemplate();


        MappingJackson2HttpMessageConverter jsonHttpMessageConverter = new MappingJackson2HttpMessageConverter();
        restTemplate.getMessageConverters().add(jsonHttpMessageConverter);

        list = restTemplate.getForObject("http://localhost:8080/restfulapi/comment/", Find.class).getF().getComment();

        System.out.println(list);
        return list;
    }

    public void delete(Long commentId) {

        RestTemplate restTemplate = new RestTemplate();

        MappingJackson2HttpMessageConverter jsonHttpMessageConverter = new MappingJackson2HttpMessageConverter();
        restTemplate.getMessageConverters().add(jsonHttpMessageConverter);

        restTemplate.delete("http://localhost:8080/restfulapi/comment/" + commentId);
    }
}
