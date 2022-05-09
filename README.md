
# SWAPI-Android-SDK

This repository contains the code for the Swapi library.

# Java Version

The Java version of this codelab is available under the build.app branch of this repository.

# Pre-requisites

Make sure Android Studio is updated, as well as your SDK and Gradle. Otherwise, you may have to wait for a while until all the updates are done.

A device or emulator that runs API level 31.

# How to use it

Create a separate library of SWAPI and add library in build. App folder.

    implementation project (path: ':SWAPI_Lib') 

Base Request URL:- https://swapi.dev/api/

Import and call the Swapi client services.

    SWClient.getService();

In your activities or fragment you may fire every API call you want.

**People**

A People resource is an individual person or character within the Star Wars universe.

#Endpoints

**/people/** -- get all the people resources

        @GET("people/") 
		Call<SWModelList<SWPeople>> getAllPeople(); 

        Call API Response: - 

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

**/people/:id/** -- get a specific people resource

            @GET("people/{id}") 
            Call<SWPeople> getPeople(@Path("id") int peopleId); 

            Call API Response: - 

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

**/people/schema/** -- view the JSON schema for this resource

		    @GET("people") 
		    Call<SWModelList<SWPeople>> getPeopleSearch(@Query("search") String 	                search); 
 
            Call API Response: - 

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


#Getting Started

        Install Android Studio, if you don't already have it. 
        Download the sample. 
        Import the sample into Android Studio. 
        Build and run the sample. 