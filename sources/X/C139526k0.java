package X;

import com.facebook.cameracore.ardelivery.storage.interfaces.StorageCallback;
import java.util.List;

/* renamed from: X.6k0  reason: invalid class name and case insensitive filesystem */
public class C139526k0 implements StorageCallback {
    public final /* synthetic */ C133326Xw A00;
    public final /* synthetic */ C135056c3 A01;
    public final /* synthetic */ List A02;

    public void onDecryptionFinish(boolean z, String str) {
        AnonymousClass5VK r2;
        boolean z2 = z;
        if (!z) {
            C1263463o r1 = new C1263463o();
            r1.A00 = C108395Ti.ASSET_DECRYPTION_FAILURE;
            if (str == null) {
                str = "missing failure reason";
            }
            r1.A01 = str;
            r2 = r1.A00();
        } else {
            r2 = null;
        }
        C133326Xw.A07(this.A00, this.A01, r2, C023109s.A0Y, this.A02, -1, z2);
    }

    public void onEncodingFinish(boolean z, String str) {
        AnonymousClass5VK r2;
        boolean z2 = z;
        if (!z) {
            C1263463o r1 = new C1263463o();
            r1.A00 = C108395Ti.ASSET_ENCODING_FAILURE;
            if (str == null) {
                str = "missing failure reason";
            }
            r1.A01 = str;
            r2 = r1.A00();
        } else {
            r2 = null;
        }
        C133326Xw.A07(this.A00, this.A01, r2, C023109s.A05, this.A02, -1, z2);
    }

    public void onExtractionFinish(boolean z, String str) {
        AnonymousClass5VK r2;
        boolean z2 = z;
        if (!z) {
            C1263463o r1 = new C1263463o();
            r1.A00 = C108395Ti.EXTRACTION_FAILED;
            if (str == null) {
                str = "missing failure reason";
            }
            r1.A01 = str;
            r2 = r1.A00();
        } else {
            r2 = null;
        }
        C133326Xw.A07(this.A00, this.A01, r2, C023109s.A03, this.A02, -1, z2);
    }

    public C139526k0(C133326Xw r1, C135056c3 r2, List list) {
        this.A00 = r1;
        this.A02 = list;
        this.A01 = r2;
    }

    public void onCachePutFinish(boolean z) {
        C133326Xw.A08(this.A00, this.A01, C023109s.A09, this.A02, z);
    }

    public void onCachePutStart() {
        C133326Xw.A08(this.A00, this.A01, C023109s.A08, this.A02, true);
    }

    public void onDecryptionOperationFinish() {
        C133326Xw.A08(this.A00, this.A01, C023109s.A0X, this.A02, true);
    }

    public void onDecryptionOperationStart() {
        C133326Xw.A08(this.A00, this.A01, C023109s.A0W, this.A02, true);
    }

    public void onDecryptionStart() {
        C133326Xw.A08(this.A00, this.A01, C023109s.A0V, this.A02, true);
    }

    public void onEncodingOperationFinish() {
        C133326Xw.A08(this.A00, this.A01, C023109s.A07, this.A02, true);
    }

    public void onEncodingOperationStart() {
        C133326Xw.A08(this.A00, this.A01, C023109s.A06, this.A02, true);
    }

    public void onEncodingStart() {
        C133326Xw.A08(this.A00, this.A01, C023109s.A04, this.A02, true);
    }

    public void onExtractionStart() {
        C133326Xw.A08(this.A00, this.A01, C023109s.A02, this.A02, true);
    }
}
