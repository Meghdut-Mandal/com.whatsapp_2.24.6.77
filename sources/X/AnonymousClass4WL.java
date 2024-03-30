package X;

import android.text.Editable;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.emoji.search.EmojiSearchContainer;
import com.whatsapp.emoji.search.EmojiSearchKeyboardContainer;
import com.whatsapp.mediacomposer.doodle.textentry.DoodleEditText;
import com.whatsapp.mediacomposer.doodle.textentry.TextEntryView;

/* renamed from: X.4WL  reason: invalid class name */
public class AnonymousClass4WL extends C66803Xj {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03 = 0;

    public AnonymousClass4WL(DoodleEditText doodleEditText, C75643nZ r3, TextEntryView textEntryView) {
        this.A01 = doodleEditText;
        this.A02 = textEntryView;
        this.A00 = r3;
    }

    public void afterTextChanged(Editable editable) {
        if (2 - this.A03 != 0) {
            super.afterTextChanged(editable);
            return;
        }
        AnonymousClass00C.A0D(editable, 0);
        TextView textView = (TextView) this.A01;
        AnonymousClass3UG.A07(textView.getContext(), textView.getPaint(), editable, ((TextEntryView) this.A02).getEmojiLoader(), 1.3f);
        int width = textView.getWidth();
        AnonymousClass00C.A08(textView.getPaint());
        ((C75643nZ) this.A00).A00(editable, width);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006c, code lost:
        if (r5.length() == 0) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006e, code lost:
        r1 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0035, code lost:
        if (android.text.TextUtils.isEmpty(r5) != false) goto L_0x006e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onTextChanged(java.lang.CharSequence r5, int r6, int r7, int r8) {
        /*
            r4 = this;
            int r0 = r4.A03
            switch(r0) {
                case 0: goto L_0x0009;
                case 1: goto L_0x0038;
                default: goto L_0x0005;
            }
        L_0x0005:
            super.onTextChanged(r5, r6, r7, r8)
            return
        L_0x0009:
            java.lang.Object r1 = r4.A00
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            if (r1 == 0) goto L_0x0018
            java.lang.Object r0 = r4.A01
            com.whatsapp.emoji.search.EmojiSearchContainer r0 = (com.whatsapp.emoji.search.EmojiSearchContainer) r0
            com.whatsapp.InterceptingEditText r0 = r0.A04
            r0.removeCallbacks(r1)
        L_0x0018:
            r0 = 34
            X.3wc r3 = new X.3wc
            r3.<init>(r4, r5, r0)
            r4.A00 = r3
            java.lang.Object r0 = r4.A01
            com.whatsapp.emoji.search.EmojiSearchContainer r0 = (com.whatsapp.emoji.search.EmojiSearchContainer) r0
            com.whatsapp.InterceptingEditText r2 = r0.A04
            r0 = 500(0x1f4, double:2.47E-321)
            r2.postDelayed(r3, r0)
            java.lang.Object r2 = r4.A02
            android.view.View r2 = (android.view.View) r2
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            r1 = 0
            if (r0 == 0) goto L_0x006f
            goto L_0x006e
        L_0x0038:
            r0 = 0
            X.AnonymousClass00C.A0D(r5, r0)
            java.lang.Object r1 = r4.A01
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            if (r1 == 0) goto L_0x004d
            java.lang.Object r0 = r4.A02
            com.whatsapp.emoji.search.EmojiSearchKeyboardContainer r0 = (com.whatsapp.emoji.search.EmojiSearchKeyboardContainer) r0
            com.whatsapp.InterceptingEditText r0 = r0.A04
            if (r0 == 0) goto L_0x004d
            r0.removeCallbacks(r1)
        L_0x004d:
            java.lang.Object r1 = r4.A02
            com.whatsapp.emoji.search.EmojiSearchKeyboardContainer r1 = (com.whatsapp.emoji.search.EmojiSearchKeyboardContainer) r1
            r0 = 37
            X.3vL r3 = new X.3vL
            r3.<init>(r4, r5, r1, r0)
            r4.A01 = r3
            com.whatsapp.InterceptingEditText r2 = r1.A04
            if (r2 == 0) goto L_0x0063
            long r0 = r1.A00
            r2.postDelayed(r3, r0)
        L_0x0063:
            java.lang.Object r2 = r4.A00
            android.view.View r2 = (android.view.View) r2
            int r0 = r5.length()
            r1 = 0
            if (r0 != 0) goto L_0x006f
        L_0x006e:
            r1 = 4
        L_0x006f:
            r2.setVisibility(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4WL.onTextChanged(java.lang.CharSequence, int, int, int):void");
    }

    public AnonymousClass4WL(View view, EmojiSearchContainer emojiSearchContainer) {
        this.A01 = emojiSearchContainer;
        this.A02 = view;
    }

    public AnonymousClass4WL(View view, EmojiSearchKeyboardContainer emojiSearchKeyboardContainer) {
        this.A02 = emojiSearchKeyboardContainer;
        this.A00 = view;
    }
}
