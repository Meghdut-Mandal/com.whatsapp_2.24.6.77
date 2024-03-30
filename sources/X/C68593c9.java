package X;

import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import java.util.Set;

/* renamed from: X.3c9  reason: invalid class name and case insensitive filesystem */
public class C68593c9 implements C87414Os {
    public final /* synthetic */ C47592fB A00;

    public void BZg(MotionEvent motionEvent, View view, String str) {
        String str2 = str;
        boolean contains = C55812vE.A00(str).contains("…");
        C47592fB r5 = this.A00;
        r5.A0G();
        AnonymousClass3T1 r2 = ((C47582fA) r5).A05;
        View view2 = r5.A00;
        C18740tg.A04(view2);
        Context context = view2.getContext();
        String str3 = r2.A1J.A01;
        C24791Du r4 = r5.A0S;
        Set BFr = r5.A0X.BFr(r2.A0J(), r2, str);
        boolean z = true;
        if (r5.A0Y.A0C(Uri.parse(str)) == 1) {
            z = false;
        }
        AnonymousClass3MP.A00(context, r4, r5, str2, str3, BFr, contains, z);
    }

    public C68593c9(C47592fB r1) {
        this.A00 = r1;
    }
}
