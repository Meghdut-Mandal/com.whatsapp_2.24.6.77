package com.facebook.cameracore.ardelivery.xplatcache.stash;

import X.AnonymousClass001;
import X.C90514aH;
import com.facebook.cameracore.ardelivery.xplatcache.ARDFileCache;
import com.facebook.cameracore.ardelivery.xplatcache.ARDFileCacheEntry;
import com.facebook.cameracore.ardelivery.xplatcache.ARDFileInMemoryStatus;
import com.facebook.jni.HybridData;
import com.facebook.soloader.SoLoader;
import com.facebook.stash.core.FileStash;
import java.io.File;
import java.util.Map;
import java.util.Set;

public class StashARDFileCache extends ARDFileCache {
    public static final StashARDFileCache $redex_init_class = null;
    public final FileStash mStash;

    public static native HybridData initHybrid(long j, FileStash fileStash);

    public void commit(String str) {
    }

    public void unlock(String str) {
    }

    static {
        SoLoader.A06("ardcache-stash");
    }

    public void clear() {
        this.mStash.Bng();
    }

    public void flush() {
        throw AnonymousClass001.A0E("flush() is not supported in Stash");
    }

    public Map.Entry[] getAllMetas() {
        throw AnonymousClass001.A0E("getAllMetas() is not supported in Stash");
    }

    public ARDFileCacheEntry getCacheEntry(String str) {
        File file = this.mStash.getFile(str);
        if (file != null) {
            return new ARDFileCacheEntry(file.getAbsolutePath());
        }
        return null;
    }

    public ARDFileCacheEntry getCacheEntryWithoutPromotion(String str) {
        if (!this.mStash.BJu(str)) {
            return null;
        }
        return new ARDFileCacheEntry(this.mStash.getFilePath(str).getAbsolutePath());
    }

    public long getSize() {
        return this.mStash.BHe();
    }

    public ARDFileCacheEntry insertAndLock(String str) {
        return new ARDFileCacheEntry(this.mStash.insertFile(str).getAbsolutePath());
    }

    public ARDFileInMemoryStatus memContains(String str) {
        if (this.mStash.BJu(str)) {
            return ARDFileInMemoryStatus.IN_CACHE;
        }
        return ARDFileInMemoryStatus.NOT_IN_CACHE;
    }

    public boolean remove(String str) {
        return this.mStash.Bnd(str);
    }

    public boolean updateExtra(String str, byte[] bArr) {
        throw AnonymousClass001.A0E("updateExtra() is not supported in Stash");
    }

    public StashARDFileCache(long j, FileStash fileStash) {
        this.mStash = fileStash;
        this.mHybridData = initHybrid(j, fileStash);
    }

    public Set getAllKeys() {
        if (Thread.currentThread() != C90514aH.A11()) {
            return this.mStash.B8W();
        }
        throw AnonymousClass001.A09("StashARDFileCache.getAllKeys() shouldn't be called on the main thread.");
    }
}
