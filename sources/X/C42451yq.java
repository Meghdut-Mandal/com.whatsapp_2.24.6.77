package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaTextView;

/* renamed from: X.1yq  reason: invalid class name and case insensitive filesystem */
public final class C42451yq extends AnonymousClass0D3 {
    public final ViewGroup A00;
    public final ImageView A01;
    public final AnonymousClass1WR A02;
    public final C19730wQ A03;
    public final TextEmojiLabel A04;
    public final TextEmojiLabel A05;
    public final AnonymousClass3SF A06;
    public final WaTextView A07;
    public final AnonymousClass1Pp A08;
    public final AnonymousClass171 A09;
    public final AnonymousClass1RY A0A;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C42451yq(View view, AnonymousClass1WR r4, C19730wQ r5, AnonymousClass1LI r6, AnonymousClass1Pp r7, AnonymousClass171 r8, AnonymousClass1RY r9) {
        super(view);
        AnonymousClass00C.A0D(view, 1);
        this.A02 = r4;
        this.A03 = r5;
        this.A08 = r7;
        this.A09 = r8;
        this.A0A = r9;
        this.A00 = (ViewGroup) C36361kB.A0G(view, R.id.group_chat_info_row_container);
        this.A01 = C36341k9.A0L(view, R.id.avatar);
        this.A07 = C36341k9.A0Q(view, R.id.owner);
        this.A05 = C36351kA.A0O(view, R.id.status);
        this.A04 = C36351kA.A0O(view, R.id.secondary_name_view);
        C012005e.A02(view, R.id.group_chat_info_layout).setBackground((Drawable) null);
        this.A06 = r6.B3q(view.getContext(), C36351kA.A0O(view, R.id.name));
    }
}
