package X;

/* renamed from: X.ASz  reason: case insensitive filesystem */
public final class C21633ASz implements B6G {
    public /* bridge */ /* synthetic */ AnonymousClass2bI B4c(C64933Qa r3, int i, long j) {
        C181408nQ r1;
        int i2;
        if (i == 75) {
            return new C181408nQ(r3, 75, j);
        }
        if (i == 95) {
            r1 = new C181408nQ(r3, 95, j);
            i2 = 2;
        } else if (i == 98) {
            r1 = new C181408nQ(r3, 98, j);
            i2 = 0;
        } else {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("System Action `");
            A0u.append(i);
            throw AnonymousClass000.A0g("` not supported by this factory.", A0u);
        }
        r1.A00 = i2;
        return r1;
    }
}
