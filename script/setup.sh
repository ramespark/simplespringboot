#!/bin/bash
sudo nohup fuser -k 80/tcp
sudo nohup java -jar simplerestuser-0.0.1-SNAPSHOT.jar > /home/ubuntu/log.txt &
