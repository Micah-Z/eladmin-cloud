/*
 *  Copyright 2019-2020 Zheng Jie
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.micah.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.micah.core.base.BaseEntity;

import java.io.Serializable;
import java.util.Set;

/**
* @author zhanghouying
* @date 2019-08-24
*/
@Getter
@Setter
@TableName(value="mnt_deploy")
public class Deploy extends BaseEntity implements Serializable {

	private static final long serialVersionUID = 1890069560813035705L;
	@TableId(value = "deploy_id",type = IdType.AUTO)
	@ApiModelProperty(value = "ID", hidden = true)
    private Long id;


	private Long appId;

	/**
	 * 多对多
	 */
	@TableField(exist = false)
	private Set<ServerDeploy> deploys;

	/**
	 * 多对一
	 */
	@ApiModelProperty(value = "应用编号")
	@TableField(exist = false)
    private App app;

}
