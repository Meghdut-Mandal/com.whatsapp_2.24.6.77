package X;

/* renamed from: X.1bV  reason: invalid class name and case insensitive filesystem */
public class C31241bV implements C236319f {
    public final AnonymousClass196 A00;
    public final AnonymousClass12P A01;
    public final C26141Ja A02;
    public final C20350xQ A03;
    public final AnonymousClass1C4 A04;
    public final C30131Zi A05;
    public final C20100x1 A06;
    public final C19770wU A07;

    public int[] BCF() {
        return new int[]{8};
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00c2, code lost:
        r2.Boy(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ef, code lost:
        com.whatsapp.util.Log.i(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0015, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("OnDirtyMessageHandler/onDirty received unknown dirty bit category: ");
        r1.append(r2);
        com.whatsapp.util.Log.w(r1.toString());
        r7.A04.A03(r2, (java.lang.Long) null);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean BJl(android.os.Message r8, int r9) {
        /*
            r7 = this;
            r0 = 8
            if (r0 == r9) goto L_0x0006
            r0 = 0
            return r0
        L_0x0006:
            java.lang.Object r6 = r8.obj
            X.9Kk r6 = (X.AnonymousClass9Kk) r6
            java.lang.String r2 = r6.A01
            int r0 = r2.hashCode()
            r5 = 0
            r3 = 1
            switch(r0) {
                case -1237460524: goto L_0x00c7;
                case -961419275: goto L_0x00ac;
                case -741451427: goto L_0x0095;
                case 1091411309: goto L_0x0031;
                default: goto L_0x0015;
            }
        L_0x0015:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "OnDirtyMessageHandler/onDirty received unknown dirty bit category: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.1C4 r1 = r7.A04
            r0 = 0
            r1.A03(r2, r0)
        L_0x002f:
            r0 = 1
            return r0
        L_0x0031:
            java.lang.String r0 = "account_sync"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0015
            X.12P r0 = r7.A01
            boolean r0 = r0.A07
            if (r0 == 0) goto L_0x0092
            X.0x1 r4 = r7.A06
            java.util.Set r2 = r6.A02
            X.9SZ r1 = new X.9SZ
            r1.<init>()
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0063
            r0 = 1
            r1.A06 = r3
            r1.A04 = r3
            r1.A05 = r3
            r1.A02 = r3
            r1.A01 = r3
        L_0x0059:
            r1.A03 = r0
            X.9Nx r0 = r1.A00()
            r4.A01(r0, r3, r5, r3)
            goto L_0x002f
        L_0x0063:
            java.lang.String r0 = "device"
            boolean r0 = r2.contains(r0)
            r1.A02 = r0
            java.lang.String r0 = "status"
            boolean r0 = r2.contains(r0)
            r1.A06 = r0
            java.lang.String r0 = "picture"
            boolean r0 = r2.contains(r0)
            r1.A04 = r0
            java.lang.String r0 = "privacy"
            boolean r0 = r2.contains(r0)
            r1.A05 = r0
            java.lang.String r0 = "blocklist"
            boolean r0 = r2.contains(r0)
            r1.A01 = r0
            java.lang.String r0 = "notice"
            boolean r0 = r2.contains(r0)
            goto L_0x0059
        L_0x0092:
            java.lang.String r0 = "DirtyBitHandler/onAccountDirty/no-db-access/skip"
            goto L_0x00ef
        L_0x0095:
            java.lang.String r0 = "syncd_app_state"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0015
            java.lang.String r0 = "OnDirtyMessageHandler/onSyncDDirty"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0wU r2 = r7.A07
            r0 = 20
            X.1jD r1 = new X.1jD
            r1.<init>(r7, r6, r0)
            goto L_0x00c2
        L_0x00ac:
            java.lang.String r0 = "newsletter_metadata"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0015
            java.lang.String r0 = "OnDirtyMessageHandler/onNewsletterMetadataDirty"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0wU r2 = r7.A07
            r0 = 15
            X.1jA r1 = new X.1jA
            r1.<init>((java.lang.Object) r7, (int) r0)
        L_0x00c2:
            r2.Boy(r1)
            goto L_0x002f
        L_0x00c7:
            java.lang.String r0 = "groups"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0015
            X.12P r0 = r7.A01
            boolean r0 = r0.A07
            if (r0 == 0) goto L_0x00ed
            java.lang.String r0 = "DirtyBitHandler/onGroupsDirty call refetchGroups"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0xQ r2 = r7.A03
            X.0xR r1 = r2.A0d
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.A00
            r0.set(r3)
            boolean r0 = r1.A02
            if (r0 != 0) goto L_0x002f
            r0 = 3
            r2.A0U(r0, r3)
            goto L_0x002f
        L_0x00ed:
            java.lang.String r0 = "DirtyBitHandler/onGroupsDirty/no-db-access/skip"
        L_0x00ef:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x002f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31241bV.BJl(android.os.Message, int):boolean");
    }

    public C31241bV(AnonymousClass196 r1, AnonymousClass12P r2, C26141Ja r3, C20350xQ r4, AnonymousClass1C4 r5, C30131Zi r6, C20100x1 r7, C19770wU r8) {
        this.A07 = r8;
        this.A04 = r5;
        this.A00 = r1;
        this.A02 = r3;
        this.A03 = r4;
        this.A05 = r6;
        this.A06 = r7;
        this.A01 = r2;
    }
}
