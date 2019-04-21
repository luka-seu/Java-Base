package cn.plasticlove.controller.portal;

import cn.plasticlove.dto.ArticleDto;
import cn.plasticlove.entity.Article;
import cn.plasticlove.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * The type Detail controller.
 *
 * @author luka -seu
 * @description the controller of details of articles
 * @create 2019 /3/30-15:56
 */
@Controller
@RequestMapping(value = "/detail/")
public class DetailController {
    @Autowired
    private ArticleService articleService;


    /**
     * Gets detail.
     *
     * @param articleId the article id
     * @param model     the model
     * @return the detail
     */
    @RequestMapping(value = "{articleId}")
    public String getDetail(@PathVariable("articleId") String articleId, Model model){

        ArticleDto article = (ArticleDto) articleService.getArticleById(articleId).getData();
        model.addAttribute("article",article);
        return "detail";

    }
}
