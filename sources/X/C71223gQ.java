package X;

import android.content.SharedPreferences;

/* renamed from: X.3gQ  reason: invalid class name and case insensitive filesystem */
public class C71223gQ implements C30631aW {
    public final AnonymousClass17Z A00;
    public final C19420v0 A01;

    public /* synthetic */ void BV3() {
    }

    public void BV2() {
        SharedPreferences.Editor A002 = C19420v0.A00(this.A01);
        A002.remove("detect_device_tablet");
        A002.remove("dismissed_invite_member_row");
        A002.apply();
        AnonymousClass17Z r0 = AnonymousClass17Z.$redex_init_class;
    }

    public C71223gQ(AnonymousClass17Z r1, C19420v0 r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
