package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import android.view.View;
import java.io.File;

/* renamed from: X.3Qq  reason: invalid class name and case insensitive filesystem */
public abstract class C65083Qq {
    public int A00 = 5;
    public Activity A01;
    public AudioManager.OnAudioFocusChangeListener A02;
    public C21060yb A03;
    public AnonymousClass4SK A04;
    public AnonymousClass4SL A05;
    public AnonymousClass4SM A06;
    public AnonymousClass4SN A07;
    public AnonymousClass4SO A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public int A0D = Integer.MAX_VALUE;
    public Pair A0E = null;

    public void A0B() {
    }

    public /* synthetic */ void A0F() {
    }

    public /* synthetic */ void A0G() {
    }

    public /* synthetic */ void A0H() {
    }

    public /* synthetic */ void A0I() {
    }

    public /* synthetic */ void A0J() {
    }

    public /* synthetic */ void A0K() {
        throw null;
    }

    public /* synthetic */ void A0N(int i) {
        throw null;
    }

    public /* synthetic */ void A0O(int i) {
    }

    public /* synthetic */ void A0P(int i, int i2) {
        throw null;
    }

    public /* synthetic */ void A0Q(AnonymousClass6D2 r1) {
    }

    public /* synthetic */ void A0S(AnonymousClass5NI r1) {
    }

    public /* synthetic */ void A0T(File file) {
        throw null;
    }

    public /* synthetic */ void A0W(boolean z) {
    }

    public static C65083Qq A03(Context context, AnonymousClass17Y r14, C21060yb r15, C19630wG r16, C20810yC r17, AnonymousClass6KH r18, C19770wU r19, AnonymousClass6FG r20, File file, boolean z, boolean z2, boolean z3) {
        boolean z4 = z;
        boolean z5 = z3;
        if (z2) {
            C20810yC r1 = r17;
            AnonymousClass00C.A0D(r1, 0);
            if (!AnonymousClass6YG.A0C(r1.A09(2917))) {
                AnonymousClass6KH r8 = r18;
                C18740tg.A06(r8);
                AnonymousClass5NR r3 = new AnonymousClass5NR(C24801Dv.A00(context), r14, r15, r16, r8, r19, r20, 0, z5);
                r3.A04 = Uri.fromFile(file);
                r3.A0A = z4;
                r3.A0F();
                r3.A09 = true;
                return r3;
            }
        }
        String absolutePath = file.getAbsolutePath();
        if (!z3) {
            return new AnonymousClass5NO(context, absolutePath, z4);
        }
        return new AnonymousClass5NN(context, absolutePath, z4);
    }

    public int A04() {
        if (this instanceof C50362kd) {
            C63413Jy r0 = ((C50362kd) this).A00;
            if (r0 != null) {
                return (int) r0.A00();
            }
            throw C36331k8.A0d("staticContentPlayer");
        }
        AnonymousClass38r r02 = ((C50372ke) this).A00.A05;
        if (r02 != null) {
            return r02.A03.A04();
        }
        return 0;
    }

    public int A05() {
        if (this instanceof C50362kd) {
            C63413Jy r0 = ((C50362kd) this).A00;
            if (r0 != null) {
                return (int) r0.A00;
            }
            throw C36331k8.A0d("staticContentPlayer");
        }
        AnonymousClass38r r02 = ((C50372ke) this).A00.A05;
        if (r02 != null) {
            return r02.A03.A05();
        }
        return 0;
    }

    public /* synthetic */ int A06() {
        if (this instanceof C50372ke) {
            return ((C50372ke) this).A00.A01();
        }
        throw null;
    }

    public Bitmap A07() {
        AnonymousClass38r r0;
        if ((this instanceof C50362kd) || (r0 = ((C50372ke) this).A00.A05) == null) {
            return null;
        }
        return r0.A03.A07();
    }

    public View A08() {
        if (this instanceof C50362kd) {
            return ((C50362kd) this).A02;
        }
        return ((C50372ke) this).A02;
    }

    public void A0A() {
        if (this instanceof C50362kd) {
            C50362kd r1 = (C50362kd) this;
            C63413Jy r0 = r1.A00;
            if (r0 == null) {
                throw C36331k8.A0d("staticContentPlayer");
            }
            r0.A02();
            r1.A01.removeMessages(0);
            return;
        }
        ((C50372ke) this).A0f(false);
    }

    public void A0C() {
        if (this instanceof C50362kd) {
            C50362kd r4 = (C50362kd) this;
            C63413Jy r0 = r4.A00;
            if (r0 == null) {
                throw C36331k8.A0d("staticContentPlayer");
            }
            r0.A01();
            Handler handler = r4.A01;
            handler.removeMessages(0);
            handler.sendEmptyMessageDelayed(0, (long) (r4.A05() - r4.A04()));
            return;
        }
        C50372ke r2 = (C50372ke) this;
        if (r2.A00.A01() == 4) {
            r2.A0L(0);
        }
        r2.A0d();
        r2.A0f(true);
    }

