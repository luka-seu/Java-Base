package cn.plasticlove.controller.portal;

import cn.plasticlove.commons.PageConst;
import cn.plasticlove.commons.ServerResponse;
import cn.plasticlove.service.ArticleService;
import cn.plasticlove.utils.PageStringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @author luka-seu
 * @description 文章前端控制器
 * @create 2019/3/22-20:53
 */
@Controller
@RequestMapping(value = "/article/")
public class ArticleController {

    @Autowired
    private ArticleService articleService;


    @RequestMapping(value = "list")
    @ResponseBody
    public ServerResponse getArticleList(HttpServletRequest request) {
        int pageNum = PageStringUtil.pageString2Int(request.getParameter("pageNum"));
        int pageSize = PageConst.pageSize;

        return articleService.getArticleList(pageNum, pageSize);

    }

}
