package X;

import android.os.SystemClock;
import com.whatsapp.util.Log;

/* renamed from: X.AmI  reason: case insensitive filesystem */
public final class C22417AmI extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ AnonymousClass9XW this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22417AmI(AnonymousClass9XW r2) {
        super(1);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str = (String) obj;
        Log.i("RecaptchaClientHandler/execute succeeded!");
        C19420v0 r7 = this.this$0.A07;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = true;
        C18740tg.A0D(AnonymousClass000.A1V(str), "Attempt to store null recaptcha token");
        if (elapsedRealtime <= 0) {
            z = false;
        }
        C18740tg.A0D(z, "Attempt to store invalid token time fetched");
        C36341k9.A0x(C19420v0.A00(r7), "less_beep_beep_identi", str);
        C36341k9.A0w(C19420v0.A00(r7), "less_beep_beep_time", elapsedRealtime);
        AnonymousClass9XW r1 = this.this$0;
        r1.A02 = C188258zI.FETCH_SUCCEEDED;
        r1.A09.A01("RECAPTCHA_EXECUTE_", "SUCCESS");
        return AnonymousClass0AJ.A00;
    }
}
