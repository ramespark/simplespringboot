#!/bin/sh
pip3 install boto3
export SECRET_KEY=zL0RH765GrGdWRAxxSCw6Kc8LC2MMM5xIN8T9Lsm
export ACCESS_KEY=AKIAYJV6UWZH6GWXDCHE
python3 ./script/artifact_upload.py
