package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.whatsapp.R;
import com.whatsapp.info.views.ChatInfoMediaCardV2;

/* renamed from: X.1oB  reason: invalid class name and case insensitive filesystem */
public final class C38291oB extends FrameLayout implements C18700tb {
    public AnonymousClass4PV A00;
    public AnonymousClass3HB A01;
    public AnonymousClass4OA A02;
    public AnonymousClass2EH A03;
    public AnonymousClass1QZ A04;
    public boolean A05;
    public final C225314u A06;
    public final ChatInfoMediaCardV2 A07;
    public final FrameLayout A08;

    public final void setGroupChatInfoViewModelFactory$app_product_community_community_non_modified(AnonymousClass4OA r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A02 = r2;
    }

    public final void setMediaCardUpdateHelperFactory$app_product_community_community_non_modified(AnonymousClass4PV r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A00 = r2;
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A04;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A04 = r0;
        }
        return r0.generatedComponent();
    }

    public final AnonymousClass4OA getGroupChatInfoViewModelFactory$app_product_community_community_non_modified() {
        AnonymousClass4OA r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("groupChatInfoViewModelFactory");
    }

    public final AnonymousClass4PV getMediaCardUpdateHelperFactory$app_product_community_community_non_modified() {
        AnonymousClass4PV r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("mediaCardUpdateHelperFactory");
    }

    public C38291oB(Context context) {
        super(context);
        if (!this.A05) {
            this.A05 = true;
            C27111My r1 = ((C27861Qc) ((C27851Qb) generatedComponent())).A0L;
            this.A00 = (AnonymousClass4PV) r1.A2N.get();
            this.A02 = (AnonymousClass4OA) r1.A2n.get();
        }
        this.A06 = C36381kD.A0S(context);
        View inflate = View.inflate(context, R.layout.f9nameremoved, this);
        AnonymousClass00C.A0E(inflate, "null cannot be cast to non-null type android.widget.FrameLayout");
        FrameLayout frameLayout = (FrameLayout) inflate;
        this.A08 = frameLayout;
        this.A07 = (ChatInfoMediaCardV2) C36361kB.A0G(frameLayout, R.id.media_card_view);
        C36371kC.A1D(this);
        ChatInfoMediaCardV2 chatInfoMediaCardV2 = this.A07;
        chatInfoMediaCardV2.setTitleTextColor(AnonymousClass00F.A00(getContext(), R.color.f6nameremoved));
        chatInfoMediaCardV2.setSeeMoreColor(C36381kD.A05(this, R.color.f6nameremoved));
    }

    public final C225314u getActivity() {
        return this.A06;
    }
}
