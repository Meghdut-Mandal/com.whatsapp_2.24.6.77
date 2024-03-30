package X;

import android.os.Handler;
import android.widget.SeekBar;

/* renamed from: X.6dr  reason: invalid class name and case insensitive filesystem */
public class C136156dr implements SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ C100344ur A00;
    public final /* synthetic */ C124975z6 A01;
    public final /* synthetic */ C1271967i A02;
    public final /* synthetic */ C140456lc A03;
    public final /* synthetic */ C160377ku A04;
    public final /* synthetic */ C160377ku A05;

    public C136156dr(C100344ur r1, C124975z6 r2, C1271967i r3, C140456lc r4, C160377ku r5, C160377ku r6) {
        this.A00 = r1;
        this.A01 = r2;
        this.A05 = r5;
        this.A03 = r4;
        this.A02 = r3;
        this.A04 = r6;
    }

    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        Handler handler = AnonymousClass6RJ.A00;
        C124975z6 r1 = this.A01;
        handler.removeMessages(0, r1);
        r1.A07 = i;
        AnonymousClass000.A14(handler, r1, 0);
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
        C160377ku r4 = this.A05;
        if (r4 != null) {
            C140456lc r3 = this.A03;
            C1273868b A002 = C1273868b.A00();
            C1271967i r0 = this.A02;
            A002.A09(r0, 0);
            C1273868b.A06(r0, r3, A002, r4);
        }
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
        C160377ku r4 = this.A04;
        if (r4 != null) {
            C140456lc r3 = this.A03;
            C1273868b A002 = C1273868b.A00();
            C1271967i r0 = this.A02;
            A002.A09(r0, 0);
            C1273868b.A06(r0, r3, A002, r4);
        }
    }
}
