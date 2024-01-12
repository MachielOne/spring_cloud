package org.homeboy.springcloud.config;

import org.homeboy.springcloud.rules.MyLoadBalanceRule;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.loadbalancer.core.ReactorLoadBalancer;
import org.springframework.cloud.loadbalancer.core.ServiceInstanceListSupplier;
import org.springframework.cloud.loadbalancer.support.LoadBalancerClientFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;


public class MySelfRule {


    @Bean
    ReactorLoadBalancer<ServiceInstance> randomLoadBalance(Environment environment, LoadBalancerClientFactory loadBalancerClientFactory)
    {
        String property = environment.getProperty(LoadBalancerClientFactory.PROPERTY_NAME);
        return new MyLoadBalanceRule(loadBalancerClientFactory.getLazyProvider(property, ServiceInstanceListSupplier.class), property);
    }
}
