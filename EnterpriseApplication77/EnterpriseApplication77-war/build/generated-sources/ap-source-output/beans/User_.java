package beans;

import beans.AuctionPlace;
import beans.Feedback;
import beans.ProductCatalog;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-02T15:45:43")
@StaticMetamodel(User.class)
public class User_ { 

    public static volatile ListAttribute<User, Feedback> feedback;
    public static volatile SingularAttribute<User, String> password;
    public static volatile SingularAttribute<User, ProductCatalog> acquiredProducts;
    public static volatile SingularAttribute<User, Boolean> loggedIn;
    public static volatile SingularAttribute<User, Double> rating;
    public static volatile SingularAttribute<User, String> phonenumber;
    public static volatile SingularAttribute<User, Long> ID;
    public static volatile SingularAttribute<User, AuctionPlace> auctionplace;
    public static volatile SingularAttribute<User, ProductCatalog> soldProducts;
    public static volatile SingularAttribute<User, String> email;
    public static volatile SingularAttribute<User, String> username;
    public static volatile SingularAttribute<User, ProductCatalog> productCatalog;

}