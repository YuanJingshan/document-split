package com.xiaoi.document.split.platform.cache;

import lombok.extern.slf4j.Slf4j;
import net.sf.ehcache.CacheException;
import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Status;
import net.sf.ehcache.event.CacheManagerEventListener;

/**
 * 自定义cacheManager相关事件监听
 *
 * @Author Yuan Jingshan
 * @Date 2018-05-09
 */
@Slf4j
public class EhcacheCacheManagerEventListener implements CacheManagerEventListener {

    private final CacheManager cacheManager;

    public EhcacheCacheManagerEventListener(CacheManager cacheManager) {
        this.cacheManager = cacheManager;
    }

    @Override
    public void init() throws CacheException {
        log.info("init ehcache.");
    }

    @Override
    public void dispose() throws CacheException {
        log.info("ehcache dispose.");
    }

    @Override
    public void notifyCacheAdded(String s) {
        log.info("cacheAdded. {}", s);
        log.info(cacheManager.getCache(s).toString());
    }

    @Override
    public void notifyCacheRemoved(String s) {

    }

    @Override
    public Status getStatus() {
        return null;
    }
}
