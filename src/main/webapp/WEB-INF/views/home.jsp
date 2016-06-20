<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<sec:authorize access="hasRole('ROLE_OPERATOR')">
  <div class="row">
    <div class="col-md-12">
      <h1 class="page-header">Star Wars Categories</h1>
    </div>
  </div>

  <div class="row">
  <div class="col-md-4">
    <div class="panel panel-blue cursorPointer" id="planetsBlock">
      <div class="panel-heading">
        <div class="row">
          <div class="col-xs-3">
            <i class="fa fa-moon-o fa-3x"></i>
          </div>
          <div class="col-xs-7 text-center">
            <div class="huge">Planets</div>
          </div>
        </div>
      </div>
      <a href=<c:url value="/categories/planets" />>
        <div class="panel-footer">
          <span class="pull-left">View pages</span>
          <span class="pull-right"><i class="fa fa-arrow-circle-right"></i></span>
          <div class="clearfix"></div>
        </div>
      </a>
    </div>
  </div>

  <div class="col-md-4">
    <div class="panel panel-yellow cursorPointer" id="spaceshipsBlock">
      <div class="panel-heading">
        <div class="row">
          <div class="col-xs-3">
            <i class="fa fa-space-shuttle fa-3x"></i>
          </div>
          <div class="col-xs-7 text-center">
            <div class="huge">Spaceships</div>
          </div>
        </div>
      </div>
      <a href=<c:url value="/categories/spaceships" />>
        <div class="panel-footer">
          <span class="pull-left">View pages</span>
          <span class="pull-right"><i class="fa fa-arrow-circle-right"></i></span>
          <div class="clearfix"></div>
        </div>
      </a>
    </div>
  </div>

  <div class="col-md-4">
    <div class="panel panel-red cursorPointer" id="vehiclesBlock">
      <div class="panel-heading">
        <div class="row">
          <div class="col-xs-3">
            <i class="fa fa-motorcycle fa-3x"></i>
          </div>
          <div class="col-xs-7 text-center">
            <div class="huge">Vehicles</div>
          </div>
        </div>
      </div>
      <a href=<c:url value="/categories/vehicles" />>
        <div class="panel-footer">
          <span class="pull-left">View pages</span>
          <span class="pull-right"><i class="fa fa-arrow-circle-right"></i></span>
          <div class="clearfix"></div>
        </div>
      </a>
    </div>
  </div>

  <div class="col-md-4">
    <div class="panel panel-success cursorPointer" id="peopleBlock">
      <div class="panel-heading">
        <div class="row">
          <div class="col-xs-3">
            <i class="fa fa-users fa-3x"></i>
          </div>
          <div class="col-xs-7 text-center">
            <div class="huge">People</div>
          </div>
        </div>
      </div>
      <a href=<c:url value="/categories/people" />>
        <div class="panel-footer">
          <span class="pull-left">View pages</span>
          <span class="pull-right"><i class="fa fa-arrow-circle-right"></i></span>
          <div class="clearfix"></div>
        </div>
      </a>
    </div>
  </div>

  <div class="col-md-4">
    <div class="panel panel-pink cursorPointer" id="filmsBlock">
      <div class="panel-heading">
        <div class="row">
          <div class="col-xs-3">
            <i class="fa fa-film fa-3x"></i>
          </div>
          <div class="col-xs-7 text-center">
            <div class="huge">Films</div>
          </div>
        </div>
      </div>
      <a href=<c:url value="/categories/films" />>
        <div class="panel-footer">
          <span class="pull-left">View pages</span>
          <span class="pull-right"><i class="fa fa-arrow-circle-right"></i></span>
          <div class="clearfix"></div>
        </div>
      </a>
    </div>
  </div>

  <div class="col-md-4">
    <div class="panel panel-green cursorPointer" id="speciesBlock">
      <div class="panel-heading">
        <div class="row">
          <div class="col-xs-3">
            <i class="fa fa-photo fa-3x"></i>
          </div>
          <div class="col-xs-7 text-center">
            <div class="huge">Species</div>
          </div>
        </div>
      </div>
      <a href=<c:url value="/categories/species" />>
        <div class="panel-footer">
          <span class="pull-left">View pages</span>
          <span class="pull-right"><i class="fa fa-arrow-circle-right"></i></span>
          <div class="clearfix"></div>
        </div>
      </a>
    </div>
  </div>
</sec:authorize>

<!-- Main page script -->
<script src=<c:url value="/resources/js/home.js" />></script>