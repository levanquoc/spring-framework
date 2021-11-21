<div class="email">
<p>${msg}</p>
<form method="post" action="${pageContext.request.contextPath}/auth/login">
    <label for="email">Username</label>
    <div class="sec-2">
      <ion-icon name="mail-outline"></ion-icon>
      <input type="text" name="username" placeholder=""/>
    </div>
  </div>
  <div class="password">
    <label for="password">Password</label>
    <div class="sec-2">
      <ion-icon name="lock-closed-outline"></ion-icon>
      <input class="pas" type="password" name="password" placeholder="············"/>
      <ion-icon class="show-hide" name="eye-outline"></ion-icon>
    </div>
  </div>
  <button class="login">Login </button>
  

  <div class="footer"><span>Signup</span><span>Forgot Password?</span></div>
  </form>
</div>