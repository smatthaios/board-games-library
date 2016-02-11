<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page language="java" session="false" contentType="text/html; charset=UTF-8" %>
<div>
    <!-- START PAGE SIDEBAR -->
    <c:import url="../includes/sideBar.jsp" />
    <!-- END PAGE SIDEBAR -->

    <!-- START PAGE-CONTAINER -->
    <div class="page-container">
        <!-- START PAGE HEADER WRAPPER -->
        <c:import url="../includes/header.jsp" />
        <!-- END PAGE HEADER WRAPPER -->

        <!-- START PAGE CONTENT WRAPPER -->
        <div class="page-content-wrapper">
            <!-- START PAGE CONTENT -->
            <div class="content">
                <!-- START JUMBOTRON -->
                <div class="jumbotron" data-pages="parallax">
                    <div class="container-fluid container-fixed-lg sm-p-l-20 sm-p-r-20">
                        <div class="inner">
                            <!-- START BREADCRUMB -->
                            <ul class="breadcrumb">
                                <li>
                                    <p>Board Game Library</p>
                                </li>
                                <li><a href="#" class="active">MainBoard</a>
                                </li>
                            </ul>
                            <!-- END BREADCRUMB -->
                        </div>
                    </div>
                </div>
                <!-- END JUMBOTRON -->
                <!-- START CONTAINER FLUID -->
                <div class="container-fluid container-fixed-lg">
                    <!-- BEGIN PlACE PAGE CONTENT HERE -->
                    <div class="container-fluid container-fixed-lg">
                        <div class="row">
                            <div class="col-md-8">

                                <div class="panel panel-transparent">
                                    <div class="panel-heading">
                                        <div class="panel-title">Test Board Game table</div>
                                    </div>
                                    <div class="panel-body">
                                        <div class="table-responsive">
                                            <div id="detailedTable_wrapper" class="dataTables_wrapper form-inline no-footer">
                                                <table class="table table-hover table-condensed table-detailed dataTable no-footer" id="detailedTable" role="grid">
                                                    <thead>
                                                        <tr role="row">
                                                            <th style="width:25%" class="sorting_disabled" rowspan="1" colspan="1">Title</th>
                                                            <th style="width: 220px;" class="sorting_disabled" rowspan="1" colspan="1">Status</th>
                                                            <th style="width: 220px;" class="sorting_disabled" rowspan="1" colspan="1">Price</th>
                                                            <th style="width: 220px;" class="sorting_disabled" rowspan="1" colspan="1">Last Update</th>
                                                        </tr>
                                                    </thead>
                                                    <tbody>
                                                        <tr role="row" class="odd">
                                                            <td class="v-align-middle semi-bold">Revolution Begins</td>
                                                            <td class="v-align-middle">Active</td>
                                                            <td class="v-align-middle semi-bold">40 Euro</td>
                                                            <td class="v-align-middle">April 13, 2014</td>
                                                        </tr>

                                                        <tr role="row" class="even">
                                                            <td class="v-align-middle semi-bold">Revolution Begins</td>
                                                            <td class="v-align-middle">Active</td>
                                                            <td class="v-align-middle semi-bold">70 Euro</td>
                                                            <td class="v-align-middle">April 13, 2014</td>
                                                        </tr>
                                                        <tr role="row" class="odd">
                                                            <td class="v-align-middle semi-bold">Revolution Begins</td>
                                                            <td class="v-align-middle">Active</td>
                                                            <td class="v-align-middle semi-bold">20 Euro</td>
                                                            <td class="v-align-middle">April 13, 2014</td>
                                                        </tr>
                                                        <tr role="row" class="even">
                                                            <td class="v-align-middle semi-bold">Revolution Begins</td>
                                                            <td class="v-align-middle">Active</td>
                                                            <td class="v-align-middle semi-bold">90 Euro</td>
                                                            <td class="v-align-middle">April 13, 2014</td>
                                                        </tr>
                                                    </tbody>
                                                </table>
                                            </div>
                                        </div>
                                    </div>
                                </div>

                            </div>
                        </div>
                    </div>
                    <!-- END PLACE PAGE CONTENT HERE -->
                </div>
                <!-- END CONTAINER FLUID -->
            </div>
            <!-- END PAGE CONTENT -->
            <!-- START FOOTER -->
           <%-- <div class="container-fluid container-fixed-lg footer">
                <div class="copyright sm-text-center">
                    <p class="small no-margin pull-left sm-pull-reset">
                        <span class="hint-text">Copyright © 2014</span>
                        <span class="font-montserrat">REVOX</span>.
                        <span class="hint-text">All rights reserved.</span>
                  <span class="sm-block"><a href="#" class="m-l-10 m-r-10">Terms of use</a> | <a href="#" class="m-l-10">Privacy Policy</a>
                            </span>
                    </p>
                    <p class="small no-margin pull-right sm-pull-reset">
                        <a href="#">Hand-crafted</a>
                        <span class="hint-text">&amp; Made with Love ®</span>
                    </p>
                    <div class="clearfix"></div>
                </div>
            </div>--%>
            <!-- END FOOTER -->
        </div>
        <!-- END PAGE CONTENT WRAPPER -->
    </div>
    <!-- END PAGE CONTAINER -->
</div>

<script>
    (function($) {
        'use strict';
        // Initialize layouts and plugins
        $.Pages.init();
    })(window.jQuery);
</script>