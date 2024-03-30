package X;

import android.util.Base64;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1AB  reason: invalid class name */
public class AnonymousClass1AB implements AnonymousClass195 {
    public final C19730wQ A00;
    public final C237119n A01;
    public final C19970wo A02;
    public final AnonymousClass189 A03;
    public final AnonymousClass1AC A04;
    public final C20810yC A05;
    public final C21010yW A06;

    public static Integer A00(int i) {
        if (!(i == 0 || i == 1)) {
            if (!(i == 2 || i == 3)) {
                if (i != 4) {
                    if (i != 5) {
                        return null;
                    }
                }
            }
            return 2;
        }
        return 1;
    }

    public static Integer A01(int i) {
        int i2 = 1;
        if (i != 0) {
            int i3 = 5;
            if (i != 1) {
                i2 = 2;
                if (i != 2) {
                    i2 = 3;
                    if (i != 3) {
                        i2 = 4;
                        if (i != 4) {
                            i3 = 6;
                            if (i != 5) {
                                return null;
                            }
                        }
                    }
                }
            }
            return Integer.valueOf(i3);
        }
        return Integer.valueOf(i2);
    }

    public static Integer A03(String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case -849492943:
                    if (str.equals("regular_low")) {
                        return 2;
                    }
                    break;
                case -564602779:
                    if (str.equals("regular_high")) {
                        return 3;
                    }
                    break;
                case -498584183:
                    if (str.equals("critical_unblock_low")) {
                        return 5;
                    }
                    break;
                case 207170541:
                    if (str.equals("critical_block")) {
                        return 4;
                    }
                    break;
                case 1086463900:
                    if (str.equals("regular")) {
                        return 1;
                    }
                    break;
            }
        }
        return null;
    }

    public static String A04(AnonymousClass3FZ r7, AnonymousClass3FZ r8) {
        String str;
        if (r7 == null) {
            str = "SyncStatsManager/createBootstrapSessionId companionKey is null";
        } else if (r8 == null) {
            str = "SyncStatsManager/createBootstrapSessionId primaryKey is null";
        } else {
            try {
                byte[] bArr = {95};
                return Base64.encodeToString(MessageDigest.getInstance("SHA-256").digest(C203239na.A05(r8.A00.A01, bArr, r7.A00.A01)), 2);
            } catch (NoSuchAlgorithmException e) {
                Log.e("sync-stats-manager/createBootstrapSessionId unable to create id because sha256 instance could not created.", e);
                return null;
            }
        }
        Log.w(str);
        return null;
    }

    public static Integer A02(long j) {
        int i;
        if (j == 0) {
            i = 1;
        } else if (j == 1) {
            i = 2;
        } else if (j < 10) {
            i = 3;
        } else if (j < 100) {
            i = 4;
        } else if (j < 500) {
            i = 5;
        } else if (j < 1000) {
            i = 6;
        } else {
            i = 8;
            if (j < 5000) {
                i = 7;
            }
        }
        return Integer.valueOf(i);
    }

    public static void A05(AnonymousClass3I3 r3, AnonymousClass1AB r4, int i) {
        AnonymousClass2QK r2 = new AnonymousClass2QK();
        r2.A00 = Integer.valueOf(i);
        r2.A03 = r3.A01;
        r2.A02 = r3.A00;
        r2.A01 = Long.valueOf(C19970wo.A00(r4.A02));
        r4.A06.Bly(r2);
    }

    public AnonymousClass3I3 A06(AnonymousClass3FZ r6, String str) {
        String A042 = A04(r6, this.A03.A00.A04().A01);
        String str2 = null;
        if (str != null) {
            C19730wQ r0 = this.A00;
            r0.A0G();
            PhoneUserJid phoneUserJid = r0.A03;
            if (phoneUserJid == null) {
                Log.e("sync-stats-manager/createMDRegAttemptId myUserJid is null");
            } else {
                try {
                    MessageDigest instance = MessageDigest.getInstance("SHA-256");
                    StringBuilder sb = new StringBuilder();
                    sb.append(phoneUserJid.user);
                    sb.append("_");
                    sb.append(str);
                    str2 = Base64.encodeToString(instance.digest(sb.toString().getBytes()), 2);
                } catch (NoSuchAlgorithmException e) {
                    Log.e("sync-stats-manager/createMDRegAttemptId unable to create id because sha256 instance could not created.", e);
                }
            }
        }
        if (A042 == null || str2 == null) {
            return null;
        }
        return new AnonymousClass3I3(A042, str2);
    }

    public void A07(int i) {
        if (C20800yB.A01(C21000yV.A02, this.A05, 624)) {
            C44392Ni r1 = new C44392Ni();
            r1.A00 = Integer.valueOf(i);
            this.A06.Bly(r1);
        }
    }

    public void A08(int i, String str) {
        C44582Ob r1 = new C44582Ob();
        r1.A01 = Integer.valueOf(i);
        r1.A00 = A03(str);
        this.A06.Bly(r1);
    }

    public void A09(int i, String str, boolean z) {
        C44852Pc r1 = new C44852Pc();
        r1.A02 = Integer.valueOf(i);
        r1.A01 = A03(str);
        r1.A00 = Boolean.valueOf(z);
        this.A06.Bly(r1);
    }

    public void A0A(long j, boolean z) {
        AnonymousClass2OZ r2 = new AnonymousClass2OZ();
        r2.A00 = Boolean.valueOf(z);
        r2.A01 = Long.valueOf(C19970wo.A00(this.A02) - j);
        this.A06.Bly(r2);
    }

    public void A0B(AnonymousClass3I3 r6, int i, int i2, int i3, long j, long j2, long j3, long j4, long j5) {
        if (r6 != null) {
            C45652Se r2 = new C45652Se();
            r2.A06 = Long.valueOf(j2);
            r2.A07 = Long.valueOf(j3);
            r2.A08 = Long.valueOf(j4);
            r2.A01 = Integer.valueOf(i3);
            r2.A0C = r6.A01;
            r2.A0B = r6.A00;
            r2.A0A = Long.valueOf(C19970wo.A00(this.A02));
            int i4 = 1;
            if (i3 != 1) {
                i4 = 2;
            }
            r2.A03 = Integer.valueOf(i4);
            r2.A00 = A01(i);
            r2.A02 = A00(i);
            r2.A05 = Long.valueOf(j);
            r2.A09 = Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(j5));
            r2.A04 = Long.valueOf((long) i2);
            this.A06.Bly(r2);
        }
    }

    public void A0C(AnonymousClass3I3 r4, int i, int i2, long j, boolean z, boolean z2) {
        if (r4 != null) {
            AnonymousClass2SI r2 = new AnonymousClass2SI();
            r2.A09 = r4.A01;
            r2.A08 = r4.A00;
            r2.A07 = Long.valueOf(C19970wo.A00(this.A02));
            int i3 = 2;
            r2.A03 = 2;
            if (z) {
                i3 = 1;
            }
            r2.A04 = Integer.valueOf(i3);
            r2.A01 = A01(i);
            r2.A02 = A00(i);
            r2.A06 = Long.valueOf(j);
            r2.A00 = Boolean.valueOf(z2);
            r2.A05 = Long.valueOf((long) i2);
            this.A06.Bly(r2);
        }
    }

    public void A0D(AnonymousClass3I3 r4, int i, long j, long j2, boolean z) {
        C45402Rf r2 = new C45402Rf();
        r2.A06 = r4.A01;
        r2.A05 = r4.A00;
        r2.A04 = Long.valueOf(C19970wo.A00(this.A02));
        r2.A02 = Long.valueOf(j);
        r2.A00 = Integer.valueOf(i);
        int i2 = 2;
        if (z) {
            i2 = 1;
        }
        r2.A01 = Integer.valueOf(i2);
        r2.A03 = Long.valueOf(j2);
        this.A06.Bly(r2);
    }

    public void A0E(AnonymousClass3I3 r4, int i, boolean z) {
        AnonymousClass2SI r2 = new AnonymousClass2SI();
        r2.A09 = r4.A01;
        r2.A08 = r4.A00;
        r2.A07 = Long.valueOf(C19970wo.A00(this.A02));
        int i2 = 1;
        r2.A03 = 1;
        if (!z) {
            i2 = 2;
        }
        r2.A04 = Integer.valueOf(i2);
        r2.A02 = Integer.valueOf(i);
        this.A06.Bly(r2);
    }

    public void A0F(C181018mn r8, int i) {
        if (r8 instanceof AnonymousClass5J9) {
            AnonymousClass5J9 r82 = (AnonymousClass5J9) r8;
            String str = r82.A0H;
            String str2 = r82.A0G;
            int i2 = r82.A03;
            int i3 = 1;
            boolean z = false;
            if (i == -1) {
                z = true;
            }
            if (str != null && str2 != null) {
                AnonymousClass2S6 r2 = new AnonymousClass2S6();
                r2.A08 = str;
                r2.A07 = str2;
                r2.A01 = A00(i2);
                r2.A06 = Long.valueOf(C19970wo.A00(this.A02));
                if (!z) {
                    i3 = 2;
                }
                r2.A02 = Integer.valueOf(i3);
                if (!z) {
                    r2.A05 = Long.valueOf((long) i);
                }
                Integer A012 = A01(i2);
                r2.A00 = A012;
                int intValue = A012.intValue();
                if (intValue == 2 || intValue == 3) {
                    r2.A04 = Long.valueOf((long) r82.A01);
                }
                r2.A03 = Long.valueOf((long) r82.A00);
                this.A06.Bly(r2);
            }
        }
    }

    public void BXE(C181018mn r18) {
        C181018mn r2 = r18;
        if (r2 instanceof AnonymousClass5J9) {
            AnonymousClass5J9 r22 = (AnonymousClass5J9) r2;
            String str = r22.A0H;
            String str2 = r22.A0G;
            if (str != null && str2 != null) {
                long j = r22.A04;
                long j2 = r22.A07;
                long j3 = r22.A05;
                long j4 = r22.A0A;
                int i = r22.A00;
                A0B(new AnonymousClass3I3(str, str2), r22.A03, i, 1, (long) r22.A01, j, j2, j3, j4);
            }
        }
    }

    public AnonymousClass1AB(C19730wQ r1, AnonymousClass1AG r2, C237119n r3, C19970wo r4, AnonymousClass189 r5, AnonymousClass1AC r6, C20810yC r7, C21010yW r8) {
        this.A02 = r4;
        this.A05 = r7;
        this.A00 = r1;
        this.A06 = r8;
        this.A03 = r5;
        this.A04 = r6;
        this.A01 = r3;
        r2.registerObserver(this);
    }
}
