package X;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;

/* renamed from: X.AYe  reason: case insensitive filesystem */
public final /* synthetic */ class C21727AYe implements Callable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ WeakReference A03;

    public /* synthetic */ C21727AYe(Context context, String str, WeakReference weakReference, int i) {
        this.A03 = weakReference;
        this.A01 = context;
        this.A00 = i;
        this.A02 = str;
    }

    public final Object call() {
        WeakReference weakReference = this.A03;
        Context context = this.A01;
        int i = this.A00;
        String str = this.A02;
        Context context2 = (Context) weakReference.get();
        if (context2 != null) {
            context = context2;
        }
        return C203529oE.A00(context, str, i);
    }
}
