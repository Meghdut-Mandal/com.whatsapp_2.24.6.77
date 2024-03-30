package X;

import android.view.View;
import java.util.List;

/* renamed from: X.6d9  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C135716d9 implements View.OnLongClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C95824mL A01;
    public final /* synthetic */ AnonymousClass56V A02;
    public final /* synthetic */ C135066c4 A03;

    public /* synthetic */ C135716d9(C95824mL r1, AnonymousClass56V r2, C135066c4 r3, int i) {
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = i;
        this.A03 = r3;
    }

    public final boolean onLongClick(View view) {
        C95824mL r5 = this.A01;
        AnonymousClass56V r3 = this.A02;
        int i = this.A00;
        C135066c4 r7 = this.A03;
        List list = AnonymousClass0D3.A0I;
        View view2 = view;
        AnonymousClass00C.A0B(view);
        if (!r5.A02) {
            return false;
        }
        C63563Kn r2 = r5.A05;
        if ((!r2.A00() || !r2.A04.A0E(4643)) && (!r2.A00() || !r2.A04.A0E(6222))) {
            return false;
        }
        r5.A01.Boy(new C80653vk(view2, r5, r3.A01, r7, i, 3));
        return true;
    }
}
