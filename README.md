# AndroidMVP

<img src="https://miro.medium.com/max/1280/1*HoHOQmr79f-SnoWGsuh1OQ.jpeg">

<b>Model–view–presenter (MVP)</b> is a derivation of the model–view–controller (MVC) architectural pattern which mostly used for building user interfaces. In MVP, the presenter assumes the functionality of the “middle-man”. In MVP, all presentation logic is pushed to the presenter. MVP advocates separating business and persistence logic out of the Activity and Fragment
Differences between MVC and MVP
### Model View Controller
Controllers are behavior based and can share multiple views.
View can communicate directly with Model
### Model View Presenter
View more separated from Model. The Presenter is the mediator between Model and View.
Easier to create unit tests
Generally there is a one to one mapping between View and Presenter, with the possibility to use multiple Presenters for complex Views
Listen to user action and model updates
Updates model and view as well
#### Model
In an application with a good layered architecture, this model would only be the gateway to the domain layer or business logic. See it as the provider of the data we want to display in the view. Model’s responsibilities include using APIs, caching data, managing databases and so on.
#### View
The View, usually implemented by an Activity, will contain a reference to the presenter. The only thing that the view will do is to call a method from the Presenter every time there is an interface action.
#### Presenter
The Presenter is responsible to act as the middle man between View and Model. It retrieves data from the Model and returns it formatted to the View. But unlike the typical MVC, it also decides what happens when you interact with the View.


Source: https://medium.com/cr8resume/make-you-hand-dirty-with-mvp-model-view-presenter-eab5b5c16e42
