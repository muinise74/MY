package kr.smhrd.model;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BoardMapper {
	
	// 1. 게시판 목록
	public List<BoardVO> boardList();
	
	// 2. idx로 게시글 하나 보기
	public BoardVO searchBoardByIdx(int idx);
	
	// 3. 게시글 조회수 1 올리기
	public void updateCntByIdx(int idx);
	
	// 4. 게시글 작성하기
	public void boardInsert(BoardVO vo);

	// 5. 게시글 삭제하기
	public void boardDeleteByIdx(int idx);
	
	// 6. 게시글 수정하기
	public void boardUpdate(BoardVO vo);
	
}
