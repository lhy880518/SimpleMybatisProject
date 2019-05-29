package com.springbook.biz.board;

import java.util.List;

public class BoardServiceClient {
    public static void main(String[] args) {
        BoardDAO boardDAO = new BoardDAO();

        BoardVO vo = new BoardVO();
        vo.setTitle("myBatis 제목");
        vo.setWriter("ghdrlfehd");
        vo.setContent("content is...");
        boardDAO.insertBoard(vo);

        vo.setSearchCondition("TITLE");
        vo.setSearchKeyword("");
        List<BoardVO> boardList = boardDAO.getBoardList(vo);
        for(BoardVO boardVO : boardList){
            System.out.println("----> "+ boardVO.toString());
        }
    }
}
