package X;

/* renamed from: X.A0f  reason: case insensitive filesystem */
public class C20948A0f implements B0Y {
    public final int A00;
    public final B0Y A01;

    public boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof C20948A0f)) {
                return false;
            }
            C20948A0f a0f = (C20948A0f) obj;
            if (this.A00 != a0f.A00 || !this.A01.equals(a0f.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (this.A01.hashCode() * 1013) + this.A00;
    }

    public C20948A0f(B0Y b0y, int i) {
        this.A01 = b0y;
        this.A00 = i;
    }

    public String toString() {
        C198779eB r2 = new C198779eB(C90484aE.A0k(this));
        C198779eB.A00(r2, this.A01, "imageCacheKey");
        C198779eB.A00(r2, String.valueOf(this.A00), "frameIndex");
        return r2.toString();
    }
}
