# THSE
A spring boot application

# SQL Schema

user table(

				id INT AUTO_INCREMENT  PRIMARY KEY,
						
                              first_name VARCHAR(250) NOT NULL,
															
                              last_name VARCHAR(250) NOT NULL,
															
                              role VARCHAR(250) DEFAULT NULL
															
															
)

priority (
                              
	priority VARCHAR2 PRIMARY KEY
															
)

Initially priority table contanins [('Connection'),('Relationships'),('Career'),('Wealth')]. More priorities be added by an user having admin privileges

# Document Database Schema

response collection

  {
	
    "id": 1, // is unique for an user and must be present in sql user table
    "response" : [
        {"priority": "Connection", "satisfaction": 2},
        {"priority": "Career", "satisfaction": 3},
        {"priority": "Relationships", "satisfaction": 4},
        {"priority": "Wealth", "satisfaction": 5}
    ]
} 

the response is an array consisting of priority rating. 

The order of insertion defines the priority, whith lower index entry having higher priority

Each entry has a satisfaction field having value between 1-5

# API Endpoints

1. Users get all -> http://localhost:9999/v1/api/users/ (method: get)

2. Users get by Id -> http://localhost:9999/v1/api/users/id   (id is an integer) (method: get)

3. Set prirority for an user -> http://localhost:9999/v1/api/priority/setPrioritiesForUser/id (method: post)(id is unique to an user and must be present in the user table)

  body -> {
	
    "id": 1,
    "response" : [
        {"priority": "Connection", "satisfaction": 2},
        {"priority": "Career", "satisfaction": 3},
        {"priority": "Relationships", "satisfaction": 4},
        {"priority": "Wealth", "satisfaction": 5}
    ]
}

4. get priority response of an user -> http://localhost:9999/v1/api/priority/getPrioritiesForUser/id (id is unique to an user and must be present in the user table) (method: get)


# Technologies Used

SQL -> H2 inmemory db, can be replaced by any traditional sql db

Documennt Database -> Mongo DB

Backend -> Spring boot



