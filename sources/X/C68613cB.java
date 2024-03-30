package X;

import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.Set;

/* renamed from: X.3cB  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C68613cB implements C87444Ov {
    public final /* synthetic */ C70523fI A00;

    public /* synthetic */ C68613cB(C70523fI r1) {
        this.A00 = r1;
    }

    public final void BVH(Set set) {
        TextView textView;
        C70523fI r2 = this.A00;
        AnonymousClass11F A05 = C66013Ui.A05(set);
        int size = set.size();
        Object[] A0L = AnonymousClass001.A0L();
        AnonymousClass000.A1J(A0L, size);
        String A0L2 = r2.A0M.getWhatsAppLocale().A0L(A0L, R.plurals.f10nameremoved, (long) size);
        String string = r2.A0M.getString(R.string.f12nameremoved);
        C67113Yo r4 = new C67113Yo((Object) r2, (Object) A05, (Object) set, 41);
        C88994Uv r3 = r2.A0M;
        if (((AnonymousClass01N) r3.getLifecycle()).A02 != AnonymousClass01P.DESTROYED) {
            C99304t3 A01 = C99304t3.A01(r3.findViewById(16908298), A0L2, 4000);
            A01.A0Z(string, r4);
            A01.A0X(C36351kA.A02(C70523fI.A00(r2), C70523fI.A00(r2), R.attr.f4nameremoved, R.color.f6nameremoved));
            ArrayList A0I = AnonymousClass001.A0I();
            A0I.add(r2.A0M.findViewById(R.id.next_important_message));
            A0I.add(r2.A0M.findViewById(R.id.scroll_bottom));
            C21060yb systemServices = r2.A0M.getSystemServices();
            AnonymousClass155 A002 = C70523fI.A00(r2);
            C36331k8.A1G(systemServices, 3, A002);
            AnonymousClass3ZU r42 = new AnonymousClass3ZU(A002, A01, systemServices, A0I, false);
            r2.A0v = r42;
            r42.A05(C80233v4.A00(r2, 23));
            AnonymousClass0Eq r1 = r2.A0v.A01.A0J;
            AnonymousClass00C.A08(r1);
            View findViewById = r1.findViewById(R.id.snackbar_text);
            if ((findViewById instanceof TextView) && (textView = (TextView) findViewById) != null) {
                textView.setMaxLines(3);
            }
            r2.A0v.A02();
        }
    }
}
