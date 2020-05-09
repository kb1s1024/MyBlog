package cn.dblearn.blog.entity.book.dto;

import cn.dblearn.blog.entity.book.Book;
import cn.dblearn.blog.entity.operation.Tag;
import lombok.Data;

import java.util.List;

/**
 * ReadBookDto
 *
 * @author kb1s1024
 * @date 2019/01/28 16:44
 * @email kb1s1024@126.com
 * @description
 */
@Data
public class BookDTO extends Book {

    List<Tag> tagList;
}
