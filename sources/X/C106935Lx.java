package X;

import android.content.Context;
import android.media.Ringtone;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.CallState;
import com.whatsapp.voipcalling.Voip;
import java.lang.ref.WeakReference;

/* renamed from: X.5Lx  reason: invalid class name and case insensitive filesystem */
public class C106935Lx extends C132446Tt {
    public final WeakReference A00;
    public final WeakReference A01;

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        Ringtone ringtone = (Ringtone) obj;
        AnonymousClass6XR r2 = ((C116985lW) this.A01.get()).A00;
        CallInfo callInfo = Voip.getCallInfo();
        if (callInfo != null && callInfo.callState == CallState.RECEIVED_CALL && r2.A02 != null) {
            Ringtone ringtone2 = r2.A01;
            if (ringtone2 != null) {
                ringtone2.stop();
            }
            r2.A01 = ringtone;
            if (ringtone != null) {
                try {
                    AnonymousClass6XR.A03(r2);
                } catch (Exception e) {
                    Log.e((Throwable) e);
                    try {
                        r2.A01.stop();
                    } catch (Exception e2) {
                        Log.e((Throwable) e2);
                    }
                    r2.A01 = null;
                }
            } else {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("voip/ringtone/no-ringtone found for ");
                C36331k8.A1P(r2.A02, A0u);
            }
        }
    }

    public C106935Lx(Context context, C116985lW r3) {
        this.A01 = AnonymousClass001.A0F(r3);
        this.A00 = AnonymousClass001.A0F(context);
    }
}
