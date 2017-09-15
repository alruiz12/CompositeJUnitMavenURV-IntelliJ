# CompositeJUnitMavenURV-IntelliJ

Simple Java Composite pattern with [JUnit](http://junit.org/junit4/) Unit Testing build with [Maven](https://maven.apache.org/) for teaching purposes.

[![Build Status](https://travis-ci.org/alruiz12/CompositeJUnitMavenURV-IntelliJ.svg?branch=master)](https://travis-ci.org/alruiz12/CompositeJUnitMavenURV-IntelliJ)
[![codecov](https://codecov.io/gh/alruiz12/CompositeJUnitMavenURV-IntelliJ/branch/master/graph/badge.svg)](https://codecov.io/gh/alruiz12/CompositeJUnitMavenURV-IntelliJ)
[![Code Health](https://landscape.io/github/alruiz12/CompositeJUnitMavenURV-IntelliJ/master/landscape.svg?style=flat)](https://landscape.io/github/alruiz12/CompositeJUnitMavenURV-IntelliJ/master)


## Necessary to run the project

### Maven

Maven plugin should be installed be default, otherwise install it.

### JUnit

Install JUnit:

IntelliJ: File > Project Structure > Libraries > '+' (green add symbol) > From Maven > search "junit" > select "junit:junit:4.12" > OK




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

IntelliJ: File > New > Project > Maven > Next > Fill in Group Id and Artifact Id > Next > Select parent folder > Enable Auto-import in pop-up (bottom right)
