README
======

The AWS Lambda archetype contains boilerplate code to get started with writing AWS Lambda in JAVA.

It adds support for:
1. A Lambda Handler with modelled Request and Response types.
2. A bunch of usually used source and test dependencies.
3. Build and distribution maven extensions.
4. Symphonia's lambda-logging support for pretty logs.

How to use it
-------------

Clone the package and run `mvn install`. 
Once installed, generate from the archetype by
````$xslt
mvn archetype:generate -DgroupId=com.mycompany.app -DartifactId=my-app -DarchetypeArtifactId=aws-lambda-archetype -DinteractiveMode=false
````

If you are using IntelliJ, you can add the archetype and generate your project graphically.

The project also supports the maven-s3-wagon plugin, so if store your artefacts in S3, you could store 
the archetype there and distribute it across your team.

Have fun!