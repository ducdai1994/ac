package com.ducdai.strust;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class Controller extends org.apache.struts.action.Action {
private static final String success="SUCCESS";
private static final String fail="FAIL";

@Override

public ActionForward execute(ActionMapping mapping, ActionForm  form,

HttpServletRequest request, HttpServletResponse response)

throws Exception {

	User frm=(User)form;

if(frm.getName().trim().equals("")||frm.getAge()<1)

return mapping.findForward(fail);

return mapping.findForward(success);

}

}
