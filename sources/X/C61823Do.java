package X;

import android.content.Context;
import android.graphics.Bitmap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.3Do  reason: invalid class name and case insensitive filesystem */
public final class C61823Do {
    public final AnonymousClass16D A00;
    public final C27761Ps A01;
    public final AnonymousClass1X4 A02;

    public final void A00(Context context, C28981Uw r18, String str, String str2, HashMap hashMap) {
        byte[] bArr;
        C28981Uw r8 = r18;
        String str3 = str2;
        C36331k8.A1G(r8, 1, str3);
        Bitmap A09 = C36401kF.A09(context, this.A01, this.A00.A0D(r8), 96);
        if (A09 != null) {
            bArr = C36401kF.A1b(A09);
        } else {
            bArr = null;
        }
        AnonymousClass1X4 r3 = this.A02;
        Iterator A10 = C36371kC.A10(hashMap);
        while (A10.hasNext()) {
            Map.Entry A11 = AnonymousClass000.A11(A10);
            String str4 = str;
            AnonymousClass2bP r7 = new AnonymousClass2bP(r8, r3.A11.A02((AnonymousClass11F) A11.getKey(), true), str4, str3, C19970wo.A00(r3.A0K), ((Number) A11.getValue()).longValue());
            r7.A02 = 1;
            if (bArr != null) {
                r7.A1C(bArr);
            }
            C36401kF.A1E(r3, r7);
        }
    }

    public C61823Do(AnonymousClass1X4 r1, AnonymousClass16D r2, C27761Ps r3) {
        C36321k7.A11(r1, r3, r2);
        this.A02 = r1;
        this.A01 = r3;
        this.A00 = r2;
    }
}
