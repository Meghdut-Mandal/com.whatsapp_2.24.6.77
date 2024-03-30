package X;

import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: X.64r  reason: invalid class name and case insensitive filesystem */
public final class C1266064r {
    public final C109955Zt A00;
    public final AnonymousClass6K2 A01;
    public final C142286od A02;
    public final C131556Pn A03;
    public final C1265064h A04;
    public final C122845vW A05;
    public final C118015nC A06;
    public final C120335rL A07;

    public final void A00(C158697hv r19, C134906bn r20, String str, String str2, String str3, WeakReference weakReference, boolean z) {
        String str4 = str;
        String str5 = str2;
        C36331k8.A1G(str4, 1, str5);
        WeakReference weakReference2 = weakReference;
        AnonymousClass01L r8 = (AnonymousClass01L) weakReference2.get();
        C158697hv r5 = r19;
        if (r8 == null) {
            r5.BU1(C107335Nr.A00);
            return;
        }
        AnonymousClass01z supportFragmentManager = r8.getSupportFragmentManager();
        C120335rL r14 = this.A07;
        AnonymousClass65A r7 = new AnonymousClass65A(r8, supportFragmentManager, this.A00, this.A01, this.A05, this.A06, r14, str5, (Map) null, z);
        this.A04.A00(r8.getApplicationContext(), this.A02, r7);
        this.A03.A03(r20, new C163837qq(r7, r5, weakReference2, 1), (Boolean) null, str4, str3, (String) null);
    }

    public C1266064r(C109955Zt r2, AnonymousClass6K2 r3, C142286od r4, C131556Pn r5, C1265064h r6, C122845vW r7, C118015nC r8, C120335rL r9) {
        C36321k7.A12(r5, r4, r3);
        AnonymousClass00C.A0D(r7, 8);
        this.A04 = r6;
        this.A03 = r5;
        this.A02 = r4;
        this.A01 = r3;
        this.A07 = r9;
        this.A06 = r8;
        this.A00 = r2;
        this.A05 = r7;
    }
}
