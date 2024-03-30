package X;

import android.text.TextUtils;
import java.io.File;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.4xL  reason: invalid class name and case insensitive filesystem */
public class C101314xL extends C101344xO {
    public static final byte[] A0k = new byte[0];
    public long A00;
    public AnonymousClass620 A01;
    public AnonymousClass5JZ A02;
    public String A03;
    public AtomicReference A04 = C90514aH.A18();
    public boolean A05;
    public File A06;
    public final C19700wN A07;
    public final C20690y0 A08;
    public final AnonymousClass17Y A09;
    public final C24041Av A0A;
    public final C20050ww A0B;
    public final C25721Hk A0C;
    public final C25721Hk A0D;
    public final C25721Hk A0E;
    public final C25721Hk A0F;
    public final C25721Hk A0G;
    public final C25721Hk A0H;
    public final C19970wo A0I;
    public final C19630wG A0J;
    public final AnonymousClass7gR A0K;
    public final C159427jL A0L;
    public final AnonymousClass1DF A0M;
    public final AnonymousClass1GF A0N;
    public final C20810yC A0O;
    public final AnonymousClass1BV A0P;
    public final AnonymousClass1BU A0Q;
    public final AnonymousClass1D8 A0R;
    public final AnonymousClass1GH A0S;
    public final AnonymousClass1D4 A0T;
    public final AnonymousClass1E1 A0U;
    public final C131516Pj A0V;
    public final C121675tX A0W;
    public final C129146Fj A0X;
    public final C125105zK A0Y;
    public final AnonymousClass1GI A0Z;
    public final AnonymousClass1D9 A0a;
    public final AnonymousClass1GD A0b;
    public final C121715tb A0c;
    public final C19890wg A0d;
    public final AnonymousClass7hU A0e;
    public final AnonymousClass1BS A0f;
    public final C19770wU A0g;
    public final boolean A0h;
    public volatile long A0i;
    public volatile boolean A0j;

    public C101314xL(C19700wN r18, C20690y0 r19, AnonymousClass17Y r20, C24041Av r21, C20050ww r22, C19970wo r23, C19630wG r24, AnonymousClass1DF r25, AnonymousClass1GF r26, C20810yC r27, AnonymousClass1GE r28, AnonymousClass1BV r29, AnonymousClass1BU r30, AnonymousClass1D8 r31, AnonymousClass1GH r32, AnonymousClass1D4 r33, AnonymousClass1E1 r34, C131516Pj r35, AnonymousClass1GI r36, AnonymousClass1D9 r37, AnonymousClass1GD r38, C19890wg r39, AnonymousClass1BS r40, C19770wU r41) {
        C124995z9 r2;
        AnonymousClass1BV r10 = r29;
        C20810yC r3 = r27;
        C121715tb r210 = new C121715tb(r3, r28, r10);
        C25721Hk A0I2 = C90524aI.A0I();
        this.A0C = A0I2;
        this.A0G = C90524aI.A0I();
        this.A0H = C90524aI.A0I();
        this.A0E = C90524aI.A0I();
        this.A0F = C90524aI.A0I();
        this.A0D = C90524aI.A0I();
        this.A0e = new AnonymousClass6RP(this, 1);
        this.A0J = r24;
        C19970wo r9 = r23;
        this.A0I = r9;
        this.A0O = r3;
        AnonymousClass17Y r4 = r20;
        this.A09 = r4;
        this.A07 = r18;
        this.A0g = r41;
        this.A08 = r19;
        this.A0B = r22;
        AnonymousClass1BS r12 = r40;
        this.A0f = r12;
        this.A0R = r31;
        this.A0T = r33;
        AnonymousClass1D9 r1 = r37;
        this.A0a = r1;
        AnonymousClass1DF r5 = r25;
        this.A0M = r5;
        this.A0b = r38;
        this.A0U = r34;
        this.A0Z = r36;
        this.A0N = r26;
        this.A0S = r32;
        this.A0Q = r30;
        this.A0P = r10;
        this.A0d = r39;
        this.A0A = r21;
        C131516Pj r11 = r35;
        this.A0Y = r11.A04;
        this.A0V = r11;
        this.A0c = r210;
        C129146Fj r102 = new C129146Fj();
        this.A0X = r102;
        synchronized (r102) {
            r2 = r11.A02;
            r102.A00 = r2.A04;
            r102.A09 = r2.A09;
            r102.A08 = r2.A08;
            r102.A01 = r2.A05;
        }
        C159427jL r0 = r11.A00;
        this.A0L = r0;
        this.A0K = r0.BDN();
        this.A0W = new C121675tX(r9, r5, r1);
        C164977sg r02 = new C164977sg(this, 11);
        Executor executor = r4.A04;
        A0B(r02, executor);
        this.A00.A03(new C164977sg(this, 12), executor);
        boolean z = true;
        A0I2.A04(true);
        String str = this.A0V.A02.A06.A02;
        if (!r12.A08.A0E(15)) {
            r12.A0G.Boy(new AnonymousClass73X(r12, str, (String) null, (String) null, 0));
        }
        this.A0h = (!r3.A0E(487) || r2.A06 != C25471Gl.A0A || r2.A03 <= 52428800) ? false : z;
    }

