package co.micol.minipro.member.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import co.micol.minipro.common.Service;

public class Logout implements Service {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) {
		// TODO 로그아웃은 db갈필요 없이 세션 remove 시키면됨
		HttpSession session = request.getSession();
		String mid = (String) session.getAttribute("mid");
		request.setAttribute("mid", mid);
		session.invalidate();
		return "views/member/logout.jsp";
		
	}

}
