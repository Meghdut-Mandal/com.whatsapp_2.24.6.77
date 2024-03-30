package com.google.android.play.core.integrity;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass8FK;
import X.C199269f2;
import X.C201499ji;
import X.C90474aD;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class bn {
    public final C201499ji a;
    public final C199269f2 b;
    public final String c;
    public final TaskCompletionSource d;
    public final at e;
    public final k f;

    public static /* bridge */ /* synthetic */ boolean k(bn bnVar) {
        if (!bnVar.d.zza.isSuccessful() || AnonymousClass000.A0I(bnVar.d.zza.getResult()) != 0) {
            return false;
        }
        return true;
    }

    public final Task c(Activity activity, Bundle bundle) {
        int i = bundle.getInt("dialog.intent.type");
        Object[] A0L = AnonymousClass001.A0L();
        AnonymousClass000.A1J(A0L, i);
        this.b.A02("requestAndShowDialog(%s)", A0L);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.a.A03(taskCompletionSource, new bh(this, taskCompletionSource, bundle, activity, taskCompletionSource, i));
        return taskCompletionSource.zza;
    }

    public bn(Context context, C199269f2 r11, at atVar, k kVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.d = taskCompletionSource;
        this.c = context.getPackageName();
        this.b = r11;
        this.e = atVar;
        this.f = kVar;
        C201499ji r3 = new C201499ji(context, bo.a, r11, bd.a, "ExpressIntegrityService");
        this.a = r3;
        r3.A01().post(new be(this, taskCompletionSource, context));
    }

    public static /* bridge */ /* synthetic */ Bundle a(bn bnVar, String str, long j, long j2, int i) {
        Bundle A07 = AnonymousClass001.A07();
        A07.putString("package.name", bnVar.c);
        A07.putLong("cloud.prj", j);
        A07.putString("nonce", str);
        A07.putLong("warm.up.sid", j2);
        A07.putInt("playcore.integrity.version.major", 1);
        A07.putInt("playcore.integrity.version.minor", 3);
        A07.putInt("playcore.integrity.version.patch", 0);
        A07.putInt("webview.request.mode", 0);
        AnonymousClass8FK.A00(A07, AnonymousClass001.A0I(), 5);
        return A07;
    }

    public static /* bridge */ /* synthetic */ Bundle b(bn bnVar, long j, int i) {
        Bundle A07 = AnonymousClass001.A07();
        A07.putString("package.name", bnVar.c);
        A07.putLong("cloud.prj", j);
        A07.putInt("playcore.integrity.version.major", 1);
        A07.putInt("playcore.integrity.version.minor", 3);
        A07.putInt("playcore.integrity.version.patch", 0);
        A07.putInt("webview.request.mode", 0);
        AnonymousClass8FK.A00(A07, AnonymousClass001.A0I(), 4);
        return A07;
    }

    public final Task d(String str, long j, long j2, int i) {
        Object[] A0L = AnonymousClass001.A0L();
        long j3 = j2;
        C90474aD.A1S(A0L, j3);
        this.b.A02("requestExpressIntegrityToken(%s)", A0L);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.a.A03(taskCompletionSource, new bg(this, taskCompletionSource, 0, str, j, j3, taskCompletionSource));
        return taskCompletionSource.zza;
    }

    public final Task e(long j, int i) {
        Object[] A0L = AnonymousClass001.A0L();
        C90474aD.A1S(A0L, j);
        this.b.A02("warmUpIntegrityToken(%s)", A0L);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.a.A03(taskCompletionSource, new bf(this, taskCompletionSource, 0, j, taskCompletionSource));
        return taskCompletionSource.zza;
    }
}
