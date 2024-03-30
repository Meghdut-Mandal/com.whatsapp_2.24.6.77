package X;

import android.media.AudioAttributes;
import android.os.VibrationEffect;
import android.os.Vibrator;

/* renamed from: X.72y  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1498372y implements Runnable {
    public final /* synthetic */ AudioAttributes A00;
    public final /* synthetic */ VibrationEffect A01;
    public final /* synthetic */ Vibrator A02;

    public /* synthetic */ C1498372y(AudioAttributes audioAttributes, VibrationEffect vibrationEffect, Vibrator vibrator) {
        this.A02 = vibrator;
        this.A01 = vibrationEffect;
        this.A00 = audioAttributes;
    }

    public final void run() {
        Vibrator vibrator = this.A02;
        AnonymousClass6XR.A02(this.A00, this.A01, vibrator);
    }
}
