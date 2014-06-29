FitNesse-Geb integration
========================
This project combines [FitNesse](http://www.fitnesse.org) and [Geb](http://www.gebish.org/).

Features
--------

* Full Geb - FitNesse Integration roundtrip
* Data-driven Google Search test.

Getting Started
---------------

Execute the following command:

	$ mvn -Pfitnesse test

Open a browser, pointing at http://localhost:8000
You can alter browsers by modifying the system property: geb.env

Execute the following command to run with firefox:

    $ mvn -Pfitnesse test -Dgeb-env=firefox
    
 
