package X;

import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.util.List;
import java.util.Map;

/* renamed from: X.7zT  reason: invalid class name and case insensitive filesystem */
public class C167957zT extends C02920Ck {
    public Map A00 = AnonymousClass001.A0J();

    public C167957zT() {
        super(new C02880Cg(new C23136B6u(0)).A00());
    }

    public static AnonymousClass80C A00(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return new C175518ac(C36361kB.A0E(C36331k8.A09(viewGroup), viewGroup, R.layout.f9nameremoved));
        }
        if (i == 2) {
            return new C175528ad(C36361kB.A0E(C36331k8.A09(viewGroup), viewGroup, R.layout.f9nameremoved));
        }
        if (i == 3) {
            return new AnonymousClass80C(C36361kB.A0E(C36331k8.A09(viewGroup), viewGroup, R.layout.f9nameremoved));
        }
        String A0r = AnonymousClass000.A0r("ItemAdapter/onCreateViewHolder type not handled - ", AnonymousClass000.A0u(), i);
        Log.e(A0r);
        throw AnonymousClass001.A09(A0r);
    }

    public /* bridge */ /* synthetic */ void BSE(AnonymousClass0D3 r2, int i) {
        List list = AnonymousClass0D3.A0I;
        ((AnonymousClass80C) r2).A0B((AnonymousClass9TY) A0L(i));
    }

    public /* bridge */ /* synthetic */ AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        return A00(viewGroup, i);
    }

    public int getItemViewType(int i) {
        return ((AnonymousClass9TY) A0L(i)).A00;
    }
}
