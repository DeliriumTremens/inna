<%@ include file="/jsp/layout/container/_pageHeaders.jsp"%>

 <script>
 $(function() {
	  $('#payRollTable').jqGrid('setGridParam', {rowNum: 100});
	  $('#payRollTable').jqGrid('setGridHeight', 'auto').trigger("reloadGrid");
	  $("div#gview_totalTable > div.ui-jqgrid-titlebar").hide();
	  $('#totalTable').jqGrid('setGridParam', {rowNum: 100});
	  $('#totalTable').jqGrid('setGridHeight', 'auto');
	  $('#totalTable').jqGrid('setGridWidth', '300').trigger("reloadGrid");
   });
</script>

     <form:form modelAttribute="types" id="addForm" action="finance/payRoll/add.do" cssClass="validableForm">

         <table class="styledTable" title="Nómina" id="payRollTable"> 
              <thead> 
                   <tr>  
	                  <th width="5%">No.</th>
	                  <th width="30%">TIPO</th>  
	                  <th width="10%">CONTRATO</th>
	                  <th width="15%">CUENTA</th>
	                  <th width="10%">EQUIPOS</th>
	                  <th width="15%">FECHA INSTALACIÓN</th>
	                  <th width="15%">MONTO</th>
                  </tr> 
              </thead> 
              <tbody> 
                  <tr>
		            <td>1</td>
		            <td>INSTALACIÓN</td>
		            <td>67632534</td>
		            <td>501132129096</td>
		            <td>1</td>
		            <td>09/01/2015</td>
		            <td>$260.00</td>
	             </tr>
	             <tr>
		            <td>2</td>
		            <td>INSTALACIÓN</td>
		            <td>67709070</td>
		            <td>501132867669</td>
		            <td>2</td>
		            <td>10/01/2015</td>
		            <td>$520.00</td>
	             </tr>
	             <tr>
		            <td>3</td>
		            <td>GARANTIA</td>
		            <td>67709891</td>
		            <td>501132899780</td>
		            <td>-</td>
		            <td>08/01/2015</td>
		            <td>$-260.00</td>
	             </tr>
	             <tr>
		            <td>4</td>
		            <td>INSTALACIÓN</td>
		            <td>67725581</td>
		            <td>501133050283</td>
		            <td>1</td>
		            <td>12/01/2015</td>
		            <td>$260.00</td>
	             </tr>
	               <tr>
		            <td>5</td>
		            <td>GARANTÍA</td>
		            <td>67725891</td>
		            <td>501133584583</td>
		            <td>-</td>
		            <td>07/01/2015</td>
		            <td>$0.00</td>
	             </tr>
	               <tr>
		            <td>4</td>
		            <td>INSTALACIÓN</td>
		            <td>67725581</td>
		            <td>501133050283</td>
		            <td>1</td>
		            <td>12/01/2015</td>
		            <td>$260.00</td>
	             </tr>
	             <tr>
		            <td>5</td>
		            <td>VALE</td>
		            <td></td>
		            <td></td>
		            <td></td>
		            <td>12/01/2015</td>
		            <td>$-60.00</td>
	             </tr>
	             <tr>
		            <td>6</td>
		            <td>MATERIAL - CABLE</td>
		            <td></td>
		            <td></td>
		            <td></td>
		            <td>12/01/2015</td>
		            <td>$-652.00</td>
	             </tr>
  </tbody> 
</table> 

<br>

<div align="right"> 
<table class="styledTable" title="Total" id="totalTable"> 
<thead> 
                   <tr>  
	                  <th width="40%"></th>
	                  <th width="60%"></th>  
                  </tr> 
              </thead> 
              <tbody> 
                  <tr>
		            <td>SUMA</td>
		            <td>$1040.00</td>
	             </tr>
	             <tr>
		            <td>IVA</td>
		            <td>$0.00</td>
	             </tr>
	             <tr>
		            <td>TOTAL</td>
		            <td>$328.00</td>
	             </tr>
  </tbody> 
</table> 
</div>

      </form:form>
