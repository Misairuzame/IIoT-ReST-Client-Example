package it.gb.rest.main;

import it.gb.rest.dto.Post;
import it.gb.rest.dto.Todo;
import org.springframework.web.client.RestTemplate;

public class RestTemplateClient {

    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();

        Post response1 = restTemplate.getForObject("https://jsonplaceholder.typicode.com/posts/1", Post.class);
        System.out.println(response1);

        Post[] response2 = restTemplate.getForObject("https://jsonplaceholder.typicode.com/posts", Post[].class);
        for(Post post : response2) {
            System.out.println(post);
        }

        //Lettura dei todos
        Todo response3 = restTemplate.getForObject("https://jsonplaceholder.typicode.com/todos/1", Todo.class);
        System.out.println(response3);

        Todo[] response4 = restTemplate.getForObject("https://jsonplaceholder.typicode.com/todos", Todo[].class);
        for(Todo todo : response4) {
            System.out.println(todo);
        }
    }

}
