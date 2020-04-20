#!/bin/bash
scp -o StrictHostKeyChecking=no -i ./listudy.pem ./simplerestuser-0.0.1-SNAPSHOT.jar ubuntu@13.233.114.151:/home/ubuntu/simplerestuser-0.0.1-SNAPSHOT.jar
ssh -o StrictHostKeyChecking=no -i ./listudy.pem ubuntu@13.233.114.151  sudo /home/ubuntu/setup.sh
