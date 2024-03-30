package X;

import java.security.cert.CertificateExpiredException;

/* renamed from: X.6u8  reason: invalid class name and case insensitive filesystem */
public class C145556u8 implements C160067kP {
    public final /* synthetic */ AnonymousClass6u9 A00;

    public C145556u8(AnonymousClass6u9 r1) {
        this.A00 = r1;
    }

    public void BVM(Exception exc) {
        this.A00.A02.BWk(exc);
    }

    public void BWk(Exception exc) {
        this.A00.A02.BWk(exc);
    }

    public void BiU(Integer num, String str, String str2, String str3, String str4, String str5) {
        try {
            AnonymousClass6u9 r0 = this.A00;
            AnonymousClass6Mw.A00(r0.A01, r0.A02, r0.A03, num, str2, str3, str4, str5);
        } catch (CertificateExpiredException e) {
            this.A00.A02.BWk(e);
        }
    }
}
