package X;

import android.view.View;
import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.6q0  reason: invalid class name and case insensitive filesystem */
public final class C143116q0 implements C157977fb {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C128506Cn A01;
    public final /* synthetic */ C102314zj A02;

    public C143116q0(C128506Cn r1, C102314zj r2, int i) {
        this.A02 = r2;
        this.A01 = r1;
        this.A00 = i;
    }

    public void BTo(View view, AnonymousClass6C7 r11) {
        Object a9j;
        C102314zj r1 = this.A02;
        List list = AnonymousClass0D3.A0I;
        C167507yA r2 = r1.A02;
        C128506Cn r0 = this.A01;
        int i = this.A00;
        boolean z = r0.A04;
        UserJid userJid = r2.A0O;
        String str = r0.A01;
        if (z) {
            a9j = new A9K(userJid, str, r0.A02);
        } else {
            a9j = new A9J(userJid, str);
        }
        r2.A07.A0D(a9j);
        r2.A0J.A01(userJid, str, 1, 1, i, z);
    }
}
