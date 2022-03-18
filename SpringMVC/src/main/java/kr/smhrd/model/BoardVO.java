package kr.smhrd.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BoardVO {
	
	private int idx;
	private int count;
	@NonNull
	private String title;
	@NonNull
	private String contents;
	@NonNull
	private String writter;
	private String indate;
	
}
