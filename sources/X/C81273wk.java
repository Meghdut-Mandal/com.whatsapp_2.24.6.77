package X;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.whatsapp.jid.Jid;
import com.whatsapp.notification.PopupNotification;
import com.whatsapp.util.Log;
import java.security.PublicKey;
import java.security.cert.X509Certificate;
import java.util.Set;

/* renamed from: X.3wk  reason: invalid class name and case insensitive filesystem */
public class C81273wk implements Runnable {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public final int A06;

    public C81273wk(C160057kO r2, C128936Ee r3, C145546u7 r4, PublicKey publicKey, X509Certificate x509Certificate, int i) {
        this.A06 = 3;
        AnonymousClass00C.A0D(publicKey, 3);
        this.A05 = r4;
        this.A02 = x509Certificate;
        this.A04 = publicKey;
        this.A00 = i;
        this.A01 = r2;
        this.A03 = r3;
    }

    public final void run() {
        boolean z;
        AnonymousClass32Y r4;
        int i;
        switch (this.A06) {
            case 0:
                ((C64603Oq) this.A04).A01((View) this.A03, C130836Mp.A03);
                ((Set) this.A02).remove(this.A01);
                ((AnonymousClass6KW) this.A05).A01.remove(this.A00);
                return;
            case 1:
                C45522Rr r2 = new C45522Rr();
                AnonymousClass3T1 A042 = ((C24541Cv) this.A03).A04((AnonymousClass11F) this.A04);
                if (A042 != null) {
                    r2.A00 = Integer.valueOf(AnonymousClass3T1.A04(A042));
                    r2.A05 = Long.valueOf(A042.A0I);
                    r2.A06 = A042.A1J.A01;
                    r2.A07 = C65093Qs.A00(A042);
                }
                r2.A02 = Integer.valueOf(this.A00);
                r2.A03 = (Integer) this.A02;
                r2.A04 = C36361kB.A0i();
                r2.A01 = (Integer) this.A01;
                ((C21010yW) this.A05).Bly(r2);
                return;
            case 2:
                C21390zA r3 = (C21390zA) this.A01;
                if (!r3.A00 || ((AnonymousClass1G4) this.A05).A01()) {
                    Log.i("messagenotification/popupnotification/background");
                    if ((!((AnonymousClass1G4) this.A05).A01() || !((i = this.A00) == 2 || i == 3)) && (r3.A00 || this.A00 == 3)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    r4 = (AnonymousClass32Y) this.A03;
                    AnonymousClass32X r0 = r4.A00;
                    if (r0 == null || !r0.A00.A1L) {
                        if (z) {
                            Context context = (Context) this.A02;
                            Intent A0D = C36431kI.A0D();
                            A0D.setClassName(context.getPackageName(), "com.whatsapp.notification.PopupNotification");
                            A0D.putExtra("popup_notification_extra_quick_reply_jid", AnonymousClass143.A03((Jid) this.A04));
                            A0D.putExtra("popup_notification_extra_dismiss_notification", false);
                            A0D.setFlags(268697600);
                            context.startActivity(A0D);
                            return;
                        }
                        return;
                    }
                } else {
                    r4 = (AnonymousClass32Y) this.A03;
                    AnonymousClass32X r02 = r4.A00;
                    if (r02 != null && r02.A00.A1L) {
                        Log.i("messagenotification/popupnotification/foreground");
                    } else {
                        return;
                    }
                }
                AnonymousClass11F r32 = (AnonymousClass11F) this.A04;
                AnonymousClass32X r03 = r4.A00;
                if (r03 != null) {
                    PopupNotification popupNotification = r03.A00;
                    C36321k7.A1K(r32, "popupnotification/set-quick-reply-jid:", AnonymousClass000.A0u());
                    popupNotification.A0v = r32;
                }
                AnonymousClass32X r04 = r4.A00;
                if (r04 != null) {
                    r04.A00.A3K();
                    return;
                }
                return;
            default:
                X509Certificate x509Certificate = (X509Certificate) this.A02;
                Integer valueOf = Integer.valueOf(this.A00);
                C160057kO r22 = (C160057kO) this.A01;
                C128936Ee r33 = (C128936Ee) this.A03;
                AnonymousClass00C.A0D(x509Certificate, 0);
                ((C145546u7) this.A05).A0B(r22, r33, valueOf, (String) null, (String) null, (String) null, (PublicKey) this.A04, x509Certificate, -1);
                return;
        }
    }

    public C81273wk(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, int i2) {
        this.A06 = i2;
        this.A02 = obj;
        this.A05 = obj2;
        this.A03 = obj3;
        this.A01 = obj4;
        this.A00 = i;
        this.A04 = obj5;
    }
}
