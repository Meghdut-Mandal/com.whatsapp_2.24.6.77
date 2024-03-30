package X;

/* renamed from: X.3Kl  reason: invalid class name and case insensitive filesystem */
public final class C63543Kl {
    public boolean A00;
    public int A01 = -1;
    public String A02;
    public final C19420v0 A03;
    public final C225314u A04;

    public C63543Kl(C225314u r2, C19420v0 r3) {
        AnonymousClass00C.A0D(r3, 2);
        this.A04 = r2;
        this.A03 = r3;
    }

    public final void A00() {
        this.A00 = false;
        C65983Uf.A00 = C36341k9.A0E(this.A03).getString("registration_failure_reason", "");
        String str = this.A02;
        if (str != null) {
            this.A04.BO6(str);
        }
        int i = this.A01;
        if (i != -1) {
            AnonymousClass3SJ.A01(this.A04, i);
        }
        this.A02 = null;
        this.A01 = -1;
    }

    public final void A03(String str) {
        AnonymousClass00C.A0D(str, 0);
        if (!this.A00) {
            C225314u r1 = this.A04;
            if (!r1.isFinishing()) {
                r1.BO6(str);
                return;
            }
        }
        this.A02 = str;
    }

    public final void A01(int i) {
        if (!this.A00) {
            AnonymousClass3SJ.A01(this.A04, i);
        } else {
            this.A01 = i;
        }
    }

    public final void A02(int i) {
        if (!this.A00) {
            C225314u r1 = this.A04;
            if (!r1.isFinishing()) {
                r1.BO5(i);
                return;
            }
        }
        C225314u r0 = this.A04;
        r0.getString(i);
        this.A02 = r0.getString(i);
    }
}
