package X;

import android.content.Context;
import android.content.res.Resources;
import androidx.core.graphics.drawable.IconCompat;
import com.whatsapp.R;

/* renamed from: X.2Z7  reason: invalid class name */
public class AnonymousClass2Z7 extends AnonymousClass3LF implements AnonymousClass4RM {
    public C605638i A00;
    public final C19630wG A01;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass2Z7(X.C19700wN r16, X.C19730wQ r17, X.C21100yf r18, X.AnonymousClass16D r19, X.AnonymousClass171 r20, X.C21060yb r21, X.C19630wG r22, X.C18820ts r23, X.AnonymousClass1TA r24, X.C20810yC r25, X.C20600xp r26, X.C605638i r27, X.C23971Ao r28) {
        /*
            r15 = this;
            r0 = r27
            X.2bM r13 = r0.A02
            r14 = r28
            r1 = r15
            r2 = r16
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r24
            r11 = r25
            r12 = r26
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r15.A01 = r8
            r15.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2Z7.<init>(X.0wN, X.0wQ, X.0yf, X.16D, X.171, X.0yb, X.0wG, X.0ts, X.1TA, X.0yC, X.0xp, X.38i, X.1Ao):void");
    }

    public static String A00(AnonymousClass2Z7 r8) {
        Context context;
        int i;
        Object[] A0L;
        int i2;
        String str;
        C605638i r2 = r8.A00;
        AnonymousClass2bM r1 = r2.A02;
        if (r1 instanceof C180868mY) {
            C19630wG r0 = r8.A01;
            C20600xp r12 = r8.A07;
            int i3 = r2.A00 - 1;
            Context context2 = r0.A00;
            CharSequence A0G = r12.A0G(r2.A01);
            String A03 = C65753Ti.A03(((C180868mY) r2.A02).A01);
            if (i3 != 0) {
                Object[] A1Q = C36441kJ.A1Q();
                A1Q[0] = A03;
                C36431kI.A1O(A1Q, i3, 1);
                return C36391kE.A0v(context2, A0G, A1Q, 2, R.string.f12nameremoved);
            }
            Object[] objArr = new Object[2];
            objArr[0] = A03;
            return C36391kE.A0v(context2, A0G, objArr, 1, R.string.f12nameremoved);
        }
        if (r1 instanceof C180858mX) {
            C19630wG r13 = r8.A01;
            AnonymousClass3T1 r5 = r2.A01;
            if (!(r5 instanceof AnonymousClass2bS)) {
                return "";
            }
            context = r13.A00;
            i = R.string.f12nameremoved;
            A0L = AnonymousClass001.A0M();
            A0L[0] = "📊";
            i2 = 1;
            str = ((AnonymousClass2bS) r5).A03;
        } else if (!(r1 instanceof C46762bd)) {
            return "";
        } else {
            C19630wG r14 = r8.A01;
            AnonymousClass3T1 r52 = r2.A01;
            if (!(r52 instanceof AnonymousClass2bT)) {
                return "";
            }
            context = r14.A00;
            i = R.string.f12nameremoved;
            A0L = AnonymousClass001.A0L();
            i2 = 0;
            str = ((AnonymousClass2bT) r52).A05;
        }
        return C36391kE.A0v(context, str, A0L, i2, i);
    }

    public static String A01(AnonymousClass2Z7 r5, String str) {
        int i = r5.A00.A00 - 1;
        if (i == 0) {
            return str;
        }
        Resources A0B = C36421kH.A0B(r5.A01);
        Object[] A1Z = C36431kI.A1Z(str, 2);
        AnonymousClass000.A1L(A1Z, i, 1);
        return A0B.getQuantityString(R.plurals.f10nameremoved, i, A1Z);
    }

    public AnonymousClass0UW A09() {
        boolean z;
        AnonymousClass2bM r1 = this.A00.A02;
        if (!(r1 instanceof C180858mX) && !(r1 instanceof C46762bd)) {
            return super.A09();
        }
        AnonymousClass141 A03 = A03();
        String A06 = A06();
        AnonymousClass11F r0 = this.A00.A1J.A00;
        AnonymousClass171 r2 = this.A04;
        String A0R = r2.A0R(A03, r2.A08(A03, r0), false);
        if (this.A00.A00 > 1) {
            Resources A0B = C36421kH.A0B(this.A01);
            int i = this.A00.A00 - 1;
            Object[] A1b = C36411kG.A1b(A0R);
            C36431kI.A1O(A1b, i, 1);
            A0R = A0B.getQuantityString(R.plurals.f10nameremoved, i, A1b);
        }
        AnonymousClass3T1 r22 = this.A00;
        if (!this.A02.A09(C21100yf.A0G) || !(r22 instanceof C181758nz)) {
            z = r22.A1J.A02;
        } else {
            z = C36361kB.A1X(this.A01, A03);
        }
        if (z) {
            return this.A07.A0D();
        }
        AnonymousClass0TO r12 = new AnonymousClass0TO();
        r12.A01 = A0R;
        r12.A00 = IconCompat.A03(this.A07.A0C(A03));
        r12.A03 = A06;
        return new AnonymousClass0UW(r12);
    }

    public C64933Qa BF8() {
        return this.A00.A01.A1J;
    }
}