    public static C123855xC A01(AnonymousClass620 r11, C101314xL r12, AnonymousClass5JZ r13, String str) {
        int i;
        int i2;
        String str2;
        AnonymousClass1GD r1 = r12.A0b;
        String A002 = A02(r12).A00();
        AnonymousClass1BW r2 = r1.A00;
        AnonymousClass1D8 r6 = r1.A04;
        AnonymousClass656 r14 = new AnonymousClass656(r2, r1.A01, r1.A02, r1.A03, r6, r11, r13, str, A002);
        AnonymousClass6DJ A003 = r14.A00();
        C121705ta r4 = r14.A06;
        AnonymousClass5SJ r3 = A003.A02;
        if (r3 == null || r3 == AnonymousClass5SJ.FAILURE) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("mediaupload/the resume request and the fallback mms resume request failed; request=");
            C36321k7.A1N(r12.A0V, A0u);
            str2 = null;
            i2 = 17;
            i = 0;
        } else if (r3 == AnonymousClass5SJ.COMPLETE) {
            StringBuilder A0u2 = AnonymousClass000.A0u();
            A0u2.append("mediaupload/object already existed on media server; upload ending; request=");
            C36321k7.A1N(r12.A0V, A0u2);
            return new C123855xC(r4, A003.A03, A003.A05, 0, 0, true);
        } else {
            AnonymousClass5SJ r0 = AnonymousClass5SJ.RESUME;
            StringBuilder A0u3 = AnonymousClass000.A0u();
            if (r3 == r0) {
                A0u3.append("mediaupload/resume from ");
                A0u3.append(A003.A01);
                A0u3.append("; request=");
                C36321k7.A1N(r12.A0V, A0u3);
                i = A003.A01;
                str2 = null;
                i2 = 0;
            } else {
                throw AnonymousClass000.A0f(r3, "unhandled result type in checkForResumePoint, type=", A0u3);
            }
        }
        return new C123855xC(r4, str2, str2, i2, i, false);
    }

    public static AnonymousClass64M A02(C101314xL r7) {
        String str;
        Integer valueOf;
        C20810yC r2 = r7.A0O;
        C124995z9 r1 = r7.A0V.A02;
        switch (r1.A02) {
            case 2:
                str = "chat_personal";
                break;
            case 3:
                str = "chat_group";
                break;
            case 4:
                str = "status_user";
                break;
            case 5:
                str = "product_catalog";
                break;
            case 6:
                str = "sticker_web";
                break;
            case 7:
                str = "payment_kyc";
                break;
            case 8:
                str = "message_history_sync";
                break;
            case 9:
                str = "community";
                break;
            case 10:
                str = "channel";
                break;
            case 11:
                str = "broadcast";
                break;
            case 12:
                str = "multi_chat";
                break;
            default:
                str = "unknown";
                break;
        }
        String str2 = r1.A06.A02;
        AnonymousClass620 r0 = r7.A01;
        if (r0 == null) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(r0.A01.get());
        }
        return new AnonymousClass64M(r2, valueOf, str, str2, (String) null, true);
    }

    public static void A03(C101314xL r13, Integer num) {
        C129146Fj r8;
        if (r13.A0j) {
            r13.A0j = false;
            r13.A0f.unregisterObserver(r13.A0e);
        }
        C131516Pj r7 = r13.A0V;
        if (r7.A02.A0F) {
            C129146Fj r5 = r13.A0X;
            AnonymousClass1D8 r6 = r13.A0R;
            String A032 = r5.A03();
            long A002 = C19970wo.A00(r13.A0I);
            if (!TextUtils.isEmpty(A032)) {
                A032 = C90474aD.A0b(C148366yk.A02(C90504aG.A0I(A032), "_nc_hot", String.valueOf(C36391kE.A0B(A002))));
            }
            r5.A08(r6.A00(A032, true));
        }
        if (num.intValue() == 18) {
            r13.A0Q.A00();
        }
        if (r13.A02.isCancelled()) {
            num = C36361kB.A0i();
        }
        C25721Hk r1 = r13.A0H;
        C129146Fj r2 = r13.A0X;
        synchronized (r2) {
            r8 = new C129146Fj();
            r8.A00 = r2.A00;
            r8.A0I = r2.A0I;
            r8.A0K = r2.A0K;
            r8.A0L = r2.A0L;
            r8.A03 = r2.A03;
            r8.A04 = r2.A04;
            r8.A09 = r2.A09;
            r8.A08 = r2.A08;
            r8.A02 = r2.A02;
            r8.A0B = r2.A0B;
            r8.A07 = r2.A07;
            r8.A05 = r2.A05;
            r8.A0F = r2.A0F;
            r8.A0H = r2.A0H;
            r8.A0G = r2.A0G;
            r8.A0D = r2.A0D;
            r8.A0C = r2.A0C;
            r8.A0J = r2.A0J;
            r8.A01 = r2.A01;
            r8.A06 = r2.A06;
            r8.A0A = r2.A0A;
            r8.A0E = r2.A0E;
        }
        r1.A04(new C123865xD(r7, r8, r13.A06, num.intValue(), r13.A05, r13.A0L()));
    }

    public static boolean A04(C101314xL r2) {
        C124995z9 r22 = r2.A0V.A02;
        C25471Gl r1 = r22.A06;
        if (!AnonymousClass6Q6.A00(r1)) {
            return false;
        }
        if (AnonymousClass6Y1.A08(r1) || r1 == C25471Gl.A0h) {
            return true;
        }
        int[] iArr = r22.A0H;
        if (iArr == null || iArr.length <= 0) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:(3:129|(2:131|132)|150)|133|134|(3:136|2e8|148)(1:146)|149) */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:210|211|212|213|214|548|215) */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x03ba, code lost:
        if (r17 != false) goto L_0x03bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x048b, code lost:
        if (((X.AnonymousClass5BQ) r6).A01 != false) goto L_0x048d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x051f, code lost:
        if (r11.A01 != false) goto L_0x0521;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00c4, code lost:
        if (r1 == false) goto L_0x00ab;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:133:0x02de */
    /* JADX WARNING: Missing exception handler attribute for start block: B:213:0x0496 */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x02e4 A[Catch:{ all -> 0x02a2, all -> 0x09e0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x02f9 A[Catch:{ all -> 0x02a2, all -> 0x09e0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:507:0x0934 A[Catch:{ all -> 0x02a2, all -> 0x09e0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:515:0x097b  */
    /* JADX WARNING: Removed duplicated region for block: B:519:0x0993  */
    /* JADX WARNING: Removed duplicated region for block: B:521:0x09a0  */
    /* JADX WARNING: Removed duplicated region for block: B:541:0x0a1f  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:332:0x0674=Splitter:B:332:0x0674, B:213:0x0496=Splitter:B:213:0x0496, B:111:0x0287=Splitter:B:111:0x0287, B:340:0x0699=Splitter:B:340:0x0699, B:133:0x02de=Splitter:B:133:0x02de} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Integer A0I() {
        /*
            r43 = this;
            r0 = r43
            boolean r1 = r0 instanceof X.AnonymousClass5C4
            if (r1 == 0) goto L_0x00d2
            X.5C4 r0 = (X.AnonymousClass5C4) r0
            X.1D9 r2 = r0.A0a
            X.6Pj r3 = r0.A0V
            X.5z9 r5 = r3.A02
            X.1Gl r4 = r5.A06
            java.io.File r6 = r5.A07
            X.C18740tg.A06(r6)
            boolean r1 = r0.A0L()
            boolean r1 = r2.A08(r4, r6, r1)
            if (r1 != 0) goto L_0x0031
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "unable to send media; media valid check failed."
            r1.append(r0)
            X.C36331k8.A1P(r3, r1)
            r0 = 5
        L_0x002c:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L_0x0031:
            X.C18740tg.A06(r6)
            boolean r1 = r0.A0L()
            java.lang.String r2 = r2.A07(r4, r6, r1)
            if (r2 == 0) goto L_0x0044
            X.6Fj r1 = r0.A0X
            monitor-enter(r1)
            r1.A0B = r2     // Catch:{ all -> 0x00cf }
            monitor-exit(r1)
        L_0x0044:
            X.0wg r2 = r0.A0d
            X.0y0 r1 = r0.A08
            X.AnonymousClass1GW.A0P(r1, r2)
            r0.A0J()
            X.1BS r1 = r0.A0f
            r1.A0D()
            X.5yq r2 = r1.A0B()
            X.0wo r1 = r0.A0I
            java.lang.String r8 = X.AnonymousClass6HI.A00(r1, r2)
            if (r2 == 0) goto L_0x00cb
            if (r8 == 0) goto L_0x00cb
            int r9 = X.C111945d6.A00(r4)
            X.C18740tg.A06(r6)
            java.lang.String r6 = r6.getPath()
            java.lang.String r2 = r5.A0A
            X.1Gl r1 = X.C25471Gl.A0b
            if (r4 != r1) goto L_0x009e
            r10 = 3
        L_0x0073:
            boolean r1 = r3.A02()
            r11 = r1 ^ 1
            java.lang.String r7 = r3.toString()
            X.64Q r5 = new X.64Q
            r5.<init>(r6, r7, r8, r9, r10, r11)
            X.1D7 r1 = r0.A00
            X.5u4 r2 = new X.5u4
            r2.<init>(r0, r1)
            r1 = 1
            X.7pU r0 = new X.7pU
            r0.<init>(r5, r2, r2, r1)
            r2.A00 = r0
            java.lang.Object r0 = X.AnonymousClass3PM.A00(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x00c7
            int r0 = r0.intValue()
            goto L_0x002c
        L_0x009e:
            X.1Gl r1 = X.C25471Gl.A09
            if (r4 != r1) goto L_0x00a4
            r10 = 6
            goto L_0x0073
        L_0x00a4:
            int r1 = r2.hashCode()
            switch(r1) {
                case -786681338: goto L_0x00bd;
                case 108243: goto L_0x00b5;
                case 1312630381: goto L_0x00ad;
                default: goto L_0x00ab;
            }
        L_0x00ab:
            r10 = -1
            goto L_0x0073
        L_0x00ad:
            java.lang.String r1 = "optimistic"
            boolean r1 = r2.equals(r1)
            r10 = 1
            goto L_0x00c4
        L_0x00b5:
            java.lang.String r1 = "mms"
            boolean r1 = r2.equals(r1)
            r10 = 0
            goto L_0x00c4
        L_0x00bd:
            java.lang.String r1 = "payment"
            boolean r1 = r2.equals(r1)
            r10 = 2
        L_0x00c4:
            if (r1 != 0) goto L_0x0073
            goto L_0x00ab
        L_0x00c7:
            r0 = 23
            goto L_0x002c
        L_0x00cb:
            r0 = 33
            goto L_0x002c
        L_0x00cf:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x00d2:
            boolean r1 = r0 instanceof X.AnonymousClass5C5     // Catch:{ all -> 0x09e0 }
            r21 = r1
            X.6Pj r6 = r0.A0V     // Catch:{ all -> 0x09e0 }
            X.5z2 r1 = r6.A01     // Catch:{ all -> 0x09e0 }
            r42 = r1
            long r4 = r1.A09     // Catch:{ all -> 0x09e0 }
            r2 = 0
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 > 0) goto L_0x00ec
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x09e0 }
            r1 = r42
            r1.A09 = r2     // Catch:{ all -> 0x09e0 }
        L_0x00ec:
            X.5zK r8 = r0.A0Y     // Catch:{ all -> 0x09e0 }
            X.1D4 r1 = r0.A0T     // Catch:{ all -> 0x09e0 }
            r41 = r1
            r4 = 0
            java.lang.Float r1 = r1.A01(r4)     // Catch:{ all -> 0x09e0 }
            r8.A05 = r1     // Catch:{ all -> 0x09e0 }
            java.lang.Boolean r1 = X.C36371kC.A0m()     // Catch:{ all -> 0x09e0 }
            r8.A04 = r1     // Catch:{ all -> 0x09e0 }
            boolean r1 = r0.A0L()     // Catch:{ all -> 0x09e0 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ all -> 0x09e0 }
            r8.A03 = r1     // Catch:{ all -> 0x09e0 }
            android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x09e0 }
            X.0wo r1 = r0.A0I     // Catch:{ all -> 0x09e0 }
            long r1 = X.C19970wo.A00(r1)     // Catch:{ all -> 0x09e0 }
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x09e0 }
            r8.A0I = r1     // Catch:{ all -> 0x09e0 }
            long r16 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x09e0 }
            X.1BS r7 = r0.A0f     // Catch:{ all -> 0x09e0 }
            r7.A0D()     // Catch:{ all -> 0x09e0 }
            boolean r1 = r0 instanceof X.AnonymousClass5C3     // Catch:{ all -> 0x09e0 }
            if (r1 == 0) goto L_0x0127
            r15 = 1
            goto L_0x0128
        L_0x0127:
            r15 = 0
        L_0x0128:
            if (r15 == 0) goto L_0x012b
            goto L_0x0140
        L_0x012b:
            X.5z9 r1 = r6.A02     // Catch:{ all -> 0x09e0 }
            X.1Gl r2 = r1.A06     // Catch:{ all -> 0x09e0 }
            r40 = r2
            java.lang.String r2 = r2.A02     // Catch:{ all -> 0x09e0 }
            r31 = r2
            r11 = 0
            r13 = 0
            r14 = 0
            r9 = r7
            r10 = r2
            r12 = r11
            X.620 r20 = X.AnonymousClass1BS.A00(r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x09e0 }
            goto L_0x0190
        L_0x0140:
            X.5z9 r1 = r6.A02     // Catch:{ all -> 0x09e0 }
            X.1Gl r2 = r1.A06     // Catch:{ all -> 0x09e0 }
            r40 = r2
            java.lang.String r2 = r2.A02     // Catch:{ all -> 0x09e0 }
            r31 = r2
            r32 = 0
            X.5yq r29 = r7.A0B()     // Catch:{ all -> 0x09e0 }
            X.0wo r14 = r7.A07     // Catch:{ all -> 0x09e0 }
            X.0yC r13 = r7.A08     // Catch:{ all -> 0x09e0 }
            X.0z1 r12 = r7.A0H     // Catch:{ all -> 0x09e0 }
            X.0wN r11 = r7.A05     // Catch:{ all -> 0x09e0 }
            X.19J r10 = r7.A06     // Catch:{ all -> 0x09e0 }
            X.1BX r9 = r7.A0D     // Catch:{ all -> 0x09e0 }
            X.1BU r5 = r7.A09     // Catch:{ all -> 0x09e0 }
            long r2 = r7.A03     // Catch:{ all -> 0x09e0 }
            r38 = 1
            r34 = 0
            r35 = 0
            r39 = 0
            r24 = r14
            r25 = r13
            r26 = r5
            r27 = r9
            r28 = r7
            r30 = r12
            r33 = r32
            r36 = r2
            r22 = r11
            r23 = r10
            X.6yn r9 = X.C148396yn.A01(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r38, r39)     // Catch:{ all -> 0x09e0 }
            X.64p r5 = r9.A00     // Catch:{ all -> 0x09e0 }
            if (r5 == 0) goto L_0x0189
            X.5Ja r9 = new X.5Ja     // Catch:{ all -> 0x09e0 }
            r9.<init>(r5, r2)     // Catch:{ all -> 0x09e0 }
        L_0x0189:
            X.620 r20 = new X.620     // Catch:{ all -> 0x09e0 }
            r2 = r20
            r2.<init>(r9)     // Catch:{ all -> 0x09e0 }
        L_0x0190:
            java.lang.Long r2 = X.C90494aF.A0V(r16)     // Catch:{ all -> 0x09e0 }
            r8.A0H = r2     // Catch:{ all -> 0x09e0 }
            r2 = r20
            X.7l7 r2 = r2.A00     // Catch:{ all -> 0x09e0 }
            X.64p r2 = r2.BAg()     // Catch:{ all -> 0x09e0 }
            r5 = 33
            if (r2 != 0) goto L_0x01b1
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x09e0 }
            java.lang.String r2 = "mediaupload/getselectedroute/failed; request="
            X.C36321k7.A1J(r6, r2, r3)     // Catch:{ all -> 0x09e0 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x09e0 }
            goto L_0x095b
        L_0x01b1:
            if (r15 == 0) goto L_0x01c3
            java.lang.String r3 = r2.A05     // Catch:{ all -> 0x09e0 }
            java.lang.String r2 = "fallback"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x09e0 }
            if (r2 == 0) goto L_0x01c3
            java.lang.Integer r4 = X.C90514aH.A0k()     // Catch:{ all -> 0x09e0 }
            goto L_0x095b
        L_0x01c3:
            r2 = r20
            r0.A01 = r2     // Catch:{ all -> 0x09e0 }
            r0.A0G()     // Catch:{ all -> 0x09e0 }
            X.6Fj r5 = r0.A0X     // Catch:{ all -> 0x09e0 }
            monitor-enter(r5)     // Catch:{ all -> 0x09e0 }
            X.5qQ r2 = r5.A01     // Catch:{ all -> 0x09dd }
            monitor-exit(r5)     // Catch:{ all -> 0x09e0 }
            if (r2 == 0) goto L_0x01dd
            monitor-enter(r5)     // Catch:{ all -> 0x09e0 }
            X.5qQ r2 = r5.A01     // Catch:{ all -> 0x09dd }
            monitor-exit(r5)     // Catch:{ all -> 0x09e0 }
            X.5qR r3 = r2.A01     // Catch:{ all -> 0x09e0 }
            monitor-enter(r5)     // Catch:{ all -> 0x09e0 }
            X.5qQ r2 = r5.A01     // Catch:{ all -> 0x09dd }
            goto L_0x0431
        L_0x01dd:
            X.5tX r11 = r0.A0W     // Catch:{ all -> 0x09e0 }
            X.7jL r2 = r0.A0L     // Catch:{ all -> 0x09e0 }
            r26 = r2
            boolean r12 = r0.A0L()     // Catch:{ all -> 0x09e0 }
            boolean r10 = X.C90484aE.A1U(r26)     // Catch:{ all -> 0x09e0 }
            boolean r2 = r1.A0D     // Catch:{ all -> 0x09e0 }
            if (r2 != 0) goto L_0x0222
            X.1D9 r12 = r11.A02     // Catch:{ all -> 0x09e0 }
            java.io.File r2 = r1.A07     // Catch:{ all -> 0x09e0 }
            X.C18740tg.A06(r2)     // Catch:{ all -> 0x09e0 }
            java.security.MessageDigest r9 = X.C90504aG.A0s()     // Catch:{ all -> 0x09e0 }
            java.io.InputStream r2 = X.AnonymousClass1D9.A02(r6, r12, r2)     // Catch:{ all -> 0x09e0 }
            X.5Qv r3 = new X.5Qv     // Catch:{ all -> 0x09e0 }
            r3.<init>(r2, r9)     // Catch:{ all -> 0x09e0 }
            r2 = 0
            X.71q r11 = new X.71q     // Catch:{ all -> 0x09e0 }
            r11.<init>(r3, r3, r2, r12)     // Catch:{ all -> 0x09e0 }
            r2 = 16384(0x4000, float:2.2959E-41)
            byte[] r3 = new byte[r2]     // Catch:{ all -> 0x08e5 }
        L_0x020d:
            X.5Qv r2 = r11.A01     // Catch:{ all -> 0x08e5 }
            int r2 = r2.read(r3)     // Catch:{ all -> 0x08e5 }
            if (r2 >= 0) goto L_0x020d
            X.5Qv r2 = r11.A02     // Catch:{ all -> 0x08e5 }
            java.lang.String r2 = r2.A00()     // Catch:{ all -> 0x08e5 }
            X.621 r12 = new X.621     // Catch:{ all -> 0x08e5 }
            r12.<init>(r2, r4)     // Catch:{ all -> 0x08e5 }
            goto L_0x03fb
        L_0x0222:
            X.6Rx r9 = r5.A00()     // Catch:{ all -> 0x09e0 }
            r17 = 1
            if (r9 == 0) goto L_0x024e
            boolean r2 = r6.A02()     // Catch:{ all -> 0x09e0 }
            if (r2 == 0) goto L_0x0244
            int r3 = r6.A00()     // Catch:{ all -> 0x09e0 }
            r2 = 3
            if (r3 == r2) goto L_0x0251
            X.0wo r2 = r11.A00     // Catch:{ all -> 0x09e0 }
            long r2 = X.C19970wo.A00(r2)     // Catch:{ all -> 0x09e0 }
            boolean r2 = X.C132046Rx.A01(r9, r2)     // Catch:{ all -> 0x09e0 }
            if (r2 == 0) goto L_0x0244
            goto L_0x0251
        L_0x0244:
            monitor-enter(r5)     // Catch:{ all -> 0x09e0 }
            r2 = 0
            r5.A00 = r2     // Catch:{ all -> 0x09da }
            r5.A08 = r2     // Catch:{ all -> 0x09da }
            monitor-exit(r5)     // Catch:{ all -> 0x09e0 }
            r19 = 2
            goto L_0x0253
        L_0x024e:
            r19 = 1
            goto L_0x0253
        L_0x0251:
            r19 = 3
        L_0x0253:
            if (r12 == 0) goto L_0x02a6
            X.1D9 r3 = r11.A02     // Catch:{ all -> 0x09e0 }
            r2 = 32
            byte[] r2 = new byte[r2]     // Catch:{ all -> 0x09e0 }
            X.C90504aG.A1Q(r2)     // Catch:{ all -> 0x09e0 }
            java.lang.String r2 = X.C36441kJ.A13(r2)     // Catch:{ all -> 0x09e0 }
            X.621 r14 = new X.621     // Catch:{ all -> 0x09e0 }
            r14.<init>(r2, r4)     // Catch:{ all -> 0x09e0 }
            r2 = 32
            byte[] r2 = new byte[r2]     // Catch:{ all -> 0x09e0 }
            X.C90504aG.A1Q(r2)     // Catch:{ all -> 0x09e0 }
            java.lang.String r2 = X.C36441kJ.A13(r2)     // Catch:{ all -> 0x09e0 }
            X.621 r13 = new X.621     // Catch:{ all -> 0x09e0 }
            r13.<init>(r2, r4)     // Catch:{ all -> 0x09e0 }
            r2 = 32
            byte[] r12 = new byte[r2]     // Catch:{ all -> 0x09e0 }
            monitor-enter(r3)     // Catch:{ all -> 0x09e0 }
            java.security.SecureRandom r2 = r3.A00     // Catch:{ all -> 0x02a2 }
            if (r2 != 0) goto L_0x0287
            java.security.SecureRandom r2 = new java.security.SecureRandom     // Catch:{ all -> 0x02a2 }
            r2.<init>()     // Catch:{ all -> 0x02a2 }
            r3.A00 = r2     // Catch:{ all -> 0x02a2 }
        L_0x0287:
            monitor-exit(r3)     // Catch:{ all -> 0x09e0 }
            r2.nextBytes(r12)     // Catch:{ all -> 0x09e0 }
            X.0wo r2 = r3.A02     // Catch:{ all -> 0x09e0 }
            long r2 = X.C19970wo.A00(r2)     // Catch:{ all -> 0x09e0 }
            X.6Rx r9 = new X.6Rx     // Catch:{ all -> 0x09e0 }
            r9.<init>(r12, r2)     // Catch:{ all -> 0x09e0 }
            X.5qR r2 = new X.5qR     // Catch:{ all -> 0x09e0 }
            r2.<init>(r9, r10)     // Catch:{ all -> 0x09e0 }
            X.5tZ r3 = new X.5tZ     // Catch:{ all -> 0x09e0 }
            r3.<init>(r14, r13, r2)     // Catch:{ all -> 0x09e0 }
            goto L_0x033e
        L_0x02a2:
            r2 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x09e0 }
            goto L_0x09dc
        L_0x02a6:
            int r2 = r1.A01     // Catch:{ all -> 0x09e0 }
            boolean r13 = X.C36381kD.A1U(r2, r10)
            X.1D9 r9 = r11.A02     // Catch:{ all -> 0x09e0 }
            r6.A01()     // Catch:{ all -> 0x09e0 }
            java.lang.String r12 = r6.toString()     // Catch:{ all -> 0x09e0 }
            java.io.File r3 = r1.A07     // Catch:{ all -> 0x09e0 }
            X.C18740tg.A06(r3)     // Catch:{ all -> 0x09e0 }
            boolean r2 = r3.exists()     // Catch:{ all -> 0x09e0 }
            if (r2 == 0) goto L_0x09bc
            if (r13 == 0) goto L_0x02de
            java.lang.String r2 = r5.A06()     // Catch:{ all -> 0x09e0 }
            if (r2 == 0) goto L_0x02de
            java.lang.String r2 = r5.A05()     // Catch:{ all -> 0x09e0 }
            if (r2 == 0) goto L_0x02de
            X.6Rx r2 = r5.A00()     // Catch:{ all -> 0x09e0 }
            if (r2 == 0) goto L_0x02de
            java.lang.String r2 = r5.A05()     // Catch:{ all -> 0x09e0 }
            if (r2 == 0) goto L_0x031e
            android.util.Base64.decode(r2, r4)     // Catch:{ IllegalArgumentException -> 0x02de }
            goto L_0x031e
        L_0x02de:
            X.6Rx r2 = r5.A00()     // Catch:{ all -> 0x09e0 }
            if (r2 != 0) goto L_0x02f9
            r2 = 32
            byte[] r13 = new byte[r2]     // Catch:{ all -> 0x09e0 }
            monitor-enter(r9)     // Catch:{ all -> 0x09e0 }
            java.security.SecureRandom r2 = r9.A00     // Catch:{ all -> 0x02f5 }
            if (r2 != 0) goto L_0x0303
            java.security.SecureRandom r2 = new java.security.SecureRandom     // Catch:{ all -> 0x02f5 }
            r2.<init>()     // Catch:{ all -> 0x02f5 }
            r9.A00 = r2     // Catch:{ all -> 0x02f5 }
            goto L_0x0303
        L_0x02f5:
            r2 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x09e0 }
            goto L_0x09dc
        L_0x02f9:
            X.6Rx r2 = r5.A00()     // Catch:{ all -> 0x09e0 }
            X.5qR r3 = new X.5qR     // Catch:{ all -> 0x09e0 }
            r3.<init>(r2, r4)     // Catch:{ all -> 0x09e0 }
            goto L_0x0317
        L_0x0303:
            monitor-exit(r9)     // Catch:{ all -> 0x09e0 }
            r2.nextBytes(r13)     // Catch:{ all -> 0x09e0 }
            X.0wo r2 = r9.A02     // Catch:{ all -> 0x09e0 }
            long r2 = X.C19970wo.A00(r2)     // Catch:{ all -> 0x09e0 }
            X.6Rx r12 = new X.6Rx     // Catch:{ all -> 0x09e0 }
            r12.<init>(r13, r2)     // Catch:{ all -> 0x09e0 }
            X.5qR r3 = new X.5qR     // Catch:{ all -> 0x09e0 }
            r3.<init>(r12, r10)     // Catch:{ all -> 0x09e0 }
        L_0x0317:
            r2 = r26
            X.5tZ r3 = r9.A06(r2, r6, r3)     // Catch:{ all -> 0x09e0 }
            goto L_0x033e
        L_0x031e:
            java.lang.String r2 = r5.A06()     // Catch:{ all -> 0x09e0 }
            X.621 r12 = new X.621     // Catch:{ all -> 0x09e0 }
            r12.<init>(r2, r10)     // Catch:{ all -> 0x09e0 }
            java.lang.String r2 = r5.A05()     // Catch:{ all -> 0x09e0 }
            X.621 r9 = new X.621     // Catch:{ all -> 0x09e0 }
            r9.<init>(r2, r10)     // Catch:{ all -> 0x09e0 }
            X.6Rx r3 = r5.A00()     // Catch:{ all -> 0x09e0 }
            X.5qR r2 = new X.5qR     // Catch:{ all -> 0x09e0 }
            r2.<init>(r3, r4)     // Catch:{ all -> 0x09e0 }
            X.5tZ r3 = new X.5tZ     // Catch:{ all -> 0x09e0 }
            r3.<init>(r12, r9, r2)     // Catch:{ all -> 0x09e0 }
        L_0x033e:
            X.AnonymousClass00C.A0B(r3)     // Catch:{ all -> 0x09e0 }
            X.621 r2 = r3.A01     // Catch:{ all -> 0x09e0 }
            r25 = r2
            X.621 r2 = r3.A00     // Catch:{ all -> 0x09e0 }
            r16 = r2
            X.5qR r15 = r3.A02     // Catch:{ all -> 0x09e0 }
            r2 = r25
            java.lang.String r12 = r2.A01     // Catch:{ all -> 0x09e0 }
            r2 = r40
            int r3 = r2.A00     // Catch:{ all -> 0x09e0 }
            if (r12 == 0) goto L_0x03bf
            X.1DF r2 = r11.A01     // Catch:{ all -> 0x09e0 }
            r24 = r2
            X.5x5 r9 = r2.A09(r12, r3, r10)     // Catch:{ all -> 0x09e0 }
            if (r9 == 0) goto L_0x03bf
            boolean r2 = r15.A01     // Catch:{ all -> 0x09e0 }
            if (r2 == 0) goto L_0x03c1
            X.3Qj r13 = r9.A02     // Catch:{ all -> 0x09e0 }
            long r2 = r9.A01     // Catch:{ all -> 0x09e0 }
            X.6Rx r13 = X.C132046Rx.A00(r13, r2)     // Catch:{ all -> 0x09e0 }
            if (r13 == 0) goto L_0x03c1
            java.lang.String r2 = r9.A03     // Catch:{ all -> 0x09e0 }
            r18 = r2
            X.AnonymousClass00C.A07(r18)     // Catch:{ all -> 0x09e0 }
            byte[] r2 = r13.A01     // Catch:{ all -> 0x09e0 }
            X.AnonymousClass00C.A07(r2)     // Catch:{ all -> 0x09e0 }
            r14 = r2
            r3 = r24
            r2 = r18
            X.3Qa r2 = r3.A0A(r12, r2, r14, r10)     // Catch:{ all -> 0x09e0 }
            if (r2 == 0) goto L_0x03a4
            X.11F r2 = r2.A00     // Catch:{ all -> 0x09e0 }
            boolean r2 = r2 instanceof X.C177528dw     // Catch:{ all -> 0x09e0 }
            if (r2 == 0) goto L_0x03a4
        L_0x038a:
            boolean r2 = r6.A02()     // Catch:{ all -> 0x09e0 }
            if (r2 == 0) goto L_0x03ba
            int r3 = r6.A00()     // Catch:{ all -> 0x09e0 }
            r2 = 3
            if (r3 == r2) goto L_0x03a7
            X.0wo r2 = r11.A00     // Catch:{ all -> 0x09e0 }
            long r2 = X.C19970wo.A00(r2)     // Catch:{ all -> 0x09e0 }
            boolean r2 = X.C132046Rx.A01(r13, r2)     // Catch:{ all -> 0x09e0 }
            if (r2 == 0) goto L_0x03ba
            goto L_0x03a7
        L_0x03a4:
            r17 = 0
            goto L_0x038a
        L_0x03a7:
            if (r17 != 0) goto L_0x03bc
            X.621 r16 = new X.621     // Catch:{ all -> 0x09e0 }
            r3 = r16
            r2 = r18
            r3.<init>(r2, r4)     // Catch:{ all -> 0x09e0 }
            X.5qR r15 = new X.5qR     // Catch:{ all -> 0x09e0 }
            r15.<init>(r13, r4)     // Catch:{ all -> 0x09e0 }
            r19 = 3
            goto L_0x03c1
        L_0x03ba:
            if (r17 == 0) goto L_0x03c1
        L_0x03bc:
            r19 = 4
            goto L_0x03c1
        L_0x03bf:
            r2 = 0
            goto L_0x03ee
        L_0x03c1:
            X.3Qj r3 = r9.A02     // Catch:{ all -> 0x09e0 }
            java.io.File r9 = r1.A07     // Catch:{ all -> 0x09e0 }
            X.C18740tg.A06(r9)     // Catch:{ all -> 0x09e0 }
            boolean r2 = r3.A0V     // Catch:{ all -> 0x09e0 }
            if (r2 == 0) goto L_0x03bf
            java.io.File r2 = r3.A0I     // Catch:{ all -> 0x09e0 }
            if (r2 == 0) goto L_0x03bf
            boolean r2 = r2.isAbsolute()     // Catch:{ all -> 0x09e0 }
            if (r2 == 0) goto L_0x03bf
            java.io.File r2 = r3.A0I     // Catch:{ all -> 0x09e0 }
            boolean r2 = r2.exists()     // Catch:{ all -> 0x09e0 }
            if (r2 == 0) goto L_0x03bf
            java.io.File r2 = r3.A0I     // Catch:{ all -> 0x09e0 }
            long r11 = r2.length()     // Catch:{ all -> 0x09e0 }
            long r9 = r9.length()     // Catch:{ all -> 0x09e0 }
            int r2 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r2 != 0) goto L_0x03bf
            java.io.File r2 = r3.A0I     // Catch:{ all -> 0x09e0 }
        L_0x03ee:
            X.5wK r11 = new X.5wK     // Catch:{ all -> 0x09e0 }
            r17 = r15
            r18 = r2
            r14 = r11
            r15 = r25
            r14.<init>(r15, r16, r17, r18, r19)     // Catch:{ all -> 0x09e0 }
            goto L_0x0413
        L_0x03fb:
            r11.close()     // Catch:{ all -> 0x09e0 }
            r9 = 0
            X.621 r3 = new X.621     // Catch:{ all -> 0x09e0 }
            r3.<init>(r9, r4)     // Catch:{ all -> 0x09e0 }
            X.5qR r2 = new X.5qR     // Catch:{ all -> 0x09e0 }
            r2.<init>(r9, r10)     // Catch:{ all -> 0x09e0 }
            X.5wK r11 = new X.5wK     // Catch:{ all -> 0x09e0 }
            r13 = r3
            r14 = r2
            r15 = r9
            r16 = r10
            r11.<init>(r12, r13, r14, r15, r16)     // Catch:{ all -> 0x09e0 }
        L_0x0413:
            X.1Hk r10 = r0.A0E     // Catch:{ all -> 0x09e0 }
            X.5qR r3 = r11.A03     // Catch:{ all -> 0x09e0 }
            int r9 = r11.A00     // Catch:{ all -> 0x09e0 }
            X.5qQ r2 = new X.5qQ     // Catch:{ all -> 0x09e0 }
            r2.<init>(r3, r9)     // Catch:{ all -> 0x09e0 }
            r10.A04(r2)     // Catch:{ all -> 0x09e0 }
            X.1Hk r2 = r0.A0F     // Catch:{ all -> 0x09e0 }
            r2.A04(r11)     // Catch:{ all -> 0x09e0 }
            X.621 r10 = r11.A02     // Catch:{ all -> 0x09e0 }
            X.621 r2 = r11.A01     // Catch:{ all -> 0x09e0 }
            r36 = r2
            java.io.File r2 = r11.A04     // Catch:{ all -> 0x09e0 }
            r0.A06 = r2     // Catch:{ all -> 0x09e0 }
            goto L_0x0444
        L_0x0431:
            monitor-exit(r5)     // Catch:{ all -> 0x09e0 }
            int r9 = r2.A00     // Catch:{ all -> 0x09e0 }
            X.1D9 r10 = r0.A0a     // Catch:{ all -> 0x09e0 }
            X.7jL r2 = r0.A0L     // Catch:{ all -> 0x09e0 }
            r26 = r2
            X.5tZ r2 = r10.A06(r2, r6, r3)     // Catch:{ all -> 0x09e0 }
            X.621 r10 = r2.A01     // Catch:{ all -> 0x09e0 }
            X.621 r2 = r2.A00     // Catch:{ all -> 0x09e0 }
            r36 = r2
        L_0x0444:
            java.lang.String r2 = r10.A01     // Catch:{ all -> 0x09e0 }
            r35 = r2
            r5.A0A(r2)     // Catch:{ all -> 0x09e0 }
            boolean r2 = r10.A00     // Catch:{ all -> 0x09e0 }
            r19 = r2
            r0.A0G()     // Catch:{ all -> 0x09e0 }
            r2 = r42
            int r2 = r2.A00     // Catch:{ all -> 0x09e0 }
            if (r2 != 0) goto L_0x045c
            r2 = r42
            r2.A00 = r9     // Catch:{ all -> 0x09e0 }
        L_0x045c:
            r2 = r36
            java.lang.String r2 = r2.A01     // Catch:{ all -> 0x09e0 }
            r5.A09(r2)     // Catch:{ all -> 0x09e0 }
            r0.A03 = r2     // Catch:{ all -> 0x09e0 }
            r0.A0G()     // Catch:{ all -> 0x09e0 }
            boolean r2 = r1.A0E     // Catch:{ all -> 0x09e0 }
            if (r2 != 0) goto L_0x04a3
            int r9 = r6.A00()     // Catch:{ all -> 0x09e0 }
            r2 = 3
            boolean r2 = X.AnonymousClass000.A1S(r9, r2)
            if (r2 != 0) goto L_0x04a3
            boolean r2 = r0.A0L()     // Catch:{ all -> 0x09e0 }
            if (r2 == 0) goto L_0x049d
        L_0x047d:
            if (r21 == 0) goto L_0x048d
            boolean r2 = r0.A0L()     // Catch:{ all -> 0x09e0 }
            if (r2 == 0) goto L_0x048d
            r2 = r6
            X.5BQ r2 = (X.AnonymousClass5BQ) r2     // Catch:{ all -> 0x09e0 }
            boolean r3 = r2.A01     // Catch:{ all -> 0x09e0 }
            r2 = 1
            if (r3 == 0) goto L_0x048e
        L_0x048d:
            r2 = 0
        L_0x048e:
            if (r2 == 0) goto L_0x049d
            r2 = 100
            java.lang.Thread.sleep(r2)     // Catch:{ InterruptedException -> 0x0496 }
            goto L_0x0499
        L_0x0496:
            X.C90484aE.A0z()     // Catch:{ all -> 0x09e0 }
        L_0x0499:
            r0.A0G()     // Catch:{ all -> 0x09e0 }
            goto L_0x047d
        L_0x049d:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x09e0 }
            goto L_0x0948
        L_0x04a3:
            X.1D9 r10 = r0.A0a     // Catch:{ all -> 0x09e0 }
            java.io.File r2 = r1.A07     // Catch:{ all -> 0x09e0 }
            r34 = r2
            X.C18740tg.A06(r34)     // Catch:{ all -> 0x09e0 }
            boolean r11 = r0.A0L()     // Catch:{ all -> 0x09e0 }
            r9 = r40
            boolean r2 = r10.A08(r9, r2, r11)     // Catch:{ all -> 0x09e0 }
            r9 = 5
            if (r2 != 0) goto L_0x04c8
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x09e0 }
            java.lang.String r2 = "unable to send media; was not eligible for encryption but must be encrypted; request="
            X.C36321k7.A1J(r6, r2, r3)     // Catch:{ all -> 0x09e0 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x09e0 }
            goto L_0x0948
        L_0x04c8:
            X.C18740tg.A06(r34)     // Catch:{ all -> 0x09e0 }
            boolean r11 = r0.A0L()     // Catch:{ all -> 0x09e0 }
            r9 = r40
            r2 = r34
            java.lang.String r2 = r10.A07(r9, r2, r11)     // Catch:{ all -> 0x09e0 }
            if (r2 == 0) goto L_0x04dd
            monitor-enter(r5)     // Catch:{ all -> 0x09e0 }
            r5.A0B = r2     // Catch:{ all -> 0x09dd }
            monitor-exit(r5)     // Catch:{ all -> 0x09e0 }
        L_0x04dd:
            X.6Rx r13 = r3.A00     // Catch:{ all -> 0x09e0 }
            if (r13 == 0) goto L_0x04f6
            byte[] r11 = r13.A01     // Catch:{ all -> 0x09e0 }
        L_0x04e3:
            X.7gR r2 = r0.A0K     // Catch:{ all -> 0x09e0 }
            X.5tK r9 = r2.B5L(r11)     // Catch:{ all -> 0x09e0 }
            r2 = r26
            X.7gS r18 = r2.BBX(r11)     // Catch:{ all -> 0x09e0 }
            boolean r2 = r6.A02()     // Catch:{ all -> 0x09e0 }
            if (r2 == 0) goto L_0x0513
            goto L_0x04f9
        L_0x04f6:
            byte[] r11 = A0k     // Catch:{ all -> 0x09e0 }
            goto L_0x04e3
        L_0x04f9:
            if (r13 != 0) goto L_0x0503
            r2 = 30
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x09e0 }
            goto L_0x0948
        L_0x0503:
            byte[] r12 = r9.A00     // Catch:{ all -> 0x09e0 }
            byte[] r11 = r9.A02     // Catch:{ all -> 0x09e0 }
            byte[] r2 = r9.A01     // Catch:{ all -> 0x09e0 }
            monitor-enter(r5)     // Catch:{ all -> 0x09e0 }
            r5.A00 = r13     // Catch:{ all -> 0x09dd }
            r5.A0I = r12     // Catch:{ all -> 0x09dd }
            r5.A0K = r11     // Catch:{ all -> 0x09dd }
            r5.A0L = r2     // Catch:{ all -> 0x09dd }
            monitor-exit(r5)     // Catch:{ all -> 0x09e0 }
        L_0x0513:
            r0.A0G()     // Catch:{ all -> 0x09e0 }
            X.3Ot r11 = r6.A03     // Catch:{ all -> 0x09e0 }
            boolean r2 = r11.A02     // Catch:{ all -> 0x09e0 }
            if (r2 == 0) goto L_0x0521
            boolean r11 = r11.A01     // Catch:{ all -> 0x09e0 }
            r2 = 1
            if (r11 == 0) goto L_0x0522
        L_0x0521:
            r2 = 0
        L_0x0522:
            if (r2 == 0) goto L_0x0525
            goto L_0x0527
        L_0x0525:
            r12 = 0
            goto L_0x0529
        L_0x0527:
            java.lang.String r12 = "status"
        L_0x0529:
            r2 = r42
            java.lang.String r11 = r2.A0D     // Catch:{ all -> 0x09e0 }
            r16 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r11 == 0) goto L_0x0551
            java.util.UUID r2 = java.util.UUID.fromString(r11)     // Catch:{ all -> 0x09e0 }
            long r13 = r2.getMostSignificantBits()     // Catch:{ all -> 0x09e0 }
            long r13 = r13 & r16
            java.lang.Long r13 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x09e0 }
        L_0x0542:
            X.1E1 r14 = r0.A0U     // Catch:{ all -> 0x09e0 }
            java.util.List r2 = r1.A0B     // Catch:{ all -> 0x09e0 }
            java.util.List r2 = r14.A00(r2)     // Catch:{ all -> 0x09e0 }
            boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x09e0 }
            if (r2 != 0) goto L_0x0556
            goto L_0x0553
        L_0x0551:
            r13 = 0
            goto L_0x0542
        L_0x0553:
            if (r11 == 0) goto L_0x0556
            goto L_0x0558
        L_0x0556:
            r11 = 0
            goto L_0x0566
        L_0x0558:
            java.util.UUID r2 = java.util.UUID.fromString(r11)     // Catch:{ all -> 0x09e0 }
            long r14 = r2.getLeastSignificantBits()     // Catch:{ all -> 0x09e0 }
            long r14 = r14 & r16
            java.lang.Long r11 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x09e0 }
        L_0x0566:
            boolean r2 = r6.A02()     // Catch:{ all -> 0x09e0 }
            if (r2 == 0) goto L_0x05a4
            java.lang.String r2 = r0.A03     // Catch:{ all -> 0x09e0 }
            r15 = r2
        L_0x056f:
            X.685 r14 = new X.685     // Catch:{ all -> 0x09e0 }
            r14.<init>()     // Catch:{ all -> 0x09e0 }
            java.lang.String r2 = r1.A0A     // Catch:{ all -> 0x09e0 }
            r14.A06 = r2     // Catch:{ all -> 0x09e0 }
            X.1GH r2 = r0.A0S     // Catch:{ all -> 0x09e0 }
            r14.A01 = r2     // Catch:{ all -> 0x09e0 }
            r14.A08 = r15     // Catch:{ all -> 0x09e0 }
            r2 = r31
            r14.A07 = r2     // Catch:{ all -> 0x09e0 }
            boolean r2 = r0.A0L()     // Catch:{ all -> 0x09e0 }
            r14.A0A = r2     // Catch:{ all -> 0x09e0 }
            r14.A09 = r12     // Catch:{ all -> 0x09e0 }
            r14.A02 = r13     // Catch:{ all -> 0x09e0 }
            r14.A03 = r11     // Catch:{ all -> 0x09e0 }
            boolean r2 = r1.A0G     // Catch:{ all -> 0x09e0 }
            r14.A0B = r2     // Catch:{ all -> 0x09e0 }
            X.5JZ r17 = r14.A01()     // Catch:{ all -> 0x09e0 }
            r2 = r17
            r0.A02 = r2     // Catch:{ all -> 0x09e0 }
            r0.A0G()     // Catch:{ all -> 0x09e0 }
            r2 = 6
            android.net.TrafficStats.setThreadStatsTag(r2)     // Catch:{ all -> 0x09e0 }
            boolean r2 = r3.A01     // Catch:{ all -> 0x09e0 }
            goto L_0x05a7
        L_0x05a4:
            r15 = r35
            goto L_0x056f
        L_0x05a7:
            if (r2 == 0) goto L_0x05af
            r2 = 0
            r0.A00 = r2     // Catch:{ all -> 0x09e0 }
            r11 = 0
            goto L_0x05de
        L_0x05af:
            java.lang.String r11 = r0.A03     // Catch:{ all -> 0x09e0 }
            r3 = r20
            r2 = r17
            X.5xC r11 = A01(r3, r0, r2, r11)     // Catch:{ all -> 0x09e0 }
            X.5ta r2 = r11.A02     // Catch:{ all -> 0x09e0 }
            r8.A01 = r2     // Catch:{ all -> 0x09e0 }
            X.1D8 r3 = r0.A0R     // Catch:{ all -> 0x09e0 }
            java.lang.String r2 = r11.A03     // Catch:{ all -> 0x09e0 }
            java.lang.String r2 = r3.A00(r2, r4)     // Catch:{ all -> 0x09e0 }
            r5.A08(r2)     // Catch:{ all -> 0x09e0 }
            java.lang.String r2 = r11.A04     // Catch:{ all -> 0x09e0 }
            r5.A0B(r2)     // Catch:{ all -> 0x09e0 }
            int r2 = r11.A01     // Catch:{ all -> 0x09e0 }
            if (r2 == 0) goto L_0x05d7
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x09e0 }
            goto L_0x0948
        L_0x05d7:
            int r2 = r11.A00     // Catch:{ all -> 0x09e0 }
            long r2 = (long) r2     // Catch:{ all -> 0x09e0 }
            r0.A00 = r2     // Catch:{ all -> 0x09e0 }
            boolean r11 = r11.A05     // Catch:{ all -> 0x09e0 }
        L_0x05de:
            r0.A0G()     // Catch:{ all -> 0x09e0 }
            X.0wg r3 = r0.A0d     // Catch:{ all -> 0x09e0 }
            X.0y0 r2 = r0.A08     // Catch:{ all -> 0x09e0 }
            X.AnonymousClass1GW.A0P(r2, r3)     // Catch:{ all -> 0x09e0 }
            r0.A0J()     // Catch:{ all -> 0x09e0 }
            if (r11 == 0) goto L_0x06a1
            boolean r2 = A04(r0)     // Catch:{ all -> 0x09e0 }
            if (r2 == 0) goto L_0x0696
            X.1DF r11 = r0.A0M     // Catch:{ all -> 0x09e0 }
            java.lang.String r7 = r0.A03     // Catch:{ all -> 0x09e0 }
            X.6Rx r2 = r5.A00()     // Catch:{ all -> 0x09e0 }
            X.C18740tg.A06(r2)     // Catch:{ all -> 0x09e0 }
            byte[] r3 = r2.A01     // Catch:{ all -> 0x09e0 }
            r2 = r35
            X.3Qa r4 = r11.A0A(r2, r7, r3, r4)     // Catch:{ all -> 0x09e0 }
            if (r4 == 0) goto L_0x060f
            X.1GF r2 = r0.A0N     // Catch:{ all -> 0x09e0 }
            X.5r3 r3 = r2.A00(r4)     // Catch:{ all -> 0x09e0 }
            goto L_0x0610
        L_0x060f:
            r3 = 0
        L_0x0610:
            if (r3 == 0) goto L_0x0636
            byte[] r2 = r3.A00     // Catch:{ all -> 0x09e0 }
            if (r2 == 0) goto L_0x0636
            int r2 = r2.length     // Catch:{ all -> 0x09e0 }
            if (r2 <= 0) goto L_0x0636
            monitor-enter(r5)     // Catch:{ all -> 0x09e0 }
            r5.A02 = r3     // Catch:{ all -> 0x09dd }
            monitor-exit(r5)     // Catch:{ all -> 0x09e0 }
            int[] r2 = r3.A01     // Catch:{ all -> 0x09e0 }
            if (r2 == 0) goto L_0x0696
            X.1A1 r2 = r10.A03     // Catch:{ all -> 0x09e0 }
            X.3T1 r2 = r2.A03(r4)     // Catch:{ all -> 0x09e0 }
            X.2bU r2 = (X.AnonymousClass2bU) r2     // Catch:{ all -> 0x09e0 }
            if (r2 == 0) goto L_0x0696
            X.3Qj r2 = X.AnonymousClass2bU.A00(r2)     // Catch:{ all -> 0x09e0 }
            java.lang.String r2 = r2.A0O     // Catch:{ all -> 0x09e0 }
            monitor-enter(r5)     // Catch:{ all -> 0x09e0 }
            r5.A0D = r2     // Catch:{ all -> 0x09dd }
            monitor-exit(r5)     // Catch:{ all -> 0x09e0 }
            goto L_0x0696
        L_0x0636:
            int[] r11 = r1.A0H     // Catch:{ all -> 0x09e0 }
            if (r11 == 0) goto L_0x0674
            int r2 = r11.length     // Catch:{ all -> 0x09e0 }
            if (r2 <= 0) goto L_0x0674
            X.C18740tg.A06(r34)     // Catch:{ all -> 0x09e0 }
            r3 = r18
            r2 = r34
            X.71q r4 = r10.A04(r3, r2, r11)     // Catch:{ all -> 0x09e0 }
            X.5Qv r2 = r4.A01     // Catch:{ all -> 0x0690 }
            X.54M r7 = new X.54M     // Catch:{ IOException -> 0x066d }
            r7.<init>(r9, r2, r11)     // Catch:{ IOException -> 0x066d }
            r2 = 8192(0x2000, float:1.14794E-41)
            byte[] r3 = new byte[r2]     // Catch:{ all -> 0x0663 }
        L_0x0653:
            int r2 = r7.read(r3)     // Catch:{ all -> 0x0663 }
            if (r2 >= 0) goto L_0x0653
            X.60s r12 = r7.A04     // Catch:{ all -> 0x0663 }
            r7.close()     // Catch:{ IOException -> 0x066d }
            X.5vC r11 = r4.A00()     // Catch:{ all -> 0x0690 }
            goto L_0x0699
        L_0x0663:
            r2 = move-exception
            r7.close()     // Catch:{ all -> 0x0668 }
            goto L_0x066c
        L_0x0668:
            r1 = move-exception
            r2.addSuppressed(r1)     // Catch:{ IOException -> 0x066d }
        L_0x066c:
            throw r2     // Catch:{ IOException -> 0x066d }
        L_0x066d:
            r2 = move-exception
            java.lang.String r1 = "mediaupload/calculate-sidecar/ioexception"
            com.whatsapp.util.Log.e(r1, r2)     // Catch:{ all -> 0x0690 }
            throw r2     // Catch:{ all -> 0x0690 }
        L_0x0674:
            X.C18740tg.A06(r34)     // Catch:{ all -> 0x09e0 }
            r2 = r34
            java.io.InputStream r3 = X.AnonymousClass1D9.A02(r6, r10, r2)     // Catch:{ all -> 0x09e0 }
            r2 = r18
            X.71q r4 = r10.A05(r2, r3)     // Catch:{ all -> 0x09e0 }
            X.5Qv r3 = r4.A01     // Catch:{ all -> 0x0690 }
            r2 = 65536(0x10000, float:9.18355E-41)
            X.60s r12 = X.AnonymousClass1D9.A01(r9, r3, r2)     // Catch:{ all -> 0x0690 }
            X.5vC r11 = r4.A00()     // Catch:{ all -> 0x0690 }
            goto L_0x0699
        L_0x0690:
            r2 = move-exception
            r4.close()     // Catch:{ all -> 0x08eb }
            goto L_0x09dc
        L_0x0696:
            r11 = 0
            r12 = 0
            goto L_0x069c
        L_0x0699:
            r4.close()     // Catch:{ all -> 0x09e0 }
        L_0x069c:
            r2 = 1
            r0.A05 = r2     // Catch:{ all -> 0x09e0 }
            goto L_0x084a
        L_0x06a1:
            boolean r2 = r0.A0h     // Catch:{ all -> 0x09e0 }
            if (r2 == 0) goto L_0x06ad
            r2 = 1
            r0.A0j = r2     // Catch:{ all -> 0x09e0 }
            X.7hU r2 = r0.A0e     // Catch:{ all -> 0x09e0 }
            r7.registerObserver(r2)     // Catch:{ all -> 0x09e0 }
        L_0x06ad:
            X.1GI r14 = r0.A0Z     // Catch:{ all -> 0x09e0 }
            java.lang.String r31 = r6.toString()     // Catch:{ all -> 0x09e0 }
            java.util.concurrent.atomic.AtomicReference r2 = r0.A04     // Catch:{ all -> 0x09e0 }
            r32 = r2
            int[] r13 = r1.A0H     // Catch:{ all -> 0x09e0 }
            X.0yC r12 = r14.A02     // Catch:{ all -> 0x09e0 }
            X.1BW r11 = r14.A01     // Catch:{ all -> 0x09e0 }
            X.1BX r7 = r14.A05     // Catch:{ all -> 0x09e0 }
            X.1BU r4 = r14.A04     // Catch:{ all -> 0x09e0 }
            X.1GE r3 = r14.A03     // Catch:{ all -> 0x09e0 }
            X.17Z r2 = r14.A00     // Catch:{ all -> 0x09e0 }
            X.5z3 r22 = new X.5z3     // Catch:{ all -> 0x09e0 }
            r23 = r2
            r24 = r11
            r25 = r12
            r26 = r3
            r27 = r4
            r28 = r0
            r29 = r8
            r30 = r7
            r33 = r13
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)     // Catch:{ all -> 0x09e0 }
            X.6vY r3 = new X.6vY     // Catch:{ all -> 0x09e0 }
            r11 = r3
            r12 = r9
            r13 = r18
            r14 = r20
            r15 = r0
            r16 = r22
            r11.<init>(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x09e0 }
            java.lang.Object r7 = r14.A00(r3)     // Catch:{ all -> 0x09e0 }
            X.5xo r7 = (X.C124235xo) r7     // Catch:{ all -> 0x09e0 }
            if (r7 != 0) goto L_0x06ff
            java.lang.String r2 = "mediaupload/failed-network; no routes to upload"
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ all -> 0x09e0 }
            r2 = 33
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x09e0 }
            goto L_0x0948
        L_0x06ff:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x09e0 }
            java.lang.String r2 = "mediaupload/transfer completed; result = "
            r3.append(r2)     // Catch:{ all -> 0x09e0 }
            int r4 = r7.A06     // Catch:{ all -> 0x09e0 }
            java.lang.String r2 = X.AnonymousClass6H7.A00(r4)     // Catch:{ all -> 0x09e0 }
            r3.append(r2)     // Catch:{ all -> 0x09e0 }
            java.lang.String r2 = "; cancelled = "
            r3.append(r2)     // Catch:{ all -> 0x09e0 }
            java.util.concurrent.FutureTask r2 = r0.A02     // Catch:{ all -> 0x09e0 }
            r22 = r2
            boolean r2 = r22.isCancelled()     // Catch:{ all -> 0x09e0 }
            X.C36331k8.A1S(r3, r2)     // Catch:{ all -> 0x09e0 }
            r11 = 17
            if (r4 != r11) goto L_0x0734
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x09e0 }
            java.lang.String r2 = "mediaupload/failed-network; request="
            X.C36321k7.A1J(r6, r2, r3)     // Catch:{ all -> 0x09e0 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x09e0 }
            goto L_0x0948
        L_0x0734:
            X.5vC r11 = r7.A02     // Catch:{ all -> 0x09e0 }
            X.5tY r2 = r7.A01     // Catch:{ all -> 0x09e0 }
            if (r2 == 0) goto L_0x073d
            X.60s r12 = r2.A00     // Catch:{ all -> 0x09e0 }
            goto L_0x073e
        L_0x073d:
            r12 = 0
        L_0x073e:
            if (r21 == 0) goto L_0x079c
            r3 = r0
            X.5C5 r3 = (X.AnonymousClass5C5) r3     // Catch:{ all -> 0x09e0 }
            X.6Pj r2 = r3.A0V     // Catch:{ all -> 0x09e0 }
            r14 = r2
            r2 = r14
            X.5BQ r2 = (X.AnonymousClass5BQ) r2     // Catch:{ all -> 0x09e0 }
            r21 = r2
            boolean r2 = r2.A01     // Catch:{ all -> 0x09e0 }
            r13 = r2
            java.lang.String r2 = "Cannot calculate final hash before recording finished"
            X.C18740tg.A0D(r13, r2)     // Catch:{ all -> 0x09e0 }
            java.lang.String r13 = r3.A00     // Catch:{ all -> 0x09e0 }
            if (r13 != 0) goto L_0x079e
            X.1D9 r2 = r3.A0a     // Catch:{ all -> 0x09e0 }
            r13 = r2
            X.5z9 r2 = r14.A02     // Catch:{ all -> 0x09e0 }
            java.io.File r2 = r2.A07     // Catch:{ all -> 0x09e0 }
            X.C18740tg.A06(r2)     // Catch:{ all -> 0x09e0 }
            r15 = r18
            r14 = r13
            r13 = r2
            r2 = r21
            X.71q r16 = r14.A03(r15, r2, r13)     // Catch:{ all -> 0x09e0 }
            r2 = 16384(0x4000, float:2.2959E-41)
            byte[] r13 = new byte[r2]     // Catch:{ all -> 0x0796 }
        L_0x076f:
            r2 = r16
            X.5Qv r2 = r2.A01     // Catch:{ IOException -> 0x077a }
            int r2 = r2.read(r13)     // Catch:{ IOException -> 0x077a }
            if (r2 < 0) goto L_0x078a
            goto L_0x076f
        L_0x077a:
            r15 = move-exception
            java.lang.StringBuilder r14 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0796 }
            java.lang.String r13 = "IOException while computing ciphertext sha-256; skipping duplicate detection; request="
            r2 = r21
            java.lang.String r13 = X.AnonymousClass000.A0l(r2, r13, r14)     // Catch:{ all -> 0x0796 }
            com.whatsapp.util.Log.w(r13, r15)     // Catch:{ all -> 0x0796 }
        L_0x078a:
            X.5vC r2 = r16.A00()     // Catch:{ all -> 0x0796 }
            java.lang.String r13 = r2.A00     // Catch:{ all -> 0x0796 }
            r16.close()     // Catch:{ all -> 0x09e0 }
            r3.A00 = r13     // Catch:{ all -> 0x09e0 }
            goto L_0x079e
        L_0x0796:
            r2 = move-exception
            r16.close()     // Catch:{ all -> 0x08eb }
            goto L_0x09dc
        L_0x079c:
            java.lang.String r13 = r0.A03     // Catch:{ all -> 0x09e0 }
        L_0x079e:
            if (r13 != 0) goto L_0x07ae
            boolean r2 = r6.A02()     // Catch:{ all -> 0x09e0 }
            if (r2 == 0) goto L_0x07ae
            r2 = 37
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x09e0 }
            goto L_0x0948
        L_0x07ae:
            X.5xN r2 = r7.A03     // Catch:{ all -> 0x09e0 }
            if (r2 == 0) goto L_0x07ec
            java.lang.String r2 = r2.A05     // Catch:{ all -> 0x09e0 }
            r5.A0B(r2)     // Catch:{ all -> 0x09e0 }
            X.5xN r2 = r7.A03     // Catch:{ all -> 0x09e0 }
            java.lang.String r2 = r2.A02     // Catch:{ all -> 0x09e0 }
            monitor-enter(r5)     // Catch:{ all -> 0x09e0 }
            r5.A07 = r2     // Catch:{ all -> 0x09dd }
            monitor-exit(r5)     // Catch:{ all -> 0x09e0 }
            X.1D8 r14 = r0.A0R     // Catch:{ all -> 0x09e0 }
            X.5xN r2 = r7.A03     // Catch:{ all -> 0x09e0 }
            java.lang.String r3 = r2.A00     // Catch:{ all -> 0x09e0 }
            r2 = 1
            java.lang.String r2 = r14.A00(r3, r2)     // Catch:{ all -> 0x09e0 }
            r5.A08(r2)     // Catch:{ all -> 0x09e0 }
            r5.A09(r13)     // Catch:{ all -> 0x09e0 }
            X.5xN r2 = r7.A03     // Catch:{ all -> 0x09e0 }
            java.lang.String r2 = r2.A03     // Catch:{ all -> 0x09e0 }
            monitor-enter(r5)     // Catch:{ all -> 0x09e0 }
            r5.A0A = r2     // Catch:{ all -> 0x09dd }
            monitor-exit(r5)     // Catch:{ all -> 0x09e0 }
            X.5xN r2 = r7.A03     // Catch:{ all -> 0x09e0 }
            java.lang.String r2 = r2.A01     // Catch:{ all -> 0x09e0 }
            monitor-enter(r5)     // Catch:{ all -> 0x09e0 }
            r5.A06 = r2     // Catch:{ all -> 0x09dd }
            monitor-exit(r5)     // Catch:{ all -> 0x09e0 }
            X.5xN r2 = r7.A03     // Catch:{ all -> 0x09e0 }
            java.lang.String r2 = r2.A04     // Catch:{ all -> 0x09e0 }
            monitor-enter(r5)     // Catch:{ all -> 0x09e0 }
            r5.A0E = r2     // Catch:{ all -> 0x09dd }
            monitor-exit(r5)     // Catch:{ all -> 0x09e0 }
            boolean r2 = r7.A04     // Catch:{ all -> 0x09e0 }
            r0.A05 = r2     // Catch:{ all -> 0x09e0 }
        L_0x07ec:
            boolean r2 = r0.A0L()     // Catch:{ all -> 0x09e0 }
            if (r2 == 0) goto L_0x084b
            java.lang.Object r2 = r32.get()     // Catch:{ all -> 0x09e0 }
            if (r2 == 0) goto L_0x084b
            X.C18740tg.A06(r34)     // Catch:{ all -> 0x09e0 }
            java.lang.String r2 = X.AnonymousClass6UG.A00(r34)     // Catch:{ all -> 0x09e0 }
            r5.A0A(r2)     // Catch:{ all -> 0x09e0 }
            if (r4 != 0) goto L_0x084b
            boolean r2 = r22.isCancelled()     // Catch:{ all -> 0x09e0 }
            if (r2 != 0) goto L_0x084b
            java.lang.String r2 = "MediaUpload/call Sending streaming finalize request"
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ all -> 0x09e0 }
            X.5tb r7 = r0.A0c     // Catch:{ all -> 0x09e0 }
            X.6vX r3 = new X.6vX     // Catch:{ all -> 0x09e0 }
            r2 = r17
            r3.<init>(r7, r2, r13)     // Catch:{ all -> 0x09e0 }
            r2 = r20
            java.lang.Object r3 = r2.A00(r3)     // Catch:{ all -> 0x09e0 }
            X.5wN r3 = (X.C123365wN) r3     // Catch:{ all -> 0x09e0 }
            if (r3 != 0) goto L_0x0827
            X.5wN r3 = new X.5wN     // Catch:{ all -> 0x09e0 }
            r3.<init>()     // Catch:{ all -> 0x09e0 }
        L_0x0827:
            X.5wM r2 = r3.A01     // Catch:{ all -> 0x09e0 }
            r8.A00 = r2     // Catch:{ all -> 0x09e0 }
            boolean r2 = r3.A04     // Catch:{ all -> 0x09e0 }
            if (r2 == 0) goto L_0x0844
            java.lang.String r2 = r3.A03     // Catch:{ all -> 0x09e0 }
            r5.A0B(r2)     // Catch:{ all -> 0x09e0 }
            X.1D8 r7 = r0.A0R     // Catch:{ all -> 0x09e0 }
            java.lang.String r3 = r3.A02     // Catch:{ all -> 0x09e0 }
            r2 = 1
            java.lang.String r2 = r7.A00(r3, r2)     // Catch:{ all -> 0x09e0 }
            r5.A08(r2)     // Catch:{ all -> 0x09e0 }
            r5.A09(r13)     // Catch:{ all -> 0x09e0 }
            goto L_0x084b
        L_0x0844:
            java.lang.Integer r4 = X.C36421kH.A0U()     // Catch:{ all -> 0x09e0 }
            goto L_0x0948
        L_0x084a:
            r4 = 0
        L_0x084b:
            if (r4 != 0) goto L_0x08a9
            if (r11 == 0) goto L_0x08a9
            java.lang.String r3 = r11.A00     // Catch:{ all -> 0x09e0 }
            r2 = r36
            boolean r2 = r2.A00     // Catch:{ all -> 0x09e0 }
            if (r2 == 0) goto L_0x0869
            java.lang.String r2 = r0.A03     // Catch:{ all -> 0x09e0 }
            boolean r2 = r3.equals(r2)     // Catch:{ all -> 0x09e0 }
            if (r2 != 0) goto L_0x0869
            java.lang.String r2 = "mediaupload/optimistic-hash-fail"
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ all -> 0x09e0 }
            r5.A09(r3)     // Catch:{ all -> 0x09e0 }
            r7 = 1
            goto L_0x086a
        L_0x0869:
            r7 = 0
        L_0x086a:
            java.lang.String r3 = r11.A02     // Catch:{ all -> 0x09e0 }
            if (r19 == 0) goto L_0x087f
            r2 = r35
            boolean r2 = r3.equals(r2)     // Catch:{ all -> 0x09e0 }
            if (r2 != 0) goto L_0x087f
            java.lang.String r2 = "mediaupload/optimistic-plaintext-hash-fail"
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ all -> 0x09e0 }
            r5.A0A(r3)     // Catch:{ all -> 0x09e0 }
            r7 = 1
        L_0x087f:
            if (r7 == 0) goto L_0x0887
            java.lang.Integer r4 = X.C36431kI.A12()     // Catch:{ all -> 0x09e0 }
            goto L_0x0948
        L_0x0887:
            boolean r2 = A04(r0)     // Catch:{ all -> 0x09e0 }
            if (r2 == 0) goto L_0x08a3
            if (r12 == 0) goto L_0x08a3
            byte[] r7 = r12.A00()     // Catch:{ all -> 0x09e0 }
            if (r7 == 0) goto L_0x08a3
            int r2 = r7.length     // Catch:{ all -> 0x09e0 }
            if (r2 <= 0) goto L_0x08a3
            int[] r3 = r1.A0H     // Catch:{ all -> 0x09e0 }
            X.5r3 r2 = new X.5r3     // Catch:{ all -> 0x09e0 }
            r2.<init>(r7, r3)     // Catch:{ all -> 0x09e0 }
            monitor-enter(r5)     // Catch:{ all -> 0x09e0 }
            r5.A02 = r2     // Catch:{ all -> 0x09dd }
            monitor-exit(r5)     // Catch:{ all -> 0x09e0 }
        L_0x08a3:
            java.lang.String r2 = r11.A01     // Catch:{ all -> 0x09e0 }
            monitor-enter(r5)     // Catch:{ all -> 0x09e0 }
            r5.A0D = r2     // Catch:{ all -> 0x09dd }
            monitor-exit(r5)     // Catch:{ all -> 0x09e0 }
        L_0x08a9:
            int r3 = r1.A00     // Catch:{ all -> 0x09e0 }
            if (r3 <= 0) goto L_0x08f1
            boolean r2 = X.AnonymousClass6Y1.A07(r40)     // Catch:{ all -> 0x09e0 }
            if (r2 == 0) goto L_0x08f1
            X.C18740tg.A06(r34)     // Catch:{ all -> 0x09e0 }
            long r2 = (long) r3     // Catch:{ all -> 0x09e0 }
            r11 = 15
            long r2 = r2 + r11
            r11 = 16
            long r2 = r2 / r11
            long r2 = r2 * r11
            int r7 = (int) r2     // Catch:{ all -> 0x09e0 }
            r2 = r34
            java.io.InputStream r3 = X.AnonymousClass1D9.A02(r6, r10, r2)     // Catch:{ all -> 0x09e0 }
            r2 = r18
            X.71q r11 = r10.A05(r2, r3)     // Catch:{ all -> 0x09e0 }
            X.5Qv r10 = r11.A01     // Catch:{ all -> 0x08e5 }
            long r2 = (long) r7     // Catch:{ all -> 0x08e5 }
            X.5RB r6 = new X.5RB     // Catch:{ all -> 0x08e5 }
            r6.<init>(r10, r2)     // Catch:{ all -> 0x08e5 }
            X.60s r2 = X.AnonymousClass1D9.A01(r9, r6, r7)     // Catch:{ all -> 0x08e5 }
            byte[] r2 = r2.A00()     // Catch:{ all -> 0x08e5 }
            r11.close()     // Catch:{ all -> 0x09e0 }
            if (r2 == 0) goto L_0x08f1
            monitor-enter(r5)     // Catch:{ all -> 0x09e0 }
            r5.A0J = r2     // Catch:{ all -> 0x09dd }
            monitor-exit(r5)     // Catch:{ all -> 0x09e0 }
            goto L_0x08f1
        L_0x08e5:
            r2 = move-exception
            r11.close()     // Catch:{ all -> 0x08eb }
            goto L_0x09dc
        L_0x08eb:
            r1 = move-exception
            r2.addSuppressed(r1)     // Catch:{ all -> 0x09e0 }
            goto L_0x09dc
        L_0x08f1:
            r2 = 5
            if (r4 == r2) goto L_0x0908
            r2 = 21
            if (r4 == r2) goto L_0x0908
            r2 = 35
            if (r4 == r2) goto L_0x0908
            r2 = 36
            if (r4 == r2) goto L_0x0908
            r2 = 24
            if (r4 == r2) goto L_0x0908
            r2 = 34
            if (r4 != r2) goto L_0x090f
        L_0x0908:
            r2 = 0
            r5.A09(r2)     // Catch:{ all -> 0x09e0 }
            r5.A0A(r2)     // Catch:{ all -> 0x09e0 }
        L_0x090f:
            r0.A0G()     // Catch:{ all -> 0x09e0 }
            if (r4 != 0) goto L_0x0944
            java.lang.Long r10 = r8.A08     // Catch:{ all -> 0x09e0 }
            if (r10 == 0) goto L_0x0944
            java.lang.Long r3 = r8.A0F     // Catch:{ all -> 0x09e0 }
            if (r3 == 0) goto L_0x0931
            java.lang.Long r2 = r8.A0E     // Catch:{ all -> 0x09e0 }
            if (r2 == 0) goto L_0x0931
            long r6 = r2.longValue()     // Catch:{ all -> 0x09e0 }
            long r2 = r3.longValue()     // Catch:{ all -> 0x09e0 }
            int r9 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r9 <= 0) goto L_0x0931
            java.lang.Long r2 = X.C90504aG.A0h(r6, r2)     // Catch:{ all -> 0x09e0 }
            goto L_0x0932
        L_0x0931:
            r2 = 0
        L_0x0932:
            if (r2 == 0) goto L_0x0944
            long r12 = r10.longValue()     // Catch:{ all -> 0x09e0 }
            long r14 = r2.longValue()     // Catch:{ all -> 0x09e0 }
            r11 = 0
            r9 = r41
            r10 = r40
            r9.A02(r10, r11, r12, r14)     // Catch:{ all -> 0x09e0 }
        L_0x0944:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x09e0 }
        L_0x0948:
            android.net.TrafficStats.clearThreadStatsTag()
            java.io.File r3 = r1.A07
            X.C18740tg.A06(r3)
            long r1 = r3.length()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r8.A0C = r1
            goto L_0x096f
        L_0x095b:
            android.net.TrafficStats.clearThreadStatsTag()
            java.io.File r3 = r1.A07
            X.C18740tg.A06(r3)
            long r1 = r3.length()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r8.A0C = r1
            X.6Fj r5 = r0.A0X
        L_0x096f:
            java.lang.Integer r1 = r5.A01()
            if (r1 == 0) goto L_0x09a0
            java.lang.Integer r1 = r5.A02()
            if (r1 == 0) goto L_0x09a0
            java.lang.Integer r1 = r5.A01()
            java.lang.Long r1 = X.C90484aE.A0h(r1)
            r8.A0B = r1
            java.lang.Integer r1 = r5.A02()
        L_0x0989:
            java.lang.Long r1 = X.C90484aE.A0h(r1)
            r8.A0D = r1
        L_0x098f:
            X.620 r0 = r0.A01
            if (r0 == 0) goto L_0x099f
            java.util.concurrent.atomic.AtomicInteger r0 = r0.A01
            int r0 = r0.get()
            java.lang.Long r0 = X.C36441kJ.A0y(r0)
            r8.A0G = r0
        L_0x099f:
            return r4
        L_0x09a0:
            boolean r1 = X.AnonymousClass6Y1.A04(r40)
            if (r1 == 0) goto L_0x098f
            X.C18740tg.A06(r3)
            android.util.Pair r2 = X.AnonymousClass1GW.A0B(r3)
            int r1 = X.C36381kD.A04(r2)
            java.lang.Long r1 = X.C36441kJ.A0y(r1)
            r8.A0B = r1
            java.lang.Object r1 = r2.second
            java.lang.Number r1 = (java.lang.Number) r1
            goto L_0x0989
        L_0x09bc:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x09e0 }
            java.lang.String r1 = "mediaupload/hash-calculate/file not found; message.key="
            X.C36321k7.A1P(r1, r12, r2)     // Catch:{ all -> 0x09e0 }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x09e0 }
            java.lang.String r1 = "File not found: "
            r2.append(r1)     // Catch:{ all -> 0x09e0 }
            X.C18740tg.A06(r3)     // Catch:{ all -> 0x09e0 }
            java.lang.String r1 = X.AnonymousClass000.A0o(r3, r2)     // Catch:{ all -> 0x09e0 }
            java.io.FileNotFoundException r2 = X.C90524aI.A0V(r1)     // Catch:{ all -> 0x09e0 }
            goto L_0x09dc
        L_0x09da:
            r2 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x09e0 }
        L_0x09dc:
            throw r2     // Catch:{ all -> 0x09e0 }
        L_0x09dd:
            r1 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x09e0 }
            throw r1     // Catch:{ all -> 0x09e0 }
        L_0x09e0:
            r6 = move-exception
            android.net.TrafficStats.clearThreadStatsTag()
            X.5zK r3 = r0.A0Y
            X.6Pj r1 = r0.A0V
            X.5z9 r5 = r1.A02
            java.io.File r4 = r5.A07
            X.C18740tg.A06(r4)
            long r1 = r4.length()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r3.A0C = r1
            X.6Fj r2 = r0.A0X
            java.lang.Integer r1 = r2.A01()
            if (r1 == 0) goto L_0x0a2c
            java.lang.Integer r1 = r2.A02()
            if (r1 == 0) goto L_0x0a2c
            java.lang.Integer r1 = r2.A01()
            java.lang.Long r1 = X.C90484aE.A0h(r1)
            r3.A0B = r1
            java.lang.Integer r1 = r2.A02()
        L_0x0a15:
            java.lang.Long r1 = X.C90484aE.A0h(r1)
            r3.A0D = r1
        L_0x0a1b:
            X.620 r0 = r0.A01
            if (r0 == 0) goto L_0x0a2b
            java.util.concurrent.atomic.AtomicInteger r0 = r0.A01
            int r0 = r0.get()
            java.lang.Long r0 = X.C36441kJ.A0y(r0)
            r3.A0G = r0
        L_0x0a2b:
            throw r6
        L_0x0a2c:
            X.1Gl r1 = r5.A06
            boolean r1 = X.AnonymousClass6Y1.A04(r1)
            if (r1 == 0) goto L_0x0a1b
            X.C18740tg.A06(r4)
            android.util.Pair r2 = X.AnonymousClass1GW.A0B(r4)
            int r1 = X.C36381kD.A04(r2)
            java.lang.Long r1 = X.C36441kJ.A0y(r1)
            r3.A0B = r1
            java.lang.Object r1 = r2.second
            java.lang.Number r1 = (java.lang.Number) r1
            goto L_0x0a15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C101314xL.A0I():java.lang.Integer");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003a, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003b, code lost:
        com.whatsapp.util.Log.w("MMS upload unable to get video meta", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0J() {
        /*
            r3 = this;
            X.6Pj r0 = r3.A0V
            X.5z9 r1 = r0.A02
            X.1Gl r0 = r1.A06
            boolean r0 = X.AnonymousClass6Y1.A09(r0)
            if (r0 == 0) goto L_0x0040
            java.io.File r0 = r1.A07     // Catch:{ 1GL -> 0x003a }
            X.C18740tg.A06(r0)     // Catch:{ 1GL -> 0x003a }
            X.67y r1 = new X.67y     // Catch:{ 1GL -> 0x003a }
            r1.<init>(r0)     // Catch:{ 1GL -> 0x003a }
            boolean r0 = r1.A02()     // Catch:{ 1GL -> 0x003a }
            if (r0 == 0) goto L_0x0024
            int r2 = r1.A00     // Catch:{ 1GL -> 0x003a }
            int r0 = r1.A02     // Catch:{ 1GL -> 0x003a }
        L_0x0020:
            X.6Fj r1 = r3.A0X     // Catch:{ 1GL -> 0x003a }
            monitor-enter(r1)     // Catch:{ 1GL -> 0x003a }
            goto L_0x0029
        L_0x0024:
            int r2 = r1.A02     // Catch:{ 1GL -> 0x003a }
            int r0 = r1.A00     // Catch:{ 1GL -> 0x003a }
            goto L_0x0020
        L_0x0029:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0037 }
            r1.A03 = r0     // Catch:{ all -> 0x0037 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0037 }
            r1.A04 = r0     // Catch:{ all -> 0x0037 }
            monitor-exit(r1)     // Catch:{ 1GL -> 0x003a }
            return
        L_0x0037:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ 1GL -> 0x003a }
            throw r0     // Catch:{ 1GL -> 0x003a }
        L_0x003a:
            r1 = move-exception
            java.lang.String r0 = "MMS upload unable to get video meta"
            com.whatsapp.util.Log.w(r0, r1)
        L_0x0040:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C101314xL.A0J():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0050, code lost:
        if (r3 != 0) goto L_0x0052;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0K(long r6) {
        /*
            r5 = this;
            long r1 = r5.A0i
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0019
            X.0ww r4 = r5.A0B
            long r0 = r5.A0i
            long r2 = r6 - r0
            X.6Pj r0 = r5.A0V
            X.3Ot r0 = r0.A03
            boolean r1 = r0.A02
            r0 = 0
            if (r1 == 0) goto L_0x0016
            r0 = 4
        L_0x0016:
            r4.A06(r2, r0)
        L_0x0019:
            r5.A0i = r6
            X.5zK r2 = r5.A0Y
            long r0 = r5.A0i
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A08 = r0
            java.util.concurrent.FutureTask r0 = r5.A02
            boolean r0 = r0.isCancelled()
            if (r0 != 0) goto L_0x0061
            X.6Pj r1 = r5.A0V
            boolean r0 = r1 instanceof X.AnonymousClass5BQ
            if (r0 == 0) goto L_0x0066
            r0 = r1
            X.5BQ r0 = (X.AnonymousClass5BQ) r0
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x0062
            X.5z9 r0 = r1.A02
            java.io.File r1 = r0.A07
            X.C18740tg.A06(r1)
            boolean r0 = r1.exists()
            X.C18740tg.A0C(r0)
            long r3 = r1.length()
        L_0x004c:
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0057
        L_0x0052:
            r0 = 100
            long r6 = r6 * r0
            long r1 = r6 / r3
        L_0x0057:
            int r0 = (int) r1
            X.1Hk r1 = r5.A0G
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A04(r0)
        L_0x0061:
            return
        L_0x0062:
            r3 = 65536(0x10000, double:3.2379E-319)
            goto L_0x0052
        L_0x0066:
            X.5z9 r0 = r1.A02
            long r3 = r0.A03
            goto L_0x004c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C101314xL.A0K(long):void");
    }

    public boolean A0L() {
        if (this instanceof AnonymousClass5C5) {
            return C36371kC.A1W(this.A0V.A02.A06, C25471Gl.A0U);
        }
        return false;
    }

    public void cancel() {
        if (this.A04.get() != null && A0L()) {
            C18740tg.A06(this.A02);
            C1503074t.A00(this.A0g, this, 25);
        }
        super.cancel();
    }

    public void A0E() {
        super.A0E();
        this.A0C.A01();
        this.A0G.A01();
        this.A0H.A01();
        this.A0E.A01();
        this.A0D.A01();
    }

    public C131516Pj A0H() {
        return this.A0V;
    }
}
