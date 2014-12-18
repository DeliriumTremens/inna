<%@ include file="/jsp/layout/container/_pageHeaders.jsp"%>
    <!--Load the AJAX API-->
    
    <script type="text/javascript">
    
    var data = google.visualization.arrayToDataTable([
                                                      ['Mes', 'No. Instalaciones'],
                                                      ['Enero',  1000],
                                                      ['Febrero',  1170],
                                                      ['Marzo',  660],
                                                      ['Abril',  1030],
                                                      ['Mayo',  1000],
                                                      ['Junio',  1170],
                                                      ['Julio',  660],
                                                      ['Agosto',  1030],
                                                      ['Septiembre',  1000],
                                                      ['Octubre',  1170],
                                                      ['Noviembre',  660],
                                                      ['Diciembre',  1030]
                                                    ]);


  var chart = new google.visualization.ColumnChart(document.getElementById('installations'));
  chart.draw(data);
  var data = google.visualization.arrayToDataTable([
                                                    ['Mes', 'No. Garantias'],
                                                    ['Enero',  1000],
                                                    ['Febrero',  1170],
                                                    ['Marzo',  660],
                                                    ['Abril',  1030],
                                                    ['Mayo',  1000],
                                                    ['Junio',  1170],
                                                    ['Julio',  660],
                                                    ['Agosto',  1030],
                                                    ['Septiembre',  1000],
                                                    ['Octubre',  1170],
                                                    ['Noviembre',  660],
                                                    ['Diciembre',  1030]
                                                  ]);


var chart = new google.visualization.ColumnChart(document.getElementById('warranties'));
chart.draw(data);


var data = google.visualization.arrayToDataTable([
                                                  ['Mes', 'No. Reagendados'],
                                                  ['Enero',  1000],
                                                  ['Febrero',  1170],
                                                  ['Marzo',  660],
                                                  ['Abril',  1030],
                                                  ['Mayo',  1000],
                                                  ['Junio',  1170],
                                                  ['Julio',  660],
                                                  ['Agosto',  1030],
                                                  ['Septiembre',  1000],
                                                  ['Octubre',  1170],
                                                  ['Noviembre',  660],
                                                  ['Diciembre',  1030]
                                                ]);


var chart = new google.visualization.ColumnChart(document.getElementById('reschedules'));
chart.draw(data);


var data = google.visualization.arrayToDataTable([
                                                  ['Mes', 'No. Supervisiones'],
                                                  ['Enero',  1000],
                                                  ['Febrero',  1170],
                                                  ['Marzo',  660],
                                                  ['Abril',  1030],
                                                  ['Mayo',  1000],
                                                  ['Junio',  1170],
                                                  ['Julio',  660],
                                                  ['Agosto',  1030],
                                                  ['Septiembre',  1000],
                                                  ['Octubre',  1170],
                                                  ['Noviembre',  660],
                                                  ['Diciembre',  1030]
                                                ]);


var chart = new google.visualization.ColumnChart(document.getElementById('supervisions'));
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
			<a href="#chart1">Instalaciones</a>
		</li>
		<li>
			<a href="#chart2">Grantías</a>
		</li>
		<li>
			<a href="#chart3">Reagendados</a>
		</li>
		<li>
			<a href="#chart4">Supervisiones</a>
		</li>
	</ul>
	<div id="chart1">
		<div id="installations" style="width: 900px; height: 350px;"></div>
	</div>
	<div id="chart2" style="width: 900px; height: 350px;">
		<div id="warranties" style="width: 900px; height: 350px;"></div>
	</div>
	<div id="chart3" style="width: 900px; height: 350px;">
		<div id="reschedules" style="width: 900px; height: 350px;"></div>
	</div>
	<div id="chart4" style="width: 900px; height: 350px;">
		<div id="supervisions" style="width: 900px; height: 350px;"></div>
	</div>
</div>


