package X;

import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.bonsai.discovery.BonsaiDiscoveryFragment;
import java.util.List;

/* renamed from: X.1vT  reason: invalid class name and case insensitive filesystem */
public final class C40391vT extends C02920Ck {
    public final /* synthetic */ BonsaiDiscoveryFragment A00;

    public /* bridge */ /* synthetic */ AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        AnonymousClass00C.A0D(viewGroup, 0);
        if (i == 0) {
            List list = AnonymousClass0D3.A0I;
            return new AnonymousClass2D7(C36371kC.A0J(C36351kA.A0C(viewGroup), viewGroup, R.layout.f9nameremoved, false), this.A00);
        } else if (i == 1) {
            List list2 = AnonymousClass0D3.A0I;
            return new AnonymousClass2D6(C36371kC.A0J(C36351kA.A0C(viewGroup), viewGroup, R.layout.f9nameremoved, false), this.A00);
        } else {
            throw new AssertionError(AnonymousClass000.A0r("Unknown view type ", AnonymousClass000.A0u(), i));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C40391vT(BonsaiDiscoveryFragment bonsaiDiscoveryFragment) {
        super((C02830Cb) C40321vJ.A00);
        this.A00 = bonsaiDiscoveryFragment;
    }

    public /* bridge */ /* synthetic */ void BSE(AnonymousClass0D3 r7, int i) {
        C42311yc r72 = (C42311yc) r7;
        AnonymousClass00C.A0D(r72, 0);
        C16200om r5 = (C16200om) A0L(i);
        if (r72 instanceof AnonymousClass2D7) {
            AnonymousClass2D7 r73 = (AnonymousClass2D7) r72;
            AnonymousClass00C.A0E(r5, "null cannot be cast to non-null type com.whatsapp.bonsai.discovery.LoadedDiscoveryBots.Section.SmallBot");
            C69563dj r52 = (C69563dj) r5;
            AnonymousClass00C.A0D(r52, 0);
            r73.A00 = r52;
            AnonymousClass1RY r4 = r73.A01.A03;
            if (r4 != null) {
                r4.A06(r73.A03, C70153eg.A00, r52.A01, true);
                TextView textView = r73.A02;
                AnonymousClass6E1 r1 = r52.A00;
                textView.setText(r1.A07);
                String str = r1.A02;
                TextView textView2 = r73.A00;
                int length = str.length();
                int i2 = 8;
                if (length > 0) {
                    i2 = 0;
                }
                textView2.setVisibility(i2);
                if (length > 0) {
                    textView2.setText(str);
                    return;
                }
                return;
            }
            throw C36331k8.A0d("contactPhotosLoader");
        } else if (r72 instanceof AnonymousClass2D6) {
            AnonymousClass2D6 r74 = (AnonymousClass2D6) r72;
            AnonymousClass00C.A0E(r5, "null cannot be cast to non-null type com.whatsapp.bonsai.discovery.LoadedDiscoveryBots.Section.SmallBotShimmer");
            AnonymousClass00C.A0D(r5, 0);
            r74.A00 = r5;
            r74.A02.setText("████");
            r74.A00.setText("███████████");
        }
    }

    public int getItemViewType(int i) {
        Object A0L = A0L(i);
        if ((A0L instanceof C69563dj) || !(A0L instanceof C69553di)) {
            return 0;
        }
        return 1;
    }
}
