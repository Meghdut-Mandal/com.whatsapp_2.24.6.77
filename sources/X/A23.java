package X;

import android.opengl.GLES20;

public class A23 implements C23071B3a, C23064B2n, C23012B0d {
    public int A00;
    public int A01;
    public int A02;
    public C203159nQ A03;
    public AnonymousClass9ST A04;
    public C120885sF A05;
    public final C198549dl A06;
    public final AnonymousClass9NT A07 = new AnonymousClass9NT();
    public final C203159nQ A08;
    public final boolean A09;
    public volatile int A0A;
    public volatile C157787eg A0B;

    public A23(C198549dl r3, C203159nQ r4, C203159nQ r5, boolean z) {
        this.A06 = r3;
        this.A08 = r4;
        this.A03 = r5;
        this.A09 = z;
        this.A0A = 5;
    }

    public Object BDd() {
        return this;
    }

    public synchronized int BEs() {
        return this.A0A;
    }

    public void BKM(C201589jv r1) {
    }

    public boolean BLf(AnonymousClass9NT r2) {
        return true;
    }

    public void release() {
    }

    private void A00() {
        if (this.A05 == null) {
            AnonymousClass9ST r1 = this.A04;
            if (r1 == null) {
                this.A06.A00(C188278zK.A0F);
                return;
            }
            int i = this.A02;
            boolean z = true;
            boolean A1R = AnonymousClass000.A1R(i);
            int i2 = this.A01;
            if (i2 <= 0) {
                z = false;
            }
            if (!A1R) {
                this.A06.A00(C188278zK.A0H);
                if (z) {
                    return;
                }
            } else if (z) {
                boolean z2 = this.A09;
                C133216Xg r0 = r1.A02;
                boolean z3 = false;
                if ((r0.A00 & 32) != 0) {
                    z3 = true;
                }
                C120885sF r4 = new C120885sF(i, i2, z3);
                if (z2 || z3) {
                    C123645wq r7 = r4.A00;
                    GLES20.glBindFramebuffer(36160, r7.A00);
                    int[] iArr = new int[1];
                    r7.A05 = iArr;
                    GLES20.glGenRenderbuffers(1, iArr, 0);
                    GLES20.glBindRenderbuffer(36161, r7.A05[0]);
                    GLES20.glRenderbufferStorage(36161, 33189, r7.A02, r7.A01);
                    GLES20.glFramebufferRenderbuffer(36160, 36096, 36161, r7.A05[0]);
                    int glCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
                    if (glCheckFramebufferStatus == 36053) {
                        GLES20.glBindRenderbuffer(36161, 0);
                        GLES20.glBindFramebuffer(36160, 0);
                    } else {
                        throw C165567td.A0U("Depth buffer attachment to FrameBufferTexture failed with ", AnonymousClass000.A0u(), glCheckFramebufferStatus);
                    }
                }
                this.A05 = r4;
                AnonymousClass9NT r2 = this.A07;
                r2.A04 = r4.A01;
                int i3 = 3;
                if (r4.A02) {
                    i3 = 7;
                }
                r2.A00 = i3;
                return;
            }
            this.A06.A00(C188278zK.A0G);
        }
    }

    private void A01() {
        C120885sF r0 = this.A05;
        if (r0 != null) {
            try {
                C123645wq r4 = r0.A00;
                AnonymousClass67V r3 = r4.A03;
                r4.A03 = null;
                if (r3 != null) {
                    GLES20.glDeleteFramebuffers(1, new int[]{r4.A00}, 0);
                    int[] iArr = r4.A05;
                    r4.A05 = null;
                    if (iArr != null) {
                        GLES20.glDeleteRenderbuffers(1, iArr, 0);
                    }
                    r3.A00();
                }
            } finally {
                this.A05 = null;
                this.A07.A04 = null;
            }
        }
    }

    public void A02(int i, int i2, int i3) {
        int i4 = i;
        int i5 = i2;
        if (this.A02 != i || this.A01 != i2 || this.A00 != i3 || this.A05 == null) {
            boolean z = false;
            this.A00 = i3;
            int i6 = i;
            if (i3 % 180 != 0) {
                z = true;
                i6 = i2;
            }
            this.A02 = i6;
            int i7 = i2;
            if (z) {
                i7 = i;
            }
            this.A01 = i7;
            if (this.A04 != null) {
                A01();
                A00();
            }
            C203159nQ r0 = this.A08;
            r0.A07(this.A02, this.A01, i4, i5, this.A00, false, false);
            this.A07.A05 = r0.A06();
        }
    }

    public void B1T(AnonymousClass9ST r1) {
        this.A04 = r1;
        A00();
    }

    public int BEo() {
        return this.A07.A00;
    }

    public RuntimeException BP0() {
        C120885sF r1 = this.A05;
        if (r1 == null || this.A04 == null) {
            if (r1 == null) {
                this.A06.A00(C188278zK.A0J);
                return AnonymousClass001.A09("Frame buffer is null");
            } else if (this.A04 == null) {
                this.A06.A00(C188278zK.A0K);
                return AnonymousClass001.A09("Gl context is null");
            }
        }
        try {
            GLES20.glBindFramebuffer(36160, r1.A00.A00);
            C200339hB.A02("Failure to bind frame buffer", C90524aI.A0w());
            return null;
        } catch (AnonymousClass78N e) {
            this.A06.A00(C188278zK.A0I);
            return e;
        }
    }

    public void BvO() {
        if (this.A05 == null) {
            this.A06.A00(C188278zK.A0N);
            return;
        }
        GLES20.glBindFramebuffer(36160, 0);
        C157787eg r0 = this.A0B;
        if (r0 != null) {
            r0.BYQ();
        }
    }

    public C194849Rm Bwr(AnonymousClass9NT r12) {
        C198549dl r1;
        C188278zK r0;
        C203159nQ r3 = this.A03;
        C194849Rm r13 = r12.A05;
        if (r13 == null) {
            r1 = this.A06;
            r0 = C188278zK.A0P;
        } else if (!r13.A00()) {
            r1 = this.A06;
            r0 = C188278zK.A0O;
        } else {
            r3.A07(r13.A01, r13.A00, this.A02, this.A01, -this.A00, false, false);
            AnonymousClass9NT r2 = this.A07;
            r2.A02 = r12.A02;
            r2.A01 = r12.A01;
            r2.A03 = r12.A03;
            r2.A06 = r12.A06;
            return r3.A06();
        }
        r1.A00(r0);
        return null;
    }

    public void B5N() {
        A01();
        this.A04 = null;
    }

    public AnonymousClass9NT BC4() {
        return this.A07;
    }

    public /* synthetic */ boolean BMY() {
        return false;
    }

    public boolean contains(Object obj) {
        return C36361kB.A1a(obj, this);
    }

    public void BrL(C157787eg r1) {
        this.A0B = r1;
    }
}
