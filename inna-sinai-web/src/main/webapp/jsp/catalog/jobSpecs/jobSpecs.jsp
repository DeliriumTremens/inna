<%@ include file="/jsp/layout/container/_pageHeaders.jsp"%>

<script type="text/javascript">
  function showDelete(){
    if(getSelectedRows("REGISTROS") != ""){
	  loadModalConfirmation("catalog/jobSpec/setupDelete.do");
	}
  }
   
   function showCreate(){
	   loadModalForm("catalog/jobSpec/setupCreate.do");
   }
   
   </script>

<div id="pageContent" class="pageContent">
  <div id ="pageTitle" class="pageTitle">Costos</div>
  <div class="messageArea"></div>
  <div id="searchArea" class="searchArea">
     <form:form modelAttribute="toSearch" id="searchForm" target="ajax:result" action="catalog/jobSpecs/seach.do" cssClass="validableForm">
         <table class="fullWidthTable">
              <tr>
                  <td align="left" class="label">Nombre</td>    
               </tr>
               <tr>
                 <td><form:input path="name" style="width:97%" /></td>
               </tr>
               <tr>
                  <td align="left" class="label">Solo inactivos: <form:checkbox path="isActive"></form:checkbox></td>    
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
