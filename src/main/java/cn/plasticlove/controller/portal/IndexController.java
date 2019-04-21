package cn.plasticlove.controller.portal;

import cn.plasticlove.commons.PageConst;
import cn.plasticlove.dto.ArticleDto;
import cn.plasticlove.service.ArticleService;
import cn.plasticlove.service.UserService;
import cn.plasticlove.utils.PageStringUtil;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author luka-seu
 * @description the index page
 * @create 2019/3/26-12:43
 */
@Controller
public class IndexController {
    @Autowired
    private ArticleService articleService;
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/")
    public String index(HttpServletRequest request,Model model){
        //文章相关
        int page = PageStringUtil.pageString2Int(request.getParameter("page"));
        PageInfo<ArticleDto> dtoPageInfo = articleService.getArticleList(page, PageConst.pageSize).getData();
        List<ArticleDto> articleList = dtoPageInfo.getList();


        model.addAttribute("articleList",articleList);
        model.addAttribute("pageCount",dtoPageInfo.getPages());
        model.addAttribute("page",page);
        return "index";
    }
}
