package org.rec.solar.mercury.service.crawl.bean

import java.io.Serializable

class HeartbeatInfo implements Serializable {
	Short nodeID
	Date createTime
	List<WebsiteStat> websiteStats
	List<JobStat> jobStats
}
