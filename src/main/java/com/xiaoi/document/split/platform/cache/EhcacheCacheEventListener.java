package com.xiaoi.document.split.platform.cache;

import lombok.extern.slf4j.Slf4j;
import net.sf.ehcache.CacheException;
import net.sf.ehcache.Ehcache;
import net.sf.ehcache.Element;
import net.sf.ehcache.event.CacheEventListener;

/**
 * 自定义cache相关事件监听
 *
 * @Author Yuan Jingshan
 * @Date 2018-05-09
 */
@Slf4j
public class EhcacheCacheEventListener implements CacheEventListener {

    @Override
    public void notifyElementRemoved(Ehcache ehcache, Element element) throws CacheException {
        log.info("cache removed. key = {}, value = {}", element.getObjectKey(), element.getObjectValue());
    }

    @Override
    public void notifyElementPut(Ehcache ehcache, Element element) throws CacheException {
        log.info("cache put. key = {}, value = {}", element.getObjectKey(), element.getObjectValue());
    }

    @Override
    public void notifyElementUpdated(Ehcache ehcache, Element element) throws CacheException {
        log.info("cache updated. key = {}, value = {}", element.getObjectKey(), element.getObjectValue());
    }

    @Override
    public void notifyElementExpired(Ehcache ehcache, Element element) {
        log.info("cache expired. key = {}, value = {}", element.getObjectKey(), element.getObjectValue());
    }

    @Override
    public void notifyElementEvicted(Ehcache ehcache, Element element) {
        log.info("cache evicted. key = {}, value = {}", element.getObjectKey(), element.getObjectValue());
    }

    @Override
    public void notifyRemoveAll(Ehcache ehcache) {
        log.info("all elements removed. cache name = {}", ehcache.getName());
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    @Override
    public void dispose() {
        log.info("cache dispose.");
    }
}
