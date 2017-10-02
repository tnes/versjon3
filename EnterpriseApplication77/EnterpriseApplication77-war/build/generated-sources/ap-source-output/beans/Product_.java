package beans;

import beans.Bid;
import beans.ProductCatalog;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-02T15:45:43")
@StaticMetamodel(Product.class)
public class Product_ { 

    public static volatile SingularAttribute<Product, String> features;
    public static volatile SingularAttribute<Product, Bid> currentBid;
    public static volatile SingularAttribute<Product, ProductCatalog> catalog;
    public static volatile SingularAttribute<Product, String> name;
    public static volatile SingularAttribute<Product, Double> rating;
    public static volatile SingularAttribute<Product, Long> ID;
    public static volatile SingularAttribute<Product, Boolean> published;
    public static volatile SingularAttribute<Product, String> picture;
    public static volatile SingularAttribute<Product, Long> remainingTime;

}