package X;

import com.facebook.cameracore.ardelivery.model.ARAssetType;
import java.util.Map;

/* renamed from: X.4qN  reason: invalid class name and case insensitive filesystem */
public class C97854qN extends C139476jv {
    public C97854qN(Map map) {
        super(map);
        if (!(map.get(ARAssetType.SUPPORT) instanceof C97864qO)) {
            AnonymousClass6YR.A08("ARAssetTypeCompositeStorage", "Support storage is not properly initialized");
        }
    }
}
