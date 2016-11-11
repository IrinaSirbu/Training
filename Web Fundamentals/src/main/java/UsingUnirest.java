import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import java.io.IOException;
import java.util.List;

/**
 * Created by isirbu on 11/10/2016.
 */

public class UsingUnirest implements CommentWebServiceClient{

    ObjectMapper mapper = new ObjectMapper();

    public Comment save(Comment comment) {

            try {
                Unirest.post("http://localhost:8080/restfulapi/comment/")
                        .header("accept", "application/json")
                        .header("Content-Type", "application/json")
                        .body(mapper.writeValueAsString(comment))
                        .asJson();
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            } catch (UnirestException e) {
                e.printStackTrace();
            }

        return comment;
    }

    public Comment update(Comment comment) {

        comment.setComment("new comment");
        String id = UsingRestTemplate.getID(comment.get_links().toString());

        try {
            Unirest.put("http://localhost:8080/restfulapi/comment/" + id)
                    .header("accept", "application/json")
                    .header("Content-Type", "application/json")
                    .body(mapper.writeValueAsString(comment))
                    .asJson();
        } catch (UnirestException e) {
            e.printStackTrace();
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        return comment;
    }

    public Comment findById(Long commentId) {

        try {
            HttpResponse<JsonNode> j = Unirest.get("http://localhost:8080/restfulapi/comment/" + commentId)
                    .header("accept", "application/json")
                    .header("Content-Type", "application/json")
                    .asJson();
            return mapper.readValue(j.getBody().toString(), Comment.class);
            } catch (IOException e) {
                e.printStackTrace();
            } catch (UnirestException e) {
            e.printStackTrace();
        }

        return null;
    }

    public List<Comment> findAll() {

        List<Comment> list;

        try {
            HttpResponse<JsonNode> j = Unirest.get("http://localhost:8080/restfulapi/comment/")
                    .header("accept", "application/json")
                    .header("Content-Type", "application/json")
                    .asJson();

            list = mapper.readValue(j.getBody().toString(), Find.class).getF().getComment();
            return list;
        } catch (IOException e) {
                e.printStackTrace();
        } catch (UnirestException e) {
            e.printStackTrace();
        }

        return null;
    }

    public void delete(Long commentId) {

        try {
            Unirest.delete("http://localhost:8080/restfulapi/comment/" + commentId)
                    .header("accept", "application/json")
                    .header("Content-Type", "application/json")
                    .asJson();
        } catch (UnirestException e) {
            e.printStackTrace();
        }
    }
}
