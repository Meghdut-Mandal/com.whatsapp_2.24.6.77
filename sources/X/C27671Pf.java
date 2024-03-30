package X;

import android.os.Build;
import android.telecom.ConnectionRequest;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.1Pf  reason: invalid class name and case insensitive filesystem */
public class C27671Pf implements C19710wO {
    public final C27681Pg A00;

    public String BIB() {
        return "SelfManagedConnectionsManager";
    }

    public /* synthetic */ void BRM() {
    }

    public static C27681Pg A00(C27671Pf r2) {
        if (Build.VERSION.SDK_INT >= 28) {
            C27681Pg r0 = r2.A00;
            C18740tg.A06(r0);
            return r0;
        }
        throw new RuntimeException("Requires API level 28");
    }

    public int A02() {
        C27681Pg r0;
        if (Build.VERSION.SDK_INT < 28 || (r0 = this.A00) == null) {
            return 0;
        }
        return r0.A01();
    }

    public boolean A0B() {
        C27681Pg r0;
        if (Build.VERSION.SDK_INT < 28 || (r0 = this.A00) == null || !r0.A0E()) {
            return false;
        }
        return true;
    }

    public boolean A0C() {
        C27681Pg r0;
        if (Build.VERSION.SDK_INT < 28 || (r0 = this.A00) == null || !r0.A0F()) {
            return false;
        }
        return true;
    }

    public boolean A0D() {
        C27681Pg r0;
        if (Build.VERSION.SDK_INT < 28 || (r0 = this.A00) == null || !r0.A0G()) {
            return false;
        }
        return true;
    }

    public boolean A0E() {
        C27681Pg r0;
        if (Build.VERSION.SDK_INT < 28 || (r0 = this.A00) == null || !r0.A0H()) {
            return false;
        }
        return true;
    }

    public void BRL() {
        C27681Pg r0;
        Log.i("voip/SelfManagedConnectionsManager/onAsyncInit");
        if (A0D() || A0C()) {
            A0E();
        } else if (Build.VERSION.SDK_INT >= 30 && (r0 = this.A00) != null) {
            r0.A05();
        }
    }

    public C27671Pf(C19730wQ r7, C21060yb r8, C19630wG r9, C20810yC r10, AnonymousClass13J r11) {
        C27681Pg r0;
        if (Build.VERSION.SDK_INT >= 28) {
            r0 = new C27681Pg(r7, r8, r9, r10, r11);
        } else {
            r0 = null;
        }
        this.A00 = r0;
    }

    public int A01() {
        C27681Pg A002 = A00(this);
        C18740tg.A01();
        return A002.A03.size();
    }

    public C91734cX A03(ConnectionRequest connectionRequest, boolean z) {
        return A00(this).A02(connectionRequest, z);
    }

    public C91734cX A04(String str) {
        return A00(this).A03(str);
    }

    public void A05() {
        A00(this).A04();
    }

    public void A06(ConnectionRequest connectionRequest) {
        A00(this).A07(connectionRequest);
    }

    public void A07(ConnectionRequest connectionRequest) {
        A00(this).A08(connectionRequest);
    }

    public void A08(AnonymousClass1Pk r2) {
        A00(this).registerObserver(r2);
    }

    public void A09(AnonymousClass1Pk r2) {
        A00(this).unregisterObserver(r2);
    }

    public void A0A(String str, String str2) {
        A00(this).A0D(str, str2);
    }

    public boolean A0F(UserJid userJid, String str, String str2, boolean z) {
        return A00(this).A0I(userJid, str, str2, z);
    }

    public boolean A0G(UserJid userJid, String str, String str2, boolean z, boolean z2) {
        return A00(this).A0J(userJid, str, str2, z, z2);
    }
}
