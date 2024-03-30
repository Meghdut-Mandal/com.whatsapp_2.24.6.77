package X;

import com.whatsapp.util.Log;
import java.util.Iterator;

/* renamed from: X.3he  reason: invalid class name and case insensitive filesystem */
public class C71983he implements AnonymousClass4T3 {
    public final /* synthetic */ C236419g A00;
    public final /* synthetic */ boolean A01;
    public final /* synthetic */ boolean A02;

    public C71983he(C236419g r1, boolean z, boolean z2) {
        this.A00 = r1;
        this.A02 = z;
        this.A01 = z2;
    }

    public void Bi3(C20760y7 r3) {
        Log.i("companion-device-manager/createDeviceRemoveRequestProtocolHelper/onSuccess");
        C236419g.A04(r3, this.A00, this.A02);
    }

    public void BWc(C20760y7 r3, int i) {
        C36321k7.A1T("companion-device-manager/createDeviceRemoveRequestProtocolHelper/onError: ", AnonymousClass000.A0u(), i);
        if (this.A01) {
            C236419g.A04(r3, this.A00, false);
            return;
        }
        Iterator A0s = C36361kB.A0s(this.A00);
        while (A0s.hasNext()) {
            ((AnonymousClass192) A0s.next()).BVX(r3, i);
        }
    }
}
