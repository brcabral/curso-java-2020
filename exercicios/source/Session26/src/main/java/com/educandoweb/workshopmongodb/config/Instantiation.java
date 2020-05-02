package com.educandoweb.workshopmongodb.config;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.educandoweb.workshopmongodb.domain.Post;
import com.educandoweb.workshopmongodb.domain.User;
import com.educandoweb.workshopmongodb.repository.PostRepository;
import com.educandoweb.workshopmongodb.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner {
	@Autowired
	private UserRepository userRepository;

	@Autowired
	private PostRepository postRepository;

	@Override
	public void run(String... args) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));

		userRepository.deleteAll();
		postRepository.deleteAll();

		User user1 = new User(null, "Maria Brown", "maria@gmail.com");
		User user2 = new User(null, "Alex Green", "alex@gmail.com");
		User user3 = new User(null, "Bob Grey", "bob@gmail.com");

		Post post1 = new Post(null, sdf.parse("21/03/2018"), "Partiu viagem", "Vou viajar para São Paulo. Abraços!",
				user1);
		Post post2 = new Post(null, sdf.parse("23/03/2018"), "Bom dia", "Acordei feliz hoje!", user1);

		userRepository.saveAll(Arrays.asList(user1, user2, user3));
		postRepository.saveAll(Arrays.asList(post1, post2));
	}
}
