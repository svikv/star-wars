<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<link href=<c:url value="/resources/dist/css/select2.min.css" /> rel="stylesheet" />
<link href=<c:url value="/resources/dist/css/select2-bootstrap.css" /> rel="stylesheet" />
<link href=<c:url value="/resources/dist/css/result.css" /> rel="stylesheet" />

<div class="panel panel-default">
  <div class="panel-heading">
    <h3>Request results for planet with ID: <c:out value="${id}" /></h3>
  </div>
  <div class="panel-body">

    <div class="col-md-12">
      <div class="row">
        <div class="col-sm-3">
          <p><b>Name</b></p>
        </div>
        <div class="col-sm-9">
          <c:out value="${planet.name}" />
        </div>
      </div>
    </div>

    <div class="col-md-12">
      <div class="row">
        <div class="col-sm-3">
          <p><b>Rotation period</b></p>
        </div>
        <div class="col-sm-9">
          <c:out value="${planet.rotation_period}" />
        </div>
      </div>
    </div>

    <div class="col-md-12">
      <div class="row">
        <div class="col-sm-3">
          <p><b>Orbital period</b></p>
        </div>
        <div class="col-sm-9">
          <c:out value="${planet.orbital_period}" />
        </div>
      </div>
    </div>

    <div class="col-md-12">
      <div class="row">
        <div class="col-sm-3">
          <p><b>Diameter</b></p>
        </div>
        <div class="col-sm-9">
          <c:out value="${planet.diameter}" />
        </div>
      </div>
    </div>

    <div class="col-md-12">
      <div class="row">
        <div class="col-sm-3">
          <p><b>Climate</b></p>
        </div>
        <div class="col-sm-9">
          <c:out value="${planet.climate}" />
        </div>
      </div>
    </div>

    <div class="col-md-12">
      <div class="row">
        <div class="col-sm-3">
          <p><b>Gravity</b></p>
        </div>
        <div class="col-sm-9">
          <c:out value="${planet.gravity}" />
        </div>
      </div>
    </div>

    <div class="col-md-12">
      <div class="row">
        <div class="col-sm-3">
          <p><b>Terrain</b></p>
        </div>
        <div class="col-sm-9">
          <c:out value="${planet.terrain}" />
        </div>
      </div>
    </div>

    <div class="col-md-12">
      <div class="row">
        <div class="col-sm-3">
          <p><b>Surface water</b></p>
        </div>
        <div class="col-sm-9">
          <c:out value="${planet.surface_water}" />
        </div>
      </div>
    </div>

    <div class="col-md-12">
      <div class="row">
        <div class="col-sm-3">
          <p><b>Population water</b></p>
        </div>
        <div class="col-sm-9">
          <c:out value="${planet.population}" />
        </div>
      </div>
    </div>

    <div class="col-md-12">
      <div class="row">
        <div class="col-sm-3">
          <p><b>Resident</b></p>
        </div>
        <div class="col-sm-9">
          <c:forEach items="${planet.residents}" var="resident">
            <span class='label label-info'/>${resident}</span>
          </c:forEach>
        </div>
      </div>
    </div>

    <div class="col-md-12">
      <div class="row">
        <div class="col-sm-3">
          <p><b>Films</b></p>
        </div>
        <div class="col-sm-9">
          <c:forEach items="${planet.films}" var="film">
            <span class='label label-info'/>${film}</span>
          </c:forEach>
        </div>
      </div>
    </div>

    <div class="col-md-12">
      <div class="row">
        <div class="col-sm-3">
          <p><b>Created</b></p>
        </div>
        <div class="col-sm-9">
          <c:out value="${planet.created}" />
        </div>
      </div>
    </div>

    <div class="col-md-12">
      <div class="row">
        <div class="col-sm-3">
          <p><b>Edited</b></p>
        </div>
        <div class="col-sm-9">
          <c:out value="${planet.edited}" />
        </div>
      </div>
    </div>

    <div class="col-md-12">
      <div class="row">
        <div class="col-sm-3">
          <p><b>URL</b></p>
        </div>
        <div class="col-sm-9">
          <c:out value="${planet.url}" />
        </div>
      </div>
    </div>
  </div>
</div>