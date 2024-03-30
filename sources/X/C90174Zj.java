package X;

import android.view.ViewTreeObserver;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.4Zj  reason: invalid class name and case insensitive filesystem */
public class C90174Zj implements ViewTreeObserver.OnGlobalLayoutListener {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03 = 0;

    public C90174Zj(AnonymousClass4V7 r2, C604337v r3) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r3.A01.getHeight();
    }

    public void onGlobalLayout() {
        if (this.A03 != 0) {
            AnonymousClass2IN r1 = ((C604437w) this.A02).A03;
            int height = r1.getHeight();
            if (height > this.A00) {
                AnonymousClass4V7 r2 = (AnonymousClass4V7) this.A01;
                if (r1.getTop() + this.A00 <= r2.getListView().getHeight()) {
                    r2.scrollBy(height - this.A00, 0);
                }
                this.A00 = height;
                return;
            }
            return;
        }
        AnonymousClass4V7 r7 = (AnonymousClass4V7) this.A01;
        C604337v r9 = (C604337v) this.A02;
        AnonymousClass2I0 r8 = r9.A01;
        int height2 = r8.getHeight();
        int i = this.A00;
        if (height2 > i) {
            int i2 = height2 - i;
            boolean z = false;
            if (r8.getTop() + this.A00 <= r7.getListView().getHeight()) {
                z = true;
            }
            TextEmojiLabel textEmojiLabel = r8.A06;
            int lineCount = textEmojiLabel.getLineCount();
            int i3 = r9.A00;
            if (lineCount > i3) {
                i2 = ((textEmojiLabel.getHeight() / textEmojiLabel.getLineCount()) * i3) - this.A00;
            }
            int top = r8.getTop() - r7.getListView().getTop();
            if (top < i2) {
                i2 = top;
            }
            if (z && i2 > 0) {
                r7.scrollBy(i2, 0);
            }
            this.A00 = height2;
        }
    }

    public C90174Zj(AnonymousClass4V7 r2, C604437w r3) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r3.A03.getHeight();
    }
}
