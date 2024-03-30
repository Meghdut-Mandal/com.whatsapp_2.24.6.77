package X;

/* renamed from: X.Aaj  reason: case insensitive filesystem */
public class C21808Aaj implements B0N {
    public long A00;
    public final B0N A01;

    public C21808Aaj(B0N b0n) {
        this.A01 = b0n;
    }

    public String readLine() {
        long currentTimeMillis = System.currentTimeMillis();
        String readLine = this.A01.readLine();
        this.A00 += System.currentTimeMillis() - currentTimeMillis;
        return readLine;
    }
}
