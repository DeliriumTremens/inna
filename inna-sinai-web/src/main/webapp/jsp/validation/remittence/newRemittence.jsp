<%@ include file="/jsp/layout/container/_pageHeaders.jsp"%>


<div id="pageContent" class="pageContent">
  <div id ="pageTitle" class="pageTitle">Generar Remesa</div>
  <div class="messageArea"></div>
  <div id="searchArea" class="searchArea">
  <table class="styledTable" title="CONTRATOS"> 
  <thead> 
    <tr> 
      <th width="10%">CONTRATO</th>
      <th width="15%">CUENTA</th>  
      <th width="15%">FECHA INSTALACIÓN</th>
      <th width="15%">FECHA ACTIVACIÓN</th>  
	  <th width="30%">TECNICO</th> 
	  <th width="15%">NO. EQUIPOS</th> 
   </tr> 
  </thead> 
  <tbody> 
	  <tr>
		<td>25055802</td>
		<td>501132436673</td>
		 <td>01/12/2014</td>
		 <td>01/12/2014</td>
		 <td>Juan Armando Mendoza</td>
		 <td>1</td>
	  </tr>
	  <tr>
		<td>25055803</td>
		<td>501132436674</td>
		 <td>02/12/2014</td>
		 <td>02/12/2014</td>
		 <td>Manuel romos Vargas</td>
		 <td>1</td>
	  </tr>
	  <tr>
		<td>25055804</td>
		<td>501132436675</td>
		 <td>03/12/2014</td>
		 <td>03/12/2014</td>
		 <td>Miguel Castro dominguez</td>
		 <td>1</td>
	  </tr>
	  <tr>
		<td>25055805</td>
		<td>501132436676</td>
		 <td>04/12/2014</td>
		 <td>04/12/2014</td>
		 <td>Pedro Rocha Garcia</td>
		 <td>2</td>
	  </tr>
	  <tr>
		<td>25055806</td>
		<td>501132436677</td>
		 <td>05/12/2014</td>
		 <td>05/12/2014</td>
		 <td>Ignacio Peña de la Fuente</td>
		 <td>1</td>
	  </tr>
	 <tr>
		<td>25055807</td>
		<td>501132436673</td>
		 <td>01/12/2014</td>
		 <td>01/12/2014</td>
		 <td>Juan Armando Mendoza</td>
		 <td>1</td>
	  </tr>
	  <tr>
		<td>25055808</td>
		<td>501132436674</td>
		 <td>02/12/2014</td>
		 <td>02/12/2014</td>
		 <td>Manuel romos Vargas</td>
		 <td>1</td>
	  </tr>
	  <tr>
		<td>25055809</td>
		<td>501132436675</td>
		 <td>03/12/2014</td>
		 <td>03/12/2014</td>
		 <td>Miguel Castro dominguez</td>
		 <td>1</td>
	  </tr>
	  <tr>
		<td>25055810</td>
		<td>501132436676</td>
		 <td>04/12/2014</td>
		 <td>04/12/2014</td>
		 <td>Pedro Rocha Garcia</td>
		 <td>2</td>
	  </tr>
	  <tr>
		<td>25055811</td>
		<td>501132436677</td>
		 <td>05/12/2014</td>
		 <td>05/12/2014</td>
		 <td>Ignacio Peña de la Fuente</td>
		 <td>1</td>
	  </tr>
  </tbody> 
</table>
<div id="pager"></div>

<br>

<table class="styledTable" title="REAGENDADOS"> 
  <thead> 
    <tr> 
      <th width="10%">CONTRATO</th>
      <th width="15%">FECHA INSTALACIÓN</th>
	  <th width="30%">TECNICO</th> 
	  <th width="10%">NO. EQUIPOS</th>
	  <th width="15%">CAUSA</th>
	  <th width="20%">COMENTARIOS</th>  
   </tr> 
  </thead> 
  <tbody> 
	  <tr>
		<td>25055963</td>
		 <td>01/12/2014</td>
		 <td>Juan Armando Mendoza</td>
		 <td>1</td>
		 <td>PAGARE MAL REQUISITADO</td>
		 <td>TECNICO ACUDE A DOMICILIO PARA GENRAR NUEVAMENTE EL PAGARE.</td>
	  </tr>
	  <tr>
		<td>22587456</td>
		 <td>08/12/2014</td>
		 <td>Ignacio Peña de la Fuente</td>
		 <td>2</td>
		 <td>COMPROBANTE DE DOMICILIO NO VÁLIDO</td>
		 <td>SE CONTACTA AL CLIENTE PARA SOLICITAR UN NUEVO COMPROBANTE DE DOMICILIO. LO ENVÍA VIA CORREO ELECTRONICO</td>
	  </tr>
	  <tr>
		<td>98547526</td>
		 <td>06/12/2014</td>
		 <td>Juan Armando Mendoza</td>
		 <td>1</td>
		 <td>CONTRATO(S) SIN FIRMA DEL SUSCRIPTOR</td>
		 <td>TECNICO ACUDE A DOMICILIO PARA RECABAR LA FIRMA.</td>
	  </tr>
	  
  </tbody> 
</table>
  </div>
  
  <div >
        <table class="fullWidthTable">
          <tr>
             <td align="right">
             <form method="get" action="rsc/remittence.xls">
                <button type="submit" class="button styledButton">Generar Remesa</button>
             </form>
             
             </td>
          </tr>
        </table>
  </div>
</div>
