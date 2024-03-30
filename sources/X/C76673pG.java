package X;

import android.util.Pair;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3pG  reason: invalid class name and case insensitive filesystem */
public class C76673pG implements C236119d {
    public final /* synthetic */ C20510xg A00;
    public final /* synthetic */ AnonymousClass4RS A01;
    public final /* synthetic */ Runnable A02;
    public final /* synthetic */ boolean A03;

    public C76673pG(C20510xg r1, AnonymousClass4RS r2, Runnable runnable, boolean z) {
        this.A00 = r1;
        this.A03 = z;
        this.A01 = r2;
        this.A02 = runnable;
    }

    public void BVN(String str) {
        Log.i("GroupXmppMethod/Leave group/delivery fail");
    }

    public void BWw(C203399nx r3, String str) {
        this.A01.Bou(AnonymousClass3ME.A00(r3));
    }

    public void BiM(C203399nx r8, String str) {
        C203399nx A0c = r8.A0c("leave");
        if (A0c != null) {
            ArrayList A0I = AnonymousClass001.A0I();
            List A0j = A0c.A0j("group");
            ArrayList A0I2 = AnonymousClass001.A0I();
            Iterator it = A0j.iterator();
            while (it.hasNext()) {
                C203399nx A0s = C36431kI.A0s(it);
                String A0x = C36391kE.A0x(A0s, "error");
                Jid A0X = A0s.A0X(AnonymousClass147.class, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                if (A0x == null) {
                    A0I.add(A0X);
                } else {
                    A0I2.add(C36341k9.A0I(A0X, Integer.parseInt(A0x)));
                }
            }
            if (A0I.size() > 0) {
                C36431kI.A0d(this.A00).A0k(A0I, this.A03);
            }
            if (A0I2.size() == 1) {
                this.A01.Bou(C36381kD.A03((Pair) C36441kJ.A12(A0I2)));
                return;
            }
        }
        this.A02.run();
    }
}
