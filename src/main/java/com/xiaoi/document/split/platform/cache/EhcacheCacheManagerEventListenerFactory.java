package com.xiaoi.document.split.platform.cache;

import net.sf.ehcache.CacheManager;
import net.sf.ehcache.event.CacheManagerEventListener;
import net.sf.ehcache.event.CacheManagerEventListenerFactory;

import java.util.Properties;

/**
 * 自定义cacheManager相关事件监听工厂
 *
 * @Author Yuan Jingshan
 * @Date 2018-05-09
 */
public class EhcacheCacheManagerEventListenerFactory extends CacheManagerEventListenerFactory {

    @Override
    public CacheManagerEventListener createCacheManagerEventListener(CacheManager cacheManager, Properties properties) {
        return new EhcacheCacheManagerEventListener(cacheManager);
    }

}
