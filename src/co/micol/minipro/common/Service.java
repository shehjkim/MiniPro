package co.micol.minipro.common;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Service {
	public String run(HttpServletRequest request, HttpServletResponse response);
		

	
}
