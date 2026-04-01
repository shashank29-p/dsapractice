package org.example.aws;

import com.amazonaws.services.ec2.AmazonEC2;
import com.amazonaws.services.ec2.model.InstanceNetworkInterfaceSpecification;
import com.amazonaws.services.ec2.model.RunInstancesRequest;

public class CreateEc2Instance {

  public static void main(String[] args) {
    AwsConfiguration awsConfiguration=new AwsConfiguration();
    AmazonEC2 amazonEC2=awsConfiguration.createEc2Client();
//ami-0b4c74d41ee4bed78
    RunInstancesRequest runInstancesRequest=new RunInstancesRequest().
    withInstanceType("t2.micro")
        .withImageId("ami-0b4c74d41ee4bed78")
        .withMaxCount(1)
        .withMinCount(1)
        .withNetworkInterfaces(new InstanceNetworkInterfaceSpecification().
            withSubnetId("subnet-09bd7339af2e6d5cb")
            .withGroups()
            .withAssociatePublicIpAddress(true));
  }

}
