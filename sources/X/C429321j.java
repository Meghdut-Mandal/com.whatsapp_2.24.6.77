package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.21j  reason: invalid class name and case insensitive filesystem */
public class C429321j extends C429521l {
    public final /* synthetic */ AnonymousClass2IR A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C429321j(Context context, AnonymousClass2IR r2) {
        super(context);
        this.A00 = r2;
    }

    public void onClick(View view) {
        AnonymousClass2IR r3 = this.A00;
        AnonymousClass3T1 fMessage = r3.getFMessage();
        C89004Uw r1 = r3.A0c;
        if (r1 != null) {
            r1.BrT(fMessage, r1.BF0(fMessage) + 1);
            r3.A1Y();
        }
    }
}
