package com.google.android.gms.tasks;

public final class zza implements OnSuccessListener {
    public final /* synthetic */ OnTokenCanceledListener zza;

    public zza(zzb zzb, OnTokenCanceledListener onTokenCanceledListener) {
        this.zza = onTokenCanceledListener;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        this.zza.onCanceled();
    }
}
