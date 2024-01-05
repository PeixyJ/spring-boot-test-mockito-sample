package priv.peixinyi.sbtms.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * ${description}
 *
 * @author peixinyi
 */
@Data
@NoArgsConstructor
@TableName(value = "i_class")
public class IClass {
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField(value = "`name`")
    private String name;

    @TableField(exist = false)
    private List<IStudent> students;

    public static final String COL_ID = "id";

    public static final String COL_NAME = "name";
}