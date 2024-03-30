package X;

/* renamed from: X.5Wv  reason: invalid class name and case insensitive filesystem */
public class C109245Wv extends C03030Cw implements AnonymousClass00S {
    public final int A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C109245Wv(java.lang.Object r8, int r9) {
        /*
            r7 = this;
            r0 = r7
            r7.A00 = r9
            java.lang.Class<X.5tp> r3 = X.C121855tp.class
            r1 = 0
            if (r9 == 0) goto L_0x0012
            java.lang.String r4 = "getPushName"
            java.lang.String r5 = "getPushName()Ljava/lang/String;"
        L_0x000c:
            r2 = r8
            r6 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        L_0x0012:
            java.lang.String r4 = "getUserPhone"
            java.lang.String r5 = "getUserPhone()Ljava/lang/String;"
            goto L_0x000c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C109245Wv.<init>(java.lang.Object, int):void");
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        String A03;
        int i = this.A00;
        C19730wQ r0 = ((C121855tp) this.receiver).A00;
        if (i != 0) {
            String A02 = r0.A0A.A02();
            AnonymousClass00C.A08(A02);
            return A02;
        }
        r0.A0G();
        AnonymousClass142 r02 = r0.A0E;
        if (r02 == null || (A03 = AnonymousClass3U8.A03(r02)) == null) {
            return "";
        }
        return A03;
    }
}
