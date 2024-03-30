package X;

import android.content.Context;
import android.view.View;
import java.util.Set;

/* renamed from: X.22u  reason: invalid class name */
public class AnonymousClass22u extends C429721s {
    public final AnonymousClass3T1 A00;
    public final Set A01;

    public AnonymousClass22u(Context context, C24791Du r8, AnonymousClass17Y r9, C21060yb r10, AnonymousClass3T1 r11, String str, Set set) {
        super(context, r8, r9, r10, str);
        this.A01 = set;
        this.A00 = r11;
    }

    public void onClick(View view) {
        Set set = this.A01;
        if (set != null) {
            ((C225314u) C36361kB.A06(view)).Btm(C53152qr.A00(this.A0A, this.A00.A1J.A01, set));
            return;
        }
        super.onClick(view);
    }
}
