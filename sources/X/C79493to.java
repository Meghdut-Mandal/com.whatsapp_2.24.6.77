package X;

/* renamed from: X.3to  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C79493to implements C25711Hj {
    public final /* synthetic */ C20260xH A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ boolean A02;

    public /* synthetic */ C79493to(C20260xH r1, String str, boolean z) {
        this.A00 = r1;
        this.A01 = str;
        this.A02 = z;
    }

    public final void accept(Object obj) {
        C20260xH r1 = this.A00;
        String str = this.A01;
        boolean z = this.A02;
        if (str == null) {
            str = "user_initiated";
        }
        C236419g r3 = r1.A0b;
        C71973hd r2 = new C71973hd(r1, z);
        C36321k7.A1Q("companion-device-manager/logoutDeviceInCompanionModeWithCallback: , removalReason ", str, AnonymousClass000.A0u());
        C76863pZ r12 = new C76863pZ(r2, C36361kB.A0c(r3.A07.A00.A00), str);
        C19730wQ r0 = r3.A09;
        r0.A0G();
        r12.A00(r0.A02);
    }
}
