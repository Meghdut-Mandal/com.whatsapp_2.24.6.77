package X;

import java.util.List;

/* renamed from: X.9yq  reason: invalid class name and case insensitive filesystem */
public class C208789yq implements B37 {
    public List A00 = AnonymousClass001.A0I();
    public float A01;
    public float A02;
    public int A03 = -1;
    public AnonymousClass9X5 A04 = null;
    public boolean A05;
    public boolean A06 = true;
    public boolean A07 = false;
    public final /* synthetic */ AnonymousClass9p5 A08;

    public void B1N(float f, float f2, float f3, float f4, float f5, boolean z, boolean z2) {
        this.A07 = true;
        this.A06 = false;
        AnonymousClass9X5 r0 = this.A04;
        AnonymousClass9p5.A0T(this, r0.A03, r0.A04, f, f2, f3, f4, f5, z, z2);
        this.A06 = true;
        this.A05 = false;
    }

    public C208789yq(C208799yr r3, AnonymousClass9p5 r4) {
        this.A08 = r4;
        if (r3 != null) {
            r3.A03(this);
            if (this.A05) {
                this.A00.get(-1);
                throw AnonymousClass001.A0A("add");
            }
        }
    }

    public void B51(float f, float f2, float f3, float f4, float f5, float f6) {
        if (this.A06 || this.A07) {
            AnonymousClass9X5 r1 = this.A04;
            r1.A00(f, f2);
            this.A00.add(r1);
            this.A07 = false;
        }
        this.A04 = new AnonymousClass9X5(this.A08, f5, f6, f5 - f3, f6 - f4);
        this.A05 = false;
    }

    public void BOB(float f, float f2) {
        AnonymousClass9X5 r1 = this.A04;
        r1.A00(f, f2);
        this.A00.add(r1);
        AnonymousClass9p5 r2 = this.A08;
        AnonymousClass9X5 r12 = this.A04;
        this.A04 = new AnonymousClass9X5(r2, f, f2, f - r12.A03, f2 - r12.A04);
        this.A05 = false;
    }

    public void BPz(float f, float f2) {
        if (this.A05) {
            AnonymousClass9X5 r1 = this.A04;
            List list = this.A00;
            r1.A01((AnonymousClass9X5) list.get(this.A03));
            list.set(this.A03, this.A04);
            this.A05 = false;
        }
        AnonymousClass9X5 r12 = this.A04;
        if (r12 != null) {
            this.A00.add(r12);
        }
        this.A01 = f;
        this.A02 = f2;
        this.A04 = new AnonymousClass9X5(this.A08, f, f2, 0.0f, 0.0f);
        this.A03 = this.A00.size();
    }

    public void Bmc(float f, float f2, float f3, float f4) {
        AnonymousClass9X5 r1 = this.A04;
        r1.A00(f, f2);
        this.A00.add(r1);
        this.A04 = new AnonymousClass9X5(this.A08, f3, f4, f3 - f, f4 - f2);
        this.A05 = false;
    }

    public void close() {
        this.A00.add(this.A04);
        BOB(this.A01, this.A02);
        this.A05 = true;
    }
}
