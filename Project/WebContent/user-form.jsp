<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
        <html>

        <head>
            <title>Job List</title>
            <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        </head>

        <body>

            <header>
                <nav class="navbar navbar-expand-md navbar-dark" style="background-color: tomato">
                    <!-- <div>
                        <a href="recruiternavbar.jsp" class="navbar-brand"> Back to Homepage </a>
                    </div> -->

                    <ul class="navbar-nav">
                        <li><a href="<%=request.getContextPath()%>/list" class="nav-link" target="display">Open Jobs</a></li>
                    </ul>
                </nav>
            </header>
            <br>
            <div class="container col-md-5">
                <div class="card">
                    <div class="card-body">
                        <c:if test="${user != null}">
                            <form action="update" method="post">
                        </c:if>
                        <c:if test="${user == null}">
                            <form action="insert" method="post">
                        </c:if>

                        <caption>
                            <h2>
                            
                                <c:if test="${user != null}">
                                    Edit User
                                </c:if>
                                <c:if test="${user == null}">
                                    Add New User
                                </c:if>
                            </h2>
                        </caption>

                        <c:if test="${user != null}">
                            <input type="hidden" name="id" value="<c:out value='${user.id}' />" />
                        </c:if>

                        <fieldset class="form-group">
                            <label>User Name</label> <input type="text" value="<c:out value='${user.name}' />" class="form-control" name="name" required="required">
                        </fieldset>

                        <fieldset class="form-group">
                            <label>User Email</label> <input type="text" value="<c:out value='${user.email}' />" class="form-control" name="email">
                        </fieldset>

                        <fieldset class="form-group">
                            <label>User Country</label> <input type="text" value="<c:out value='${user.country}' />" class="form-control" name="country">
                        </fieldset>
                        
                        <fieldset class="form-group">
                            <label>User Experience</label> <input type="text" value="<c:out value='${user.experience}' />" class="form-control" name="experience">
                        </fieldset>
                        
                        
                        <fieldset class="form-group">
                            <label>Application link</label> <input type="text" value="<c:out value='${user.formLink}' />" class="form-control" name="formLink">
                        </fieldset>
                        
                          <fieldset class="form-group">
                            <label>Skills</label> <input type="text" value="<c:out value='${user.skills}' />" class="form-control" name="skills">
                        </fieldset>
                        
                          <fieldset class="form-group">
                            <label>Job Description</label> <input type="text" value="<c:out value='${user.jobdescription}' />" class="form-control" name="jobdescription">
                        </fieldset>
                        
                          <fieldset class="form-group">
                            <label>Job Location</label> <input type="text" value="<c:out value='${user.joblocation}' />" class="form-control" name="joblocation">
                        </fieldset>
                        

                        <button type="submit" class="btn btn-success">Save</button>
                        </form>
                    </div>
                </div>
            </div>
        </body>

        </html>