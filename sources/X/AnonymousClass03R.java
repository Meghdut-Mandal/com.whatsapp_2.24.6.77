package X;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;

/* renamed from: X.03R  reason: invalid class name */
public final class AnonymousClass03R extends AnonymousClass03Q implements C005702n {
    public final Handler A00;
    public final AnonymousClass03R A01;
    public final String A02;
    public final boolean A03;
    public volatile AnonymousClass03R _immediate;

    public AnonymousClass03R(Handler handler, String str, boolean z) {
        AnonymousClass03R r0 = null;
        this.A00 = handler;
        this.A02 = str;
        this.A03 = z;
        this._immediate = z ? this : r0;
        AnonymousClass03R r1 = this._immediate;
        if (r1 == null) {
            r1 = new AnonymousClass03R(handler, str, true);
            this._immediate = r1;
        }
        this.A01 = r1;
    }

    private final void A00(Runnable runnable, C005102h r4) {
        StringBuilder sb = new StringBuilder();
        sb.append("The task was rejected, the handler underlying the dispatcher '");
        sb.append(this);
        sb.append("' was closed");
        C07570Yj.A02(new CancellationException(sb.toString()), r4);
        C006702x.A01.A03(runnable, r4);
    }

    public void A03(Runnable runnable, C005102h r3) {
        if (!this.A00.post(runnable)) {
            A00(runnable, r3);
        }
    }

    public boolean A04(C005102h r3) {
        if (!this.A03 || !AnonymousClass00C.A0J(Looper.myLooper(), this.A00.getLooper())) {
            return true;
        }
        return false;
    }

    public AnonymousClass03l BL6(Runnable runnable, C005102h r6, long j) {
        Handler handler = this.A00;
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (handler.postDelayed(runnable, j)) {
            return new C12880io(runnable, this);
        }
        A00(runnable, r6);
        return C008203n.A00;
    }

    public void BpP(AnonymousClass0AP r6, long j) {
        C11690gq r4 = new C11690gq(r6, this);
        Handler handler = this.A00;
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (handler.postDelayed(r4, j)) {
            r6.BL1(new C14680m1(r4, this));
        } else {
            A00(r4, r6.getContext());
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass03R) || ((AnonymousClass03R) obj).A00 != this.A00) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return System.identityHashCode(this.A00);
    }

    public String toString() {
        String str;
        AnonymousClass03P r0;
        C005502l r02 = C006702x.A00;
        AnonymousClass03P r03 = AnonymousClass03K.A00;
        if (this == r03) {
            str = "Dispatchers.Main";
        } else {
            str = null;
            try {
                r0 = r03.A05();
            } catch (UnsupportedOperationException unused) {
                r0 = null;
            }
            if (this == r0) {
                str = "Dispatchers.Main.immediate";
            }
        }
        if (str != null) {
            return str;
        }
        String str2 = this.A02;
        if (str2 == null) {
            str2 = this.A00.toString();
        }
        if (!this.A03) {
            return str2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(".immediate");
        return sb.toString();
    }

    public /* bridge */ /* synthetic */ AnonymousClass03P A05() {
        return this.A01;
    }
}
