package priv.peixinyi.sbtms.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ${description}
 *
 * @author peixinyi
 */
@Data
@NoArgsConstructor
@TableName(value = "i_student")
public class IStudent {
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField(value = "class_id")
    private Integer classId;

    @TableField(value = "`name`")
    private String name;

    @TableField(value = "age")
    private Integer age;

    public static final String COL_ID = "id";

    public static final String COL_CLASS_ID = "class_id";

    public static final String COL_NAME = "name";

    public static final String COL_AGE = "age";
}