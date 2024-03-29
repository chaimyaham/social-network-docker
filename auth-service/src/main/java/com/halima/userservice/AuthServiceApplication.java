package com.halima.userservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@EnableDiscoveryClient
public class AuthServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(AuthServiceApplication.class, args);
    }
    class Solution {
        public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
            int count=0;
            for(int i=0;i<hours.length;i++){
                if(hours[i]<=target){
                    count++;
                }
            }
return count;
        }
    }

}
