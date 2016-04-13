# Microblog

## Description

Make a web application that allows you write short messages. When you click "Submit", it will refresh and show a list of messages you wrote.

## Requirements

* Add the Spark and Mustache libraries in Project Structure.
  * `com.sparkjava:spark-core:2.3`
  * `com.sparkjava:spark-template-mustache:2.3`
* Create a `resources` folder in Project Structure and mark it with the "Resources" designation.
* Create a `templates` folder inside of it.
* Create `resources/templates/index.html` which looks like in the first screenshot below.
* Create a GET route for "/" and a POST route for "/create-user" and "/create-message".
* When the user hits submit in "index.html", it should post the name to "/create-user" which saves it in a user object and redirects to "/".
* Create `resources/templates/messages.html` which looks like the second screenshot below. It must display the name given by the user, and use Mustache templating to list the messages written by the user.
* When the user hits submit in "messages.html", it should post the text to "/create-message" which saves it in an `ArrayList<Message>` and redirects to "/" (i.e. refreshes the page).
* Optional: In "index.html", add a password field. If the user doesn't exist, have it behave like usual; if it does exist, then check the password and return an error if it is wrong.
* Optional: Add styling with CSS.

![screenshot1.png](https://tiy-learn-content.s3.amazonaws.com/7dd46f2a-screenshot1.png)
![screenshot2.png](https://tiy-learn-content.s3.amazonaws.com/aa694c84-screenshot2.png)
