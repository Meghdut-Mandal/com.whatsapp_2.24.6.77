package X;

import com.facebook.android.exoplayer2.Timeline;
import com.whatsapp.R;
import com.whatsapp.util.Log;

/* renamed from: X.6ma  reason: invalid class name and case insensitive filesystem */
public class C141046ma implements B3J {
    public final /* synthetic */ AnonymousClass5NR A00;

    public void Bcl() {
    }

    public void Bcr(AnonymousClass927 r1, AnonymousClass902 r2) {
    }

    public void Bcy(int i) {
    }

    public void Bj7(Timeline timeline, Object obj, int i) {
    }

    public C141046ma(AnonymousClass5NR r1) {
        this.A00 = r1;
    }

    public void Bct(int i, boolean z, boolean z2) {
        this.A00.A0U.A0H(new C1502174k(this, i, 2, z));
    }

    public void Bkc(AnonymousClass902 r6, String str) {
        AnonymousClass5NR r4;
        String string;
        Integer A0o;
        String str2;
        if (AnonymousClass902.A04 == r6) {
            Log.i("Heroplayer/unplayable video track");
            r4 = this.A00;
            string = r4.A01.getString(R.string.f12nameremoved);
            A0o = C36371kC.A0n();
            str2 = "unplayable_video_track";
        } else if (AnonymousClass902.A03 == r6) {
            Log.i("Heroplayer/unplayable audio track");
            r4 = this.A00;
            string = r4.A01.getString(R.string.f12nameremoved);
            A0o = C36371kC.A0o();
            str2 = "unplayable_audio_track";
        } else {
            return;
        }
        AnonymousClass5NR.A02(r4, A0o, string, str2, true);
    }

    public void BjP(C206419tN r1, C195269Tk r2) {
        hashCode();
    }
}
