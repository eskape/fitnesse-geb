FitNesse-Geb integration
========================
This project combines [FitNesse](http://www.fitnesse.org) and [Geb](http://www.gebish.org/).

Features
--------

* Full Geb - FitNesse Integration roundtrip
* Using gradle - thanks to Arjan Molenaar - [gradle fitnesse classpath builder](https://github.com/amolenaar/gradle-fitnesse-classpath-builder)
* Data-driven Google Search test.

Getting Started
---------------

Execute the following command:

	$ gradle wiki

Open a browser, pointing at http://localhost:8000
You can alter browsers by modifying the system property: gebEnvironment

Execute the following command to run with Firefox:

    $ gradle wiki -DgebEnvironment=firefox
    
 
