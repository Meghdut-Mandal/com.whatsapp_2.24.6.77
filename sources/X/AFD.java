package X;

import android.os.RemoteException;
import android.util.Base64;
import android.util.Log;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public final class AFD implements B1U {
    public final AE0 A00;
    public final C194949Rw A01;
    public final AnonymousClass005 A02;

    public String B9W(String str, String str2, boolean z) {
        C197959cf r3 = this.A01.A00;
        if (r3 == null) {
            return null;
        }
        String name = C197959cf.class.getName();
        Log.d(name, "GetChallenge called");
        if (str.trim().isEmpty() || str2.trim().isEmpty()) {
            Log.d(name, "In-sufficient arguments provided");
            return null;
        }
        try {
            return r3.A01.B9V(str, str2);
        } catch (RemoteException unused) {
            Log.e("CLServerices", "RemoteException in getChallenge");
            return null;
        }
    }

    public boolean BnB(String str, String str2, String str3, String str4) {
        String str5;
        String str6 = null;
        try {
            byte[] bArr = new byte[16];
            new SecureRandom().nextBytes(bArr);
            str5 = C36441kJ.A13(bArr);
            AnonymousClass00C.A08(str5);
        } catch (NoSuchAlgorithmException unused) {
            com.whatsapp.util.Log.e("registerApp NoSuchAlgorithmException");
            str5 = null;
        }
        byte[] bArr2 = (byte[]) this.A00.A09().A00;
        String str7 = str2;
        String str8 = str3;
        if (!(bArr2 == null || str5 == null)) {
            try {
                StringBuilder A0v = AnonymousClass000.A0v("com.whatsapp");
                A0v.append('|');
                A0v.append(str2);
                str6 = Base64.encodeToString(AnonymousClass6HE.A01(str5, AnonymousClass6HE.A00(C90464aC.A0f(str3, A0v, '|'), str5), bArr2), 0);
            } catch (Exception unused2) {
                com.whatsapp.util.Log.e("CryptoUtils: populateHmac Exception");
            }
        }
        C197959cf r2 = this.A01.A00;
        if (r2 == null) {
            return false;
        }
        String name = C197959cf.class.getName();
        Log.d(name, "Register App called");
        if ("com.whatsapp".trim().isEmpty() || str2.trim().isEmpty() || str3.trim().isEmpty() || str6 == null || str6.trim().isEmpty() || str5 == null) {
            Log.d(name, "In-sufficient arguments provided");
            return false;
        }
        try {
            return r2.A01.BnC("com.whatsapp", str7, str8, str6, str5);
        } catch (RemoteException unused3) {
            Log.e("CLServices", "Remote Exception in registerApp");
            return false;
        }
    }

    public AFD(AE0 ae0, C194949Rw r3, AnonymousClass005 r4) {
        C36321k7.A11(r3, r4, ae0);
        this.A01 = r3;
        this.A02 = r4;
        this.A00 = ae0;
        r3.A00((C22976AzS) null);
    }
}
