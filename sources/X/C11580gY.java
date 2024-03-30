package X;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import com.google.android.gms.common.api.GoogleApiActivity;

/* renamed from: X.0gY  reason: invalid class name and case insensitive filesystem */
public final class C11580gY implements Runnable {
    public final C06080Sf A00;
    public final /* synthetic */ AnonymousClass0JX A01;

    public C11580gY(AnonymousClass0JX r1, C06080Sf r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    public final void run() {
        AnonymousClass0JX r4 = this.A01;
        if (r4.A05) {
            C06080Sf r2 = this.A00;
            AnonymousClass0L0 r7 = r2.A01;
            if (r7.A00()) {
                C17270r0 r6 = r4.mLifecycleFragment;
                Activity activity = r4.getActivity();
                PendingIntent pendingIntent = r7.A02;
                AnonymousClass006.A01(pendingIntent);
                int i = r2.A00;
                Intent intent = new Intent(activity, GoogleApiActivity.class);
                intent.putExtra("pending_intent", pendingIntent);
                intent.putExtra("failing_client_id", i);
                intent.putExtra("notify_manager", false);
                r6.startActivityForResult(intent, 1);
                return;
            }
            C02610Bd r3 = r4.A02;
            Activity activity2 = r4.getActivity();
            int i2 = r7.A01;
            if (r3.A03(activity2, (String) null, i2) != null) {
                Activity activity3 = r4.getActivity();
                AlertDialog A002 = C02610Bd.A00(activity3, r4, new AnonymousClass0LC(r3.A03(activity3, "d", i2), r4.mLifecycleFragment), i2);
                if (A002 != null) {
                    C02610Bd.A01(activity3, A002, r4, "GooglePlayServicesErrorDialog");
                }
            } else if (i2 == 18) {
                Activity activity4 = r4.getActivity();
                ProgressBar progressBar = new ProgressBar(activity4, (AttributeSet) null, 16842874);
                progressBar.setIndeterminate(true);
                progressBar.setVisibility(0);
                AlertDialog.Builder builder = new AlertDialog.Builder(activity4);
                builder.setView(progressBar);
                builder.setMessage(C07680Yv.A01(activity4, 18));
                builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
                AlertDialog create = builder.create();
                C02610Bd.A01(activity4, create, r4, "GooglePlayServicesUpdatingDialog");
                r3.A04(r4.getActivity().getApplicationContext(), new C04110Jh(create, this));
            } else {
                int i3 = r2.A00;
                r4.A04.set((Object) null);
                r4.A03.A06(r7, i3);
            }
        }
    }
}
