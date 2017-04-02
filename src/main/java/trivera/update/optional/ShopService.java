package trivera.update.optional;

import trivera.update.optional.domain.Customer;
import trivera.update.optional.domain.Shop;
import trivera.update.optional.domain.ShoppingCart;
import trivera.update.optional.domain.dao.ShopFactory;

import java.util.Collection;
import java.util.Optional;
import java.util.function.Consumer;

/**
 * <p>
 * This component and its source code representation are copyright protected and
 * proprietary to Trivera Technologies, LLC, Worldwide D/B/A Trivera Technologies
 * <p>
 * This component and source code may be used for instructional and evaluation
 * purposes only. No part of this component or its source code may be sold,
 * transferred, or publicly posted, nor may it be used in a commercial or
 * production environment, without the express written consent of the Trivera
 * Group, Inc.
 * <p>
 * Copyright (c) 2017 Trivera Technologies, LLC. http://www.triveratech.com
 * <p>
 * </p>
 *
 * @author Trivera Technologies Tech Team.
 */
public class ShopService {

    private Shop shop = ShopFactory.initShop();

    /**
     * Calculate the subtotal of all the items in the shoppingcart of the given
     * customer
     *
     * @param customerID The customer ID
     * @return The subtotal
     */
    public double getSubTotalOfCustomer(int customerID) {
        // Get the customer from the shop and the get the ShoppingCart from this
        // customer

        // Use the getTotalItemPrice method of the ShoppingCart the obtain the
        // total price
        // When the customer does not have a cart, return 0.0
        Optional<ShoppingCart> shoppingCart = shop.getCustomer(customerID).flatMap(Customer::getShoppingCart);

//        if (shoppingCart.isPresent()) {
//            return shoppingCart.get().getTotalItemPrice();
//        } else {
//            return 0.0;
//        }
        return shoppingCart.map(ShoppingCart::getTotalItemPrice).orElse(0.0);
    }

    /**
     * Get a Customer from the shop, when the customer does not exist, return a
     * new one
     *
     * @param customerID The customer ID
     * @return A Existing of new Customer instance
     */
    public Customer getCustomer(int customerID) {
        // Get the ShoppingCart from the customer or create a new one
        return shop.getCustomer(customerID).orElse(shop.addCustomer("Unknown"));
    }

    /**
     * Checkout the customer. Process the content of the cart and remove the
     * cart from the customer
     *
     * @param customer The customer instance
     */
    public void checkOutCustomer(Customer customer) {
        // Get the shoppingcart of this customer

        // When a cart is present, use the static processCartPayment method to
        // 'checkout'
        // andThen remove the cart from the customer (using the
        // removeShoppingCart method on the Customer class

        Consumer<ShoppingCart> consumer1 = ShopService::processCartPayment;
        Consumer<ShoppingCart> consumer2 = customer::removeShoppingCart;

        customer.getShoppingCart().ifPresent(consumer1.andThen(consumer2));


    }

    private static void processCartPayment(ShoppingCart cart) {
        String msg = String.format(
                "ShopService: Processing payment of cart (%6.2f)",
                cart.getTotalItemPrice());
        System.out.println(msg);
    }

    public Collection<Customer> getCustomers() {
        return shop.getCustomers();
    }
}
