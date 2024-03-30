package X;

import android.os.Handler;
import android.os.PowerManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.textstatuscomposer.TextStatusComposerActivity;
import com.whatsapp.textstatuscomposer.voice.VoiceRecordingView;
import java.io.File;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6zV  reason: invalid class name and case insensitive filesystem */
public final class C148836zV implements AnonymousClass7d7 {
    public static final long A0M;
    public static final long A0N;
    public static final long A0O = C90484aE.A0K(TimeUnit.SECONDS);
    public static final long A0P;
    public int A00 = -1;
    public long A01 = -1;
    public PowerManager.WakeLock A02;
    public C106915Lv A03;
    public C106915Lv A04;
    public C87354Ol A05;
    public C37151lt A06;
    public C148856zX A07;
    public File A08;
    public File A09;
    public boolean A0A;
    public byte[] A0B;
    public long A0C;
    public final C61463Bz A0D;
    public final C115355ik A0E;
    public final C225014r A0F;
    public final C29731Xt A0G;
    public final C160187kb A0H;
    public final C158567hi A0I;
    public final AnonymousClass3QH A0J;
    public final C19770wU A0K;
    public final C20810yC A0L;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        A0M = timeUnit.toMillis(3);
        A0P = timeUnit.toMillis(30);
        A0N = timeUnit.toMillis(5);
    }

    public static final long A00(C148836zV r3) {
        int A072 = r3.A0L.A07(6845);
        if (A072 <= 0) {
            return A0P;
        }
        return ((long) A072) * A0O;
    }

    public static final void A01(C148836zV r5) {
        r5.A0H.BJP();
        C29731Xt r0 = r5.A0G;
        long j = r5.A0C;
        C29761Xw r52 = r0.A0A;
        if (r52.A04.A00()) {
            AnonymousClass2SV A002 = C29761Xw.A00(r52);
            A002.A03 = 30;
            A002.A01 = C36381kD.A0n();
            long j2 = (long) 1000;
            A002.A07 = Long.valueOf((j / j2) * j2);
            r52.A02.Blw(A002);
        }
    }

    public static final void A02(C148836zV r2, File file) {
        if (file != null) {
            r2.A0K.Boy(new C81183wb(file, 24));
        }
    }

    public static final void A03(C148836zV r4, boolean z) {
        C37151lt r3 = r4.A06;
        if (r3 != null) {
            Handler handler = r3.A03;
            if (handler != null) {
                handler.post(new C80323vD(6, r3, z));
            }
            r4.A06 = null;
            r4.A0J.A01();
            PowerManager.WakeLock wakeLock = r4.A02;
            if (wakeLock != null) {
                wakeLock.release();
            }
            r4.A0A = false;
            C36361kB.A06((View) r4.A0H).setRequestedOrientation(-1);
        }
    }

    public void A04() {
        C87354Ol r3 = this.A05;
        if (r3 != null) {
            TextStatusComposerActivity textStatusComposerActivity = (TextStatusComposerActivity) r3;
            C146646vw r2 = textStatusComposerActivity.A0g;
            if (r2 != null && r2.A06.A00 == C108225Sr.SEND_VOICE) {
                r2.A06 = new AnonymousClass5LM(r2);
                r2.A0B = false;
                r2.A08.A03(300);
            }
            TextStatusComposerActivity.A0K(textStatusComposerActivity);
        }
        C148856zX r0 = this.A07;
        if (r0 != null) {
            r0.A00 = null;
        }
        this.A07 = null;
        A02(this, this.A08);
        this.A08 = null;
        A02(this, this.A09);
        this.A09 = null;
        C29761Xw r22 = this.A0G.A0A;
        if (r22.A04.A00()) {
            AnonymousClass2SV A002 = C29761Xw.A00(r22);
            A002.A03 = 32;
            A002.A01 = C36381kD.A0n();
            r22.A02.Blw(A002);
        }
    }

    public final void A05(long j) {
        TextView textView;
        int i;
        this.A0C = j;
        if (j < A00(this)) {
            long millis = TimeUnit.SECONDS.toMillis(1);
            long A002 = (((A00(this) - j) + millis) - 1) / millis;
            C160187kb r5 = this.A0H;
            r5.setRemainingSeconds((int) A002);
            long A003 = A00(this);
            long j2 = A0M;
            int i2 = (A003 > j2 ? 1 : (A003 == j2 ? 0 : -1));
            long A004 = A00(this);
            if (i2 > 0) {
                A004 -= j2;
            }
            if (j < A004 || j % TimeUnit.SECONDS.toMillis(1) <= 500) {
                textView = ((VoiceRecordingView) r5).A03;
                i = 0;
            } else {
                textView = ((VoiceRecordingView) r5).A03;
                i = 4;
            }
            textView.setVisibility(i);
            return;
        }
        C37151lt r3 = this.A06;
        if (r3 != null) {
            Handler handler = r3.A03;
            if (handler != null) {
                handler.post(new C81183wb(r3, 32));
            }
            A03(this, false);
        }
        A01(this);
        C29761Xw r2 = this.A0G.A0A;
        if (r2.A04.A00()) {
            AnonymousClass2SV A005 = C29761Xw.A00(r2);
            A005.A03 = 29;
            A005.A01 = C36381kD.A0n();
            r2.A02.Blw(A005);
        }
        C87354Ol r32 = this.A05;
        if (r32 != null) {
            TextStatusComposerActivity textStatusComposerActivity = (TextStatusComposerActivity) r32;
            C146646vw r22 = textStatusComposerActivity.A0g;
            if (r22 != null && r22.A06.A00 == C108225Sr.RECORDING) {
                r22.A06 = new AnonymousClass5LL(r22);
                AnonymousClass6VH r1 = r22.A08;
                r1.A04((ViewGroup) r22.A0J);
                r1.A02();
            }
            TextStatusComposerActivity.A0I(textStatusComposerActivity);
        }
    }

    public C148836zV(C61463Bz r4, C115355ik r5, C225014r r6, C21060yb r7, C20810yC r8, C29731Xt r9, VoiceRecordingView voiceRecordingView, AnonymousClass3QH r11, C19770wU r12) {
        C36321k7.A19(r7, r8, r4, r11);
        AnonymousClass00C.A0D(r12, 6);
        C36361kB.A1J(r9, 7, r5);
        this.A0L = r8;
        this.A0D = r4;
        this.A0J = r11;
        this.A0K = r12;
        this.A0G = r9;
        this.A0E = r5;
        this.A0F = r6;
        this.A0H = voiceRecordingView;
        this.A0I = voiceRecordingView;
        PowerManager A0G2 = r7.A0G();
        if (A0G2 != null) {
            this.A02 = C111765co.A00(A0G2, "voice-status-recording", 6);
        }
        voiceRecordingView.A09 = this;
    }
}
