package X;

/* renamed from: X.5AH  reason: invalid class name */
public abstract class AnonymousClass5AH extends AnonymousClass66O {
    public Object A02(C132286Sy r6) {
        if (this instanceof C105845He) {
            C105845He r2 = (C105845He) this;
            AnonymousClass00C.A0D(r6, 0);
            int i = r6.A01;
            if (i == -20) {
                return new C105975Hw(AnonymousClass001.A09(r6.A03));
            }
            switch (i) {
                case 3847001:
                    return AnonymousClass5I5.A00;
                case 3847002:
                    return AnonymousClass5I1.A00;
                case 3847003:
                    return AnonymousClass5I3.A00;
                default:
                    switch (i) {
                        case 3847006:
                            return AnonymousClass5I0.A00;
                        case 3847007:
                            return AnonymousClass5I2.A00;
                        case 3847008:
                            String str = r6.A05;
                            if (str == null) {
                                str = "unknown";
                            }
                            return new C105985Hx(str);
                        case 3847009:
                            boolean A01 = r2.A01.A01();
                            boolean z = false;
                            if (r2.A00.A00.A03((C159687jl) null, "meta-avatar", false) != null) {
                                z = true;
                            }
                            return new C106005Hz(A01, z);
                        case 3847010:
                            return AnonymousClass5I4.A00;
                        default:
                            return new C105995Hy(i);
                    }
            }
        } else if (this instanceof C105835Hd) {
            AnonymousClass00C.A0D(r6, 0);
            int i2 = r6.A01;
            switch (i2) {
                case 3847001:
                    return C105965Hv.A00;
                case 3847002:
                    return C105955Hu.A00;
                default:
                    return new C105925Hr(i2);
            }
        } else if (this instanceof C105825Hc) {
            AnonymousClass00C.A0D(r6, 0);
            int i3 = r6.A01;
            switch (i3) {
                case 3847001:
                    return C105915Ho.A00;
                case 3847002:
                    return C105895Hm.A00;
                case 3847004:
                    return AnonymousClass5Hl.A00;
                case 3847005:
                    return C105885Hk.A00;
                default:
                    return new C105875Hj(i3);
            }
        } else if (this instanceof C105815Hb) {
            AnonymousClass00C.A0D(r6, 0);
            return new AnonymousClass52F(r6.A01);
        } else {
            AnonymousClass00C.A0D(r6, 0);
            return new AnonymousClass52F(r6.A01);
        }
    }
}
