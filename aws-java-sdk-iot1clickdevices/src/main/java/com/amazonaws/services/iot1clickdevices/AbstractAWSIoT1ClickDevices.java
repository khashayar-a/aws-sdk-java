/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.iot1clickdevices;

import javax.annotation.Generated;

import com.amazonaws.services.iot1clickdevices.model.*;
import com.amazonaws.*;

/**
 * Abstract implementation of {@code AWSIoT1ClickDevices}. Convenient method forms pass through to the corresponding
 * overload that takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSIoT1ClickDevices implements AWSIoT1ClickDevices {

    protected AbstractAWSIoT1ClickDevices() {
    }

    @Override
    public ClaimDevicesByClaimCodeResult claimDevicesByClaimCode(ClaimDevicesByClaimCodeRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeDeviceResult describeDevice(DescribeDeviceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public FinalizeDeviceClaimResult finalizeDeviceClaim(FinalizeDeviceClaimRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetDeviceMethodsResult getDeviceMethods(GetDeviceMethodsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public InitiateDeviceClaimResult initiateDeviceClaim(InitiateDeviceClaimRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public InvokeDeviceMethodResult invokeDeviceMethod(InvokeDeviceMethodRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListDeviceEventsResult listDeviceEvents(ListDeviceEventsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListDevicesResult listDevices(ListDevicesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public TagResourceResult tagResource(TagResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UnclaimDeviceResult unclaimDevice(UnclaimDeviceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UntagResourceResult untagResource(UntagResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateDeviceStateResult updateDeviceState(UpdateDeviceStateRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void shutdown() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public com.amazonaws.ResponseMetadata getCachedResponseMetadata(com.amazonaws.AmazonWebServiceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

}
