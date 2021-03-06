package se.slam.ecommerce.repository;

//import java.util.ArrayList; //Ta bort
import java.util.Collection;
import java.util.List;

import se.slam.ecommerce.model.Order;
import se.slam.ecommerce.model.User;
import se.slam.ecommerce.repository.checkedexception.RepositoryException;

public interface OrderRepository extends CrudRepository<Order>
{
	Object createOrder(Order order) throws RepositoryException;

	Collection<List<Order>> getAllOrders() throws RepositoryException; //Ändra från arrayList till List

	List<Order> getAllOrdersFromUser(User user) throws RepositoryException;
}