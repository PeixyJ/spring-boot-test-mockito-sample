package priv.peixinyi.sbtms.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import priv.peixinyi.sbtms.mapper.IStudentMapper;
import priv.peixinyi.sbtms.entity.IStudent;
/**
 * ${description}
 * 
 * @author peixinyi 
 */
@Service
public class IStudentService extends ServiceImpl<IStudentMapper, IStudent> {

}
