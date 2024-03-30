package X;

import android.content.SharedPreferences;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.1fw  reason: invalid class name and case insensitive filesystem */
public final class C33791fw implements C33681fl {
    public boolean A00;
    public final ViewGroup A01;
    public final C33771fu A02;
    public final C33781fv A03;
    public final C32681e1 A04;
    public final AnonymousClass00T A05 = new AnonymousClass00U(new C33801fx(this));
    public final C19730wQ A06;
    public final C33751fs A07;
    public final C19980wp A08;
    public final C19420v0 A09;
    public final C20810yC A0A;
    public final AnonymousClass190 A0B;

    public C33791fw(ViewGroup viewGroup, C19730wQ r4, C33771fu r5, C33751fs r6, C19980wp r7, C19420v0 r8, C20810yC r9, C33781fv r10, AnonymousClass190 r11, C32681e1 r12) {
        AnonymousClass00C.A0D(r9, 3);
        AnonymousClass00C.A0D(r7, 4);
        AnonymousClass00C.A0D(r6, 5);
        AnonymousClass00C.A0D(r12, 6);
        AnonymousClass00C.A0D(r4, 7);
        AnonymousClass00C.A0D(r5, 8);
        AnonymousClass00C.A0D(r10, 9);
        AnonymousClass00C.A0D(r8, 10);
        this.A01 = viewGroup;
        this.A0B = r11;
        this.A0A = r9;
        this.A08 = r7;
        this.A07 = r6;
        this.A04 = r12;
        this.A06 = r4;
        this.A02 = r5;
        this.A03 = r10;
        this.A09 = r8;
    }

    public static final void A00(C33791fw r5) {
        AnonymousClass005 r4 = r5.A09.A00;
        if (((SharedPreferences) r4.get()).getBoolean("username_ever_set", false)) {
            C19980wp r1 = r5.A08;
            if (!C19980wp.A00(r1).getBoolean("username_is_set_triggered", false)) {
                C19980wp.A00(r1).edit().putBoolean("username_is_set_triggered", true).apply();
            }
        }
        if (((SharedPreferences) r4.get()).getBoolean("username_chats_ever_existed", false)) {
            C19980wp r12 = r5.A08;
            if (!C19980wp.A00(r12).getBoolean("username_chats_exist_triggered", false)) {
                C19980wp.A00(r12).edit().putBoolean("username_chats_exist_triggered", true).apply();
            }
        }
    }

    public void BK9() {
        if (this.A00) {
            ((View) this.A05.getValue()).setVisibility(8);
        }
    }

    public boolean Bt0() {
        if (!this.A06.A0L()) {
            return false;
        }
        if (!C20800yB.A01(C21000yV.A02, this.A0A, 5735)) {
            return false;
        }
        AnonymousClass005 r3 = this.A09.A00;
        if (((SharedPreferences) r3.get()).getBoolean("username_ever_set", false) && !C19980wp.A00(this.A08).getBoolean("username_is_set_triggered", false)) {
            return true;
        }
        if (!((SharedPreferences) r3.get()).getBoolean("username_chats_ever_existed", false) || C19980wp.A00(this.A08).getBoolean("username_chats_exist_triggered", false)) {
            return false;
        }
        return true;
    }

    public void BwS() {
        boolean Bt0 = Bt0();
        boolean z = this.A00;
        if (Bt0) {
            if (!z) {
                this.A01.addView((View) this.A05.getValue());
                this.A00 = true;
            }
            ((View) this.A05.getValue()).setVisibility(0);
            C33781fv.A00(this.A03, 1);
        } else if (z) {
            BK9();
        }
    }
}
