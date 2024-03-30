package X;

/* renamed from: X.5Al  reason: invalid class name and case insensitive filesystem */
public final class C104615Al extends AnonymousClass683 {
    public final C24261Bt A00;
    public final AnonymousClass66w A01;
    public final C146176vA A02;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C104615Al(X.C19600wD r13, X.C19970wo r14, X.C18820ts r15, X.C21010yW r16, X.AnonymousClass6O2 r17, X.C24261Bt r18, X.C146156v8 r19, X.AnonymousClass66w r20, X.C146176vA r21, X.C146186vB r22, X.C19770wU r23) {
        /*
            r12 = this;
            r4 = r14
            r5 = r15
            r6 = r16
            r9 = r22
            r11 = r23
            X.C36321k7.A1B(r14, r11, r6, r15, r9)
            r3 = r13
            r10 = r17
            X.C36321k7.A10(r13, r10)
            r0 = 11
            r1 = r18
            X.AnonymousClass00C.A0D(r1, r0)
            r2 = r12
            r7 = r19
            r8 = r21
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.A02 = r8
            r0 = r20
            r12.A01 = r0
            r12.A00 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C104615Al.<init>(X.0wD, X.0wo, X.0ts, X.0yW, X.6O2, X.1Bt, X.6v8, X.66w, X.6vA, X.6vB, X.0wU):void");
    }

    public AnonymousClass6LL A00() {
        String A012 = this.A00.A01();
        AnonymousClass00T r6 = this.A02.A00.A01;
        boolean A0J = AnonymousClass00C.A0J(A012, C36411kG.A0E(r6).getString("pref_avatar_sticker_search_dictionary_revision", (String) null));
        AnonymousClass66w r4 = this.A01;
        boolean A0J2 = AnonymousClass00C.A0J(r4.A01(), C36411kG.A0E(r6).getString("pref_avatar_sticker_search_dictionary_filters", (String) null));
        boolean A0J3 = AnonymousClass00C.A0J(r4.A00(), C36411kG.A0E(r6).getString("pref_avatar_sticker_search_dictionary_country_code", (String) null));
        if (!A0J || !A0J2 || !A0J3) {
            return new AnonymousClass6LL((C108495Ts) null, (String) null, (String) null, (String) null, 0, 0);
        }
        return super.A00();
    }
}
