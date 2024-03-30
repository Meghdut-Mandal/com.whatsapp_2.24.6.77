package X;

import android.content.SharedPreferences;

/* renamed from: X.3HN  reason: invalid class name */
public abstract class AnonymousClass3HN {
    public void A01() {
        if (this instanceof C51082nC) {
            C51082nC.A00((C51082nC) this, false);
        }
    }

    public void A02() {
        if (this instanceof C51082nC) {
            C51082nC.A00((C51082nC) this, false);
        }
    }

    public void A03() {
        if (this instanceof C51052n9) {
            C51052n9 r3 = (C51052n9) this;
            r3.A00.Boy(new C1501674f(r3, 17));
        } else if (this instanceof C51072nB) {
            AnonymousClass3NV r2 = (AnonymousClass3NV) ((C51072nB) this).A02.get();
            C36341k9.A0u(AnonymousClass3NV.A00(r2).edit(), "pref_xfamily_audience_tooltip");
            C36341k9.A0u(AnonymousClass3NV.A00(r2).edit(), "pref_xfamily_sharing_to_fb_tooltip");
            C36341k9.A0u(AnonymousClass3NV.A00(r2).edit(), "pref_xfamily_audience_nux_dialog");
            C36341k9.A0u(AnonymousClass3NV.A00(r2).edit(), "pref_debug_session_id");
        } else if (this instanceof C51082nC) {
            C51082nC.A00((C51082nC) this, true);
        } else if (this instanceof C51062nA) {
            SharedPreferences A0E = C36411kG.A0E(((C51062nA) this).A01);
            AnonymousClass00C.A08(A0E);
            SharedPreferences.Editor edit = A0E.edit();
            edit.clear();
            edit.apply();
        } else {
            ((C51042n8) this).A00.A1a();
        }
    }
}
