package androidx.compose.ui.input.pointer;

import X.AnonymousClass0AA;
import X.AnonymousClass0AP;
import X.AnonymousClass0AR;
import X.AnonymousClass6GH;
import X.AnonymousClass6QY;
import X.C005102h;
import X.C008903u;
import X.C023509x;
import X.C107935Rl;
import X.C1506776e;
import X.C161887nd;
import X.C161937ni;
import X.C94464iG;

public final class SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine implements C023509x, C161937ni, C161887nd {
    public C107935Rl A00 = C107935Rl.Main;
    public AnonymousClass0AP A01;
    public final C023509x A02;
    public final C005102h A03 = C008903u.A00;
    public final /* synthetic */ C94464iG A04;
    public final /* synthetic */ C94464iG A05;

    public float BAy() {
        return this.A05.BAy();
    }

    public float BC0() {
        return this.A05.BC0();
    }

    public long Bvt(float f) {
        return this.A05.Bvt(f);
    }

    public SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine(C94464iG r2, C023509x r3) {
        this.A04 = r2;
        this.A02 = r3;
        this.A05 = r2;
    }

    public int Bor(float f) {
        return AnonymousClass6QY.A01(this.A05, f);
    }

    public float Bvh(long j) {
        return AnonymousClass6GH.A00(this.A05, j);
    }

    public float Bvi(float f) {
        return f / this.A05.BAy();
    }

    public float Bvp(long j) {
        return AnonymousClass6QY.A00(this.A05, j);
    }

    public float Bvq(float f) {
        return f * this.A05.BAy();
    }

    public long Bvs(long j) {
        return AnonymousClass6QY.A02(this.A05, j);
    }

    public void resumeWith(Object obj) {
        C1506776e r1 = this.A04.A05;
        synchronized (r1) {
            r1.A0F(this);
        }
        this.A02.resumeWith(obj);
    }

    public Object B1d(C107935Rl r2, C023509x r3) {
        AnonymousClass0AR A022 = AnonymousClass0AA.A02(r3);
        this.A00 = r2;
        this.A01 = A022;
        return A022.A0G();
    }

    public C005102h getContext() {
        return this.A03;
    }
}
