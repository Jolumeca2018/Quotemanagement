<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Quote Management</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css" integrity="sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4" crossorigin="anonymous">
    <link rel="stylesheet" href="css/style.css">
        <!-- Font Awesome JS -->
    <!-- <script defer src="https://use.fontawesome.com/releases/v5.0.13/js/solid.js" integrity="sha384-tzzSw1/Vo+0N5UhStP3bvwWPq+uvzCMfrN1fEFe+xBmv1C/AtVX5K0uZtmcHitFZ" crossorigin="anonymous"></script>
    <script defer src="https://use.fontawesome.com/releases/v5.0.13/js/fontawesome.js" integrity="sha384-6OIrr52G08NpOFSZdxxz1xdNSndlD4vdcf/q2myIUVO0VsqaGHJsB0RaBE01VTOY" crossorigin="anonymous"></script>
     -->
     <script src="https://kit.fontawesome.com/3a553bf238.js"></script>
</head>

<body>
    <div class="wrapper">
        <!-- Sidebar  -->
        <nav id="sidebar" class="mt-4">
            <!--iconos de la columna de la izquierda -->
            <ul class="list-unstyled components mt-4 pl-2">
                <li class="active mb-3">
                    <a href="#" class="btn btn-light text-left">
                        <img class="float-left mr-4" src="https://img.icons8.com/ios/25/000000/home.png">
                        <spane>Home</spane>
                    </a>
                </li>
                <li class="mb-3">
                    <a href="${pageContext.request.contextPath}/contacts" class="btn btn-light text-left" target="_blank">
                        <img class="float-left mr-4" src="https://img.icons8.com/ios/25/000000/contacts.png">
                        <spane>Contacts</spane>
                    </a>
                </li>
                <li class="mb-3">
                    <a href="#bestAnimeSubmenu1" data-toggle="collapse" aria-expanded="false" class="dropdown-toggle btn btn-light text-left">
                        <img class="float-left mr-4" src="https://img.icons8.com/ios/25/000000/contacts.png">
                        <spane class=" align-items-center h-100">Customers</spane>
                    </a>
                    <ul class="collapse list-unstyled" id="bestAnimeSubmenu1">
                        <li>
                            <a class="text-info pl-5 ml-3 mt-2" href="${pageContext.request.contextPath}/custo">
                              <small>Customers</small>
                            </a>
                        </li>
                        <li>
                            <a class="text-info pl-5 ml-3 mt-2" href="${pageContext.request.contextPath}/customers">
                                <small>Customers List</small>
                            </a>
                        </li>
                    </ul>
                </li>
                <li class="mb-3">
                    <a href="#bestAnimeSubmenu" data-toggle="collapse" aria-expanded="false" class="dropdown-toggle btn btn-light text-left">
                        <img class="float-left mr-4" src="https://img.icons8.com/material/24/000000/term--v1.png">
                        <spane class=" align-items-center h-100">Quotes</spane>
                    </a>
                    <ul class="collapse list-unstyled" id="bestAnimeSubmenu">
                        <li>
                            <a class="text-info pl-5 ml-3 mt-2" href="${pageContext.request.contextPath}/quotes">
                              <small>Quotations</small>
                            </a>
                        </li>
                        <li>
                            <a class="text-info pl-5 ml-3 mt-2" href="${pageContext.request.contextPath}/general">
                                <small>Quotes List</small>
                            </a>
                        </li>
                    </ul>
                </li>
                <li class="mb-3">
                    <a href="#tagsSubmenu" data-toggle="collapse" aria-expanded="false" class="dropdown-toggle btn btn-light text-left">
                        <img class="float-left mr-4" src="https://img.icons8.com/ios/25/000000/tags.png">
                        <spane class=" align-items-center h-100">Tags</spane>
                    </a>
                    <ul class="collapse list-unstyled" id="tagsSubmenu">
                        <li>
                            <a class="text-info pl-5 ml-3 mt-2" href="https://www.winpak.com/"">
                              <small>#Winpak</small>
                            </a>
                        </li>
                        <li>
                            <a class="text-info pl-5 ml-3 mt-2" href="https://www.wipak.com/en-homepage">
                                <small>#Wipak</small>
                            </a>
                        </li>
                    </ul>
                </li>
                
        </nav>

        <!-- Page Content  -->
        <div id="content">
            <!--iconos de la linea de arriba-->
          <nav class="navbar navbar-expand-lg navbar-light">
              <div class="container-fluid">
                  <div>
                      <button type="button" id="sidebarCollapse" class="btn btn-light">
                          <img src="https://img.icons8.com/ios/25/000000/menu-rounded-filled.png">
                      </button>
                      <strong class="font-weight-bold">Quotation Management Application</strong><br>
                      <!-- 
                      <button type="button" id="" class="btn btn-light">
                          <img src="https://img.icons8.com/ios/25/000000/installing-updates-filled.png">
                      </button>
                      <button type="button" id="" class="btn btn-light">
                          <img src="https://img.icons8.com/ios/25/000000/like.png">
                      </button>
                      // -->
                  </div>
                  <div class="row text-right">
                      <a class="col-9" href="#">
                          <strong class="font-weight-bold">MEGA</strong><br>
                          <small class="text-monospace text-muted">@jorge_lmc</small>
                      </a>
                      <a class="col-3" href="#">
                          <img src="https://img.icons8.com/ios/50/000000/under-computer.png">
                      </a>
                  </div>
              </div>
          </nav>
          
          <!-- Search Form  
          <div class="row mb-2 mx-0">
              <form class="form-inline col-12 mx-auto " action="">
                  <input class="form-control w-100" type="text" placeholder="Search">
              </form>
          </div>
          //-->
          
          <!-- Gallary Content  -->
          <div id="gallary" class="mx-3">
            <div class="tile">  
              <img src="images/quotes1.jpg">
              <div class="overlay">
                  <div class="content-overlay">
                    <a href="#">
                        <i class="far fa-heart"></i>
                    </a>
                    <a href="#" class="ml-2">
                        <i class="fas fa-arrow-down"></i>
                    </a>
                  </div>
              </div>
			  
            </div>

          </div>
		  
        </div>

    </div>

    <!-- jQuery CDN - Slim version (=without AJAX) -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <!-- Popper.JS -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js" integrity="sha384-cs/chFZiN24E4KMATLdqdvsezGxaGsi4hLGOzlXwp5UZB1LY//20VyM2taTB4QvJ" crossorigin="anonymous"></script>
    <!-- Bootstrap JS -->
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js" integrity="sha384-uefMccjFJAIv6A+rW+L4AHf99KvxDjWSu1z9VI8SKNVmz4sk7buKt/6v9KI65qnm" crossorigin="anonymous"></script>
    <!-- jQuery Custom Scroller CDN -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/malihu-custom-scrollbar-plugin/3.1.5/jquery.mCustomScrollbar.concat.min.js"></script>

    <script type="text/javascript">
        $(document).ready(function () {
            $("#sidebar").mCustomScrollbar({
                theme: "minimal"
            });

            $('#sidebarCollapse').on('click', function () {
                $('#sidebar, #content').toggleClass('active');
                $('.collapse.in').toggleClass('in');
                $('a[aria-expanded=true]').attr('aria-expanded', 'false');
            });
        });
    </script>
</body>

</html>