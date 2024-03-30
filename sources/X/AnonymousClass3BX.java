package X;

import android.text.TextUtils;
import android.widget.FrameLayout;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.3BX  reason: invalid class name */
public abstract class AnonymousClass3BX {
    public void A01(FrameLayout frameLayout, AnonymousClass2IR r5, AnonymousClass3T1 r6, C207219uk r7) {
        TextEmojiLabel textEmojiLabel;
        int i;
        frameLayout.removeAllViews();
        AnonymousClass284 r1 = new AnonymousClass284(frameLayout.getContext());
        frameLayout.addView(r1);
        C206659tl r0 = r7.A03;
        if (r0 != null) {
            String str = r0.A01;
            if (!TextUtils.isEmpty(str)) {
                C18740tg.A06(str);
                textEmojiLabel = r1.A02;
                r5.setMessageText(str, textEmojiLabel, r6);
                i = 0;
                textEmojiLabel.setVisibility(i);
            }
        }
        textEmojiLabel = r1.A02;
        i = 8;
        textEmojiLabel.setVisibility(i);
    }
}
