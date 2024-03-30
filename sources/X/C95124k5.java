package X;

import android.os.Build;
import java.security.Signature;
import java.security.SignatureException;

/* renamed from: X.4k5  reason: invalid class name and case insensitive filesystem */
public class C95124k5 extends C06640Ul {
    public final /* synthetic */ C160387kv A00;
    public final /* synthetic */ AnonymousClass6VG A01;
    public final /* synthetic */ byte[] A02;

    public C95124k5(C160387kv r1, AnonymousClass6VG r2, byte[] bArr) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = bArr;
    }

    public void A00() {
        this.A01.A02.A06("sign: authentication failed");
        this.A00.BRZ();
    }

    public void A01(int i, CharSequence charSequence) {
        C24611Dc r2 = this.A01.A02;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("sign: authentication error=");
        A0u.append(i);
        r2.A05(AnonymousClass000.A0r(" errString=", A0u, i));
        this.A00.BRY(i, charSequence);
    }

    public void A02(int i, CharSequence charSequence) {
        C24611Dc r2 = this.A01.A02;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("sign: authentication help=");
        A0u.append(i);
        r2.A06(AnonymousClass000.A0l(charSequence, " errString=", A0u));
        this.A00.BRb(i, charSequence);
    }

    public void A03(AnonymousClass0SH r5) {
        try {
            Signature signature = r5.A00.A00;
            C18740tg.A06(signature);
            C160387kv r1 = this.A00;
            signature.update(this.A02);
            r1.BRc(signature.sign());
        } catch (SignatureException e) {
            C24611Dc r2 = this.A01.A02;
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("sign: api=");
            A0u.append(Build.VERSION.SDK_INT);
            C90464aC.A17(r2, e, " error: ", A0u);
            this.A00.BRc((byte[]) null);
        }
    }
}
