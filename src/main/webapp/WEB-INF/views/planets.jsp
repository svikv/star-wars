<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<link href=<c:url value="/resources/dist/css/select2.min.css" /> rel="stylesheet" />
<link href=<c:url value="/resources/dist/css/select2-bootstrap.css" /> rel="stylesheet" />
<link href=<c:url value="/resources/dist/css/result.css" /> rel="stylesheet" />

<div class="panel panel-default">
  <div class="panel-heading">
    <h3>Request results for planet with ID: <c:out value="${planetObject.id}" /></h3>
  </div>
  <div class="panel-body">

    <div class="col-md-12">
      <div class="row">
        <div class="col-sm-3">
          <p><b>Name</b></p>
        </div>
        <div class="col-sm-9">
          <c:out value="${planetObject.name}" />
        </div>
      </div>
    </div>

    <div class="col-md-12">
      <div class="row">
        <div class="col-sm-3">
          <p><b>Rotation period</b></p>
        </div>
        <div class="col-sm-9">
          <c:out value="${planetObject.rotation_period}" />
        </div>
      </div>
    </div>

    <div class="col-md-12">
      <div class="row">
        <div class="col-sm-3">
          <p><b>Orbital period</b></p>
        </div>
        <div class="col-sm-9">
          <c:out value="${planetObject.orbital_period}" />
        </div>
      </div>
    </div>

    <div class="col-md-12">
      <div class="row">
        <div class="col-sm-3">
          <p><b>Diameter</b></p>
        </div>
        <div class="col-sm-9">
          <c:out value="${planetObject.diameter}" />
        </div>
      </div>
    </div>

    <div class="col-md-12">
      <div class="row">
        <div class="col-sm-3">
          <p><b>Climate</b></p>
        </div>
        <div class="col-sm-9">
          <c:out value="${planetObject.climate}" />
        </div>
      </div>
    </div>

    <div class="col-md-12">
      <div class="row">
        <div class="col-sm-3">
          <p><b>Gravity</b></p>
        </div>
        <div class="col-sm-9">
          <c:out value="${planetObject.gravity}" />
        </div>
      </div>
    </div>

    <div class="col-md-12">
      <div class="row">
        <div class="col-sm-3">
          <p><b>Terrain</b></p>
        </div>
        <div class="col-sm-9">
          <c:out value="${planetObject.terrain}" />
        </div>
      </div>
    </div>

    <div class="col-md-12">
      <div class="row">
        <div class="col-sm-3">
          <p><b>Surface water</b></p>
        </div>
        <div class="col-sm-9">
          <c:out value="${planetObject.surface_water}" />
        </div>
      </div>
    </div>

    <div class="col-md-12">
      <div class="row">
        <div class="col-sm-3">
          <p><b>Population water</b></p>
        </div>
        <div class="col-sm-9">
          <c:out value="${planetObject.population}" />
        </div>
      </div>
    </div>

    <div class="col-md-12">
      <div class="row">
        <div class="col-sm-3">
          <p><b>Resident</b></p>
        </div>
        <div class="col-sm-9">
          <c:forEach items="${planetObject.residents}" var="resident">
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
          <c:forEach items="${planetObject.films}" var="film">
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
          <c:out value="${planetObject.created}" />
        </div>
      </div>
    </div>

    <div class="col-md-12">
      <div class="row">
        <div class="col-sm-3">
          <p><b>Edited</b></p>
        </div>
        <div class="col-sm-9">
          <c:out value="${planetObject.edited}" />
        </div>
      </div>
    </div>

    <div class="col-md-12">
      <div class="row">
        <div class="col-sm-3">
          <p><b>URL</b></p>
        </div>
        <div class="col-sm-9">
          <c:out value="${planetObject.url}" />
        </div>
      </div>
    </div>
  </div>
</div>