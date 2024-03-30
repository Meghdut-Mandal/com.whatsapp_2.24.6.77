package X;

import com.facebook.cameracore.ardelivery.storage.interfaces.StorageCallback;
import java.io.File;
import java.util.Map;

/* renamed from: X.6jv  reason: invalid class name and case insensitive filesystem */
public abstract class C139476jv implements C160587lF {
    public final Map A00;

    public boolean BLG(AnonymousClass6VA r3, boolean z) {
        return A00(A01(r3)).BLG(r3, false);
    }

    public C160587lF A00(Object obj) {
        C160587lF r0 = (C160587lF) this.A00.get(obj);
        if (r0 != null) {
            return r0;
        }
        throw C90464aC.A0P(obj, "No asset storage exists for type: ", AnonymousClass000.A0u());
    }

    public Object A01(AnonymousClass6VA r2) {
        if (!(this instanceof C97864qO)) {
            return r2.A02;
        }
        if (r2.A03() != null) {
            return r2.A03();
        }
        throw AnonymousClass001.A08("The capability cannot be null in AR asset metadata");
    }

    public C139476jv(Map map) {
        this.A00 = map;
    }

    public File B99(AnonymousClass6VA r2, StorageCallback storageCallback) {
        return A00(A01(r2)).B99(r2, storageCallback);
    }

    public void Bnc(AnonymousClass6VA r2) {
        A00(A01(r2)).Bnc(r2);
    }

    public File BpG(AnonymousClass6VA r2, StorageCallback storageCallback, File file) {
        return A00(A01(r2)).BpG(r2, storageCallback, file);
    }

    public void Bx4(AnonymousClass6VA r2) {
        A00(A01(r2)).Bx4(r2);
    }
}
