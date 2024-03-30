package X;

import android.app.Activity;
import android.content.SharedPreferences;

/* renamed from: X.4Wq  reason: invalid class name and case insensitive filesystem */
public class C89464Wq implements AnonymousClass4P4 {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public C89464Wq(C225314u r1, C19420v0 r2, int i, int i2) {
        this.A03 = i2;
        this.A01 = r1;
        this.A00 = i;
        this.A02 = r2;
    }

    public final void BeZ() {
        boolean z;
        SharedPreferences.Editor A002;
        String str;
        if (this.A03 != 0) {
            AnonymousClass3SJ.A00((Activity) this.A01, this.A00);
            z = false;
            A002 = C19420v0.A00((C19420v0) this.A02);
            str = "pref_revoke_sender_nux_v2";
        } else {
            int i = this.A00;
            C19420v0 r2 = (C19420v0) this.A02;
            AnonymousClass3SJ.A00((Activity) this.A01, i);
            z = false;
            C36331k8.A0w(C19420v0.A00(r2), "pref_revoke_sender_nux_v2", false);
            A002 = C19420v0.A00(r2);
            str = "pref_revoke_admin_nux";
        }
        C36331k8.A0w(A002, str, z);
    }
}
