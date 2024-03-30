package X;

import android.content.ContentValues;

/* renamed from: X.3hN  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C71813hN implements AnonymousClass4QH {
    public final /* synthetic */ long A00;
    public final /* synthetic */ AnonymousClass1NO A01;
    public final /* synthetic */ AnonymousClass3T1 A02;
    public final /* synthetic */ boolean A03;

    public /* synthetic */ C71813hN(AnonymousClass1NO r1, AnonymousClass3T1 r2, long j, boolean z) {
        this.A01 = r1;
        this.A02 = r2;
        this.A03 = z;
        this.A00 = j;
    }

    public final void BwV(AnonymousClass3T1 r11) {
        AnonymousClass1NO r2 = this.A01;
        AnonymousClass3T1 r0 = this.A02;
        boolean z = this.A03;
        long j = this.A00;
        if (AnonymousClass3T1.A0B(r11, r0)) {
            r11.A15 = z;
            C20650xu r4 = r2.A03;
            if (j != 1) {
                AnonymousClass1M0 A05 = r4.A0C.A05();
                try {
                    ContentValues contentValues = new ContentValues(1);
                    contentValues.put("fts_namespace", C20650xu.A03(r4, r11));
                    C224114e r42 = A05.A02;
                    String[] strArr = new String[1];
                    C36351kA.A1V(strArr, 0, r11.A1N);
                    r42.A01(contentValues, "message_ftsv2", "docid = ?", "UPDATE_FTS_NAMESPACED", strArr);
                    A05.close();
                } catch (Throwable th) {
                    th.addSuppressed(th);
                    throw th;
                }
            }
        }
    }
}
