package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.whatsapp.conversation.waveforms.VoiceVisualizer;

/* renamed from: X.4cS  reason: invalid class name and case insensitive filesystem */
public class C91694cS extends Handler {
    public long A00;
    public final long A01;
    public final AnonymousClass5VT A02;
    public final AnonymousClass1X4 A03;
    public final C1492470k A04;
    public final C158647hq A05;
    public final C158647hq A06;
    public final C158647hq A07;
    public final C158647hq A08;
    public final C117945n5 A09;
    public final C158667hs A0A;
    public final C158667hs A0B;
    public final C19970wo A0C;

    public void handleMessage(Message message) {
        AnonymousClass11F r2;
        AnonymousClass6Q9 r0;
        AnonymousClass6YP r9 = this.A09.A00;
        if (r9.A0H != null) {
            long elapsedRealtime = (SystemClock.elapsedRealtime() - r9.A06) + r9.A05;
            this.A0B.B2H(Integer.valueOf((int) C36391kE.A0B(elapsedRealtime)));
            if (r9.A02 % 2 == 0) {
                AnonymousClass5VT r02 = this.A02;
                double longBitsToDouble = Double.longBitsToDouble(r02.A00.getAndSet(Double.doubleToRawLongBits(Double.MIN_VALUE)));
                if (longBitsToDouble == -1.0d) {
                    this.A06.B2G();
                } else if (longBitsToDouble != Double.MIN_VALUE) {
                    float f = (float) longBitsToDouble;
                    VoiceVisualizer voiceVisualizer = this.A04.A0G;
                    C18740tg.A0B(voiceVisualizer.A0E.isEmpty());
                    Boolean bool = C18750th.A01;
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    long j = voiceVisualizer.A03;
                    if (j != 0) {
                        voiceVisualizer.A04 = Math.max(elapsedRealtime2 - j, 0);
                    }
                    voiceVisualizer.A03 = elapsedRealtime2;
                    voiceVisualizer.A0C.add(Float.valueOf(f));
                    if (!voiceVisualizer.A06) {
                        voiceVisualizer.A06 = true;
                        voiceVisualizer.invalidate();
                    }
                }
            }
            this.A05.B2G();
            sendEmptyMessageDelayed(0, 50);
            Boolean bool2 = C18750th.A01;
            if (r9.A0C == null && !(r9.A0B instanceof C28981Uw) && elapsedRealtime > 1000 && (r0 = r9.A0H) != null && r0.A03().length() > 0) {
                this.A08.B2G();
                this.A0A.B2H(r9.A0H.A03());
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (this.A00 + 1250 < currentTimeMillis && (r2 = r9.A0B) != null) {
                this.A00 = currentTimeMillis;
                this.A03.A0K(r2, 1);
                AnonymousClass6Q9 r03 = r9.A0H;
                if (r03 != null && r03.A03().length() > this.A01) {
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("voicenote/filelimit ");
                    C36351kA.A1S(A0u, r9.A0H.A03().length());
                    this.A07.B2G();
                }
            }
        }
    }

    public C91694cS(AnonymousClass5VT r2, AnonymousClass1X4 r3, C19970wo r4, C1492470k r5, C158647hq r6, C158647hq r7, C158647hq r8, C158647hq r9, C117945n5 r10, C158667hs r11, C158667hs r12, long j) {
        super(Looper.getMainLooper());
        this.A0C = r4;
        this.A03 = r3;
        this.A09 = r10;
        this.A04 = r5;
        this.A02 = r2;
        this.A0A = r11;
        this.A0B = r12;
        this.A07 = r6;
        this.A08 = r7;
        this.A06 = r8;
        this.A05 = r9;
        this.A01 = j;
    }
}
