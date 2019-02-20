package org.javahotfix.threading.controller;

import org.javahotfix.threading.config.SomeServiceBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SomeController {

	@Autowired
	private SomeServiceBean someServiceBean;
	
	@RequestMapping(value="/somecontroller" ,method=RequestMethod.GET)
	public ResponseEntity<String> performOperation(
			@RequestParam(required=false, name= "operationCode", defaultValue="") String requestCode) {
		long timeDuration = 0;
		String responseText;
		try {
			switch(requestCode) {
			case "A" :
				timeDuration = getSomeServiceBean().performOperationA();
				responseText = "Operation A Successful";
				break;
			case "B" :
				timeDuration = getSomeServiceBean().performOperationA();
				responseText = "Operation A Successful";
				break;
			case "C" :
				timeDuration = getSomeServiceBean().performOperationA();
				responseText = "Operation A Successful";
				break;
			case "D" :
				timeDuration = getSomeServiceBean().performOperationA();
				responseText = "Operation A Successful";
				break;
			default :
				timeDuration = -1;
				responseText = "Operation no supported yet.";
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
			timeDuration = -1;
			responseText = e.getMessage();
		}
		return new ResponseEntity<String>("Operation Duration : " + timeDuration + ". Message : " + responseText, HttpStatus.OK);
	}

	public SomeServiceBean getSomeServiceBean() {
		return someServiceBean;
	}

	public void setSomeServiceBean(SomeServiceBean someServiceBean) {
		this.someServiceBean = someServiceBean;
	}
}
