package beans;

import beans.Product;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-02T15:45:43")
@StaticMetamodel(Bid.class)
public class Bid_ { 

    public static volatile SingularAttribute<Bid, Product> product;
    public static volatile SingularAttribute<Bid, Double> amount;
    public static volatile SingularAttribute<Bid, Long> ID;

}