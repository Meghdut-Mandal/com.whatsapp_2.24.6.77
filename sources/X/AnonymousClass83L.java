package X;

import java.io.IOException;

/* renamed from: X.83L  reason: invalid class name */
public class AnonymousClass83L extends C187388xm {
    public final C202189lD dataSpec;
    public final int type;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Deprecated
    public AnonymousClass83L(C202189lD r3, IOException iOException, int i) {
        super(i == 1 ? 2001 : 2000, (Throwable) iOException);
        this.dataSpec = r3;
        this.type = i;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass83L(C202189lD r3, IOException iOException, String str, int i) {
        super(str, iOException, i == 2000 ? 2001 : i);
        this.dataSpec = r3;
        this.type = 1;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Deprecated
    public AnonymousClass83L(C202189lD r3, String str, int i) {
        super(str, i == 1 ? 2001 : 2000);
        this.dataSpec = r3;
        this.type = i;
    }
}
