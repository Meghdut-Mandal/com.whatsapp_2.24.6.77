package X;

import android.media.SoundPool;
import java.lang.ref.WeakReference;

/* renamed from: X.73O  reason: invalid class name */
public final /* synthetic */ class AnonymousClass73O implements Runnable {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ SoundPool A03;
    public final /* synthetic */ WeakReference A04;

    public /* synthetic */ AnonymousClass73O(SoundPool soundPool, WeakReference weakReference, float f, float f2, int i) {
        this.A03 = soundPool;
        this.A02 = i;
        this.A00 = f;
        this.A01 = f2;
        this.A04 = weakReference;
    }

    public final void run() {
        C006302t r1;
        SoundPool soundPool = this.A03;
        int i = this.A02;
        float f = this.A00;
        float f2 = this.A01;
        WeakReference weakReference = this.A04;
        int play = soundPool.play(i, f, f2, 0, 0, 1.0f);
        if (weakReference != null && (r1 = (C006302t) weakReference.get()) != null) {
            r1.invoke(Integer.valueOf(play));
        }
    }
}
