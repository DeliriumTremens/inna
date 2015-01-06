<%@ include file="/jsp/layout/container/_pageHeaders.jsp"%>

 <script>

</script>

<div id="pageContent" class="pageContent">
  <div id ="pageTitle" class="pageTitle">Captura de Orden de Servicio</div>
  <div class="messageArea"></div>
  <div id="searchArea" class="searchArea">
     <form:form modelAttribute="newRow" id="searchForm" action="operation/contract/setup.do" cssClass="validableForm">
         <table class="fullWidthTable" >
              <tr>
                  <td align="left" class="label" >Numero de contrato<em>*</em></td>
                  <td align="left" class="label" >Orden de servicio<em>*</em></td>
               </tr>
               <tr>
                 <td align="left"><form:input path="contract.contract" style="width:97%" /></td>
                 <td align="left"><form:input path="serviceNumber" style="width:65%" /></td>
               </tr>
               <tr>
                  <td align="left" class="label" ><br></td>
               </tr>
               <tr>
                  <td align="right" class="label" colspan="3">Datos Generales</td>
               </tr>
               <tr>
                 <td align="left" colspan="3"><hr></td>
               </tr>
               <tr>
                  <td align="left" class="label" >Tipo</td>
                  <td align="left" class="label" >Tecnico<em>*</em></td>
                  <td align="left" class="label" >Solución</td>
               </tr>
               <tr>
                 <td align="left">
                   <form:select path="typeId" id="typeId"  style="width:98%" >
                       <form:option value="">SELECCIONE</form:option>
                       <form:option value="1">Cambio de Coordenadas</form:option>
                       <form:option value="2">Garantia</form:option>
                    </form:select>
                 </td>
                 <td align="left">
                   <form:select path="contract.workTeam[0].toUserId" id="techId"  style="width:98%" onchange="loadInventory();">
                       <form:option value="">SELECCIONE</form:option>
                       <form:option value="1">Armando Muños Reyes</form:option>
                       <form:option value="2">Jaime Felipe Vargas</form:option>
                    </form:select>
                 </td>
                 <td align="left">
                   <form:select path="solutionId" id="solutionId"  style="width:98%" >
                       <form:option value="">SELECCIONE</form:option>
                       <form:option value="1">Cambio Control HDZ</form:option>
                       <form:option value="2">Cambio de cable</form:option>
                       <form:option value="3">Conexion a la corriente electrica</form:option>
                       <form:option value="4">Cambio de Coordenadas</form:option>
                    </form:select>
                 </td>
               </tr>
               <tr>
                  <td align="left" class="label" ><br></td>
               </tr>
               <tr>
                  <td align="right" class="label" colspan="3">Comentarios</td>
               </tr>
               <tr>
                 <td align="left" colspan="3"><hr></td>
               </tr>
               <tr>
                 <td align="right" class="label" colspan="3">
                    <form:textarea path="comments" style="width:100%"/>
                 </td>
              </tr>
              <tr>
                  <td align="left" class="label" ><br></td>
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
