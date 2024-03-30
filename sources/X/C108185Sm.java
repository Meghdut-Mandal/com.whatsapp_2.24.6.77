package X;

import androidx.compose.runtime.Recomposer;

/* renamed from: X.5Sm  reason: invalid class name and case insensitive filesystem */
public enum C108185Sm {
    ShutDown,
    ShuttingDown,
    Inactive,
    InactivePendingWork,
    Idle,
    PendingWork;

    public static int A00(Recomposer recomposer) {
        return ((C108185Sm) recomposer.A0K.getValue()).compareTo(ShuttingDown);
    }
}
