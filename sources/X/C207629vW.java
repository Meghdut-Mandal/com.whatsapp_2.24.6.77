package X;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9vW  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C207629vW implements AnonymousClass08V {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass1O1 A01;
    public final /* synthetic */ C108515Tu A02;
    public final /* synthetic */ C1041758o A03;
    public final /* synthetic */ List A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;
    public final /* synthetic */ boolean A0A;
    public final /* synthetic */ boolean A0B;
    public final /* synthetic */ boolean A0C;
    public final /* synthetic */ boolean A0D;
    public final /* synthetic */ boolean A0E;

    public /* synthetic */ C207629vW(AnonymousClass1O1 r1, C108515Tu r2, C1041758o r3, List list, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10) {
        this.A01 = r1;
        this.A02 = r2;
        this.A07 = z;
        this.A08 = z2;
        this.A09 = z3;
        this.A0A = z4;
        this.A0B = z5;
        this.A0C = z6;
        this.A0D = z7;
        this.A0E = z8;
        this.A05 = z9;
        this.A06 = z10;
        this.A00 = i;
        this.A04 = list;
        this.A03 = r3;
    }

    public final Object apply(Object obj) {
        HashSet hashSet;
        AnonymousClass3IL r0;
        AnonymousClass1O1 r7 = this.A01;
        C108515Tu r8 = this.A02;
        boolean z = this.A07;
        boolean z2 = this.A08;
        boolean z3 = this.A09;
        boolean z4 = this.A0A;
        boolean z5 = this.A0B;
        boolean z6 = this.A0C;
        boolean z7 = this.A0D;
        boolean z8 = this.A0E;
        boolean z9 = this.A05;
        boolean z10 = this.A06;
        int i = this.A00;
        List list = this.A04;
        C1041758o r4 = this.A03;
        String str = (String) obj;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        ArrayList A0I = AnonymousClass001.A0I();
        int A072 = r7.A0F.A07(7896);
        if (A072 > 0) {
            AnonymousClass1A6 r2 = r7.A0C;
            long A002 = C19970wo.A00(r7.A0D) - 2592000000L;
            C220412q.A00(r2.A02);
            AnonymousClass1A7 r13 = r2.A01;
            synchronized (r13) {
                int i2 = 0;
                hashSet = C36441kJ.A16();
                Iterator it = r13.iterator();
                while (it.hasNext()) {
                    AnonymousClass3I6 r15 = (AnonymousClass3I6) it.next();
                    if (i2 >= A072 && r15.A00 < A002) {
                        break;
                    }
                    hashSet.add(r15.A01);
                    i2++;
                }
            }
        } else {
            hashSet = r7.A0C.A0C();
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            AnonymousClass141 A0f = C36391kE.A0f(it2);
            AnonymousClass11F r1 = A0f.A0H;
            if (!C202329lb.A04(r1) && ((!(r1 instanceof C223313w) || hashSet.contains(r1)) && (((r0 = A0f.A0F) == null || TextUtils.isEmpty(r0.A01)) && AnonymousClass1O1.A06(A0f, hashSet)))) {
                boolean z11 = true;
                AnonymousClass9jB r11 = new AnonymousClass9jB(A0f);
                r11.A0L = z2;
                r11.A0J = z3;
                r11.A0B = z4;
                r11.A0G = true;
                if (!z) {
                    z11 = false;
                }
                r11.A0K = z11;
                r11.A0E = z5;
                r11.A01 = C165607th.A06(A0f, r8);
                r11.A0I = z6;
                r11.A0F = z7;
                r11.A0H = z8;
                r11.A0N = z9;
                r11.A0M = z10;
                if (z4) {
                    AnonymousClass9jB.A02(r7, r11, r11.A0P, r7.A0K);
                }
                if (z5) {
                    r11.A02 = AnonymousClass9jB.A00(r11, r7.A0E, r11.A0P);
                }
                C165577te.A14(r7, r11, z6 ? 1 : 0);
                AnonymousClass9jB.A04(r11, A0I);
            }
        }
        if (C165577te.A1Y(r4, A0I)) {
            return C131626Pu.A08;
        }
        if (!AnonymousClass1O1.A04(r7, r4, str, C198869eK.A01(r8, AnonymousClass1O1.A01(r7), "sync_sid_full", A0I, i))) {
            return C131626Pu.A03;
        }
        C192519Hh.A00(r7, r4, A0I, elapsedRealtime);
        return C131626Pu.A06;
    }
}
