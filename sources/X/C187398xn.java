package X;

import java.io.IOException;

/* renamed from: X.8xn  reason: invalid class name and case insensitive filesystem */
public class C187398xn extends IOException {
    public boolean contentIsMalformed;
    public int dataType;

    public static C187398xn A00(String str) {
        return new C187398xn(str);
    }

    @Deprecated
    public C187398xn(String str, Throwable th) {
        super(str, th);
    }

    public C187398xn(String str, Throwable th, boolean z) {
        super(str, th);
        this.contentIsMalformed = z;
        this.dataType = 1;
    }

    @Deprecated
    public C187398xn(String str) {
        super(str);
    }

    @Deprecated
    public C187398xn(Throwable th) {
        super(th);
    }

    @Deprecated
    public C187398xn() {
    }
}
