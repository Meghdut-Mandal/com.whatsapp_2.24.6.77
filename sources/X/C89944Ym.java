package X;

import android.widget.PopupWindow;
import com.whatsapp.reactions.ReactionsTrayViewModel;
import com.whatsapp.textstatuscomposer.TextStatusComposerActivity;

/* renamed from: X.4Ym  reason: invalid class name and case insensitive filesystem */
public class C89944Ym implements PopupWindow.OnDismissListener {
    public Object A00;
    public final int A01;

    public C89944Ym(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void onDismiss() {
        C39821ts r1;
        ReactionsTrayViewModel reactionsTrayViewModel;
        switch (this.A01) {
            case 0:
                AnonymousClass3FA r2 = (AnonymousClass3FA) this.A00;
                AnonymousClass36N r0 = (AnonymousClass36N) r2.A09.getValue();
                r0.A01.removeView(C36401kF.A0F(r0.A02));
                AnonymousClass317 r02 = r2.A01;
                if (r02 != null && (r1 = r02.A00.A03) != null) {
                    r1.A0W(false);
                    return;
                }
                return;
            case 1:
                C70523fI r22 = (C70523fI) this.A00;
                AnonymousClass22t BBT = r22.A0M.BBT((Integer) null);
                if (r22.A0M.BMu() && BBT != null && !BBT.A02 && (reactionsTrayViewModel = r22.A0u) != null) {
                    reactionsTrayViewModel.A0S(0);
                    return;
                }
                return;
            case 4:
                TextStatusComposerActivity.A0j((TextStatusComposerActivity) this.A00);
                return;
            default:
                ((AnonymousClass3LJ) this.A00).A0E();
                return;
        }
    }
}
