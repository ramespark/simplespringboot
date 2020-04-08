import boto3
import os
from botocore.exceptions import NoCredentialsError

ACCESS_KEY = 'AKIAYJV6UWZHUXWRUZNQ'
SECRET_KEY = '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'


def upload_to_aws(local_file, bucket, s3_file):
    s3 = boto3.client('s3', aws_access_key_id=os.environ['ACCESS_KEY'],
                      aws_secret_access_key=os.environ['SECRET_KEY'])

    try:
        s3.upload_file(local_file, bucket, s3_file)
        print("Upload Successful")
        return True
    except NoCredentialsError:
        print("Credentials not available")
        return False


uploaded = upload_to_aws('../build/libs/simplerestuser-0.0.1-SNAPSHOT.jar', 'springartifacts', 'simplerestuser.jar')