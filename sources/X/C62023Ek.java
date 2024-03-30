package X;

import android.view.ContextMenu;
import android.view.MenuItem;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;

/* renamed from: X.3Ek  reason: invalid class name and case insensitive filesystem */
public final class C62023Ek {
    public final AnonymousClass155 A00;
    public final AnonymousClass1GQ A01;
    public final AnonymousClass1LY A02;
    public final C65363Rt A03;
    public final C19730wQ A04;
    public final AnonymousClass171 A05;

    public final void A00(ContextMenu contextMenu, C52382pL r10, AnonymousClass378 r11) {
        MenuItem add;
        int i;
        MenuItem.OnMenuItemClickListener r1;
        C36321k7.A0v(r10, 0, contextMenu);
        AnonymousClass11F r4 = r11.A00.A0H;
        AnonymousClass00C.A0E(r4, "null cannot be cast to non-null type com.whatsapp.jid.UserJid");
        UserJid userJid = (UserJid) r4;
        C19730wQ r12 = this.A04;
        if (!r12.A0M(userJid)) {
            AnonymousClass141 r13 = r11.A00;
            C65363Rt r0 = this.A03;
            AnonymousClass155 r3 = this.A00;
            r0.A01(contextMenu, r3, r13);
            if (r10 == C52382pL.OWNER) {
                C52382pL r7 = r11.A02;
                boolean z = r11.A01;
                String str = this.A05.A0C(r11.A00, -1).A01;
                if (z) {
                    add = contextMenu.add(R.string.f12nameremoved);
                    r1 = new AnonymousClass4XF(userJid, this, str, 0);
                } else {
                    if (r7 == C52382pL.ADMIN) {
                        if (this.A01.A00.A0E(7124)) {
                            contextMenu.add(R.string.f12nameremoved).setOnMenuItemClickListener(new AnonymousClass4XF(userJid, this, str, 1));
                        }
                        add = contextMenu.add(R.string.f12nameremoved);
                        i = 10;
                    } else if (r7 == C52382pL.SUBSCRIBED) {
                        add = contextMenu.add(R.string.f12nameremoved);
                        i = 8;
                    }
                    r1 = new AnonymousClass4YB((Object) this, (Object) userJid, i);
                }
                add.setOnMenuItemClickListener(r1);
            }
            C65363Rt.A00(contextMenu, r3, userJid);
        } else if (r10 == C52382pL.ADMIN) {
            C223313w A08 = r12.A08();
            if (A08 != null) {
                userJid = A08;
            }
            contextMenu.add(R.string.f12nameremoved).setOnMenuItemClickListener(new AnonymousClass4YB((Object) this, (Object) userJid, 9));
        }
    }

    public C62023Ek(C65363Rt r2, C19730wQ r3, AnonymousClass155 r4, AnonymousClass171 r5, AnonymousClass1GQ r6, AnonymousClass1LY r7) {
        C36321k7.A1B(r3, r7, r5, r6, r2);
        AnonymousClass00C.A0D(r4, 6);
        this.A04 = r3;
        this.A02 = r7;
        this.A05 = r5;
        this.A01 = r6;
        this.A03 = r2;
        this.A00 = r4;
    }
}
