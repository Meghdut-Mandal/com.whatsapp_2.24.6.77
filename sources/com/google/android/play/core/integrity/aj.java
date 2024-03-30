package com.google.android.play.core.integrity;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass8FK;
import X.C196649aH;
import X.C199269f2;
import X.C201499ji;
import X.C90474aD;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;

public final class aj {
    public final C201499ji a;
    public final C199269f2 b;
    public final String c;
    public final at d;
    public final k e;

    public final Task b(Activity activity, Bundle bundle) {
        if (this.a == null) {
            return Tasks.forException(new IntegrityServiceException(-2, (Throwable) null));
        }
        int i = bundle.getInt("dialog.intent.type");
        C199269f2 r2 = this.b;
        Object[] A1a = C90474aD.A1a(this.c);
        AnonymousClass000.A1L(A1a, i, 1);
        r2.A02("requestAndShowDialog(%s, %s)", A1a);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.a.A03(taskCompletionSource, new ag(this, taskCompletionSource, bundle, activity, taskCompletionSource, i));
        return taskCompletionSource.zza;
    }

    public final Task c(IntegrityTokenRequest integrityTokenRequest) {
        if (this.a == null) {
            return Tasks.forException(new IntegrityServiceException(-2, (Throwable) null));
        }
        IntegrityTokenRequest integrityTokenRequest2 = integrityTokenRequest;
        try {
            ao aoVar = (ao) integrityTokenRequest2;
            byte[] decode = Base64.decode(aoVar.a, 10);
            Long l = aoVar.b;
            this.b.A02("requestIntegrityToken(%s)", AnonymousClass000.A1b(integrityTokenRequest));
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            this.a.A03(taskCompletionSource, new af(this, taskCompletionSource, decode, l, (Parcelable) null, taskCompletionSource, integrityTokenRequest2));
            return taskCompletionSource.zza;
        } catch (IllegalArgumentException e2) {
            return Tasks.forException(new IntegrityServiceException(-13, e2));
        }
    }

    public aj(Context context, C199269f2 r11, at atVar, k kVar) {
        C201499ji r3;
        Context context2 = context;
        this.c = context.getPackageName();
        C199269f2 r6 = r11;
        this.b = r11;
        this.d = atVar;
        this.e = kVar;
        try {
            if (context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled && C196649aH.A00(context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures)) {
                r3 = new C201499ji(context2, ak.a, r6, ae.a, "IntegrityService");
                this.a = r3;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        Object[] objArr = new Object[0];
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", C199269f2.A00(r11.A00, "Phonesky is not installed.", objArr));
        }
        r3 = null;
        this.a = r3;
    }

    public static /* bridge */ /* synthetic */ Bundle a(aj ajVar, byte[] bArr, Long l, Parcelable parcelable) {
        Bundle A07 = AnonymousClass001.A07();
        A07.putString("package.name", ajVar.c);
        A07.putByteArray("nonce", bArr);
        A07.putInt("playcore.integrity.version.major", 1);
        A07.putInt("playcore.integrity.version.minor", 3);
        A07.putInt("playcore.integrity.version.patch", 0);
        if (l != null) {
            A07.putLong("cloud.prj", l.longValue());
        }
        AnonymousClass8FK.A00(A07, AnonymousClass001.A0I(), 3);
        return A07;
    }
}
