package X;

import android.widget.FrameLayout;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.8Zs  reason: invalid class name and case insensitive filesystem */
public final class C175118Zs extends AnonymousClass3BX {
    public void A01(FrameLayout frameLayout, AnonymousClass2IR r11, AnonymousClass3T1 r12, C207219uk r13) {
        String str;
        C36321k7.A0v(frameLayout, 0, r13);
        frameLayout.removeAllViews();
        AnonymousClass8U9 r7 = new AnonymousClass8U9(C36371kC.A0B(frameLayout));
        frameLayout.addView(r7);
        C206659tl r6 = r13.A03;
        String str2 = null;
        if (r6 != null) {
            str2 = r6.A01;
        }
        String str3 = "";
        if (str2 == null) {
            str2 = str3;
        }
        int length = str2.length();
        boolean A1R = AnonymousClass000.A1R(length);
        TextEmojiLabel textEmojiLabel = r7.A01;
        if (A1R) {
            textEmojiLabel.setText(str2);
            textEmojiLabel.setVisibility(0);
        } else {
            textEmojiLabel.setVisibility(8);
        }
        if (!(r6 == null || (str = r6.A00) == null)) {
            str3 = str;
        }
        int length2 = str3.length();
        TextEmojiLabel textEmojiLabel2 = r7.A00;
        if (length2 > 0) {
            textEmojiLabel2.setText(str3);
            textEmojiLabel2.setVisibility(0);
        } else {
            textEmojiLabel2.setVisibility(8);
        }
        if (length == 0 && length2 == 0) {
            r7.setVisibility(8);
        } else {
            r7.setVisibility(0);
        }
    }
}
