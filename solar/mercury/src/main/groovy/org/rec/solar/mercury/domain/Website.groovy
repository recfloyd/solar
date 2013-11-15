package org.rec.solar.mercury.domain

import groovy.transform.ToString;

import java.io.Serializable
@ToString(cache=true,includeNames=true,includeSuper=true)
class Website extends BizEntity implements Serializable {
	Short id
	String name,alias
	List<String> domains
	Byte crawlType
}
