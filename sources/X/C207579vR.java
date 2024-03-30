package X;

import android.content.Intent;
import androidx.preference.Preference;
import com.whatsapp.settings.notificationsandsounds.NotificationsAndSoundsFragment;

/* renamed from: X.9vR  reason: invalid class name and case insensitive filesystem */
public final class C207579vR implements C009604b {
    public String A00;
    public final /* synthetic */ NotificationsAndSoundsFragment A01;

    public C207579vR(NotificationsAndSoundsFragment notificationsAndSoundsFragment) {
        this.A01 = notificationsAndSoundsFragment;
    }

    public /* bridge */ /* synthetic */ void BQj(Object obj) {
        Object obj2;
        C22847Aww aww;
        C009804d r6 = (C009804d) obj;
        AnonymousClass00C.A0D(r6, 0);
        String str = this.A00;
        if (str != null) {
            NotificationsAndSoundsFragment notificationsAndSoundsFragment = this.A01;
            if (r6.A00 != -1) {
                return;
            }
            if (str.equals("jid_message_tone") || str.equals("jid_call_ringtone")) {
                Intent intent = r6.A01;
                if (intent != null) {
                    obj2 = intent.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI");
                } else {
                    obj2 = null;
                }
                Preference B7M = notificationsAndSoundsFragment.B7M(str);
                if (B7M != null && (aww = B7M.A0A) != null) {
                    if (obj2 == null) {
                        obj2 = "";
                    }
                    aww.BdG(B7M, obj2);
                }
            }
        }
    }
}
