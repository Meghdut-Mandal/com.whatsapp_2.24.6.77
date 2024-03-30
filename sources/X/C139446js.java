package X;

import com.facebook.cameracore.ardelivery.model.ModelPathsHolder;
import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import com.facebook.cameracore.common.exception.EffectsFrameworkException;
import com.facebook.common.stringformat.StringFormatUtil;
import java.util.List;

/* renamed from: X.6js  reason: invalid class name and case insensitive filesystem */
public class C139446js implements C159917k8 {
    public final C97864qO A00;

    public boolean BOM(AnonymousClass60A r7, VersionedCapability versionedCapability) {
        ModelPathsHolder modelPathsHolderForLastSavedVersion;
        try {
            C139486jw r1 = (C139486jw) this.A00.A00(versionedCapability);
            if (!(r1.A05 == null || (modelPathsHolderForLastSavedVersion = r1.A05.getModelPathsHolderForLastSavedVersion(versionedCapability)) == null)) {
                r7.A00.put(versionedCapability, modelPathsHolderForLastSavedVersion);
                return true;
            }
        } catch (IllegalArgumentException e) {
            Object[] objArr = {versionedCapability.name()};
            List list = AnonymousClass6YR.A00;
            if (C90484aE.A1P()) {
                AnonymousClass6YR.A0C("SingleARModelLoader", StringFormatUtil.formatStrLocaleSafe("Failed to get model storage for capability: %s", objArr), e);
            }
        }
        return false;
    }

    public boolean BOP(AnonymousClass60A r7, VersionedCapability versionedCapability, int i) {
        try {
            C139486jw r1 = (C139486jw) this.A00.A00(versionedCapability);
            if (r1.A05 != null) {
                try {
                    ModelPathsHolder modelPathsHolder = r1.A05.getModelPathsHolder(versionedCapability, i);
                    if (modelPathsHolder != null) {
                        r7.A00.put(versionedCapability, modelPathsHolder);
                        return true;
                    }
                } catch (EffectsFrameworkException e) {
                    AnonymousClass6YR.A0C("ModelCacheAssetStorage", "Failed call to ModelCache.getModelPathsHolder", e);
                    return false;
                }
            }
        } catch (IllegalArgumentException e2) {
            Object[] objArr = {versionedCapability.name()};
            List list = AnonymousClass6YR.A00;
            if (C90484aE.A1P()) {
                AnonymousClass6YR.A0C("SingleARModelLoader", StringFormatUtil.formatStrLocaleSafe("Failed to get model storage for capability: %s", objArr), e2);
            }
        }
        return false;
    }

    public boolean B0I(AnonymousClass6VA r7, VersionedCapability versionedCapability) {
        try {
            return ((C139486jw) this.A00.A00(versionedCapability)).A01(r7, versionedCapability);
        } catch (IllegalArgumentException e) {
            Object[] A0L = AnonymousClass001.A0L();
            A0L[0] = versionedCapability.name();
            List list = AnonymousClass6YR.A00;
            if (C90484aE.A1P()) {
                AnonymousClass6YR.A0C("SingleARModelLoader", StringFormatUtil.formatStrLocaleSafe("Failed to get model storage for capability %s", A0L), e);
            }
            return false;
        }
    }

    public C139446js(C97864qO r1) {
        this.A00 = r1;
    }
}
