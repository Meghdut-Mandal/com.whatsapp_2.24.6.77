package X;

import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.List;

/* renamed from: X.0Wt  reason: invalid class name and case insensitive filesystem */
public final class C07210Wt {
    public Uri A00;
    public Bundle A01 = AnonymousClass001.A07();
    public String A02;
    public final long A03;
    public final AnonymousClass0UW A04;
    public final CharSequence A05;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: android.app.Person} */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v1, types: [java.lang.CharSequence] */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: type inference failed for: r4v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.Notification.MessagingStyle.Message A01() {
        /*
            r7 = this;
            X.0UW r6 = r7.A04
            int r5 = android.os.Build.VERSION.SDK_INT
            r4 = 0
            r3 = 28
            java.lang.CharSequence r2 = r7.A05
            long r0 = r7.A03
            if (r5 < r3) goto L_0x0021
            if (r6 == 0) goto L_0x0013
            android.app.Person r4 = r6.A00()
        L_0x0013:
            android.app.Notification$MessagingStyle$Message r2 = X.AnonymousClass0PU.A00(r4, r2, r0)
        L_0x0017:
            java.lang.String r1 = r7.A02
            if (r1 == 0) goto L_0x0020
            android.net.Uri r0 = r7.A00
            X.AnonymousClass0VD.A01(r2, r0, r1)
        L_0x0020:
            return r2
        L_0x0021:
            if (r6 == 0) goto L_0x0025
            java.lang.CharSequence r4 = r6.A01
        L_0x0025:
            android.app.Notification$MessagingStyle$Message r2 = X.AnonymousClass0VD.A00(r2, r4, r0)
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C07210Wt.A01():android.app.Notification$MessagingStyle$Message");
    }

    public C07210Wt(AnonymousClass0UW r2, CharSequence charSequence, long j) {
        this.A05 = charSequence;
        this.A03 = j;
        this.A04 = r2;
    }

    public static Bundle[] A00(List list) {
        Bundle[] bundleArr = new Bundle[list.size()];
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C07210Wt r6 = (C07210Wt) list.get(i);
            Bundle A07 = AnonymousClass001.A07();
            CharSequence charSequence = r6.A05;
            if (charSequence != null) {
                A07.putCharSequence("text", charSequence);
            }
            A07.putLong("time", r6.A03);
            AnonymousClass0UW r7 = r6.A04;
            if (r7 != null) {
                A07.putCharSequence("sender", r7.A01);
                if (Build.VERSION.SDK_INT >= 28) {
                    A07.putParcelable("sender_person", r7.A00());
                } else {
                    A07.putBundle("person", r7.A01());
                }
            }
            String str = r6.A02;
            if (str != null) {
                A07.putString(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str);
            }
            Uri uri = r6.A00;
            if (uri != null) {
                A07.putParcelable("uri", uri);
            }
            A07.putBundle("extras", r6.A01);
            bundleArr[i] = A07;
        }
        return bundleArr;
    }
}
