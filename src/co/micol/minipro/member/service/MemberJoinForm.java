package co.micol.minipro.member.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.micol.minipro.common.Service;

public class MemberJoinForm implements Service {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		return "views/member/memberJoinForm.jsp";
	}

}
