package X;

import android.os.Bundle;

@Deprecated
/* renamed from: X.0dj  reason: invalid class name and case insensitive filesystem */
public class C10120dj implements C17370rB {
    public static final C10120dj A02 = new C10120dj(new AnonymousClass0WS());
    public final String A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C10120dj) {
                C10120dj r5 = (C10120dj) obj;
                if (this.A01 != r5.A01 || !AnonymousClass0QM.A00(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[3];
        objArr[0] = null;
        objArr[1] = Boolean.valueOf(this.A01);
        return AnonymousClass000.A0M(this.A00, objArr, 2);
    }

    public C10120dj(AnonymousClass0WS r2) {
        this.A01 = r2.A01.booleanValue();
        this.A00 = r2.A00;
    }

    public final Bundle A00() {
        Bundle A07 = AnonymousClass001.A07();
        A07.putString("consumer_package", (String) null);
        A07.putBoolean("force_save_dialog", this.A01);
        A07.putString("log_session_id", this.A00);
        return A07;
    }
}
