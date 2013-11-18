package org.rec.solar.venus.util

import groovy.transform.Immutable
import jregex.MatchIterator
import jregex.MatchResult
import jregex.Matcher
import jregex.Pattern
import jregex.Replacer

import com.google.common.cache.CacheBuilder
import com.google.common.cache.CacheLoader
import com.google.common.cache.LoadingCache

@Immutable
class RegexUtil {
	private static LoadingCache<String, Pattern> patternCache = CacheBuilder
	.newBuilder().concurrencyLevel(16).initialCapacity(1)
	.maximumSize(512).softValues()
	.build(new CacheLoader<String, Pattern>() {
		@Override
		public Pattern load(String regex) throws Exception {
			new Pattern(regex)
		}
	})

	private static Matcher getMatcher(String string, String regex) {
		patternCache.get(regex).matcher(string)
	}

	static boolean find(String string,String regex){
		getMatcher(string, regex).find()
	}

	static boolean matches(String string,String regex){
		getMatcher(string, regex).matches()
	}

	static String extract(String string,String regex,int group){
		Matcher matcher=getMatcher(string, regex)
		matcher.find()?matcher.group(group):null
	}

	static List<String> multiExtract(String string,String regex,int[] groups){
		List<String> result=[]
		Matcher matcher=getMatcher(string, regex)
		if(matcher.find())
			for(int group in groups){
				result << matcher.group(group)
			}
		result
	}

	static List<List<String>> recycleExtract(String string,String regex,int[] groups){
		Matcher matcher = getMatcher(string, regex)
		List<List<String>> result = []
		MatchIterator matchIterator = matcher.findAll()
		MatchResult mr = null
		List<String> groupResult = null

		while (matchIterator.hasMore()) {
			mr = matchIterator.nextMatch()
			groupResult = new ArrayList<String>(groups.length);
			for (int group in groups) {
				groupResult.add(mr.group(group))
			}
			result.add(groupResult)
		}

		result
	}

	static String replaceAll(String string, String regex,
			String replacement) {
		new Replacer(patternCache.get(regex), replacement).replace(string)
	}
}
