package X;

import android.text.TextUtils;
import android.util.LruCache;
import com.whatsapp.Me;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Set;

/* renamed from: X.1DT  reason: invalid class name */
public class AnonymousClass1DT {
    public static final C18950u5 A0f = new C18950u5(1, 1);
    public static final C18950u5 A0g = new C18950u5(1, 50, 100, false);
    public final LruCache A00 = new LruCache(50);
    public final C19460v5 A01;
    public final C19730wQ A02;
    public final C19600wD A03;
    public final AnonymousClass16D A04;
    public final C19970wo A05;
    public final AnonymousClass1E3 A06;
    public final C220412q A07;
    public final AnonymousClass17X A08;
    public final AnonymousClass17T A09;
    public final AnonymousClass1EP A0A;
    public final AnonymousClass1DW A0B;
    public final C235518x A0C;
    public final C20810yC A0D;
    public final C21010yW A0E;
    public final AnonymousClass17V A0F;
    public final AnonymousClass1EJ A0G;
    public final C230717b A0H;
    public final AnonymousClass1DU A0I;
    public final C24811Dw A0J;
    public final AnonymousClass1E1 A0K;
    public final AnonymousClass1EQ A0L;
    public final AnonymousClass19L A0M;
    public final AnonymousClass1EE A0N;
    public final AnonymousClass1EK A0O;
    public final AnonymousClass1AW A0P;
    public final AnonymousClass1EO A0Q;
    public final AnonymousClass1CR A0R;
    public final C24031Au A0S;
    public final C23981Ap A0T;
    public final AnonymousClass1A1 A0U;
    public final C19770wU A0V;
    public final AnonymousClass1DV A0W;
    public final AnonymousClass005 A0X;
    public final AnonymousClass005 A0Y;
    public final AnonymousClass005 A0Z;
    public final boolean A0a;
    public final C19700wN A0b;
    public final AnonymousClass1ED A0c;
    public final AnonymousClass1E4 A0d;
    public final C19930wk A0e;

