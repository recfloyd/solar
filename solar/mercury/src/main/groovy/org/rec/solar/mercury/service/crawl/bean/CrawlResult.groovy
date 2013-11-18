package org.rec.solar.mercury.service.crawl.bean

import java.io.Serializable

class CrawlResult implements Serializable {
	Long urlID
	Byte status
	List<CrawlResult> children
	List<Map<String, Object>> entities
	List<Map<String,Object>> extra
}
