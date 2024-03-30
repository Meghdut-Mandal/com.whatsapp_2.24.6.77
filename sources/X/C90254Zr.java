package X;

import com.whatsapp.notification.PopupNotification;
import com.whatsapp.status.playback.MessageReplyActivity;

/* renamed from: X.4Zr  reason: invalid class name and case insensitive filesystem */
public class C90254Zr implements C160207kd {
    public Object A00;
    public final int A01;

    public C90254Zr(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BWB() {
        if (this.A01 == 0) {
            C70803fk r1 = (C70803fk) this.A00;
            AnonymousClass2M8 r0 = r1.A3r;
            if (r0 != null && r0.isShowing()) {
                r1.A3r.dismiss();
            } else if (C70803fk.A1e(r1)) {
                r1.A1n();
            }
        }
    }

    public void BgJ() {
        switch (this.A01) {
            case 0:
                ((C70803fk) this.A00).A2Z(false);
                return;
            case 1:
                PopupNotification.A0J((PopupNotification) this.A00);
                return;
            default:
                MessageReplyActivity.A0l((MessageReplyActivity) this.A00, false);
                return;
        }
    }

    public void BkZ() {
        switch (this.A01) {
            case 0:
                C70803fk r4 = (C70803fk) this.A00;
                C39471sS r1 = r4.A2z;
                if (r1.A01 instanceof AnonymousClass28U) {
                    r1.A0V((String) null);
                    r4.A1p();
                }
                r4.A3K.A07(r4.A45, 0, r4.A3n.A0E(4549));
                return;
            case 1:
                PopupNotification.A0H((PopupNotification) this.A00);
                return;
            default:
                MessageReplyActivity.A0Q((MessageReplyActivity) this.A00);
                return;
        }
    }
}
