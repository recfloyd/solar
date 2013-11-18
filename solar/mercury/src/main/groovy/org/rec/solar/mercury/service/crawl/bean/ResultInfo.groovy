package org.rec.solar.mercury.service.crawl.bean

import java.io.Serializable

class ResultInfo implements Serializable {
	Short JobID
	List<CrawlResult> results
}
