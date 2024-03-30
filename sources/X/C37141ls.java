package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.whatsapp.registration.verifyphone.VerifyPhoneNumber;
import java.lang.ref.WeakReference;

/* renamed from: X.1ls  reason: invalid class name and case insensitive filesystem */
public final class C37141ls extends Handler {
    public final C19460v5 A00;
    public final AnonymousClass2d1 A01;
    public final String A02;
    public final String A03;
    public final WeakReference A04;

    public void handleMessage(Message message) {
        VerifyPhoneNumber verifyPhoneNumber;
        AnonymousClass00C.A0D(message, 0);
        if (message.what == 1 && (verifyPhoneNumber = (VerifyPhoneNumber) this.A04.get()) != null) {
            Object obj = message.obj;
            AnonymousClass00C.A0E(obj, "null cannot be cast to non-null type kotlin.String");
            String str = this.A02;
            String str2 = this.A03;
            C18740tg.A06(str2);
            AnonymousClass3MJ.A00(this.A00);
            verifyPhoneNumber.A3l(this.A01, (String) obj, str, str2, "sms", (String) null, 4);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C37141ls(Looper looper, C19460v5 r3, AnonymousClass2d1 r4, VerifyPhoneNumber verifyPhoneNumber, String str, String str2) {
        super(looper);
        C36321k7.A1B(str, str2, looper, r3, r4);
        C18740tg.A06(looper);
        this.A02 = str;
        this.A03 = str2;
        this.A00 = r3;
        this.A01 = r4;
        this.A04 = AnonymousClass001.A0F(verifyPhoneNumber);
    }
}
