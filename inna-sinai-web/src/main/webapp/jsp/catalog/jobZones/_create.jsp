<%@ include file="/jsp/layout/container/_pageHeaders.jsp"%>
<form:form  title="Agregar" modelAttribute="newRow" id="newRowForm" class="styledModalForm validableForm custom[width:570]" target="ajax:result" action="catalog/jobZones/create.do">
   <table>
        <tr>
           <td align="left" class="label">Nombre<em>*</em></td>
           <td align="left" class="label">Descripción<em>*</em></td>
        </tr>
        <tr>
           <td><form:input path="name" cssClass="littleInput validate[required]" /></td>
           <td><form:input path="description" cssClass="mediumInput validate[required]"/></td>
        </tr>
        <tr>
           <td align="left" class="label">Unidad de Negocio<em>*</em></td>
        </tr>
        <tr>
           <td>
             <form:select path="businessUnitId" id="businessUnit" cssClass="validate[required] fullWidthSelect">
               <form:option value="">SELECCIONE</form:option>
               <form:options items="${businessUnits}"  
                             itemValue="id"
                             itemLabel="name"/>
             </form:select>
           </td>
        </tr>
        
        <tr height="50px">
	       <td colspan="2">
	           <button class="litleButton styledButton"  style="float:left" type="button" onclick="closeModalForm('newRowForm')">Cancelar</button>
	           <button class="litleButton styledButton" style="float:right" type="submit">Guardar</button>
	       </td>
        </tr>
   </table>
</form:form>