package org.rec.solar.venus.crawl.bean

import org.rec.solar.mercury.domain.Job

class JobInfo implements Serializable{
	Job job
	Map<String,Object> commands
}
