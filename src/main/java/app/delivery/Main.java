/* Tomas Hornicek 
 * 03/10/2022
 * METCS622
 * This file is the main class, used for testing the code
 * */
package app.delivery;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		// Initialize driver list
		ArrayList<SubscriberBase> deliveryDriverListMeijer = new ArrayList<SubscriberBase>();
		ArrayList<SubscriberBase> deliveryDriverListWallmart = new ArrayList<SubscriberBase>();
		
		// Initialize delivery list
		ArrayList<DeliveryRequest> productDeliveryList = new ArrayList<DeliveryRequest>();
		
		// Initialize shop
		Shop wallmart = new Shop("Wallmart");
		
		Shop meijer = new Shop("Meijer");
		
		// Create a delivery request
		DeliveryRequest newDelivery = new DeliveryRequest("banana", wallmart, deliveryDriverListWallmart);
		productDeliveryList.add(newDelivery);
		// Initialize drivers
		Driver Joe = new Driver("Joe", wallmart);
		Driver John = new Driver("John", wallmart);
		Driver Mike = new Driver("Mike", meijer);
		
		// Add the drivers to the driver list
		deliveryDriverListWallmart.add(Joe);
		deliveryDriverListWallmart.add(Mike);
		deliveryDriverListMeijer.add(John);
		
		DeliveryRequest newerDelivery = new DeliveryRequest("apple", meijer, deliveryDriverListMeijer);
		productDeliveryList.add(newerDelivery);
		
		// Send out the delivery request
		wallmart.setDeliveryRequest(productDeliveryList);
		meijer.setDeliveryRequest(productDeliveryList);
		
	}

}
