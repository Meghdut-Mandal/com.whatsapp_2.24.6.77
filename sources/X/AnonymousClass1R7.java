package X;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.1R7  reason: invalid class name */
public class AnonymousClass1R7 extends View {
    public final /* synthetic */ ViewGroup A00;
    public final /* synthetic */ AnonymousClass026 A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1R7(Context context, ViewGroup viewGroup, AnonymousClass026 r3) {
        super(context);
        this.A01 = r3;
        this.A00 = viewGroup;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.A01.accept(configuration);
    }
}
