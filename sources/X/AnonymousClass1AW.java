package X;

/* renamed from: X.1AW  reason: invalid class name */
public final class AnonymousClass1AW {
    public final C23861Ad A00;
    public final C23881Af A01;
    public final C23891Ag A02;
    public final AnonymousClass1AY A03;
    public final AnonymousClass1AZ A04;
    public final C23831Aa A05;
    public final C23841Ab A06;
    public final C23851Ac A07;

    public AnonymousClass1AW(C23861Ad r2, C23881Af r3, C23891Ag r4, AnonymousClass1AY r5, AnonymousClass1AZ r6, C23831Aa r7, C23841Ab r8, C23851Ac r9) {
        AnonymousClass00C.A0D(r5, 1);
        AnonymousClass00C.A0D(r6, 2);
        AnonymousClass00C.A0D(r7, 3);
        AnonymousClass00C.A0D(r8, 4);
        AnonymousClass00C.A0D(r9, 5);
        AnonymousClass00C.A0D(r2, 6);
        AnonymousClass00C.A0D(r3, 7);
        AnonymousClass00C.A0D(r4, 8);
        this.A03 = r5;
        this.A04 = r6;
        this.A05 = r7;
        this.A06 = r8;
        this.A07 = r9;
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = r4;
    }

    public final C200259gz A00(C207219uk r9) {
        C207089uX r0;
        C207219uk r4 = r9;
        AnonymousClass00C.A0D(r9, 0);
        int i = r9.A00;
        switch (i) {
            case 0:
            case 8:
                StringBuilder sb = new StringBuilder();
                sb.append("Unknown type of interactive message does not support customizations: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            case 1:
                C18800tq r02 = this.A03.A00.A00;
                return new C181898oD(C18800tq.ADQ(r02), r9, C18800tq.AJH(r02));
            case 2:
                return new C181908oE(r9, C18800tq.AJH(this.A04.A00.A00));
            case 3:
                C18800tq r03 = this.A05.A00.A00;
                return new C181948oI((C20810yC) r03.A02.get(), r9, C18800tq.AJH(r03));
            case 4:
                return new C181928oG(r9, C18800tq.AJH(this.A06.A00.A00));
            case 5:
            case 9:
                if (!r9.A05() || (r0 = r9.A04) == null || r0.A01 != 2) {
                    C18800tq r04 = this.A07.A00.A00;
                    return new C181938oH((C20810yC) r04.A02.get(), r9, C18800tq.AJH(r04));
                }
                C18800tq r05 = this.A02.A00.A00;
                return new C181958oJ((C20810yC) r05.A02.get(), r9, C18800tq.AJH(r05));
            case 6:
                C18800tq r06 = this.A00.A00.A00;
                return new C181888oC((C20810yC) r06.A02.get(), r9, C18800tq.AJH(r06));
            case 7:
                C18800tq r1 = this.A01.A00.A00;
                return new C181918oF((C20810yC) r1.A02.get(), r4, C18800tq.AJ5(r1), C18800tq.AJB(r1), C18800tq.AJH(r1), this);
            default:
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Unknown type of interactive message does not support customizations: ");
                sb2.append(i);
                throw new IllegalStateException(sb2.toString());
        }
    }

    public final C200259gz A01(C23043B1o b1o) {
        AnonymousClass00C.A0D(b1o, 0);
        C207219uk BA8 = b1o.BA8();
        if (BA8 != null) {
            return A00(BA8);
        }
        return null;
    }
}
