package X;

import android.content.Context;
import android.os.PowerManager;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: X.5rm  reason: invalid class name and case insensitive filesystem */
public class C120605rm {
    public static C120605rm A02;
    public final PowerManager A00;
    public final ExecutorService A01 = Executors.newSingleThreadExecutor();

    public C120605rm(Context context) {
        this.A00 = (PowerManager) context.getSystemService("power");
    }
}
