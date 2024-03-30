package X;

import android.content.pm.Signature;
import java.util.Objects;

/* renamed from: X.1Vh  reason: invalid class name and case insensitive filesystem */
public class C29091Vh {
    public Signature A00;
    public String A01;
    public final C27661Pe A02;
    public final C19630wG A03;
    public final C29081Vg A04;
    public final C29051Vd A05;
    public final C19730wQ A06;
    public final C19600wD A07;
    public final C19990wq A08;
    public final C21060yb A09;
    public final C19420v0 A0A;
    public final C18820ts A0B;
    public final C25831Hv A0C;
    public final C20810yC A0D;
    public final AnonymousClass1MT A0E;
    public final C236919l A0F;
    public final C29071Vf A0G;
    public final C19890wg A0H;

    private int[] A00() {
        Objects.requireNonNull("2.24.6.77");
        String[] split = "2.24.6.77".split("\\.", 4);
        int length = split.length;
        if (length >= 3) {
            int[] iArr = new int[length];
            int i = 0;
            while (i < length) {
                try {
                    iArr[i] = Integer.parseInt(split[i]);
                    i++;
                } catch (NumberFormatException e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("non numeric portion of version name; VERSION_NAME=");
                    sb.append("2.24.6.77");
                    AssertionError assertionError = new AssertionError(sb.toString());
                    assertionError.initCause(e);
                    throw assertionError;
                }
            }
            return iArr;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("expected at least three parts in version name; VERSION_NAME=");
        sb2.append("2.24.6.77");
        throw new AssertionError(sb2.toString());
    }

    public C29091Vh(C19730wQ r2, C27661Pe r3, C19600wD r4, C19990wq r5, C21060yb r6, C19630wG r7, C19420v0 r8, C18820ts r9, C25831Hv r10, C20810yC r11, C29081Vg r12, C29051Vd r13, AnonymousClass1MT r14, C236919l r15, C29071Vf r16, C19890wg r17) {
        this.A03 = r7;
        this.A0D = r11;
        this.A06 = r2;
        this.A05 = r13;
        this.A0G = r16;
        this.A09 = r6;
        this.A0B = r9;
        this.A0F = r15;
        this.A0E = r14;
        this.A0A = r8;
        this.A08 = r5;
        this.A0C = r10;
        this.A0H = r17;
        this.A07 = r4;
        this.A02 = r3;
        this.A04 = r12;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public X.AnonymousClass8SR A01(X.C119555q3 r14, com.whatsapp.jid.UserJid r15, X.AnonymousClass1VM r16, int r17, int r18, long r19, boolean r21) {
        /*
            r13 = this;
            r7 = 1
            r12 = 0
            if (r15 != 0) goto L_0x0005
            r12 = 1
        L_0x0005:
            X.8SR r0 = X.AnonymousClass8SR.DEFAULT_INSTANCE
            X.8NN r4 = r0.A0p()
            if (r12 != 0) goto L_0x0045
            java.lang.String r0 = X.AnonymousClass3U8.A06(r15)     // Catch:{ NumberFormatException -> 0x0028 }
            X.C18740tg.A06(r0)     // Catch:{ NumberFormatException -> 0x0028 }
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x0028 }
            r4.A0S()     // Catch:{ NumberFormatException -> 0x0028 }
            X.8Hz r3 = r4.A00     // Catch:{ NumberFormatException -> 0x0028 }
            X.8SR r3 = (X.AnonymousClass8SR) r3     // Catch:{ NumberFormatException -> 0x0028 }
            int r2 = r3.bitField0_     // Catch:{ NumberFormatException -> 0x0028 }
            r2 = r2 | 1
            r3.bitField0_ = r2     // Catch:{ NumberFormatException -> 0x0028 }
            r3.username_ = r0     // Catch:{ NumberFormatException -> 0x0028 }
            goto L_0x0045
        L_0x0028:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "jid prefix not numeric; prefix="
            r1.append(r0)
            java.lang.String r0 = r15.user
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r1)
            r0.initCause(r2)
            throw r0
        L_0x0045:
            r4.A0S()
            X.8Hz r1 = r4.A00
            X.8SR r1 = (X.AnonymousClass8SR) r1
            int r0 = r1.bitField0_
            r0 = r0 | 2
            r1.bitField0_ = r0
            r0 = r21
            r1.passive_ = r0
            X.0wQ r5 = r13.A06
            X.0wh r0 = r5.A0A
            java.lang.String r2 = r0.A02()
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x0076
            r4.A0S()
            X.8Hz r1 = r4.A00
            X.8SR r1 = (X.AnonymousClass8SR) r1
            r2.getClass()
            int r0 = r1.bitField0_
            r0 = r0 | 16
            r1.bitField0_ = r0
            r1.pushName_ = r2
        L_0x0076:
            r4.A0S()
            X.8Hz r1 = r4.A00
            X.8SR r1 = (X.AnonymousClass8SR) r1
            int r0 = r1.bitField0_
            r0 = r0 | 32
            r1.bitField0_ = r0
            r0 = r17
            r1.sessionId_ = r0
            X.1MT r1 = r13.A0E
            boolean r3 = r1.A02()
            r4.A0S()
            X.8Hz r2 = r4.A00
            X.8SR r2 = (X.AnonymousClass8SR) r2
            int r0 = r2.bitField0_
            r0 = r0 | 64
            r2.bitField0_ = r0
            r2.shortConnect_ = r3
            boolean r0 = r5.A0L()
            if (r0 == 0) goto L_0x00be
            X.0wq r0 = r13.A08
            X.0wh r0 = r0.A01
            android.content.SharedPreferences r3 = r0.A01
            java.lang.String r2 = "registration_device_id"
            r0 = 0
            int r3 = r3.getInt(r2, r0)
            r4.A0S()
            X.8Hz r2 = r4.A00
            X.8SR r2 = (X.AnonymousClass8SR) r2
            int r0 = r2.bitField0_
            r0 = r0 | 2048(0x800, float:2.87E-42)
            r2.bitField0_ = r0
            r2.device_ = r3
        L_0x00be:
            X.8Hz r0 = r4.A00
            X.8SR r0 = (X.AnonymousClass8SR) r0
            X.8S6 r0 = r0.userAgent_
            if (r0 != 0) goto L_0x00c8
            X.8S6 r0 = X.AnonymousClass8S6.DEFAULT_INSTANCE
        L_0x00c8:
            X.8NN r8 = r0.A0q()
            X.2px r3 = X.C52652px.A01
            r8.A0S()
            X.8Hz r2 = r8.A00
            X.8S6 r2 = (X.AnonymousClass8S6) r2
            X.8S6 r0 = X.AnonymousClass8S6.DEFAULT_INSTANCE
            int r0 = r3.value
            r2.platform_ = r0
            int r0 = r2.bitField0_
            r0 = r0 | 1
            r2.bitField0_ = r0
            int[] r3 = r13.A00()
            X.8Hz r0 = r8.A00
            X.8S6 r0 = (X.AnonymousClass8S6) r0
            X.8RL r0 = r0.appVersion_
            if (r0 != 0) goto L_0x00ef
            X.8RL r0 = X.AnonymousClass8RL.DEFAULT_INSTANCE
        L_0x00ef:
            X.8NN r5 = r0.A0q()
            r0 = 0
            r6 = r3[r0]
            r5.A0S()
            X.8Hz r2 = r5.A00
            X.8RL r2 = (X.AnonymousClass8RL) r2
            X.8RL r0 = X.AnonymousClass8RL.DEFAULT_INSTANCE
            int r0 = r2.bitField0_
            r0 = r0 | 1
            r2.bitField0_ = r0
            r2.primary_ = r6
            r6 = r3[r7]
            r5.A0S()
            X.8Hz r2 = r5.A00
            X.8RL r2 = (X.AnonymousClass8RL) r2
            int r0 = r2.bitField0_
            r0 = r0 | 2
            r2.bitField0_ = r0
            r2.secondary_ = r6
            r0 = 2
            r6 = r3[r0]
            r5.A0S()
            X.8Hz r2 = r5.A00
            X.8RL r2 = (X.AnonymousClass8RL) r2
            int r0 = r2.bitField0_
            r0 = r0 | 4
            r2.bitField0_ = r0
            r2.tertiary_ = r6
            int r2 = r3.length
            r0 = 4
            if (r2 != r0) goto L_0x0140
            r0 = 3
            r3 = r3[r0]
            r5.A0S()
            X.8Hz r2 = r5.A00
            X.8RL r2 = (X.AnonymousClass8RL) r2
            int r0 = r2.bitField0_
            r0 = r0 | 8
            r2.bitField0_ = r0
            r2.quaternary_ = r3
        L_0x0140:
            r8.A0S()
            X.8Hz r2 = r8.A00
            X.8S6 r2 = (X.AnonymousClass8S6) r2
            X.8Hz r0 = r5.A0R()
            X.8RL r0 = (X.AnonymousClass8RL) r0
            r0.getClass()
            r2.appVersion_ = r0
            int r0 = r2.bitField0_
            r0 = r0 | 2
            r2.bitField0_ = r0
            X.0yb r5 = r13.A09
            android.telephony.TelephonyManager r0 = r5.A0K()
            if (r0 == 0) goto L_0x0190
            java.lang.String r0 = r0.getNetworkOperator()
            X.3St r6 = X.C65603St.A00(r0)
            java.lang.String r3 = r6.A00
            r8.A0S()
            X.8Hz r2 = r8.A00
            X.8S6 r2 = (X.AnonymousClass8S6) r2
            r3.getClass()
            int r0 = r2.bitField0_
            r0 = r0 | 4
            r2.bitField0_ = r0
            r2.mcc_ = r3
            java.lang.String r3 = r6.A01
            r8.A0S()
            X.8Hz r2 = r8.A00
            X.8S6 r2 = (X.AnonymousClass8S6) r2
            r3.getClass()
            int r0 = r2.bitField0_
            r0 = r0 | 8
            r2.bitField0_ = r0
            r2.mnc_ = r3
        L_0x0190:
            X.1Vd r9 = r13.A05
            java.lang.String r3 = r9.A04
            r8.A0S()
            X.8Hz r2 = r8.A00
            X.8S6 r2 = (X.AnonymousClass8S6) r2
            r3.getClass()
            int r0 = r2.bitField0_
            r0 = r0 | 16
            r2.bitField0_ = r0
            r2.osVersion_ = r3
            java.lang.String r6 = r9.A03
            r8.A0S()
            X.8Hz r2 = r8.A00
            X.8S6 r2 = (X.AnonymousClass8S6) r2
            r6.getClass()
            int r0 = r2.bitField0_
            r0 = r0 | 32
            r2.bitField0_ = r0
            r2.manufacturer_ = r6
            java.lang.String r6 = r9.A00
            r8.A0S()
            X.8Hz r2 = r8.A00
            X.8S6 r2 = (X.AnonymousClass8S6) r2
            r6.getClass()
            int r0 = r2.bitField0_
            r0 = r0 | 64
            r2.bitField0_ = r0
            r2.device_ = r6
            java.lang.String r6 = r9.A02
            r8.A0S()
            X.8Hz r2 = r8.A00
            X.8S6 r2 = (X.AnonymousClass8S6) r2
            r6.getClass()
            int r0 = r2.bitField0_
            r0 = r0 | 128(0x80, float:1.794E-43)
            r2.bitField0_ = r0
            r2.osBuildNumber_ = r6
            java.lang.String r6 = r9.A01
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L_0x01fc
            r8.A0S()
            X.8Hz r2 = r8.A00
            X.8S6 r2 = (X.AnonymousClass8S6) r2
            r6.getClass()
            int r0 = r2.bitField0_
            r0 = r0 | 4096(0x1000, float:5.74E-42)
            r2.bitField0_ = r0
            r2.deviceBoard_ = r6
        L_0x01fc:
            X.1Vf r0 = r13.A0G
            X.61Z r0 = r0.BFs()
            java.lang.String r6 = r0.A01
            r8.A0S()
            X.8Hz r2 = r8.A00
            X.8S6 r2 = (X.AnonymousClass8S6) r2
            r6.getClass()
            int r0 = r2.bitField0_
            r0 = r0 | 256(0x100, float:3.59E-43)
            r2.bitField0_ = r0
            r2.phoneId_ = r6
            X.0v0 r6 = r13.A0A
            java.lang.String r0 = r6.A0e()
            byte[] r2 = X.C65983Uf.A0W(r0)
            r0 = 11
            java.lang.String r9 = android.util.Base64.encodeToString(r2, r0)
            r8.A0S()
            X.8Hz r2 = r8.A00
            X.8S6 r2 = (X.AnonymousClass8S6) r2
            r9.getClass()
            int r0 = r2.bitField0_
            r0 = r0 | 8192(0x2000, float:1.14794E-41)
            r2.bitField0_ = r0
            r2.deviceExpId_ = r9
            X.1Hv r0 = r13.A0C
            X.1Jy r0 = r0.A00()
            int r0 = r0.ordinal()
            switch(r0) {
                case 1: goto L_0x03c7;
                case 2: goto L_0x03c3;
                case 3: goto L_0x03bf;
                default: goto L_0x0245;
            }
        L_0x0245:
            X.2q5 r0 = X.C52732q5.A02
        L_0x0247:
            r8.A0S()
            X.8Hz r2 = r8.A00
            X.8S6 r2 = (X.AnonymousClass8S6) r2
            int r0 = r0.value
            r2.deviceType_ = r0
            int r0 = r2.bitField0_
            r0 = r0 | 16384(0x4000, float:2.2959E-41)
            r2.bitField0_ = r0
            X.0ts r10 = r13.A0B
            java.lang.String r9 = r10.A06()
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto L_0x027b
            java.lang.String r0 = "zz"
            boolean r0 = r0.equals(r9)
            if (r0 != 0) goto L_0x027b
            r8.A0S()
            X.8Hz r2 = r8.A00
            X.8S6 r2 = (X.AnonymousClass8S6) r2
            int r0 = r2.bitField0_
            r0 = r0 | 1024(0x400, float:1.435E-42)
            r2.bitField0_ = r0
            r2.localeLanguageIso6391_ = r9
        L_0x027b:
            java.lang.String r9 = r10.A05()
            java.lang.String r0 = "ZZ"
            boolean r0 = r0.equals(r9)
            if (r0 != 0) goto L_0x0296
            r8.A0S()
            X.8Hz r2 = r8.A00
            X.8S6 r2 = (X.AnonymousClass8S6) r2
            int r0 = r2.bitField0_
            r0 = r0 | 2048(0x800, float:2.87E-42)
            r2.bitField0_ = r0
            r2.localeCountryIso31661Alpha2_ = r9
        L_0x0296:
            r4.A0S()
            X.8Hz r2 = r4.A00
            X.8SR r2 = (X.AnonymousClass8SR) r2
            X.8Hz r0 = r8.A0R()
            X.8S6 r0 = (X.AnonymousClass8S6) r0
            r0.getClass()
            r2.userAgent_ = r0
            int r0 = r2.bitField0_
            r0 = r0 | 4
            r2.bitField0_ = r0
            X.0wD r0 = r13.A07
            X.1M8 r2 = r0.A04()
            if (r2 == 0) goto L_0x0387
            boolean r0 = r2.A06
            if (r0 == 0) goto L_0x037e
            X.2q8 r0 = X.C52762q8.A0F
        L_0x02bc:
            r4.A0S()
            X.8Hz r2 = r4.A00
            X.8SR r2 = (X.AnonymousClass8SR) r2
            int r0 = r0.value
            r2.connectType_ = r0
            int r0 = r2.bitField0_
            r0 = r0 | 128(0x80, float:1.794E-43)
            r2.bitField0_ = r0
            X.0wG r0 = r13.A03
            android.content.Context r2 = r0.A00
            long r10 = X.C26651Kz.A00(r2)
            r8 = 1
            int r0 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x02dc
            r7 = 0
        L_0x02dc:
            r4.A0S()
            X.8Hz r9 = r4.A00
            X.8SR r9 = (X.AnonymousClass8SR) r9
            int r8 = r9.bitField0_
            r0 = 65536(0x10000, float:9.18355E-41)
            r8 = r8 | r0
            r9.bitField0_ = r8
            r9.oc_ = r7
            int r7 = r14.A00
            if (r7 != 0) goto L_0x0364
            X.2q6 r8 = X.C52742q6.A05
        L_0x02f2:
            X.8PV r0 = X.AnonymousClass8PV.DEFAULT_INSTANCE
            X.8NN r9 = r0.A0p()
            r9.A0S()
            X.8Hz r7 = r9.A00
            X.8PV r7 = (X.AnonymousClass8PV) r7
            int r0 = r8.value
            r7.dnsMethod_ = r0
            int r0 = r7.bitField0_
            r0 = r0 | 1
            r7.bitField0_ = r0
            boolean r8 = r14.A01
            r9.A0S()
            X.8Hz r7 = r9.A00
            X.8PV r7 = (X.AnonymousClass8PV) r7
            int r0 = r7.bitField0_
            r0 = r0 | 2
            r7.bitField0_ = r0
            r7.appCached_ = r8
            X.8Hz r0 = r9.A0R()
            X.8PV r0 = (X.AnonymousClass8PV) r0
            r4.A0S()
            X.8Hz r7 = r4.A00
            X.8SR r7 = (X.AnonymousClass8SR) r7
            r0.getClass()
            r7.dnsSource_ = r0
            int r0 = r7.bitField0_
            r0 = r0 | 512(0x200, float:7.175E-43)
            r7.bitField0_ = r0
        L_0x0332:
            r4.A0S()
            X.8Hz r7 = r4.A00
            X.8SR r7 = (X.AnonymousClass8SR) r7
            int r0 = r7.bitField0_
            r0 = r0 | 1024(0x400, float:1.435E-42)
            r7.bitField0_ = r0
            r0 = r18
            r7.connectAttemptCount_ = r0
            X.005 r0 = r6.A00
            java.lang.Object r7 = r0.get()
            android.content.SharedPreferences r7 = (android.content.SharedPreferences) r7
            java.lang.String r6 = "connection_lc"
            r0 = 0
            int r8 = r7.getInt(r6, r0)
            r4.A0S()
            X.8Hz r7 = r4.A00
            X.8SR r7 = (X.AnonymousClass8SR) r7
            int r6 = r7.bitField0_
            r0 = 131072(0x20000, float:1.83671E-40)
            r6 = r6 | r0
            r7.bitField0_ = r6
            r7.lc_ = r8
            monitor-enter(r1)
            goto L_0x03cb
        L_0x0364:
            r0 = 1
            if (r7 != r0) goto L_0x036a
            X.2q6 r8 = X.C52742q6.A02
            goto L_0x02f2
        L_0x036a:
            r0 = 2
            if (r7 != r0) goto L_0x0370
            X.2q6 r8 = X.C52742q6.A03
            goto L_0x02f2
        L_0x0370:
            r0 = 3
            if (r7 != r0) goto L_0x0377
            X.2q6 r8 = X.C52742q6.A04
            goto L_0x02f2
        L_0x0377:
            r0 = 4
            if (r7 != r0) goto L_0x0332
            X.2q6 r8 = X.C52742q6.A01
            goto L_0x02f2
        L_0x037e:
            boolean r0 = r2.A04
            if (r0 == 0) goto L_0x0387
            int r0 = r2.A00
            switch(r0) {
                case 1: goto L_0x038b;
                case 2: goto L_0x038f;
                case 3: goto L_0x0393;
                case 4: goto L_0x0397;
                case 5: goto L_0x039b;
                case 6: goto L_0x039b;
                case 7: goto L_0x039f;
                case 8: goto L_0x03a3;
                case 9: goto L_0x03a7;
                case 10: goto L_0x03ab;
                case 11: goto L_0x03af;
                case 12: goto L_0x039b;
                case 13: goto L_0x03b3;
                case 14: goto L_0x03b7;
                case 15: goto L_0x03bb;
                default: goto L_0x0387;
            }
        L_0x0387:
            X.2q8 r0 = X.C52762q8.A0E
            goto L_0x02bc
        L_0x038b:
            X.2q8 r0 = X.C52762q8.A06
            goto L_0x02bc
        L_0x038f:
            X.2q8 r0 = X.C52762q8.A03
            goto L_0x02bc
        L_0x0393:
            X.2q8 r0 = X.C52762q8.A0D
            goto L_0x02bc
        L_0x0397:
            X.2q8 r0 = X.C52762q8.A02
            goto L_0x02bc
        L_0x039b:
            X.2q8 r0 = X.C52762q8.A05
            goto L_0x02bc
        L_0x039f:
            X.2q8 r0 = X.C52762q8.A01
            goto L_0x02bc
        L_0x03a3:
            X.2q8 r0 = X.C52762q8.A07
            goto L_0x02bc
        L_0x03a7:
            X.2q8 r0 = X.C52762q8.A0A
            goto L_0x02bc
        L_0x03ab:
            X.2q8 r0 = X.C52762q8.A08
            goto L_0x02bc
        L_0x03af:
            X.2q8 r0 = X.C52762q8.A0B
            goto L_0x02bc
        L_0x03b3:
            X.2q8 r0 = X.C52762q8.A0C
            goto L_0x02bc
        L_0x03b7:
            X.2q8 r0 = X.C52762q8.A04
            goto L_0x02bc
        L_0x03bb:
            X.2q8 r0 = X.C52762q8.A09
            goto L_0x02bc
        L_0x03bf:
            X.2q5 r0 = X.C52732q5.A01
            goto L_0x0247
        L_0x03c3:
            X.2q5 r0 = X.C52732q5.A04
            goto L_0x0247
        L_0x03c7:
            X.2q5 r0 = X.C52732q5.A03
            goto L_0x0247
        L_0x03cb:
            X.1MU r0 = r1.A00     // Catch:{ all -> 0x06cc }
            X.1MU r8 = new X.1MU     // Catch:{ all -> 0x06cc }
            r8.<init>(r0)     // Catch:{ all -> 0x06cc }
            monitor-exit(r1)
            X.90i r0 = X.C1886890i.A02
            r4.A0S()
            X.8Hz r1 = r4.A00
            X.8SR r1 = (X.AnonymousClass8SR) r1
            int r0 = r0.value
            r1.connectReason_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 256(0x100, float:3.59E-43)
            r1.bitField0_ = r0
            int r0 = r8.A00
            if (r0 == 0) goto L_0x0426
            long r0 = r8.A02
            r9 = 0
            int r6 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r6 <= 0) goto L_0x0426
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            X.C18740tg.A06(r0)
            long r0 = r0.longValue()
            long r19 = r19 - r0
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS
            r0 = 10
            long r6 = r6.toMillis(r0)
            int r0 = (r19 > r6 ? 1 : (r19 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x0426
            int r1 = r8.A00
            r0 = 1
            if (r1 == r0) goto L_0x0631
            r0 = 2
            if (r1 != r0) goto L_0x0426
            X.90i r0 = X.C1886890i.A01
        L_0x0415:
            r4.A0S()
            X.8Hz r1 = r4.A00
            X.8SR r1 = (X.AnonymousClass8SR) r1
            int r0 = r0.value
            r1.connectReason_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 256(0x100, float:3.59E-43)
            r1.bitField0_ = r0
        L_0x0426:
            if (r12 == 0) goto L_0x0620
            r11 = r16
            X.C18740tg.A06(r11)
            X.5tq r10 = r11.A00
            byte[] r8 = r11.A01
            X.8Hz r0 = r4.A00
            X.8SR r0 = (X.AnonymousClass8SR) r0
            X.8Rj r0 = r0.devicePairingData_
            if (r0 != 0) goto L_0x043b
            X.8Rj r0 = X.C173358Rj.DEFAULT_INSTANCE
        L_0x043b:
            X.8NN r6 = r0.A0q()
            r9 = 1
            byte[] r7 = new byte[r9]
            r0 = 5
            r1 = 0
            r7[r1] = r0
            X.8I5 r12 = X.C21674AUx.A01(r7, r1, r9)
            r6.A0S()
            X.8Hz r7 = r6.A00
            X.8Rj r7 = (X.C173358Rj) r7
            X.8Rj r0 = X.C173358Rj.DEFAULT_INSTANCE
            int r0 = r7.bitField0_
            r0 = r0 | 2
            r7.bitField0_ = r0
            r7.eKeytype_ = r12
            int r0 = r8.length
            X.8I5 r8 = X.C21674AUx.A01(r8, r1, r0)
            r6.A0S()
            X.8Hz r7 = r6.A00
            X.8Rj r7 = (X.C173358Rj) r7
            int r0 = r7.bitField0_
            r0 = r0 | 4
            r7.bitField0_ = r0
            r7.eIdent_ = r8
            byte[] r7 = r11.A02
            r0 = 4
            X.8I5 r8 = X.C21674AUx.A01(r7, r1, r0)
            r6.A0S()
            X.8Hz r7 = r6.A00
            X.8Rj r7 = (X.C173358Rj) r7
            int r0 = r7.bitField0_
            r0 = r0 | 1
            r7.bitField0_ = r0
            r7.eRegid_ = r8
            byte[] r7 = r10.A01
            int r0 = r7.length
            X.8I5 r8 = X.C21674AUx.A01(r7, r1, r0)
            r6.A0S()
            X.8Hz r7 = r6.A00
            X.8Rj r7 = (X.C173358Rj) r7
            int r0 = r7.bitField0_
            r0 = r0 | 8
            r7.bitField0_ = r0
            r7.eSkeyId_ = r8
            byte[] r7 = r10.A00
            int r0 = r7.length
            X.8I5 r8 = X.C21674AUx.A01(r7, r1, r0)
            r6.A0S()
            X.8Hz r7 = r6.A00
            X.8Rj r7 = (X.C173358Rj) r7
            int r0 = r7.bitField0_
            r0 = r0 | 16
            r7.bitField0_ = r0
            r7.eSkeyVal_ = r8
            byte[] r7 = r10.A02
            int r0 = r7.length
            X.8I5 r8 = X.C21674AUx.A01(r7, r1, r0)
            r6.A0S()
            X.8Hz r7 = r6.A00
            X.8Rj r7 = (X.C173358Rj) r7
            int r0 = r7.bitField0_
            r0 = r0 | 32
            r7.bitField0_ = r0
            r7.eSkeySig_ = r8
            java.lang.String r0 = "2.24.6.77"
            java.util.Objects.requireNonNull(r0)
            java.lang.String r0 = X.C18750th.A04(r0)
            byte[] r7 = android.util.Base64.decode(r0, r1)
            int r0 = r7.length
            X.8I5 r8 = X.C21674AUx.A01(r7, r1, r0)
            r6.A0S()
            X.8Hz r7 = r6.A00
            X.8Rj r7 = (X.C173358Rj) r7
            int r0 = r7.bitField0_
            r0 = r0 | 64
            r7.bitField0_ = r0
            r7.buildHash_ = r8
            X.8R8 r0 = X.AnonymousClass8R8.DEFAULT_INSTANCE
            X.8NN r7 = r0.A0p()
            int[] r8 = r13.A00()
            X.8Hz r0 = r7.A00
            X.8R8 r0 = (X.AnonymousClass8R8) r0
            X.8R7 r0 = r0.version_
            if (r0 != 0) goto L_0x04fc
            X.8R7 r0 = X.AnonymousClass8R7.DEFAULT_INSTANCE
        L_0x04fc:
            X.8NN r10 = r0.A0q()
            r11 = r8[r1]
            r10.A0S()
            X.8Hz r1 = r10.A00
            X.8R7 r1 = (X.AnonymousClass8R7) r1
            X.8R7 r0 = X.AnonymousClass8R7.DEFAULT_INSTANCE
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
            r1.primary_ = r11
            r11 = r8[r9]
            r10.A0S()
            X.8Hz r1 = r10.A00
            X.8R7 r1 = (X.AnonymousClass8R7) r1
            int r0 = r1.bitField0_
            r0 = r0 | 2
            r1.bitField0_ = r0
            r1.secondary_ = r11
            r0 = 2
            r11 = r8[r0]
            r10.A0S()
            X.8Hz r1 = r10.A00
            X.8R7 r1 = (X.AnonymousClass8R7) r1
            int r0 = r1.bitField0_
            r0 = r0 | 4
            r1.bitField0_ = r0
            r1.tertiary_ = r11
            int r1 = r8.length
            r0 = 4
            if (r1 != r0) goto L_0x054c
            r0 = 3
            r8 = r8[r0]
            r10.A0S()
            X.8Hz r1 = r10.A00
            X.8R7 r1 = (X.AnonymousClass8R7) r1
            int r0 = r1.bitField0_
            r0 = r0 | 8
            r1.bitField0_ = r0
            r1.quaternary_ = r8
        L_0x054c:
            r7.A0S()
            X.8Hz r1 = r7.A00
            X.8R8 r1 = (X.AnonymousClass8R8) r1
            X.8Hz r0 = r10.A0R()
            X.8R7 r0 = (X.AnonymousClass8R7) r0
            r0.getClass()
            r1.version_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 2
            r1.bitField0_ = r0
            r7.A0S()
            X.8Hz r1 = r7.A00
            X.8R8 r1 = (X.AnonymousClass8R8) r1
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
            r1.os_ = r3
            X.1Pe r0 = r13.A02
            X.2nr r0 = r0.A00()
            int r1 = r0.ordinal()
            r0 = 0
            if (r1 == r0) goto L_0x062d
            r0 = 2
            if (r1 == r0) goto L_0x0629
            X.2qA r0 = X.C52782qA.ANDROID_TABLET
        L_0x0585:
            r7.A0S()
            X.8Hz r1 = r7.A00
            X.8R8 r1 = (X.AnonymousClass8R8) r1
            int r0 = r0.value
            r1.platformType_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 4
            r1.bitField0_ = r0
            r7.A0S()
            X.8Hz r1 = r7.A00
            X.8R8 r1 = (X.AnonymousClass8R8) r1
            int r0 = r1.bitField0_
            r0 = r0 | 8
            r1.bitField0_ = r0
            r1.requireFullSync_ = r9
            X.8Rl r0 = X.C173378Rl.DEFAULT_INSTANCE
            X.8NN r8 = r0.A0p()
            r8.A0S()
            X.8Hz r1 = r8.A00
            X.8Rl r1 = (X.C173378Rl) r1
            int r0 = r1.bitField0_
            r0 = r0 | 128(0x80, float:1.794E-43)
            r1.bitField0_ = r0
            r1.supportCagReactionsAndPolls_ = r9
            r3 = 0
            r8.A0S()
            X.8Hz r1 = r8.A00
            X.8Rl r1 = (X.C173378Rl) r1
            int r0 = r1.bitField0_
            r0 = r0 | 8
            r1.bitField0_ = r0
            r1.inlineInitialPayloadInE2EeMsg_ = r3
            r8.A0S()
            X.8Hz r1 = r8.A00
            X.8Rl r1 = (X.C173378Rl) r1
            int r0 = r1.bitField0_
            r0 = r0 | 32
            r1.bitField0_ = r0
            r1.supportCallLogHistory_ = r9
            r7.A0S()
            X.8Hz r1 = r7.A00
            X.8R8 r1 = (X.AnonymousClass8R8) r1
            X.8Hz r0 = r8.A0R()
            X.8Rl r0 = (X.C173378Rl) r0
            r0.getClass()
            r1.historySyncConfig_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 16
            r1.bitField0_ = r0
            X.8Hz r0 = r7.A0R()
            X.8I5 r3 = r0.A0l()
            r6.A0S()
            X.8Hz r1 = r6.A00
            X.8Rj r1 = (X.C173358Rj) r1
            int r0 = r1.bitField0_
            r0 = r0 | 128(0x80, float:1.794E-43)
            r1.bitField0_ = r0
            r1.deviceProps_ = r3
            r4.A0S()
            X.8Hz r1 = r4.A00
            X.8SR r1 = (X.AnonymousClass8SR) r1
            X.8Hz r0 = r6.A0R()
            X.8Rj r0 = (X.C173358Rj) r0
            r0.getClass()
            r1.devicePairingData_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 4096(0x1000, float:5.74E-42)
            r1.bitField0_ = r0
        L_0x0620:
            X.8Hz r0 = r4.A00
            X.8SR r0 = (X.AnonymousClass8SR) r0
            boolean r0 = r0.oc_
            if (r0 == 0) goto L_0x0670
            goto L_0x0635
        L_0x0629:
            X.2qA r0 = X.C52782qA.ANDROID_AMBIGUOUS
            goto L_0x0585
        L_0x062d:
            X.2qA r0 = X.C52782qA.ANDROID_PHONE
            goto L_0x0585
        L_0x0631:
            X.90i r0 = X.C1886890i.A03
            goto L_0x0415
        L_0x0635:
            android.content.pm.Signature r0 = r13.A00     // Catch:{ Exception -> 0x066c }
            if (r0 != 0) goto L_0x064b
            java.lang.String r0 = r2.getPackageName()     // Catch:{ Exception -> 0x066c }
            r13.A01 = r0     // Catch:{ Exception -> 0x066c }
            android.content.pm.PackageManager r1 = r2.getPackageManager()     // Catch:{ Exception -> 0x066c }
            java.lang.String r0 = r13.A01     // Catch:{ Exception -> 0x066c }
            android.content.pm.Signature r0 = X.C132916Vu.A00(r1, r0)     // Catch:{ Exception -> 0x066c }
            r13.A00 = r0     // Catch:{ Exception -> 0x066c }
        L_0x064b:
            X.1Vg r2 = r13.A04     // Catch:{ Exception -> 0x066c }
            byte[] r1 = r0.toByteArray()     // Catch:{ Exception -> 0x066c }
            java.lang.String r0 = r13.A01     // Catch:{ Exception -> 0x066c }
            boolean r0 = r2.A00(r0, r1)     // Catch:{ Exception -> 0x066c }
            r3 = 0
            if (r0 != 0) goto L_0x065b
            r3 = 1
        L_0x065b:
            r4.A0S()     // Catch:{ Exception -> 0x066c }
            X.8Hz r2 = r4.A00     // Catch:{ Exception -> 0x066c }
            X.8SR r2 = (X.AnonymousClass8SR) r2     // Catch:{ Exception -> 0x066c }
            int r1 = r2.bitField0_     // Catch:{ Exception -> 0x066c }
            r0 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 | r0
            r2.bitField0_ = r1     // Catch:{ Exception -> 0x066c }
            r2.oc_ = r3     // Catch:{ Exception -> 0x066c }
            goto L_0x0670
        L_0x066c:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
        L_0x0670:
            X.0yC r2 = r13.A0D
            r1 = 1722(0x6ba, float:2.413E-42)
            X.0yV r0 = X.C21000yV.A02
            int r2 = X.C20800yB.A00(r0, r2, r1)
            r0 = -1
            if (r2 == r0) goto L_0x069b
            byte[] r1 = new byte[r2]
            java.security.SecureRandom r0 = X.AnonymousClass136.A00()
            r0.nextBytes(r1)
            r0 = 0
            X.8I5 r3 = X.C21674AUx.A01(r1, r0, r2)
            r4.A0S()
            X.8Hz r2 = r4.A00
            X.8SR r2 = (X.AnonymousClass8SR) r2
            int r1 = r2.bitField0_
            r0 = 4194304(0x400000, float:5.877472E-39)
            r1 = r1 | r0
            r2.bitField0_ = r1
            r2.paddingBytes_ = r3
        L_0x069b:
            X.0wg r0 = r13.A0H
            int r3 = X.AnonymousClass1K2.A02(r5, r0)
            r4.A0S()
            X.8Hz r2 = r4.A00
            X.8SR r2 = (X.AnonymousClass8SR) r2
            int r1 = r2.bitField0_
            r0 = 8388608(0x800000, float:1.17549435E-38)
            r1 = r1 | r0
            r2.bitField0_ = r1
            r2.yearClass_ = r3
            int r3 = X.C26391Jz.A00(r5)
            r4.A0S()
            X.8Hz r2 = r4.A00
            X.8SR r2 = (X.AnonymousClass8SR) r2
            int r1 = r2.bitField0_
            r0 = 16777216(0x1000000, float:2.3509887E-38)
            r1 = r1 | r0
            r2.bitField0_ = r1
            r2.memClass_ = r3
            X.8Hz r0 = r4.A0R()
            X.8SR r0 = (X.AnonymousClass8SR) r0
            return r0
        L_0x06cc:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29091Vh.A01(X.5q3, com.whatsapp.jid.UserJid, X.1VM, int, int, long, boolean):X.8SR");
    }
}
