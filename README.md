# SWAPI-Android-SDK

This repository contains the code for the Swapi library.

# Java Version

The Java version of this codelab is available under the build.app branch of this repository.

# Pre-requisites

Make sure Android Studio is updated, as well as your SDK and Gradle. Otherwise, you may have to wait for a while until all the updates are done.

A device or emulator that runs API level 31.

# How to use it

Add dependency in build.app folder.

    implementation 'com.github.emorphisgit:Swapi_Android:1.0.0'

Import and call the Swapi client services.

    SWAPIInterface swapiInterface = SWClient.getService();

In your activities or fragment you may fire every API call you want.

**People**

A People resource is an individual person or character within the Star Wars universe.

**/people/** -- get all the people resources

            swapiInterface.getAllPeople();

**/people/:id/** -- get a specific people resource

            swapiInterface.getPeople(2);

**/people/schema/** -- view the JSON schema for this resource

		    swapiInterface.getPeopleSearch("r2");

**Films**


A Film resource is a single film.

**/films/** -- get all the film resources

		    swapiInterface.getAllFilms();

**/films/:id/** -- get a specific film resource

             swapiInterface.getFilm(2);

**Starships**


A Starship resource is a single transport craft that has hyperdrive capability.

**/starships/** -- get all the starship resources

             swapiInterface.getAllStarships();

**/starships/:id/** -- get a specific starship resource

             swapiInterface.getStarship(2);

**Vehicles**


**/vehicles/** -- get all the vehicle resources

              swapiInterface.getAllVehicles();

**/vehicles/:id/** -- get a specific vehicle resource

               swapiInterface.getVehicle(4);

#Inside Library Module API's structure

            **Ex:- //Get AllPeople structure**
        
             Call<SWModelList<SWPeople>> call = swapiInterface.getAllPeople(); 

                call.enqueue(new Callback<SWModelList<SWPeople>>() { 

                @Override 

            public void onResponse(@NonNull Call<SWModelList<SWPeople>> call, @NonNull        	            Response<SWModelList<SWPeople>> response) { 

                Log.d(TAG, response.body() + ""); 

            } 
            @Override 

            public void onFailure(@NonNull Call<SWModelList<SWPeople>> call, @NonNull Throwable t) { 

                call.cancel(); 

                Log.d(TAG, t.toString()); 

               } 

            });
            
            **Ex:- //Get AllPeople By Id structure**

            Call<SWPeople> call = swapiInterface.getPeople(2); 
            call.enqueue(new Callback<SWPeople>() { 
                @Override 
            public void onResponse(@NonNull Call<SWPeople> call, @NonNull Response<SWPeople> response) { 
                Log.d(TAG, response.body() + ""); 
        
            } 
 
            @Override 
                public void onFailure(@NonNull Call<SWPeople> call, @NonNull Throwable t) { 
                call.cancel(); 
                Log.d(TAG, t.toString()); 
        
                } 
             });
             
            **Ex:- //Get AllPeople Search Schema structure**
            
            Call<SWModelList<SWPeople>> call = swapiInterface.getPeopleSearch("r2");
            call.enqueue(new Callback<SWModelList<SWPeople>>() { 
            
            @Override 
            public void onResponse(@NonNull Call<SWModelList<SWPeople>> call, @NonNull Response<SWModelList<SWPeople>> response) { 
            Log.d(TAG, response.body() + ""); 
            } 
 
            @Override 
            public void onFailure(@NonNull Call<SWModelList<SWPeople>> call, @NonNull Throwable t) { 
            call.cancel(); 
            Log.d(TAG, t.toString()); 

             } 
        });   


**Getting Started**

        Install Android Studio, if you don't already have it. 
        Download the sample. 
        Import the sample into Android Studio. 
        Build and run the sample. 