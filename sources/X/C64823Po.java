package X;

/* renamed from: X.3Po  reason: invalid class name and case insensitive filesystem */
public final class C64823Po {
    public final float A00;
    public final float A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C64823Po) {
                C64823Po r5 = (C64823Po) obj;
                if (!(Float.compare(this.A00, r5.A00) == 0 && Float.compare(this.A01, r5.A01) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (Float.floatToIntBits(this.A00) * 31) + Float.floatToIntBits(this.A01);
    }

    public C64823Po(float f, float f2) {
        this.A00 = f;
        this.A01 = f2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("State(pushToVideoCameraEntryPointStartX=");
        A0u.append(this.A00);
        A0u.append(", pushToVideoCameraEntryPointStartY=");
        A0u.append(this.A01);
        return AnonymousClass000.A0t(A0u, ')');
    }

    public C64823Po() {
        this(0.0f, 0.0f);
    }
}
