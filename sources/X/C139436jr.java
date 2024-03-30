package X;

import com.facebook.cameracore.ardelivery.model.ModelPathsHolder;
import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import com.facebook.cameracore.common.exception.EffectsFrameworkException;

/* renamed from: X.6jr  reason: invalid class name and case insensitive filesystem */
public class C139436jr implements C159917k8 {
    public final C97884qQ A00;

    public boolean B0I(AnonymousClass6VA r2, VersionedCapability versionedCapability) {
        return this.A00.A01(r2, versionedCapability);
    }

    public boolean BOM(AnonymousClass60A r3, VersionedCapability versionedCapability) {
        ModelPathsHolder modelPathsHolderForLastSavedVersion;
        C97884qQ r1 = this.A00;
        if (r1.A05 == null || (modelPathsHolderForLastSavedVersion = r1.A05.getModelPathsHolderForLastSavedVersion(versionedCapability)) == null) {
            return false;
        }
        r3.A00.put(versionedCapability, modelPathsHolderForLastSavedVersion);
        return true;
    }

    public boolean BOP(AnonymousClass60A r4, VersionedCapability versionedCapability, int i) {
        C97884qQ r1 = this.A00;
        if (r1.A05 == null) {
            return false;
        }
        try {
            ModelPathsHolder modelPathsHolder = r1.A05.getModelPathsHolder(versionedCapability, i);
            if (modelPathsHolder == null) {
                return false;
            }
            r4.A00.put(versionedCapability, modelPathsHolder);
            return true;
        } catch (EffectsFrameworkException e) {
            AnonymousClass6YR.A0C("ModelCacheAssetStorage", "Failed call to ModelCache.getModelPathsHolder", e);
            return false;
        }
    }

    public C139436jr(C97884qQ r1) {
        this.A00 = r1;
    }
}
