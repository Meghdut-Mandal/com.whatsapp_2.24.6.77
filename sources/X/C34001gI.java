package X;

import android.content.Context;
import android.text.TextPaint;
import android.view.View;

/* renamed from: X.1gI  reason: invalid class name and case insensitive filesystem */
public final class C34001gI extends C33991gH {
    public final /* synthetic */ Runnable A00;

    public void updateDrawState(TextPaint textPaint) {
        AnonymousClass00C.A0D(textPaint, 0);
        super.updateDrawState(textPaint);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34001gI(Context context, Runnable runnable, int i) {
        super(context, i);
        this.A00 = runnable;
    }

    public void onClick(View view) {
        this.A00.run();
    }
}
