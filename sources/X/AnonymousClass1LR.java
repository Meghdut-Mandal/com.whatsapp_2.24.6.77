package X;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.whatsapp.util.Log;

/* renamed from: X.1LR  reason: invalid class name */
public class AnonymousClass1LR {
    public final C20310xM A00;
    public final AnonymousClass12P A01;
    public final C20170x8 A02;
    public final AnonymousClass005 A03;
    public final Handler A04 = new Handler(Looper.getMainLooper());
    public final C19730wQ A05;
    public final AnonymousClass1LS A06;

    public static void A00(AnonymousClass1LR r5, C64933Qa r6, C46742bb r7) {
        Object A0J;
        int i = r7.A00;
        String str = r6.A01;
        AnonymousClass11F r4 = r7.A1J.A00;
        AnonymousClass1LR r3 = r5;
        C19730wQ r1 = r5.A05;
        if (C66013Ui.A0R(r1, r7)) {
            r1.A0G();
            A0J = r1.A03;
        } else {
            A0J = r7.A0J();
        }
        if (TextUtils.isEmpty(str) || r4 == null || A0J == null) {
            Log.w("MessageAddOnScheduledCallEditManager/onScheduledCallEditMessageAdded parentMessageId or chatJid or senderJid is empty");
        } else if (i == 1) {
            r3.A04.post(new C35521ip(r3, r4, A0J, str, 7));
        }
    }

    public AnonymousClass1LR(C19730wQ r3, C20310xM r4, AnonymousClass12P r5, AnonymousClass1LS r6, C20170x8 r7, AnonymousClass005 r8) {
        this.A05 = r3;
        this.A02 = r7;
        this.A01 = r5;
        this.A00 = r4;
        this.A03 = r8;
        this.A06 = r6;
    }
}
