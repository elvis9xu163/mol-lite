package com.xjd.mol.app.ctrlr;

import com.xjd.mol.app.view.View;
import com.xjd.mol.app.view.ViewUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/1.0")
public class CommonController {

	@RequestMapping("/syncTips")
	@ResponseBody
	public View syncTips(@RequestParam(value = "tipsKey", required = false) String tipsKey) {

		return ViewUtil.defaultView();
	}

}
