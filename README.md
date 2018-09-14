# login-register-with-Firebase
Firebase by platform Firebase gives you the tools to develop high-quality apps, grow your user base, and earn more money. We cover the essentials so you can monetize your business and focus on your users.

this is login and register android with firebase. firebase for the database(backend)


Add Firebase to your app
If you're using Android Studio version 2.2 or later, the Firebase Assistant is the simplest way to connect your app to Firebase. The Assistant can connect your existing project or create a new one for you with all the necessary gradle dependencies.

If you're using an older version of Android Studio or have a more complex project configuration, you can still manually add Firebase to your app.

Use the Firebase Assistant
To open the Firebase Assistant in Android Studio:

1. Click Tools > Firebase to open the Assistant window.
2. Click to expand one of the listed features (for example, Analytics), then click the provided tutorial link (for example, Log an Analytics event).
3. Click the Connect to Firebase button to connect to Firebase and add the necessary code to your app.
That's it! You can skip ahead to the next steps.

Manually add Firebase
It's time to add Firebase to your app. To do this you'll need a Firebase project and a Firebase configuration file for your app.

To create a Firebase project:

1. Create a Firebase project in the Firebase console, if you don't already have one. Click Add project. If you already have an existing Google project associated with your mobile app, select it from the Project name drop down menu. Otherwise, enter a project name to create a new project.
2. Optional: Edit your Project ID. Your project is given a unique ID automatically, and it's used in publicly visible Firebase features such as database URLs and your Firebase Hosting subdomain. You can change it now if you want to use a specific subdomain.
3. Follow the remaining setup steps and click Create project (or Add Firebase if you're using an existing project) to begin provisioning resources for your project. This typically takes a few minutes. When the process completes, you'll be taken to the project overview.

Now that you have a project, you can add your Android app to it:

1. Click Add Firebase to your Android app and follow the setup steps. If you're importing an existing Google project, this may happen automatically and you can just download the config file.
2. When prompted, enter your app's package name. It's important to enter the package name your app is using; this can only be set when you add an app to your Firebase project.
3. During the process, you'll download a google-services.json file. You can download this file again at any time.
4. After you add the initialization code, run your app to send verification to the Firebase console that you've successfully installed Firebase.

learn : https://firebase.google.com/docs/android/setup?authuser=3
