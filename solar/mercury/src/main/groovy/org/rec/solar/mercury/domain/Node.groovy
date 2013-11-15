package org.rec.solar.mercury.domain

import groovy.transform.ToString;

import java.io.Serializable
@ToString(cache=true,includeNames=true,includeSuper=true)
class Node extends BizEntity implements Serializable {
	Short id
	String innerIP,outerIP,host,location,group
	Integer bandwidth
	Byte bandwidthType
}
