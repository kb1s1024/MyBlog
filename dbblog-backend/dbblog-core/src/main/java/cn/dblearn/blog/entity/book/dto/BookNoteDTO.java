package cn.dblearn.blog.entity.book.dto;

import cn.dblearn.blog.entity.book.BookNote;
import cn.dblearn.blog.entity.operation.Tag;
import lombok.Data;

import java.util.List;

/**
 * BookNote
 *
 * @author kb1s1024
 * @date 2019/01/08 19:04
 * @email kb1s1024@126.com
 * @description
 */
@Data
public class BookNoteDTO extends BookNote {

    private List<Tag> tagList;

}
