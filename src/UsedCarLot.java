import java.util.ArrayList;
public class UsedCarLot {
    private ArrayList<Car> inventory;

    public UsedCarLot(){

        inventory = new ArrayList<Car>();
    }

    public ArrayList<Car> getInventory(){

        return inventory;
    }

    public void addCar (Car carToAdd){
        inventory.add(carToAdd);
    }

    public boolean swap (int first, int second){
        if (first < inventory.size() && second < inventory.size()){
            Car car1 = inventory.get(first);
            Car car2 = inventory.get(second);
            inventory.set(first, car2);
            inventory.set(second, car1);
            return true;
        } else {
            return false;
        }
    }
    /* Adds a Car to the inventory list at the index specified
      by indexToAdd; this method increases the size of inventory by 1
      PRECONDITION: 0 <= indexToAdd < inventory.size()
      DUE TO THIS PRECONDITION, you do NOT need to check for boundary errors
      like you did the other addCar method; also note that this method is void
  */
    public void addCar(int indexToAdd, Car carToAdd) {
       inventory.add(indexToAdd, carToAdd);
    }

    /* "sells" the Car located at indexOfCarToSell which
        removes it from the inventory list and shifts the remaining
        Cars in the inventory list to the left to fill in the gap;
        this method reduces the size of inventory by 1

        Returns the Car that is being "sold" (removed from lot)

        PRECONDITION: indexOfCarToSell < inventory.size()

        HINT: the ArrayList remove() method returns the removed element while also
              removing it from the ArrayList
      */
    public Car sellCarShift(int indexOfCarToSell) {
       Car carSold = inventory.remove(indexOfCarToSell);

       return carSold;
    }

    /* "sells" the Car located at indexOfCarToSell,
       but instead of removing it and shifting the inventory
       list to the left, REPLACE the Car at indexOfCarToSell
       with NULL, thus creating an "empty parking spot" on the lot;
       this method does NOT reduce the size of inventory by 1

       PRECONDITION: indexOfCarToSell < inventory.size()

       This method returns the Car that is being "sold" (replaced with null)
     */
    public Car sellCarNoShift(int indexOfCarToSell) {
        Car sold = inventory.set(indexOfCarToSell, null);
        return sold;
    }

    /* moves Car located at index indexOfCarToMove to index destinationIndex;
       all other cars in the inventory should shift accordingly

       PRECONDITIONS: indexOfCarToMove < inventory.size()
                      destinationIndex < inventory.size()
     */
    public void moveCar(int indexOfCarToMove, int destinationIndex) {
        Car carMove = inventory.remove(indexOfCarToMove);
        inventory.add(destinationIndex, carMove);
    }


}
