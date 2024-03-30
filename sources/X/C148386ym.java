package X;

/* renamed from: X.6ym  reason: invalid class name and case insensitive filesystem */
public class C148386ym implements C160507l7 {
    public int A00;
    public final C1265864p A01;
    public final long A02;

    public C1265864p BAg() {
        int i;
        boolean z = this instanceof C106275Ja;
        int i2 = this.A00;
        if (z) {
            i = 3;
        } else {
            i = 4;
        }
        if (i2 < i) {
            return this.A01;
        }
        return null;
    }

    public void BWu(boolean z, int i) {
        this.A00++;
    }

    public C148386ym(String str, long j) {
        this.A01 = new C1265864p(str, str, "", (String) null, (String) null, "fallback", 0, false);
        this.A02 = j;
    }

    public long B8k() {
        return this.A02;
    }

    public C148386ym(C1265864p r1, long j) {
        this.A02 = j;
        this.A01 = r1;
    }
}
