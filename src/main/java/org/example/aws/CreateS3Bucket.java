package org.example.aws;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.CannedAccessControlList;
import com.amazonaws.services.s3.model.CreateBucketRequest;

public class CreateS3Bucket {

  public static void main(String[] args) {
    try {
      AwsConfiguration awsConfiguration = new AwsConfiguration();
      AmazonS3 amazonS3Client = awsConfiguration.createS3Client();
      CreateBucketRequest createBucketRequest = new CreateBucketRequest("testbucketjavawithsdk",
          "eu-central-1").withCannedAcl(CannedAccessControlList.BucketOwnerFullControl);
      amazonS3Client.createBucket(createBucketRequest);
    }catch (Exception e){
      throw new RuntimeException(e.getMessage());
    }
  }

}