    public void A0D() {
        if (this instanceof C50362kd) {
            C50362kd r1 = (C50362kd) this;
            C63413Jy r0 = r1.A00;
            if (r0 == null) {
                throw C36331k8.A0d("staticContentPlayer");
            }
            r0.A02();
            r1.A01.removeMessages(0);
            return;
        }
        C50372ke r2 = (C50372ke) this;
        AnonymousClass38r r12 = r2.A00.A05;
        C50372ke.A00(r2);
        if (r12 != null) {
            r2.A04.A02(r12);
        }
    }

    public void A0E() {
        if (!this.A09) {
            C21060yb r0 = this.A03;
            C18740tg.A06(r0);
            AudioManager A0D2 = r0.A0D();
            if (A0D2 != null) {
                AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this.A02;
                if (onAudioFocusChangeListener == null) {
                    onAudioFocusChangeListener = AnonymousClass3WQ.A00;
                    this.A02 = onAudioFocusChangeListener;
                }
                A0D2.requestAudioFocus(onAudioFocusChangeListener, 3, 2);
            }
        }
    }

    public void A0L(int i) {
        int i2 = i;
        if (this instanceof C50362kd) {
            C50362kd r4 = (C50362kd) this;
            C63413Jy r2 = r4.A00;
            if (r2 == null) {
                throw C36331k8.A0d("staticContentPlayer");
            }
            r2.A01 = (long) i;
            r2.A02 = SystemClock.elapsedRealtime();
            Handler handler = r4.A01;
            handler.removeMessages(0);
            handler.sendEmptyMessageDelayed(0, (long) (r4.A05() - r4.A04()));
            return;
        }
        C50372ke r1 = (C50372ke) this;
        C64963Qd r0 = r1.A00;
        AnonymousClass38r r5 = r0.A05;
        if (r5 != null) {
            r5.A03.A0L(i);
            return;
        }
        AnonymousClass3I8 r3 = r0.A03;
        boolean z = r0.A07;
        C50372ke.A02(r1, new C64963Qd(r3, r0.A04, r5, r0.A02, i2, r0.A00, z, r0.A06));
    }

    public /* synthetic */ void A0M(int i) {
        if (this instanceof C50372ke) {
            C50372ke r1 = (C50372ke) this;
            C64963Qd r0 = r1.A00;
            AnonymousClass3I8 r3 = r0.A03;
            boolean z = r0.A07;
            C50372ke.A02(r1, new C64963Qd(r3, r0.A04, r0.A05, r0.A02, r0.A01, i, z, r0.A06));
        }
    }

    public void A0R(AnonymousClass4SO r2) {
        if (this instanceof C50372ke) {
            C50372ke r0 = (C50372ke) this;
            r0.A08 = r2;
            r0.A01 = r2;
            return;
        }
        this.A08 = r2;
    }

    public final void A0U(String str, String str2, boolean z) {
        AnonymousClass4SM r0 = this.A06;
        if (r0 != null) {
            r0.BWy(str, str2, z);
        }
    }

    public void A0V(boolean z) {
        if (!(this instanceof C50362kd)) {
            C50372ke r1 = (C50372ke) this;
            C64963Qd r0 = r1.A00;
            AnonymousClass3I8 r3 = r0.A03;
            boolean z2 = r0.A07;
            C50372ke.A02(r1, new C64963Qd(r3, r0.A04, r0.A05, r0.A02, r0.A01, r0.A00, z2, z));
        }
    }

    public boolean A0X() {
        if (this instanceof C50362kd) {
            C63413Jy r0 = ((C50362kd) this).A00;
            if (r0 != null) {
                return r0.A03;
            }
            throw C36331k8.A0d("staticContentPlayer");
        }
        C64963Qd r1 = ((C50372ke) this).A00;
        if (!r1.A07 || r1.A01() != 3) {
            return false;
        }
        return true;
    }

    public boolean A0Y() {
        if (this instanceof C50362kd) {
            return true;
        }
        AnonymousClass38r r0 = ((C50372ke) this).A00.A05;
        if (r0 != null) {
            return r0.A03.A0Y();
        }
        return false;
    }

    public /* synthetic */ AnonymousClass5NI A09() {
        return null;
    }

    public boolean A0Z() {
        return false;
    }

    public /* synthetic */ boolean A0a() {
        throw null;
    }

    public /* synthetic */ boolean A0b() {
        return false;
    }

    public /* synthetic */ boolean A0c() {
        return false;
    }
}
