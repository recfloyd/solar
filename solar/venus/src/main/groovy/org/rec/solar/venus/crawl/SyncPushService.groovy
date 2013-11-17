package org.rec.solar.venus.crawl

import org.rec.solar.venus.crawl.bean.HeartbeatInfo
import org.rec.solar.venus.crawl.bean.JobInfo
import org.rec.solar.venus.crawl.bean.ResultInfo

interface SyncPushService {
	ResultInfo pushJobInfo(JobInfo,Short nodeID)
	HeartbeatInfo fetchHeartbeatInfo(Short nodeID)
}
