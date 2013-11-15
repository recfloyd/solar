package org.rec.solar.mercury.domain

import groovy.transform.Immutable;

@Immutable
class Constant {
	static final byte COMMON_STATUS_AVAILABLE=1
	static final byte COMMON_STATUS_UNAVAILABLE=2

	static final byte CRAWL_TYPE_CYCLING=1
	static final byte CRAWL_TYPE_ONCE=2

	static final byte BANDWIDTH_TYPE_SHARING=1
	static final byte BANDWIDTH_TYPE_MONOPOLIZE=2

	static final byte JOB_MODE_POLL=1
	static final byte JOB_MODE_PUSH_SYC=2
	static final byte JOB_MODE_PUSH_ASYC=3

	static final byte PAGE_TYPE_UNKNOWN=1
}
