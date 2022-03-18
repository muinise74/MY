package kr.smhrd.web;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.smhrd.model.MemberMapper;
import kr.smhrd.model.MemberVO;

@Controller
public class MemberController {
	
	@Inject
	private MemberMapper mapper;
	
	// 1. 로그인 페이지로 이동
	@RequestMapping("/login.do")
	public void login() {
		System.out.println("로그인 페이지");
	}
	
	// 2. 로그인
	@RequestMapping("/loginSelect.do")
	public String loginCon(HttpSession session,MemberVO vo) {
		System.out.println("로그인");
		if (mapper.loginSelect(vo) == null) {
			return "redirect:/login.do";
		}else {
			session.setAttribute("member", mapper.loginSelect(vo));
			return "redirect:/boardList.do";
		}
	}
	
	// 3. 회원가입 페이지로 이동
	@RequestMapping("/join.do")
	public void join() {
		System.out.println("회원가입 페이지");
	}
	
	// 4. 회원 가입
	@RequestMapping("/joinInsert.do")
	public String joinInsert(MemberVO vo) {
		System.out.println("회원가입");
		mapper.joinInsert(vo);
		return "redirect:/login.do";
	}
	
	// 5. 로그 아웃
	@RequestMapping("/logout.do")
	public String logout(HttpSession session) {
		System.out.println("로그 아웃");
		//session.removeAttribute("member"); << 이게 더 낫다
		session.invalidate();
		return "redirect:/boardList.do";
	}
	
	// 6. MyPage로 이동
	@RequestMapping("/myPage.do")
	public void myPage() {
		System.out.println("마이 페이지");
	}
	
	// 7. 회원 정보 수정 페이지로 이동
	@RequestMapping("/memberUpdatePage.do")
	public void memberUpdatePage() {
		System.out.println("회원 정보 수정 페이지");
	}
	
	// 8. 회원 정보 수정
	@RequestMapping("/memberUpdate.do")
	public String memberUpdate(HttpSession session, MemberVO vo) {
		System.out.println("회원 정보 수정 페이지");
		mapper.memberUpdate(vo);
		session.setAttribute("member",mapper.loginSelect(vo));
		return "redirect:/myPage.do";
	}

	// 9. 회원 탈퇴
	@RequestMapping("/memberDelete.do")
	public String memberDelete(HttpSession session) {
		System.out.println("회원 탈퇴");
		MemberVO vo = (MemberVO)session.getAttribute("member");
		mapper.memberDelete(vo);
		if (mapper.loginSelect(vo) == null) {
			session.invalidate();
			return "redirect:/login.do";
		}else {
			session.setAttribute("member", mapper.loginSelect(vo));
			return "redirect:/myPage.do";
		}
	}
	
	// 10. 회원 정보 보기
	@RequestMapping("/memberList.do")
	public @ResponseBody List<MemberVO> memberList() {
		System.out.println("회원 정보 보기");
		List<MemberVO> memberList = mapper.memberList();
		return memberList;
	}
	
	// 11. id 중복 체크
	@RequestMapping("/idCheck.do")
	public @ResponseBody int idCheck(String id) {
		System.out.println("id 중복 체크");
		int check = 0;
		if (mapper.idCheck(id) == null) {
			check = 1;
		}
		return check;
	}
}
