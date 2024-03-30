package X;

import android.content.Context;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.3OK  reason: invalid class name */
public final class AnonymousClass3OK {
    public C009904e A00;
    public final int A01;
    public final int A02;
    public final Context A03;
    public final AnonymousClass018 A04;
    public final C225314u A05;
    public final AnonymousClass17Y A06;
    public final C220412q A07;
    public final AnonymousClass17X A08;
    public final C20810yC A09;
    public final AnonymousClass147 A0A;
    public final AnonymousClass147 A0B;
    public final AnonymousClass005 A0C;
    public final AnonymousClass005 A0D;
    public final List A0E;
    public final AnonymousClass00T A0F = C36431kI.A1I(new C84084Bw(this));
    public final AnonymousClass00T A0G = C36431kI.A1I(new C84094Bx(this));
    public final AnonymousClass00T A0H = C36431kI.A1I(new C84104By(this));
    public final C006302t A0I;
    public final boolean A0J;
    public final C19600wD A0K;
    public final AnonymousClass16D A0L;
    public final C24381Cf A0M;
    public final C20350xQ A0N;
    public final C20510xg A0O;
    public final AnonymousClass190 A0P;
    public final AnonymousClass00S A0Q;

    public AnonymousClass3OK(Context context, AnonymousClass018 r19, C225314u r20, AnonymousClass17Y r21, C19600wD r22, AnonymousClass16D r23, C220412q r24, C24381Cf r25, AnonymousClass17X r26, C20810yC r27, C20350xQ r28, C20510xg r29, AnonymousClass190 r30, AnonymousClass147 r31, AnonymousClass147 r32, AnonymousClass005 r33, AnonymousClass005 r34, List list, AnonymousClass00S r36, C006302t r37, int i, int i2, boolean z) {
        AnonymousClass147 r5 = r31;
        C225314u r16 = r20;
        C36331k8.A1G(r16, 3, r5);
        List list2 = list;
        AnonymousClass00C.A0D(list2, 6);
        C20350xQ r8 = r28;
        C24381Cf r11 = r25;
        AnonymousClass17X r10 = r26;
        C20810yC r9 = r27;
        C19600wD r14 = r22;
        C36321k7.A1D(r10, r14, r8, r9, r11);
        C20510xg r7 = r29;
        AnonymousClass190 r6 = r30;
        AnonymousClass16D r13 = r23;
        C220412q r12 = r24;
        AnonymousClass17Y r15 = r21;
        C36321k7.A1E(r15, r6, r12, r13, r7);
        AnonymousClass005 r4 = r33;
        AnonymousClass00C.A0D(r4, 22);
        AnonymousClass005 r3 = r34;
        AnonymousClass00C.A0D(r3, 23);
        this.A04 = r19;
        this.A03 = context;
        this.A05 = r16;
        this.A0A = r5;
        this.A0B = r32;
        this.A0E = list2;
        this.A02 = i;
        this.A0J = z;
        this.A01 = i2;
        this.A0Q = r36;
        this.A0I = r37;
        this.A08 = r10;
        this.A0K = r14;
        this.A0N = r8;
        this.A09 = r9;
        this.A0M = r11;
        this.A06 = r15;
        this.A0P = r6;
        this.A07 = r12;
        this.A0L = r13;
        this.A0O = r7;
        this.A0C = r4;
        this.A0D = r3;
    }

    public static final void A00(AnonymousClass3OK r8, List list) {
        AnonymousClass3OK r6 = r8;
        AnonymousClass16D r0 = r8.A0L;
        AnonymousClass147 r82 = r8.A0A;
        AnonymousClass141 A082 = r0.A08(r82);
        if (A082 != null) {
            if (!r6.A0K.A09()) {
                r6.A06.A03(C36421kH.A02(r6.A03));
            } else {
                if (!r6.A08.A0D(r82) && r6.A0N.A0O(r82) == 4 && A082.A04 == 1) {
                    r6.A06.A05(0, R.string.f12nameremoved);
                } else {
                    r6.A06.A05(R.string.f12nameremoved, R.string.f12nameremoved);
                }
                AnonymousClass2V8 r4 = new AnonymousClass2V8(r6.A0M, r6, r6.A0N, r82, list);
                C20510xg r3 = r6.A0O;
                r3.A07.Bp6(new C35721j9(r3, r4, 24), "GroupXmppMethods/sendAddParticipants");
            }
        }
        r6.A0Q.invoke();
    }
}
