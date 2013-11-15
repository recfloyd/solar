package org.rec.solar.mercury.domain

import java.util.Map;

import groovy.transform.ToString
@ToString(cache=true,includeNames=true)
class CrawlRecord implements Serializable {
	Date lastTime,nextTime
	Short lastNodeID
	Map<String, Object> crawlParams
	Byte status
}
