package com.facebook.cameracore.ardelivery.modelcache.versionedmodelcache;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.C160317ko;
import com.facebook.cameracore.ardelivery.model.ModelPathsHolder;
import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import com.facebook.cameracore.ardelivery.xplatcache.ARDFileCache;
import com.facebook.jni.HybridData;
import com.facebook.soloader.SoLoader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class VersionedModelCache implements C160317ko {
    public static final VersionedModelCache $redex_init_class = null;
    public final HybridData mHybridData;

    private native boolean addModelForVersionIfInCache(int i, int i2, String str, String str2);

    private native ModelPathsHolder getModelPathsHolder(int i, int i2);

    public static native HybridData initHybrid(ARDFileCache aRDFileCache, List list);

    public native ModelPathsHolder getModelPathsHolderForLastSavedVersion(int i);

    public native void trimExceptLatestSavedVersion(int i);

    static {
        SoLoader.A06("versioned-model-cache-native-android");
    }

    public VersionedModelCache(ARDFileCache aRDFileCache, List list) {
        ArrayList A0I = AnonymousClass001.A0I();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass000.A1F(A0I, ((VersionedCapability) it.next()).getXplatValue());
        }
        this.mHybridData = initHybrid(aRDFileCache, A0I);
    }

    public boolean addModelForVersionIfInCache(int i, String str, String str2, VersionedCapability versionedCapability) {
        int xplatValue = versionedCapability.getXplatValue();
        Objects.requireNonNull(Integer.valueOf(xplatValue));
        return addModelForVersionIfInCache(xplatValue, i, str, str2);
    }

    public ModelPathsHolder getModelPathsHolder(VersionedCapability versionedCapability, int i) {
        return getModelPathsHolder(versionedCapability.getXplatValue(), i);
    }

    public ModelPathsHolder getModelPathsHolderForLastSavedVersion(VersionedCapability versionedCapability) {
        return getModelPathsHolderForLastSavedVersion(versionedCapability.getXplatValue());
    }

    public void trimExceptLatestSavedVersion(VersionedCapability versionedCapability) {
        Objects.requireNonNull(versionedCapability);
        trimExceptLatestSavedVersion(versionedCapability.getXplatValue());
    }
}
