package X;

import com.whatsapp.extensions.webview.bridge.FlowsWebViewDataRepository;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.7t5  reason: invalid class name and case insensitive filesystem */
public class C165227t5 implements C160037kM {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public C165227t5(Object obj, Object obj2, Object obj3, int i) {
        this.A03 = i;
        this.A01 = obj2;
        this.A00 = obj3;
        this.A02 = obj;
    }

    public void BZU(boolean z, String str) {
        AnonymousClass6CL r2;
        Object r0;
        if (this.A03 != 0) {
            C023509x r22 = (C023509x) this.A01;
            if (z) {
                r0 = new AnonymousClass570(((FlowsWebViewDataRepository) this.A02).A07.A01(((Jid) this.A00).user));
            } else {
                r0 = new C1037956z(str);
            }
            r22.resumeWith(r0);
            return;
        }
        Number number = (Number) this.A01;
        if (number != null) {
            ((C26601Ku) this.A02).A05.A04(number.intValue(), "endpoint_public_key_valid", z);
        }
        C023509x r5 = (C023509x) this.A00;
        if (z) {
            r2 = new AnonymousClass6CL(2, (String) null, true, false);
        } else {
            r2 = new AnonymousClass6CL(3, str, false, false);
        }
        r5.resumeWith(r2);
    }

    public void BV7(String str) {
    }

    public void BV8(UserJid userJid, String str, int i, boolean z, boolean z2) {
    }
}
