<%@ include file="/jsp/layout/container/_pageHeaders.jsp"%>

 <script>

</script>

<div id="pageContent" class="pageContent">
  <div id ="pageTitle" class="pageTitle">Nómina</div>
  <div class="messageArea"></div>
  <div id="searchArea" class="searchArea">
     <form:form id="searchForm" target="ajax:result" action="finance/payRoll/search.do" cssClass="validableForm">
         <table class="fullWidthTable">
               <tr>
                  <td align="left" class="label" width="60%" colspan="2">Nombre de Técnico</td>
               </tr>
               <tr>
                 <td align="left" colspan="2"><select style="width:98%" id="techId" name="techId">
		                     <option value="0">SELECCIONE</option>
                             <option value="1">Armando Muñoz Reyes</option>
                             <option value="2">Felipe rios Bustamante</option>
                             <option value="3">Miguel Cardoso Jimenez</option>
                        </select></td>
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
</div>
