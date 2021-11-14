package com.spring.jpa;

import java.util.Date;

import com.spring.jpa.domain.Board;
import com.spring.jpa.persistence.BoardRepository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
// import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@SpringBootTest
public class BoardControllerTest {
    @Autowired
    private BoardRepository boardRepository;

    // @Test
    // public void testInsertBoard() {
    //     Board board = new Board();
    //     board.setTitle("게시글 1");
    //     board.setWriter("테스터");
    //     board.setContent("잘 등록되나요");
    //     board.setCreateDate(new Date());
    //     board.setCnt(0L);
    //     boardRepository.save(board);
    // }

    // @Test
    // public void testGetBoard() {
    //     System.out.println("----------프린트---------");
    //     Board board = boardRepository.findById(1L).get();
    //     System.out.println(board.toString());
    //     System.out.println("----------프린트---------");
    // }

    @Test
    public void testUpdateBoard() {
        Board board = boardRepository.findById(1L).get();
        board.setTitle("업데이트");
        boardRepository.save(board);
    }
}
