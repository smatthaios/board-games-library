<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!-- BEGIN SIDEBAR -->
<div class="page-sidebar" data-pages="sidebar">
    <div id="appMenu" class="sidebar-overlay-slide from-top">
    </div>
    <!-- BEGIN SIDEBAR HEADER -->
    <div class="sidebar-header">
        <img src="<c:url value="/assets/img/logo.png" />" alt="logo" class="brand" data-src="<c:url value="/assets/img/logo.png" />"
                                data-src-retina="<c:url value="/assets/img/logo.png" />" width="90" height="40">
        <div class="sidebar-header-controls">
            <button data-pages-toggle="#appMenu" class="btn btn-xs sidebar-slide-toggle btn-link m-l-20" type="button"><i class="fa fa-angle-down fs-16"></i>
            </button>
            <button data-toggle-pin="sidebar" class="btn btn-link visible-lg-inline" type="button"><i class="fa fs-12"></i>
            </button>
        </div>
    </div>
    <!-- END SIDEBAR HEADER -->
    <!-- BEGIN SIDEBAR MENU -->
    <div class="sidebar-menu">
        <ul class="menu-items">
            <li class="">
                <a href="javascript:;">
                    <span class="title">User Menu</span>
                    <span class=" arrow"></span>
                </a>
                <span class="icon-thumbnail"><i class="pg-grid"></i></span>
                <ul class="sub-menu">
                    <li class="">
                        <a href="#">Create User</a>
                        <span class="icon-thumbnail">cu</span>
                    </li>
                    <li class="">
                        <a href="#">Update User</a>
                        <span class="icon-thumbnail">uu</span>
                    </li>
                    <li class="">
                        <a href="#">Delete User</a>
                        <span class="icon-thumbnail">du</span>
                    </li>
                </ul>
            </li>
            <li class="">
                <a href="javascript:;">
                    <span class="title">Board Game Menu</span>
                    <span class=" arrow"></span>
                </a>
                <span class="icon-thumbnail"><i class="pg-grid"></i></span>
                <ul class="sub-menu">
                    <li class="">
                        <a href="#">Create Board Game</a>
                        <span class="icon-thumbnail">cbg</span>
                    </li>
                    <li class="">
                        <a href="#">Update Board Game</a>
                        <span class="icon-thumbnail">ubg</span>
                    </li>
                    <li class="">
                        <a href="#">Delete Board Game</a>
                        <span class="icon-thumbnail">dbg</span>
                    </li>
                </ul>
            </li>
        </ul>
        <div class="clearfix"></div>
    </div>
    <!-- END SIDEBAR MENU -->
</div>
<!-- END SIDEBAR -->
