package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.group.GroupAdminPickerActivity;

/* renamed from: X.1yf  reason: invalid class name and case insensitive filesystem */
public class C42341yf extends AnonymousClass0D3 {
    public final ImageView A00;
    public final TextView A01;
    public final TextEmojiLabel A02;
    public final TextEmojiLabel A03;
    public final AnonymousClass3SF A04;
    public final /* synthetic */ GroupAdminPickerActivity A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C42341yf(View view, GroupAdminPickerActivity groupAdminPickerActivity) {
        super(view);
        this.A05 = groupAdminPickerActivity;
        AnonymousClass3SF A012 = AnonymousClass3SF.A01(view, groupAdminPickerActivity.A04, R.id.name);
        this.A04 = A012;
        TextEmojiLabel A0P = C36401kF.A0P(view, R.id.status);
        this.A03 = A0P;
        ImageView A0N = C36391kE.A0N(view, R.id.avatar);
        this.A00 = A0N;
        this.A01 = C36391kE.A0P(view, R.id.owner);
        this.A02 = C36401kF.A0P(view, R.id.secondary_name_view);
        C011504z.A06(A0N, 2);
        A012.A01.setTextColor(C36351kA.A02(view.getContext(), view.getContext(), R.attr.f4nameremoved, R.color.f6nameremoved));
        C36331k8.A0r(view.getContext(), A0P, R.color.f6nameremoved);
        view.setBackgroundResource(R.drawable.selector_orange_gradient);
        view.setOnClickListener(groupAdminPickerActivity.A0S);
    }
}
