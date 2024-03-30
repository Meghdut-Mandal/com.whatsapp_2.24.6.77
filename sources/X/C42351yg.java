package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.group.GroupChangedParticipantsBottomSheet;

/* renamed from: X.1yg  reason: invalid class name and case insensitive filesystem */
public final class C42351yg extends AnonymousClass0D3 {
    public final ImageView A00;
    public final TextView A01;
    public final TextEmojiLabel A02;
    public final AnonymousClass3SF A03;
    public final TextEmojiLabel A04;
    public final /* synthetic */ GroupChangedParticipantsBottomSheet A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C42351yg(View view, GroupChangedParticipantsBottomSheet groupChangedParticipantsBottomSheet) {
        super(view);
        this.A05 = groupChangedParticipantsBottomSheet;
        AnonymousClass1LI r1 = groupChangedParticipantsBottomSheet.A04;
        if (r1 != null) {
            AnonymousClass3SF A012 = AnonymousClass3SF.A01(view, r1, R.id.name);
            this.A03 = A012;
            TextEmojiLabel A0O = C36351kA.A0O(view, R.id.status);
            this.A04 = A0O;
            A0O.setVisibility(8);
            ImageView A0L = C36341k9.A0L(view, R.id.avatar);
            this.A00 = A0L;
            this.A01 = C36341k9.A0M(view, R.id.owner);
            this.A02 = C36351kA.A0O(view, R.id.secondary_name_view);
            C011504z.A06(A0L, 2);
            A012.A01.setTextColor(C36351kA.A02(view.getContext(), view.getContext(), R.attr.f4nameremoved, R.color.f6nameremoved));
            view.setBackgroundResource(R.drawable.selector_orange_gradient);
            return;
        }
        throw C36331k8.A0d("textEmojiLabelViewControllerFactory");
    }
}
