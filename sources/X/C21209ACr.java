package X;

/* renamed from: X.ACr  reason: case insensitive filesystem */
public final class C21209ACr implements B14 {
    public /* synthetic */ void Bd4(C1275768v r1, AnonymousClass8SU r2, AnonymousClass3T1 r3) {
    }

    public void Bd3(AnonymousClass6CO r9, AnonymousClass8NK r10, AnonymousClass3T1 r11) {
        C36321k7.A0w(r11, r10);
        if (!C1899696h.A00(r10, r11) && r11.A1J.A02 && r11.A0D != 0) {
            long j = r11.A0I / 1000;
            long j2 = r11.A0H / 1000;
            if (j2 > 0 && j2 != j) {
                AnonymousClass8SU A0J = AnonymousClass8NN.A0J(r10);
                A0J.bitField0_ |= 32;
                A0J.messageC2STimestamp_ = j2;
            }
        }
    }
}
