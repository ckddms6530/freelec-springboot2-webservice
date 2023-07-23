package com.spring.book.domain.posts;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class PostsRepositoryTest {
    
    @Autowired
    PostsRepository postsRepository;
    
    @AfterEach //Junit5에선 @After -> @AfterEach로 바뀜
    public void cleanup() {
        postsRepository.deleteAll();
    }

    @Test
    public void 게시글저장_불러오기() {
        //given(테스트 준비 과정/ 변수 입력 값등 정의)
        String title = "테스트 게시글";
        String content = "테스트 본문";

        postsRepository.save(Posts.builder()
                        .title(title)
                        .content(content)
                        .author("jojodu@gmail.com")
                .build());

        //when(액션 실행)
        List<Posts> postsList = postsRepository.findAll();

        //Then(결과)
        Posts posts = postsList.get(0);
        System.out.println(posts.toString());
        assertThat(posts.getTitle()).isEqualTo(title);
        assertThat(posts.getContent()).isEqualTo(content);
    }
}
