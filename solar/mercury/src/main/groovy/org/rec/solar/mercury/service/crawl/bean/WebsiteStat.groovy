package org.rec.solar.mercury.service.crawl.bean

import java.io.Serializable

class WebsiteStat implements Serializable {
	Date createTime,updateTime
	int count
	long contentLengths,milliseconds
}
