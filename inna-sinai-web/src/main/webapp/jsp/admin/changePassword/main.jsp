<%@ include file="/jsp/layout/container/_pageHeaders.jsp"%>

 <script>
 $('#passwordTable').jqGrid('setGridParam', {rowNum: 100});
 $('#passwordTable').jqGrid('setGridHeight', 'auto');
 $('#passwordTable').jqGrid('setGridWidth', '300').trigger("reloadGrid");
</script>

<div id="pageContent" class="pageContent">
  <div id ="pageTitle" class="pageTitle">Cambio de Password</div>
  <div class="messageArea"></div>
  <div id="searchArea" class="searchArea">
     <form:form id="searchForm" target="ajax:result" action="admin/changePassword/save.do" cssClass="validableForm">
         <div align="center">
         <table class="styledTable" title="Password" id="passwordTable">
             <thead>
                  <tr>
                     <th></th>
                     <th></th>
                  </tr> 
             </thead> 
             <tbody> 
               <tr>
                  <td align="left" class="label" width="60%" colspan="2">Password Actual</td>
                  <td align="left" class="label" width="60%" colspan="2"><input /></td>
               </tr>
               <tr>
                  <td align="left" class="label" width="60%" colspan="2">Password Nuevo</td>
                  <td align="left" class="label" width="60%" colspan="2"><input /></td>
               </tr>
               <tr>
                  <td align="left" class="label" width="60%" colspan="2">Confirmar Password</td>
                  <td align="left" class="label" width="60%" colspan="2"><input /></td>
               </tr>
               </tbody> 
         </table>
         </div>
      </form:form>
  </div>
    <div >
        <table class="fullWidthTable">
          <tr>
             <td align="center"><button class="button styledButton" onClick="showNew()">Aceptar</button></td>
          </tr>
        </table>
  </div>
</div>
