package Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import database.AdminDAO;

@WebServlet("/dang-nhap")
public class DangNhap extends HttpServlet {
    private AdminDAO adminDAO;

    @Override
    public void init() {
        adminDAO = new AdminDAO();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        // 1. Lấy tham số
        String hoten = request.getParameter("hoten");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String remember = request.getParameter("remember");

        // 2. Kiểm tra dữ liệu đầu vào
        if (hoten == null || hoten.isEmpty() || 
            username == null || username.isEmpty() || 
            password == null || password.isEmpty()) {
            
            request.setAttribute("error", "Vui lòng nhập đầy đủ thông tin!");
            request.getRequestDispatcher("/pages-login.jsp").forward(request, response);
            return;
        }

        // 3. Kiểm tra đăng nhập
        if (!adminDAO.checkLogin(hoten, username, password)) {
            request.setAttribute("error", "Sai tên đăng nhập hoặc mật khẩu!");
            request.getRequestDispatcher("/pages-login.jsp").forward(request, response);
            return;
        }

        // 4. Đăng nhập thành công
        HttpSession session = request.getSession();
        session.setAttribute("hoten", hoten);
        session.setAttribute("username", username);

        // 5. Chuyển hướng
        response.sendRedirect(request.getContextPath() + "/index.jsp");
    }
}