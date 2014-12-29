<%@ include file="/jsp/layout/container/_pageHeaders.jsp"%>

 <script>

</script>

<div id="pageContent" class="pageContent">
  <div id ="pageTitle" class="pageTitle">Nuevo Contrato</div>
  <div class="messageArea"></div>
  <div id="searchArea" class="searchArea">
     <form:form modelAttribute="newRow" id="searchForm" action="operation/create.do" cssClass="validableForm">
         <table class="fullWidthTable">
               <tr>
                  <td align="left" class="label" >Numero de Contrato<em>*</em></td>
                  <td align="left" class="label" >Número de cuenta</td>
                  <td align="left" class="label" >Fecha de Captura<em>*</em></td>
               </tr>
               <tr>
                 <td align="left"><form:input path="contract" style="width:97%" /></td>
                 <td align="left"><form:input path="account" style="width:97%" /></td>
                 <td align="left"><form:input path="openedDate" style="width:97%" readonly="true"/></td>
               </tr>
              <tr>
                 <td colspan="3" align="right">
                    <button class="button styledButton" type="submit">Guardar</button>
                 </td>
              </tr>
         </table>
      </form:form>
  </div>
</div>
