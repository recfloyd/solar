package org.rec.solar.mercury.service.crawl

import org.rec.solar.mercury.service.crawl.bean.HeartbeatInfo
import org.rec.solar.mercury.service.crawl.bean.ResultInfo


interface SyncPushService {
	ResultInfo pushJobInfo(JobInfo,Short nodeID)
	HeartbeatInfo fetchHeartbeatInfo(Short nodeID)
}
