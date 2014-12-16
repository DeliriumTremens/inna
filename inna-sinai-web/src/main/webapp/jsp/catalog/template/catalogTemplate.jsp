<%@ include file="/jsp/layout/container/_pageHeaders.jsp"%>

<script type="text/javascript">
  function showDelete(){
    if(getSelectedRows("REGISTROS") != ""){
	  loadModalConfirmation("catalog/template/setupDelete.do"
			            ,{templateName : '${config.name}'});
	}
  }
   
   function showCreate(){
	   loadModalForm("catalog/template/setupCreate.do"
			      ,{templateName : '${config.name}'});
   }
   
   function selectCriteria(){
	 hideValidations();
	 $("#textValue").val("");
	 $('#textValue').removeAttr('disabled');
   }
   
   </script>

<div id="pageContent" class="pageContent">
  <div id ="pageTitle" class="pageTitle">${config.text}</div>
  <div class="messageArea"></div>
  <div id="searchArea" class="searchArea">
     <form:form modelAttribute="toSearch" id="searchForm" target="ajax:result" action="catalog/template/seach.do" cssClass="validableForm">
         <input id="templateName" name="templateName" type="hidden" value="${config.name}"/>
         <table class="fullWidthTable">
               <tr>
                  <td align="left" class="label">Nombre</td>
               </tr>
               <tr>
                 <td><form:input path="name" cssClass="fullWidthInput" /></td>
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
