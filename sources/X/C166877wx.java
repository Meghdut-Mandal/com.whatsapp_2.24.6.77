package X;

import java.lang.ref.WeakReference;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* renamed from: X.7wx  reason: invalid class name and case insensitive filesystem */
public class C166877wx extends C06640Ul {
    public final /* synthetic */ AnonymousClass9RB A00;

    public C166877wx(AnonymousClass9RB r1) {
        this.A00 = r1;
    }

    public void A00() {
        this.A00.A02.A00();
    }

    public void A01(int i, CharSequence charSequence) {
        this.A00.A02.A01(i, charSequence);
    }

    public void A02(int i, CharSequence charSequence) {
        WeakReference weakReference = ((C166487w0) this.A00.A02).A00;
        if (weakReference.get() != null) {
            C167717yg r1 = (C167717yg) weakReference.get();
            C001700s r0 = r1.A09;
            if (r0 == null) {
                r0 = C36431kI.A0S();
                r1.A09 = r0;
            }
            C167717yg.A01(r0, charSequence);
        }
    }

    public void A03(AnonymousClass0SH r4) {
        AnonymousClass0Y0 r1 = r4.A00;
        C132626Uo r2 = null;
        if (r1 != null) {
            Cipher cipher = r1.A01;
            if (cipher != null) {
                r2 = new C132626Uo(cipher);
            } else {
                Signature signature = r1.A00;
                if (signature != null) {
                    r2 = new C132626Uo(signature);
                } else {
                    Mac mac = r1.A02;
                    if (mac != null) {
                        r2 = new C132626Uo(mac);
                    }
                }
            }
        }
        this.A00.A02.A02(new AnonymousClass9G0(r2, 2));
    }
}
