<%@ include file="/jsp/layout/container/_pageHeaders.jsp"%>

<script type="text/javascript">
  function showDeleteUsers(){
    if(getSelectedRows("USUARIOS") != ""){
	  loadModalConfirmation("usersAdministration/setupDelete.do");
	}
  }
   
   function showCreateUser(){
	   loadModalForm("usersAdministration/setupCreate.do");
   }
   
   function selectCriteria(){
	   hideValidations();
	   var criteria = $("#criteriaType").val();
	   $("#userName").val("");
	   $("#userMail").val("");
	   $("#userProfile").val("");
	   if(criteria == 1){
		 $("#userName").show();
		 $("#userMail").hide();
		 $("#userProfile").hide();
	   } else if(criteria == 2){
			$("#userName").hide();
			$("#userMail").show();
			$("#userProfile").hide();
	   } else if(criteria == 3){
			$("#userName").hide();
			$("#userMail").hide();
			$("#userProfile").show();
	   }
	   
   }
   
   </script>

<div id="pageContent" class="pageContent">
  <div id ="pageTitle" class="pageTitle">Administración de Usuarios</div>
  <div class="messageArea"></div>
  <div id="searchArea" class="searchArea">
     <form:form modelAttribute="toSearch" id="searchUsersForm" target="ajax:result" action="usersAdministration/seach.do" cssClass="validableForm">
         <table class="fullWidthTable">
              <tr>
                 <td class="label" style="width:100px;">
                   Busqueda por:
                 </td>
                 <td style="width:1%">
                    <select id="criteriaType" class="validate[funcCall[requiredIf[userName]], funcCall[requiredIf[userMail]], funcCall[requiredIf[userProfile]]] selectBox" onchange="selectCriteria()">
                        <option value="">SELECCIONE</option>
                        <option value="1">NOMBRE</option>
                        <option value="2">E-MAIL</option>
                        <option value="3">PERFIL</option>
                    </select>
                 </td>
                 <td>
                    <form:input path="user.name" id="userName" cssClass="validate[funcCall[requiredIf[criteriaType]]] fullWidthInput" />
                    <form:input path="user.mail" id="userMail" cssClass="validate[funcCall[requiredIf[criteriaType]]] fullWidthInput" style="display:none"/>
                    <form:select path="profile.id" id="userProfile" cssClass="validate[funcCall[requiredIf[criteriaType]]] fullWidthSelect" style="display:none">
                       <form:option value="">SELECCIONE</form:option>
                       <form:options items="${profiles}"  
                               itemValue="id"
                               itemLabel="name"/>
                    </form:select>
                 </td>
              </tr>
              <tr>
                <td></td>
                <td></td>
                <td align="left" style="padding: 0px 0 0 8px;">
                    <form:checkbox path="credential.isActive"></form:checkbox>
                    <span class ="litleLabel">Solo bloqueados</span>
                </td>
              </tr>
              <tr>
                 <td colspan="3" align="right">
                    <button class="button styledButton" type="submit">Buscar</button>
                 </td>
              </tr>
         </table>
      </form:form>
  </div>
  <div id="result" class="result">
     <%@ include file="/jsp/admin/user/_userTable.jsp"%>
  </div>
  <div >
    <table class="fullWidthTable">
          <tr>
             <td align="left"><button class="button styledButton" type="button" onclick="showDeleteUsers()">Eliminar</button></td>
             <td align="right"><button class="button styledButton" type="button" onclick="showCreateUser()">Nuevo</button></td>
          </tr>
    </table>
  </div>
</div>
