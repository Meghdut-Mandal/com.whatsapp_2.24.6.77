package X;

import androidx.compose.foundation.FocusableNode$onFocusEvent$1;
import androidx.compose.foundation.relocation.BringIntoViewRequesterImpl;

/* renamed from: X.4ir  reason: invalid class name and case insensitive filesystem */
public final class C94834ir extends C94114hf implements C161827nX, C161837nY, C161737nO, C161767nR {
    public C157647ds A00;
    public final C94124hg A01;
    public final C157547di A02;
    public final C94364i5 A03;
    public final C94434iD A04;
    public final C94194ho A05;
    public final C93474gc A06;

    public /* synthetic */ void BeX(long j) {
    }

    public void B1K(AnonymousClass7e3 r2) {
        this.A04.B1K(r2);
    }

    public void BYG(C157647ds r7) {
        C006302t r1;
        if (!AnonymousClass00C.A0J(this.A00, r7)) {
            boolean BLs = r7.BLs();
            if (BLs) {
                C36331k8.A1T(new FocusableNode$onFocusEvent$1(this, (C023509x) null), A07());
            }
            if (this.A08) {
                AnonymousClass6VZ.A05(this);
            }
            C94124hg r5 = this.A01;
            C161437mu r3 = r5.A01;
            if (r3 != null) {
                C136636ek r12 = r5.A00;
                if (BLs) {
                    if (r12 != null) {
                        C94124hg.A00(r5, new C136676eo(r12), r3);
                        r5.A00 = null;
                    }
                    C136636ek r0 = new C136636ek();
                    C94124hg.A00(r5, r0, r3);
                    r5.A00 = r0;
                } else if (r12 != null) {
                    C94124hg.A00(r5, new C136676eo(r12), r3);
                    r5.A00 = null;
                }
            }
            C94194ho r2 = this.A05;
            if (BLs != r2.A00) {
                if (BLs) {
                    C94194ho.A00(r2);
                } else if (r2.A08 && (r1 = (C006302t) C109185Wp.A00(r2, C112165dS.A00)) != null) {
                    r1.invoke((Object) null);
                }
                r2.A00 = BLs;
            }
            C94364i5 r32 = this.A03;
            C137776gi r22 = null;
            if (BLs) {
                C10810fG r13 = new C10810fG();
                C109285Wz.A00(r32, new AnonymousClass7NP(r32, r13));
                C157717dz r02 = (C157717dz) r13.element;
                if (r02 != null) {
                    r22 = r02.Blc();
                }
            } else {
                C157707dy r03 = r32.A00;
                if (r03 != null) {
                    r03.release();
                }
            }
            r32.A00 = r22;
            r32.A01 = BLs;
            this.A04.A00 = BLs;
            this.A00 = r7;
        }
    }

    public void BYg(C160787la r2) {
        this.A05.BYg(r2);
    }

    public void Bcj(C160787la r2) {
        this.A06.A00 = r2;
    }

    public C94834ir(C161437mu r3) {
        C94434iD r0 = new C94434iD();
        A0F(r0);
        this.A04 = r0;
        C94124hg r02 = new C94124hg(r3);
        A0F(r02);
        this.A01 = r02;
        C94364i5 r03 = new C94364i5();
        A0F(r03);
        this.A03 = r03;
        C94194ho r04 = new C94194ho();
        A0F(r04);
        this.A05 = r04;
        BringIntoViewRequesterImpl bringIntoViewRequesterImpl = new BringIntoViewRequesterImpl();
        this.A02 = bringIntoViewRequesterImpl;
        C93474gc r05 = new C93474gc(bringIntoViewRequesterImpl);
        A0F(r05);
        this.A06 = r05;
    }

    public /* synthetic */ boolean BHU() {
        return false;
    }
}
