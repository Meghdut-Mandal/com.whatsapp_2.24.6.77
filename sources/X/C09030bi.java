package X;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;

/* renamed from: X.0bi  reason: invalid class name and case insensitive filesystem */
public final class C09030bi implements View.OnClickListener {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ Intent A01;

    public C09030bi(Context context, Intent intent) {
        this.A00 = context;
        this.A01 = intent;
    }

    public final void onClick(View view) {
        try {
            this.A00.startActivity(this.A01);
        } catch (ActivityNotFoundException e) {
            Log.e("DeferredLifecycleHelper", "Failed to start resolution intent", e);
        }
    }
}
