package X;

import android.app.Activity;
import com.whatsapp.contact.picker.ContactPickerFragment;
import com.whatsapp.jid.UserJid;

/* renamed from: X.2rT  reason: invalid class name and case insensitive filesystem */
public class C53532rT implements AnonymousClass4PJ {
    public Object A00;
    public Object A01;
    public final int A02;

    public C53532rT(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public final void BwH() {
        AnonymousClass1NG r2;
        Activity activity;
        UserJid userJid;
        switch (this.A02) {
            case 0:
                ContactPickerFragment contactPickerFragment = (ContactPickerFragment) this.A00;
                r2 = contactPickerFragment.A0Z;
                activity = contactPickerFragment.A0h();
                userJid = C36351kA.A0k((AnonymousClass141) this.A01);
                break;
            case 1:
                AnonymousClass2IR r1 = (AnonymousClass2IR) this.A00;
                r2 = r1.A0h;
                activity = C36361kB.A06(r1);
                UserJid userJid2 = ((AnonymousClass3T1) this.A01).A0M.A0D;
                C18740tg.A06(userJid2);
                userJid = C36401kF.A0b(userJid2);
                break;
            default:
                C174798Ym r0 = (C174798Ym) this.A00;
                AnonymousClass1NG r22 = r0.A0h;
                AnonymousClass4PI r12 = r0.A02;
                UserJid A0b = C36401kF.A0b(r0.A04);
                C18740tg.A06(A0b);
                r22.A0E((Activity) this.A01, r12, A0b);
                return;
        }
        r2.A0H(activity, userJid);
    }
}
