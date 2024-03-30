package X;

import com.facebook.cameracore.ardelivery.model.ModelPathsHolder;
import com.facebook.cameracore.ardelivery.model.VersionedCapability;

/* renamed from: X.7ko  reason: invalid class name and case insensitive filesystem */
public interface C160317ko {
    boolean addModelForVersionIfInCache(int i, String str, String str2, VersionedCapability versionedCapability);

    ModelPathsHolder getModelPathsHolder(VersionedCapability versionedCapability, int i);

    ModelPathsHolder getModelPathsHolderForLastSavedVersion(VersionedCapability versionedCapability);

    void trimExceptLatestSavedVersion(VersionedCapability versionedCapability);
}
