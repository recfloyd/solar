package org.rec.solar.venus.crawl

import org.rec.solar.venus.crawl.bean.HeartbeatInfo
import org.rec.solar.venus.crawl.bean.JobInfo
import org.rec.solar.venus.crawl.bean.ResultInfo

interface PollService {
	JobInfo pollJobInfo(Short nodeID)
	void responseCrawlResult(ResultInfo resultInfo)
	Map<String,Object> reportHeatbeatInfo(HeartbeatInfo heartbeatInfo)
}
