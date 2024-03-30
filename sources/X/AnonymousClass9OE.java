package X;

import android.bluetooth.BluetoothManager;
import android.content.Context;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* renamed from: X.9OE  reason: invalid class name */
public final class AnonymousClass9OE {
    public final AnonymousClass887 A00;
    public final AVZ A01;
    public final C198939eR A02;
    public final AnonymousClass9U8 A03;
    public final ArrayDeque A04 = new ArrayDeque();
    public final Executor A05;
    public final C006302t A06;
    public final C006302t A07;
    public final C009003v A08;
    public final Context A09;

    public AnonymousClass9OE(BluetoothManager bluetoothManager, Context context, AnonymousClass887 r4, Executor executor, C006302t r6, C006302t r7, C009003v r8) {
        this.A09 = context;
        this.A05 = executor;
        this.A00 = r4;
        this.A06 = r6;
        this.A07 = r7;
        this.A08 = r8;
        this.A03 = new AnonymousClass9U8(bluetoothManager, executor);
        this.A02 = new C198939eR(bluetoothManager, context, executor);
        this.A01 = new AVZ(r4, this);
    }
}
