#!/usr/bin/env bash
#install ivy
ant ivy
#download project dependencies
ant resolve
#Run ant
ant
java -jar dist/fatjar.jar
