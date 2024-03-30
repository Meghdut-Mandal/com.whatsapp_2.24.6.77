package X;

import org.json.JSONObject;

/* renamed from: X.4rV  reason: invalid class name and case insensitive filesystem */
public final class C98484rV extends C125255za implements C157927eu {
    public final long A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C98484rV r8 = (C98484rV) obj;
            return this.A00 == r8.A00 && this.A01 == r8.A01;
        }
        return false;
    }

    public int hashCode() {
        return C90464aC.A08(this.A00) + (this.A01 ? 1 : 0);
    }

    public C98484rV(long j, boolean z) {
        this.A00 = j;
        this.A01 = z;
    }

    public JSONObject Bvk() {
        JSONObject A1B = C36441kJ.A1B();
        A1B.put("stale_age_s", this.A00);
        A1B.put("is_itemized", this.A01);
        return A1B;
    }
}
