package X;

import android.os.Message;
import java.util.List;
import java.util.Set;

/* renamed from: X.1bC  reason: invalid class name and case insensitive filesystem */
public final class C31051bC {
    public final AnonymousClass1DT A00;
    public final C20310xM A01;
    public final C20810yC A02;
    public final AnonymousClass19L A03;
    public final AnonymousClass1SL A04;
    public final AnonymousClass1SQ A05;
    public final C28621Tj A06;
    public final C19930wk A07;
    public final C19770wU A08;
    public final C19700wN A09;
    public final C19970wo A0A;
    public final AnonymousClass19A A0B;
    public final AnonymousClass1SM A0C;
    public final C28631Tk A0D;

    public C31051bC(C19700wN r3, AnonymousClass1DT r4, C19970wo r5, C20310xM r6, C20810yC r7, AnonymousClass19A r8, AnonymousClass19L r9, AnonymousClass1SM r10, C28631Tk r11, AnonymousClass1SL r12, AnonymousClass1SQ r13, C28621Tj r14, C19770wU r15) {
        AnonymousClass00C.A0D(r5, 1);
        AnonymousClass00C.A0D(r7, 2);
        AnonymousClass00C.A0D(r3, 3);
        AnonymousClass00C.A0D(r15, 4);
        AnonymousClass00C.A0D(r8, 5);
        AnonymousClass00C.A0D(r9, 6);
        AnonymousClass00C.A0D(r4, 7);
        AnonymousClass00C.A0D(r10, 8);
        AnonymousClass00C.A0D(r6, 9);
        AnonymousClass00C.A0D(r13, 10);
        AnonymousClass00C.A0D(r14, 11);
        AnonymousClass00C.A0D(r12, 12);
        AnonymousClass00C.A0D(r11, 13);
        this.A0A = r5;
        this.A02 = r7;
        this.A09 = r3;
        this.A08 = r15;
        this.A0B = r8;
        this.A03 = r9;
        this.A00 = r4;
        this.A0C = r10;
        this.A01 = r6;
        this.A05 = r13;
        this.A06 = r14;
        this.A04 = r12;
        this.A0D = r11;
        this.A07 = new C19930wk(r15, true);
    }

    public final void A01(C28981Uw r12, String str, long j, long j2) {
        String str2 = str;
        if (str != null) {
            AnonymousClass1SM r1 = this.A0C;
            C28981Uw r2 = r12;
            long j3 = j;
            AnonymousClass3T1 A022 = r1.A02(r12, j);
            if (A022 == null) {
                this.A0D.A01(r2, Long.valueOf(j2), (Long) null, str, (List) null, j3);
                return;
            }
            this.A05.A02(A022, (Long) null, Long.valueOf(j2), str2, C19970wo.A00(this.A0A), true, true);
            r1.A05(A022);
        }
    }

    public static final void A00(C31051bC r3, C207209uj r4) {
        AnonymousClass19A r2 = r3.A0B;
        Message A022 = C203429o0.A02(r3.A09, r3.A02, r4);
        AnonymousClass00C.A08(A022);
        r2.A0J(A022);
    }

    public final void A02(C28981Uw r13, Set set, long j, long j2) {
        if (set != null) {
            C28981Uw r1 = r13;
            long j3 = j;
            AnonymousClass3T1 A022 = this.A0C.A02(r13, j3);
            long j4 = j2;
            if (A022 == null) {
                this.A0D.A01(r1, (Long) null, Long.valueOf(j4), (String) null, C007103b.A0Y(set), j3);
            } else if (A022 instanceof AnonymousClass2bS) {
                this.A05.A01(r13, (AnonymousClass2bS) A022, C007103b.A0Y(set), j4);
            }
        }
    }
}
