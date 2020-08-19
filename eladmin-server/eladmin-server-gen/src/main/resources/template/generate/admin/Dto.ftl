/*
* Copyright 2020-2025 Micah
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

package ${package}.model.dto;

import lombok.Data;
<#if hasTimestamp>
    import java.sql.Timestamp;
</#if>
<#if hasBigDecimal>
    import java.math.BigDecimal;
</#if>
import java.io.Serializable;
<#if !auto && pkColumnType = 'Long'>
    import com.fasterxml.jackson.databind.annotation.JsonSerialize;
    import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
</#if>

/**
* @website https://el-admin.vip
* @description /
* @author ${author}
* @date ${date}
**/
@Data
public class ${className}Dto implements Serializable {
    private static final long serialVersionUID = 1L;
<#list columns as column>

    <#if column.remark != ''>
        /**
         * ${column.remark}
         */
    </#if>
    <#if column.columnKey = 'PRI'>
        <#if !auto && pkColumnType = 'Long'>
    @JsonSerialize(using= ToStringSerializer.class)
        </#if>
    </#if>
    private ${column.columnType} ${column.changeColumnName};
</#list>
}