package X;

import android.app.Activity;
import com.whatsapp.R;
import com.whatsapp.blocklist.UnblockDialogFragment;
import com.whatsapp.jid.UserJid;

/* renamed from: X.3EU  reason: invalid class name */
public class AnonymousClass3EU {
    public final AnonymousClass1NG A00;
    public final C29121Vk A01;
    public final AnonymousClass1EU A02;
    public final AnonymousClass16D A03;
    public final AnonymousClass171 A04;

    public void A00(Activity activity, AnonymousClass4PI r18, UserJid userJid, C135086c7 r20, boolean z, boolean z2) {
        Object obj;
        Activity activity2 = activity;
        UserJid userJid2 = userJid;
        boolean A1V = AnonymousClass000.A1V(userJid2);
        int i = R.string.f12nameremoved;
        if (z2) {
            i = R.string.f12nameremoved;
        }
        Object[] objArr = new Object[1];
        C135086c7 r12 = r20;
        if (A1V) {
            obj = C36381kD.A0u(this.A03, this.A04, userJid2);
        } else if (r20 == null) {
            obj = null;
        } else {
            obj = r12.A00;
        }
        String A0v = C36391kE.A0v(activity2, obj, objArr, 0, i);
        C53512rR r6 = null;
        AnonymousClass4PI r8 = r18;
        if (A1V) {
            r6 = new C53512rR(activity2, r8, this, userJid2, 1);
        } else if (this.A02.A05().BAH() != null) {
            r6 = new C53512rR(activity2, r12, this, r8, 2);
        }
        ((C225014r) activity2).Btm(UnblockDialogFragment.A03(r6, A0v, 0, z));
    }

    public AnonymousClass3EU(AnonymousClass1NG r1, AnonymousClass16D r2, AnonymousClass171 r3, C29121Vk r4, AnonymousClass1EU r5) {
        this.A03 = r2;
        this.A04 = r3;
        this.A02 = r5;
        this.A00 = r1;
        this.A01 = r4;
    }
}
