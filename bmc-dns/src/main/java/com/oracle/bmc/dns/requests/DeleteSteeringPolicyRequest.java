/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.dns.requests;

import com.oracle.bmc.dns.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180115")
@lombok.Builder(builderClassName = "Builder", buildMethodName = "buildWithoutInvocationCallback")
@lombok.Getter
public class DeleteSteeringPolicyRequest extends com.oracle.bmc.requests.BmcRequest {

    /**
     * The OCID of the target steering policy.
     */
    private String steeringPolicyId;

    /**
     * The `If-Match` header field makes the request method conditional on the
     * existence of at least one current representation of the target resource,
     * when the field-value is `*`, or having a current representation of the
     * target resource that has an entity-tag matching a member of the list of
     * entity-tags provided in the field-value.
     *
     */
    private String ifMatch;

    /**
     * The `If-Unmodified-Since` header field makes the request method
     * conditional on the selected representation's last modification date being
     * earlier than or equal to the date provided in the field-value.  This
     * field accomplishes the same purpose as If-Match for cases where the user
     * agent does not have an entity-tag for the representation.
     *
     */
    private String ifUnmodifiedSince;

    public static class Builder {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;

        /**
         * Set the invocation callback for the request to be built.
         * @param invocationCallback the invocation callback to be set for the request
         * @return this builder instance
         */
        public Builder invocationCallback(
                com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                        invocationCallback) {
            this.invocationCallback = invocationCallback;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(DeleteSteeringPolicyRequest o) {
            steeringPolicyId(o.getSteeringPolicyId());
            ifMatch(o.getIfMatch());
            ifUnmodifiedSince(o.getIfUnmodifiedSince());
            invocationCallback(o.getInvocationCallback());
            return this;
        }

        /**
         * Build the instance of DeleteSteeringPolicyRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of DeleteSteeringPolicyRequest
         */
        public DeleteSteeringPolicyRequest build() {
            DeleteSteeringPolicyRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            return request;
        }
    }
}
