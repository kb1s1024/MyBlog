package cn.dblearn.blog.portal.operation.service.impl;

import cn.dblearn.blog.entity.operation.Tag;
import cn.dblearn.blog.entity.operation.vo.TagVO;
import cn.dblearn.blog.mapper.operation.TagMapper;
import cn.dblearn.blog.portal.operation.service.TagService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * TagServiceImpl
 *
 * @author kb1s1024
 * @date 2019/02/22 16:34
 * @email kb1s1024@126.com
 * @description
 */
@Service("TagPortalService")
public class TagServiceImpl extends ServiceImpl<TagMapper, Tag> implements TagService {


    /**
     * 获取tagVoList
     *
     * @return
     */
    @Override
    public List<TagVO> listTagVo() {
        return baseMapper.listTagVo();
    }
}
