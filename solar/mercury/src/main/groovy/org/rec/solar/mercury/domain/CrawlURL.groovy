package org.rec.solar.mercury.domain

import groovy.transform.ToString;

import java.io.Serializable
@ToString(cache=true,includeNames=true,includeSuper=true)
class CrawlURL extends BizEntity implements Serializable {
	Long id,fingerprint,parentID,rootID
	Byte appID
	Short websiteID
	Byte crawlType,pageType,depth
	String url
	Map<String, Object> appParams
	CrawlRecord crawlRecord
}
