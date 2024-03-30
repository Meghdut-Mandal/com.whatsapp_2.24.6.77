package com.google.android.gms.tasks;

import X.AnonymousClass006;
import android.app.Activity;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

public final class zzw extends Task {
    public final Object zza = new Object();
    public final zzr zzb = new zzr();
    public boolean zzc;
    public volatile boolean zzd;
    public Object zze;
    public Exception zzf;

    public final boolean isCanceled() {
        return this.zzd;
    }

    private final void zzf() {
        AnonymousClass006.A08(this.zzc, "Task is not yet complete");
    }

    private final void zzg() {
        if (this.zzd) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    private final void zzh() {
        if (this.zzc) {
            throw DuplicateTaskCompletionException.of(this);
        }
    }

    private final void zzi() {
        synchronized (this.zza) {
            if (this.zzc) {
                this.zzb.zzb(this);
            }
        }
    }

    public final Task addOnCanceledListener(Activity activity, OnCanceledListener onCanceledListener) {
        zzh zzh = new zzh(TaskExecutors.MAIN_THREAD, onCanceledListener);
        this.zzb.zza(zzh);
        zzv.zza(activity).zzb(zzh);
        zzi();
        return this;
    }

    public final Task addOnCompleteListener(Activity activity, OnCompleteListener onCompleteListener) {
        zzj zzj = new zzj(TaskExecutors.MAIN_THREAD, onCompleteListener);
        this.zzb.zza(zzj);
        zzv.zza(activity).zzb(zzj);
        zzi();
        return this;
    }

    public final Task addOnFailureListener(Activity activity, OnFailureListener onFailureListener) {
        zzl zzl = new zzl(TaskExecutors.MAIN_THREAD, onFailureListener);
        this.zzb.zza(zzl);
        zzv.zza(activity).zzb(zzl);
        zzi();
        return this;
    }

    public final Task addOnSuccessListener(Activity activity, OnSuccessListener onSuccessListener) {
        zzn zzn = new zzn(TaskExecutors.MAIN_THREAD, onSuccessListener);
        this.zzb.zza(zzn);
        zzv.zza(activity).zzb(zzn);
        zzi();
        return this;
    }

    public final Task continueWith(Executor executor, Continuation continuation) {
        zzw zzw = new zzw();
        this.zzb.zza(new zzd(executor, continuation, zzw));
        zzi();
        return zzw;
    }

    public final Task continueWithTask(Executor executor, Continuation continuation) {
        zzw zzw = new zzw();
        this.zzb.zza(new zzf(executor, continuation, zzw));
        zzi();
        return zzw;
    }

    public final Exception getException() {
        Exception exc;
        synchronized (this.zza) {
            exc = this.zzf;
        }
        return exc;
    }

    public final Object getResult(Class cls) {
        Throwable th;
        Object obj;
        synchronized (this.zza) {
            zzf();
            zzg();
            if (!cls.isInstance(this.zzf)) {
                Exception exc = this.zzf;
                if (exc == null) {
                    obj = this.zze;
                } else {
                    th = new RuntimeExecutionException(exc);
                }
            } else {
                th = (Throwable) cls.cast(this.zzf);
            }
            throw th;
        }
        return obj;
    }

    public final boolean isComplete() {
        boolean z;
        synchronized (this.zza) {
            z = this.zzc;
        }
        return z;
    }

    public final boolean isSuccessful() {
        boolean z;
        synchronized (this.zza) {
            z = false;
            if (this.zzc && !this.zzd && this.zzf == null) {
                z = true;
            }
        }
        return z;
    }

    public final Task onSuccessTask(Executor executor, SuccessContinuation successContinuation) {
        zzw zzw = new zzw();
        this.zzb.zza(new zzp(executor, successContinuation, zzw));
        zzi();
        return zzw;
    }

    public final void zza(Exception exc) {
        AnonymousClass006.A02(exc, "Exception must not be null");
        synchronized (this.zza) {
            zzh();
            this.zzc = true;
            this.zzf = exc;
        }
        this.zzb.zzb(this);
    }

    public final void zzb(Object obj) {
        synchronized (this.zza) {
            zzh();
            this.zzc = true;
            this.zze = obj;
        }
        this.zzb.zzb(this);
    }

    public final boolean zzc() {
        synchronized (this.zza) {
            if (this.zzc) {
                return false;
            }
            this.zzc = true;
            this.zzd = true;
            this.zzb.zzb(this);
            return true;
        }
    }

    public final boolean zzd(Exception exc) {
        AnonymousClass006.A02(exc, "Exception must not be null");
        synchronized (this.zza) {
            if (this.zzc) {
                return false;
            }
            this.zzc = true;
            this.zzf = exc;
            this.zzb.zzb(this);
            return true;
        }
    }

    public final boolean zze(Object obj) {
        synchronized (this.zza) {
            if (this.zzc) {
                return false;
            }
            this.zzc = true;
            this.zze = obj;
            this.zzb.zzb(this);
            return true;
        }
    }

    public final Task addOnCanceledListener(Executor executor, OnCanceledListener onCanceledListener) {
        this.zzb.zza(new zzh(executor, onCanceledListener));
        zzi();
        return this;
    }

    public final Task addOnCompleteListener(Executor executor, OnCompleteListener onCompleteListener) {
        this.zzb.zza(new zzj(executor, onCompleteListener));
        zzi();
        return this;
    }

    public final Task addOnFailureListener(Executor executor, OnFailureListener onFailureListener) {
        this.zzb.zza(new zzl(executor, onFailureListener));
        zzi();
        return this;
    }

    public final Task addOnSuccessListener(Executor executor, OnSuccessListener onSuccessListener) {
        this.zzb.zza(new zzn(executor, onSuccessListener));
        zzi();
        return this;
    }

    public final Task continueWith(Continuation continuation) {
        return continueWith(TaskExecutors.MAIN_THREAD, continuation);
    }

    public final Task continueWithTask(Continuation continuation) {
        return continueWithTask(TaskExecutors.MAIN_THREAD, continuation);
    }

    public final Object getResult() {
        Object obj;
        synchronized (this.zza) {
            zzf();
            zzg();
            Exception exc = this.zzf;
            if (exc == null) {
                obj = this.zze;
            } else {
                throw new RuntimeExecutionException(exc);
            }
        }
        return obj;
    }

    public final Task onSuccessTask(SuccessContinuation successContinuation) {
        Executor executor = TaskExecutors.MAIN_THREAD;
        zzw zzw = new zzw();
        this.zzb.zza(new zzp(executor, successContinuation, zzw));
        zzi();
        return zzw;
    }

    public final Task addOnCanceledListener(OnCanceledListener onCanceledListener) {
        addOnCanceledListener(TaskExecutors.MAIN_THREAD, onCanceledListener);
        return this;
    }

    public final Task addOnCompleteListener(OnCompleteListener onCompleteListener) {
        this.zzb.zza(new zzj(TaskExecutors.MAIN_THREAD, onCompleteListener));
        zzi();
        return this;
    }

    public final Task addOnFailureListener(OnFailureListener onFailureListener) {
        addOnFailureListener(TaskExecutors.MAIN_THREAD, onFailureListener);
        return this;
    }

    public final Task addOnSuccessListener(OnSuccessListener onSuccessListener) {
        addOnSuccessListener(TaskExecutors.MAIN_THREAD, onSuccessListener);
        return this;
    }
}
