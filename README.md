[![verify](https://github.com/bootique-examples/bootique-mvc-demo/actions/workflows/verify.yml/badge.svg)](https://github.com/bootique-examples/bootique-mvc-demo/actions/workflows/verify.yml)
# bootique-mvc-demo

Simple [Bootique](http://bootique.io) app demonstrating the Bootique MVC Module with Jetty, Jersey and Mustache.

You can find different versions of framework in use at
* [1.x](https://github.com/bootique-examples/bootique-mvc-demo/tree/1.x)
* [2.x](https://github.com/bootique-examples/bootique-mvc-demo/tree/2.x)

# Prerequisites
* Java 1.8 or newer.
* Apache Maven.

# Build the demo

```
git clone https://github.com/bootique-examples/bootique-mvc-demo.git
cd bootique-mvc-demo
mvn package
```
Enter the following to launch the app in Maven.

```bash
java -jar target/bootique-mvc-demo-1.0-SNAPSHOT.jar
```

After launching the app, go to

1. http://localhost:9999/ Get user info from model
2. http://localhost:9999/hello get hello page


