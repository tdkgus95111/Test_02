package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

public class PersonnelDAO extends DAOBase{
	private static PersonnelDAO instance = new PersonnelDAO();
	
	public static PersonnelDAO getInstance() {
		return instance;
	}
	
	private PersonnelDAO() {}
	//조회
	public ArrayList<PersonnelVO> readList() throws SQLException{
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		ArrayList<PersonnelVO> personnels = new ArrayList<PersonnelVO>();
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			sql = "SELECT * FROM PERSONNEL_01";
			
			if (rs.next()) {
				do {
					PersonnelVO psn = new PersonnelVO();
					psn.setId(rs.getString(1));
					psn.setName(rs.getString(2));
					psn.setDept(rs.getString(3));
					psn.setPosition(rs.getString(4));
					psn.setDuty(rs.getString(5));
					psn.setPhone(rs.getString(6));
				} while (rs.next());
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeDBResources(rs, pstmt, conn);
		}
		return personnels;
	}
	//추가
	public void addPersonnel(HttpServletRequest request) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		
		try {
			conn = getConnection();
			sql = "INSERT INTO PERSONNEL_01 VALUES(?, ?, ?, ?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, request.getParameter("id"));
			pstmt.setString(2, request.getParameter("name"));
			pstmt.setString(3, request.getParameter("dept"));
			pstmt.setString(4, request.getParameter("position"));
			pstmt.setString(5, request.getParameter("duty"));
			pstmt.setString(6, request.getParameter("phone"));
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeDBResources(pstmt, conn);
		}
	}
}


















