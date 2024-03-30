package X;

import java.security.PublicKey;
import java.security.cert.X509Certificate;

/* renamed from: X.6uD  reason: invalid class name and case insensitive filesystem */
public final class C145596uD implements C160077kQ {
    public final /* synthetic */ C158077fl A00;
    public final /* synthetic */ C135086c7 A01;
    public final /* synthetic */ C122905vc A02;
    public final /* synthetic */ Object A03;

    public C145596uD(C158077fl r1, C135086c7 r2, C122905vc r3, Object obj) {
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = obj;
        this.A00 = r1;
    }

    public void BiT(Integer num, PublicKey publicKey, X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        String str;
        C122905vc r4 = this.A02;
        C135086c7 r2 = this.A01;
        if (num == null) {
            str = "EncryptPasswordHelper passwordKeyId is null";
        } else if (publicKey == null) {
            str = "EncryptPasswordHelper passwordPublicKey is null";
        } else {
            String valueOf = String.valueOf(C36371kC.A09(r4.A01));
            C18740tg.A06(r2);
            Object obj = r2.A00;
            C18740tg.A06(obj);
            String A012 = C130936Na.A01(num, (String) obj, (String) null, publicKey);
            AnonymousClass00C.A08(A012);
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("#PWD_WA:11:");
            A0u.append(valueOf);
            String A0f = C90464aC.A0f(A012, A0u, ':');
            if (A0f != null) {
                r4.A00.Bp3(new C1502374m(this.A03, this.A00, A0f, 24));
                return;
            }
            AnonymousClass3TI.A00("EncryptPasswordHelper encryptedPassword is null ");
            C1498172w.A00(r4.A00, this.A03, this.A00, 33);
        }
        AnonymousClass3TI.A00(str);
        AnonymousClass3TI.A00("EncryptPasswordHelper encryptedPassword is null ");
        C1498172w.A00(r4.A00, this.A03, this.A00, 33);
    }

    public void BVM(Exception exc) {
        AnonymousClass3TI.A00(C36331k8.A0i("EncryptPasswordHelper delivery fail ", C36341k9.A0i(exc), exc));
        C122905vc r0 = this.A02;
        C1498172w.A00(r0.A00, this.A03, this.A00, 33);
    }

    public void BWk(Exception exc) {
        AnonymousClass3TI.A00(C36331k8.A0i("EncryptPasswordHelper error ", C36341k9.A0i(exc), exc));
        C122905vc r0 = this.A02;
        C1498172w.A00(r0.A00, this.A03, this.A00, 33);
    }
}
