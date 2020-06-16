#!/bin/bash
#javac $1.java
javac -encoding utf-8 $1.java
#cd ../
#java -cp . -Dfile.encoding=UTF-8 first.$1
#java -cp . -Dfile.encoding=UTF-8 $1
#java -cp . first.$1
java -cp . $1
