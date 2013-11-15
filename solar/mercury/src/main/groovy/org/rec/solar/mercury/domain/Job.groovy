package org.rec.solar.mercury.domain

import groovy.transform.ToString;

import java.io.Serializable
@ToString(cache=true,includeNames=true,includeSuper=true)
class Job extends BizEntity implements Serializable {
	Long id
	Short websiteID,nodeID
	List<CrawlURL> urls
	Byte mode
}
