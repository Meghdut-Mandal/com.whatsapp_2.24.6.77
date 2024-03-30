package X;

import android.os.Bundle;

/* renamed from: X.0Hm  reason: invalid class name and case insensitive filesystem */
public class C03730Hm extends C001700s implements C15790nz {
    public AnonymousClass012 A00;
    public C09900dL A01;
    public AnonymousClass0V4 A02;
    public final Bundle A03;
    public final AnonymousClass0V4 A04;

    public void A05() {
        AnonymousClass0V4 r1 = this.A04;
        r1.A06 = true;
        r1.A05 = false;
        r1.A02 = false;
        r1.A03();
    }

    public void A06() {
        AnonymousClass0V4 r1 = this.A04;
        r1.A06 = false;
        r1.A02();
    }

    public AnonymousClass0V4 A0E(boolean z) {
        AnonymousClass0V4 r3 = this.A04;
        r3.A00();
        r3.A02 = true;
        C09900dL r2 = this.A01;
        if (r2 != null) {
            A0B(r2);
            if (z && r2.A00) {
                r2.A01.Ba7(r2.A02);
            }
        }
        C15790nz r0 = r3.A01;
        if (r0 == null) {
            throw AnonymousClass001.A09("No listener register");
        } else if (r0 == this) {
            r3.A01 = null;
            if ((r2 == null || r2.A00) && !z) {
                return r3;
            }
            r3.A01();
            r3.A05 = true;
            r3.A06 = false;
            r3.A02 = false;
            r3.A03 = false;
            r3.A04 = false;
            return this.A02;
        } else {
            throw AnonymousClass001.A08("Attempting to unregister the wrong listener");
        }
    }

    public void A0F() {
        AnonymousClass012 r1 = this.A00;
        C09900dL r0 = this.A01;
        if (r1 != null && r0 != null) {
            super.A0B(r0);
            A08(r1, r0);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append("LoaderInfo{");
        AnonymousClass000.A1B(this, sb);
        sb.append(" #");
        sb.append(0);
        sb.append(" : ");
        C05500Py.A00(this.A04, sb);
        return AnonymousClass000.A0q("}}", sb);
    }

    public C03730Hm(Bundle bundle, AnonymousClass0V4 r3, AnonymousClass0V4 r4) {
        this.A03 = bundle;
        this.A04 = r3;
        this.A02 = r4;
        if (r3.A01 == null) {
            r3.A01 = this;
            return;
        }
        throw AnonymousClass001.A09("There is already a listener registered");
    }

    public void A0B(AnonymousClass04S r2) {
        super.A0B(r2);
        this.A00 = null;
        this.A01 = null;
    }

    public void A0D(Object obj) {
        super.A0D(obj);
        AnonymousClass0V4 r1 = this.A02;
        if (r1 != null) {
            r1.A01();
            r1.A05 = true;
            r1.A06 = false;
            r1.A02 = false;
            r1.A03 = false;
            r1.A04 = false;
            this.A02 = null;
        }
    }
}
