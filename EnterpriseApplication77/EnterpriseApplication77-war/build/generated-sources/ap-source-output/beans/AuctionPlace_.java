package beans;

import beans.User;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-02T15:45:44")
@StaticMetamodel(AuctionPlace.class)
public class AuctionPlace_ { 

    public static volatile SingularAttribute<AuctionPlace, Long> ID;
    public static volatile ListAttribute<AuctionPlace, User> users;

}