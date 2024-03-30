package X;

/* renamed from: X.65r  reason: invalid class name and case insensitive filesystem */
public class C1268065r {
    public final boolean A00;

    public boolean equals(Object obj) {
        if (this != obj) {
            return obj != null && getClass() == obj.getClass() && this.A00 == ((C1268065r) obj).A00;
        }
        return true;
    }

    public C1268065r(boolean z) {
        this.A00 = z;
    }

    public int hashCode() {
        return AnonymousClass000.A0K(Boolean.valueOf(this.A00), AnonymousClass001.A0L());
    }
}
