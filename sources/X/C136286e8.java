package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;

/* renamed from: X.6e8  reason: invalid class name and case insensitive filesystem */
public final class C136286e8 implements C160687lQ {
    public final long A00;
    public final C129076Ev A01;
    public final C129076Ev A02;
    public final C129076Ev A03;
    public final C129076Ev A04;
    public final C156857b4 A05;
    public final C160547lB A06;
    public final Object A07;
    public final Object A08;

    public Object BIp(long j) {
        long j2 = j;
        if (j >= this.A00) {
            return this.A08;
        }
        C129076Ev BIr = this.A06.BIr(this.A02, this.A04, this.A03, j2);
        int i = 0;
        int A022 = BIr.A02();
        while (i < A022) {
            if (!Float.isNaN(BIr.A01(i))) {
                i++;
            } else {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("AnimationVector cannot contain a NaN. ");
                A0u.append(BIr);
                A0u.append(". Animation: ");
                A0u.append(this);
                throw AnonymousClass001.A09(C36381kD.A0z(", playTimeNanos: ", A0u, j));
            }
        }
        return ((C136386eJ) this.A05).A00.invoke(BIr);
    }

    public C129076Ev BIx(long j) {
        long j2 = j;
        if (j >= this.A00) {
            return this.A01;
        }
        return this.A06.BIv(this.A02, this.A04, this.A03, j2);
    }

    public boolean BM1() {
        return this.A06.BM1();
    }

    public C136286e8(AnonymousClass7dW r7, C129076Ev r8, C156857b4 r9, Object obj, Object obj2) {
        C129076Ev A002;
        C160547lB BxH = r7.BxH(r9);
        this.A06 = BxH;
        this.A05 = r9;
        this.A07 = obj;
        this.A08 = obj2;
        C129076Ev A003 = C136386eJ.A00(r9, obj);
        this.A02 = A003;
        C129076Ev r3 = (C129076Ev) ((C136386eJ) this.A05).A01.invoke(this.A08);
        this.A04 = r3;
        if (r8 != null) {
            A002 = C108975Vs.A00(r8);
        } else {
            A002 = C129076Ev.A00(C136386eJ.A00(this.A05, obj));
        }
        this.A03 = A002;
        this.A00 = BxH.BBJ(A003, r3, A002);
        this.A01 = BxH.BBb(A003, r3, A002);
    }

    public long BBH() {
        return this.A00;
    }

    public Object BID() {
        return this.A08;
    }

    public C156857b4 BIe() {
        return this.A05;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("TargetBasedAnimation: ");
        A0u.append(this.A07);
        A0u.append(" -> ");
        A0u.append(this.A08);
        A0u.append(",initial velocity: ");
        A0u.append(this.A03);
        A0u.append(", duration: ");
        A0u.append(this.A00 / SearchActionVerificationClientService.MS_TO_NS);
        A0u.append(" ms,animationSpec: ");
        return AnonymousClass000.A0o(this.A06, A0u);
    }
}
