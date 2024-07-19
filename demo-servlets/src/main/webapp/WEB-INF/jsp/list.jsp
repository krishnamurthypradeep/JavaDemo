
<%@ page import="com.myapp.web.model.Product" %>

<%@ page import="java.util.List" %>



<div>

	<h3>Products </h3>
	<ul>
	
	<%
	List<Product> products = (List<Product>)request.getAttribute("products");
	
	for(Product product: products){%>
	
	
	<li> <%= product.name() %> </li>
	<li> <%= product.price() %> </li>
	
	<%}%>
	
	</ul>
	
</div>	

