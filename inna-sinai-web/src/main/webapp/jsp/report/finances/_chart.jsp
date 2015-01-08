<%@ include file="/jsp/layout/container/_pageHeaders.jsp"%>
    <!--Load the AJAX API-->
    
    <script type="text/javascript">
    
    var data = google.visualization.arrayToDataTable([
                                                       ['Mes', 'Gastos', 'Ingresos'],
                                                       ['Enero',  1000, 2000],
                                                       ['Febrero',  1170, 1052],
                                                       ['Marzo',  660, 458],
                                                       ['Abril',  1030, 2584],
                                                       ['Mayo',  1000, 1524],
                                                       ['Junio',  1170, 1300],
                                                       ['Julio',  660, 847],
                                                       ['Agosto',  1030, 923],
                                                       ['Septiembre',  1000, 1026],
                                                       ['Octubre',  1170, 1024],
                                                       ['Noviembre',  660, 500],
                                                       ['Diciembre',  1030, 1458]
                                                     ]);



  var chart = new google.visualization.AreaChart(document.getElementById('finances'));
  chart.draw(data);
  

$(document).ready(function() {
	$( "#chartTabs" ).tabs();
	});
    </script>


<div align="left">
   Total de registros: 876
</div>
<div id="chartTabs">
	<ul>
		<li>
			<a href="#chart1">Entradas /Salidas</a>
		</li>
	</ul>
	<div id="chart1">
		<div id="finances" style="width: 900px; height: 350px;"></div>
	</div>
</div>


