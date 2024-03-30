package X;

import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: X.4k4  reason: invalid class name and case insensitive filesystem */
public class C95114k4 extends C06640Ul {
    public final /* synthetic */ C142356ok A00;
    public final /* synthetic */ WeakReference A01;

    public C95114k4(C142356ok r1, WeakReference weakReference) {
        this.A00 = r1;
        this.A01 = weakReference;
    }

    public void A00() {
        Log.i("AppAuthManager/authenticate: authentication failed");
        C160387kv r0 = (C160387kv) this.A01.get();
        if (r0 != null) {
            r0.BRZ();
        }
    }

    public void A03(AnonymousClass0SH r3) {
        Log.i("AppAuthManager/authenticate: authentication succeeded");
        C160387kv r1 = (C160387kv) this.A01.get();
        if (r1 != null) {
            r1.BRc((byte[]) null);
        }
    }

    public void A01(int i, CharSequence charSequence) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("AppAuthManager/authenticate: authentication error=");
        A0u.append(i);
        C36321k7.A1J(charSequence, " errString=", A0u);
        C160387kv r0 = (C160387kv) this.A01.get();
        if (r0 != null) {
            r0.BRY(i, charSequence);
        }
    }

    public void A02(int i, CharSequence charSequence) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("AppAuthManager/authenticate: authentication help=");
        A0u.append(i);
        C36321k7.A1K(charSequence, " errString=", A0u);
        C160387kv r0 = (C160387kv) this.A01.get();
        if (r0 != null) {
            r0.BRb(i, charSequence);
        }
    }
}
