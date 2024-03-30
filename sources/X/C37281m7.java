package X;

import android.content.res.Resources;
import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import com.whatsapp.R;

/* renamed from: X.1m7  reason: invalid class name and case insensitive filesystem */
public final class C37281m7 extends ForegroundColorSpan {
    public final /* synthetic */ Resources A00;

    public void updateDrawState(TextPaint textPaint) {
        AnonymousClass00C.A0D(textPaint, 0);
        super.updateDrawState(textPaint);
        textPaint.setTextSize(this.A00.getDimension(R.dimen.f7nameremoved));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C37281m7(Resources resources, int i) {
        super(i);
        this.A00 = resources;
    }
}
