package org.rec.solar.mercury.util

import groovy.transform.Immutable;

@Immutable
class URLUtil {
	/**
	 * RFC3986 url pattern group: 1.协议<br/>
	 * 2.//用户@域名(ip):端口 <br/>
	 * 3.用户@ <br/>
	 * 4.用户 <br/>
	 * 5.域名或者ip<br/>
	 * 7.端口<br/>
	 * 8.File <br/>
	 * 9.?参数 <br/>
	 * 10.参数 <br/>
	 * 11.#锚点
	 */
	private static final String urlRegex = "^(http|https):(//(([^@/]*)@)?([^/?#:]*)(:(\\d*))?)?([^?#]*)(\\?([^#]*))?(#.*)?";
}
