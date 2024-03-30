package X;

import android.util.Base64;
import java.io.File;

/* renamed from: X.3tt  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C79543tt implements C25711Hj {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C79593ty A01;
    public final /* synthetic */ C61043Ai A02;
    public final /* synthetic */ C146506vi A03;
    public final /* synthetic */ boolean A04;

    public /* synthetic */ C79543tt(C79593ty r1, C61043Ai r2, C146506vi r3, int i, boolean z) {
        this.A03 = r3;
        this.A02 = r2;
        this.A04 = z;
        this.A00 = i;
        this.A01 = r1;
    }

    public final void accept(Object obj) {
        String str;
        byte[] bArr;
        byte[] bArr2;
        String str2;
        long j;
        short s;
        File file;
        C146506vi r4 = this.A03;
        C61043Ai r2 = this.A02;
        boolean z = this.A04;
        int i = this.A00;
        C79593ty r7 = this.A01;
        Integer num = (Integer) obj;
        C36331k8.A1H(r7, num);
        C123865xD A042 = r4.A04();
        String str3 = null;
        if (A042 != null) {
            C129146Fj r0 = A042.A02;
            str = r0.A07();
            bArr = r0.A0D();
            bArr2 = r0.A0C();
        } else {
            str = null;
            bArr = null;
            bArr2 = null;
        }
        if (bArr != null) {
            str2 = Base64.encodeToString(bArr, 2);
        } else {
            str2 = null;
        }
        if (bArr2 != null) {
            str3 = Base64.encodeToString(bArr2, 2);
        }
        C122635vB r5 = (C122635vB) r4.A0A.A00();
        if (!(r5 == null || r5.A02.get() || (file = r5.A01) == null)) {
            file.delete();
        }
        r2.A01.A0H(new C80703vp(r7, num, str, str2, str3, z ? 1 : 0));
        C61513Cf r6 = r2.A05;
        int intValue = num.intValue();
        C45172Qi r52 = new C45172Qi();
        int i2 = 13;
        if (intValue == 0) {
            i2 = 14;
        }
        r52.A01 = Integer.valueOf(i2);
        r6.A00.Blv(r52);
        if (A042 != null) {
            j = A042.A01.A02.A03;
        } else {
            j = 0;
        }
        AnonymousClass3DD r22 = r2.A04;
        String valueOf = String.valueOf(((double) j) / 1024.0d);
        C21430zE r23 = r22.A00;
        r23.markerAnnotate(476716874, i, "media_size", valueOf);
        if (intValue != 0) {
            s = 4;
            if (intValue != 1) {
                s = 87;
            }
        } else {
            s = 2;
        }
        r23.markerEnd(476716874, i, s);
        r4.A05();
    }
}
