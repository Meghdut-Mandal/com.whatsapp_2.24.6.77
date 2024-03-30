package X;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.net.Uri;
import org.npci.upi.security.services.CLRemoteService;

/* renamed from: X.9cf  reason: invalid class name and case insensitive filesystem */
public class C197959cf {
    public static C197959cf A04;
    public static final Uri A05 = Uri.parse("content://org.npci.upi.security.pinactivitycomponent.clservices/execute");
    public static final Uri A06 = Uri.parse("content://org.npci.upi.security.pinactivitycomponent.clservices/getChallenge");
    public static final Uri A07 = Uri.parse("content://org.npci.upi.security.pinactivitycomponent.clservices/getCredentialIntent");
    public static final Uri A08 = Uri.parse("content://org.npci.upi.security.pinactivitycomponent.clservices/getCredential");
    public static final Uri A09 = Uri.parse("content://org.npci.upi.security.pinactivitycomponent.clservices/registerApp");
    public AnonymousClass9FB A00;
    public CLRemoteService A01 = null;
    public Context A02;
    public ServiceConnection A03 = new C23232BAo(this, 1);

    public C197959cf(Context context, AnonymousClass9FB r6) {
        this.A02 = context;
        this.A00 = r6;
        Intent A0D = C36431kI.A0D();
        A0D.setAction("org.npci.upi.security.services.CLRemoteService");
        A0D.setPackage(this.A02.getPackageName());
        this.A02.bindService(A0D, this.A03, 1);
    }
}
