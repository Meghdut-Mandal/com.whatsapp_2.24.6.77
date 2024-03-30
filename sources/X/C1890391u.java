package X;

import java.util.Locale;
import java.util.Map;

/* renamed from: X.91u  reason: invalid class name and case insensitive filesystem */
public abstract class C1890391u extends Exception {
    public final int mErrorCode = 31000;
    public Map mExtras;

    public C1890391u(Throwable th) {
        super(th.getMessage(), th);
    }

    public final String getMessage() {
        if (super.getMessage() != null) {
            return super.getMessage();
        }
        Object[] A0L = AnonymousClass001.A0L();
        AnonymousClass000.A1L(A0L, this.mErrorCode, 0);
        return String.format((Locale) null, "[ErrorCode=%d]", A0L);
    }
}
