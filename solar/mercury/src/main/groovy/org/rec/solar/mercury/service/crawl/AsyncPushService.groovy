package org.rec.solar.mercury.service.crawl

import org.rec.solar.mercury.service.crawl.bean.HeartbeatInfo
import org.rec.solar.mercury.service.crawl.bean.ResultInfo


interface AsyncPushService {
	void pushJobInfo(JobInfo,Short nodeID)
	void responseCrawlResult(ResultInfo resultInfo)
	Map<String,Object> reportHeatbeatInfo(HeartbeatInfo heartbeatInfo)
}
