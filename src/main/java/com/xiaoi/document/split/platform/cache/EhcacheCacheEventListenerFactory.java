package com.xiaoi.document.split.platform.cache;

import net.sf.ehcache.event.CacheEventListener;
import net.sf.ehcache.event.CacheEventListenerFactory;

import java.util.Properties;

/**
 * 自定义cache相关事件监听工厂
 *
 * @Author Yuan Jingshan
 * @Date 2018-05-09
 */
public class EhcacheCacheEventListenerFactory extends CacheEventListenerFactory {

    @Override
    public CacheEventListener createCacheEventListener(Properties properties) {
        return new EhcacheCacheEventListener();
    }

}
