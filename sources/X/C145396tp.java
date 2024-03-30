package X;

import java.util.Collection;
import java.util.List;

/* renamed from: X.6tp  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C145396tp implements C158247gc {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C26461Kg A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ C009003v A03;

    public /* synthetic */ C145396tp(C26461Kg r1, String str, C009003v r3, int i) {
        this.A01 = r1;
        this.A02 = str;
        this.A00 = i;
        this.A03 = r3;
    }

    public final void BPu(C121585tN r10, Short sh, String str, boolean z) {
        C26461Kg r8 = this.A01;
        String str2 = this.A02;
        int i = this.A00;
        C009003v r3 = this.A03;
        if (z) {
            C90504aG.A1D(r8.A02, str2.hashCode());
        } else {
            r8.A02.A08(Integer.valueOf(str2.hashCode()), "metadata_network_end");
            r8.A03.A0D(Integer.valueOf(i), sh);
        }
        if (r10 != null) {
            List<C128716Di> list = r10.A02;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (C128716Di r0 : list) {
                    if (AnonymousClass00C.A0J(r0.A03, str2)) {
                        r3.invoke(true, (Object) null);
                        return;
                    }
                }
            }
            str = "extensions-integrity-check-failed";
        }
        r3.invoke(false, str);
    }
}
