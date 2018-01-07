package org.manu.springcloud;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AvailabilityFilteringRule;
import com.netflix.loadbalancer.IPing;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.PingUrl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

public class SayHelloConfiguration {
    // Stores client configuration for a client or load balancer
    @Autowired
    IClientConfig ribbonClientConfig;

    // Says how periodic pings of a server are performed.
    @Bean
    public IPing ribbonPing(IClientConfig config) {
        return new PingUrl();
    }

    // Describes a load balancing strategy
    @Bean
    public IRule ribbonRule(IClientConfig config) {
        return new AvailabilityFilteringRule();
    }
}
