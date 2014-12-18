<%@ include file="/jsp/layout/container/_pageHeaders.jsp"%>

<div id="pageContent" class="pageContent">
  <div id ="pageTitle" class="pageTitle">Captura de Contrato</div>
  <div class="messageArea"></div>
  <div id="searchArea" class="searchArea">
     <form:form modelAttribute="toSearch" id="searchForm" target="ajax:result" action="operation/seach.do" cssClass="validableForm">
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
