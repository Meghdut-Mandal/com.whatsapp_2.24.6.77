package X;

import com.whatsapp.util.Log;

/* renamed from: X.3G4  reason: invalid class name */
public class AnonymousClass3G4 {
    public final int A00;
    public final long A01;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AnonymousClass3G4 r7 = (AnonymousClass3G4) obj;
            return this.A00 == r7.A00 && this.A01 == r7.A01;
        }
        return false;
    }

    public int hashCode() {
        return C36341k9.A02(this.A01, this.A00 * 31);
    }

    public AnonymousClass3G4(int i, long j) {
        this.A00 = i;
        if (i != 0 || j == 0) {
            this.A01 = j;
        } else {
            Log.e("GrowthLock Nonzero expiration for unlocked GrowthLock");
        }
    }
}
