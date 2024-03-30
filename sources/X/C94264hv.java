package X;

import androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2;
import androidx.compose.foundation.gestures.UpdatableAnimationState;

/* renamed from: X.4hv  reason: invalid class name and case insensitive filesystem */
public final class C94264hv extends C137856gq implements C161827nX, AnonymousClass7bH {
    public long A00 = 0;
    public C161157mH A01;
    public AnonymousClass5RU A02;
    public C160557lC A03;
    public C160787la A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public AnonymousClass6QC A08;
    public C160787la A09;
    public final AnonymousClass605 A0A = new AnonymousClass605();
    public final UpdatableAnimationState A0B;

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005d, code lost:
        if (r6 == null) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0067, code lost:
        if (r6 != null) goto L_0x0076;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final float A00(X.C94264hv r11) {
        /*
            long r3 = r11.A00
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            boolean r0 = X.AnonymousClass000.A1Q(r0)
            r10 = 0
            if (r0 != 0) goto L_0x0069
            X.605 r0 = r11.A0A
            X.76e r1 = r0.A00
            int r0 = r1.A00
            r6 = 0
            if (r0 <= 0) goto L_0x005f
            int r9 = r0 + -1
            java.lang.Object[] r5 = r1.A01
        L_0x001a:
            r0 = r5[r9]
            X.61R r0 = (X.AnonymousClass61R) r0
            X.00S r0 = r0.A00
            java.lang.Object r4 = r0.invoke()
            X.6QC r4 = (X.AnonymousClass6QC) r4
            if (r4 == 0) goto L_0x0059
            float r2 = r4.A02
            float r0 = r4.A01
            float r2 = r2 - r0
            float r1 = r4.A00
            float r0 = r4.A03
            float r1 = r1 - r0
            long r7 = X.C90464aC.A0B(r2, r1)
            long r0 = X.AnonymousClass6X0.A02
            long r0 = r11.A00
            long r2 = X.AnonymousClass6GI.A02(r0)
            X.5RU r0 = r11.A02
            int r1 = r0.ordinal()
            r0 = 0
            if (r1 == r0) goto L_0x006a
            r0 = 1
            if (r1 != r0) goto L_0x00a9
            float r1 = X.AnonymousClass6X0.A01(r7)
            float r0 = X.AnonymousClass6X0.A01(r2)
        L_0x0052:
            int r0 = java.lang.Float.compare(r1, r0)
            if (r0 > 0) goto L_0x0073
            r6 = r4
        L_0x0059:
            int r9 = r9 + -1
            if (r9 >= 0) goto L_0x001a
            if (r6 != 0) goto L_0x0076
        L_0x005f:
            boolean r0 = r11.A07
            if (r0 == 0) goto L_0x0069
            X.6QC r6 = A02(r11)
            if (r6 != 0) goto L_0x0076
        L_0x0069:
            return r10
        L_0x006a:
            float r1 = X.AnonymousClass6X0.A00(r7)
            float r0 = X.AnonymousClass6X0.A00(r2)
            goto L_0x0052
        L_0x0073:
            if (r6 != 0) goto L_0x0076
            r6 = r4
        L_0x0076:
            long r0 = r11.A00
            long r4 = X.AnonymousClass6GI.A02(r0)
            X.5RU r0 = r11.A02
            int r1 = r0.ordinal()
            r0 = 0
            if (r1 == r0) goto L_0x0098
            r0 = 1
            if (r1 != r0) goto L_0x00a4
            X.7mH r3 = r11.A01
            float r2 = r6.A01
            float r1 = r6.A02
            float r1 = r1 - r2
            float r0 = X.AnonymousClass6X0.A01(r4)
        L_0x0093:
            float r0 = r3.B2E(r2, r1, r0)
            return r0
        L_0x0098:
            X.7mH r3 = r11.A01
            float r2 = r6.A03
            float r1 = r6.A00
            float r1 = r1 - r2
            float r0 = X.AnonymousClass6X0.A00(r4)
            goto L_0x0093
        L_0x00a4:
            X.0jS r0 = X.C36441kJ.A18()
            throw r0
        L_0x00a9:
            X.0jS r0 = X.C36441kJ.A18()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C94264hv.A00(X.4hv):float");
    }

    public static final AnonymousClass6QC A02(C94264hv r4) {
        C160787la r1;
        C160787la r3 = r4.A09;
        if (r3 == null || !r3.BLA() || (r1 = r4.A04) == null || !r1.BLA()) {
            return null;
        }
        return r3.BOQ(r1, false);
    }

    public static final void A03(C94264hv r4) {
        if (!r4.A05) {
            AnonymousClass040 A072 = r4.A07();
            AnonymousClass0A2.A02(C023109s.A0G, C008903u.A00, new ContentInViewNode$launchAnimation$2(r4, (C023509x) null), A072);
            return;
        }
        throw AnonymousClass001.A09("launchAnimation called when previous animation was running");
    }

    public void BeX(long j) {
        int i;
        long j2;
        AnonymousClass6QC A022;
        long j3 = this.A00;
        this.A00 = j;
        int ordinal = this.A02.ordinal();
        if (ordinal == 0) {
            i = (int) (j & 4294967295L);
            j2 = j3 & 4294967295L;
        } else if (ordinal == 1) {
            i = (int) (j >> 32);
            j2 = j3 >> 32;
        } else {
            throw C36441kJ.A18();
        }
        if (AnonymousClass00C.A00(i, (int) j2) < 0 && (A022 = A02(this)) != null) {
            AnonymousClass6QC r1 = this.A08;
            if (r1 == null) {
                r1 = A022;
            }
            if (!this.A05 && !this.A07 && A04(this, r1, j3) && !A04(this, A022, j)) {
                this.A07 = true;
                A03(this);
            }
            this.A08 = A022;
        }
    }

    public C94264hv(C161157mH r3, AnonymousClass5RU r4, C160557lC r5, boolean z) {
        this.A02 = r4;
        this.A03 = r5;
        this.A06 = z;
        this.A01 = r3;
        this.A0B = new UpdatableAnimationState(((C136536eZ) r3).A00);
    }

    public static final long A01(C94264hv r6, AnonymousClass6QC r7, long j) {
        long A0B2;
        long A022 = AnonymousClass6GI.A02(j);
        int ordinal = r6.A02.ordinal();
        if (ordinal == 0) {
            C161157mH r3 = r6.A01;
            float f = r7.A03;
            A0B2 = C90464aC.A0B(0.0f, r3.B2E(f, r7.A00 - f, AnonymousClass6X0.A00(A022)));
        } else if (ordinal == 1) {
            C161157mH r32 = r6.A01;
            float f2 = r7.A01;
            A0B2 = C90464aC.A0B(r32.B2E(f2, r7.A02 - f2, AnonymousClass6X0.A01(A022)), 0.0f);
        } else {
            throw C36441kJ.A18();
        }
        long j2 = C133206Xf.A03;
        return A0B2;
    }

    public static final boolean A04(C94264hv r0, AnonymousClass6QC r1, long j) {
        long A012 = A01(r0, r1, j);
        if (Math.abs(C133206Xf.A00(A012)) > 0.5f || Math.abs(C133206Xf.A01(A012)) > 0.5f) {
            return false;
        }
        return true;
    }

    public void Bcj(C160787la r1) {
        this.A09 = r1;
    }
}
