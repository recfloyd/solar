package org.rec.solar.mercury.domain

import groovy.transform.ToString;

import java.io.Serializable
@ToString(cache=true,includeNames=true,includeSuper=true)
class App extends BizEntity implements Serializable {
	Byte id,crawlType
	String name,description
}
