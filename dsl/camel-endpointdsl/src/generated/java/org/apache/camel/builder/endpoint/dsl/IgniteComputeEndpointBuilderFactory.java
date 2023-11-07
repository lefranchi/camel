/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.builder.endpoint.dsl;

import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.stream.*;
import javax.annotation.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * Run compute operations on an Ignite cluster.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface IgniteComputeEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Ignite Compute component.
     */
    public interface IgniteComputeEndpointBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedIgniteComputeEndpointBuilder advanced() {
            return (AdvancedIgniteComputeEndpointBuilder) this;
        }
        /**
         * An expression that returns the Cluster Group for the IgniteCompute
         * instance.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.ignite.ClusterGroupExpression&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param clusterGroupExpression the value to set
         * @return the dsl builder
         */
        default IgniteComputeEndpointBuilder clusterGroupExpression(
                org.apache.camel.component.ignite.ClusterGroupExpression clusterGroupExpression) {
            doSetProperty("clusterGroupExpression", clusterGroupExpression);
            return this;
        }
        /**
         * An expression that returns the Cluster Group for the IgniteCompute
         * instance.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.component.ignite.ClusterGroupExpression&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param clusterGroupExpression the value to set
         * @return the dsl builder
         */
        default IgniteComputeEndpointBuilder clusterGroupExpression(
                String clusterGroupExpression) {
            doSetProperty("clusterGroupExpression", clusterGroupExpression);
            return this;
        }
        /**
         * The name of the compute job, which will be set via
         * IgniteCompute#withName(String).
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param computeName the value to set
         * @return the dsl builder
         */
        default IgniteComputeEndpointBuilder computeName(String computeName) {
            doSetProperty("computeName", computeName);
            return this;
        }
        /**
         * The compute operation to perform. Possible values: CALL, BROADCAST,
         * APPLY, EXECUTE, RUN, AFFINITY_CALL, AFFINITY_RUN. The component
         * expects different payload types depending on the operation.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.ignite.compute.IgniteComputeExecutionType&lt;/code&gt; type.
         * 
         * Required: true
         * Group: producer
         * 
         * @param executionType the value to set
         * @return the dsl builder
         */
        default IgniteComputeEndpointBuilder executionType(
                org.apache.camel.component.ignite.compute.IgniteComputeExecutionType executionType) {
            doSetProperty("executionType", executionType);
            return this;
        }
        /**
         * The compute operation to perform. Possible values: CALL, BROADCAST,
         * APPLY, EXECUTE, RUN, AFFINITY_CALL, AFFINITY_RUN. The component
         * expects different payload types depending on the operation.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.component.ignite.compute.IgniteComputeExecutionType&lt;/code&gt; type.
         * 
         * Required: true
         * Group: producer
         * 
         * @param executionType the value to set
         * @return the dsl builder
         */
        default IgniteComputeEndpointBuilder executionType(String executionType) {
            doSetProperty("executionType", executionType);
            return this;
        }
        /**
         * Sets whether to propagate the incoming body if the return type of the
         * underlying Ignite operation is void.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: producer
         * 
         * @param propagateIncomingBodyIfNoReturnValue the value to set
         * @return the dsl builder
         */
        default IgniteComputeEndpointBuilder propagateIncomingBodyIfNoReturnValue(
                boolean propagateIncomingBodyIfNoReturnValue) {
            doSetProperty("propagateIncomingBodyIfNoReturnValue", propagateIncomingBodyIfNoReturnValue);
            return this;
        }
        /**
         * Sets whether to propagate the incoming body if the return type of the
         * underlying Ignite operation is void.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: true
         * Group: producer
         * 
         * @param propagateIncomingBodyIfNoReturnValue the value to set
         * @return the dsl builder
         */
        default IgniteComputeEndpointBuilder propagateIncomingBodyIfNoReturnValue(
                String propagateIncomingBodyIfNoReturnValue) {
            doSetProperty("propagateIncomingBodyIfNoReturnValue", propagateIncomingBodyIfNoReturnValue);
            return this;
        }
        /**
         * The task name, only applicable if using the
         * IgniteComputeExecutionType#EXECUTE execution type.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param taskName the value to set
         * @return the dsl builder
         */
        default IgniteComputeEndpointBuilder taskName(String taskName) {
            doSetProperty("taskName", taskName);
            return this;
        }
        /**
         * The timeout interval for triggered jobs, in milliseconds, which will
         * be set via IgniteCompute#withTimeout(long).
         * 
         * The option is a: &lt;code&gt;java.lang.Long&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param timeoutMillis the value to set
         * @return the dsl builder
         */
        default IgniteComputeEndpointBuilder timeoutMillis(Long timeoutMillis) {
            doSetProperty("timeoutMillis", timeoutMillis);
            return this;
        }
        /**
         * The timeout interval for triggered jobs, in milliseconds, which will
         * be set via IgniteCompute#withTimeout(long).
         * 
         * The option will be converted to a
         * &lt;code&gt;java.lang.Long&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param timeoutMillis the value to set
         * @return the dsl builder
         */
        default IgniteComputeEndpointBuilder timeoutMillis(String timeoutMillis) {
            doSetProperty("timeoutMillis", timeoutMillis);
            return this;
        }
        /**
         * Sets whether to treat Collections as cache objects or as Collections
         * of items to insert/update/compute, etc.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param treatCollectionsAsCacheObjects the value to set
         * @return the dsl builder
         */
        default IgniteComputeEndpointBuilder treatCollectionsAsCacheObjects(
                boolean treatCollectionsAsCacheObjects) {
            doSetProperty("treatCollectionsAsCacheObjects", treatCollectionsAsCacheObjects);
            return this;
        }
        /**
         * Sets whether to treat Collections as cache objects or as Collections
         * of items to insert/update/compute, etc.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param treatCollectionsAsCacheObjects the value to set
         * @return the dsl builder
         */
        default IgniteComputeEndpointBuilder treatCollectionsAsCacheObjects(
                String treatCollectionsAsCacheObjects) {
            doSetProperty("treatCollectionsAsCacheObjects", treatCollectionsAsCacheObjects);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Ignite Compute component.
     */
    public interface AdvancedIgniteComputeEndpointBuilder
            extends
                EndpointProducerBuilder {
        default IgniteComputeEndpointBuilder basic() {
            return (IgniteComputeEndpointBuilder) this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer (advanced)
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default AdvancedIgniteComputeEndpointBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer (advanced)
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default AdvancedIgniteComputeEndpointBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
    }

    public interface IgniteComputeBuilders {
        /**
         * Ignite Compute (camel-ignite)
         * Run compute operations on an Ignite cluster.
         * 
         * Category: compute
         * Since: 2.17
         * Maven coordinates: org.apache.camel:camel-ignite
         * 
         * @return the dsl builder for the headers' name.
         */
        default IgniteComputeHeaderNameBuilder igniteCompute() {
            return IgniteComputeHeaderNameBuilder.INSTANCE;
        }
        /**
         * Ignite Compute (camel-ignite)
         * Run compute operations on an Ignite cluster.
         * 
         * Category: compute
         * Since: 2.17
         * Maven coordinates: org.apache.camel:camel-ignite
         * 
         * Syntax: <code>ignite-compute:endpointId</code>
         * 
         * Path parameter: endpointId (required)
         * The endpoint ID (not used).
         * 
         * @param path endpointId
         * @return the dsl builder
         */
        default IgniteComputeEndpointBuilder igniteCompute(String path) {
            return IgniteComputeEndpointBuilderFactory.endpointBuilder("ignite-compute", path);
        }
        /**
         * Ignite Compute (camel-ignite)
         * Run compute operations on an Ignite cluster.
         * 
         * Category: compute
         * Since: 2.17
         * Maven coordinates: org.apache.camel:camel-ignite
         * 
         * Syntax: <code>ignite-compute:endpointId</code>
         * 
         * Path parameter: endpointId (required)
         * The endpoint ID (not used).
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path endpointId
         * @return the dsl builder
         */
        default IgniteComputeEndpointBuilder igniteCompute(
                String componentName,
                String path) {
            return IgniteComputeEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }

    /**
     * The builder of headers' name for the Ignite Compute component.
     */
    public static class IgniteComputeHeaderNameBuilder {
        /**
         * The internal instance of the builder used to access to all the
         * methods representing the name of headers.
         */
        private static final IgniteComputeHeaderNameBuilder INSTANCE = new IgniteComputeHeaderNameBuilder();

        /**
         * Allows you to dynamically change the compute operation to perform.
         * 
         * The option is a: {@code
         * org.apache.camel.component.ignite.compute.IgniteComputeExecutionType}
         * type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code IgniteComputeExecutionType}.
         */
        public String igniteComputeExecutionType() {
            return "CamelIgniteComputeExecutionType";
        }

        /**
         * Parameters for APPLY, BROADCAST and EXECUTE operations.
         * 
         * The option is a: {@code Any object or Collection of objects} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code IgniteComputeParameters}.
         */
        public String igniteComputeParameters() {
            return "CamelIgniteComputeParameters";
        }

        /**
         * Reducer for the APPLY and CALL operations.
         * 
         * The option is a: {@code org.apache.ignite.lang.IgniteReducer} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code IgniteComputeReducer}.
         */
        public String igniteComputeReducer() {
            return "CamelIgniteComputeReducer";
        }

        /**
         * Affinity cache name for the AFFINITY_CALL and AFFINITY_RUN
         * operations.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code
         * IgniteComputeAffinityCacheName}.
         */
        public String igniteComputeAffinityCacheName() {
            return "CamelIgniteComputeAffinityCacheName";
        }

        /**
         * Affinity key for the AFFINITY_CALL and AFFINITY_RUN operations.
         * 
         * The option is a: {@code Object} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code IgniteComputeAffinityKey}.
         */
        public String igniteComputeAffinityKey() {
            return "CamelIgniteComputeAffinityKey";
        }
    }
    static IgniteComputeEndpointBuilder endpointBuilder(
            String componentName,
            String path) {
        class IgniteComputeEndpointBuilderImpl extends AbstractEndpointBuilder implements IgniteComputeEndpointBuilder, AdvancedIgniteComputeEndpointBuilder {
            public IgniteComputeEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new IgniteComputeEndpointBuilderImpl(path);
    }
}