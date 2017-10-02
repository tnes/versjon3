package beans;

import beans.Product;
import beans.User;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-02T15:45:44")
@StaticMetamodel(ProductCatalog.class)
public class ProductCatalog_ { 

    public static volatile SingularAttribute<ProductCatalog, User> owner;
    public static volatile SingularAttribute<ProductCatalog, Long> ID;
    public static volatile ListAttribute<ProductCatalog, Product> products;

}