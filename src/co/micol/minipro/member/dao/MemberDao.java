package co.micol.minipro.member.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.jsp.tagext.TryCatchFinally;

import co.micol.minipro.common.DAO;
import co.micol.minipro.common.Dbinterface;
import co.micol.minipro.member.service.MemberVo;

public class MemberDao extends DAO implements Dbinterface<MemberVo> {
	private PreparedStatement psmt;
	private ResultSet rs;
	

			
	@Override
	public ArrayList<MemberVo> selectList() {
		// TODO Auto-generated method stub
				return null;
	}
//로그인 
	@Override
	public MemberVo select(MemberVo vo) {
		String sql="SELECT * FROM MEMBER WHERE MID = ? AND MPASSWORD = ?";		
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getmId());
			psmt.setString(2, vo.getmPassword());
			rs = psmt.executeQuery();
			if(rs.next()) {
				vo.setmAuth(rs.getString("mauth"));
				vo.setmName(rs.getString("mname"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}		
		return vo;
	}

	@Override
	public int insert(MemberVo vo) {
	String sql = "INSERT INTO member (mId, mName, mPassword) VALUES (?,?,?)";
		int n=0;
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getmId());
			psmt.setString(2, vo.getmName());
			psmt.setString(3, vo.getmPassword());
			n = psmt.executeUpdate();
			System.out.println( n + "명이 회원가입 되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}
		return n;
	}

	@Override
	public int update(MemberVo vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(MemberVo vo) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public boolean IsidCheck(String id) {			//id중복체크
		boolean bool = true;
		
		String sql = "SELECT mId FROM member WHERE mid = ?";
		try {
			psmt  = conn.prepareStatement(sql);
			psmt.setString(1, id);
			rs = psmt.executeQuery();
			if(rs.next()) {
				bool = false;
			}			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}
		
		return bool;
	}
	
	
	

	private void close() {
		try {
			if(rs != null) rs.close();
			if(psmt != null) psmt.close();
			if(conn != null) conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
