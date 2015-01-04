<%@ include file="/jsp/layout/container/_pageHeaders.jsp"%>

<script type="text/javascript">
  function showDelete(){
    if(getSelectedRows("REGISTROS") != ""){
	  loadModalConfirmation("catalog/products/setupDelete.do");
	}
  }
   
   function showCreate(){
	   loadModalForm("catalog/products/setupCreate.do");
   }
   
   </script>

<div id="pageContent" class="pageContent">
  <div id ="pageTitle" class="pageTitle">Productos</div>
  <div class="messageArea"></div>
  <div id="searchArea" class="searchArea">
     <form:form modelAttribute="toSearch" id="searchForm" target="ajax:result" action="catalog/products/seach.do" cssClass="validableForm">
         <table class="fullWidthTable">
               <tr>
                  <td align="left" class="label">Nombre</td>
                  <td align="left" class="label">Unidad de Negocio</td>
               </tr>
               <tr>
                 <td><form:input path="name" style="width:97%" /></td>
                 <td>
                    <form:select path="businessUnitId" id="businessUnit" cssClass="fullWidthSelect">
                       <form:option value="">SELECCIONE</form:option>
                       <form:options items="${businessUnits}"  
                             itemValue="id"
                             itemLabel="name"/>
                    </form:select>
                 </td>
               </tr>
               <tr>
                  <td align="left" class="label">Solo activos: <form:checkbox path="isActive"></form:checkbox></td>    
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
     <%@ include file="./_rows.jsp"%>
  </div>
  <div >
    <table class="fullWidthTable">
          <tr>
             <td align="left"><button class="button styledButton" type="button" onclick="showDelete()">Eliminar</button></td>
             <td align="right"><button class="button styledButton" type="button" onclick="showCreate()">Nuevo</button></td>
          </tr>
    </table>
  </div>
</div>
