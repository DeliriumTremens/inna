<%@ include file="/jsp/layout/container/_pageHeaders.jsp"%>
<form:form modelAttribute="masterUser" id="modalFormEditUser" class="styledModalForm validableForm custom[width:745]" title="Editar" target="ajax:result" action="usersAdministration/update.do">
   <form:hidden path="user.id"/>
   <form:hidden path="additionalInformation.userId"/>
   <form:hidden path="credential.userId"/>
   <table>
        <tr>
           <td align="left" class="label">Nombre<em>*</em></td>
           <td align="left">Apellido Paterno</td>
           <td align="left">Apellido Materno</td>
        </tr>
        <tr>
           <td><form:input path="user.name" cssClass="littleInput validate[required]" /></td>
           <td><form:input path="user.lastName" cssClass="littleInput validate[required]"/></td>
           <td><form:input path="user.middleName" cssClass="littleInput validate[required]"/></td>
        </tr>
        <tr>
           <td align="left">Sucursal</td>
           <td align="left">Puesto</td>
           <td align="left">Perfil</td>
        </tr>
        <tr>
           <td>
              <form:select path="user.businessUnitId" class="littleInput validate[required]">
              <form:option value="">SELECCIONE</form:option>
                 <form:options items="${businessUnits}"  
                               itemValue="id"
                               itemLabel="name"/>
              </form:select>
           </td>
           <td>
              <form:select path="user.employeeRolId" class="littleInput validate[required]">
              <form:option value="">SELECCIONE</form:option>
                 <form:options items="${employeeRols}"  
                               itemValue="id"
                               itemLabel="name"/>
              </form:select>
           </td>
           <td>
              <form:select path="profile.id" class="littleInput validate[required]">
              <form:option value="">SELECCIONE</form:option>
                 <form:options items="${profiles}"  
                               itemValue="id"
                               itemLabel="name"/>
              </form:select>
           </td>
        </tr>
        <tr>
           <td align="left">Usuario Sinai</td>
           <td align="left">E-Mail</td>
           <td align="left">Telefono</td>
        </tr>
        <tr>
           <td><form:input path="credential.nickName" cssClass="littleInput validate[required]"/></td>
           <td><form:input path="user.mail" cssClass="littleInput validate[required]"/></td>
           <td><form:input path="additionalInformation.phoneNumber" cssClass="littleInput validate[required]"/></td>
        </tr>
        <tr>
           <td align="left">IMEI</td>
           <td align="left">NIT</td>
           <td align="left">NIT PASS</td>
        </tr>
        <tr>
           <td><form:input path="additionalInformation.imei" cssClass="littleInput validate[required]"/></td>
           <td><form:input path="additionalInformation.nit" cssClass="littleInput validate[required]"/></td>
           <td><form:input path="additionalInformation.nitPass" cssClass="littleInput validate[required]"/></td>
        </tr>
        <tr>
           <td align="left">MAIL PASS</td>
           <td align="left">HEAT PASS</td>
           <td align="left">SKY MOBILE PASS</td>
        </tr>
        <tr>
           <td><form:input path="additionalInformation.mailPass" cssClass="littleInput validate[required]"/></td>
           <td><form:input path="additionalInformation.heatKey" cssClass="littleInput validate[required]"/></td>
           <td><form:input path="additionalInformation.skyMobilePass" cssClass="littleInput validate[required]"/></td>
        </tr>
       
        <tr>
           <td align="left">BLOQUEADO</td>
           <td align="left"></td>
           <td align="left"></td>
        </tr>
        <tr>
           <td align="left"><form:checkbox path="credential.isLocked"/></td>
           <td></td>
           <td></td>
        </tr>
        
        <tr height="50px">
	       <td colspan="3">
	           <button class="litleButton styledButton"  style="float:left" type="button" onclick="closeModalForm('modalFormEditUser')">Cancelar</button>
	           <button class="litleButton styledButton" style="float:right" type="submit">Guardar</button>
	       </td>
        </tr>
   </table>
</form:form>