package X;

import java.io.IOException;

/* renamed from: X.3mY  reason: invalid class name and case insensitive filesystem */
public final class C75023mY implements C160087kR {
    public final /* synthetic */ C158077fl A00;
    public final /* synthetic */ C158077fl A01;
    public final /* synthetic */ C602637d A02;
    public final /* synthetic */ Object A03;

    public void B2J(C123815x8 r7) {
        AnonymousClass00C.A0D(r7, 0);
        C62693Hd r0 = (C62693Hd) r7.A03.A00;
        if (r0 != null) {
            String str = r0.A00;
            if (str.length() != 0) {
                this.A02.A01.Bp3(new AnonymousClass737(this.A03, this.A01, C36371kC.A11(str), 28));
                return;
            }
        }
        AnonymousClass3TI.A00("ExchangeTokenForNativeAuthBlobAction/Empty Response from query");
        A00();
    }

    public C75023mY(C158077fl r1, C158077fl r2, C602637d r3, Object obj) {
        this.A02 = r3;
        this.A03 = obj;
        this.A01 = r1;
        this.A00 = r2;
    }

    private final void A00() {
        this.A02.A01.Bp3(new C1498172w(this.A03, this.A00, 34));
    }

    public void BVL(IOException iOException) {
        AnonymousClass3TI.A00(AnonymousClass000.A0l(iOException, "ExchangeTokenForNativeAuthBlobAction/Delivery Fail with exception: ", C36341k9.A0i(iOException)));
        A00();
    }

    public void BWk(Exception exc) {
        AnonymousClass3TI.A00(AnonymousClass000.A0l(exc, "ExchangeTokenForNativeAuthBlobAction/Error with exception: ", C36341k9.A0i(exc)));
        A00();
    }
}
