package X;

import java.util.Objects;

public final class A01 implements B2j {
    public boolean A00;
    public final B2j A01;
    public final /* synthetic */ C209349zr A02;

    public A01(C209349zr r1, B2j b2j) {
        this.A02 = r1;
        this.A01 = b2j;
    }

    public boolean BMw() {
        if (AnonymousClass000.A1P((this.A02.A01 > -9223372036854775807L ? 1 : (this.A02.A01 == -9223372036854775807L ? 0 : -1))) || !this.A01.BMw()) {
            return false;
        }
        return true;
    }

    public void BPd() {
        this.A01.BPd();
    }

    public int Bms(C190989Bd r11, AnonymousClass82Z r12, int i) {
        C209349zr r1 = this.A02;
        if (AnonymousClass000.A1P((r1.A01 > -9223372036854775807L ? 1 : (r1.A01 == -9223372036854775807L ? 0 : -1)))) {
            return -3;
        }
        if (this.A00) {
            r12.A00 = 4;
            return -4;
        }
        int Bms = this.A01.Bms(r11, r12, i);
        if (Bms == -5) {
            C207099uY r5 = r11.A00;
            Objects.requireNonNull(r5);
            int i2 = r5.A07;
            if (!(i2 == 0 && r5.A08 == 0)) {
                int i3 = 0;
                if (r1.A00 == Long.MIN_VALUE) {
                    i3 = r5.A08;
                }
                C199159en r13 = new C199159en(r5);
                r13.A06 = i2;
                r13.A07 = i3;
                r11.A00 = new C207099uY(r13);
            }
            return -5;
        }
        long j = r1.A00;
        if (j == Long.MIN_VALUE || (Bms != -4 ? !(Bms == -3 && r1.B93() == Long.MIN_VALUE) : r12.A00 < j)) {
            return Bms;
        }
        r12.clear();
        r12.A00 = 4;
        this.A00 = true;
        return -4;
    }

    public int BuD(long j) {
        if (AnonymousClass000.A1P((this.A02.A01 > -9223372036854775807L ? 1 : (this.A02.A01 == -9223372036854775807L ? 0 : -1)))) {
            return -3;
        }
        return this.A01.BuD(j);
    }
}
