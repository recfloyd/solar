package org.rec.solar.mercury.service.crawl.bean

import groovy.transform.Immutable;

@Immutable
class Constant {
	static final byte CRAWLRESULT_STATUS_NORMAL=1
	static final byte CRAWLRESULT_STATUS_UNMODIFIED=2
	static final byte CRAWLRESULT_STATUS_DISABLED=3
	static final byte CRAWLRESULT_STATUS_FAIL_DOWNLOAD=4
	static final byte CRAWLRESULT_STATUS_FAIL_PROCESS=5
	static final byte CRAWLRESULT_STATUS_FAIL_UNKNOWD=6
}
