# CompositeJUnitMavenURV

Simple Java Composite pattern with [JUnit](http://junit.org/junit4/) Unit Testing build with [Maven](https://maven.apache.org/) for teaching purposes.

[![Build Status](https://travis-ci.org/alruiz12/CompositeJUnitMavenURV.svg?branch=master)](https://travis-ci.org/alruiz12/CompositeJUnitMavenURV)
[![codecov](https://codecov.io/gh/alruiz12/CompositeJUnitMavenURV/branch/master/graph/badge.svg)](https://codecov.io/gh/alruiz12/CompositeJUnitMavenURV)
[![Code Health](https://landscape.io/github/alruiz12/CompositeJUnitMavenURV/master/landscape.svg?style=flat)](https://landscape.io/github/alruiz12/CompositeJUnitMavenURV/master)


## Necessary to run the project

### Maven

Install Maven plugin (if not installed):

Eclipse: Help > Eclipse Marketplace > Write "Maven" > Hit "Go" > Install "Maven Integration for Eclipse"

### JUnit

Install JUnit:

Eclipse: File > Properties > Java Build Path > Libraries > Add External Jars > plugins > org.junit_4.12 > Apply




## Continuous Integration and Code Metrics

### Travis CI

Create your [Travis](https://travis-ci.com/) account by signing up with github.

Enable your repository by flicking the repository switch on.

Add a .travis.yml file to your repository with at least the following:
```
language: java
```

Trigger your build with a git push.

Copy and paste your markdown badge from the title badge of the project page and paste it on your README.md


### Codecov

Create your [codecov](https://codecov.io/) account by signing up with github.

Follow the official java-Maven [guidelines](https://github.com/codecov/example-java-maven)

Trigger your build with a git push.

Copy and paste your markdown badge from the project Settings > Badge and paste it on your README.md

### Health

Create your [landscape.io](https://landscape.io/) account by signing up with github.
 
 Hit "Add Repository" from the right panel.
 
 Click on "Everything" under the Language menu.
 
 Select your repository from the list.
 
 Trigger your build with a git push and refresh the browser.
 
 Copy and paste your markdown badge from the top right corner of the project page and paste it on your README.md

 


## Create your own Maven project

Eclipse: File > New > Other > Maven Project > Create simple project > Fill in Group Id and Artifact Id > Finish
