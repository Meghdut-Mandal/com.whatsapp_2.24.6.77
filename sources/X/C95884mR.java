package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.4mR  reason: invalid class name and case insensitive filesystem */
public class C95884mR extends C02920Ck {
    public C19460v5 A00;
    public C115715jK A01;
    public C115725jL A02;

    public C95884mR(C19460v5 r2, C115715jK r3, C115725jL r4) {
        this(C162467od.A00(6), r2, r3, r4);
    }

    public static C38901qQ A00(View view) {
        List list = AnonymousClass0D3.A0I;
        Context context = view.getContext();
        AnonymousClass00C.A0D(context, 0);
        C38901qQ r3 = new C38901qQ(context);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        r3.setPadding(dimensionPixelSize, context.getResources().getDimensionPixelSize(R.dimen.f7nameremoved), dimensionPixelSize, dimensionPixelSize);
        C011004s.A05(r3, AnonymousClass1RH.A00(context));
        return r3;
    }

    public /* bridge */ /* synthetic */ void A0K(AnonymousClass0D3 r1) {
        ((C42611z6) r1).A0B();
    }

    /* renamed from: A0N */
    public C46482Xv BUw(ViewGroup viewGroup, int i) {
        C19460v5 r1 = this.A00;
        if (r1.A05()) {
            r1.A02();
            throw AnonymousClass001.A0A("onCreateViewHolder");
        } else if (i == 55) {
            List list = AnonymousClass0D3.A0I;
            return new C105295Ec(C36371kC.A0J(C36341k9.A0J(viewGroup, 0), viewGroup, R.layout.f9nameremoved, false));
        } else if (i == 58) {
            return new AnonymousClass2Xq(C36361kB.A0E(C36331k8.A09(viewGroup), viewGroup, R.layout.f9nameremoved), viewGroup);
        } else {
            if (i == 65) {
                List list2 = AnonymousClass0D3.A0I;
                return new C105375Ek(C36371kC.A0J(C36341k9.A0J(viewGroup, 0), viewGroup, R.layout.f9nameremoved, false));
            } else if (i == 70) {
                C115725jL r3 = this.A02;
                List list3 = AnonymousClass0D3.A0I;
                View A0J = C36371kC.A0J(C36341k9.A0J(viewGroup, 0), viewGroup, R.layout.f9nameremoved, false);
                C18800tq r32 = r3.A00.A01;
                return new AnonymousClass5FJ(A0J, C36341k9.A0T(r32), C36341k9.A0V(r32), (C117555mS) r32.A00.A26.get());
            } else if (i == 72) {
                C115715jK r12 = this.A01;
                List list4 = AnonymousClass0D3.A0I;
                return new AnonymousClass5FN(viewGroup, C27111My.A2e(r12.A00.A00));
            } else {
                throw C90464aC.A0R("DirectoryListAdapter/onCreateViewHolder type not handled: ", AnonymousClass000.A0u(), i);
            }
        }
    }

    public /* bridge */ /* synthetic */ void BSE(AnonymousClass0D3 r2, int i) {
        C42611z6 r22 = (C42611z6) r2;
        r22.A0B();
        r22.A0C(A0L(i));
    }

    public int getItemViewType(int i) {
        C19460v5 r1 = this.A00;
        if (!r1.A05()) {
            return ((AnonymousClass5EQ) A0L(i)).A00;
        }
        A0L(i);
        r1.A02();
        throw AnonymousClass001.A0A("getItemViewType");
    }

    public C95884mR(C02890Ch r1, C19460v5 r2, C115715jK r3, C115725jL r4) {
        super(r1);
        this.A01 = r3;
        this.A02 = r4;
        this.A00 = r2;
    }
}
