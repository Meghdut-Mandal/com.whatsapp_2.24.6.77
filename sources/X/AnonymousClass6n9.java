package X;

/* renamed from: X.6n9  reason: invalid class name */
public final class AnonymousClass6n9 implements C23090B4a {
    public int A00;
    public int A01;
    public boolean A02;
    public final C21690ze A03;
    public final AnonymousClass00T A04 = C36431kI.A1I(AnonymousClass7QN.A00);
    public final AnonymousClass00T A05;

    public void BPE(String str, String str2) {
        AnonymousClass00C.A0D(str2, 1);
        if (!C36331k8.A1b(this.A05)) {
            C21690ze r1 = this.A03;
            if (r1.BMN(A00(this))) {
                r1.markerAnnotate(A00(this), str, str2);
            }
        }
    }

    public static final int A00(AnonymousClass6n9 r3) {
        int i = r3.A01;
        boolean z = r3.A02;
        if (i != 0) {
            if (i != 1) {
                if (z) {
                    return 992354097;
                }
                return 325387467;
            } else if (z) {
                return 992361940;
            } else {
                return 325401997;
            }
        } else if (z) {
            return 992353024;
        } else {
            return 325397055;
        }
    }

    public void BPF(int i) {
        if (!C36331k8.A1b(this.A05)) {
            C21690ze r2 = this.A03;
            if (r2.BMN(A00(this))) {
                r2.markerEnd(A00(this), (short) i);
                if (this.A01 == 1 && (i == 4 || i == 3)) {
                    synchronized (C199259ez.A03) {
                    }
                }
                C90524aI.A0C(this.A04).removeCallbacksAndMessages((Object) null);
            }
        }
    }

    public void BPK(String str) {
        if (!C36331k8.A1b(this.A05)) {
            C21690ze r1 = this.A03;
            if (r1.BMN(A00(this))) {
                r1.markerPoint(A00(this), str);
            }
        }
    }

    public void markerStart(int i) {
        if (!C36331k8.A1b(this.A05)) {
            C21690ze r2 = this.A03;
            if (r2.BMN(A00(this))) {
                BPE("cancel_reason", "cancelled_by_new_event");
                BPF(4);
            }
            this.A01 = i;
            this.A00 = 0;
            r2.BPO(A00(this), false);
            C90524aI.A0C(this.A04).postDelayed(new C80243v5(this, 36), 10000);
        }
    }

    public AnonymousClass6n9(C20810yC r3, C21690ze r4) {
        C36321k7.A0x(r4, r3);
        this.A03 = r4;
        this.A05 = C001400p.A00(C000800j.PUBLICATION, new AnonymousClass7MF(r3));
    }
}
