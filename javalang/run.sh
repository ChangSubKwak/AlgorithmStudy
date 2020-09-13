#!/bin/bash
javac -encoding utf-8 $1.java
java -cp .. javalang.$1
