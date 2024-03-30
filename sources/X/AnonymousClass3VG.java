package X;

import android.app.Activity;
import android.content.DialogInterface;
import com.whatsapp.util.Log;

/* renamed from: X.3VG  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3VG implements DialogInterface.OnClickListener {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C19420v0 A01;
    public final /* synthetic */ C19900wh A02;
    public final /* synthetic */ Runnable A03;
    public final /* synthetic */ String A04;

    public /* synthetic */ AnonymousClass3VG(Activity activity, C19420v0 r2, C19900wh r3, Runnable runnable, String str) {
        this.A01 = r2;
        this.A00 = activity;
        this.A04 = str;
        this.A02 = r3;
        this.A03 = runnable;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C19420v0 r7 = this.A01;
        Activity activity = this.A00;
        String str = this.A04;
        C19900wh r4 = this.A02;
        Runnable runnable = this.A03;
        Log.i("RegistrationUtils/showLoginFailedDialog/exit login");
        C36341k9.A0x(C19420v0.A00(r7), "account_switching_logged_out_phone_number", (String) null);
        activity.startActivity(AnonymousClass190.A1H(activity, str, r4.A01(), r7.A0I(), false));
        if (runnable != null) {
            runnable.run();
        }
    }
}
