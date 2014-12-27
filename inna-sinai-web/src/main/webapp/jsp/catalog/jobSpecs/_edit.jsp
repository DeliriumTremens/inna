<%@ include file="/jsp/layout/container/_pageHeaders.jsp"%>
<form:form modelAttribute="editRow" id="modalFormEditRow" class="styledModalForm validableForm custom[width:640]" title="Editar" target="ajax:result" action="catalog/jobSpecs/update.do">
   <form:hidden path="id"/>
   <table>
         <tr>
           <td align="left" class="label">Nombre<em>*</em></td>
           <td align="left" class="label">Descripción<em>*</em></td>
        </tr>
        <tr>
           <td><form:input path="name" cssClass="mediumInput validate[required]" /></td>
           <td><form:input path="description" cssClass="mediumInput validate[required]"/></td>
        </tr>
        <tr>
           <td align="left" class="label">Costo de Instalacion<em>*</em></td>
           <td align="left" class="label">Costo de transferencia<em>*</em></td>
        </tr>
        <tr>
           <td><form:input path="jobCost" cssClass="mediumInput validate[required]" /></td>
           <td><form:input path="transferCost" cssClass="mediumInput validate[required]" /></td>
        </tr>
        <tr>
           <td align="left" class="label">Activo <em>*</em>: <form:checkbox path="isActive"></form:checkbox></td>
        </tr>
        
        <tr height="50px">
	       <td colspan="3">
	           <button class="litleButton styledButton"  style="float:left" type="button" onclick="closeModalForm('modalFormEditRow')">Cancelar</button>
	           <button class="litleButton styledButton" style="float:right" type="submit">Guardar</button>
	       </td>
        </tr>
   </table>
</form:form>