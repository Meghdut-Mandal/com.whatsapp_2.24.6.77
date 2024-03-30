package X;

import android.content.Context;
import android.credentials.CreateCredentialRequest;
import android.credentials.CredentialManager;
import android.credentials.CredentialOption;
import android.credentials.GetCredentialRequest;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Parcelable;
import android.text.TextUtils;
import com.whatsapp.R;
import java.util.concurrent.Executor;

/* renamed from: X.9wy  reason: invalid class name and case insensitive filesystem */
public final class C207779wy implements B24 {
    public final CredentialManager A00;

    public void onCreateCredential(Context context, C192779In r14, CancellationSignal cancellationSignal, Executor executor, B0O b0o) {
        Executor executor2 = executor;
        AnonymousClass00C.A0D(executor2, 3);
        B0O b0o2 = b0o;
        C22033Afg afg = new C22033Afg(b0o2);
        CredentialManager credentialManager = this.A00;
        if (credentialManager == null) {
            afg.invoke();
            return;
        }
        C204499q6 r11 = new C204499q6(r14, b0o2, this);
        Bundle bundle = r14.A01;
        AnonymousClass9G5 r5 = r14.A02;
        Bundle A07 = AnonymousClass001.A07();
        A07.putCharSequence("androidx.credentials.BUNDLE_KEY_USER_ID", r5.A01);
        CharSequence charSequence = r5.A00;
        if (!TextUtils.isEmpty(charSequence)) {
            A07.putCharSequence("androidx.credentials.BUNDLE_KEY_USER_DISPLAY_NAME", charSequence);
        }
        if (!TextUtils.isEmpty((CharSequence) null)) {
            A07.putString("androidx.credentials.BUNDLE_KEY_DEFAULT_PROVIDER", (String) null);
        }
        A07.putParcelable("androidx.credentials.BUNDLE_KEY_CREDENTIAL_TYPE_ICON", Icon.createWithResource(context, R.drawable.ic_passkey));
        bundle.putBundle("androidx.credentials.BUNDLE_KEY_REQUEST_DISPLAY_INFO", A07);
        CreateCredentialRequest.Builder alwaysSendAppInfoToProvider = new CreateCredentialRequest.Builder("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", bundle, r14.A00).setIsSystemProviderRequired(false).setAlwaysSendAppInfoToProvider(true);
        AnonymousClass00C.A08(alwaysSendAppInfoToProvider);
        CreateCredentialRequest build = alwaysSendAppInfoToProvider.build();
        AnonymousClass00C.A08(build);
        credentialManager.createCredential(context, build, cancellationSignal, executor2, r11);
    }

    public void onGetCredential(Context context, AnonymousClass9BX r15, CancellationSignal cancellationSignal, Executor executor, B0O b0o) {
        Executor executor2 = executor;
        AnonymousClass00C.A0D(executor2, 3);
        B0O b0o2 = b0o;
        C22034Afh afh = new C22034Afh(b0o2);
        CredentialManager credentialManager = this.A00;
        if (credentialManager == null) {
            afh.invoke();
            return;
        }
        C204489q5 r12 = new C204489q5(b0o2, this);
        Bundle A07 = AnonymousClass001.A07();
        A07.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IDENTITY_DOC_UI", false);
        A07.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", true);
        A07.putParcelable("androidx.credentials.BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME", (Parcelable) null);
        GetCredentialRequest.Builder builder = new GetCredentialRequest.Builder(A07);
        for (C192789Io r4 : r15.A00) {
            builder.addCredentialOption(new CredentialOption.Builder("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", r4.A01, r4.A00).setIsSystemProviderRequired(false).setAllowedProviders(r4.A02).build());
        }
        GetCredentialRequest build = builder.build();
        AnonymousClass00C.A08(build);
        credentialManager.getCredential(context, build, cancellationSignal, executor2, r12);
    }

    public boolean isAvailableOnDevice() {
        if (Build.VERSION.SDK_INT < 34 || this.A00 == null) {
            return false;
        }
        return true;
    }

