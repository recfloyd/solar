package org.rec.solar.mercury.service.crawl

import org.rec.solar.mercury.service.crawl.bean.HeartbeatInfo
import org.rec.solar.mercury.service.crawl.bean.JobInfo
import org.rec.solar.mercury.service.crawl.bean.ResultInfo


interface PollService {
	JobInfo pollJobInfo(Short nodeID)
	void responseCrawlResult(ResultInfo resultInfo)
	Map<String,Object> reportHeatbeatInfo(HeartbeatInfo heartbeatInfo)
}
