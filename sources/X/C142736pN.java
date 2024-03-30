package X;

import android.util.Pair;

/* renamed from: X.6pN  reason: invalid class name and case insensitive filesystem */
public final class C142736pN implements C19710wO {
    public final AnonymousClass17Y A00;
    public final C20810yC A01;
    public final AnonymousClass005 A02;
    public final AnonymousClass005 A03;
    public final AnonymousClass005 A04;
    public final AnonymousClass005 A05;
    public final AnonymousClass005 A06;
    public final AnonymousClass005 A07;
    public final C1255160e A08;
    public final AnonymousClass005 A09;
    public final AnonymousClass005 A0A;

    public String BIB() {
        return "AvatarAsyncInit";
    }

    public /* synthetic */ void BRL() {
    }

    private final AnonymousClass68B A00() {
        AnonymousClass1AP r2 = (AnonymousClass1AP) this.A0A.get();
        AnonymousClass1B5 r3 = r2.A0J;
        AnonymousClass68B A032 = r3.A03("meta-avatar");
        if (A032 == null) {
            if (!"meta-avatar".contains(" ")) {
                return null;
            }
            try {
                Pair A002 = AnonymousClass1BM.A00("meta-avatar");
                if (A002 == null) {
                    return null;
                }
                A032 = r2.A0L.A00((String) A002.first, (String) A002.second);
            } catch (Exception e) {
                C90464aC.A1L("StickerRepository/getInstalledStickerPackByIdSync/error fetching sticker pack: ", "meta-avatar", AnonymousClass000.A0u(), e);
                return null;
            }
        }
        A032.A00 = r3.A01("meta-avatar");
        return A032;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00d5, code lost:
        if (((X.AnonymousClass1XW) r7.A05.get()).A00() != null) goto L_0x00d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x019b, code lost:
        if (r1 > 0) goto L_0x019d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BRM() {
        /*
            r7 = this;
            X.005 r6 = r7.A04
            java.lang.Object r2 = r6.get()
            X.1Bt r2 = (X.C24261Bt) r2
            java.lang.Object r0 = r6.get()
            X.1Bt r0 = (X.C24261Bt) r0
            X.00T r1 = r0.A01
            android.content.SharedPreferences r0 = X.C36411kG.A0E(r1)
            java.lang.String r3 = "pref_avatar_notice_consent_accepted"
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto L_0x002a
            android.content.SharedPreferences r0 = X.C36411kG.A0E(r1)
            boolean r0 = X.C36371kC.A1U(r0, r3)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            if (r0 != 0) goto L_0x0048
        L_0x002a:
            X.005 r0 = r7.A02
            java.lang.Object r0 = r0.get()
            X.1BF r0 = (X.AnonymousClass1BF) r0
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x0048
            java.lang.Object r0 = r6.get()
            X.1Bt r0 = (X.C24261Bt) r0
            r1 = 1
            X.00T r0 = r0.A01
            android.content.SharedPreferences$Editor r0 = X.C36351kA.A0A(r0)
            X.C36331k8.A0w(r0, r3, r1)
        L_0x0048:
            X.005 r0 = r7.A06
            java.lang.Object r1 = r0.get()
            X.0z9 r1 = (X.C21380z9) r1
            java.util.HashSet r0 = r1.A00
            java.lang.String r1 = X.C21380z9.A00(r1, r0)
            java.lang.String r0 = "db_backup"
            r4 = 0
            boolean r0 = X.AnonymousClass099.A0O(r1, r0, r4)
            if (r0 != 0) goto L_0x009a
            X.AnonymousClass00C.A0B(r2)
            X.00T r5 = r2.A01
            android.content.SharedPreferences r0 = X.C36411kG.A0E(r5)
            java.lang.String r2 = "pref_avatar_user_local_deletion"
            boolean r0 = r0.getBoolean(r2, r4)
            if (r0 == 0) goto L_0x009b
            X.005 r0 = r7.A05
            java.lang.Object r1 = r0.get()
            X.1XW r1 = (X.AnonymousClass1XW) r1
            X.005 r0 = r7.A09
            java.lang.Object r3 = r0.get()
            X.AnonymousClass00C.A0B(r3)
            X.AnonymousClass00C.A0B(r1)
            r1.A01()
            android.content.SharedPreferences$Editor r0 = X.C36351kA.A0A(r5)
            X.C36341k9.A0u(r0, r2)
            X.17Y r2 = r7.A00
            r1 = 38
            X.72k r0 = new X.72k
            r0.<init>(r3, r1)
            r2.A0H(r0)
        L_0x009a:
            return
        L_0x009b:
            android.content.SharedPreferences r1 = X.C36411kG.A0E(r5)
            java.lang.String r0 = "pref_avatar_user_remote_deletion"
            boolean r0 = r1.getBoolean(r0, r4)
            if (r0 != 0) goto L_0x00d7
            java.lang.Object r0 = r6.get()
            X.1Bt r0 = (X.C24261Bt) r0
            X.00T r1 = r0.A01
            android.content.SharedPreferences r0 = X.C36411kG.A0E(r1)
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto L_0x00f2
            android.content.SharedPreferences r0 = X.C36411kG.A0E(r1)
            boolean r1 = r0.getBoolean(r3, r4)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            if (r0 == 0) goto L_0x00f2
            if (r1 != 0) goto L_0x00f2
            X.005 r0 = r7.A05
            java.lang.Object r0 = r0.get()
            X.1XW r0 = (X.AnonymousClass1XW) r0
            X.6OQ r0 = r0.A00()
            if (r0 == 0) goto L_0x00f2
        L_0x00d7:
            X.005 r0 = r7.A09
            java.lang.Object r3 = X.C36411kG.A0v(r0)
            X.1Bs r3 = (X.C24251Bs) r3
            X.005 r0 = r7.A05
            java.lang.Object r2 = X.C36411kG.A0v(r0)
            X.1XW r2 = (X.AnonymousClass1XW) r2
            X.6xT r1 = new X.6xT
            r1.<init>(r7, r3, r2)
            java.lang.String r0 = "event"
            r2.A03(r1, r0)
            return
        L_0x00f2:
            X.0yC r1 = r7.A01
            r0 = 1396(0x574, float:1.956E-42)
            boolean r0 = r1.A0E(r0)
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x009a
            r2 = 0
            com.whatsapp.avatar.init.AvatarAsyncInit$checkHasAvatarUser$1 r0 = new com.whatsapp.avatar.init.AvatarAsyncInit$checkHasAvatarUser$1
            r0.<init>(r7, r2)
            X.03u r1 = X.C008903u.A00
            java.lang.Object r0 = X.C110515an.A00(r1, r0)
            if (r0 == 0) goto L_0x009a
            com.whatsapp.avatar.init.AvatarAsyncInit$checkUserHasAvatar$1 r0 = new com.whatsapp.avatar.init.AvatarAsyncInit$checkUserHasAvatar$1
            r0.<init>(r7, r2)
            java.lang.Object r0 = X.C110515an.A00(r1, r0)
            if (r0 == 0) goto L_0x009a
            X.68B r0 = r7.A00()
            if (r0 == 0) goto L_0x019d
            X.68B r3 = r7.A00()
            if (r3 == 0) goto L_0x019d
            java.util.List r0 = r3.A05
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x019d
            java.util.List r1 = r3.A05
            X.AnonymousClass00C.A08(r1)
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0179
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0179
        L_0x013a:
            X.005 r0 = r7.A07
            java.lang.Object r5 = r0.get()
            X.1Av r5 = (X.C24041Av) r5
            java.util.List r1 = r3.A05
            X.AnonymousClass00C.A08(r1)
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0152
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0152
            return
        L_0x0152:
            java.util.Iterator r3 = r1.iterator()
            r2 = 0
        L_0x0157:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0176
            X.6c4 r0 = X.C90504aG.A0U(r3)
            java.lang.String r1 = r0.A0E
            if (r1 == 0) goto L_0x0157
            java.lang.String r0 = r0.A0D
            java.io.File r0 = r5.A03(r1, r0)
            if (r0 != 0) goto L_0x0157
            int r2 = r2 + 1
            if (r2 >= 0) goto L_0x0157
            java.lang.RuntimeException r0 = X.C36371kC.A0s()
            throw r0
        L_0x0176:
            if (r2 <= 0) goto L_0x009a
            goto L_0x019d
        L_0x0179:
            java.util.Iterator r2 = r1.iterator()
            r1 = 0
        L_0x017e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x019b
            X.6c4 r0 = X.C90504aG.A0U(r2)
            java.lang.String r0 = r0.A0A
            if (r0 == 0) goto L_0x0192
            int r0 = r0.length()
            if (r0 != 0) goto L_0x017e
        L_0x0192:
            int r1 = r1 + 1
            if (r1 >= 0) goto L_0x017e
            java.lang.RuntimeException r0 = X.C36371kC.A0s()
            throw r0
        L_0x019b:
            if (r1 <= 0) goto L_0x013a
        L_0x019d:
            X.60e r2 = r7.A08
            java.lang.String r1 = "retry"
            r0 = 6
            r2.A00(r1, r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C142736pN.BRM():void");
    }

    public C142736pN(AnonymousClass17Y r1, C1255160e r2, C20810yC r3, AnonymousClass005 r4, AnonymousClass005 r5, AnonymousClass005 r6, AnonymousClass005 r7, AnonymousClass005 r8, AnonymousClass005 r9, AnonymousClass005 r10, AnonymousClass005 r11) {
        C36321k7.A1B(r3, r1, r4, r5, r6);
        C36321k7.A1C(r7, r8, r9, r10, r11);
        this.A01 = r3;
        this.A00 = r1;
        this.A03 = r4;
        this.A0A = r5;
        this.A09 = r6;
        this.A06 = r7;
        this.A02 = r8;
        this.A04 = r9;
        this.A05 = r10;
        this.A07 = r11;
        this.A08 = r2;
    }
}
