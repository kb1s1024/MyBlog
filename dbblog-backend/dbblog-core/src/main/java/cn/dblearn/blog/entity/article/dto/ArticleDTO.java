package cn.dblearn.blog.entity.article.dto;

import cn.dblearn.blog.entity.article.Article;
import cn.dblearn.blog.entity.operation.Tag;
import lombok.Data;

import java.util.List;

/**
 * ArticleDto
 *
 * @author kb1s1024
 * @date 2019/01/08 19:04
 * @email kb1s1024@126.com
 * @description
 */
@Data
public class ArticleDTO extends Article {

    private List<Tag> tagList;

}
