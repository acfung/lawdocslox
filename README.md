lawdocslox
==========

Project for a cloud based secure file exchange system using keys held by end users

Technology stack:

keyserver:
	Java7
	Tomcat7
	Spring MVC 3.2
	Jackson json 1.9.13
	Maven 3.1.1


Keyserver Architecture
----------------------

The keyserver is split into 2 Maven projects, the keyserv and keyservapp.
keyserv is a web project that is used to build the war files. 

keyservapp is the main project which is used to build the jar files. All the 
application level logic will go into keyservapp; this will simplify updating the
web application since the jar files generated by building keyservapp can be
used to overwrite the jars deployed by Tomcat when it explodes the keyserv 
war file.
