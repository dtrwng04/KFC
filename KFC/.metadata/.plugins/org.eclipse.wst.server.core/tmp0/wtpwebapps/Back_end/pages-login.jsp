<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta content="width=device-width, initial-scale=1.0" name="viewport">
  <title>Đăng nhập - KFC</title>
  
  <!-- Simplified CSS -->
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <link href="assets/css/style.css" rel="stylesheet">
  
  <style>
    body {
      background-color: #f8f9fa;
    }
    .login-container {
      height: 100vh;
    }
    .login-card {
      border-radius: 15px;
      box-shadow: 0 5px 15px rgba(0,0,0,0.1);
    }
    .kfc-logo img {
      height: 80px;
    }
    .btn-kfc {
      background-color: #e4002b;
      color: white;
      font-weight: bold;
    }
    .btn-kfc:hover {
      background-color: #c10022;
    }
    .invalid-feedback {
      color: #dc3545;
      font-size: 0.85rem;
    }
    .valid-feedback {
      color: #28a745;
      font-size: 0.85rem;
    }
  </style>
</head>

<body>
  <div class="container-fluid login-container">
    <div class="row h-100">
      <!-- Left Image Column -->
      <div class="col-lg-6 d-none d-lg-block p-0">
        <div class="h-100 w-100" style="background-image: url('assets/img/anhdn.jpg'); background-size: cover;"></div>
      </div>
      
      <!-- Right Form Column -->
      <div class="col-lg-6 d-flex align-items-center justify-content-center">
        <div class="w-75">
          <div class="text-center mb-4">
            <img src="assets/img/logo1.jpg" alt="KFC Logo" class="mb-3" style="height: 80px;">
            <h2 class="mb-1">Đăng nhập hệ thống</h2>
            <p class="text-muted">Nhập thông tin đăng nhập của bạn</p>
          </div>

          <div class="card login-card">
            <div class="card-body p-4">
              <!-- Error Message -->
              <% if (request.getAttribute("error") != null) { %>
			  <div class="alert alert-danger">
			    <%= request.getAttribute("error") %>
			  </div>
			<% } %>
              
              <!-- Login Form -->
              <form action="${pageContext.request.contextPath}/dang-nhap" method="post" class="needs-validation" novalidate>
                <!-- Full Name -->
                <div class="mb-3">
                  <label class="form-label">Họ và tên</label>
                  <div class="input-group">
                    <span class="input-group-text">@</span>
                    <input type="text" name="hoten" class="form-control" required>
                    <div class="invalid-feedback">Vui lòng nhập họ tên</div>
                  </div>
                </div>
                
                <!-- Username -->
                <div class="mb-3">
                  <label class="form-label">Tên đăng nhập</label>
                  <div class="input-group">
                    <span class="input-group-text">@</span>
                    <input type="text" name="username" class="form-control" required>
                    <div class="invalid-feedback">Vui lòng nhập tên đăng nhập</div>
                  </div>
                </div>
                
                <!-- Password -->
                <div class="mb-3">
                  <label class="form-label">Mật khẩu</label>
                  <input type="password" name="password" class="form-control" required>
                  <div class="invalid-feedback">Vui lòng nhập mật khẩu</div>
                </div>
                
                <!-- Remember Me -->
                <div class="mb-3 form-check">
                  <input type="checkbox" name="remember" class="form-check-input" id="rememberMe">
                  <label class="form-check-label" for="rememberMe">Ghi nhớ tài khoản</label>
                </div>
                
                <!-- Submit Button -->
                <button type="submit" class="btn btn-kfc w-100 py-2">Đăng nhập</button>
              </form>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>

  <!-- Bootstrap JS -->
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
  
  <!-- Form Validation -->
  <script>
  (function () {
    'use strict'
    
    const forms = document.querySelectorAll('.needs-validation')
    
    Array.from(forms).forEach(form => {
      form.addEventListener('submit', event => {
        if (!form.checkValidity()) {
          event.preventDefault()
          event.stopPropagation()
        }
        form.classList.add('was-validated')
      }, false)
    })
  })()
  </script>
</body>
</html>