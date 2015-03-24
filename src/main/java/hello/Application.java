package hello;

import org.springframework.web.client.RestTemplate;

import java.lang.System;

public class Application {

    public static void main(String args[]) {
        RestTemplate restTemplate = new RestTemplate();
        Page page = restTemplate.getForObject("http://graph.facebook.com/pivotalsoftware", Page.class);
        System.out.println("Name:    " + page.getName());
        System.out.println("About:   " + page.getAbout());
        System.out.println("Phone:   " + page.getPhone());
        System.out.println("Website: " + page.getWebsite());

        System.out.println("*************************");
        User user = restTemplate.getForObject("http://graph.facebook.com/alexander.varchenko", User.class);
        System.out.println("Name:    " + user.getName());
        System.out.println("Gender:  " + user.getGender());

        user = restTemplate.getForObject("http://graph.facebook.com/olesya.pop", User.class);
        System.out.println("Name:    " + user.getName());
        System.out.println("Gender:  " + user.getGender());

    }

}
