package org.rec.solar.mercury.service.crawl.bean

import java.io.Serializable

class JobStat implements Serializable {
	Long jobId
	Date startTime
	int total
	Map<Byte,Integer> stats
}
