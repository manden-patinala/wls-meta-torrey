#!/bin/bash

echo "WLS Pro startup shell script"

# Change to scripts directory
cd /home/user/scripts

###########################################################
#  Executions releated to hardware initialization processes 
###########################################################
bash wls_hw_startup.sh -start

###########################################################
#  Executions releated to software initialization processes 
###########################################################
bash wls_sw_startup.sh -start
