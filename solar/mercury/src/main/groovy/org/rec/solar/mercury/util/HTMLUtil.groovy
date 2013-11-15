package org.rec.solar.mercury.util

import groovy.transform.Immutable

@Immutable
class HTMLUtil {
	static String removeTags(String html){
		RegexUtil.replaceAll(html, "</?[a-z][a-z0-9]*[^<>]*>|<!--.*?-->", "")
	}
}
