package X;

import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;

/* renamed from: X.1Y4  reason: invalid class name */
public class AnonymousClass1Y4 {
    public final C19700wN A00;
    public final AnonymousClass17Y A01;
    public final C19730wQ A02;
    public final AnonymousClass1DT A03;
    public final AnonymousClass1E3 A04;
    public final C20310xM A05;
    public final AnonymousClass16J A06;
    public final AnonymousClass1FN A07;
    public final C236419g A08;
    public final AnonymousClass1DW A09;
    public final C20810yC A0A;
    public final C21010yW A0B;
    public final AnonymousClass1D0 A0C;
    public final AnonymousClass1Y6 A0D;
    public final C24811Dw A0E;
    public final AnonymousClass1Y5 A0F;
    public final C25161Ff A0G;
    public final AnonymousClass1E1 A0H;
    public final AnonymousClass1D1 A0I;
    public final AnonymousClass1GJ A0J;
    public final AnonymousClass1GN A0K;
    public final AnonymousClass1Y7 A0L;
    public final AnonymousClass1Y2 A0M;
    public final AnonymousClass1AW A0N;
    public final AnonymousClass1EO A0O;
    public final C19770wU A0P;
    public final Object A0Q = new Object();
    public final WeakHashMap A0R = new WeakHashMap();
    public final Executor A0S;
    public final C19970wo A0T;
    public final AnonymousClass17V A0U;
    public final C237919w A0V;
    public final C81873xm A0W;

    public void A07(AnonymousClass4R0 r13, AnonymousClass3Ot r14, AnonymousClass2bU r15, AnonymousClass3SC r16, byte[] bArr, boolean z, boolean z2, boolean z3, boolean z4) {
        C146506vi r4;
        if (r15 == null || (r4 = A04(A00(this, r15))) == null) {
            r4 = (C146506vi) r13;
        }
        AnonymousClass3SC r6 = r16;
        this.A0S.execute(new C35721j9(this, r6, 49));
        boolean z5 = z3;
        boolean z6 = z4;
        AnonymousClass74C r2 = new AnonymousClass74C(this, r4, r14, r6, bArr, z5, z6, z2, z);
        C81873xm r0 = this.A0W;
        if (r0 != null) {
            r0.execute(r2);
        } else {
            this.A0P.Boy(r2);
        }
    }

