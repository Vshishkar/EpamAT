#Qatar airlines test cases

#Case 1: Renting a car. Checking if it's possible to find a Car at unreal City
  - 1 Visit https://www.qatarairways.com/en/homepage.html
  - 2  Go to "Book" Tab
  - 3 Press button "Rent a car"
  - 3 Type unreal City
  - 4 Press button Search
    Response: could not get a Car


#Case 2: Booking a plane. Checking if it's possible to book a plane with empty fields
  - 1 Visit https://www.qatarairways.com/en/homepage.html
  - 2 Press "Show flights" at flight form   
    Response: Departure airport is missing
              Destination airport is missing
              Please select the number of passengers.

#Case 3: Booking a plane. Checking if it's possible to book a plane with the same "from" and "to" destinations
    - 1 Visit https://www.qatarairways.com/en/homepage.html
    - 2 Type "Minsk" as from
    - 3 Type "Minsk" as to
    - 4 Use default values at other fields
    - 5 Press button "Show flights"
