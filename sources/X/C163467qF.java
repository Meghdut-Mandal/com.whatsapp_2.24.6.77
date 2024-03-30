package X;

import android.widget.SeekBar;
import com.whatsapp.textstatuscomposer.voice.VoiceRecordingView;

/* renamed from: X.7qF  reason: invalid class name and case insensitive filesystem */
public class C163467qF implements SeekBar.OnSeekBarChangeListener {
    public Object A00;
    public final int A01;

    public C163467qF(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        int i2 = this.A01;
        Object obj = this.A00;
        if (i2 != 0) {
            AnonymousClass6YP.A0A((AnonymousClass6YP) obj, i, z);
            return;
        }
        VoiceRecordingView voiceRecordingView = (VoiceRecordingView) obj;
        AnonymousClass7d8 r1 = voiceRecordingView.A0B;
        if (r1 != null) {
            C148856zX.A02((C148856zX) r1, voiceRecordingView.A0D.getProgress(), z);
        }
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
        if (this.A01 != 0) {
            AnonymousClass6YP r5 = (AnonymousClass6YP) this.A00;
            r5.A15.A02++;
            if (r5.A0G != null) {
                r5.A0V.removeCallbacks(r5.A1A);
                r5.A04 = -1;
                return;
            }
            return;
        }
        VoiceRecordingView voiceRecordingView = (VoiceRecordingView) this.A00;
        AnonymousClass7d8 r3 = voiceRecordingView.A0B;
        if (r3 != null) {
            int progress = voiceRecordingView.A0D.getProgress();
            C148856zX r32 = (C148856zX) r3;
            C001700s r1 = r32.A08;
            Object A04 = r1.A04();
            if (A04 != null) {
                r32.A01 = (C125455zw) A04;
                r1.A0D(new AnonymousClass5LP(r32));
                C132476Tw r0 = r32.A02;
                if (r0 != null) {
                    r0.A04();
                }
                r32.A04.removeCallbacks(r32.A03);
                C148856zX.A02(r32, progress, false);
            } else {
                throw C36381kD.A0k();
            }
        }
        voiceRecordingView.setupPreviewProgressIndicatorSizes(true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0045  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onStopTrackingTouch(android.widget.SeekBar r6) {
        /*
            r5 = this;
            int r0 = r5.A01
            if (r0 == 0) goto L_0x000c
            java.lang.Object r0 = r5.A00
            X.6YP r0 = (X.AnonymousClass6YP) r0
            X.AnonymousClass6YP.A05(r0)
        L_0x000b:
            return
        L_0x000c:
            java.lang.Object r3 = r5.A00
            com.whatsapp.textstatuscomposer.voice.VoiceRecordingView r3 = (com.whatsapp.textstatuscomposer.voice.VoiceRecordingView) r3
            X.7d8 r2 = r3.A0B
            if (r2 == 0) goto L_0x000b
            com.whatsapp.voicerecorder.VoiceNoteSeekBar r0 = r3.A0D
            int r1 = r0.getProgress()
            X.6zX r2 = (X.C148856zX) r2
            r0 = 1
            X.C148856zX.A02(r2, r1, r0)
            X.5zw r1 = r2.A01
            if (r1 == 0) goto L_0x00ba
            boolean r0 = r1 instanceof X.AnonymousClass5LP
            if (r0 == 0) goto L_0x0093
            java.lang.String r0 = "VoiceRecordingPreviewController: previous state before dragging is dragging"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x002d:
            X.5LR r4 = new X.5LR
            r4.<init>(r2)
        L_0x0032:
            boolean r0 = r4 instanceof X.AnonymousClass5LP
            if (r0 == 0) goto L_0x0045
            java.lang.String r0 = "VoiceRecordingPreviewController: nextState is Dragging. This should never happen."
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x003b:
            X.00s r0 = r2.A08
            r0.A0D(r4)
            r0 = 0
            r3.setupPreviewProgressIndicatorSizes(r0)
            return
        L_0x0045:
            boolean r0 = r4 instanceof X.AnonymousClass5LQ
            if (r0 != 0) goto L_0x003b
            boolean r0 = r4 instanceof X.AnonymousClass5LR
            if (r0 == 0) goto L_0x0068
            X.6Tw r1 = r2.A02
            if (r1 == 0) goto L_0x0060
            X.00s r0 = r2.A07
            java.lang.Object r0 = r0.A04()
            if (r0 == 0) goto L_0x00ab
            int r0 = X.AnonymousClass000.A0I(r0)
            r1.A0A(r0)
        L_0x0060:
            android.os.Handler r1 = r2.A04
            java.lang.Runnable r0 = r2.A03
            r1.post(r0)
            goto L_0x003b
        L_0x0068:
            boolean r0 = r4 instanceof X.AnonymousClass5LS
            if (r0 == 0) goto L_0x003b
            android.os.Handler r1 = r2.A04
            java.lang.Runnable r0 = r2.A03
            r1.post(r0)
            X.6Tw r1 = r2.A02
            if (r1 == 0) goto L_0x0086
            X.00s r0 = r2.A07
            java.lang.Object r0 = r0.A04()
            if (r0 == 0) goto L_0x00b0
            int r0 = X.AnonymousClass000.A0I(r0)
            r1.A0A(r0)
        L_0x0086:
            X.6Tw r0 = r2.A02
            if (r0 == 0) goto L_0x008d
            r0.A07()
        L_0x008d:
            X.3QH r0 = r2.A0I
            r0.A03()
            goto L_0x003b
        L_0x0093:
            boolean r0 = r1 instanceof X.AnonymousClass5LQ
            if (r0 == 0) goto L_0x009d
            X.5LQ r4 = new X.5LQ
            r4.<init>(r2)
            goto L_0x0032
        L_0x009d:
            boolean r0 = r1 instanceof X.AnonymousClass5LR
            if (r0 != 0) goto L_0x002d
            boolean r0 = r1 instanceof X.AnonymousClass5LS
            if (r0 == 0) goto L_0x00b5
            X.5LS r4 = new X.5LS
            r4.<init>(r2)
            goto L_0x0032
        L_0x00ab:
            java.lang.IllegalArgumentException r0 = X.C36381kD.A0k()
            throw r0
        L_0x00b0:
            java.lang.IllegalArgumentException r0 = X.C36381kD.A0k()
            throw r0
        L_0x00b5:
            X.0jS r0 = X.C36441kJ.A18()
            throw r0
        L_0x00ba:
            java.lang.IllegalArgumentException r0 = X.C36381kD.A0k()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C163467qF.onStopTrackingTouch(android.widget.SeekBar):void");
    }
}
