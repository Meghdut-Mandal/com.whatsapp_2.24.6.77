package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.21o  reason: invalid class name */
public final class AnonymousClass21o extends C33991gH {
    public final /* synthetic */ Runnable A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass21o(Context context, Runnable runnable, int i) {
        super(context, i);
        this.A00 = runnable;
    }

    public void onClick(View view) {
        this.A00.run();
    }
}
