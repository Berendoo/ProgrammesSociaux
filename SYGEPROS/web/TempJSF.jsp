<%-- 
    Document   : TempJSF
    Created on : May 16, 2016, 2:46:37 PM
    Author     : Benucci
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<f:view>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
            <title>JSP Page</title>
        </head>
        <body>
        <p:menu type="tiered" style="width:180px">  
            <p:submenu label="Ajax Menuitems" icon="ui-icon ui-icon-refresh">  
                <p:menuitem value="Save" actionListener="#{buttonBean.save}" update="messages" icon="ui-icon ui-icon-disk" />  
                <p:menuitem value="Update" actionListener="#{buttonBean.update}" update="messages" icon="ui-icon ui-icon-arrowrefresh-1-w" />  
            </p:submenu>  
            <p:submenu label="Non-Ajax Menuitem" icon="ui-icon ui-icon-newwin">  
                <p:menuitem value="Delete" actionListener="#{buttonBean.delete}" update="messages" ajax="false" icon="ui-icon ui-icon-close"/>  
            </p:submenu>  
            <p:submenu label="Navigations" icon="ui-icon ui-icon-extlink">  
                <p:submenu label="Prime Links">  
                    <p:menuitem value="Prime" url="http://www.prime.com.tr" />  
                    <p:menuitem value="PrimeFaces" url="http://www.primefaces.org" />  
                </p:submenu>  
                <p:menuitem value="TouchFaces" url="#{request.contextPath}/touch" />  
            </p:submenu>  
        </p:menu>
    </body>
</html>
</f:view>