    public static Integer A03(int i) {
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 7) {
                i2 = 3;
                if (i != 8) {
                    i2 = 0;
                }
            }
        }
        return Integer.valueOf(i2);
    }

    public int A0B(AnonymousClass11F r4) {
        if (r4 != null) {
            AnonymousClass1DV r1 = this.A0W;
            if (r1.A02(r4)) {
                return 2;
            }
            if (r1.A03(r4)) {
                return 3;
            }
            return (!C197029b1.A00(r4) || !((C25681Hg) this.A0Y.get()).A00()) ? 0 : 1;
        }
    }

    public int A0D(String str, String str2) {
        String str3;
        if (str == null) {
            if (C25161Ff.A00(str2)) {
                return 4;
            }
            if (str2 != null && (str2.contains("static.whatsapp.net") || str2.contains("wa/static"))) {
                return 5;
            }
            str3 = "messagelogging/getBackendStoreType Unknown backend store type, both direct path and url are null";
            Log.e(str3);
            return 0;
        } else if (str.startsWith("/o")) {
            return 3;
        } else {
            if (str.startsWith("/v")) {
                return 2;
            }
            if (str2 == null || (!str2.contains("static.whatsapp.net") && !str2.contains("wa/static"))) {
                str3 = "messagelogging/getBackendStoreType Unknown backend store type";
                Log.e(str3);
                return 0;
            }
        }
        return 5;
    }

    public void A0K(AnonymousClass144 r8, Integer num) {
        int i;
        Integer num2 = num;
        if (num != null) {
            AnonymousClass144 r4 = r8;
            if (AnonymousClass143.A0G(r8)) {
                i = 2;
            } else if (r8 instanceof C177528dw) {
                i = 3;
            } else if (r8 instanceof C177618e5) {
                i = 4;
            } else {
                return;
            }
            Integer valueOf = Integer.valueOf(i);
            if (valueOf != null) {
                this.A0V.Boy(new C35371ia(this, valueOf, r4, num2, 0));
            }
        }
    }

    public void A0N(AnonymousClass3T1 r15, int i, int i2, int i3, int i4, boolean z) {
        A0P(r15, (Integer) null, i, i2, i3, i4, 0, 0, 0, z, false, false, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0032, code lost:
        r0 = 27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0042, code lost:
        return 32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0047, code lost:
        return 29;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Integer A04(int r3) {
        /*
            r0 = -10000(0xffffffffffffd8f0, float:NaN)
            if (r3 == r0) goto L_0x0054
            r0 = -9999(0xffffffffffffd8f1, float:NaN)
            if (r3 == r0) goto L_0x0051
            r0 = -1100(0xfffffffffffffbb4, float:NaN)
            if (r3 == r0) goto L_0x004e
            r0 = -22
            if (r3 == r0) goto L_0x004b
            r0 = -12
            if (r3 == r0) goto L_0x0048
            r2 = 32
            r1 = 29
            r0 = 6
            switch(r3) {
                case -1206: goto L_0x0032;
                case -1205: goto L_0x0059;
                case -1204: goto L_0x0043;
                case -1203: goto L_0x003e;
                case -1202: goto L_0x0035;
                case -1201: goto L_0x0038;
                case -1200: goto L_0x003b;
                default: goto L_0x001c;
            }
        L_0x001c:
            switch(r3) {
                case -1011: goto L_0x003e;
                case -1010: goto L_0x0021;
                case -1009: goto L_0x0023;
                case -1008: goto L_0x0059;
                case -1007: goto L_0x0026;
                case -1006: goto L_0x0028;
                case -1005: goto L_0x002a;
                case -1004: goto L_0x0043;
                case -1003: goto L_0x002c;
                case -1002: goto L_0x0032;
                case -1001: goto L_0x002f;
                case -1000: goto L_0x0057;
                default: goto L_0x001f;
            }
        L_0x001f:
            r0 = 0
            return r0
        L_0x0021:
            r0 = 5
            goto L_0x0059
        L_0x0023:
            r0 = 31
            goto L_0x0059
        L_0x0026:
            r0 = 1
            goto L_0x0059
        L_0x0028:
            r0 = 2
            goto L_0x0059
        L_0x002a:
            r0 = 0
            goto L_0x0059
        L_0x002c:
            r0 = 28
            goto L_0x0059
        L_0x002f:
            r0 = 23
            goto L_0x0059
        L_0x0032:
            r0 = 27
            goto L_0x0059
        L_0x0035:
            r0 = 42
            goto L_0x0059
        L_0x0038:
            r0 = 24
            goto L_0x0059
        L_0x003b:
            r0 = 25
            goto L_0x0059
        L_0x003e:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            return r0
        L_0x0043:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            return r0
        L_0x0048:
            r0 = 30
            goto L_0x0059
        L_0x004b:
            r0 = 26
            goto L_0x0059
        L_0x004e:
            r0 = 11
            goto L_0x0059
        L_0x0051:
            r0 = 33
            goto L_0x0059
        L_0x0054:
            r0 = 10
            goto L_0x0059
        L_0x0057:
            r0 = 34
        L_0x0059:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1DT.A04(int):java.lang.Integer");
    }

    private Integer A07(AnonymousClass3T1 r2) {
        if (((C25681Hg) this.A0Y.get()).A00()) {
            return ((AnonymousClass1HX) this.A0X.get()).A02(r2);
        }
        return null;
    }

    private Integer A09(AnonymousClass2bV r5) {
        int i;
        AnonymousClass1DU r3 = this.A0I;
        String A032 = r3.A03(r5.A0b());
        String str = null;
        if (A032 == null) {
            A032 = null;
        } else if (TextUtils.isEmpty(r5.A06)) {
            str = A032;
        } else {
            str = r5.A06;
        }
        if (TextUtils.isEmpty(A032) || A032 == null || A032.length() == 0) {
            return null;
        }
        if (str == null) {
            str = "";
        }
        switch (AnonymousClass3TO.A01(r3, str)) {
            case 1:
                i = 5;
                break;
            case 2:
                i = 1;
                break;
            case 3:
                i = 3;
                break;
            case 4:
                i = 4;
                break;
            case 5:
                i = 2;
                break;
            case 6:
                i = 7;
                break;
            case 7:
                i = 6;
                break;
            case 8:
                i = 8;
                break;
            default:
                return null;
        }
        return Integer.valueOf(i);
    }

    private void A0A(AnonymousClass2T7 r7, String str, long j) {
        String obj;
        String obj2;
        String obj3;
        Integer num;
        Integer num2;
        Integer num3;
        C20810yC r4 = this.A0D;
        C21000yV r1 = C21000yV.A02;
        int A002 = C20800yB.A00(r1, r4, 1073);
        int A003 = C20800yB.A00(r1, r4, 1127);
        int A004 = C20800yB.A00(r1, r4, 1128);
        if (A002 != 0 && ((num3 = r7.A0J) == null || A002 != num3.intValue())) {
            return;
        }
        if (A003 != 0 && ((num2 = r7.A0I) == null || A003 != num2.intValue())) {
            return;
        }
        if (A004 == 0 || ((num = r7.A0H) != null && A004 == num.intValue())) {
            Integer num4 = r7.A0J;
            if (num4 == null) {
                obj = null;
            } else {
                obj = num4.toString();
            }
            Integer num5 = r7.A0I;
            if (num5 == null) {
                obj2 = null;
            } else {
                obj2 = num5.toString();
            }
            Integer num6 = r7.A0H;
            if (num6 == null) {
                obj3 = null;
            } else {
                obj3 = num6.toString();
            }
            C19700wN r2 = this.A0b;
            StringBuilder sb = new StringBuilder();
            sb.append("stage: ");
            sb.append(obj);
            sb.append("; messageType: ");
            sb.append(obj2);
            sb.append("; mediaType: ");
            sb.append(obj3);
            sb.append("; durationTime: ");
            sb.append(j);
            r2.A0E(str, sb.toString(), true);
        }
    }

    public int A0C(AnonymousClass3T1 r4) {
        return C55802vD.A00(this.A0B, r4, this.A0P, this.A0Q);
    }

    public Integer A0E(C21337AHp aHp) {
        if (!((C25681Hg) this.A0Y.get()).A00()) {
            return null;
        }
        this.A0X.get();
        AnonymousClass00C.A0D(aHp, 0);
        AnonymousClass9X8 r0 = aHp.A0A;
        if (r0 == null) {
            return null;
        }
        AnonymousClass11F A002 = AnonymousClass143.A00(r0.A00);
        if (A002 == null) {
            A002 = aHp.BGb();
        }
        UserJid BHK = aHp.BHK();
        if (BHK == null || !C197029b1.A00(BHK)) {
            return null;
        }
        if (A002 == null || A002.equals(BHK)) {
            return 0;
        }
        return 1;
    }

    public void A0F(int i, int i2) {
        if (this.A0a) {
            AnonymousClass1EE r3 = this.A0N;
            AnonymousClass1EF r2 = r3.A01;
            if (r2.A02(i)) {
                r3.A02.A01(i, r3.A01(AnonymousClass1EE.A00(i2), i, i2, 0));
                r2.A00(i, i2);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x009c, code lost:
        if (r4 != 88) goto L_0x009f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x001f  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0040  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0G(X.AnonymousClass9K2 r8, com.whatsapp.jid.DeviceJid r9, com.whatsapp.jid.Jid r10, X.AnonymousClass3T1 r11, int r12, int r13, int r14) {
        /*
            r7 = this;
            X.2Sx r2 = new X.2Sx
            r2.<init>()
            r0 = 2
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A0D = r0
            int r3 = r8.A00
            r0 = 1
            if (r3 != r0) goto L_0x00c7
            r0 = 0
        L_0x0013:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x0017:
            r2.A05 = r0
            int r0 = r8.A01
            r6 = 0
            r3 = 1
            if (r0 == 0) goto L_0x00c1
            java.lang.Integer r0 = A04(r0)
            r2.A07 = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
        L_0x0029:
            r2.A00 = r0
            java.lang.Integer r0 = X.C203229nZ.A04(r14)
            r2.A0B = r0
            java.lang.Integer r0 = A03(r14)
            r2.A09 = r0
            r0 = 0
            java.lang.Integer r0 = X.C203229nZ.A06(r10, r0)
            r2.A06 = r0
            if (r9 == 0) goto L_0x004d
            int r0 = r9.getDevice()
            if (r0 != 0) goto L_0x00bf
            r0 = 1
        L_0x0047:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A08 = r0
        L_0x004d:
            X.3Qa r0 = r11.A1J
            X.11F r5 = r0.A00
            long r0 = (long) r12
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A0F = r0
            X.1DW r4 = r7.A0B
            X.1AW r1 = r7.A0P
            X.1EO r0 = r7.A0Q
            int r0 = X.C55802vD.A00(r4, r11, r1, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A0A = r0
            java.lang.Integer r0 = r7.A07(r11)
            r2.A03 = r0
            java.lang.Integer r0 = r2.A0A
            boolean r0 = r7.A0V(r5, r0)
            if (r0 == 0) goto L_0x0077
            r6 = 1
        L_0x0077:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            r2.A01 = r0
            X.12q r0 = r7.A07
            X.AnonymousClass00C.A0D(r0, r3)
            java.lang.Integer r0 = X.AnonymousClass3UK.A06(r0, r5)
            r2.A0C = r0
            long r0 = (long) r13
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A0E = r0
            boolean r0 = r11 instanceof X.AnonymousClass0p5
            if (r0 != 0) goto L_0x009e
            int r4 = r11.A1I
            r0 = 87
            if (r4 == r0) goto L_0x009e
            r1 = 88
            r0 = 0
            if (r4 != r1) goto L_0x009f
        L_0x009e:
            r0 = 1
        L_0x009f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A02 = r0
            int r0 = r7.A0B(r5)
            if (r0 == 0) goto L_0x00b1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A04 = r0
        L_0x00b1:
            java.lang.Boolean r0 = r2.A00
            boolean r0 = r0.booleanValue()
            X.0yW r1 = r7.A0E
            if (r0 == 0) goto L_0x00d6
            r1.Bly(r2)
            return
        L_0x00bf:
            r0 = 2
            goto L_0x0047
        L_0x00c1:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            goto L_0x0029
        L_0x00c7:
            r1 = 2
            if (r3 == r1) goto L_0x0013
            r0 = 3
            if (r3 != r0) goto L_0x00d3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            goto L_0x0017
        L_0x00d3:
            r0 = 0
            goto L_0x0017
        L_0x00d6:
            X.0u5 r0 = new X.0u5
            r0.<init>(r3, r3)
            r1.Bls(r2, r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1DT.A0G(X.9K2, com.whatsapp.jid.DeviceJid, com.whatsapp.jid.Jid, X.3T1, int, int, int):void");
    }

    public void A0H(DeviceJid deviceJid, int i) {
        int i2;
        int i3;
        C44572Oa r3 = new C44572Oa();
        r3.A00 = Integer.valueOf(i);
        if (deviceJid != null) {
            if (deviceJid.getDevice() == 0) {
                i3 = 1;
            } else {
                i3 = 2;
            }
            i2 = Integer.valueOf(i3).intValue();
        } else {
            i2 = 1;
        }
        r3.A01 = Integer.valueOf(i2);
        this.A0E.Bls(r3, new C18950u5(1, 1), true);
    }

    public void A0I(DeviceJid deviceJid, C64933Qa r5, int i, boolean z) {
        int i2;
        AnonymousClass2QG r2 = new AnonymousClass2QG();
        r2.A02 = Integer.valueOf(AnonymousClass3UK.A04(r5.A00));
        if (deviceJid.getDevice() == 0) {
            i2 = 1;
        } else {
            i2 = 2;
        }
        r2.A01 = Integer.valueOf(i2);
        r2.A03 = Long.valueOf((long) i);
        r2.A00 = Boolean.valueOf(z);
        this.A0E.Blw(r2);
    }

    public void A0J(DeviceJid deviceJid, C64933Qa r5, Integer num, int i, int i2) {
        int i3;
        C45272Qs r2 = new C45272Qs();
        r2.A01 = Integer.valueOf(AnonymousClass3UK.A04(r5.A00));
        if (deviceJid.getDevice() == 0) {
            i3 = 1;
        } else {
            i3 = 2;
        }
        r2.A03 = Integer.valueOf(i3);
        r2.A04 = Long.valueOf((long) i);
        boolean z = false;
        if (C203229nZ.A04(i2) != null) {
            z = true;
        }
        r2.A00 = Boolean.valueOf(z);
        r2.A02 = num;
        this.A0E.Bly(r2);
    }

    public void A0L(AnonymousClass3T1 r5, int i) {
        Integer num;
        AnonymousClass2RX r3 = new AnonymousClass2RX();
        r3.A06 = r5.A1J.A01;
        r3.A01 = 1;
        r3.A04 = Integer.valueOf(AnonymousClass3UK.A05(r5));
        r3.A03 = Integer.valueOf(A0C(r5));
        r3.A05 = Long.valueOf(C19970wo.A00(this.A05));
        if (((C25681Hg) this.A0Y.get()).A00()) {
            num = ((AnonymousClass1HX) this.A0X.get()).A02(r5);
        } else {
            num = null;
        }
        r3.A00 = num;
        r3.A02 = Integer.valueOf(i);
        C21010yW r0 = this.A0E;
        if (i == 1) {
            r0.Blv(r3);
        } else {
            r0.Bly(r3);
        }
    }

    public void A0M(AnonymousClass3T1 r6, int i) {
        Long l;
        AnonymousClass2SY r2 = new AnonymousClass2SY();
        AnonymousClass11F r3 = r6.A1J.A00;
        r2.A09 = AnonymousClass3UK.A06(this.A07, r3);
        r2.A07 = Integer.valueOf(C55802vD.A00(this.A0B, r6, this.A0P, this.A0Q));
        r2.A06 = Integer.valueOf(i);
        AnonymousClass11F A0J2 = r6.A0J();
        r2.A03 = C203229nZ.A06(r3, A0J2);
        r2.A05 = C203229nZ.A05(this.A02, DeviceJid.of(A0J2));
        r2.A0B = Long.valueOf((long) r6.A0C);
        r2.A00 = Boolean.valueOf(r6.A1N());
        Integer num = r6.A0e;
        if (num != null) {
            l = Long.valueOf(num.longValue());
        } else {
            l = null;
        }
        r2.A0A = l;
        r2.A08 = C203229nZ.A04(r6.A01);
        r2.A01 = A07(r6);
        int A0B2 = A0B(r3);
        if (A0B2 != 0) {
            r2.A02 = Integer.valueOf(A0B2);
        }
        this.A0E.Blv(r2);
    }

    public void A0O(AnonymousClass3T1 r6, AnonymousClass3T1 r7, Integer num) {
        Integer num2;
        int i;
        AnonymousClass2RX r3 = new AnonymousClass2RX();
        if (r7.A0M() != null) {
            C63483Kf A0M2 = r7.A0M();
            C18740tg.A06(A0M2);
            r3.A06 = A0M2.A02;
            int ordinal = r7.A0M().A01.ordinal();
            if (ordinal != 1) {
                int i2 = 4;
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        i2 = 7;
                        if (ordinal != 4) {
                            i = null;
                        }
                    } else {
                        i2 = 5;
                    }
                }
                i = Integer.valueOf(i2);
            } else {
                i = 3;
            }
            r3.A01 = i;
            r3.A03 = Integer.valueOf(A0C(r7));
        } else {
            r3.A01 = 7;
        }
        if (r6 != null) {
            r3.A04 = Integer.valueOf(AnonymousClass3UK.A05(r6));
            if (((C25681Hg) this.A0Y.get()).A00()) {
                num2 = ((AnonymousClass1HX) this.A0X.get()).A02(r6);
            } else {
                num2 = null;
            }
            r3.A00 = num2;
        }
        r3.A05 = Long.valueOf(C19970wo.A00(this.A05));
        r3.A02 = num;
        int intValue = num.intValue();
        C21010yW r0 = this.A0E;
        if (intValue == 1) {
            r0.Blv(r3);
        } else {
            r0.Bly(r3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006a, code lost:
        if (A0V(r5.A1J.A00, r4.A0H) == false) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x008d, code lost:
        if (r5.A1T(androidx.core.view.inputmethod.EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING) == false) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x012f, code lost:
        if (X.C66013Ui.A0L(r5.A1I) == false) goto L_0x0131;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x014f, code lost:
        if (r5.A06 < 2) goto L_0x0151;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x017a, code lost:
        if (r5.A0S() == null) goto L_0x017c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0R(X.C23084B3s r13, int r14, int r15) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof X.C21337AHp
            if (r0 == 0) goto L_0x02cf
            X.AHp r13 = (X.C21337AHp) r13
            X.3T1 r5 = r13.A0P
            X.0wo r0 = r12.A05
            long r8 = X.C19970wo.A00(r0)
            X.2T6 r4 = new X.2T6
            r4.<init>()
            java.lang.Long r0 = r13.A0b
            long r6 = r0.longValue()
            long r0 = r13.A18
            long r2 = r6 - r0
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r4.A0N = r0
            long r8 = r8 - r6
            java.lang.Long r0 = java.lang.Long.valueOf(r8)
            r4.A0O = r0
            java.lang.Long r0 = r13.A0a
            r4.A0Q = r0
            X.1DW r7 = r12.A0B
            X.1AW r6 = r12.A0P
            X.1EO r3 = r12.A0Q
            int r0 = A01(r7, r13, r6, r3)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.A0H = r0
            boolean r0 = r13.A0y
            if (r0 == 0) goto L_0x02e4
            r1 = 3
        L_0x0043:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r4.A0I = r0
            r2 = 1
            if (r1 == r2) goto L_0x004f
            r0 = 3
            if (r1 != r0) goto L_0x005d
        L_0x004f:
            X.0wQ r1 = r12.A02
            X.3Qa r0 = r13.BE4()
            java.lang.Boolean r0 = A02(r1, r0)
            if (r0 == 0) goto L_0x005d
            r4.A05 = r0
        L_0x005d:
            if (r5 == 0) goto L_0x006c
            X.3Qa r0 = r5.A1J
            X.11F r1 = r0.A00
            java.lang.Integer r0 = r4.A0H
            boolean r1 = r12.A0V(r1, r0)
            r0 = 1
            if (r1 != 0) goto L_0x006d
        L_0x006c:
            r0 = 0
        L_0x006d:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r4.A03 = r0
            X.12q r9 = r12.A07
            X.AnonymousClass00C.A0D(r9, r2)
            if (r5 == 0) goto L_0x02e1
            X.3Qa r0 = r5.A1J
            X.11F r0 = r0.A00
            java.lang.Integer r0 = X.AnonymousClass3UK.A06(r9, r0)
        L_0x0082:
            r4.A0K = r0
            if (r5 == 0) goto L_0x008f
            r0 = 16777216(0x1000000, float:2.3509887E-38)
            boolean r1 = r5.A1T(r0)
            r0 = 1
            if (r1 != 0) goto L_0x0090
        L_0x008f:
            r0 = 0
        L_0x0090:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r4.A00 = r0
            if (r5 == 0) goto L_0x010d
            X.3Qa r0 = r5.A1J
            X.11F r8 = r0.A00
            X.18x r10 = r12.A0C
            java.lang.Integer r0 = r10.A04()
            int r0 = r0.intValue()
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r4.A0S = r0
            boolean r0 = r8 instanceof com.whatsapp.jid.UserJid
            if (r0 == 0) goto L_0x00bf
            r0 = r8
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0
            int r0 = r10.A00(r0)
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r4.A0T = r0
        L_0x00bf:
            r0 = 0
            X.3Qp r9 = r9.A09(r8, r0)
            if (r9 == 0) goto L_0x0104
            X.3un r0 = r9.A0b
            int r1 = r0.disappearingMessagesInitiator
            r0 = 2
            if (r1 == 0) goto L_0x02de
            if (r1 != r0) goto L_0x00d0
            r0 = 3
        L_0x00d0:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.A0D = r0
            X.0yC r8 = r12.A0D
            r1 = 5309(0x14bd, float:7.44E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r8, r1)
            if (r0 == 0) goto L_0x0104
            X.3Id r1 = r9.A0a
            if (r1 == 0) goto L_0x0104
            int r0 = r1.A00
            int r0 = X.AnonymousClass3UK.A01(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.A0G = r0
            java.lang.Boolean r0 = r1.A01
            if (r0 == 0) goto L_0x0104
            boolean r1 = r0.booleanValue()
            r0 = 2
            if (r1 == 0) goto L_0x00fe
            r0 = 1
        L_0x00fe:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.A0F = r0
        L_0x0104:
            int r0 = r5.A05
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r4.A0M = r0
        L_0x010d:
            boolean r0 = r13.BMW()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r4.A07 = r0
            java.lang.Integer r0 = r13.A0W
            r8 = 0
            if (r0 == 0) goto L_0x02db
            long r0 = r0.longValue()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L_0x0124:
            r4.A0P = r0
            if (r5 == 0) goto L_0x0131
            int r0 = r5.A1I
            boolean r1 = X.C66013Ui.A0L(r0)
            r0 = 1
            if (r1 != 0) goto L_0x0132
        L_0x0131:
            r0 = 0
        L_0x0132:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r4.A04 = r0
            if (r14 <= 0) goto L_0x0149
            long r0 = (long) r14
            r10 = 32
            int r9 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r9 > 0) goto L_0x0143
            r0 = 32
        L_0x0143:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r4.A0R = r0
        L_0x0149:
            if (r5 == 0) goto L_0x0151
            int r9 = r5.A06
            r1 = 2
            r0 = 1
            if (r9 >= r1) goto L_0x0152
        L_0x0151:
            r0 = 0
        L_0x0152:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r4.A02 = r0
            if (r15 <= 0) goto L_0x0173
            long r0 = (long) r15
            r10 = 32
            int r9 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r9 > 0) goto L_0x0163
            r0 = 32
        L_0x0163:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r4.A0L = r0
            int r0 = X.AnonymousClass3UK.A00(r15)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.A0C = r0
        L_0x0173:
            if (r5 == 0) goto L_0x017c
            X.3T1 r1 = r5.A0S()
            r0 = 1
            if (r1 != 0) goto L_0x017d
        L_0x017c:
            r0 = 0
        L_0x017d:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r4.A01 = r0
            if (r5 == 0) goto L_0x0189
            X.3Qa r0 = r5.A1J
            X.11F r8 = r0.A00
        L_0x0189:
            X.0yC r1 = r12.A0D
            r0 = 441(0x1b9, float:6.18E-43)
            X.0yV r9 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r9, r1, r0)
            if (r0 == 0) goto L_0x01a7
            boolean r0 = X.AnonymousClass143.A0G(r8)
            if (r0 == 0) goto L_0x01a7
            X.1CR r0 = r12.A0R
            boolean r0 = r0.A0j(r8)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r4.A08 = r0
        L_0x01a7:
            int r10 = r13.A01
            java.lang.Integer r0 = X.C203229nZ.A04(r10)
            r4.A0J = r0
            X.630 r0 = r13.A0O
            if (r0 != 0) goto L_0x01d5
            X.630 r0 = r13.A0N
            if (r0 == 0) goto L_0x01d5
            X.11F r0 = r13.BGb()
            boolean r0 = X.AnonymousClass143.A0G(r0)
            if (r0 == 0) goto L_0x01d5
            java.lang.String r8 = r13.A0w
            java.lang.String r0 = "text"
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x01d5
            int r0 = r13.A00
            if (r0 != r2) goto L_0x01d5
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r4.A06 = r0
        L_0x01d5:
            java.lang.Integer r0 = A03(r10)
            r4.A0E = r0
            java.lang.Integer r0 = r12.A0E(r13)
            r4.A0A = r0
            boolean r0 = r5 instanceof X.C46962bx
            if (r0 == 0) goto L_0x02d8
            X.2bx r5 = (X.C46962bx) r5
            boolean r0 = r5.A1j()
            if (r0 == 0) goto L_0x02d8
        L_0x01ed:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r4.A09 = r0
            X.11F r0 = r13.BGb()
            int r0 = r12.A0B(r0)
            if (r0 == 0) goto L_0x0203
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.A0B = r0
        L_0x0203:
            X.0yW r5 = r12.A0E
            r5.Bly(r4)
            X.3T1 r4 = r13.A0P
            boolean r0 = X.C66013Ui.A0q(r4)
            if (r0 == 0) goto L_0x021b
            X.0wU r8 = r12.A0V
            r2 = 5
            X.1iz r0 = new X.1iz
            r0.<init>(r12, r4, r2)
            r8.Boy(r0)
        L_0x021b:
            r0 = 2430(0x97e, float:3.405E-42)
            boolean r0 = X.C20800yB.A01(r9, r1, r0)
            if (r0 == 0) goto L_0x0260
            boolean r0 = r4 instanceof X.AnonymousClass2bV
            if (r0 == 0) goto L_0x0260
            r8 = r4
            X.2bV r8 = (X.AnonymousClass2bV) r8
            X.1DU r9 = r12.A0I
            java.lang.String r0 = r8.A0b()
            java.lang.String r0 = r9.A03(r0)
            if (r0 == 0) goto L_0x0260
            X.2QX r2 = new X.2QX
            r2.<init>()
            int r0 = X.AnonymousClass3UK.A05(r4)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A02 = r0
            java.lang.Integer r0 = r12.A09(r8)
            r2.A01 = r0
            java.lang.Integer r0 = A05(r1, r9, r8)
            r2.A03 = r0
            X.3L1 r1 = r8.A0a
            r0 = 0
            if (r1 == 0) goto L_0x0257
            r0 = 1
        L_0x0257:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A00 = r0
            r5.Bly(r2)
        L_0x0260:
            if (r4 == 0) goto L_0x02a3
            X.3T1 r2 = r4.A0S()
            if (r2 == 0) goto L_0x02a3
            java.util.Objects.requireNonNull(r2)
            X.3Qa r0 = r2.A1J
            X.11F r0 = r0.A00
            boolean r0 = r0 instanceof X.C177528dw
            if (r0 == 0) goto L_0x02a3
            X.2Pr r1 = new X.2Pr
            r1.<init>()
            int r0 = X.C55802vD.A00(r7, r2, r6, r3)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A00 = r0
            X.0wQ r0 = r12.A02
            r0.A0G()
            com.whatsapp.jid.PhoneUserJid r0 = r0.A03
            X.C18740tg.A06(r0)
            java.lang.String r0 = r0.getRawString()
            r1.A02 = r0
            int r0 = X.C55802vD.A00(r7, r4, r6, r3)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r0 = r12.A08(r4, r0)
            r1.A01 = r0
            r5.Bly(r1)
        L_0x02a3:
            X.1E4 r5 = r12.A0d
            X.11F r3 = r13.BGb()
            X.C18740tg.A06(r3)
            X.0wk r2 = r5.A02
            r1 = 13
            X.1jE r0 = new X.1jE
            r0.<init>(r5, r3, r1)
            r2.execute(r0)
            if (r4 == 0) goto L_0x02cf
            X.1DV r3 = r12.A0W
            X.3Qa r0 = r4.A1J
            X.11F r2 = r0.A00
            boolean r0 = r3.A02(r2)
            r1 = 0
            if (r0 == 0) goto L_0x02d0
            r0 = 2
        L_0x02c8:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r12.A0O(r1, r4, r0)
        L_0x02cf:
            return
        L_0x02d0:
            boolean r0 = r3.A03(r2)
            if (r0 == 0) goto L_0x02cf
            r0 = 3
            goto L_0x02c8
        L_0x02d8:
            r2 = 0
            goto L_0x01ed
        L_0x02db:
            r0 = r8
            goto L_0x0124
        L_0x02de:
            r0 = 1
            goto L_0x00d0
        L_0x02e1:
            r0 = 0
            goto L_0x0082
        L_0x02e4:
            X.11F r0 = r13.BGb()
            int r1 = X.AnonymousClass3UK.A04(r0)
            goto L_0x0043
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1DT.A0R(X.B3s, int, int):void");
    }

    public void A0S(C23084B3s b3s, Integer num, int i) {
        Long l;
        if (b3s instanceof C21337AHp) {
            C21337AHp aHp = (C21337AHp) b3s;
            AnonymousClass2SY r3 = new AnonymousClass2SY();
            r3.A09 = AnonymousClass3UK.A06(this.A07, aHp.BE4().A00);
            r3.A07 = Integer.valueOf(A01(this.A0B, aHp, this.A0P, this.A0Q));
            r3.A06 = Integer.valueOf(i);
            if (i == 5) {
                r3.A04 = num;
            }
            r3.A03 = C203229nZ.A06(aHp.BE4().A00, aHp.A0E);
            r3.A05 = C203229nZ.A05(this.A02, DeviceJid.of(aHp.BHI()));
            r3.A0B = Long.valueOf((long) aHp.BGp());
            r3.A00 = Boolean.valueOf(aHp.BMW());
            Integer num2 = aHp.A0W;
            if (num2 != null) {
                l = Long.valueOf(num2.longValue());
            } else {
                l = null;
            }
            r3.A0A = l;
            r3.A08 = C203229nZ.A04(aHp.A01);
            r3.A01 = A0E(aHp);
            int A0B2 = A0B(b3s.BE4().A00);
            if (A0B2 != 0) {
                r3.A02 = Integer.valueOf(A0B2);
            }
            C21010yW r2 = this.A0E;
            if (i == 16) {
                r2.Blx(r3, new C18950u5(100, 100));
            } else {
                r2.Blv(r3);
            }
        }
    }

    public void A0T(C23084B3s b3s, Integer num, int i) {
        Integer valueOf;
        if (b3s instanceof C21337AHp) {
            C21337AHp aHp = (C21337AHp) b3s;
            AnonymousClass2SH r2 = new AnonymousClass2SH();
            r2.A08 = aHp.A1C;
            if (num != null) {
                int intValue = num.intValue();
                int i2 = 0;
                if (intValue != 0) {
                    i2 = 1;
                    if (intValue != 1) {
                        i2 = 2;
                        if (intValue != 2) {
                            i2 = 3;
                            if (intValue != 4) {
                                valueOf = null;
                                r2.A01 = valueOf;
                            }
                        }
                    }
                }
                valueOf = Integer.valueOf(i2);
                r2.A01 = valueOf;
            }
            r2.A03 = Integer.valueOf(i);
            Jid BHI = aHp.BHI();
            if (BHI != null) {
                r2.A09 = BHI.getRawString();
                r2.A04 = C203229nZ.A05(this.A02, DeviceJid.of(BHI));
            }
            r2.A05 = Integer.valueOf(A01(this.A0B, aHp, this.A0P, this.A0Q));
            r2.A00 = Boolean.valueOf(aHp.BMW());
            r2.A07 = Long.valueOf((long) aHp.BGp());
            r2.A02 = C203229nZ.A06(aHp.BE4().A00, aHp.A0E);
            r2.A06 = C203229nZ.A04(aHp.A01);
            this.A0E.Bly(r2);
        }
    }

    public void A0U(Long l, int[] iArr, int i, long j, boolean z) {
        AnonymousClass2S4 r2 = new AnonymousClass2S4();
        r2.A02 = Integer.valueOf(i);
        r2.A00 = Boolean.valueOf(z);
        r2.A07 = l;
        if (iArr != null) {
            int length = iArr.length;
            r2.A08 = Long.valueOf((long) length);
            if (length >= 1) {
                r2.A03 = Long.valueOf((long) iArr[0]);
                if (length >= 2) {
                    r2.A04 = Long.valueOf((long) iArr[1]);
                    if (length >= 3) {
                        r2.A05 = Long.valueOf((long) iArr[2]);
                        if (length >= 4) {
                            r2.A06 = Long.valueOf((long) iArr[3]);
                        }
                    }
                }
            }
        }
        r2.A01 = Double.valueOf((double) j);
        this.A0E.Blv(r2);
    }

    public boolean A0V(AnonymousClass11F r5, Integer num) {
        if (!(r5 instanceof C223313w)) {
            AnonymousClass6SZ r0 = GroupJid.Companion;
            GroupJid A002 = AnonymousClass6SZ.A00(r5);
            if (A002 == null || num == null || num.intValue() != 34) {
                return false;
            }
            AnonymousClass16D r02 = this.A04;
            C220412q r1 = this.A07;
            AnonymousClass141 A0A2 = r02.A0A(A002);
            if (A0A2 == null || !A0A2.A0j || !r1.A0P(A002)) {
                return false;
            }
        }
        return true;
    }

    public static int A00(AnonymousClass1DW r0, AnonymousClass3T1 r1, AnonymousClass1AW r2, AnonymousClass1EO r3) {
        return C55802vD.A00(r0, r1, r2, r3);
    }

    public static int A01(AnonymousClass1DW r1, C23084B3s b3s, AnonymousClass1AW r3, AnonymousClass1EO r4) {
        AnonymousClass3T1 BBj = b3s.BBj();
        if (BBj != null) {
            return C55802vD.A00(r1, BBj, r3, r4);
        }
        return C203229nZ.A03(b3s.BE8());
    }

    public static Boolean A02(C19730wQ r2, C64933Qa r3) {
        AnonymousClass11F r0;
        r2.A0G();
        Me me = r2.A00;
        if (me == null || (r0 = r3.A00) == null) {
            return null;
        }
        return Boolean.valueOf(!r0.getRawString().startsWith(me.cc));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0029, code lost:
        if (r2.A04 != null) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Integer A05(X.C20810yC r0, X.AnonymousClass1DU r1, X.AnonymousClass2bV r2) {
        /*
            X.3Rh r0 = X.C65243Rh.A00(r0, r1, r2)
            boolean r0 = r0.A04
            if (r0 == 0) goto L_0x0012
            X.3L1 r0 = r2.A0a
            if (r0 == 0) goto L_0x0012
            r1 = 5
        L_0x000d:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            return r0
        L_0x0012:
            X.3L1 r0 = r2.A0a
            if (r0 == 0) goto L_0x0018
            r1 = 4
            goto L_0x000d
        L_0x0018:
            byte[] r0 = r2.A1c()
            if (r0 != 0) goto L_0x002d
            byte[] r0 = r2.A07
            if (r0 != 0) goto L_0x002d
            java.lang.String r0 = r2.A05
            if (r0 != 0) goto L_0x002b
            java.lang.String r0 = r2.A04
            r1 = 1
            if (r0 == 0) goto L_0x000d
        L_0x002b:
            r1 = 2
            goto L_0x000d
        L_0x002d:
            r1 = 3
            goto L_0x000d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1DT.A05(X.0yC, X.1DU, X.2bV):java.lang.Integer");
    }

    public static Integer A06(AnonymousClass11F r1) {
        int i;
        if (AnonymousClass143.A0G(r1)) {
            i = 2;
        } else if (r1 instanceof C177528dw) {
            i = 3;
        } else if (r1 instanceof C177618e5) {
            i = 4;
        } else if (r1 instanceof UserJid) {
            i = 1;
        } else if (!(r1 instanceof C28981Uw)) {
            return null;
        } else {
            i = 5;
        }
        return Integer.valueOf(i);
    }

    private Integer A08(AnonymousClass3T1 r6, Integer num) {
        int intValue = num.intValue();
        int i = 11;
        if (intValue != 11) {
            int i2 = 7;
            if (intValue != 16) {
                if (intValue == 18 || intValue == 23 || intValue == 29) {
                    i2 = 9;
                } else {
                    if (intValue != 13) {
                        if (intValue != 14) {
                            if (intValue != 31) {
                                if (intValue != 32) {
                                    i = 2;
                                    switch (intValue) {
                                        case 1:
                                            String A0b2 = r6.A0b();
                                            if (A0b2 != null && C63883Lu.A00(A0b2) == 1) {
                                                int codePointAt = Character.codePointAt(A0b2, 0);
                                                Set set = AnonymousClass3TM.A01;
                                                Integer valueOf = Integer.valueOf(codePointAt);
                                                if (set.contains(valueOf) && AnonymousClass3TM.A01(this.A0D.A09(1852)).contains(valueOf)) {
                                                    i2 = 15;
                                                    break;
                                                }
                                            }
                                        case 2:
                                            break;
                                        case 3:
                                            break;
                                        case 4:
                                            i2 = 6;
                                            break;
                                        case 5:
                                            i2 = 4;
                                            break;
                                        case 6:
                                            break;
                                        case 7:
                                            i2 = 10;
                                            break;
                                        case 8:
                                            i2 = 5;
                                            break;
                                        case 9:
                                            break;
                                        default:
                                            i2 = 1;
                                            break;
                                    }
                                }
                            }
                            i2 = 3;
                        }
                        i2 = 8;
                    }
                    return Integer.valueOf(i);
                }
            }
            return Integer.valueOf(i2);
        }
        return 14;
    }

    public AnonymousClass1DT(C19460v5 r5, C19700wN r6, C19730wQ r7, C19600wD r8, AnonymousClass16D r9, C19970wo r10, AnonymousClass1E3 r11, AnonymousClass1ED r12, C220412q r13, AnonymousClass17X r14, AnonymousClass17T r15, AnonymousClass1EP r16, AnonymousClass1DW r17, C235518x r18, C20810yC r19, C21010yW r20, AnonymousClass17V r21, AnonymousClass1EJ r22, C230717b r23, AnonymousClass1DU r24, C24811Dw r25, AnonymousClass1E1 r26, AnonymousClass1EQ r27, AnonymousClass19L r28, AnonymousClass1EE r29, AnonymousClass1EK r30, AnonymousClass1AW r31, AnonymousClass1EO r32, AnonymousClass1CR r33, C24031Au r34, C23981Ap r35, AnonymousClass1A1 r36, AnonymousClass1E4 r37, C19770wU r38, AnonymousClass1DV r39, AnonymousClass005 r40, AnonymousClass005 r41, AnonymousClass005 r42) {
        this.A05 = r10;
        C20810yC r2 = r19;
        this.A0D = r2;
        this.A0b = r6;
        this.A02 = r7;
        C19770wU r3 = r38;
        this.A0V = r3;
        this.A07 = r13;
        this.A0I = r24;
        this.A09 = r15;
        this.A0W = r39;
        this.A0E = r20;
        this.A0Y = r40;
        this.A0H = r23;
        this.A0X = r41;
        this.A04 = r9;
        this.A0B = r17;
        this.A0T = r35;
        this.A0U = r36;
        this.A0Z = r42;
        this.A0R = r33;
        this.A0F = r21;
        this.A0M = r28;
        this.A0J = r25;
        this.A0K = r26;
        this.A06 = r11;
        this.A0d = r37;
        this.A0c = r12;
        this.A0S = r34;
        this.A08 = r14;
        this.A03 = r8;
        this.A0N = r29;
        this.A0L = r27;
        this.A0G = r22;
        this.A01 = r5;
        this.A0O = r30;
        this.A0A = r16;
        this.A0C = r18;
        this.A0P = r31;
        this.A0Q = r32;
        this.A0e = new C19930wk(r3, false);
        this.A0a = C20800yB.A01(C21000yV.A02, r2, 1191);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:105:0x02b3, code lost:
        if (r0.A0B == false) goto L_0x02b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x0439, code lost:
        if (r0 == false) goto L_0x043b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x04d6, code lost:
        if (r14 == 88) goto L_0x04d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x0745, code lost:
        if (r7.A1T(X.C132986Wc.A0F) == false) goto L_0x0747;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:452:0x0981, code lost:
        if (r0 == false) goto L_0x0983;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01c1, code lost:
        if (r0.A0B == false) goto L_0x01c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01f7, code lost:
        if (r0.A0B == false) goto L_0x01f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x020b, code lost:
        if (r0.A0C == false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0264, code lost:
        if (r1 != 5) goto L_0x0266;
     */
    /* JADX WARNING: Removed duplicated region for block: B:389:0x07f6  */
    /* JADX WARNING: Removed duplicated region for block: B:400:0x0824  */
    /* JADX WARNING: Removed duplicated region for block: B:494:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0P(X.AnonymousClass3T1 r37, java.lang.Integer r38, int r39, int r40, int r41, int r42, int r43, int r44, int r45, boolean r46, boolean r47, boolean r48, boolean r49) {
        /*
            r36 = this;
            r7 = r37
            r9 = r40
            if (r37 == 0) goto L_0x09c1
            r0 = 1
            boolean r22 = r7.A1T(r0)
            boolean r0 = r7 instanceof X.AnonymousClass2bO
            r18 = r0
            r6 = r36
            X.0wo r0 = r6.A05
            r34 = r0
            long r2 = X.C19970wo.A00(r34)
            if (r18 == 0) goto L_0x02d1
            r0 = r7
            X.2bO r0 = (X.AnonymousClass2bO) r0
            long r0 = r0.A00
        L_0x0020:
            long r2 = r2 - r0
            X.2T8 r8 = new X.2T8
            r8.<init>()
            r35 = r39
            java.lang.Integer r0 = java.lang.Integer.valueOf(r35)
            r8.A0Q = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r8.A0Y = r0
            X.1DW r0 = r6.A0B
            r33 = r0
            X.1AW r0 = r6.A0P
            r32 = r0
            X.1EO r0 = r6.A0Q
            r31 = r0
            r2 = r33
            r1 = r32
            int r0 = X.C55802vD.A00(r2, r7, r1, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8.A0P = r0
            int r0 = X.AnonymousClass3UK.A05(r7)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8.A0R = r0
            X.12q r0 = r6.A07
            r30 = r0
            r5 = 1
            X.AnonymousClass00C.A0D(r0, r5)
            X.3Qa r0 = r7.A1J
            r29 = r0
            X.11F r4 = r0.A00
            r0 = r30
            java.lang.Integer r0 = X.AnonymousClass3UK.A06(r0, r4)
            r8.A0T = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r49)
            r8.A0B = r0
            int r0 = r7.A01
            java.lang.Integer r0 = A03(r0)
            r8.A0L = r0
            long r2 = X.C19970wo.A00(r34)
            long r0 = r7.A0I
            long r2 = r2 - r0
            r16 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r16
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r8.A0V = r0
            r0 = r41
            if (r41 <= 0) goto L_0x00a0
            long r0 = (long) r0
            r10 = 32
            int r2 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r2 > 0) goto L_0x009a
            r0 = 32
        L_0x009a:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r8.A0Z = r0
        L_0x00a0:
            r3 = r42
            if (r42 <= 0) goto L_0x00bd
            long r0 = (long) r3
            r10 = 32
            int r2 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r2 > 0) goto L_0x00ad
            r0 = 32
        L_0x00ad:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r8.A0U = r0
            int r0 = X.AnonymousClass3UK.A00(r3)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8.A0I = r0
        L_0x00bd:
            java.lang.Boolean r19 = java.lang.Boolean.valueOf(r46)
            r0 = r19
            r8.A0A = r0
            java.lang.Integer r0 = r8.A0R
            int r0 = r0.intValue()
            if (r0 != r5) goto L_0x00d9
            X.0wQ r1 = r6.A02
            r0 = r29
            java.lang.Boolean r0 = A02(r1, r0)
            if (r0 == 0) goto L_0x00d9
            r8.A07 = r0
        L_0x00d9:
            java.lang.Integer r0 = r8.A0P
            boolean r0 = r6.A0V(r4, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r8.A03 = r0
            r0 = 16777216(0x1000000, float:2.3509887E-38)
            boolean r0 = r7.A1T(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r8.A01 = r0
            X.18x r0 = r6.A0C
            r28 = r0
            java.lang.Integer r0 = r28.A04()
            int r0 = r0.intValue()
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r8.A0e = r0
            boolean r0 = r4 instanceof com.whatsapp.jid.UserJid
            r21 = r0
            if (r0 == 0) goto L_0x011a
            r1 = r4
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            r0 = r28
            int r0 = r0.A00(r1)
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r8.A0a = r0
        L_0x011a:
            r1 = 0
            r0 = r30
            X.3Qp r3 = r0.A09(r4, r1)
            if (r3 == 0) goto L_0x0161
            X.3un r0 = r3.A0b
            int r1 = r0.disappearingMessagesInitiator
            r0 = 2
            if (r1 == 0) goto L_0x02ce
            if (r1 != r0) goto L_0x012d
            r0 = 3
        L_0x012d:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8.A0J = r0
            X.0yC r2 = r6.A0D
            r1 = 5309(0x14bd, float:7.44E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r2, r1)
            if (r0 == 0) goto L_0x0161
            X.3Id r1 = r3.A0a
            if (r1 == 0) goto L_0x0161
            int r0 = r1.A00
            int r0 = X.AnonymousClass3UK.A01(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8.A0N = r0
            java.lang.Boolean r0 = r1.A01
            if (r0 == 0) goto L_0x0161
            boolean r1 = r0.booleanValue()
            r0 = 2
            if (r1 == 0) goto L_0x015b
            r0 = 1
        L_0x015b:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8.A0M = r0
        L_0x0161:
            boolean r0 = r7 instanceof X.AnonymousClass2bU
            if (r0 == 0) goto L_0x0178
            r0 = r7
            X.2bU r0 = (X.AnonymousClass2bU) r0
            java.lang.String r0 = r0.A1a()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r0 = r0 ^ 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r8.A05 = r0
        L_0x0178:
            boolean r0 = r7 instanceof X.C46972by
            if (r0 == 0) goto L_0x018d
            r0 = r7
            X.2by r0 = (X.C46972by) r0
            java.lang.String r0 = r0.A01
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r0 = r0 ^ 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r8.A05 = r0
        L_0x018d:
            X.0yC r11 = r6.A0D
            r0 = 7773(0x1e5d, float:1.0892E-41)
            X.0yV r10 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r10, r11, r0)
            if (r0 == 0) goto L_0x01b0
            java.lang.String r1 = X.AnonymousClass3UK.A07(r7)
            if (r1 == 0) goto L_0x01b0
            X.17V r2 = r6.A0F
            java.util.Random r0 = new java.util.Random
            r0.<init>()
            byte[] r0 = r2.A05(r0)
            java.lang.String r0 = X.AnonymousClass17V.A00(r0, r1)
            r8.A0g = r0
        L_0x01b0:
            boolean r0 = r7 instanceof X.C46962bx
            r25 = r0
            r12 = 0
            if (r0 == 0) goto L_0x0447
            r14 = r7
            X.2bx r14 = (X.C46962bx) r14
            X.3S2 r0 = r14.A05
            if (r0 == 0) goto L_0x01c3
            boolean r0 = r0.A0B
            r1 = 1
            if (r0 != 0) goto L_0x01c4
        L_0x01c3:
            r1 = 0
        L_0x01c4:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r8.A0E = r0
            boolean r0 = r14.A1k()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r8.A0D = r0
            X.2SW r2 = new X.2SW
            r2.<init>()
            java.lang.Integer r0 = r14.A06
            r1 = 0
            if (r0 == 0) goto L_0x01df
            r1 = 1
        L_0x01df:
            java.lang.String r0 = "If you reach this breakpoint, please add info on which screen originated this sticker send or any specific flow you took to reach here T170675310"
            X.C18740tg.A0D(r1, r0)
            java.lang.Integer r0 = r14.A06
            r2.A0A = r0
            boolean r0 = r14.A03
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A01 = r0
            X.3S2 r0 = r14.A05
            if (r0 == 0) goto L_0x01f9
            boolean r1 = r0.A0B
            r3 = 1
            if (r1 != 0) goto L_0x01fa
        L_0x01f9:
            r3 = 0
        L_0x01fa:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
            r2.A03 = r1
            java.lang.Integer r13 = java.lang.Integer.valueOf(r5)
            r2.A09 = r13
            if (r0 == 0) goto L_0x020d
            boolean r0 = r0.A0C
            r1 = 1
            if (r0 != 0) goto L_0x020e
        L_0x020d:
            r1 = 0
        L_0x020e:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r2.A04 = r0
            boolean r0 = r14.A1k()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A02 = r0
            boolean r0 = r14.A1j()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A00 = r0
            X.6c4 r1 = r14.A00
            if (r1 == 0) goto L_0x0250
            X.3S2 r0 = r1.A04
            if (r0 == 0) goto L_0x02cb
            java.lang.String r3 = r0.A06
        L_0x0232:
            java.lang.String r0 = "Giphy"
            boolean r0 = X.AnonymousClass00C.A0J(r3, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A05 = r0
            X.3S2 r0 = r1.A04
            if (r0 == 0) goto L_0x02c8
            java.lang.String r1 = r0.A06
        L_0x0244:
            java.lang.String r0 = "Tenor"
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A07 = r0
        L_0x0250:
            X.3S2 r0 = r14.A05
            r3 = 0
            if (r0 == 0) goto L_0x0266
            int r1 = r0.A00
            r0 = 1
            if (r1 == r5) goto L_0x02c3
            r0 = 2
            if (r1 == r0) goto L_0x02c3
            r0 = 3
            if (r1 == r0) goto L_0x02c3
            r0 = 4
            if (r1 == r0) goto L_0x02c3
            r0 = 5
            if (r1 == r0) goto L_0x02c3
        L_0x0266:
            r2.A08 = r3
            r0 = 6787(0x1a83, float:9.51E-42)
            boolean r0 = X.C20800yB.A01(r10, r11, r0)
            if (r0 == 0) goto L_0x027a
            boolean r0 = r14.A1l()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A06 = r0
        L_0x027a:
            boolean r0 = r14.A1j()
            if (r0 == 0) goto L_0x02a0
            X.2P6 r1 = new X.2P6
            r1.<init>()
            r1.A01 = r13
            java.lang.Integer r0 = r14.A06
            r1.A02 = r0
            r0 = 7186(0x1c12, float:1.007E-41)
            boolean r0 = X.C20800yB.A01(r10, r11, r0)
            if (r0 == 0) goto L_0x029b
            boolean r0 = r14.A03
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.A00 = r0
        L_0x029b:
            X.0yW r0 = r6.A0E
            r0.Bly(r1)
        L_0x02a0:
            X.0yW r0 = r6.A0E
            r27 = r0
            r0.Bly(r2)
            X.1Au r1 = r6.A0S
            java.lang.Integer r15 = r14.A06
            X.3S2 r0 = r14.A05
            if (r0 == 0) goto L_0x02b5
            boolean r0 = r0.A0B
            r24 = 1
            if (r0 != 0) goto L_0x02b7
        L_0x02b5:
            r24 = 0
        L_0x02b7:
            boolean r0 = r14.A03
            r23 = r0
            X.1At r0 = r1.A01
            r26 = r0
            java.lang.Object r3 = r0.A04
            monitor-enter(r3)
            goto L_0x02d5
        L_0x02c3:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            goto L_0x0266
        L_0x02c8:
            r1 = 0
            goto L_0x0244
        L_0x02cb:
            r3 = 0
            goto L_0x0232
        L_0x02ce:
            r0 = 1
            goto L_0x012d
        L_0x02d1:
            long r0 = r7.A0I
            goto L_0x0020
        L_0x02d5:
            android.content.SharedPreferences r0 = X.C24021At.A00(r26)     // Catch:{ all -> 0x040a }
            java.lang.String r2 = "sticker_send_count"
            int r20 = r0.getInt(r2, r12)     // Catch:{ all -> 0x040a }
            android.content.SharedPreferences r0 = X.C24021At.A00(r26)     // Catch:{ all -> 0x040a }
            android.content.SharedPreferences$Editor r1 = r0.edit()     // Catch:{ all -> 0x040a }
            int r0 = r20 + 1
            android.content.SharedPreferences$Editor r0 = r1.putInt(r2, r0)     // Catch:{ all -> 0x040a }
            r0.apply()     // Catch:{ all -> 0x040a }
            monitor-exit(r3)     // Catch:{ all -> 0x040a }
            if (r15 == 0) goto L_0x02fa
            int r0 = r15.intValue()
            switch(r0) {
                case 1: goto L_0x02ff;
                case 2: goto L_0x031d;
                case 3: goto L_0x033b;
                case 4: goto L_0x0359;
                case 5: goto L_0x0377;
                case 6: goto L_0x0396;
                default: goto L_0x02fa;
            }
        L_0x02fa:
            if (r23 == 0) goto L_0x03d5
            monitor-enter(r3)
            goto L_0x03b5
        L_0x02ff:
            monitor-enter(r3)
            android.content.SharedPreferences r0 = X.C24021At.A00(r26)     // Catch:{ all -> 0x03f8 }
            java.lang.String r2 = "sticker_send_from_search_count"
            int r15 = r0.getInt(r2, r12)     // Catch:{ all -> 0x03f8 }
            android.content.SharedPreferences r0 = X.C24021At.A00(r26)     // Catch:{ all -> 0x03f8 }
            android.content.SharedPreferences$Editor r1 = r0.edit()     // Catch:{ all -> 0x03f8 }
            int r0 = r15 + 1
            android.content.SharedPreferences$Editor r0 = r1.putInt(r2, r0)     // Catch:{ all -> 0x03f8 }
            r0.apply()     // Catch:{ all -> 0x03f8 }
            monitor-exit(r3)     // Catch:{ all -> 0x03f8 }
            goto L_0x02fa
        L_0x031d:
            monitor-enter(r3)
            android.content.SharedPreferences r0 = X.C24021At.A00(r26)     // Catch:{ all -> 0x03fb }
            java.lang.String r2 = "sticker_send_from_forward_count"
            int r15 = r0.getInt(r2, r12)     // Catch:{ all -> 0x03fb }
            android.content.SharedPreferences r0 = X.C24021At.A00(r26)     // Catch:{ all -> 0x03fb }
            android.content.SharedPreferences$Editor r1 = r0.edit()     // Catch:{ all -> 0x03fb }
            int r0 = r15 + 1
            android.content.SharedPreferences$Editor r0 = r1.putInt(r2, r0)     // Catch:{ all -> 0x03fb }
            r0.apply()     // Catch:{ all -> 0x03fb }
            monitor-exit(r3)     // Catch:{ all -> 0x03fb }
            goto L_0x02fa
        L_0x033b:
            monitor-enter(r3)
            android.content.SharedPreferences r0 = X.C24021At.A00(r26)     // Catch:{ all -> 0x03fe }
            java.lang.String r2 = "sticker_send_from_recent_count"
            int r15 = r0.getInt(r2, r12)     // Catch:{ all -> 0x03fe }
            android.content.SharedPreferences r0 = X.C24021At.A00(r26)     // Catch:{ all -> 0x03fe }
            android.content.SharedPreferences$Editor r1 = r0.edit()     // Catch:{ all -> 0x03fe }
            int r0 = r15 + 1
            android.content.SharedPreferences$Editor r0 = r1.putInt(r2, r0)     // Catch:{ all -> 0x03fe }
            r0.apply()     // Catch:{ all -> 0x03fe }
            monitor-exit(r3)     // Catch:{ all -> 0x03fe }
            goto L_0x02fa
        L_0x0359:
            monitor-enter(r3)
            android.content.SharedPreferences r0 = X.C24021At.A00(r26)     // Catch:{ all -> 0x0401 }
            java.lang.String r2 = "sticker_send_from_favorites_count"
            int r15 = r0.getInt(r2, r12)     // Catch:{ all -> 0x0401 }
            android.content.SharedPreferences r0 = X.C24021At.A00(r26)     // Catch:{ all -> 0x0401 }
            android.content.SharedPreferences$Editor r1 = r0.edit()     // Catch:{ all -> 0x0401 }
            int r0 = r15 + 1
            android.content.SharedPreferences$Editor r0 = r1.putInt(r2, r0)     // Catch:{ all -> 0x0401 }
            r0.apply()     // Catch:{ all -> 0x0401 }
            monitor-exit(r3)     // Catch:{ all -> 0x0401 }
            goto L_0x02fa
        L_0x0377:
            monitor-enter(r3)
            android.content.SharedPreferences r0 = X.C24021At.A00(r26)     // Catch:{ all -> 0x0404 }
            java.lang.String r2 = "sticker_send_from_emotion_count"
            int r15 = r0.getInt(r2, r12)     // Catch:{ all -> 0x0404 }
            android.content.SharedPreferences r0 = X.C24021At.A00(r26)     // Catch:{ all -> 0x0404 }
            android.content.SharedPreferences$Editor r1 = r0.edit()     // Catch:{ all -> 0x0404 }
            int r0 = r15 + 1
            android.content.SharedPreferences$Editor r0 = r1.putInt(r2, r0)     // Catch:{ all -> 0x0404 }
            r0.apply()     // Catch:{ all -> 0x0404 }
            monitor-exit(r3)     // Catch:{ all -> 0x0404 }
            goto L_0x02fa
        L_0x0396:
            monitor-enter(r3)
            android.content.SharedPreferences r0 = X.C24021At.A00(r26)     // Catch:{ all -> 0x0407 }
            java.lang.String r2 = "sticker_send_from_pack_count"
            int r15 = r0.getInt(r2, r12)     // Catch:{ all -> 0x0407 }
            android.content.SharedPreferences r0 = X.C24021At.A00(r26)     // Catch:{ all -> 0x0407 }
            android.content.SharedPreferences$Editor r1 = r0.edit()     // Catch:{ all -> 0x0407 }
            int r0 = r15 + 1
            android.content.SharedPreferences$Editor r0 = r1.putInt(r2, r0)     // Catch:{ all -> 0x0407 }
            r0.apply()     // Catch:{ all -> 0x0407 }
            monitor-exit(r3)     // Catch:{ all -> 0x0407 }
            goto L_0x02fa
        L_0x03b5:
            android.content.SharedPreferences r0 = X.C24021At.A00(r26)     // Catch:{ all -> 0x03d2 }
            java.lang.String r2 = "sticker_send_animated_count"
            int r15 = r0.getInt(r2, r12)     // Catch:{ all -> 0x03d2 }
            android.content.SharedPreferences r0 = X.C24021At.A00(r26)     // Catch:{ all -> 0x03d2 }
            android.content.SharedPreferences$Editor r1 = r0.edit()     // Catch:{ all -> 0x03d2 }
            int r0 = r15 + 1
            android.content.SharedPreferences$Editor r0 = r1.putInt(r2, r0)     // Catch:{ all -> 0x03d2 }
            r0.apply()     // Catch:{ all -> 0x03d2 }
            monitor-exit(r3)     // Catch:{ all -> 0x03d2 }
            goto L_0x03d5
        L_0x03d2:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x03d2 }
            throw r0
        L_0x03d5:
            if (r24 == 0) goto L_0x040d
            monitor-enter(r3)
            android.content.SharedPreferences r0 = X.C24021At.A00(r26)     // Catch:{ all -> 0x03f5 }
            java.lang.String r2 = "sticker_send_first_party_count"
            int r15 = r0.getInt(r2, r12)     // Catch:{ all -> 0x03f5 }
            android.content.SharedPreferences r0 = X.C24021At.A00(r26)     // Catch:{ all -> 0x03f5 }
            android.content.SharedPreferences$Editor r1 = r0.edit()     // Catch:{ all -> 0x03f5 }
            int r0 = r15 + 1
            android.content.SharedPreferences$Editor r0 = r1.putInt(r2, r0)     // Catch:{ all -> 0x03f5 }
            r0.apply()     // Catch:{ all -> 0x03f5 }
            monitor-exit(r3)     // Catch:{ all -> 0x03f5 }
            goto L_0x040d
        L_0x03f5:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x03f5 }
            throw r0
        L_0x03f8:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x03f8 }
            throw r0
        L_0x03fb:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x03fb }
            throw r0
        L_0x03fe:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x03fe }
            throw r0
        L_0x0401:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0401 }
            throw r0
        L_0x0404:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0404 }
            throw r0
        L_0x0407:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0407 }
            throw r0
        L_0x040a:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x040a }
            throw r0
        L_0x040d:
            boolean r0 = r14.A1k()
            if (r0 == 0) goto L_0x0447
            X.2Q6 r1 = new X.2Q6
            r1.<init>()
            r1.A02 = r13
            java.lang.Integer r0 = r14.A06
            r1.A03 = r0
            boolean r0 = r14.A03
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.A00 = r0
            r0 = 4501(0x1195, float:6.307E-42)
            boolean r0 = X.C20800yB.A01(r10, r11, r0)
            if (r0 == 0) goto L_0x0442
            X.3S2 r2 = r14.A05
            if (r2 == 0) goto L_0x043b
            boolean r0 = r2.A0A
            if (r0 == 0) goto L_0x043b
            boolean r0 = r2.A08
            r2 = 1
            if (r0 != 0) goto L_0x043c
        L_0x043b:
            r2 = 0
        L_0x043c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r1.A01 = r0
        L_0x0442:
            r0 = r27
            r0.Bly(r1)
        L_0x0447:
            r2 = 0
            if (r18 == 0) goto L_0x09b6
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            r8.A09 = r0
            long r14 = X.C19970wo.A00(r34)
            long r0 = r7.A0I
            long r14 = r14 - r0
            long r14 = r14 / r16
            java.lang.Long r0 = java.lang.Long.valueOf(r14)
            r8.A0c = r0
            boolean r0 = r7 instanceof X.AnonymousClass2c8
            java.lang.Integer r13 = java.lang.Integer.valueOf(r0)
            r8.A0S = r13
            int r0 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x0486
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "MessageLogging/buildMessageSend Failed to log revoke duration; type="
            r1.append(r0)
            r1.append(r13)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r8.A0c = r0
        L_0x0486:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r22)
            r8.A06 = r0
            r20 = 1
            if (r9 <= r5) goto L_0x0499
            int r0 = r40 - r5
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r8.A0b = r0
        L_0x0499:
            int r0 = r7.A05
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r8.A0W = r0
            int r14 = r7.A1I
            boolean r0 = X.C66013Ui.A0L(r14)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r8.A04 = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r48)
            r8.A00 = r0
            if (r47 == 0) goto L_0x04cb
            boolean r0 = r7 instanceof X.AnonymousClass2bV
            if (r0 == 0) goto L_0x0993
            r0 = r7
            X.2bV r0 = (X.AnonymousClass2bV) r0
            byte[] r0 = r0.A1c()
            if (r0 == 0) goto L_0x04cb
            int r0 = r0.length
            double r0 = (double) r0
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
        L_0x04c9:
            r8.A0F = r0
        L_0x04cb:
            boolean r0 = r7 instanceof X.AnonymousClass0p5
            if (r0 != 0) goto L_0x04d8
            r0 = 87
            if (r14 == r0) goto L_0x04d8
            r0 = 88
            r1 = 0
            if (r14 != r0) goto L_0x04d9
        L_0x04d8:
            r1 = 1
        L_0x04d9:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r8.A08 = r0
            X.3T1 r1 = r7.A0S()
            r0 = 0
            if (r1 == 0) goto L_0x04e7
            r0 = 1
        L_0x04e7:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r8.A02 = r0
            r0 = r43
            if (r43 <= 0) goto L_0x0506
            double r0 = (double) r0
            r12 = 4652218415073722368(0x4090000000000000, double:1024.0)
            double r0 = r0 / r12
            double r0 = java.lang.Math.ceil(r0)
            long r12 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r12)
            r8.A0X = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r44)
            r8.A0O = r0
        L_0x0506:
            X.1EQ r15 = r6.A0L
            long r0 = r15.A00
            long r12 = r15.A01
            long r0 = r0 - r12
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 < 0) goto L_0x051f
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 <= 0) goto L_0x051f
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r8.A0d = r0
            r15.A01 = r2
            r15.A00 = r2
        L_0x051f:
            r0 = r38
            r8.A0K = r0
            java.lang.Integer r0 = r6.A07(r7)
            r8.A0G = r0
            if (r25 == 0) goto L_0x098f
            r0 = r7
            X.2bx r0 = (X.C46962bx) r0
            boolean r0 = r0.A1j()
            if (r0 == 0) goto L_0x098f
        L_0x0534:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r20)
            r8.A0C = r0
            int r0 = r6.A0B(r4)
            if (r0 == 0) goto L_0x0546
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8.A0H = r0
        L_0x0546:
            r0 = r45
            if (r45 == 0) goto L_0x0551
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r8.A0f = r0
        L_0x0551:
            boolean r0 = X.C66013Ui.A0q(r7)
            if (r0 == 0) goto L_0x0562
            X.0wU r2 = r6.A0V
            r1 = 6
            X.1iz r0 = new X.1iz
            r0.<init>(r6, r7, r1)
            r2.Boy(r0)
        L_0x0562:
            r0 = 2430(0x97e, float:3.405E-42)
            boolean r0 = X.C20800yB.A01(r10, r11, r0)
            if (r0 == 0) goto L_0x059d
            boolean r0 = r7 instanceof X.AnonymousClass2bV
            if (r0 == 0) goto L_0x059d
            r3 = r7
            X.2bV r3 = (X.AnonymousClass2bV) r3
            X.1DU r2 = r6.A0I
            java.lang.String r0 = r3.A0b()
            java.lang.String r0 = r2.A03(r0)
            if (r0 == 0) goto L_0x059d
            X.2Q1 r1 = new X.2Q1
            r1.<init>()
            int r0 = X.AnonymousClass3UK.A05(r7)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A01 = r0
            java.lang.Integer r0 = r6.A09(r3)
            r1.A00 = r0
            java.lang.Integer r0 = A05(r11, r2, r3)
            r1.A02 = r0
            X.0yW r0 = r6.A0E
            r0.Bly(r1)
        L_0x059d:
            X.0yW r2 = r6.A0E
            r2.Bly(r8)
            if (r22 == 0) goto L_0x06b7
            X.2Sn r3 = new X.2Sn
            r3.<init>()
            r12 = r33
            r1 = r32
            r0 = r31
            int r0 = X.C55802vD.A00(r12, r7, r1, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A09 = r0
            int r0 = X.AnonymousClass3UK.A05(r7)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A0A = r0
            r0 = r30
            java.lang.Integer r0 = X.AnonymousClass3UK.A06(r0, r4)
            r3.A0B = r0
            boolean r0 = X.C66013Ui.A0l(r7)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.A01 = r0
            int r1 = r7.A06
            r15 = 0
            r12 = 2
            r0 = 0
            if (r1 < r12) goto L_0x05dd
            r0 = 1
        L_0x05dd:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.A00 = r0
            r0 = 3
            r13 = 0
            if (r1 < r0) goto L_0x05e8
            r13 = 1
        L_0x05e8:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r13)
            r3.A03 = r0
            r0 = 4
            if (r1 < r0) goto L_0x05f2
            r15 = 1
        L_0x05f2:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r15)
            r3.A04 = r0
            java.lang.Integer r0 = r3.A0A
            int r0 = r0.intValue()
            if (r0 != r5) goto L_0x060c
            X.0wQ r1 = r6.A02
            r0 = r29
            java.lang.Boolean r0 = A02(r1, r0)
            if (r0 == 0) goto L_0x060c
            r3.A02 = r0
        L_0x060c:
            java.lang.Integer r0 = r28.A04()
            int r0 = r0.intValue()
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.A0E = r0
            if (r21 == 0) goto L_0x062d
            r1 = r4
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            r0 = r28
            int r0 = r0.A00(r1)
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.A0D = r0
        L_0x062d:
            r1 = 0
            r0 = r30
            X.3Qp r1 = r0.A09(r4, r1)
            if (r1 == 0) goto L_0x0670
            X.3un r0 = r1.A0b
            int r0 = r0.disappearingMessagesInitiator
            r13 = 2
            if (r0 == 0) goto L_0x098c
            if (r0 != r12) goto L_0x0640
            r13 = 3
        L_0x0640:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)
            r3.A05 = r0
            r0 = 5309(0x14bd, float:7.44E-42)
            boolean r0 = X.C20800yB.A01(r10, r11, r0)
            if (r0 == 0) goto L_0x0670
            X.3Id r1 = r1.A0a
            if (r1 == 0) goto L_0x0670
            int r0 = r1.A00
            int r0 = X.AnonymousClass3UK.A01(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A07 = r0
            java.lang.Boolean r0 = r1.A01
            if (r0 == 0) goto L_0x0670
            boolean r1 = r0.booleanValue()
            r0 = 2
            if (r1 == 0) goto L_0x066a
            r0 = 1
        L_0x066a:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A06 = r0
        L_0x0670:
            r0 = 5431(0x1537, float:7.61E-42)
            boolean r0 = X.C20800yB.A01(r10, r11, r0)
            if (r0 == 0) goto L_0x06ab
            X.3Ky r13 = r7.A0O()
            java.lang.Long r0 = r7.A0h
            if (r0 == 0) goto L_0x0989
            X.1EP r12 = r6.A0A
            long r0 = r0.longValue()
            X.6A5 r1 = r12.A00(r0)
            if (r4 == 0) goto L_0x0989
            if (r13 == 0) goto L_0x0989
            if (r1 == 0) goto L_0x0989
            X.16D r0 = r6.A04
            com.whatsapp.jid.UserJid r12 = r13.A01
            X.141 r0 = r0.A08(r12)
            if (r0 == 0) goto L_0x0989
            X.3L0 r12 = r0.A0E
            if (r12 == 0) goto L_0x0989
            boolean r0 = r12.A02()
            if (r0 == 0) goto L_0x0968
            r1 = 4
        L_0x06a5:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r3.A08 = r0
        L_0x06ab:
            int r0 = r7.A05
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.A0C = r0
            r2.Blw(r3)
        L_0x06b7:
            X.0v5 r0 = r6.A01
            boolean r0 = r0.A05()
            if (r0 == 0) goto L_0x06e4
            r0 = r35
            if (r0 != r5) goto L_0x06e4
            if (r18 != 0) goto L_0x06e4
            r0 = 2097152(0x200000, float:2.938736E-39)
            boolean r0 = r7.A1T(r0)
            if (r0 != 0) goto L_0x06e4
            boolean r0 = r4 instanceof X.C177538dx
            if (r0 == 0) goto L_0x06e4
            X.13q r0 = X.AnonymousClass11F.A00
            X.144 r0 = X.AnonymousClass6H4.A00(r4)
            if (r0 == 0) goto L_0x06e4
            X.0wU r3 = r6.A0V
            r1 = 4
            X.1iz r0 = new X.1iz
            r0.<init>(r6, r7, r1)
            r3.Boy(r0)
        L_0x06e4:
            java.lang.Long r0 = r8.A0Y
            if (r0 == 0) goto L_0x073d
            java.lang.Long r0 = r8.A0b
            if (r0 != 0) goto L_0x073d
            java.lang.Integer r0 = r8.A0Q
            if (r0 == 0) goto L_0x073d
            int r0 = r0.intValue()
            if (r0 != r5) goto L_0x073d
            java.lang.Boolean r0 = r8.A06
            if (r0 == 0) goto L_0x073d
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x073d
            java.lang.Integer r0 = r8.A0R
            if (r0 == 0) goto L_0x073d
            int r0 = r0.intValue()
            if (r0 != r5) goto L_0x073d
            java.lang.Integer r0 = r8.A0P
            if (r0 == 0) goto L_0x073d
            int r0 = r0.intValue()
            if (r0 != r5) goto L_0x073d
            r0 = 1625(0x659, float:2.277E-42)
            int r1 = X.C20800yB.A00(r10, r11, r0)
            if (r1 <= 0) goto L_0x073d
            java.lang.Long r0 = r8.A0Y
            long r10 = r0.longValue()
            long r0 = (long) r1
            int r3 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r3 < 0) goto L_0x073d
            X.2PC r3 = new X.2PC
            r3.<init>()
            java.lang.String r10 = "message_send"
            r3.A02 = r10
            java.lang.Long r8 = r8.A0Y
            r3.A00 = r8
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.A01 = r0
            r2.Blv(r3)
        L_0x073d:
            if (r18 != 0) goto L_0x08bb
            r0 = 131072(0x20000, float:1.83671E-40)
            boolean r0 = r7.A1T(r0)
            if (r0 != 0) goto L_0x08c4
        L_0x0747:
            boolean r0 = r7 instanceof X.AnonymousClass5J2
            if (r0 == 0) goto L_0x07e6
            r9 = r7
            X.2bM r9 = (X.AnonymousClass2bM) r9
            X.1A1 r2 = r6.A0U
            long r0 = r9.A01
            X.175 r2 = r2.A01
            X.3T1 r8 = r2.A01(r0)
            X.1EK r3 = r6.A0O
            boolean r0 = r9 instanceof X.AnonymousClass5J2
            if (r0 == 0) goto L_0x07e6
            X.2Rk r2 = new X.2Rk
            r2.<init>()
            r10 = r9
            X.5J2 r10 = (X.AnonymousClass5J2) r10
            int r0 = r10.A00
            r12 = 2
            r11 = 1
            if (r0 != r5) goto L_0x08b5
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
        L_0x0770:
            r2.A05 = r0
            X.3Qa r0 = r9.A1J
            X.11F r9 = r0.A00
            r1 = 0
            if (r9 == 0) goto L_0x07ad
            boolean r0 = X.AnonymousClass143.A0G(r9)
            if (r0 == 0) goto L_0x08ad
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            r2.A00 = r0
            android.os.Parcelable$Creator r0 = X.AnonymousClass147.CREATOR
            X.147 r9 = X.C65533Sl.A03(r9)
            if (r9 == 0) goto L_0x07ad
            X.1EM r0 = r3.A05
            int r0 = r0.A00(r9)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A03 = r0
            X.17X r1 = r3.A00
            boolean r0 = r1.A0C(r9)
            if (r0 == 0) goto L_0x07ad
            boolean r0 = r1.A0D(r9)
            if (r0 == 0) goto L_0x08a7
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
        L_0x07ab:
            r2.A02 = r0
        L_0x07ad:
            if (r8 == 0) goto L_0x08a1
            X.005 r0 = r3.A06
            r0.get()
            X.1DW r9 = r3.A01
            X.1AW r1 = r3.A03
            X.1EO r0 = r3.A04
            int r0 = X.C55802vD.A00(r9, r8, r1, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x07c2:
            r2.A04 = r0
            int r0 = r10.A1X()
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A06 = r0
            if (r8 == 0) goto L_0x089e
            X.3Qa r0 = r8.A1J
            if (r0 == 0) goto L_0x089e
            boolean r0 = r0.A02
            if (r0 != r5) goto L_0x089e
        L_0x07d9:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r11)
            r2.A01 = r0
            X.0yW r1 = r3.A02
            X.0u5 r0 = X.AnonymousClass1EK.A07
            r1.Blx(r2, r0)
        L_0x07e6:
            X.1DV r1 = r6.A0W
            boolean r0 = r1.A02(r4)
            if (r0 == 0) goto L_0x0895
            r0 = 2
        L_0x07ef:
            r6.A0L(r7, r0)
        L_0x07f2:
            boolean r0 = r4 instanceof X.C177528dw
            if (r0 == 0) goto L_0x081e
            r0 = r35
            if (r0 != r5) goto L_0x0891
            java.lang.String r4 = "success"
        L_0x07fc:
            X.005 r0 = r6.A0Z
            java.lang.Object r3 = r0.get()
            X.1Xt r3 = (X.C29731Xt) r3
            int r0 = r7.A0C
            long r1 = (long) r0
            java.lang.String r0 = "success"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x088b
            boolean r0 = X.C66013Ui.A0n(r7)
            X.1Xw r2 = r3.A0A
            r1 = 14
            if (r0 == 0) goto L_0x081a
            r1 = 5
        L_0x081a:
            r0 = 0
            X.C29761Xw.A02(r7, r2, r0, r0, r1)
        L_0x081e:
            X.3T1 r10 = r7.A0S()
            if (r10 == 0) goto L_0x09c1
            X.3Qa r3 = r10.A1J
            X.11F r0 = r3.A00
            boolean r0 = r0 instanceof X.C177528dw
            if (r0 == 0) goto L_0x09c1
            r9 = 1
            r0 = r35
            if (r0 == r5) goto L_0x0832
            r9 = 3
        L_0x0832:
            r2 = r33
            r1 = r32
            r0 = r31
            int r0 = X.C55802vD.A00(r2, r7, r1, r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            X.005 r0 = r6.A0Z
            java.lang.Object r8 = r0.get()
            X.1Xt r8 = (X.C29731Xt) r8
            java.lang.Integer r0 = r6.A08(r7, r1)
            int r11 = r0.intValue()
            if (r9 != r5) goto L_0x087e
            X.3Ao r1 = r8.A00
            if (r1 == 0) goto L_0x085c
            int r0 = r1.A02
            int r0 = r0 + 1
            r1.A02 = r0
        L_0x085c:
            X.3Rn r0 = r8.A01
            if (r0 == 0) goto L_0x087e
            java.util.Map r1 = r0.A0B
            com.whatsapp.jid.UserJid r0 = X.AnonymousClass3MO.A00(r10)
            java.lang.Object r0 = r1.get(r0)
            X.3An r0 = (X.C61093An) r0
            if (r0 == 0) goto L_0x087e
            java.util.Map r0 = r0.A08
            java.lang.Object r1 = r0.get(r3)
            X.3OI r1 = (X.AnonymousClass3OI) r1
            if (r1 == 0) goto L_0x087e
            int r0 = r1.A00
            int r0 = r0 + 1
            r1.A00 = r0
        L_0x087e:
            X.0wU r0 = r8.A0C
            r12 = 8
            X.1iQ r7 = new X.1iQ
            r7.<init>(r8, r9, r10, r11, r12)
            r0.Boy(r7)
            return
        L_0x088b:
            X.1Xw r0 = r3.A0A
            r0.A03(r7, r4, r1)
            goto L_0x081e
        L_0x0891:
            java.lang.String r4 = "error_unknown"
            goto L_0x07fc
        L_0x0895:
            boolean r0 = r1.A03(r4)
            if (r0 == 0) goto L_0x07f2
            r0 = 3
            goto L_0x07ef
        L_0x089e:
            r11 = 0
            goto L_0x07d9
        L_0x08a1:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            goto L_0x07c2
        L_0x08a7:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)
            goto L_0x07ab
        L_0x08ad:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r2.A00 = r0
            goto L_0x07ad
        L_0x08b5:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)
            goto L_0x0770
        L_0x08bb:
            int r1 = X.AnonymousClass3UK.A05(r7)
            if (r1 == r5) goto L_0x08cf
            r0 = 2
            if (r1 == r0) goto L_0x08cf
        L_0x08c4:
            int r1 = X.AnonymousClass3UK.A05(r7)
            if (r1 == r5) goto L_0x090f
            r0 = 2
            if (r1 == r0) goto L_0x090f
            goto L_0x0747
        L_0x08cf:
            X.2RS r3 = new X.2RS
            r3.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r3.A01 = r0
            boolean r0 = r7 instanceof X.AnonymousClass2c8
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A02 = r0
            long r10 = X.C19970wo.A00(r34)
            long r0 = r7.A0I
            long r10 = r10 - r0
            long r10 = r10 / r16
            java.lang.Long r0 = java.lang.Long.valueOf(r10)
            r3.A05 = r0
            if (r9 <= r5) goto L_0x08fc
            int r0 = r40 - r5
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.A03 = r0
        L_0x08fc:
            int r0 = r7.A0C
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.A04 = r0
            r0 = r19
            r3.A00 = r0
            X.0u5 r0 = A0f
            r2.Blx(r3, r0)
            goto L_0x08c4
        L_0x090f:
            X.2Rs r3 = new X.2Rs
            r3.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r3.A03 = r0
            int r0 = r7.A01
            java.lang.Integer r0 = A03(r0)
            r3.A01 = r0
            long r10 = X.C19970wo.A00(r34)
            long r0 = r7.A0I
            long r10 = r10 - r0
            long r10 = r10 / r16
            java.lang.Long r0 = java.lang.Long.valueOf(r10)
            r3.A05 = r0
            if (r9 <= r5) goto L_0x093c
            int r9 = r40 - r5
            long r0 = (long) r9
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.A06 = r0
        L_0x093c:
            int r0 = r7.A0C
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.A07 = r0
            r0 = r19
            r3.A00 = r0
            int r1 = r7.A09
            boolean r0 = X.C66013Ui.A0q(r7)
            int r0 = X.AnonymousClass6UH.A01(r14, r1, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A02 = r0
            r0 = r30
            java.lang.Integer r0 = X.AnonymousClass3UK.A06(r0, r4)
            r3.A04 = r0
            X.0u5 r0 = A0f
            r2.Blx(r3, r0)
            goto L_0x0747
        L_0x0968:
            boolean r0 = r12.A01()
            if (r0 == 0) goto L_0x0989
            java.lang.String r1 = r1.A00
            if (r1 == 0) goto L_0x0983
            java.lang.String r0 = "UTILITY"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0986
            java.lang.String r0 = "MARKETING"
            boolean r0 = r1.equals(r0)
            r1 = 1
            if (r0 != 0) goto L_0x06a5
        L_0x0983:
            r1 = 3
            goto L_0x06a5
        L_0x0986:
            r1 = 2
            goto L_0x06a5
        L_0x0989:
            r1 = 0
            goto L_0x06a5
        L_0x098c:
            r13 = 1
            goto L_0x0640
        L_0x098f:
            r20 = 0
            goto L_0x0534
        L_0x0993:
            X.1EJ r13 = r6.A0G
            X.02c r1 = X.C004702c.A00
            X.3IP r0 = new X.3IP
            r0.<init>(r1, r12)
            r13.BON(r0, r7)
            X.3Kz r12 = r7.A0V()
            if (r12 == 0) goto L_0x04cb
            monitor-enter(r12)
            byte[] r0 = r12.A03     // Catch:{ all -> 0x09be }
            if (r0 != 0) goto L_0x09ab
            goto L_0x09b2
        L_0x09ab:
            int r0 = r0.length     // Catch:{ all -> 0x09be }
            double r0 = (double) r0     // Catch:{ all -> 0x09be }
            java.lang.Double r0 = java.lang.Double.valueOf(r0)     // Catch:{ all -> 0x09be }
            goto L_0x09b3
        L_0x09b2:
            r0 = 0
        L_0x09b3:
            monitor-exit(r12)
            goto L_0x04c9
        L_0x09b6:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r12)
            r8.A09 = r0
            goto L_0x0486
        L_0x09be:
            r0 = move-exception
            monitor-exit(r12)
            throw r0
        L_0x09c1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1DT.A0P(X.3T1, java.lang.Integer, int, int, int, int, int, int, int, boolean, boolean, boolean, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01c1, code lost:
        if (r14 == 88) goto L_0x01c3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0Q(X.AnonymousClass3T1 r30, java.util.Collection r31, int r32, int r33, int r34, int r35, int r36, int r37, int r38, int r39, long r40, long r42, long r44, boolean r46, boolean r47, boolean r48, boolean r49, boolean r50) {
        /*
            r29 = this;
            r7 = r30
            r13 = r36
            r8 = r35
            X.3Qa r11 = r7.A1J
            boolean r0 = r11.A02
            if (r0 == 0) goto L_0x02e5
            boolean r0 = r7.A1P()
            if (r0 == 0) goto L_0x02e5
            X.2T7 r1 = new X.2T7
            r1.<init>()
            java.lang.Long r0 = java.lang.Long.valueOf(r44)
            r1.A0O = r0
            r19 = r40
            java.lang.Long r0 = java.lang.Long.valueOf(r19)
            r1.A0M = r0
            r17 = r42
            java.lang.Long r0 = java.lang.Long.valueOf(r17)
            r1.A0N = r0
            boolean r0 = r7 instanceof X.AnonymousClass2bO
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.A07 = r0
            r0 = r29
            X.1DW r4 = r0.A0B
            X.1AW r3 = r0.A0P
            X.1EO r2 = r0.A0Q
            int r2 = X.C55802vD.A00(r4, r7, r3, r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.A0H = r2
            r28 = r32
            java.lang.Integer r2 = java.lang.Integer.valueOf(r28)
            r1.A0J = r2
            int r2 = X.AnonymousClass3UK.A05(r7)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.A0I = r2
            X.12q r2 = r0.A07
            r12 = 1
            X.AnonymousClass00C.A0D(r2, r12)
            X.11F r6 = r11.A00
            java.lang.Integer r2 = X.AnonymousClass3UK.A06(r2, r6)
            r1.A0K = r2
            r9 = 1
            boolean r2 = r7.A1T(r12)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r1.A06 = r2
            int r14 = r7.A1I
            boolean r2 = X.C66013Ui.A0L(r14)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r1.A08 = r2
            r2 = r34
            long r2 = (long) r2
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r1.A0V = r2
            r2 = r33
            long r2 = (long) r2
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r1.A0U = r2
            boolean r2 = X.C66013Ui.A0s(r7)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r1.A05 = r2
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r46)
            r1.A0B = r2
            int r2 = r7.A01
            java.lang.Integer r2 = A03(r2)
            r1.A0F = r2
            X.1ED r5 = r0.A0c
            monitor-enter(r5)
            r4 = 0
            if (r6 == 0) goto L_0x00bc
            java.util.Map r2 = r5.A00     // Catch:{ all -> 0x0206 }
            java.lang.Object r2 = r2.get(r6)     // Catch:{ all -> 0x0206 }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ all -> 0x0206 }
            if (r2 == 0) goto L_0x00bc
            int r4 = r2.intValue()     // Catch:{ all -> 0x0206 }
        L_0x00bc:
            monitor-exit(r5)
            if (r4 <= 0) goto L_0x0131
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r12)
            r1.A0D = r2
        L_0x00c5:
            X.0yC r10 = r0.A0D
            X.0yV r3 = X.C21000yV.A01
            r2 = 767(0x2ff, float:1.075E-42)
            int r2 = X.C20800yB.A00(r3, r10, r2)
            if (r8 >= r2) goto L_0x00d3
            if (r4 < r2) goto L_0x00d9
        L_0x00d3:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r12)
            r1.A0C = r2
        L_0x00d9:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r48)
            r1.A00 = r2
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r49)
            r1.A03 = r2
            r3 = 5
            r2 = r28
            if (r2 != r3) goto L_0x00fc
            r2 = r37
            long r2 = (long) r2
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r1.A0Q = r2
            r2 = r38
            long r2 = (long) r2
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r1.A0Y = r2
        L_0x00fc:
            boolean r2 = X.AnonymousClass143.A0G(r6)
            r23 = r39
            if (r2 != 0) goto L_0x0138
            boolean r2 = r6 instanceof X.C177618e5
            if (r2 != 0) goto L_0x0138
            if (r31 == 0) goto L_0x01b0
            java.util.Iterator r13 = r31.iterator()
            r8 = 0
        L_0x010f:
            boolean r2 = r13.hasNext()
            if (r2 == 0) goto L_0x01a2
            java.lang.Object r12 = r13.next()
            com.whatsapp.jid.DeviceJid r12 = (com.whatsapp.jid.DeviceJid) r12
            X.0wQ r3 = r0.A02
            com.whatsapp.jid.UserJid r2 = r12.userJid
            boolean r2 = r3.A0M(r2)
            if (r2 != 0) goto L_0x012e
            boolean r2 = r3.A0N(r12)
            if (r2 != 0) goto L_0x012e
            int r8 = r8 + 1
            goto L_0x010f
        L_0x012e:
            int r9 = r9 + 1
            goto L_0x010f
        L_0x0131:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r47)
            r1.A01 = r2
            goto L_0x00c5
        L_0x0138:
            if (r39 <= 0) goto L_0x0155
            r2 = r23
            long r2 = (long) r2
            r15 = 32
            int r9 = (r2 > r15 ? 1 : (r2 == r15 ? 0 : -1))
            if (r9 > 0) goto L_0x0145
            r2 = 32
        L_0x0145:
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r1.A0R = r2
            int r2 = X.AnonymousClass3UK.A03(r23)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.A0G = r2
        L_0x0155:
            if (r31 == 0) goto L_0x01b0
            int r9 = r31.size()
            if (r9 <= 0) goto L_0x01b0
            long r2 = (long) r9
            r15 = 32
            int r12 = (r2 > r15 ? 1 : (r2 == r15 ? 0 : -1))
            if (r12 > 0) goto L_0x0166
            r2 = 32
        L_0x0166:
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r1.A0L = r2
            int r2 = X.AnonymousClass3UK.A00(r9)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.A0E = r2
            if (r4 <= 0) goto L_0x019e
            r8 = r4
        L_0x0179:
            double r2 = (double) r8
            r21 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r2 = r2 * r21
            double r8 = (double) r9
            double r2 = r2 / r8
            double r2 = java.lang.Math.ceil(r2)
            long r15 = (long) r2
            java.lang.Long r2 = java.lang.Long.valueOf(r15)
            r1.A0P = r2
            if (r36 >= 0) goto L_0x018e
            r13 = 0
        L_0x018e:
            double r2 = (double) r13
            double r2 = r2 * r21
            double r2 = r2 / r8
            double r2 = java.lang.Math.ceil(r2)
            long r8 = (long) r2
            java.lang.Long r2 = java.lang.Long.valueOf(r8)
            r1.A0X = r2
            goto L_0x01b0
        L_0x019e:
            if (r35 >= 0) goto L_0x0179
            r8 = 0
            goto L_0x0179
        L_0x01a2:
            long r2 = (long) r9
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r1.A0W = r2
            long r2 = (long) r8
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r1.A0T = r2
        L_0x01b0:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r50)
            r1.A02 = r2
            boolean r2 = r7 instanceof X.AnonymousClass0p5
            if (r2 != 0) goto L_0x01c3
            r2 = 87
            if (r14 == r2) goto L_0x01c3
            r2 = 88
            r3 = 0
            if (r14 != r2) goto L_0x01c4
        L_0x01c3:
            r3 = 1
        L_0x01c4:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r3)
            r1.A0A = r2
            java.lang.Integer r2 = r1.A0H
            boolean r2 = r0.A0V(r6, r2)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r1.A04 = r2
            X.0wk r3 = r0.A0e
            r27 = 0
            X.1iX r2 = new X.1iX
            r24 = r1
            r25 = r7
            r26 = r23
            r22 = r2
            r23 = r0
            r22.<init>(r23, r24, r25, r26, r27)
            r3.execute(r2)
            long r2 = android.os.SystemClock.uptimeMillis()
            r7.A1S = r2
            r3 = 3
            r2 = r28
            if (r2 != r3) goto L_0x020a
            if (r4 <= 0) goto L_0x020a
            monitor-enter(r5)
            if (r6 == 0) goto L_0x0209
            java.util.Map r3 = r5.A00     // Catch:{ all -> 0x0206 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r27)     // Catch:{ all -> 0x0206 }
            r3.put(r6, r2)     // Catch:{ all -> 0x0206 }
            goto L_0x0209
        L_0x0206:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x0209:
            monitor-exit(r5)
        L_0x020a:
            boolean r2 = r0.A0a
            if (r2 == 0) goto L_0x028b
            X.1EE r2 = r0.A0N
            java.lang.String r3 = r11.A01
            int r13 = r3.hashCode()
            java.lang.Integer r3 = r1.A0J
            if (r3 == 0) goto L_0x028b
            int r4 = r3.intValue()
            r3 = 3
            if (r4 != r3) goto L_0x0282
            X.0zf r3 = r2.A02
            long r15 = (long) r14
            java.lang.String r14 = "wa_type"
            X.0ze r11 = r3.A05
            X.0zg r3 = r3.A04
            int r12 = r3.A06
            r11.markerAnnotate((int) r12, (int) r13, (java.lang.String) r14, (long) r15)
            r1.toString()
            java.lang.Class r3 = r1.getClass()
            java.lang.reflect.Field[] r6 = r3.getDeclaredFields()
            if (r6 == 0) goto L_0x0282
            int r5 = r6.length
            if (r5 <= 0) goto L_0x0282
            r4 = 0
        L_0x0240:
            r3 = r6[r4]
            java.lang.Object r7 = r3.get(r1)     // Catch:{ IllegalAccessException -> 0x027d }
            if (r7 == 0) goto L_0x027d
            java.lang.String r14 = r3.getName()     // Catch:{ IllegalAccessException -> 0x027d }
            boolean r3 = r7 instanceof java.lang.Integer     // Catch:{ IllegalAccessException -> 0x027d }
            if (r3 == 0) goto L_0x025b
            java.lang.Number r7 = (java.lang.Number) r7     // Catch:{ IllegalAccessException -> 0x027d }
            int r3 = r7.intValue()     // Catch:{ IllegalAccessException -> 0x027d }
            long r15 = (long) r3     // Catch:{ IllegalAccessException -> 0x027d }
        L_0x0257:
            r11.markerAnnotate((int) r12, (int) r13, (java.lang.String) r14, (long) r15)     // Catch:{ IllegalAccessException -> 0x027d }
            goto L_0x027d
        L_0x025b:
            boolean r3 = r7 instanceof java.lang.Long     // Catch:{ IllegalAccessException -> 0x027d }
            if (r3 == 0) goto L_0x0266
            java.lang.Number r7 = (java.lang.Number) r7     // Catch:{ IllegalAccessException -> 0x027d }
            long r15 = r7.longValue()     // Catch:{ IllegalAccessException -> 0x027d }
            goto L_0x0257
        L_0x0266:
            boolean r3 = r7 instanceof java.lang.Boolean     // Catch:{ IllegalAccessException -> 0x027d }
            if (r3 == 0) goto L_0x0274
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch:{ IllegalAccessException -> 0x027d }
            boolean r3 = r7.booleanValue()     // Catch:{ IllegalAccessException -> 0x027d }
            r11.markerAnnotate((int) r12, (int) r13, (java.lang.String) r14, (boolean) r3)     // Catch:{ IllegalAccessException -> 0x027d }
            goto L_0x027d
        L_0x0274:
            boolean r3 = r7 instanceof java.lang.String     // Catch:{ IllegalAccessException -> 0x027d }
            if (r3 == 0) goto L_0x027d
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ IllegalAccessException -> 0x027d }
            r11.markerAnnotate((int) r12, (int) r13, (java.lang.String) r14, (java.lang.String) r7)     // Catch:{ IllegalAccessException -> 0x027d }
        L_0x027d:
            int r4 = r4 + 1
            if (r4 >= r5) goto L_0x0282
            goto L_0x0240
        L_0x0282:
            java.lang.Integer r3 = r1.A0J
            int r3 = r3.intValue()
            r2.A03(r13, r3)
        L_0x028b:
            r2 = 920(0x398, float:1.289E-42)
            X.0yV r4 = X.C21000yV.A02
            int r3 = X.C20800yB.A00(r4, r10, r2)
            r2 = 1488(0x5d0, float:2.085E-42)
            int r6 = X.C20800yB.A00(r4, r10, r2)
            if (r46 != 0) goto L_0x02b8
            if (r6 <= 0) goto L_0x02b8
            if (r6 <= r3) goto L_0x02b8
            r2 = 919(0x397, float:1.288E-42)
            boolean r2 = X.C20800yB.A01(r4, r10, r2)
            if (r2 == 0) goto L_0x02b8
            long r2 = (long) r3
            int r5 = (r40 > r2 ? 1 : (r40 == r2 ? 0 : -1))
            if (r5 < 0) goto L_0x02b8
            long r2 = (long) r6
            int r5 = (r40 > r2 ? 1 : (r40 == r2 ? 0 : -1))
            if (r5 > 0) goto L_0x02b8
            java.lang.String r5 = "MessageLogging/AbsDurationTooHigh"
            r2 = r19
            r0.A0A(r1, r5, r2)
        L_0x02b8:
            r2 = 1072(0x430, float:1.502E-42)
            int r3 = X.C20800yB.A00(r4, r10, r2)
            r2 = 1489(0x5d1, float:2.087E-42)
            int r5 = X.C20800yB.A00(r4, r10, r2)
            if (r46 != 0) goto L_0x02e5
            if (r48 != 0) goto L_0x02e5
            if (r5 <= 0) goto L_0x02e5
            if (r5 <= r3) goto L_0x02e5
            r2 = 1126(0x466, float:1.578E-42)
            boolean r2 = X.C20800yB.A01(r4, r10, r2)
            if (r2 == 0) goto L_0x02e5
            long r3 = (long) r3
            int r2 = (r42 > r3 ? 1 : (r42 == r3 ? 0 : -1))
            if (r2 < 0) goto L_0x02e5
            long r3 = (long) r5
            int r2 = (r42 > r3 ? 1 : (r42 == r3 ? 0 : -1))
            if (r2 > 0) goto L_0x02e5
            java.lang.String r4 = "MessageLogging/RelativeDurationTooHigh"
            r2 = r17
            r0.A0A(r1, r4, r2)
        L_0x02e5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1DT.A0Q(X.3T1, java.util.Collection, int, int, int, int, int, int, int, int, long, long, long, boolean, boolean, boolean, boolean, boolean):void");
    }
}
