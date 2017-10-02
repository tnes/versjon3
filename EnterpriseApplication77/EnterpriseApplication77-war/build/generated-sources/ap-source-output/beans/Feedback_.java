package beans;

import beans.User;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-02T15:45:43")
@StaticMetamodel(Feedback.class)
public class Feedback_ { 

    public static volatile SingularAttribute<Feedback, User> author;
    public static volatile SingularAttribute<Feedback, Double> rating;
    public static volatile SingularAttribute<Feedback, Long> ID;
    public static volatile SingularAttribute<Feedback, String> content;

}