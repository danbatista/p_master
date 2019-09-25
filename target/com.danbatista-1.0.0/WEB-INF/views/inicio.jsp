    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="/docs/4.0/assets/img/favicons/favicon.ico">

    <title>Inicio</title>

  
    <!-- Bootstrap core CSS -->
    <link href="https://danbatista.com/assets/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="https://danbatista.com/assets/css/dashboard.css" rel="stylesheet">
  </head>

  <body>
    <nav class="navbar navbar-dark sticky-top bg-dark flex-md-nowrap p-0">
      <a class="navbar-brand col-sm-3 col-md-2 mr-0" href="#">Plan Master</a>
      <input class="form-control form-control-dark w-100" type="text" placeholder="Search" aria-label="Search">
      <ul class="navbar-nav px-3">
        <li class="nav-item text-nowrap">
          <a class="nav-link" href="#">Sair</a>
        </li>
      </ul>
    </nav>

    <div class="container-fluid">
      <div class="row">
        <nav class="col-md-2 d-none d-md-block bg-light sidebar">
          <div class="sidebar-sticky">
            <ul class="nav flex-column">
              <li class="nav-item">
                <a class="nav-link active" href="#">
                  <span data-feather="home"></span>
                  Suas Contas <span class="sr-only">(current)</span>
                </a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="#">
                  <span data-feather="file"></span>
                  Perfil
                </a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="#">
                  <span data-feather="shopping-cart"></span>
                  Calculo Pontuação
                </a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="#">
                  <span data-feather="users"></span>
                  Calculo Ganhos
                </a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="#">
                  <span data-feather="bar-chart-2"></span>
                  Simulador Graduação
                </a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="#">
                  <span data-feather="layers"></span>
                 Contato/Feedback
                </a>
              </li>
            </ul>

            <h6 class="sidebar-heading d-flex justify-content-between align-items-center px-3 mt-4 mb-1 text-muted">
              <span>Cadastros</span>
              <a class="d-flex align-items-center text-muted" href="#">
                <span data-feather="plus-circle"></span>
              </a>
            </h6>
            <ul class="nav flex-column mb-2">
              <li class="nav-item">
                <a class="nav-link" href="#">
                  <span data-feather="file-text"></span>
                 Cadastro Contas
                </a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="#">
                  <span data-feather="file-text"></span>
                  Cadastro Metas
                </a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="#">
                  <span data-feather="file-text"></span>
                  Configurações
                </a>
              </li>
          
            </ul>
          </div>
        </nav>

        <main role="main" class="col-md-9 ml-sm-auto col-lg-10 pt-3 px-4">
          <div class="d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pb-2 mb-3 border-bottom">
            <h1 class="h2">Suas Contas</h1>
            <div class="btn-toolbar mb-2 mb-md-0">
              <div class="btn-group mr-2">
                <button id="arvore" class="btn btn-sm btn-outline-secondary">Árvore</button>
                <button id="tabela" class="btn btn-sm btn-outline-secondary">Tabela</button>
              </div>
          
            </div>
          </div>

          <div id="chart_div"></div>

          <h2>Suas Contas</h2>
          <div class="table-responsive">
            <table id="table" class="table table-striped table-dark table-hover">
              <thead>
                <tr>
                  <th>Nome</th>
                  <th>C. Pai</th>
                  <th>Pt Sobrando</th>
                  <th>Lado</th>
                  <th>#</th>
                </tr>
              </thead>
              <tbody>
              <c:forEach var="item" items="${list}" varStatus="id">
                <tr id="${item.id}">
                  <td class="nomeconta">${item.nomeConta}</td>
                  <td class="contapai">${item.contapai}</td>
                  <td class="acalcular">${item.acalcular}</td>
                  <td class="ladoconta">${item.ladoconta}</td>
                  <td><button class="btn btn-primary my-2">Editar/Deletar</button></td>
                </tr>
              </c:forEach>
              </tbody>
            </table>
          </div>
        </main>
      </div>
    </div>

    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script>window.jQuery || document.write('<script src="../../assets/js/vendor/jquery-slim.min.js"><\/script>')</script>
    <script src="https://danbatista.com/assets/js/popper.min.js"></script>
    <script src="https://danbatista.com/assets/js/bootstrap.min.js"></script>
    	<script type="text/javascript"
		src="https://www.gstatic.com/charts/loader.js"></script>

  <!--	<script src="js/bootstrap.bundle.min.js"></script>-->

    <!-- Icons -->
    <script src="https://unpkg.com/feather-icons/dist/feather.min.js"></script>
    <script>
      feather.replace()
    </script>

  <script type="text/javascript">

	

  
    google.charts.load('current', {packages:["orgchart"]});
    google.charts.setOnLoadCallback(drawChart);

    function drawChart() {
    	var tabela = document.getElementById("table");
    	var linhas = tabela.getElementsByTagName("tr");
    	
    	var contapai =	$("#contapai").text();
    	  var nomeconta=	$("#nomeconta").text();
    	  
        var data = new google.visualization.DataTable();
        data.addColumn('string', 'Name');
        data.addColumn('string', 'Manager');
        data.addColumn('string', 'ToolTip');

        // For each orgchart box, provide the name, manager, and tooltip to show.
        
        for(var i = 0; i < linhas.length; i++){
        	var linha = linhas[i];
          var nomeconta = linha.getElementsByClassName("nomeconta");
         var contapai =   linha.getElementsByClassName("contapai");
         var acalcular= linha.getElementsByClassName("acalcular");
         var ladoconta= linha.getElementsByClassName("ladoconta");

         if($(ladoconta).text() == 1){
             ladoconta = "Dir";
         }else{
             ladoconta="Esq";
         }
        data.addRows([
        [{v:$(nomeconta).text(),f:""+$(nomeconta).text()+
        	'<div style="font-size: 20px;"><img class="img-circle" style="max-height:70px; border: solid#2d70ac" src="https://dreamsdigger.blob.core.windows.net/folderimagens/28a5d285-e1fa-46bc-8201-44770671287e_G"></div>'
        	+"<div>PT:"+$(acalcular).text()+"|"+ladoconta+"</div>"},$(contapai).text(), '']    
        ]);

        }
        // Create the chart.
        var chart = new google.visualization.OrgChart(document.getElementById('chart_div'));
        // Draw the chart, setting the allowHtml option to true for the tooltips.
        chart.draw(data, {allowHtml:true,nodeClass:'myChart'});
      }
    
    
    $( document ).ready(function() {
       $("#tabela").on('mousedown', function (e) {
    	      var t = this.selected = !this.selected;
    	        if(t == true){
    	          $("#table").hide();
    	         }else{
    	          $("#table").show();
    	         }
    	        e.preventDefault();
    	      
    	    });
       $("#arvore").on('mousedown', function (e) {
    	      var t = this.selected = !this.selected;
    	        if(t == true){
    	          $("#chart_div").hide();
    	         }else{
    	          $("#chart_div").show();
    	         }
    	        e.preventDefault();
    	      
    	    });
    	
       
    });
    
    
 </script>
  
  </body>
</html>