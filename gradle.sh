#!/usr/bin/env bash
gradle clean fatJar
java -jar build/libs/fatjar.jar


