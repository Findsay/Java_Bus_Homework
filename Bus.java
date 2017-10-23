class Bus{
  private String route;
  private Person[] passengers;

  public Bus(String route){
    this.route = route;
    this.passengers = new Person[40];
  }

  public String route(){
    return this.route;
  }

  public int count(){
    int counter = 0;
    for(Person person : passengers){
      if(person != null){
        counter++;
      }
    }
    return counter;
  }

  public void pickUp(Person person){
    if(!isBusFull()){
      int countPeople = count();
      this.passengers[countPeople]= person;
    }
  }

  public boolean isBusFull(){
    return count() == passengers.length;
  }



}
