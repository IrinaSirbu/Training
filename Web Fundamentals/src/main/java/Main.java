import java.util.Date;

/**
 * Created by fstancu on 11/9/2016.
 */

public class Main {

    public static void main(String[] args) {

        /* REST TEMPLATE */
        Comment commentToBeSaved = new Comment("Florin", "stancu.florin23@gmail.com", "test from java", new Date());
        CommentWebServiceClient service = new UsingRestTemplate();

        /* SAVE */
        Comment commentSaved = service.save(commentToBeSaved);
        System.out.println(commentSaved);

        /* FIND BY ID */
        Comment commentWithId4 = service.findById(4l);
        System.out.println(commentWithId4);

        /* DELETE */
        service.delete(2l);

        /* UPDATE */
        System.out.println(service.findById(3l));
        service.update(service.findById(3l));
        System.out.println(service.findById(3l));

        /* FIND ALL */
        service.findAll();


        /* UNIREST */
        Comment commentToBeSaved1 = new Comment("Irina", "sirbu.irina@gmail.com", "test from java", new Date());
        CommentWebServiceClient service1 = new UsingUnirest();

        /* SAVE */
        service1.save(commentToBeSaved1);
        System.out.println(commentSaved);

        /* DELETE */
        service1.delete(1l);

        /* FIND BY ID */
        System.out.println(service1.findById(2l));

        /* UPDATE */
        System.out.println(service1.findById(2l));
        service1.update(service1.findById(2l));
        System.out.println(service1.findById(2l));

        /* FIND ALL */
        System.out.println(service1.findAll());
    }
}
