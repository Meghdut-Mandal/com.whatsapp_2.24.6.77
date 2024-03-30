package com.google.android.gms.tasks;

import X.AnonymousClass001;

public final class DuplicateTaskCompletionException extends IllegalStateException {
    public static IllegalStateException of(Task task) {
        String str;
        if (!task.isComplete()) {
            return AnonymousClass001.A09("DuplicateTaskCompletionException can only be created from completed Task.");
        }
        Exception exception = task.getException();
        if (exception != null) {
            str = "failure";
        } else if (task.isSuccessful()) {
            str = "result ".concat(String.valueOf(String.valueOf(task.getResult())));
        } else if (((zzw) task).zzd) {
            str = "cancellation";
        } else {
            str = "unknown issue";
        }
        return new DuplicateTaskCompletionException("Complete with: ".concat(str), exception);
    }

    public DuplicateTaskCompletionException(String str, Throwable th) {
        super(str, th);
    }
}