    public static AnonymousClass3SC A00(AnonymousClass1Y4 r6, AnonymousClass2bU r7) {
        Object obj;
        synchronized (r6.A0Q) {
            for (Map.Entry entry : r6.A0R.entrySet()) {
                AnonymousClass00C.A0D(r7, 0);
                C64933Qa r3 = r7.A1J;
                Iterator it = ((AnonymousClass3SC) entry.getKey()).A02.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (AnonymousClass00C.A0J(r3, ((AnonymousClass3T1) obj).A1J)) {
                        break;
                    }
                }
                if (((AnonymousClass2bU) obj) != null) {
                    AnonymousClass3SC r0 = (AnonymousClass3SC) entry.getKey();
                    return r0;
                }
            }
            return null;
        }
    }

    public static void A01(AnonymousClass1Y4 r2, C146506vi r3, AnonymousClass3SC r4) {
        synchronized (r2.A0Q) {
            if (r3 == null) {
                r2.A0R.remove(r4);
            } else {
                r2.A0R.put(r4, r3);
            }
        }
    }

    public static void A03(AnonymousClass1Y4 r15, AnonymousClass3SC r16, int i, int i2, int i3) {
        String str;
        String str2;
        for (AnonymousClass3T1 r2 : C007103b.A0Y(r16.A02)) {
            AnonymousClass1DT r1 = r15.A03;
            if (r1.A0a) {
                AnonymousClass1EE r5 = r1.A0N;
                int hashCode = r2.A1J.A01.hashCode();
                synchronized (r5) {
                    if (C20800yB.A01(C21000yV.A02, r5.A00, 7774)) {
                        AnonymousClass1EF r4 = r5.A01;
                        if (!r4.A02(hashCode)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("MessageSendPerfQplTracker");
                            sb.append("/markerMediaStagePoint qpl not started");
                            Log.w(sb.toString());
                        } else {
                            int i4 = i;
                            if (i4 == -3) {
                                str = "media_upload_finish";
                            } else if (i4 != -2) {
                                str = "media_upload_start";
                            } else {
                                str = "media_upload_http_start";
                            }
                            int i5 = i2;
                            if (i2 > 0) {
                                C21700zf r22 = r5.A02;
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(str);
                                sb2.append("_attempt_count");
                                r22.A06.markerAnnotate(r22.A04.A06, hashCode, sb2.toString(), (long) i5);
                            }
                            if (!r4.A03(hashCode, i4)) {
                                C21700zf r12 = r5.A02;
                                if (i3 != 0) {
                                    str2 = String.valueOf(i3);
                                } else {
                                    str2 = null;
                                }
                                C21710zg r23 = r12.A04;
                                if (r23.A01()) {
                                    r12.A06.markerPoint(r23.A06, hashCode, str, str2);
                                }
                                r4.A00(hashCode, i4);
                            }
                        }
                    }
                }
            }
        }
    }

    public C146506vi A04(AnonymousClass3SC r3) {
        C146506vi r0;
        synchronized (this.A0Q) {
            r0 = (C146506vi) this.A0R.get(r3);
        }
        return r0;
    }

    public void A05(AnonymousClass11F r5, String str, String str2, String str3, long j) {
        C180848mW r2 = new C180848mW(this.A0V.A02(r5, true), C19970wo.A00(this.A0T));
        r2.A03 = str;
        r2.A02 = str2;
        r2.A01 = str3;
        r2.A00 = j;
        this.A05.A0h(r2);
    }

    public void A08(AnonymousClass3T1 r5, boolean z) {
        StringBuilder sb;
        if (!(r5 instanceof AnonymousClass2bU)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("mediajobmanager/cancelmessage; attempt to cancel non-media message: ");
            sb2.append(r5.A1J);
            Log.e(sb2.toString());
        } else if (AnonymousClass3TJ.A02(r5.A0D, 2)) {
            sb.append("mediajobmanager/cancelmessage; attempt to cancel uploaded message: ");
            sb.append(r5.A1J);
            Log.e(sb.toString());
            if (z) {
                this.A01.A06(R.string.f12nameremoved, 0);
            }
        } else {
            sb = new StringBuilder();
            sb.append("mediajobmanager/cancelmessage: ");
            sb.append(r5.A1J);
            Log.e(sb.toString());
            this.A0M.A02(r5);
            C101294xJ r2 = new C101294xJ(this, Collections.singletonList(r5), false);
            this.A0P.Boy(r2);
            r2.A0B(new C164987sh(this, r5, 4), this.A0S);
        }
    }

    public AnonymousClass1Y4(C19700wN r6, AnonymousClass17Y r7, C19730wQ r8, AnonymousClass1DT r9, C19970wo r10, AnonymousClass1E3 r11, C20310xM r12, AnonymousClass16J r13, AnonymousClass1FN r14, C236419g r15, AnonymousClass1DW r16, C20810yC r17, C21010yW r18, AnonymousClass17V r19, AnonymousClass1D0 r20, AnonymousClass1Y6 r21, C24811Dw r22, AnonymousClass1Y5 r23, C25161Ff r24, AnonymousClass1E1 r25, AnonymousClass1D1 r26, AnonymousClass1GJ r27, AnonymousClass1GN r28, AnonymousClass1Y7 r29, AnonymousClass1Y2 r30, C237919w r31, AnonymousClass1AW r32, AnonymousClass1EO r33, C19770wU r34) {
        C81873xm r0;
        this.A0T = r10;
        C20810yC r4 = r17;
        this.A0A = r4;
        this.A01 = r7;
        this.A00 = r6;
        this.A02 = r8;
        C19770wU r3 = r34;
        this.A0P = r3;
        this.A0B = r18;
        this.A0I = r26;
        this.A09 = r16;
        this.A03 = r9;
        this.A0J = r27;
        this.A0G = r24;
        this.A0V = r31;
        this.A0C = r20;
        this.A05 = r12;
        this.A0K = r28;
        this.A06 = r13;
        this.A0F = r23;
        this.A0U = r19;
        this.A0E = r22;
        this.A0H = r25;
        this.A07 = r14;
        this.A04 = r11;
        this.A0M = r30;
        this.A08 = r15;
        this.A0D = r21;
        this.A0L = r29;
        Objects.requireNonNull(r7);
        this.A0S = new C36131jo(r7, 1);
        this.A0N = r32;
        this.A0O = r33;
        C21000yV r1 = C21000yV.A02;
        if (C20800yB.A00(r1, r4, 776) > 0) {
            r0 = new C81873xm(r3, C20800yB.A00(r1, r4, 776), false);
        } else {
            r0 = null;
        }
        this.A0W = r0;
    }

    public static void A02(AnonymousClass1Y4 r4, C146506vi r5, AnonymousClass3SC r6) {
        AnonymousClass2bU A012;
        String A072;
        if (r6.A01().A1I == 82) {
            C132976Wa r3 = r5.A0N;
            synchronized (r3) {
                r3.A08 = true;
            }
        }
        if (!(!C20800yB.A01(C21000yV.A02, r4.A0A, 7773) || (A012 = r6.A01()) == null || (A072 = AnonymousClass3UK.A07(A012)) == null)) {
            C132976Wa r32 = r5.A0N;
            String A002 = AnonymousClass17V.A00(r4.A0U.A05(new Random()), A072);
            synchronized (r32) {
                r32.A0C = A002;
            }
        }
        A03(r4, r6, -1, r5.A0M.A03, 0);
    }

    public void A06(C146506vi r7, AnonymousClass3SC r8, boolean z, boolean z2) {
        String str;
        r8.A02();
        A01(this, r7, r8);
        r7.A01 = AnonymousClass1D9.A00(r8);
        C25471Gl r5 = r7.A02().A06;
        if (AnonymousClass6Y1.A06(r5)) {
            str = "newsletter";
        } else {
            str = "mms";
        }
        r7.A0X = str;
        C25161Ff r3 = this.A0G;
        if (!r3.A02(r5, true) && (r5 == C25471Gl.A0A || r5 == C25471Gl.A0D || r5 == C25471Gl.A0i)) {
            if (C20800yB.A01(C21000yV.A01, this.A0A, 1539) && r3.A03(C007103b.A0Y(r8.A02))) {
                r7.A0X = "express";
                r7.A0N.A08(4);
            }
        }
        C164947sd r1 = new C164947sd(this, r8, r7, 7);
        Executor executor = this.A0S;
        r7.A0B.A03(r1, executor);
        r7.A09.A03(new C164987sh(this, r8, 5), (Executor) null);
        r7.A0A.A03(new C164947sd(this, r8, r7, 2), (Executor) null);
        r7.A0F.A03(new C164957se(this, r7, r8, 0), executor);
        r7.A0E.A03(new C164947sd(this, r8, r7, 4), executor);
        r7.A0G.A03(new C164947sd(this, r8, r7, 5), (Executor) null);
        r7.A0I.A03(new C164947sd(this, r8, r7, 6), executor);
        r7.A0J.A03(new C164957se(this, r7, r8, 1), executor);
        AnonymousClass70V r2 = new AnonymousClass70V(this, r7, r5, r8);
        if (AnonymousClass00C.A0J(r7.A0X, "express") || AnonymousClass00C.A0J(r7.A0X, "express-optimistic")) {
            r7.A08.A03(r2, (Executor) null);
        }
        r7.A07.A03(new C164947sd(this, r8, r7, 3), (Executor) null);
        r7.A06(new AnonymousClass70R(this, r7, r8, z, z2), executor);
    }

    public boolean A09(AnonymousClass2bU r4) {
        boolean containsKey;
        C146506vi A042 = A04(A00(this, r4));
        if (A042 != null) {
            AnonymousClass1GN r2 = this.A0C.A0D;
            synchronized (r2) {
                containsKey = r2.A01.containsKey(A042);
            }
            if (!containsKey) {
                return false;
            }
            return true;
        }
        return false;
    }
}
