package sen3004.project;


import org.springframework.validation.BindingResult;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import sen3004.project.validator.MatchValidator;

@Controller
public class finalController {

	@Autowired
	MatchValidator fmv;
	
	@RequestMapping(value = {"/display-form", "form.html"} , method = RequestMethod.GET)
	public ModelAndView displayForm() {
		ModelAndView mv = new ModelAndView("form");
		mv.addObject("formData", new Person());
		
		

		return mv;
	}

	@RequestMapping(value = "/send-form-data", method = RequestMethod.POST)
	public ModelAndView processForm(@Valid @ModelAttribute("formData") Person personObject, BindingResult result) {
		ModelAndView mv = new ModelAndView("result");
		mv.addObject("formData", personObject);

		if (result.hasErrors())
			mv.setViewName("form");
		else
			mv.setViewName("result");

		return mv;
	}
}
