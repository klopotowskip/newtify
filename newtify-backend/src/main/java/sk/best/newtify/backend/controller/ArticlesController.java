package sk.best.newtify.backend.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import sk.best.newtify.api.ArticlesApi;
import sk.best.newtify.api.dto.ArticleDTO;
import sk.best.newtify.api.dto.CreateArticleDTO;

import java.util.List;


@Controller
public class ArticlesController implements ArticlesApi {
    /**
     * POST /v1/articles
     * This is the endpoint which will create article
     *
     * @param createArticleDTO Data model for article creation (required)
     * @return Article has been created (status code 201)
     */
    @Override
    public ResponseEntity<ArticleDTO> createArticle(CreateArticleDTO createArticleDTO) {
        return null;
    }

    /**
     * GET /v1/articles/{articleUuid}
     * This is the endpoint which will return the detail of specified article
     *
     * @param articleUuid (required)
     * @return returns detail of article (status code 200)
     */
    @Override
    public ResponseEntity<ArticleDTO> retrieveArticle(String articleUuid) {
        return null;
    }

    /**
     * GET /v1/articles
     * This endpoint will return list of articles
     *
     * @param topic Used to filter articles by topic (optional)
     * @return It will return list of articles (status code 200)
     */
    @Override
    public ResponseEntity<List<ArticleDTO>> retrieveArticles(String topic) {
        return null;
    }
}
