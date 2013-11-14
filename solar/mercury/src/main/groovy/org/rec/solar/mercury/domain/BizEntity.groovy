package org.rec.solar.mercury.domain

import groovy.transform.ToString

@ToString(cache=true,includeNames=true)
abstract class BizEntity implements Serializable{
	String createBy,updateBy
	Date createTime,updateTime
	Byte status
}
