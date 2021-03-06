<%@ page import="org.springframework.web.servlet.i18n.SessionLocaleResolver" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<script type='text/javascript' src="<c:url value="/js/jquery/jquery.min.js" />"></script>
<script type="text/javascript" src="<c:url value="/js/jquery/jquery.blockUI.js" />"></script>
<script type="text/javascript" src="<c:url value="/js/jquery/jquery.gritter.min.js" />"></script>
<script type="text/javascript" src="<c:url value="/js/jquery/jquery-ui.min.js" />"></script>
<script type="text/javascript" src="<c:url value="/js/jquery/jquery.validate.min.js" />"></script>
<script type="text/javascript" src="<c:url value="/js/angular/angular.min.js" />"></script>
<script type="text/javascript" src="<c:url value="/js/angular/angular-route.min.js" />"></script>
<script type="text/javascript" src="<c:url value="/js/angular/select2.js" />"></script>
<script type="text/javascript" src="<c:url value="/js/bootstrap/bootstrap.min.js" />"></script>
<script type="text/javascript" src="<c:url value="/js/bootstrap/bootbox.min.js" />"></script>
<script type="text/javascript" src="<c:url value="/js/generic/modernizr.min.js" />"></script>
<script type="text/javascript" src="<c:url value="/js/app.js" />"></script>
<script type="text/javascript" src="<c:url value="/js/c.js" />"></script>
<script type="text/javascript" src="<c:url value="/js/service.js" />"></script>
<%--<script type="text/javascript" src="<c:url value="/js/application/controllers/login.js" />"></script>
<script type="text/javascript" src="<c:url value="/js/application/services/userRestService.js" />"></script>--%>
<script type="text/javascript" src="<c:url value="/js/messages.js" />"></script>

<%-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries  --%>
<!--[if lt IE 9]>
<script type="text/javascript" src="<c:url value='/js/ie/html5shiv.js' />"></script>
<script type="text/javascript" src="<c:url value='/js/ie/respond.min.js' />"></script>
<![endif]-->

<!--[if IE ]>
<script type="text/javascript" src="<c:url value="/js/generic/json3.min.js" />"></script>
<![endif]-->

<!--[if lte IE 8]>
<script>
window.location = "browserCompatibility.html"
</script>
<![endif]-->

<link rel="stylesheet" type="text/css" href="<c:url value="/styles/b.css" />" />
<link rel="stylesheet" type="text/css" href="<c:url value="/styles/generic.css" />" />
<link rel="stylesheet" type="text/css" href="<c:url value="/styles/ace.css" />" />
<link rel="stylesheet" type="text/css" href="<c:url value="/styles/app.css" />" />

<link type="image/x-icon" rel="shortcut icon" href="<c:url value="/img/favicon.ico" />" />

<meta http-equiv="X-UA-Compatible" content="IE=Edge" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />

<script>
    baseUrl = '<c:url value="/" />';

    ACTIVE_LOCALE = '<%=session.getAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME)%>';

</script>
<title><fmt:message key="general.label.title" /></title>