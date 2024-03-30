package X;

import android.app.Activity;
import android.widget.PopupWindow;
import com.whatsapp.KeyboardPopupLayout;
import com.whatsapp.emoji.search.EmojiSearchProvider;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.687  reason: invalid class name */
public class AnonymousClass687 {
    public final Activity A00;
    public final C19700wN A01;
    public final KeyboardPopupLayout A02;
    public final C21060yb A03;
    public final C19420v0 A04;
    public final C18820ts A05;
    public final AnonymousClass3HG A06;
    public final C1261362r A07;
    public final AnonymousClass6O1 A08;
    public final AnonymousClass1XN A09;
    public final AnonymousClass1H2 A0A;
    public final EmojiSearchProvider A0B;
    public final C20810yC A0C;
    public final C21010yW A0D;
    public final AnonymousClass3HH A0E;
    public final AnonymousClass3L7 A0F;
    public final C19890wg A0G;
    public final C95494lK A0H;
    public final AnonymousClass1N2 A0I;
    public final HashMap A0J = AnonymousClass001.A0J();

    public void A00() {
        PopupWindow popupWindow;
        HashMap hashMap = this.A0J;
        if (hashMap.containsKey(1) && (popupWindow = (PopupWindow) hashMap.get(1)) != null) {
            popupWindow.dismiss();
        }
    }

    public void A01(int i) {
        C38871qM r0;
        PopupWindow popupWindow;
        HashMap hashMap = this.A0J;
        Iterator A0s = C90484aE.A0s(hashMap);
        while (A0s.hasNext()) {
            Number number = (Number) A0s.next();
            if (!(number.intValue() == i || (popupWindow = (PopupWindow) hashMap.get(number)) == null)) {
                popupWindow.dismiss();
            }
        }
        Integer valueOf = Integer.valueOf(i);
        if (hashMap.containsKey(valueOf) && (r0 = (C38871qM) hashMap.get(valueOf)) != null) {
            r0.A0E();
        }
    }

    public AnonymousClass687(Activity activity, C19700wN r3, KeyboardPopupLayout keyboardPopupLayout, C21060yb r5, C19420v0 r6, C18820ts r7, AnonymousClass3HG r8, C1261362r r9, AnonymousClass6O1 r10, AnonymousClass1XN r11, AnonymousClass1H2 r12, EmojiSearchProvider emojiSearchProvider, C20810yC r14, C21010yW r15, AnonymousClass3HH r16, AnonymousClass3L7 r17, C19890wg r18, C95494lK r19, AnonymousClass1N2 r20) {
        this.A0C = r14;
        this.A0I = r20;
        this.A01 = r3;
        this.A0D = r15;
        this.A0A = r12;
        this.A09 = r11;
        this.A03 = r5;
        this.A05 = r7;
        this.A07 = r9;
        this.A0F = r17;
        this.A0B = emojiSearchProvider;
        this.A04 = r6;
        this.A0G = r18;
        this.A08 = r10;
        this.A0E = r16;
        this.A0H = r19;
        this.A00 = activity;
        this.A02 = keyboardPopupLayout;
        this.A06 = r8;
    }
}
