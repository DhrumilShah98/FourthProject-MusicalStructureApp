# Udacity and Google India Scholarship Program
## Android Basics Nanodegree Project 4 "Musical Structure"
## Name of App - "Musical"

<b>PROJECT SPECIFICATION</b>

1. The app’s structure is suitable for a music player app. A similarly structured app which focuses on audiobooks, podcasts, or other audio media is also acceptable.

2. The purpose of each activity is easy for a user to understand through the UI design and feature labeling.

3. The app contains 2 to 6 activities.

4. The app contains multiple activities, each labelled, which together make a cohesive music app.

5. Features in the app are clearly defined either by labelling or images. For example, a button to play music could use a universally recognized triangular "Play" symbol or could have the text label "Play".

6. Each activity contains button(s) which link it to other activities a user should be able to reach from that activity. For instance, a ‘Library’ activity might contain a button to move to the ‘Now Playing’ activity.

7. The code adheres to all of the following best practices:
   - Text sizes are defined in sp
   - Lengths are defined in dp
   - Padding and margin is used appropriately, such that the views are not crammed up against each other.
   - Each button’s behavior is determined by an OnClickListener in the Java code rather than by the android:onClick attribute in the XML Layout.

8. Each button properly opens the intended activity using an explicit Intent.

9. App uses a custom adapter to populate the layout with views based on instances of the custom class.

10. Information about instances of the custom class are stored in an appropriate data structure (e.g. ArrayList, Array). When the information needs to be displayed, it is efficiently retrieved (e.g. Looping).

11. Data about each song (or equivalent audio media such as podcast episode) should be stored in a custom class that contains at least 2 states (e.g. Song Name, Artist Name) If images are included (e.g. Album Art), they are stored as drawables. All drawables are stored at multiple densities. Images are not required.

<b> About Musical App </b>

The app contains 3 activities.
 - MainActivity
 - SongsInAlbumActivity
 - NowPlayingActivity

This app only shows the structure of the app and how the app transit from one Activity to another Activity. (eg: From MainActivity 
to NowPlayingActivity etc...)

## Musical App Images
### Portrait
The below two images show how the app transit from MainActivity to NowPlayingActivity

<img src = "Musical%20Images/6..PNG" width="300px" height="550px" > <img src = "Musical%20Images/3..PNG" width="300px" height="550px">

The below three images show how the app transit from MainActivity to SongsInAlbumActivity and from SongsInAlbumActivity to NowPlayingActivity.

<img src = "Musical%20Images/2..PNG" width="250px" height="500px" > <img src = "Musical%20Images/4..PNG" width="250px" height="500px"> <img src = "Musical%20Images/5..PNG" width="250px" height="500px">
