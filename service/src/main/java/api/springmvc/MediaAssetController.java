package api.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MediaAssetController {

	@RequestMapping("/mediaAssetPage.*")
	public String redirect() {
		return "mediaAssetPage";
	}
}
