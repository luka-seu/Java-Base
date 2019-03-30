package cn.plasticlove.controller.portal;

import cn.plasticlove.commons.PageConst;
import cn.plasticlove.commons.ServerResponse;
import cn.plasticlove.entity.Type;
import cn.plasticlove.service.ArticleService;
import cn.plasticlove.service.TypeService;
import cn.plasticlove.utils.PageStringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


/**
 * The type Article controller.
 *
 * @author luka -seu
 * @description 文章前端控制器
 * @create 2019 /3/22-20:53
 */
@Controller
@RequestMapping(value = "/article/")
public class ArticleController {

    @Autowired
    private ArticleService articleService;


    @Autowired
    private TypeService typeService;


    @RequestMapping(value = "list")

    public String getArticleList(Model model) {
        model.addAttribute("model","Demo");
        return "hello";

    }

    @RequestMapping(value = "typelist")

    public String getTypes(Model model){
        List<Type> typeList = (List<Type>) typeService.getTypeList().getData();

        model.addAttribute("typeList",typeList);
        return "article";
    }

}
