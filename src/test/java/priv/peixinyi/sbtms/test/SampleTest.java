package priv.peixinyi.sbtms.test;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import priv.peixinyi.sbtms.entity.IStudent;
import priv.peixinyi.sbtms.service.IStudentService;

import java.util.List;

/**
 * @author peixinyi
 */
@Slf4j
@SpringBootTest
public class SampleTest {

    @Resource
    IStudentService iStudentService;

    @Test
    public void test() {
        LambdaQueryWrapper<IStudent> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(IStudent::getAge, 16);
        List<IStudent> students = iStudentService.list(queryWrapper);
        log.info("16岁学生数量:{}", students.size());
    }


}
