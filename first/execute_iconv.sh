#!/bin/bash
#iconv -f euc-kr -t utf-8 $1 $2
iconv -f euc-kr -t utf-8 $1 > $2
