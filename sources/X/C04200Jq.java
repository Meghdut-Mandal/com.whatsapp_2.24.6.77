package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;

/* renamed from: X.0Jq  reason: invalid class name and case insensitive filesystem */
public final class C04200Jq extends C04270Jz {
    public final GoogleSignInOptions A00;

    public final String A07() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    public final String A08() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }

    public final int BEG() {
        return 12451000;
    }

    public final boolean BmV() {
        return true;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C04200Jq(android.content.Context r13, android.os.Looper r14, com.google.android.gms.auth.api.signin.GoogleSignInOptions r15, X.C17610rh r16, X.C17620ri r17, X.AnonymousClass0TT r18) {
        /*
            r12 = this;
            r11 = 91
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r16
            r9 = r17
            r10 = r18
            r5.<init>(r6, r7, r8, r9, r10, r11)
            X.0Ww r4 = new X.0Ww
            if (r15 == 0) goto L_0x0041
            r4.<init>(r15)
        L_0x0015:
            java.lang.String r0 = X.C06920Vp.A00()
            r4.A00 = r0
            java.util.Set r1 = r10.A06
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0045
            java.util.Iterator r3 = r1.iterator()
        L_0x0027:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0045
            java.lang.Object r2 = r3.next()
            r0 = 0
            com.google.android.gms.common.api.Scope[] r0 = new com.google.android.gms.common.api.Scope[r0]
            java.util.Set r1 = r4.A01
            r1.add(r2)
            java.util.List r0 = java.util.Arrays.asList(r0)
            r1.addAll(r0)
            goto L_0x0027
        L_0x0041:
            r4.<init>()
            goto L_0x0015
        L_0x0045:
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r0 = r4.A00()
            r12.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C04200Jq.<init>(android.content.Context, android.os.Looper, com.google.android.gms.auth.api.signin.GoogleSignInOptions, X.0rh, X.0ri, X.0TT):void");
    }

    public final /* synthetic */ IInterface A05(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        if (!(queryLocalInterface instanceof AnonymousClass0LY)) {
            return new AnonymousClass0LY(iBinder);
        }
        return queryLocalInterface;
    }

    public final Intent BHZ() {
        Context context = this.A0F;
        GoogleSignInOptions googleSignInOptions = this.A00;
        C06900Vn.A00.A00("getSignInIntent()");
        SignInConfiguration signInConfiguration = new SignInConfiguration(googleSignInOptions, context.getPackageName());
        Intent intent = new Intent("com.google.android.gms.auth.GOOGLE_SIGN_IN");
        intent.setPackage(context.getPackageName());
        intent.setClass(context, SignInHubActivity.class);
        Bundle A07 = AnonymousClass001.A07();
        A07.putParcelable("config", signInConfiguration);
        intent.putExtra("config", A07);
        return intent;
    }
}
