package X;

import android.content.Context;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.bridge.wfal.WfalManager;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.1r8  reason: invalid class name and case insensitive filesystem */
public final class C39071r8 extends C07200Ws {
    public final Context A00;
    public final WfalManager A01;
    public final AnonymousClass3T1 A02;
    public final C32341dO A03;
    public final C32421dW A04;
    public final C35011i0 A05;
    public final C28781Ua A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C39071r8(Context context, View view, C19460v5 r17, WfalManager wfalManager, AnonymousClass3T1 r19, AnonymousClass37S r20, C32341dO r21, C29731Xt r22, C32421dW r23, C35011i0 r24, C28781Ua r25, boolean z) {
        super(context, view, 0, R.attr.f4nameremoved, 0);
        AnonymousClass00C.A0D(context, 1);
        AnonymousClass3T1 r6 = r19;
        C28781Ua r1 = r25;
        C36321k7.A17(r6, r1, r17, 3);
        C32341dO r5 = r21;
        C32421dW r4 = r23;
        C35011i0 r2 = r24;
        WfalManager wfalManager2 = wfalManager;
        C36321k7.A1C(wfalManager2, r5, r22, r2, r4);
        AnonymousClass37S r3 = r20;
        AnonymousClass00C.A0D(r3, 12);
        this.A00 = context;
        this.A02 = r6;
        this.A06 = r1;
        this.A01 = wfalManager2;
        this.A03 = r5;
        this.A05 = r2;
        this.A04 = r4;
        C016307a r42 = this.A03;
        ArrayList A13 = C36411kG.A13(r42);
        C36341k9.A1H(Integer.valueOf(R.id.menuitem_forward), context.getString(R.string.f12nameremoved), A13);
        C36341k9.A1H(Integer.valueOf(R.id.menuitem_share_status_third_party), context.getString(R.string.f12nameremoved), A13);
        if (!this.A06.A00() ? !(!this.A03.A02() || (this.A02 instanceof C46812bi)) : this.A05.A07(4, C36371kC.A11(this.A02))) {
            C36341k9.A1H(Integer.valueOf(R.id.menuitem_share_status_facebook), this.A00.getString(R.string.f12nameremoved), A13);
        }
        C19460v5 r12 = r3.A00;
        if (r12.A05()) {
            r12.A02();
            throw AnonymousClass001.A0A("isEntryPointVisibilityDisabled");
        }
        if (!z) {
            C36341k9.A1H(Integer.valueOf(R.id.menuitem_delete), context.getString(R.string.f12nameremoved), A13);
        }
        Iterator it = A13.iterator();
        while (it.hasNext()) {
            AnonymousClass00I r26 = (AnonymousClass00I) it.next();
            Object obj = r26.A00;
            AnonymousClass00C.A07(obj);
            r42.add(0, AnonymousClass000.A0I(obj), 0, (CharSequence) r26.A01);
        }
    }
}
