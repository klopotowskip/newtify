/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.0.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package sk.best.newtify.api;

import sk.best.newtify.api.dto.ArticleDTO;
import sk.best.newtify.api.dto.CreateArticleDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-07-12T16:38:44.146966800+02:00[Europe/Warsaw]")
@Validated
@Tag(name = "Articles", description = "Group of endpoints to handle operations with articles")
public interface ArticlesApi {

    /**
     * POST /v1/articles
     * This is the endpoint which will create article
     *
     * @param createArticleDTO Data model for article creation (required)
     * @return Article has been created (status code 201)
     */
    @Operation(
        operationId = "createArticle",
        tags = { "articles" },
        responses = {
            @ApiResponse(responseCode = "201", description = "Article has been created", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ArticleDTO.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/v1/articles",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    ResponseEntity<ArticleDTO> createArticle(
        @Parameter(name = "CreateArticleDTO", description = "Data model for article creation", required = true) @Valid @RequestBody CreateArticleDTO createArticleDTO
    );


    /**
     * GET /v1/articles/{articleUuid}
     * This is the endpoint which will return the detail of specified article
     *
     * @param articleUuid  (required)
     * @return returns detail of article (status code 200)
     */
    @Operation(
        operationId = "retrieveArticle",
        tags = { "articles" },
        responses = {
            @ApiResponse(responseCode = "200", description = "returns detail of article", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ArticleDTO.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/v1/articles/{articleUuid}",
        produces = { "application/json" }
    )
    ResponseEntity<ArticleDTO> retrieveArticle(
        @Parameter(name = "articleUuid", description = "", required = true) @PathVariable("articleUuid") String articleUuid
    );


    /**
     * GET /v1/articles
     * This endpoint will return list of articles
     *
     * @param topic Used to filter articles by topic (optional)
     * @return It will return list of articles (status code 200)
     */
    @Operation(
        operationId = "retrieveArticles",
        tags = { "articles" },
        responses = {
            @ApiResponse(responseCode = "200", description = "It will return list of articles", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ArticleDTO.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/v1/articles",
        produces = { "application/json" }
    )
    ResponseEntity<List<ArticleDTO>> retrieveArticles(
        @Parameter(name = "topic", description = "Used to filter articles by topic") @Valid @RequestParam(value = "topic", required = false) String topic
    );

}
