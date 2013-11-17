package org.rec.solar.venus.crawl

import java.util.Map;

import org.rec.solar.venus.crawl.bean.HeartbeatInfo
import org.rec.solar.venus.crawl.bean.JobInfo
import org.rec.solar.venus.crawl.bean.ResultInfo

interface AsyncPushService {
	void pushJobInfo(JobInfo,Short nodeID)
	void responseCrawlResult(ResultInfo resultInfo)
	Map<String,Object> reportHeatbeatInfo(HeartbeatInfo heartbeatInfo)
}
