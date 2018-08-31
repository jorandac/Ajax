package com.ajax.ajax;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

public class AjaxController {

@RequestMapping("/")
public ModelAndView index() {
	ModelAndView mav = new ModelAndView("index");
	return mav;

      }

}
  