package com.google.android.play.core.integrity;

import X.C165957uR;
import X.C199269f2;
import X.C201499ji;
import X.C36441kJ;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;

public final class as extends C165957uR implements IInterface {
    public final TaskCompletionSource a;
    public final C201499ji b;
    public final C199269f2 c;
    public final String d;
    public final k e;
    public final Activity f;

    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 2) {
            return false;
        }
        b(C165957uR.A00(parcel));
        return true;
    }

    public final void b(Bundle bundle) {
        this.b.A02(this.a);
        this.c.A02("onRequestDialog(%s)", this.d);
        ApiException a2 = this.e.a(bundle);
        if (a2 != null) {
            this.a.trySetException(a2);
            return;
        }
        Parcelable parcelable = bundle.getParcelable("dialog.intent");
        if (parcelable == null) {
            C199269f2 r4 = this.c;
            Object[] objArr = {this.d};
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", C199269f2.A00(r4.A00, "onRequestDialog(%s): got null dialog intent", objArr));
            }
            this.a.trySetResult(0);
            return;
        }
        Intent A0H = C36441kJ.A0H(this.f, PlayCoreDialogWrapperActivity.class);
        A0H.putExtra("confirmation_intent", parcelable);
        A0H.setFlags(536870912);
        A0H.putExtra("result_receiver", new ar(this, this.b.A01()));
        C199269f2 r42 = this.c;
        Object[] objArr2 = new Object[0];
        if (Log.isLoggable("PlayCore", 3)) {
            Log.d("PlayCore", C199269f2.A00(r42.A00, "Starting dialog intent...", objArr2));
        }
        this.f.startActivityForResult(A0H, 0);
    }

    public as(Context context, k kVar, Activity activity, TaskCompletionSource taskCompletionSource, C201499ji r7) {
        this();
        this.c = new C199269f2("RequestDialogCallbackImpl");
        this.d = context.getPackageName();
        this.e = kVar;
        this.a = taskCompletionSource;
        this.f = activity;
        this.b = r7;
    }

    public as() {
        super("com.google.android.play.core.integrity.protocol.IRequestDialogCallback");
    }
}
