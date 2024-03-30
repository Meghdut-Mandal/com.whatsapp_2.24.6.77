package X;

import android.app.Activity;
import com.whatsapp.chatinfo.view.custom.SharePhoneNumberBottomSheet;
import com.whatsapp.jid.UserJid;

/* renamed from: X.2rN  reason: invalid class name and case insensitive filesystem */
public class C53472rN implements AnonymousClass4PJ {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public C53472rN(Object obj, Object obj2, Object obj3, int i) {
        this.A03 = i;
        this.A00 = obj3;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public final void BwH() {
        switch (this.A03) {
            case 0:
                ((AnonymousClass1NG) this.A00).A0H((Activity) this.A01, (UserJid) this.A02);
                return;
            case 1:
                SharePhoneNumberBottomSheet sharePhoneNumberBottomSheet = (SharePhoneNumberBottomSheet) this.A00;
                Activity activity = (Activity) this.A01;
                AnonymousClass4X2 r2 = (AnonymousClass4X2) this.A02;
                C36321k7.A0x(activity, r2);
                AnonymousClass1NG r1 = sharePhoneNumberBottomSheet.A00;
                if (r1 != null) {
                    C222813r r0 = UserJid.Companion;
                    UserJid A002 = C222813r.A00(C36441kJ.A0m(sharePhoneNumberBottomSheet.A04));
                    C18740tg.A06(A002);
                    AnonymousClass00C.A08(A002);
                    r1.A0E(activity, r2, A002);
                    return;
                }
                throw C36331k8.A0d("blockListManager");
            default:
                C63583Kp r02 = (C63583Kp) this.A00;
                r02.A02.A0E(r02.A01, (AnonymousClass4PI) this.A01, (UserJid) this.A02);
                return;
        }
    }
}
