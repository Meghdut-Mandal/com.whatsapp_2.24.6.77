package X;

import android.util.Base64;

/* renamed from: X.70L  reason: invalid class name */
public final /* synthetic */ class AnonymousClass70L implements C25711Hj {
    public final /* synthetic */ C146506vi A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ C006302t A03;

    public /* synthetic */ AnonymousClass70L(C146506vi r1, String str, String str2, C006302t r4) {
        this.A00 = r1;
        this.A03 = r4;
        this.A01 = str;
        this.A02 = str2;
    }

    public final void accept(Object obj) {
        Object obj2;
        byte[] bArr;
        C146506vi r1 = this.A00;
        C006302t r2 = this.A03;
        String str = this.A01;
        String str2 = this.A02;
        Number number = (Number) obj;
        AnonymousClass00C.A0D(number, 4);
        C123865xD A04 = r1.A04();
        r1.A05();
        int intValue = number.intValue();
        if (intValue == 0 && A04 != null) {
            C129146Fj r12 = A04.A02;
            if (r12.A03() != null) {
                String A07 = r12.A07();
                String encodeToString = Base64.encodeToString(r12.A0C(), 2);
                String encodeToString2 = Base64.encodeToString(r12.A0D(), 2);
                synchronized (r12) {
                    bArr = r12.A0K;
                }
                obj2 = new AnonymousClass57H(new AnonymousClass6DZ(str, str2, A07, encodeToString, encodeToString2, Base64.encodeToString(bArr, 2), r12.A06()));
                r2.invoke(obj2);
            }
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ExtensionsLogger/FLowsMediaPicker/uploadMedia/failed to upload, error:");
        C36321k7.A1Z(A0u, AnonymousClass6H7.A00(intValue));
        obj2 = new AnonymousClass57F(new AnonymousClass6AH(str, str2));
        r2.invoke(obj2);
    }
}
