package X;

import android.os.Handler;
import android.os.Message;
import com.whatsapp.profile.SetAboutInfo;

/* renamed from: X.2bg  reason: invalid class name and case insensitive filesystem */
public class C46792bg extends C196019Xg {
    public final /* synthetic */ AnonymousClass32e A00;
    public final /* synthetic */ AnonymousClass32f A01;
    public final /* synthetic */ AnonymousClass4RS A02;
    public final /* synthetic */ C200139gg A03;
    public final /* synthetic */ String A04;

    public C46792bg(AnonymousClass32e r1, AnonymousClass32f r2, AnonymousClass4RS r3, C200139gg r4, String str) {
        this.A03 = r4;
        this.A01 = r2;
        this.A04 = str;
        this.A02 = r3;
        this.A00 = r1;
    }

    public void A01(int i) {
        this.A02.Bou(i);
    }

    public void A03(C203399nx r5) {
        AnonymousClass32f r0 = this.A01;
        String str = this.A04;
        SetAboutInfo setAboutInfo = r0.A00;
        setAboutInfo.A06 = true;
        Handler handler = setAboutInfo.A08;
        handler.removeMessages(0);
        handler.sendMessage(Message.obtain(handler, 1, str));
    }

    public void A04(Exception exc) {
        Handler handler = this.A00.A00.A08;
        handler.removeMessages(0);
        handler.sendEmptyMessage(0);
    }
}
