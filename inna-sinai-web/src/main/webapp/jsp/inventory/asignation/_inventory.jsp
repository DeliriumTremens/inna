<%@ include file="/jsp/layout/container/_pageHeaders.jsp"%>
<%@page import="java.util.*" %>

<table class="styledTable" title="INVENTARIO LOCAL"> 
	<thead> 
		<tr>  
			<th width="70%">NOMBRE</th> 
			<th width="15%">EN STOCK</th>
			<th width="15%">POR ASIGNAR</th>
		</tr> 
	</thead> 
	<tbody> 
		<c:forEach items="${localInventory}" var="row">
			<tr>
				<td>${row.name}</td>
				<td><%=(Math.abs(new Random().nextInt())%5) %></td>
				<td><%=(Math.abs(new Random().nextInt())%3) %></td>
			</tr>
		</c:forEach>
	</tbody> 
</table>

<br>
<table class="styledTable" title="INVENTARIO SKY"> 
	<thead> 
		<tr>  
			<th width="30%">TIPO</th> 
			<th width="15%">NUMERO DE SERIE</th>
		</tr> 
	</thead> 
	<tbody> 
		<c:forEach var="i" begin="1" end="${testNumber}">
			<tr>
				<td>TARJETA INTELIGENTE</td>
				<td><input value="" style="width:98%" /></td>
			</tr>
			<tr>
				<td>IRD</td>
				<td><input value="" style="width:98%" /></td>
			</tr>
		</c:forEach>
	</tbody> 
</table>  

<br>

  <div >
        <table class="fullWidthTable">
          <tr>
             <td align="right"><button class="button styledButton" >Guardar</button></td>
          </tr>
        </table>
  </div>