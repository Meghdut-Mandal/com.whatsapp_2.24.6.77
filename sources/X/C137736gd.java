package X;

import java.util.Map;

/* renamed from: X.6gd  reason: invalid class name and case insensitive filesystem */
public final class C137736gd implements C160287kl {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C137816gm A02;
    public final /* synthetic */ C136906fE A03;
    public final /* synthetic */ Map A04;
    public final /* synthetic */ C006302t A05;

    public C137736gd(C137816gm r1, C136906fE r2, Map map, C006302t r4, int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        this.A04 = map;
        this.A02 = r1;
        this.A03 = r2;
        this.A05 = r4;
    }

    public void Bld() {
        C006302t r1;
        C94744ii r0;
        if (!this.A02.BMI() || (r0 = this.A03.A09.A0R.A06.A00) == null) {
            r1 = this.A05;
            r0 = this.A03.A09.A0R.A06;
        } else {
            r1 = this.A05;
        }
        r1.invoke(r0.A02);
    }

    public Map B8T() {
        return this.A04;
    }

    public int getHeight() {
        return this.A00;
    }

    public int getWidth() {
        return this.A01;
    }
}
