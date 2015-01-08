<%@ include file="/jsp/layout/container/_pageHeaders.jsp"%>
    <!--Load the AJAX API-->
    
    <script type="text/javascript">
    
    var data = google.visualization.arrayToDataTable([
                                                      ['Rubro', 'Contratos'],
                                                      ['Contratos',     11],
                                                      ['Ceros',      2]
                                                    ]);

 

    var chart = new google.visualization.PieChart(document.getElementById('contracts'));


chart.draw(data);

$(document).ready(function() {
	$( "#chartTabs" ).tabs();
	});
    </script>


<div align="left">
   Total de registros: 125
</div>
<div id="chartTabs">
	<ul>
		<li>
			<a href="#chart2">Contratos</a>
		</li>
	</ul>
	<div id="chart2" style="width: 900px; height: 350px;">
		<div id="contracts" style="width: 900px; height: 350px;"></div>
	</div>
</div>


