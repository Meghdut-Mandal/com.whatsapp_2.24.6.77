package X;

import android.text.TextUtils;
import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import com.facebook.cameracore.ardelivery.modelcache.singlemodelcache.SingleModelCache;
import com.facebook.cameracore.ardelivery.modelcache.versionedmodelcache.VersionedModelCache;
import com.facebook.cameracore.ardelivery.storage.interfaces.StorageCallback;
import com.facebook.cameracore.ardelivery.xplatcache.stash.StashARDFileCache;
import com.facebook.cameracore.common.exception.EffectsFrameworkException;
import java.io.File;

/* renamed from: X.6jw  reason: invalid class name and case insensitive filesystem */
public abstract class C139486jw implements C160587lF {
    public final C23931Ak A00;
    public final C125295ze A01;
    public final Object A02 = C36441kJ.A11();
    public final AnonymousClass004 A03;
    public final C160587lF A04;
    public volatile C160317ko A05;

    public final boolean BLG(AnonymousClass6VA r3, boolean z) {
        return this.A04.BLG(r3, false);
    }

    public C160317ko A00(C157727ea r7) {
        StashARDFileCache stashARDFileCache;
        StashARDFileCache stashARDFileCache2;
        if (this instanceof C97874qP) {
            AnonymousClass5YF r0 = SingleModelCache.Companion;
            VersionedCapability versionedCapability = (VersionedCapability) C36391kE.A0t(this.A00);
            C139516jz r4 = (C139516jz) r7;
            synchronized (r7) {
                stashARDFileCache2 = r4.A00;
                if (stashARDFileCache2 == null) {
                    StashARDFileCache stashARDFileCache3 = StashARDFileCache.$redex_init_class;
                    stashARDFileCache2 = new StashARDFileCache(r4.A01, r4.A02);
                    r4.A00 = stashARDFileCache2;
                }
            }
            return new SingleModelCache(versionedCapability, stashARDFileCache2);
        }
        VersionedModelCache versionedModelCache = VersionedModelCache.$redex_init_class;
        C139516jz r42 = (C139516jz) r7;
        synchronized (r7) {
            stashARDFileCache = r42.A00;
            if (stashARDFileCache == null) {
                StashARDFileCache stashARDFileCache4 = StashARDFileCache.$redex_init_class;
                stashARDFileCache = new StashARDFileCache(r42.A01, r42.A02);
                r42.A00 = stashARDFileCache;
            }
        }
        return new VersionedModelCache(stashARDFileCache, this.A00);
    }

    public final boolean A01(AnonymousClass6VA r9, VersionedCapability versionedCapability) {
        C125295ze r2;
        StringBuilder A0u;
        String str;
        if (this.A05 != null) {
            String str2 = r9.A09;
            if (TextUtils.isEmpty(str2)) {
                r2 = this.A01;
                A0u = AnonymousClass000.A0u();
                str = "Model cache key is empty when saving for ";
            } else {
                String str3 = r9.A0C;
                C108425Tl r1 = r9.A06;
                if (!(r1 == null || r1 == C108425Tl.A0b)) {
                    str3 = r1.toString();
                }
                if (TextUtils.isEmpty(str3)) {
                    r2 = this.A01;
                    A0u = AnonymousClass000.A0u();
                    str = "Model type is empty when saving for ";
                } else {
                    try {
                        return this.A05.addModelForVersionIfInCache(r9.A02(), str2, str3, versionedCapability);
                    } catch (EffectsFrameworkException e) {
                        AnonymousClass6YR.A0C("ModelCacheAssetStorage", "Failed to save model to cache", e);
                        return false;
                    }
                }
            }
            A0u.append(str);
            r2.A00("ModelCacheAssetStorage", AnonymousClass000.A0q(r9.A0B, A0u), (Throwable) null, true);
        }
        return false;
    }

    public final File B99(AnonymousClass6VA r2, StorageCallback storageCallback) {
        return this.A04.B99(r2, storageCallback);
    }

    public void Bnc(AnonymousClass6VA r2) {
        this.A04.Bnc(r2);
    }

    public final File BpG(AnonymousClass6VA r2, StorageCallback storageCallback, File file) {
        return this.A04.BpG(r2, storageCallback, file);
    }

    public void Bx4(AnonymousClass6VA r2) {
        this.A04.Bx4(r2);
    }

    public C139486jw(C160587lF r7, C23931Ak r8, C125295ze r9, AnonymousClass004 r10) {
        C157727ea r0;
        this.A04 = r7;
        this.A03 = r10;
        this.A01 = r9;
        this.A00 = r8;
        if (this.A05 == null) {
            synchronized (this.A02) {
                if (this.A05 == null && (r0 = (C157727ea) this.A03.get()) != null) {
                    this.A05 = A00(r0);
                    try {
                        if (this instanceof C97884qQ) {
                            if (this.A05 == null) {
                                AnonymousClass6YR.A08("MultiModelCacheAssetStorage", "model cache is not initialized before trimming");
                            } else {
                                C225614x it = this.A00.iterator();
                                while (it.hasNext()) {
                                    try {
                                        ((VersionedModelCache) this.A05).trimExceptLatestSavedVersion((VersionedCapability) it.next());
                                    } catch (EffectsFrameworkException e) {
                                        AnonymousClass6YR.A0C("MultiModelCacheAssetStorage", "Failed call to trimExceptVersion", e);
                                    }
                                }
                            }
                        } else if (this.A05 == null) {
                            AnonymousClass6YR.A08("ModelCacheAssetStorage", "model cache is not initialized before trimming");
                        } else {
                            this.A05.trimExceptLatestSavedVersion((VersionedCapability) null);
                        }
                    } catch (EffectsFrameworkException e2) {
                        this.A01.A00("ModelCacheAssetStorage", "Failed to trim the cache", e2, false);
                    }
                }
            }
        }
        if (this.A05 == null) {
            AnonymousClass6YR.A08("ModelCacheAssetStorage", "Model cache could not be initialized");
        }
    }
}
