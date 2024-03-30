package X;

import java.io.IOException;

/* renamed from: X.186  reason: invalid class name */
public class AnonymousClass186 extends IOException {
    public static final long serialVersionUID = -1616151763072450476L;
    public B63 unfinishedMessage = null;
    public boolean wasThrownFromInputStream;

    public AnonymousClass186(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    public AnonymousClass186(String str) {
        super(str);
    }
}
