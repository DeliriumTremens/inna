<%@ include file="/jsp/layout/container/_pageHeaders.jsp"%>

 <script>

</script>

<div id="pageContent" class="pageContent">
  <div id ="pageTitle" class="pageTitle">Cargar archivo de respuesta</div>
  <div class="messageArea"></div>
  <div id="searchArea" class="searchArea">
     <form:form id="searchForm" target="ajax:result" action="validation/remittence/loadResponse.do" cssClass="validableForm">
         <table class="fullWidthTable">
               <tr>
                  <td align="left" class="label" width="60%" colspan="2">Seleccionar Archivo</td>
               </tr>
               <tr>
                 <td align="left" colspan="2"><input type="file" value="Explorar"/></td>
               </tr>
              <tr>
                 <td colspan="3" align="right">
                    <button class="button styledButton" type="submit">Cargar</button>
                 </td>
              </tr>
         </table>
      </form:form>
  </div>
  <div id="result" class="result">
  </div>
</div>
