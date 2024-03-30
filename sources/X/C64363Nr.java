package X;

/* renamed from: X.3Nr  reason: invalid class name and case insensitive filesystem */
public final class C64363Nr {
    public final int A00;
    public final int A01;
    public final long A02;
    public final String A03;
    public final String A04;

    public C64363Nr(String str, String str2, int i, int i2, long j) {
        this.A01 = i;
        this.A00 = i2;
        this.A02 = j * 1000;
        this.A03 = str;
        this.A04 = str2;
    }

    public C64363Nr() {
        this.A01 = 0;
        this.A00 = 2;
        this.A02 = -1;
        this.A03 = null;
        this.A04 = null;
    }
}
