<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
    "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
    
<html xmlns="http://www.w3.org/1999/xhtml">
  <head>
    <meta http-equiv="Content-Type"
    content="text/html; charset=iso-8859-1" />
    <title>Sinai</title>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
    <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
    <link href="${pageContext.request.contextPath}/css/jquery-ui-custom-1.7.3.css" rel="stylesheet" type="text/css" />
    <link href="${pageContext.request.contextPath}/css/jquery-validationEngine.css" rel="stylesheet" type="text/css" />
    <link href="${pageContext.request.contextPath}/css/jquery-ui-jqgrid.css" rel="stylesheet" type="text/css" />
    <link href="${pageContext.request.contextPath}/css/jquery-ui-dateRangePicker.css" rel="stylesheet" type="text/css" />
    <link href="${pageContext.request.contextPath}/css/master.css" rel="stylesheet" type="text/css" />
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/lib/jquery-1.6.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/lib/jquery.ui-1.8.13.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/lib/jquery.ui.datepicker-es.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/lib/jquery.validationEngine-es.js" charset="utf-8"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/lib/jquery.validationEngine.js" charset="utf-8"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/lib/jquery.jqGrid.locale-es.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/lib/jquery.jqGrid.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/lib/jquery.dateRangePicker.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/util.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/validations.js"></script>
  </head>
  <body>
   <div class="container">
    <div  style='padding: 170px 0 0 0px;width:60%;font: bold 12px "Trebuchet MS", "Helvetica", "Arial",  "Verdana", "sans-serif"' class="messageArea"></div>
    <div style="padding: 10px 0 0 250px;">
    <form:form modelAttribute="userCredential" id="signupForm" cssClass="validableForm" action="singUp.do">
      <div id="login-box">
         <h2>Inna</h2>Sistema Integral de Administración
         <br/><br/>
         <table>
              <tr>
                 <td>
                    <div id="login-box-name" style="margin-top:20px;color: blue;">Usuario:</div>
                 </td>
                 <td>
                   <div id="login-box-field" style="margin-top:20px;">
                       <form:input path="nickName" id="nickName" cssClass="validate[required] form-login" size="30" maxlength="20" />
                   </div>                 
                 </td>
              </tr>
              <tr>
                 <td>
                   <div id="login-box-name" style="margin-top:10px;color: blue;">Password:</div>
                 </td>
                 <td>
                   <div id="login-box-field" style="margin-top:10px;">
                    <form:password path="password" id="password" cssClass="validate[required] form-login" size="30" maxlength="8" />
                   </div>
                 </td>
              </tr>
              <tr>
                 <td colspan="2">
                    <button class="button styledButton" style="float:right;margin-left:90px;" type="submit" >Entrar</button>
                 </td>
              </tr>
         </table>
         
	  </div>
	  </form:form>
    </div>
    </div>
  </body>
</html>

<script type="text/javascript">
   $(document).ready(init());
   
   function init(){
	 _init();
	 printMessage("<%=request.getAttribute("infMessage")%>"
	              ,"<%=request.getAttribute("errMessage")%>");
   }
</script>