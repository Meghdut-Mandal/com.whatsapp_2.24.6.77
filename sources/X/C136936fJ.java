package X;

import android.view.Choreographer;

/* renamed from: X.6fJ  reason: invalid class name and case insensitive filesystem */
public final class C136936fJ implements C162267oJ {
    public final Choreographer A00;
    public final C156727aR A01;

    public Object BxV(C023509x r7, C006302t r8) {
        C006302t r0;
        C156727aR r5 = this.A01;
        AnonymousClass0AR A02 = AnonymousClass0AA.A02(r7);
        C135296cT r3 = new C135296cT(this, r8, A02);
        Choreographer choreographer = r5.A05;
        Choreographer choreographer2 = this.A00;
        if (AnonymousClass00C.A0J(choreographer, choreographer2)) {
            synchronized (r5.A08) {
                r5.A01.add(r3);
                if (!r5.A02) {
                    r5.A02 = true;
                    choreographer.postFrameCallback(r5.A07);
                }
            }
            r0 = new C154847Tt(r3, r5);
        } else {
            choreographer2.postFrameCallback(r3);
            r0 = new C154857Tu(r3, this);
        }
        A02.BL1(r0);
        return A02.A0G();
    }

    public C136936fJ(Choreographer choreographer, C156727aR r2) {
        this.A00 = choreographer;
        this.A01 = r2;
    }

    public Object fold(Object obj, C009003v r3) {
        return C90504aG.A0j(obj, this, r3);
    }

    public C005202i get(C005902p r2) {
        return C008803t.A00(this, r2);
    }

    public /* synthetic */ C005902p getKey() {
        return C162267oJ.A00;
    }

    public C005102h minusKey(C005902p r2) {
        return C008803t.A01(this, r2);
    }

    public C005102h plus(C005102h r2) {
        return C008803t.A02(this, r2);
    }
}
