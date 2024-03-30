package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.7ox  reason: invalid class name and case insensitive filesystem */
public class C162667ox extends C33991gH {
    public Object A00;
    public final int A01 = 0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C162667ox(Context context, View.OnClickListener onClickListener) {
        super(context);
        this.A00 = onClickListener;
    }

    public void onClick(View view) {
        if (this.A01 != 0) {
            C36411kG.A1O(this.A00);
        } else {
            ((View.OnClickListener) this.A00).onClick(view);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C162667ox(Runnable runnable, int i) {
        super(i, i, i);
        this.A00 = runnable;
    }
}
