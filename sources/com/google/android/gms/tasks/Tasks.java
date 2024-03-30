package com.google.android.gms.tasks;

import X.AnonymousClass000;
import X.AnonymousClass006;
import X.AnonymousClass0E6;
import android.os.Looper;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class Tasks {
    public static Object await(Task task) {
        AnonymousClass006.A04("Must not be called on the main application thread");
        AnonymousClass006.A02(task, "Task must not be null");
        if (!task.isComplete()) {
            zzad zzad = new zzad((zzac) null);
            zzb(task, zzad);
            zzad.zza();
        }
        return zza(task);
    }

    @Deprecated
    public static Task call(Executor executor, Callable callable) {
        AnonymousClass006.A02(executor, "Executor must not be null");
        AnonymousClass006.A02(callable, "Callback must not be null");
        zzw zzw = new zzw();
        executor.execute(new zzz(zzw, callable));
        return zzw;
    }

    public static Task forCanceled() {
        zzw zzw = new zzw();
        zzw.zzc();
        return zzw;
    }

    public static Task forException(Exception exc) {
        zzw zzw = new zzw();
        zzw.zza(exc);
        return zzw;
    }

    public static Task forResult(Object obj) {
        zzw zzw = new zzw();
        zzw.zzb(obj);
        return zzw;
    }

    public static Task whenAll(Collection collection) {
        if (collection == null || collection.isEmpty()) {
            zzw zzw = new zzw();
            zzw.zzb((Object) null);
            return zzw;
        }
        for (Object requireNonNull : collection) {
            Objects.requireNonNull(requireNonNull, "null tasks are not accepted");
        }
        zzw zzw2 = new zzw();
        zzaf zzaf = new zzaf(collection.size(), zzw2);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            zzb((Task) it.next(), zzaf);
        }
        return zzw2;
    }

    public static Task whenAllComplete(Collection collection) {
        if (collection == null || collection.isEmpty()) {
            List emptyList = Collections.emptyList();
            zzw zzw = new zzw();
            zzw.zzb(emptyList);
            return zzw;
        }
        return whenAll(collection).continueWithTask(TaskExecutors.MAIN_THREAD, new zzab(collection));
    }

    public static Task whenAllSuccess(Collection collection) {
        if (collection == null || collection.isEmpty()) {
            List emptyList = Collections.emptyList();
            zzw zzw = new zzw();
            zzw.zzb(emptyList);
            return zzw;
        }
        return whenAll(collection).continueWith(TaskExecutors.MAIN_THREAD, new zzaa(collection));
    }

    public static Task withTimeout(Task task, long j, TimeUnit timeUnit) {
        AnonymousClass006.A02(task, "Task must not be null");
        AnonymousClass006.A07(AnonymousClass000.A1R((j > 0 ? 1 : (j == 0 ? 0 : -1))), "Timeout must be positive");
        AnonymousClass006.A02(timeUnit, "TimeUnit must not be null");
        zzb zzb = new zzb();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(zzb);
        AnonymousClass0E6 r3 = new AnonymousClass0E6(Looper.getMainLooper());
        r3.postDelayed(new zzx(taskCompletionSource), timeUnit.toMillis(j));
        task.addOnCompleteListener(new zzy(r3, taskCompletionSource, zzb));
        return taskCompletionSource.zza;
    }

    public static void zzb(Task task, zzae zzae) {
        Executor executor = TaskExecutors.zza;
        task.addOnSuccessListener(executor, (OnSuccessListener) zzae);
        task.addOnFailureListener(executor, (OnFailureListener) zzae);
        task.addOnCanceledListener(executor, (OnCanceledListener) zzae);
    }

    public static Object zza(Task task) {
        if (task.isSuccessful()) {
            return task.getResult();
        }
        if (((zzw) task).zzd) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(task.getException());
    }

    public static Object await(Task task, long j, TimeUnit timeUnit) {
        AnonymousClass006.A04("Must not be called on the main application thread");
        AnonymousClass006.A02(task, "Task must not be null");
        AnonymousClass006.A02(timeUnit, "TimeUnit must not be null");
        if (!task.isComplete()) {
            zzad zzad = new zzad((zzac) null);
            zzb(task, zzad);
            if (!zzad.zza.await(j, timeUnit)) {
                throw new TimeoutException("Timed out waiting for Task");
            }
        }
        return zza(task);
    }

    @Deprecated
    public static Task call(Callable callable) {
        return call(TaskExecutors.MAIN_THREAD, callable);
    }

    public static Task whenAll(Task... taskArr) {
        if (taskArr != null && taskArr.length != 0) {
            return whenAll((Collection) Arrays.asList(taskArr));
        }
        zzw zzw = new zzw();
        zzw.zzb((Object) null);
        return zzw;
    }

    public static Task whenAllComplete(Task... taskArr) {
        if (taskArr != null && taskArr.length != 0) {
            return whenAllComplete((Collection) Arrays.asList(taskArr));
        }
        List emptyList = Collections.emptyList();
        zzw zzw = new zzw();
        zzw.zzb(emptyList);
        return zzw;
    }

    public static Task whenAllSuccess(Task... taskArr) {
        if (taskArr != null && taskArr.length != 0) {
            return whenAllSuccess((Collection) Arrays.asList(taskArr));
        }
        List emptyList = Collections.emptyList();
        zzw zzw = new zzw();
        zzw.zzb(emptyList);
        return zzw;
    }
}
