package X;

import android.widget.FrameLayout;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.8Zt  reason: invalid class name and case insensitive filesystem */
public final class C175128Zt extends AnonymousClass3BX {
    public AnonymousClass8UA A00;
    public final C203209nX A01 = new C203209nX(this, 1);
    public final AnonymousClass1SV A02;

    public C175128Zt(AnonymousClass1SV r3) {
        AnonymousClass00C.A0D(r3, 1);
        this.A02 = r3;
    }

    public void A01(FrameLayout frameLayout, AnonymousClass2IR r10, AnonymousClass3T1 r11, C207219uk r12) {
        String str;
        C36321k7.A16(r11, r12, r10, 1);
        frameLayout.removeAllViews();
        String str2 = null;
        AnonymousClass8UA r3 = new AnonymousClass8UA(C36371kC.A0B(frameLayout));
        frameLayout.addView(r3);
        C206659tl r6 = r12.A03;
        if (r6 != null) {
            str = r6.A01;
        } else {
            str = null;
        }
        TextEmojiLabel textEmojiLabel = r3.A01;
        if (str == null || str.length() == 0) {
            textEmojiLabel.setVisibility(8);
        } else {
            textEmojiLabel.setVisibility(0);
            C175108Zr.A0t(textEmojiLabel, r10, str);
        }
        if (r6 != null) {
            str2 = r6.A00;
        }
        TextEmojiLabel textEmojiLabel2 = r3.A00;
        if (str2 == null || str2.length() == 0) {
            textEmojiLabel2.setVisibility(8);
        } else {
            textEmojiLabel2.setVisibility(0);
            C175108Zr.A0t(textEmojiLabel2, r10, str2);
        }
        C63683Kz A0V = r11.A0V();
        if (A0V == null || !A0V.A01()) {
            r3.A02.setVisibility(8);
        } else {
            this.A02.A0C(r3.A02, r11, this.A01);
        }
        this.A00 = r3;
        frameLayout.invalidate();
    }
}
