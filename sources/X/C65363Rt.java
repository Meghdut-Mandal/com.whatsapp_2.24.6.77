package X;

import android.view.ContextMenu;
import android.view.MenuItem;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;

/* renamed from: X.3Rt  reason: invalid class name and case insensitive filesystem */
public final class C65363Rt {
    public final AnonymousClass17Y A00;
    public final AnonymousClass16D A01;
    public final AnonymousClass1H2 A02;
    public final C32661dz A03;
    public final C32811eE A04;
    public final C19730wQ A05;
    public final AnonymousClass171 A06;

    public final void A01(ContextMenu contextMenu, AnonymousClass155 r7, AnonymousClass141 r8) {
        MenuItem add;
        MenuItem.OnMenuItemClickListener r1;
        AnonymousClass00C.A0D(r7, 0);
        if (!(r8.A0H instanceof C223313w)) {
            String A0v = C36381kD.A0v(this.A06, r8);
            contextMenu.add(r7.getResources().getString(R.string.f12nameremoved, AnonymousClass000.A1b(A0v))).setOnMenuItemClickListener(new AnonymousClass4YB(r7, r8, 0));
            if (r8.A0F != null) {
                add = contextMenu.add(AnonymousClass3UG.A05(r7, this.A02, C36411kG.A0w(r7.getResources(), A0v, AnonymousClass001.A0L(), 0, R.string.f12nameremoved)));
                r1 = new AnonymousClass4YB(r7, r8, 2);
            } else if (!this.A05.A0L()) {
                AnonymousClass11F r2 = r8.A0H;
                AnonymousClass00C.A0E(r2, "null cannot be cast to non-null type com.whatsapp.jid.UserJid");
                contextMenu.add(R.string.f12nameremoved).setOnMenuItemClickListener(new C89694Xn(this, r7, r2, 0));
                add = contextMenu.add(R.string.f12nameremoved);
                r1 = new C89694Xn(this, r7, r2, 1);
            } else {
                return;
            }
            add.setOnMenuItemClickListener(r1);
        }
    }

    public C65363Rt(AnonymousClass17Y r1, C19730wQ r2, AnonymousClass16D r3, AnonymousClass171 r4, AnonymousClass1H2 r5, C32661dz r6, C32811eE r7) {
        C36321k7.A1B(r1, r2, r5, r3, r4);
        C36321k7.A10(r6, r7);
        this.A00 = r1;
        this.A05 = r2;
        this.A02 = r5;
        this.A01 = r3;
        this.A06 = r4;
        this.A03 = r6;
        this.A04 = r7;
    }

    public static final void A00(ContextMenu contextMenu, AnonymousClass155 r4, UserJid userJid) {
        contextMenu.add(R.string.f12nameremoved).setOnMenuItemClickListener(new AnonymousClass4YB((Object) r4, (Object) userJid, C36331k8.A1a(r4, userJid) ? 1 : 0));
    }
}
