package X;

import androidx.compose.ui.platform.AndroidComposeView;

/* renamed from: X.6gF  reason: invalid class name and case insensitive filesystem */
public final class C137506gF implements C161927nh, C161667nH {
    public C161817nW A00;
    public final C137496gE A01 = new C137496gE();

    public void B60(C114365h6 r15, C109085Wf r16, float f, float f2, float f3, int i, long j, long j2, long j3, boolean z) {
        this.A01.B60((C114365h6) null, r16, f, f2, 1.0f, 3, j, j2, j3, false);
    }

    public void B62(C114365h6 r11, C109085Wf r12, float f, float f2, int i, long j, long j2) {
        this.A01.B62((C114365h6) null, r12, f, 1.0f, 3, j, j2);
    }

    public void B65(C114365h6 r16, C23085B3v b3v, C109085Wf r18, float f, int i, int i2, long j, long j2, long j3, long j4) {
        this.A01.B65(r16, b3v, r18, f, 3, i2, j, j2, j3, j4);
    }

    public void B6B(C125185zS r8, C114365h6 r9, C161177mK r10, C109085Wf r11, float f, int i) {
        this.A01.B6B(r8, (C114365h6) null, r10, r11, f, 3);
    }

    public void B6E(C114365h6 r12, C109085Wf r13, float f, int i, long j, long j2, long j3) {
        this.A01.B6E((C114365h6) null, r13, 1.0f, 3, j, j2, j3);
    }

    public void B6G(C114365h6 r14, C109085Wf r15, float f, int i, long j, long j2, long j3, long j4) {
        this.A01.B6G((C114365h6) null, r15, 1.0f, 3, j, j2, j3, j4);
    }

    public long B9U() {
        return this.A01.B9U();
    }

    public float BAy() {
        return this.A01.BAy();
    }

    public float BC0() {
        return this.A01.BC0();
    }

    public long BHc() {
        return this.A01.BHc();
    }

    public long Bvt(float f) {
        return this.A01.Bvt(f);
    }

    public /* synthetic */ C137506gF(C137496gE r2, C05250Oz r3, int i) {
    }

    public final void A00(C161047m3 r9, C161817nW r10, C94894iy r11, long j) {
        C161817nW r7 = this.A00;
        this.A00 = r10;
        C137496gE r1 = this.A01;
        AnonymousClass5RW r6 = r11.A0G.A0C;
        C128306Bs r5 = r1.A02;
        C161937ni r4 = r5.A02;
        AnonymousClass5RW r3 = r5.A03;
        C161047m3 r2 = r5.A01;
        long j2 = r5.A00;
        r5.A02 = r11;
        r5.A03 = r6;
        r5.A01 = r9;
        r5.A00 = j;
        r9.BpF();
        r10.B5y(this);
        r9.Boi();
        r5.A02 = r4;
        r5.A03 = r3;
        r5.A01 = r2;
        r5.A00 = j2;
        this.A00 = r7;
    }

    public void B63() {
        C161047m3 A002 = C128306Bs.A00(this.A01.A03);
        C161817nW r3 = this.A00;
        AnonymousClass00C.A0B(r3);
        C137856gq r32 = (C137856gq) r3;
        C137856gq r1 = r32.A03;
        C137856gq r7 = r1.A02;
        if (r7 != null && (r7.A00 & 4) != 0) {
            while ((r7.A01 & 2) == 0) {
                if ((r7.A01 & 4) == 0) {
                    r7 = r7.A02;
                    if (r7 == null) {
                        break;
                    }
                } else {
                    C1506776e r4 = null;
                    do {
                        if (r7 instanceof C161817nW) {
                            C161817nW r72 = (C161817nW) r7;
                            C94894iy A06 = C137856gq.A06((C137856gq) r72);
                            ((AndroidComposeView) C129586Hq.A00(A06.A0G)).A0X.A00(A002, r72, A06, AnonymousClass6GI.A02(A06.A03));
                        } else if ((r7.A01 & 4) != 0 && (r7 instanceof C94114hf)) {
                            int i = 0;
                            for (C137856gq r2 = ((C94114hf) r7).A00; r2 != null; r2 = r2.A02) {
                                if ((r2.A01 & 4) != 0) {
                                    i++;
                                    if (i == 1) {
                                        r7 = r2;
                                    } else {
                                        r4 = C90464aC.A0F(r4);
                                        r7 = C90524aI.A0D(r4, r7);
                                        r4.A0D(r2);
                                    }
                                }
                            }
                            if (i == 1) {
                                continue;
                            }
                        }
                        r7 = AnonymousClass6VZ.A00(r4);
                        continue;
                    } while (r7 != null);
                    return;
                }
            }
        }
        C94894iy r22 = r1.A05;
        AnonymousClass00C.A0B(r22);
        if (r22.A0M() == r32.A03) {
            r22 = r22.A05;
            AnonymousClass00C.A0B(r22);
        }
        r22.A0U(A002);
    }

    public void B6C(C114365h6 r4, C161177mK r5, C109085Wf r6, float f, int i, long j) {
        C137496gE r2 = this.A01;
        r2.A02.A01.B6A(C137496gE.A01(r2, r6, 3, j), r5);
    }

    public AnonymousClass7bT BBD() {
        return this.A01.A03;
    }

    public int Bor(float f) {
        return AnonymousClass6QY.A01(this.A01, f);
    }

    public float Bvh(long j) {
        return AnonymousClass6GH.A00(this.A01, j);
    }

    public float Bvi(float f) {
        return f / this.A01.BAy();
    }

    public float Bvp(long j) {
        return AnonymousClass6QY.A00(this.A01, j);
    }

    public float Bvq(float f) {
        return f * this.A01.BAy();
    }

    public long Bvs(long j) {
        return AnonymousClass6QY.A02(this.A01, j);
    }

    public AnonymousClass5RW getLayoutDirection() {
        return this.A01.A02.A03;
    }

    public C137506gF() {
    }
}
