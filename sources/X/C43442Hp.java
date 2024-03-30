package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.conversation.conversationrow.components.ViewOnceDownloadProgressView;

/* renamed from: X.2Hp  reason: invalid class name and case insensitive filesystem */
public class C43442Hp extends C43432Hm {
    public int A00 = 0;
    public ImageView A01;
    public final View.OnClickListener A02 = new C66953Xy(this, 46);
    public final Runnable A03 = C80233v4.A00(this, 22);

    public void A1d() {
        ViewOnceDownloadProgressView viewOnceDownloadProgressView = this.A03;
        AnonymousClass2bU fMessage = getFMessage();
        if (!viewOnceDownloadProgressView.isInEditMode()) {
            AnonymousClass3SU.A01(viewOnceDownloadProgressView.A01, fMessage, viewOnceDownloadProgressView.A04);
        }
    }

    public void A1f() {
        C18740tg.A0D(false, "ConversationRowViewOnceMedia/senders can not view their own media");
    }

    public Drawable getPopupDrawable() {
        return this.A1M.A05(getResources(), new AnonymousClass2M9(new int[]{129323}), -1);
    }

    public C43442Hp(Context context, C89004Uw r4, AnonymousClass2bU r5) {
        super(context, r4, r5);
        A2N();
    }

    public void A2N() {
        super.A2N();
        int BJ8 = ((AnonymousClass4TX) getFMessage()).BJ8();
        if (BJ8 != 0) {
            if (BJ8 == 1) {
                A2L();
                WaTextView waTextView = this.A02;
                waTextView.setText(R.string.f12nameremoved);
                C36331k8.A0q(getContext(), waTextView, getMediaTypeDescriptionString());
            } else if (BJ8 == 2) {
                C43432Hm.A0C(this.A03, getFMessage(), 2, true);
                A2O(this.A01, 2, true);
                A2M();
            } else {
                return;
            }
            View view = this.A01;
            view.setOnClickListener(this.A02);
            AnonymousClass2IR.A0W(view, this);
            return;
        }
        AnonymousClass2bU fMessage = getFMessage();
        int A002 = C66013Ui.A00(fMessage);
        C43432Hm.A0C(this.A03, fMessage, A002, true);
        View view2 = this.A01;
        A2O(view2, A002, true);
        if (A002 == 2) {
            view2.setOnClickListener(this.A02);
            AnonymousClass2IR.A0W(view2, this);
        }
        A2M();
    }
}
