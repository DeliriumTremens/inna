<%@ include file="/jsp/layout/container/_pageHeaders.jsp"%>

 <script>
 $(function() {
	  $('#remittenceTable').jqGrid('setGridParam', {rowNum: 50});
	  $('#remittenceTable').jqGrid('setGridHeight', 437).trigger("reloadGrid");
   });
 
   function showNew(){
	 loadContent("validation/remittence/setupNew.do");
   }
</script>

<div id="pageContent" class="pageContent">
  <div id ="pageTitle" class="pageTitle">Remesas</div>
  <div class="messageArea"></div>
  <div id="searchArea" class="searchArea">
     <table ID="remittenceTable" class="styledTable" title="REMESAS"> 
  <thead> 
    <tr> 
      <th width="5%">ID</th> 
      <th width="15%">FECHA ENVÍO</th> 
	  <th width="15%">FECHA RECEPCIÓN</th> 
	  <th width="15%">TOTAL ACEPTADOS</th>
	  <th width="15%">TOTAL RECTIFICABLES</th>
	  <th width="15%">TOTAL RECHAZADOS</th>
	  <th width="20%">ESTATUS</th> 
   </tr> 
  </thead> 
  <tbody> 
	  <tr>
		<td>43</td>
		<td>07/12/2014</td>
		 <td></td>
		 <td></td>
		 <td></td>
		 <td></td>
		 <td>ABIERTA</td>
	  </tr>
	  <tr>
		<td>42</td>
		<td>01/12/2014</td>
		 <td>06/12/2014</td>
		 <td>352</td>
		 <td>18</td>
		 <td>0</td>
		 <td>CERRADA</td>
	  </tr>
	  <tr>
		<td>41</td>
		<td>25/11/2014</td>
		 <td>30/11/2014</td>
		 <td>452</td>
		 <td>6</td>
		 <td>0</td>
		 <td>CERRADA</td>
	  </tr>
	  <tr>
		<td>40</td>
		<td>19/11/2014</td>
		 <td>24/11/2014</td>
		 <td>305</td>
		 <td>26</td>
		 <td>4</td>
		 <td>CERRADA</td>
	  </tr>
	  <tr>
		<td>39</td>
		<td>13/11/2014</td>
		 <td>18/11/2014</td>
		 <td>402</td>
		 <td>36</td>
		 <td>3</td>
		 <td>CERRADA</td>
	  </tr>
	  <tr>
		<td>38</td>
		<td>07/11/2014</td>
		 <td>12/11/2014</td>
		 <td>352</td>
		 <td>18</td>
		 <td>0</td>
		 <td>CERRADA</td>
	  </tr>
	  <tr>
		<td>37</td>
		<td>02/11/2014</td>
		 <td>06/11/2014</td>
		 <td>285</td>
		 <td>0</td>
		 <td>0</td>
		 <td>CERRADA</td>
	  </tr>
	  <tr>
		<td>36</td>
		<td>28/10/2014</td>
		 <td>01/11/2014</td>
		 <td>352</td>
		 <td>18</td>
		 <td>0</td>
		 <td>CERRADA</td>
	  </tr>
	   <tr>
		<td>35</td>
		<td>01/12/2014</td>
		 <td>06/12/2014</td>
		 <td>352</td>
		 <td>18</td>
		 <td>0</td>
		 <td>CERRADA</td>
	  </tr>
	  <tr>
		<td>34</td>
		<td>25/11/2014</td>
		 <td>30/11/2014</td>
		 <td>452</td>
		 <td>6</td>
		 <td>0</td>
		 <td>CERRADA</td>
	  </tr>
	  <tr>
		<td>33</td>
		<td>19/11/2014</td>
		 <td>24/11/2014</td>
		 <td>305</td>
		 <td>26</td>
		 <td>4</td>
		 <td>CERRADA</td>
	  </tr>
	  <tr>
		<td>32</td>
		<td>13/11/2014</td>
		 <td>18/11/2014</td>
		 <td>402</td>
		 <td>36</td>
		 <td>3</td>
		 <td>CERRADA</td>
	  </tr>
	  <tr>
		<td>31</td>
		<td>07/11/2014</td>
		 <td>12/11/2014</td>
		 <td>352</td>
		 <td>18</td>
		 <td>0</td>
		 <td>CERRADA</td>
	  </tr>
	  <tr>
		<td>30</td>
		<td>02/11/2014</td>
		 <td>06/11/2014</td>
		 <td>285</td>
		 <td>0</td>
		 <td>0</td>
		 <td>CERRADA</td>
	  </tr>
	  <tr>
		<td>29</td>
		<td>28/10/2014</td>
		 <td>01/11/2014</td>
		 <td>352</td>
		 <td>18</td>
		 <td>0</td>
		 <td>CERRADA</td>
	  </tr>
	  <tr>
		<td>28</td>
		<td>01/12/2014</td>
		 <td>06/12/2014</td>
		 <td>352</td>
		 <td>18</td>
		 <td>0</td>
		 <td>CERRADA</td>
	  </tr>
	  <tr>
		<td>27</td>
		<td>25/11/2014</td>
		 <td>30/11/2014</td>
		 <td>452</td>
		 <td>6</td>
		 <td>0</td>
		 <td>CERRADA</td>
	  </tr>
	  <tr>
		<td>26</td>
		<td>19/11/2014</td>
		 <td>24/11/2014</td>
		 <td>305</td>
		 <td>26</td>
		 <td>4</td>
		 <td>CERRADA</td>
	  </tr>
	  <tr>
		<td>25</td>
		<td>13/11/2014</td>
		 <td>18/11/2014</td>
		 <td>402</td>
		 <td>36</td>
		 <td>3</td>
		 <td>CERRADA</td>
	  </tr>
  </tbody> 
</table>
  </div>
  
  <div >
        <table class="fullWidthTable">
          <tr>
             <td align="left"><button class="button styledButton" >Cargar respuesta</button></td>
             <td align="right"><button class="button styledButton" onClick="showNew()">Nueva Remesa</button></td>
          </tr>
        </table>
  </div>
</div>
