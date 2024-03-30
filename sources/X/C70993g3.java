package X;

import android.os.SystemClock;
import java.util.List;

/* renamed from: X.3g3  reason: invalid class name and case insensitive filesystem */
public final class C70993g3 implements AnonymousClass4Q7 {
    public long A00;
    public long A01;
    public final AnonymousClass171 A02;
    public final List A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final C19730wQ A07;
    public final AnonymousClass16D A08;

    public boolean B7L(AnonymousClass11F r11) {
        long j;
        AnonymousClass141 A0A;
        long j2;
        long j3;
        long j4;
        long j5;
        AnonymousClass00C.A0D(r11, 0);
        C18740tg.A00();
        boolean z = this.A06;
        if (z) {
            j = SystemClock.elapsedRealtimeNanos();
        } else {
            j = 0;
        }
        C19730wQ r2 = this.A07;
        if (r2.A0M(r11)) {
            r2.A0G();
            A0A = r2.A0E;
        } else {
            A0A = this.A08.A0A(r11);
        }
        long j6 = this.A00;
        if (z) {
            j2 = SystemClock.elapsedRealtimeNanos();
        } else {
            j2 = 0;
        }
        this.A00 = j6 + (j2 - j);
        if (A0A == null) {
            return false;
        }
        if (z) {
            j3 = SystemClock.elapsedRealtimeNanos();
        } else {
            j3 = 0;
        }
        AnonymousClass11F r1 = A0A.A0H;
        boolean z2 = false;
        if (!AnonymousClass143.A0I(r1) || this.A04 || this.A05) {
            if (!(r1 instanceof AnonymousClass146) && this.A02.A0h(A0A, this.A03, true)) {
                z2 = true;
            }
            j4 = this.A01;
            if (!z) {
                j5 = 0;
                this.A01 = j4 + (j5 - j3);
                return z2;
            }
        } else {
            j4 = this.A01;
        }
        j5 = SystemClock.elapsedRealtimeNanos();
        this.A01 = j4 + (j5 - j3);
        return z2;
    }

    public C70993g3(C19730wQ r3, AnonymousClass16D r4, AnonymousClass171 r5, C20810yC r6, C230116v r7, List list) {
        C36321k7.A1B(r6, r7, r4, r3, r5);
        AnonymousClass00C.A0D(list, 6);
        this.A08 = r4;
        this.A07 = r3;
        this.A02 = r5;
        this.A03 = list;
        this.A04 = r7.A01.A0E(3751);
        this.A05 = r6.A0E(4748);
        this.A06 = r6.A0E(1777);
    }
}
