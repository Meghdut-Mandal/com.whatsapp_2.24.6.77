package X;

import com.whatsapp.util.Log;

/* renamed from: X.3pF  reason: invalid class name and case insensitive filesystem */
public class C76663pF implements C236119d {
    public final /* synthetic */ C20510xg A00;
    public final /* synthetic */ AnonymousClass4RS A01;
    public final /* synthetic */ Runnable A02;
    public final /* synthetic */ String A03;

    public C76663pF(C20510xg r1, AnonymousClass4RS r2, Runnable runnable, String str) {
        this.A00 = r1;
        this.A03 = str;
        this.A02 = runnable;
        this.A01 = r2;
    }

    public void BWw(C203399nx r3, String str) {
        Log.i("GroupXmppMethods/sendSetGroupAdminSetting error");
        this.A01.Bou(AnonymousClass3ME.A00(r3));
    }

    public void BiM(C203399nx r2, String str) {
        if (r2.A0c(this.A03) != null) {
            this.A02.run();
        }
    }

    public void BVN(String str) {
    }
}
