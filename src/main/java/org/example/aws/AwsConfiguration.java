package org.example.aws;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.cognitoidp.model.AWSCognitoIdentityProviderException;
import com.amazonaws.services.ec2.AmazonEC2;
import com.amazonaws.services.ec2.AmazonEC2ClientBuilder;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;

public class AwsConfiguration {


  private static final String ACCESSKEY = "AKIAVXPWVRFJB57COROE";

  private static final String SECRETKEY = "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";

  private static final String REGION = "eu-central-1";


  public AmazonS3 createS3Client() {
    try {
      BasicAWSCredentials basicAWSCredentials = new BasicAWSCredentials(ACCESSKEY, SECRETKEY);
      return AmazonS3ClientBuilder.standard()
          .withCredentials(new AWSStaticCredentialsProvider(basicAWSCredentials))
          .withRegion(REGION)
          .build();
    }catch (Exception e){
      e.printStackTrace();
      throw new AWSCognitoIdentityProviderException(e.getMessage());
    }
  }

  public AmazonEC2 createEc2Client(){
    try {
      BasicAWSCredentials basicAWSCredentials = new BasicAWSCredentials(ACCESSKEY, SECRETKEY);
      return AmazonEC2ClientBuilder.standard()
          .withCredentials(new AWSStaticCredentialsProvider(basicAWSCredentials))
          .withRegion(Regions.US_EAST_1)
          .build();
    }catch (Exception e){
      e.printStackTrace();
      throw new AWSCognitoIdentityProviderException(e.getMessage());
    }
  }
}
