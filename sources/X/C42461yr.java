package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageButton;
import com.whatsapp.components.button.ThumbnailButton;

/* renamed from: X.1yr  reason: invalid class name and case insensitive filesystem */
public final class C42461yr extends AnonymousClass0D3 {
    public final C19730wQ A00;
    public final TextEmojiLabel A01;
    public final AnonymousClass3SF A02;
    public final WaImageButton A03;
    public final ThumbnailButton A04;
    public final AnonymousClass1Pp A05;
    public final AnonymousClass16D A06;
    public final AnonymousClass171 A07;
    public final C220412q A08;
    public final AnonymousClass17X A09;
    public final C20810yC A0A;

    public C42461yr(View view, C19730wQ r4, AnonymousClass1LI r5, AnonymousClass1Pp r6, AnonymousClass16D r7, AnonymousClass171 r8, C220412q r9, AnonymousClass17X r10, C20810yC r11) {
        super(view);
        this.A0A = r11;
        this.A00 = r4;
        this.A08 = r9;
        this.A04 = (ThumbnailButton) C36361kB.A0G(view, R.id.added_subgroup_row_group_icon);
        this.A07 = r8;
        AnonymousClass3SF A012 = AnonymousClass3SF.A01(view, r5, R.id.added_subgroup_row_group_name);
        this.A02 = A012;
        this.A05 = r6;
        this.A06 = r7;
        this.A09 = r10;
        TextEmojiLabel textEmojiLabel = A012.A01;
        C011504z.A06(textEmojiLabel, 2);
        C33511fU.A03(textEmojiLabel);
        this.A01 = C36351kA.A0O(view, R.id.added_subgroup_row_group_status);
        this.A03 = (WaImageButton) C36361kB.A0G(view, R.id.added_subgroup_row_remove_button);
    }
}