    public C207779wy(Context context) {
        this.A00 = (CredentialManager) context.getSystemService("credential");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:4|5|6|7|8) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0035 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.AnonymousClass9BY A00(android.credentials.GetCredentialResponse r3) {
        /*
            android.credentials.Credential r0 = r3.getCredential()
            X.AnonymousClass00C.A08(r0)
            java.lang.String r3 = r0.getType()
            X.AnonymousClass00C.A08(r3)
            android.os.Bundle r2 = r0.getData()
            X.AnonymousClass00C.A08(r2)
            java.lang.String r0 = "android.credentials.TYPE_PASSWORD_CREDENTIAL"
            boolean r0 = r3.equals(r0)     // Catch:{ 91P -> 0x005e }
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = "androidx.credentials.BUNDLE_KEY_ID"
            java.lang.String r1 = r2.getString(r0)     // Catch:{ Exception -> 0x0035 }
            java.lang.String r0 = "androidx.credentials.BUNDLE_KEY_PASSWORD"
            java.lang.String r0 = r2.getString(r0)     // Catch:{ Exception -> 0x0035 }
            X.AnonymousClass00C.A0B(r1)     // Catch:{ Exception -> 0x0035 }
            X.AnonymousClass00C.A0B(r0)     // Catch:{ Exception -> 0x0035 }
            X.7x4 r1 = new X.7x4     // Catch:{ Exception -> 0x0035 }
            r1.<init>(r0, r2)     // Catch:{ Exception -> 0x0035 }
            goto L_0x0063
        L_0x0035:
            X.91P r0 = new X.91P     // Catch:{ 91P -> 0x005e }
            r0.<init>()     // Catch:{ 91P -> 0x005e }
            goto L_0x005d
        L_0x003b:
            java.lang.String r0 = "androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL"
            boolean r0 = r3.equals(r0)     // Catch:{ 91P -> 0x005e }
            if (r0 == 0) goto L_0x0052
            java.lang.String r0 = "androidx.credentials.BUNDLE_KEY_AUTHENTICATION_RESPONSE_JSON"
            java.lang.String r0 = r2.getString(r0)     // Catch:{ Exception -> 0x0058 }
            X.AnonymousClass00C.A0B(r0)     // Catch:{ Exception -> 0x0058 }
            X.7x5 r1 = new X.7x5     // Catch:{ Exception -> 0x0058 }
            r1.<init>(r0, r2)     // Catch:{ Exception -> 0x0058 }
            goto L_0x0063
        L_0x0052:
            X.91P r0 = new X.91P     // Catch:{ 91P -> 0x005e }
            r0.<init>()     // Catch:{ 91P -> 0x005e }
            goto L_0x005d
        L_0x0058:
            X.91P r0 = new X.91P     // Catch:{ 91P -> 0x005e }
            r0.<init>()     // Catch:{ 91P -> 0x005e }
        L_0x005d:
            throw r0     // Catch:{ 91P -> 0x005e }
        L_0x005e:
            X.7x3 r1 = new X.7x3
            r1.<init>(r3, r2)
        L_0x0063:
            X.9BY r0 = new X.9BY
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C207779wy.A00(android.credentials.GetCredentialResponse):X.9BY");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:144|145|146) */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x030b, code lost:
        return new X.C167007xA(r3, r2);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:144:0x0306 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C1889591l A01(android.credentials.CreateCredentialException r5) {
        /*
            java.lang.String r1 = r5.getType()
            int r0 = r1.hashCode()
            switch(r0) {
                case -2055374133: goto L_0x005d;
                case 1316905704: goto L_0x004b;
                case 2092588512: goto L_0x0039;
                case 2131915191: goto L_0x0027;
                default: goto L_0x000b;
            }
        L_0x000b:
            java.lang.String r2 = r5.getType()
            X.AnonymousClass00C.A08(r2)
            java.lang.String r1 = "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION"
            r0 = 0
            boolean r0 = X.AnonymousClass098.A07(r2, r1, r0)
            if (r0 == 0) goto L_0x0318
            java.lang.String r3 = r5.getType()
            X.AnonymousClass00C.A08(r3)
            java.lang.String r2 = r5.getMessage()
            goto L_0x006f
        L_0x0027:
            java.lang.String r0 = "android.credentials.CreateCredentialException.TYPE_NO_CREATE_OPTIONS"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000b
            java.lang.String r0 = r5.getMessage()
            X.7xE r4 = new X.7xE
            r4.<init>(r0)
            return r4
        L_0x0039:
            java.lang.String r0 = "android.credentials.CreateCredentialException.TYPE_INTERRUPTED"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000b
            java.lang.String r0 = r5.getMessage()
            X.7xD r4 = new X.7xD
            r4.<init>(r0)
            return r4
        L_0x004b:
            java.lang.String r0 = "android.credentials.CreateCredentialException.TYPE_UNKNOWN"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000b
            java.lang.String r0 = r5.getMessage()
            X.7xG r4 = new X.7xG
            r4.<init>(r0)
            return r4
        L_0x005d:
            java.lang.String r0 = "android.credentials.CreateCredentialException.TYPE_USER_CANCELED"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000b
            java.lang.String r0 = r5.getMessage()
            X.7xC r4 = new X.7xC
            r4.<init>(r0)
            return r4
        L_0x006f:
            boolean r0 = X.C90494aF.A1Z(r3, r1)     // Catch:{ 91P -> 0x0312 }
            if (r0 == 0) goto L_0x030c
            java.lang.String r5 = "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/"
            X.7xq r4 = new X.7xq     // Catch:{ 91P -> 0x0306 }
            r4.<init>()     // Catch:{ 91P -> 0x0306 }
            r1 = 0
            X.7xt r0 = new X.7xt     // Catch:{ 91P -> 0x0306 }
            r0.<init>(r4, r1)     // Catch:{ 91P -> 0x0306 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r5)     // Catch:{ 91P -> 0x0306 }
            java.lang.String r0 = "androidx.credentials.TYPE_ABORT_ERROR"
            boolean r0 = A03(r0, r3, r1)     // Catch:{ 91P -> 0x0306 }
            if (r0 == 0) goto L_0x0098
            X.7xQ r0 = new X.7xQ     // Catch:{ 91P -> 0x0306 }
            r0.<init>()     // Catch:{ 91P -> 0x0306 }
            X.7xt r4 = X.C167457xt.A00(r0, r2)     // Catch:{ 91P -> 0x0306 }
            return r4
        L_0x0098:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r5)     // Catch:{ 91P -> 0x0306 }
            java.lang.String r0 = "androidx.credentials.TYPE_CONSTRAINT_ERROR"
            boolean r0 = A03(r0, r3, r1)     // Catch:{ 91P -> 0x0306 }
            if (r0 == 0) goto L_0x00ae
            X.7xR r0 = new X.7xR     // Catch:{ 91P -> 0x0306 }
            r0.<init>()     // Catch:{ 91P -> 0x0306 }
            X.7xt r4 = X.C167457xt.A00(r0, r2)     // Catch:{ 91P -> 0x0306 }
            return r4
        L_0x00ae:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r5)     // Catch:{ 91P -> 0x0306 }
            java.lang.String r0 = "androidx.credentials.TYPE_DATA_CLONE_ERROR"
            boolean r0 = A03(r0, r3, r1)     // Catch:{ 91P -> 0x0306 }
            if (r0 == 0) goto L_0x00c4
            X.7xS r0 = new X.7xS     // Catch:{ 91P -> 0x0306 }
            r0.<init>()     // Catch:{ 91P -> 0x0306 }
            X.7xt r4 = X.C167457xt.A00(r0, r2)     // Catch:{ 91P -> 0x0306 }
            return r4
        L_0x00c4:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r5)     // Catch:{ 91P -> 0x0306 }
            java.lang.String r0 = "androidx.credentials.TYPE_DATA_ERROR"
            boolean r0 = A03(r0, r3, r1)     // Catch:{ 91P -> 0x0306 }
            if (r0 == 0) goto L_0x00da
            X.7xT r0 = new X.7xT     // Catch:{ 91P -> 0x0306 }
            r0.<init>()     // Catch:{ 91P -> 0x0306 }
            X.7xt r4 = X.C167457xt.A00(r0, r2)     // Catch:{ 91P -> 0x0306 }
            return r4
        L_0x00da:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r5)     // Catch:{ 91P -> 0x0306 }
            java.lang.String r0 = "androidx.credentials.TYPE_ENCODING_ERROR"
            boolean r0 = A03(r0, r3, r1)     // Catch:{ 91P -> 0x0306 }
            if (r0 == 0) goto L_0x00f0
            X.7xU r0 = new X.7xU     // Catch:{ 91P -> 0x0306 }
            r0.<init>()     // Catch:{ 91P -> 0x0306 }
            X.7xt r4 = X.C167457xt.A00(r0, r2)     // Catch:{ 91P -> 0x0306 }
            return r4
        L_0x00f0:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r5)     // Catch:{ 91P -> 0x0306 }
            java.lang.String r0 = "androidx.credentials.TYPE_HIERARCHY_REQUEST_ERROR"
            boolean r0 = A03(r0, r3, r1)     // Catch:{ 91P -> 0x0306 }
            if (r0 == 0) goto L_0x0106
            X.7xV r0 = new X.7xV     // Catch:{ 91P -> 0x0306 }
            r0.<init>()     // Catch:{ 91P -> 0x0306 }
            X.7xt r4 = X.C167457xt.A00(r0, r2)     // Catch:{ 91P -> 0x0306 }
            return r4
        L_0x0106:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r5)     // Catch:{ 91P -> 0x0306 }
            java.lang.String r0 = "androidx.credentials.TYPE_IN_USE_ATTRIBUTE_ERROR"
            boolean r0 = A03(r0, r3, r1)     // Catch:{ 91P -> 0x0306 }
            if (r0 == 0) goto L_0x011c
            X.7xW r0 = new X.7xW     // Catch:{ 91P -> 0x0306 }
            r0.<init>()     // Catch:{ 91P -> 0x0306 }
            X.7xt r4 = X.C167457xt.A00(r0, r2)     // Catch:{ 91P -> 0x0306 }
            return r4
        L_0x011c:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r5)     // Catch:{ 91P -> 0x0306 }
            java.lang.String r0 = "androidx.credentials.TYPE_INVALID_CHARACTER_ERROR"
            boolean r0 = A03(r0, r3, r1)     // Catch:{ 91P -> 0x0306 }
            if (r0 == 0) goto L_0x0132
            X.7xX r0 = new X.7xX     // Catch:{ 91P -> 0x0306 }
            r0.<init>()     // Catch:{ 91P -> 0x0306 }
            X.7xt r4 = X.C167457xt.A00(r0, r2)     // Catch:{ 91P -> 0x0306 }
            return r4
        L_0x0132:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r5)     // Catch:{ 91P -> 0x0306 }
            java.lang.String r0 = "androidx.credentials.TYPE_INVALID_MODIFICATION_ERROR"
            boolean r0 = A03(r0, r3, r1)     // Catch:{ 91P -> 0x0306 }
            if (r0 == 0) goto L_0x0148
            X.7xY r0 = new X.7xY     // Catch:{ 91P -> 0x0306 }
            r0.<init>()     // Catch:{ 91P -> 0x0306 }
            X.7xt r4 = X.C167457xt.A00(r0, r2)     // Catch:{ 91P -> 0x0306 }
            return r4
        L_0x0148:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r5)     // Catch:{ 91P -> 0x0306 }
            java.lang.String r0 = "androidx.credentials.TYPE_INVALID_NODE_TYPE_ERROR"
            boolean r0 = A03(r0, r3, r1)     // Catch:{ 91P -> 0x0306 }
            if (r0 == 0) goto L_0x015e
            X.7xZ r0 = new X.7xZ     // Catch:{ 91P -> 0x0306 }
            r0.<init>()     // Catch:{ 91P -> 0x0306 }
            X.7xt r4 = X.C167457xt.A00(r0, r2)     // Catch:{ 91P -> 0x0306 }
            return r4
        L_0x015e:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r5)     // Catch:{ 91P -> 0x0306 }
            java.lang.String r0 = "androidx.credentials.TYPE_INVALID_STATE_ERROR"
            boolean r0 = A03(r0, r3, r1)     // Catch:{ 91P -> 0x0306 }
            if (r0 == 0) goto L_0x0174
            X.7xa r0 = new X.7xa     // Catch:{ 91P -> 0x0306 }
            r0.<init>()     // Catch:{ 91P -> 0x0306 }
            X.7xt r4 = X.C167457xt.A00(r0, r2)     // Catch:{ 91P -> 0x0306 }
            return r4
        L_0x0174:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r5)     // Catch:{ 91P -> 0x0306 }
            java.lang.String r0 = "androidx.credentials.TYPE_NAMESPACE_ERROR"
            boolean r0 = A03(r0, r3, r1)     // Catch:{ 91P -> 0x0306 }
            if (r0 == 0) goto L_0x018a
            X.7xb r0 = new X.7xb     // Catch:{ 91P -> 0x0306 }
            r0.<init>()     // Catch:{ 91P -> 0x0306 }
            X.7xt r4 = X.C167457xt.A00(r0, r2)     // Catch:{ 91P -> 0x0306 }
            return r4
        L_0x018a:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r5)     // Catch:{ 91P -> 0x0306 }
            java.lang.String r0 = "androidx.credentials.TYPE_NETWORK_ERROR"
            boolean r0 = A03(r0, r3, r1)     // Catch:{ 91P -> 0x0306 }
            if (r0 == 0) goto L_0x01a0
            X.7xc r0 = new X.7xc     // Catch:{ 91P -> 0x0306 }
            r0.<init>()     // Catch:{ 91P -> 0x0306 }
            X.7xt r4 = X.C167457xt.A00(r0, r2)     // Catch:{ 91P -> 0x0306 }
            return r4
        L_0x01a0:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r5)     // Catch:{ 91P -> 0x0306 }
            java.lang.String r0 = "androidx.credentials.TYPE_NO_MODIFICATION_ALLOWED_ERROR"
            boolean r0 = A03(r0, r3, r1)     // Catch:{ 91P -> 0x0306 }
            if (r0 == 0) goto L_0x01b6
            X.7xd r0 = new X.7xd     // Catch:{ 91P -> 0x0306 }
            r0.<init>()     // Catch:{ 91P -> 0x0306 }
            X.7xt r4 = X.C167457xt.A00(r0, r2)     // Catch:{ 91P -> 0x0306 }
            return r4
        L_0x01b6:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r5)     // Catch:{ 91P -> 0x0306 }
            java.lang.String r0 = "androidx.credentials.TYPE_NOT_ALLOWED_ERROR"
            boolean r0 = A03(r0, r3, r1)     // Catch:{ 91P -> 0x0306 }
            if (r0 == 0) goto L_0x01cc
            X.7xe r0 = new X.7xe     // Catch:{ 91P -> 0x0306 }
            r0.<init>()     // Catch:{ 91P -> 0x0306 }
            X.7xt r4 = X.C167457xt.A00(r0, r2)     // Catch:{ 91P -> 0x0306 }
            return r4
        L_0x01cc:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r5)     // Catch:{ 91P -> 0x0306 }
            java.lang.String r0 = "androidx.credentials.TYPE_NOT_FOUND_ERROR"
            boolean r0 = A03(r0, r3, r1)     // Catch:{ 91P -> 0x0306 }
            if (r0 == 0) goto L_0x01e2
            X.7xf r0 = new X.7xf     // Catch:{ 91P -> 0x0306 }
            r0.<init>()     // Catch:{ 91P -> 0x0306 }
            X.7xt r4 = X.C167457xt.A00(r0, r2)     // Catch:{ 91P -> 0x0306 }
            return r4
        L_0x01e2:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r5)     // Catch:{ 91P -> 0x0306 }
            java.lang.String r0 = "androidx.credentials.TYPE_NOT_READABLE_ERROR"
            boolean r0 = A03(r0, r3, r1)     // Catch:{ 91P -> 0x0306 }
            if (r0 == 0) goto L_0x01f8
            X.7xg r0 = new X.7xg     // Catch:{ 91P -> 0x0306 }
            r0.<init>()     // Catch:{ 91P -> 0x0306 }
            X.7xt r4 = X.C167457xt.A00(r0, r2)     // Catch:{ 91P -> 0x0306 }
            return r4
        L_0x01f8:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r5)     // Catch:{ 91P -> 0x0306 }
            java.lang.String r0 = "androidx.credentials.TYPE_NOT_SUPPORTED_ERROR"
            boolean r0 = A03(r0, r3, r1)     // Catch:{ 91P -> 0x0306 }
            if (r0 == 0) goto L_0x020e
            X.7xh r0 = new X.7xh     // Catch:{ 91P -> 0x0306 }
            r0.<init>()     // Catch:{ 91P -> 0x0306 }
            X.7xt r4 = X.C167457xt.A00(r0, r2)     // Catch:{ 91P -> 0x0306 }
            return r4
        L_0x020e:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r5)     // Catch:{ 91P -> 0x0306 }
            java.lang.String r0 = "androidx.credentials.TYPE_OPERATION_ERROR"
            boolean r0 = A03(r0, r3, r1)     // Catch:{ 91P -> 0x0306 }
            if (r0 == 0) goto L_0x0224
            X.7xi r0 = new X.7xi     // Catch:{ 91P -> 0x0306 }
            r0.<init>()     // Catch:{ 91P -> 0x0306 }
            X.7xt r4 = X.C167457xt.A00(r0, r2)     // Catch:{ 91P -> 0x0306 }
            return r4
        L_0x0224:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r5)     // Catch:{ 91P -> 0x0306 }
            java.lang.String r0 = "androidx.credentials.TYPE_OPT_OUT_ERROR"
            boolean r0 = A03(r0, r3, r1)     // Catch:{ 91P -> 0x0306 }
            if (r0 == 0) goto L_0x023a
            X.7xj r0 = new X.7xj     // Catch:{ 91P -> 0x0306 }
            r0.<init>()     // Catch:{ 91P -> 0x0306 }
            X.7xt r4 = X.C167457xt.A00(r0, r2)     // Catch:{ 91P -> 0x0306 }
            return r4
        L_0x023a:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r5)     // Catch:{ 91P -> 0x0306 }
            java.lang.String r0 = "androidx.credentials.TYPE_QUOTA_EXCEEDED_ERROR"
            boolean r0 = A03(r0, r3, r1)     // Catch:{ 91P -> 0x0306 }
            if (r0 == 0) goto L_0x0250
            X.7xk r0 = new X.7xk     // Catch:{ 91P -> 0x0306 }
            r0.<init>()     // Catch:{ 91P -> 0x0306 }
            X.7xt r4 = X.C167457xt.A00(r0, r2)     // Catch:{ 91P -> 0x0306 }
            return r4
        L_0x0250:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r5)     // Catch:{ 91P -> 0x0306 }
            java.lang.String r0 = "androidx.credentials.TYPE_READ_ONLY_ERROR"
            boolean r0 = A03(r0, r3, r1)     // Catch:{ 91P -> 0x0306 }
            if (r0 == 0) goto L_0x0266
            X.7xl r0 = new X.7xl     // Catch:{ 91P -> 0x0306 }
            r0.<init>()     // Catch:{ 91P -> 0x0306 }
            X.7xt r4 = X.C167457xt.A00(r0, r2)     // Catch:{ 91P -> 0x0306 }
            return r4
        L_0x0266:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r5)     // Catch:{ 91P -> 0x0306 }
            java.lang.String r0 = "androidx.credentials.TYPE_SECURITY_ERROR"
            boolean r0 = A03(r0, r3, r1)     // Catch:{ 91P -> 0x0306 }
            if (r0 == 0) goto L_0x027c
            X.7xm r0 = new X.7xm     // Catch:{ 91P -> 0x0306 }
            r0.<init>()     // Catch:{ 91P -> 0x0306 }
            X.7xt r4 = X.C167457xt.A00(r0, r2)     // Catch:{ 91P -> 0x0306 }
            return r4
        L_0x027c:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r5)     // Catch:{ 91P -> 0x0306 }
            java.lang.String r0 = "androidx.credentials.TYPE_SYNTAX_ERROR"
            boolean r0 = A03(r0, r3, r1)     // Catch:{ 91P -> 0x0306 }
            if (r0 == 0) goto L_0x0292
            X.7xn r0 = new X.7xn     // Catch:{ 91P -> 0x0306 }
            r0.<init>()     // Catch:{ 91P -> 0x0306 }
            X.7xt r4 = X.C167457xt.A00(r0, r2)     // Catch:{ 91P -> 0x0306 }
            return r4
        L_0x0292:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r5)     // Catch:{ 91P -> 0x0306 }
            java.lang.String r0 = "androidx.credentials.TYPE_TIMEOUT_ERROR"
            boolean r0 = A03(r0, r3, r1)     // Catch:{ 91P -> 0x0306 }
            if (r0 == 0) goto L_0x02a8
            X.7xo r0 = new X.7xo     // Catch:{ 91P -> 0x0306 }
            r0.<init>()     // Catch:{ 91P -> 0x0306 }
            X.7xt r4 = X.C167457xt.A00(r0, r2)     // Catch:{ 91P -> 0x0306 }
            return r4
        L_0x02a8:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r5)     // Catch:{ 91P -> 0x0306 }
            java.lang.String r0 = "androidx.credentials.TYPE_TRANSACTION_INACTIVE_ERROR"
            boolean r0 = A03(r0, r3, r1)     // Catch:{ 91P -> 0x0306 }
            if (r0 == 0) goto L_0x02be
            X.7xp r0 = new X.7xp     // Catch:{ 91P -> 0x0306 }
            r0.<init>()     // Catch:{ 91P -> 0x0306 }
            X.7xt r4 = X.C167457xt.A00(r0, r2)     // Catch:{ 91P -> 0x0306 }
            return r4
        L_0x02be:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r5)     // Catch:{ 91P -> 0x0306 }
            java.lang.String r0 = "androidx.credentials.TYPE_UNKNOWN_ERROR"
            boolean r0 = A03(r0, r3, r1)     // Catch:{ 91P -> 0x0306 }
            if (r0 == 0) goto L_0x02d4
            X.7xq r0 = new X.7xq     // Catch:{ 91P -> 0x0306 }
            r0.<init>()     // Catch:{ 91P -> 0x0306 }
            X.7xt r4 = X.C167457xt.A00(r0, r2)     // Catch:{ 91P -> 0x0306 }
            return r4
        L_0x02d4:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r5)     // Catch:{ 91P -> 0x0306 }
            java.lang.String r0 = "androidx.credentials.TYPE_VERSION_ERROR"
            boolean r0 = A03(r0, r3, r1)     // Catch:{ 91P -> 0x0306 }
            if (r0 == 0) goto L_0x02ea
            X.7xr r0 = new X.7xr     // Catch:{ 91P -> 0x0306 }
            r0.<init>()     // Catch:{ 91P -> 0x0306 }
            X.7xt r4 = X.C167457xt.A00(r0, r2)     // Catch:{ 91P -> 0x0306 }
            return r4
        L_0x02ea:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r5)     // Catch:{ 91P -> 0x0306 }
            java.lang.String r0 = "androidx.credentials.TYPE_WRONG_DOCUMENT_ERROR"
            boolean r0 = A03(r0, r3, r1)     // Catch:{ 91P -> 0x0306 }
            if (r0 == 0) goto L_0x0300
            X.7xs r0 = new X.7xs     // Catch:{ 91P -> 0x0306 }
            r0.<init>()     // Catch:{ 91P -> 0x0306 }
            X.7xt r4 = X.C167457xt.A00(r0, r2)     // Catch:{ 91P -> 0x0306 }
            return r4
        L_0x0300:
            X.91P r0 = new X.91P     // Catch:{ 91P -> 0x0306 }
            r0.<init>()     // Catch:{ 91P -> 0x0306 }
            throw r0     // Catch:{ 91P -> 0x0306 }
        L_0x0306:
            X.7xA r4 = new X.7xA     // Catch:{ 91P -> 0x0312 }
            r4.<init>(r3, r2)     // Catch:{ 91P -> 0x0312 }
            return r4
        L_0x030c:
            X.91P r0 = new X.91P     // Catch:{ 91P -> 0x0312 }
            r0.<init>()     // Catch:{ 91P -> 0x0312 }
            throw r0     // Catch:{ 91P -> 0x0312 }
        L_0x0312:
            X.7xA r4 = new X.7xA
            r4.<init>(r3, r2)
            return r4
        L_0x0318:
            java.lang.String r1 = r5.getType()
            X.AnonymousClass00C.A08(r1)
            java.lang.String r0 = r5.getMessage()
            X.7xA r4 = new X.7xA
            r4.<init>(r1, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C207779wy.A01(android.credentials.CreateCredentialException):X.91l");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:145|146|147) */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0329, code lost:
        return new X.C167087xI(r3, r2);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:145:0x0324 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C1889691m A02(android.credentials.GetCredentialException r5) {
        /*
            java.lang.String r1 = r5.getType()
            int r0 = r1.hashCode()
            switch(r0) {
                case -781118336: goto L_0x005d;
                case -45448328: goto L_0x004b;
                case 580557411: goto L_0x0039;
                case 627896683: goto L_0x0027;
                default: goto L_0x000b;
            }
        L_0x000b:
            java.lang.String r2 = r5.getType()
            X.AnonymousClass00C.A08(r2)
            java.lang.String r1 = "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION"
            r0 = 0
            boolean r0 = X.AnonymousClass098.A07(r2, r1, r0)
            if (r0 == 0) goto L_0x0336
            java.lang.String r3 = r5.getType()
            X.AnonymousClass00C.A08(r3)
            java.lang.String r2 = r5.getMessage()
            goto L_0x006f
        L_0x0027:
            java.lang.String r0 = "android.credentials.GetCredentialException.TYPE_NO_CREDENTIAL"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000b
            java.lang.String r0 = r5.getMessage()
            X.7xP r4 = new X.7xP
            r4.<init>(r0)
            return r4
        L_0x0039:
            java.lang.String r0 = "android.credentials.GetCredentialException.TYPE_USER_CANCELED"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000b
            java.lang.String r0 = r5.getMessage()
            X.7xK r4 = new X.7xK
            r4.<init>(r0)
            return r4
        L_0x004b:
            java.lang.String r0 = "android.credentials.GetCredentialException.TYPE_INTERRUPTED"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000b
            java.lang.String r0 = r5.getMessage()
            X.7xL r4 = new X.7xL
            r4.<init>(r0)
            return r4
        L_0x005d:
            java.lang.String r0 = "android.credentials.GetCredentialException.TYPE_UNKNOWN"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000b
            java.lang.String r0 = r5.getMessage()
            X.7xN r4 = new X.7xN
            r4.<init>(r0)
            return r4
        L_0x006f:
            r0 = 0
            boolean r0 = X.AnonymousClass098.A07(r3, r1, r0)     // Catch:{ 91P -> 0x0330 }
            if (r0 == 0) goto L_0x032a
            java.lang.String r5 = "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/"
            X.7xq r4 = new X.7xq     // Catch:{ 91P -> 0x0324 }
            r4.<init>()     // Catch:{ 91P -> 0x0324 }
            r1 = 0
            X.7xu r0 = new X.7xu     // Catch:{ 91P -> 0x0324 }
            r0.<init>(r4, r1)     // Catch:{ 91P -> 0x0324 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r5)     // Catch:{ 91P -> 0x0324 }
            java.lang.String r0 = "androidx.credentials.TYPE_ABORT_ERROR"
            boolean r0 = A03(r0, r3, r1)     // Catch:{ 91P -> 0x0324 }
            if (r0 == 0) goto L_0x009a
            X.7xQ r0 = new X.7xQ     // Catch:{ 91P -> 0x0324 }
            r0.<init>()     // Catch:{ 91P -> 0x0324 }
            X.7xu r4 = new X.7xu     // Catch:{ 91P -> 0x0324 }
            r4.<init>(r0, r2)     // Catch:{ 91P -> 0x0324 }
            return r4
        L_0x009a:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r5)     // Catch:{ 91P -> 0x0324 }
            java.lang.String r0 = "androidx.credentials.TYPE_CONSTRAINT_ERROR"
            boolean r0 = A03(r0, r3, r1)     // Catch:{ 91P -> 0x0324 }
            if (r0 == 0) goto L_0x00b1
            X.7xR r0 = new X.7xR     // Catch:{ 91P -> 0x0324 }
            r0.<init>()     // Catch:{ 91P -> 0x0324 }
            X.7xu r4 = new X.7xu     // Catch:{ 91P -> 0x0324 }
            r4.<init>(r0, r2)     // Catch:{ 91P -> 0x0324 }
            return r4
        L_0x00b1:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r5)     // Catch:{ 91P -> 0x0324 }
            java.lang.String r0 = "androidx.credentials.TYPE_DATA_CLONE_ERROR"
            boolean r0 = A03(r0, r3, r1)     // Catch:{ 91P -> 0x0324 }
            if (r0 == 0) goto L_0x00c8
            X.7xS r0 = new X.7xS     // Catch:{ 91P -> 0x0324 }
            r0.<init>()     // Catch:{ 91P -> 0x0324 }
            X.7xu r4 = new X.7xu     // Catch:{ 91P -> 0x0324 }
            r4.<init>(r0, r2)     // Catch:{ 91P -> 0x0324 }
            return r4
        L_0x00c8:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r5)     // Catch:{ 91P -> 0x0324 }
            java.lang.String r0 = "androidx.credentials.TYPE_DATA_ERROR"
            boolean r0 = A03(r0, r3, r1)     // Catch:{ 91P -> 0x0324 }
            if (r0 == 0) goto L_0x00df
            X.7xT r0 = new X.7xT     // Catch:{ 91P -> 0x0324 }
            r0.<init>()     // Catch:{ 91P -> 0x0324 }
            X.7xu r4 = new X.7xu     // Catch:{ 91P -> 0x0324 }
            r4.<init>(r0, r2)     // Catch:{ 91P -> 0x0324 }
            return r4
        L_0x00df:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r5)     // Catch:{ 91P -> 0x0324 }
            java.lang.String r0 = "androidx.credentials.TYPE_ENCODING_ERROR"
            boolean r0 = A03(r0, r3, r1)     // Catch:{ 91P -> 0x0324 }
            if (r0 == 0) goto L_0x00f6
            X.7xU r0 = new X.7xU     // Catch:{ 91P -> 0x0324 }
            r0.<init>()     // Catch:{ 91P -> 0x0324 }
            X.7xu r4 = new X.7xu     // Catch:{ 91P -> 0x0324 }
            r4.<init>(r0, r2)     // Catch:{ 91P -> 0x0324 }
            return r4
        L_0x00f6:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r5)     // Catch:{ 91P -> 0x0324 }
            java.lang.String r0 = "androidx.credentials.TYPE_HIERARCHY_REQUEST_ERROR"
            boolean r0 = A03(r0, r3, r1)     // Catch:{ 91P -> 0x0324 }
            if (r0 == 0) goto L_0x010d
            X.7xV r0 = new X.7xV     // Catch:{ 91P -> 0x0324 }
            r0.<init>()     // Catch:{ 91P -> 0x0324 }
            X.7xu r4 = new X.7xu     // Catch:{ 91P -> 0x0324 }
            r4.<init>(r0, r2)     // Catch:{ 91P -> 0x0324 }
            return r4
        L_0x010d:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r5)     // Catch:{ 91P -> 0x0324 }
            java.lang.String r0 = "androidx.credentials.TYPE_IN_USE_ATTRIBUTE_ERROR"
            boolean r0 = A03(r0, r3, r1)     // Catch:{ 91P -> 0x0324 }
            if (r0 == 0) goto L_0x0124
            X.7xW r0 = new X.7xW     // Catch:{ 91P -> 0x0324 }
            r0.<init>()     // Catch:{ 91P -> 0x0324 }
            X.7xu r4 = new X.7xu     // Catch:{ 91P -> 0x0324 }
            r4.<init>(r0, r2)     // Catch:{ 91P -> 0x0324 }
            return r4
        L_0x0124:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r5)     // Catch:{ 91P -> 0x0324 }
            java.lang.String r0 = "androidx.credentials.TYPE_INVALID_CHARACTER_ERROR"
            boolean r0 = A03(r0, r3, r1)     // Catch:{ 91P -> 0x0324 }
            if (r0 == 0) goto L_0x013b
            X.7xX r0 = new X.7xX     // Catch:{ 91P -> 0x0324 }
            r0.<init>()     // Catch:{ 91P -> 0x0324 }
            X.7xu r4 = new X.7xu     // Catch:{ 91P -> 0x0324 }
            r4.<init>(r0, r2)     // Catch:{ 91P -> 0x0324 }
            return r4
        L_0x013b:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r5)     // Catch:{ 91P -> 0x0324 }
            java.lang.String r0 = "androidx.credentials.TYPE_INVALID_MODIFICATION_ERROR"
            boolean r0 = A03(r0, r3, r1)     // Catch:{ 91P -> 0x0324 }
            if (r0 == 0) goto L_0x0152
            X.7xY r0 = new X.7xY     // Catch:{ 91P -> 0x0324 }
            r0.<init>()     // Catch:{ 91P -> 0x0324 }
            X.7xu r4 = new X.7xu     // Catch:{ 91P -> 0x0324 }
            r4.<init>(r0, r2)     // Catch:{ 91P -> 0x0324 }
            return r4
        L_0x0152:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r5)     // Catch:{ 91P -> 0x0324 }
            java.lang.String r0 = "androidx.credentials.TYPE_INVALID_NODE_TYPE_ERROR"
            boolean r0 = A03(r0, r3, r1)     // Catch:{ 91P -> 0x0324 }
            if (r0 == 0) goto L_0x0169
            X.7xZ r0 = new X.7xZ     // Catch:{ 91P -> 0x0324 }
            r0.<init>()     // Catch:{ 91P -> 0x0324 }
            X.7xu r4 = new X.7xu     // Catch:{ 91P -> 0x0324 }
            r4.<init>(r0, r2)     // Catch:{ 91P -> 0x0324 }
            return r4
        L_0x0169:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r5)     // Catch:{ 91P -> 0x0324 }
            java.lang.String r0 = "androidx.credentials.TYPE_INVALID_STATE_ERROR"
            boolean r0 = A03(r0, r3, r1)     // Catch:{ 91P -> 0x0324 }
            if (r0 == 0) goto L_0x0180
            X.7xa r0 = new X.7xa     // Catch:{ 91P -> 0x0324 }
            r0.<init>()     // Catch:{ 91P -> 0x0324 }
            X.7xu r4 = new X.7xu     // Catch:{ 91P -> 0x0324 }
            r4.<init>(r0, r2)     // Catch:{ 91P -> 0x0324 }
            return r4
        L_0x0180:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r5)     // Catch:{ 91P -> 0x0324 }
            java.lang.String r0 = "androidx.credentials.TYPE_NAMESPACE_ERROR"
            boolean r0 = A03(r0, r3, r1)     // Catch:{ 91P -> 0x0324 }
            if (r0 == 0) goto L_0x0197
            X.7xb r0 = new X.7xb     // Catch:{ 91P -> 0x0324 }
            r0.<init>()     // Catch:{ 91P -> 0x0324 }
            X.7xu r4 = new X.7xu     // Catch:{ 91P -> 0x0324 }
            r4.<init>(r0, r2)     // Catch:{ 91P -> 0x0324 }
            return r4
        L_0x0197:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r5)     // Catch:{ 91P -> 0x0324 }
            java.lang.String r0 = "androidx.credentials.TYPE_NETWORK_ERROR"
            boolean r0 = A03(r0, r3, r1)     // Catch:{ 91P -> 0x0324 }
            if (r0 == 0) goto L_0x01ae
            X.7xc r0 = new X.7xc     // Catch:{ 91P -> 0x0324 }
            r0.<init>()     // Catch:{ 91P -> 0x0324 }
            X.7xu r4 = new X.7xu     // Catch:{ 91P -> 0x0324 }
            r4.<init>(r0, r2)     // Catch:{ 91P -> 0x0324 }
            return r4
        L_0x01ae:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r5)     // Catch:{ 91P -> 0x0324 }
            java.lang.String r0 = "androidx.credentials.TYPE_NO_MODIFICATION_ALLOWED_ERROR"
            boolean r0 = A03(r0, r3, r1)     // Catch:{ 91P -> 0x0324 }
            if (r0 == 0) goto L_0x01c5
            X.7xd r0 = new X.7xd     // Catch:{ 91P -> 0x0324 }
            r0.<init>()     // Catch:{ 91P -> 0x0324 }
            X.7xu r4 = new X.7xu     // Catch:{ 91P -> 0x0324 }
            r4.<init>(r0, r2)     // Catch:{ 91P -> 0x0324 }
            return r4
        L_0x01c5:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r5)     // Catch:{ 91P -> 0x0324 }
            java.lang.String r0 = "androidx.credentials.TYPE_NOT_ALLOWED_ERROR"
            boolean r0 = A03(r0, r3, r1)     // Catch:{ 91P -> 0x0324 }
            if (r0 == 0) goto L_0x01dc
            X.7xe r0 = new X.7xe     // Catch:{ 91P -> 0x0324 }
            r0.<init>()     // Catch:{ 91P -> 0x0324 }
            X.7xu r4 = new X.7xu     // Catch:{ 91P -> 0x0324 }
            r4.<init>(r0, r2)     // Catch:{ 91P -> 0x0324 }
            return r4
        L_0x01dc:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r5)     // Catch:{ 91P -> 0x0324 }
            java.lang.String r0 = "androidx.credentials.TYPE_NOT_FOUND_ERROR"
            boolean r0 = A03(r0, r3, r1)     // Catch:{ 91P -> 0x0324 }
            if (r0 == 0) goto L_0x01f3
            X.7xf r0 = new X.7xf     // Catch:{ 91P -> 0x0324 }
            r0.<init>()     // Catch:{ 91P -> 0x0324 }
            X.7xu r4 = new X.7xu     // Catch:{ 91P -> 0x0324 }
            r4.<init>(r0, r2)     // Catch:{ 91P -> 0x0324 }
            return r4
        L_0x01f3:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r5)     // Catch:{ 91P -> 0x0324 }
            java.lang.String r0 = "androidx.credentials.TYPE_NOT_READABLE_ERROR"
            boolean r0 = A03(r0, r3, r1)     // Catch:{ 91P -> 0x0324 }
            if (r0 == 0) goto L_0x020a
            X.7xg r0 = new X.7xg     // Catch:{ 91P -> 0x0324 }
            r0.<init>()     // Catch:{ 91P -> 0x0324 }
            X.7xu r4 = new X.7xu     // Catch:{ 91P -> 0x0324 }
            r4.<init>(r0, r2)     // Catch:{ 91P -> 0x0324 }
            return r4
        L_0x020a:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r5)     // Catch:{ 91P -> 0x0324 }
            java.lang.String r0 = "androidx.credentials.TYPE_NOT_SUPPORTED_ERROR"
            boolean r0 = A03(r0, r3, r1)     // Catch:{ 91P -> 0x0324 }
            if (r0 == 0) goto L_0x0221
            X.7xh r0 = new X.7xh     // Catch:{ 91P -> 0x0324 }
            r0.<init>()     // Catch:{ 91P -> 0x0324 }
            X.7xu r4 = new X.7xu     // Catch:{ 91P -> 0x0324 }
            r4.<init>(r0, r2)     // Catch:{ 91P -> 0x0324 }
            return r4
        L_0x0221:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r5)     // Catch:{ 91P -> 0x0324 }
            java.lang.String r0 = "androidx.credentials.TYPE_OPERATION_ERROR"
            boolean r0 = A03(r0, r3, r1)     // Catch:{ 91P -> 0x0324 }
            if (r0 == 0) goto L_0x0238
            X.7xi r0 = new X.7xi     // Catch:{ 91P -> 0x0324 }
            r0.<init>()     // Catch:{ 91P -> 0x0324 }
            X.7xu r4 = new X.7xu     // Catch:{ 91P -> 0x0324 }
            r4.<init>(r0, r2)     // Catch:{ 91P -> 0x0324 }
            return r4
        L_0x0238:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r5)     // Catch:{ 91P -> 0x0324 }
            java.lang.String r0 = "androidx.credentials.TYPE_OPT_OUT_ERROR"
            boolean r0 = A03(r0, r3, r1)     // Catch:{ 91P -> 0x0324 }
            if (r0 == 0) goto L_0x024f
            X.7xj r0 = new X.7xj     // Catch:{ 91P -> 0x0324 }
            r0.<init>()     // Catch:{ 91P -> 0x0324 }
            X.7xu r4 = new X.7xu     // Catch:{ 91P -> 0x0324 }
            r4.<init>(r0, r2)     // Catch:{ 91P -> 0x0324 }
            return r4
        L_0x024f:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r5)     // Catch:{ 91P -> 0x0324 }
            java.lang.String r0 = "androidx.credentials.TYPE_QUOTA_EXCEEDED_ERROR"
            boolean r0 = A03(r0, r3, r1)     // Catch:{ 91P -> 0x0324 }
            if (r0 == 0) goto L_0x0266
            X.7xk r0 = new X.7xk     // Catch:{ 91P -> 0x0324 }
            r0.<init>()     // Catch:{ 91P -> 0x0324 }
            X.7xu r4 = new X.7xu     // Catch:{ 91P -> 0x0324 }
            r4.<init>(r0, r2)     // Catch:{ 91P -> 0x0324 }
            return r4
        L_0x0266:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r5)     // Catch:{ 91P -> 0x0324 }
            java.lang.String r0 = "androidx.credentials.TYPE_READ_ONLY_ERROR"
            boolean r0 = A03(r0, r3, r1)     // Catch:{ 91P -> 0x0324 }
            if (r0 == 0) goto L_0x027d
            X.7xl r0 = new X.7xl     // Catch:{ 91P -> 0x0324 }
            r0.<init>()     // Catch:{ 91P -> 0x0324 }
            X.7xu r4 = new X.7xu     // Catch:{ 91P -> 0x0324 }
            r4.<init>(r0, r2)     // Catch:{ 91P -> 0x0324 }
            return r4
        L_0x027d:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r5)     // Catch:{ 91P -> 0x0324 }
            java.lang.String r0 = "androidx.credentials.TYPE_SECURITY_ERROR"
            boolean r0 = A03(r0, r3, r1)     // Catch:{ 91P -> 0x0324 }
            if (r0 == 0) goto L_0x0294
            X.7xm r0 = new X.7xm     // Catch:{ 91P -> 0x0324 }
            r0.<init>()     // Catch:{ 91P -> 0x0324 }
            X.7xu r4 = new X.7xu     // Catch:{ 91P -> 0x0324 }
            r4.<init>(r0, r2)     // Catch:{ 91P -> 0x0324 }
            return r4
        L_0x0294:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r5)     // Catch:{ 91P -> 0x0324 }
            java.lang.String r0 = "androidx.credentials.TYPE_SYNTAX_ERROR"
            boolean r0 = A03(r0, r3, r1)     // Catch:{ 91P -> 0x0324 }
            if (r0 == 0) goto L_0x02ab
            X.7xn r0 = new X.7xn     // Catch:{ 91P -> 0x0324 }
            r0.<init>()     // Catch:{ 91P -> 0x0324 }
            X.7xu r4 = new X.7xu     // Catch:{ 91P -> 0x0324 }
            r4.<init>(r0, r2)     // Catch:{ 91P -> 0x0324 }
            return r4
        L_0x02ab:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r5)     // Catch:{ 91P -> 0x0324 }
            java.lang.String r0 = "androidx.credentials.TYPE_TIMEOUT_ERROR"
            boolean r0 = A03(r0, r3, r1)     // Catch:{ 91P -> 0x0324 }
            if (r0 == 0) goto L_0x02c2
            X.7xo r0 = new X.7xo     // Catch:{ 91P -> 0x0324 }
            r0.<init>()     // Catch:{ 91P -> 0x0324 }
            X.7xu r4 = new X.7xu     // Catch:{ 91P -> 0x0324 }
            r4.<init>(r0, r2)     // Catch:{ 91P -> 0x0324 }
            return r4
        L_0x02c2:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r5)     // Catch:{ 91P -> 0x0324 }
            java.lang.String r0 = "androidx.credentials.TYPE_TRANSACTION_INACTIVE_ERROR"
            boolean r0 = A03(r0, r3, r1)     // Catch:{ 91P -> 0x0324 }
            if (r0 == 0) goto L_0x02d9
            X.7xp r0 = new X.7xp     // Catch:{ 91P -> 0x0324 }
            r0.<init>()     // Catch:{ 91P -> 0x0324 }
            X.7xu r4 = new X.7xu     // Catch:{ 91P -> 0x0324 }
            r4.<init>(r0, r2)     // Catch:{ 91P -> 0x0324 }
            return r4
        L_0x02d9:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r5)     // Catch:{ 91P -> 0x0324 }
            java.lang.String r0 = "androidx.credentials.TYPE_UNKNOWN_ERROR"
            boolean r0 = A03(r0, r3, r1)     // Catch:{ 91P -> 0x0324 }
            if (r0 == 0) goto L_0x02f0
            X.7xq r0 = new X.7xq     // Catch:{ 91P -> 0x0324 }
            r0.<init>()     // Catch:{ 91P -> 0x0324 }
            X.7xu r4 = new X.7xu     // Catch:{ 91P -> 0x0324 }
            r4.<init>(r0, r2)     // Catch:{ 91P -> 0x0324 }
            return r4
        L_0x02f0:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r5)     // Catch:{ 91P -> 0x0324 }
            java.lang.String r0 = "androidx.credentials.TYPE_VERSION_ERROR"
            boolean r0 = A03(r0, r3, r1)     // Catch:{ 91P -> 0x0324 }
            if (r0 == 0) goto L_0x0307
            X.7xr r0 = new X.7xr     // Catch:{ 91P -> 0x0324 }
            r0.<init>()     // Catch:{ 91P -> 0x0324 }
            X.7xu r4 = new X.7xu     // Catch:{ 91P -> 0x0324 }
            r4.<init>(r0, r2)     // Catch:{ 91P -> 0x0324 }
            return r4
        L_0x0307:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r5)     // Catch:{ 91P -> 0x0324 }
            java.lang.String r0 = "androidx.credentials.TYPE_WRONG_DOCUMENT_ERROR"
            boolean r0 = A03(r0, r3, r1)     // Catch:{ 91P -> 0x0324 }
            if (r0 == 0) goto L_0x031e
            X.7xs r0 = new X.7xs     // Catch:{ 91P -> 0x0324 }
            r0.<init>()     // Catch:{ 91P -> 0x0324 }
            X.7xu r4 = new X.7xu     // Catch:{ 91P -> 0x0324 }
            r4.<init>(r0, r2)     // Catch:{ 91P -> 0x0324 }
            return r4
        L_0x031e:
            X.91P r0 = new X.91P     // Catch:{ 91P -> 0x0324 }
            r0.<init>()     // Catch:{ 91P -> 0x0324 }
            throw r0     // Catch:{ 91P -> 0x0324 }
        L_0x0324:
            X.7xI r4 = new X.7xI     // Catch:{ 91P -> 0x0330 }
            r4.<init>(r3, r2)     // Catch:{ 91P -> 0x0330 }
            return r4
        L_0x032a:
            X.91P r0 = new X.91P     // Catch:{ 91P -> 0x0330 }
            r0.<init>()     // Catch:{ 91P -> 0x0330 }
            throw r0     // Catch:{ 91P -> 0x0330 }
        L_0x0330:
            X.7xI r4 = new X.7xI
            r4.<init>(r3, r2)
            return r4
        L_0x0336:
            java.lang.String r1 = r5.getType()
            X.AnonymousClass00C.A08(r1)
            java.lang.String r0 = r5.getMessage()
            X.7xI r4 = new X.7xI
            r4.<init>(r1, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C207779wy.A02(android.credentials.GetCredentialException):X.91m");
    }

    public static boolean A03(String str, String str2, StringBuilder sb) {
        sb.append(str);
        return str2.equals(sb.toString());
    }
}
