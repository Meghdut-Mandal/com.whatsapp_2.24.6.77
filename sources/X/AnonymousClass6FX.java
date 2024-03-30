package X;

/* renamed from: X.6FX  reason: invalid class name */
public abstract class AnonymousClass6FX {
    public final int A00;
    public final long A01;
    public final String A02;

    public float A01(int i) {
        if (this instanceof C94544iO) {
            return 2.0f;
        }
        if (this instanceof C94564iQ) {
            return ((C94564iQ) this).A00;
        }
        if (this instanceof C94554iP) {
            if (i == 0) {
                return 1.0f;
            }
            return 0.5f;
        } else if (i == 0) {
            return 100.0f;
        } else {
            return 128.0f;
        }
    }

    public float A02(int i) {
        float f;
        if (this instanceof C94544iO) {
            return -2.0f;
        }
        if (this instanceof C94564iQ) {
            return ((C94564iQ) this).A01;
        }
        if (this instanceof C94554iP) {
            f = -0.5f;
        } else {
            f = -128.0f;
        }
        if (i == 0) {
            return 0.0f;
        }
        return f;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass6FX r6 = (AnonymousClass6FX) obj;
            if (!(this.A00 == r6.A00 && AnonymousClass00C.A0J(this.A02, r6.A02) && this.A01 == r6.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C36321k7.A00(this.A01, C36421kH.A04(this.A02)) + this.A00;
    }

    public AnonymousClass6FX(String str, long j, int i) {
        this.A02 = str;
        this.A01 = j;
        this.A00 = i;
        if (str.length() == 0) {
            throw AnonymousClass001.A08("The name of a color space cannot be null and must contain at least 1 character");
        }
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(this.A02);
        A0u.append(" (id=");
        A0u.append(this.A00);
        A0u.append(", model=");
        return AnonymousClass000.A0m(AnonymousClass6J1.A00(this.A01), A0u);
    }
}
