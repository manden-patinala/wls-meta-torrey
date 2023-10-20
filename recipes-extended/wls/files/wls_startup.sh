#!/bin/bash

echo "WLS Pro startup shell script"

#cd /home/user/scripts
#bash wlpro_database_operations.sh -ccreate

cd /home/user
./scripts/ExecColorScale.sh -tTarget &
sleep 5
./backend/WeightAD &

