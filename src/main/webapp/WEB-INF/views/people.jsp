<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<link href=<c:url value="/resources/dist/css/select2.min.css" /> rel="stylesheet" />
<link href=<c:url value="/resources/dist/css/select2-bootstrap.css" /> rel="stylesheet" />
<link href=<c:url value="/resources/dist/css/result.css" /> rel="stylesheet" />

<div class="panel panel-default">
  <div class="panel-heading">
    <h3>Request results for person with ID: <c:out value="${id}" /></h3>
  </div>
  <div class="panel-body">

    <div class="col-md-12">
      <div class="row">
        <div class="col-sm-3">
          <p><b>Name</b></p>
        </div>
        <div class="col-sm-9">
          <c:out value="${people.name}" />
        </div>
      </div>
    </div>

    <div class="col-md-12">
      <div class="row">
        <div class="col-sm-3">
          <p><b>Height</b></p>
        </div>
        <div class="col-sm-9">
          <c:out value="${people.height}" />
        </div>
      </div>
    </div>

    <div class="col-md-12">
      <div class="row">
        <div class="col-sm-3">
          <p><b>Mass</b></p>
        </div>
        <div class="col-sm-9">
          <c:out value="${people.mass}" />
        </div>
      </div>
    </div>

    <div class="col-md-12">
      <div class="row">
        <div class="col-sm-3">
          <p><b>Hair color</b></p>
        </div>
        <div class="col-sm-9">
          <c:out value="${people.hair_color}" />
        </div>
      </div>
    </div>

    <div class="col-md-12">
      <div class="row">
        <div class="col-sm-3">
          <p><b>Skin color</b></p>
        </div>
        <div class="col-sm-9">
          <c:out value="${people.skin_color}" />
        </div>
      </div>
    </div>

    <div class="col-md-12">
      <div class="row">
        <div class="col-sm-3">
          <p><b>Eye color</b></p>
        </div>
        <div class="col-sm-9">
          <c:out value="${people.eye_color}" />
        </div>
      </div>
    </div>

    <div class="col-md-12">
      <div class="row">
        <div class="col-sm-3">
          <p><b>Birth year</b></p>
        </div>
        <div class="col-sm-9">
          <c:out value="${people.birth_year}" />
        </div>
      </div>
    </div>

    <div class="col-md-12">
      <div class="row">
        <div class="col-sm-3">
          <p><b>Gender</b></p>
        </div>
        <div class="col-sm-9">
          <c:out value="${people.gender}" />
        </div>
      </div>
    </div>

    <div class="col-md-12">
      <div class="row">
        <div class="col-sm-3">
          <p><b>Homeworld</b></p>
        </div>
        <div class="col-sm-9">
          <c:out value="${people.homeworld}" />
        </div>
      </div>
    </div>

    <div class="col-md-12">
      <div class="row">
        <div class="col-sm-3">
          <p><b>Films</b></p>
        </div>
        <div class="col-sm-9">
          <c:forEach items="${people.films}" var="film">
            <span class='label label-info'/>${film}</span>
          </c:forEach>
        </div>
      </div>
    </div>

    <div class="col-md-12">
      <div class="row">
        <div class="col-sm-3">
          <p><b>Species</b></p>
        </div>
        <div class="col-sm-9">
          <c:forEach items="${people.species}" var="specie">
            <span class='label label-info'/>${specie}</span>
          </c:forEach>
        </div>
      </div>
    </div>

    <div class="col-md-12">
      <div class="row">
        <div class="col-sm-3">
          <p><b>Vehicles</b></p>
        </div>
        <div class="col-sm-9">
          <c:forEach items="${people.vehicles}" var="vehicle">
            <span class='label label-info'/>${vehicle}</span>
          </c:forEach>
        </div>
      </div>
    </div>

    <div class="col-md-12">
      <div class="row">
        <div class="col-sm-3">
          <p><b>Starships</b></p>
        </div>
        <div class="col-sm-9">
          <c:forEach items="${people.starships}" var="starship">
            <span class='label label-info'/>${starship}</span>
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
          <c:out value="${people.created}" />
        </div>
      </div>
    </div>

    <div class="col-md-12">
      <div class="row">
        <div class="col-sm-3">
          <p><b>Edited</b></p>
        </div>
        <div class="col-sm-9">
          <c:out value="${people.edited}" />
        </div>
      </div>
    </div>

    <div class="col-md-12">
      <div class="row">
        <div class="col-sm-3">
          <p><b>URL</b></p>
        </div>
        <div class="col-sm-9">
          <c:out value="${people.url}" />
        </div>
      </div>
    </div>
  </div>
</div>