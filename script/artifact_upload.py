import boto3
import os
from botocore.exceptions import NoCredentialsError

def upload_to_aws(local_file, bucket, s3_file):

    print(os.getenv('ACC'))

    s3 = boto3.client('s3', aws_access_key_id=os.getenv('ACC'),
                      aws_secret_access_key=os.getenv('SEC'))

    try:
        s3.upload_file(local_file, bucket, s3_file)
        print("Upload Successful")
        return True
    except NoCredentialsError:
        print("Credentials not available")
        return False


uploaded = upload_to_aws('./build/libs/simplerestuser-0.0.1-SNAPSHOT.jar', 'springartifacts', 'simplerestuser.jar')