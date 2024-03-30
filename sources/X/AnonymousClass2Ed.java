package X;

import android.graphics.Rect;
import android.os.Bundle;
import com.whatsapp.jid.UserJid;
import com.whatsapp.status.playback.StatusPlaybackActivity;
import com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment;
import com.whatsapp.status.playback.fragment.StatusPlaybackFragment;
import java.lang.ref.WeakReference;

/* renamed from: X.2Ed  reason: invalid class name */
public final class AnonymousClass2Ed extends C100764vd {
    public final WeakReference A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2Ed(AnonymousClass01z r2, StatusPlaybackActivity statusPlaybackActivity) {
        super(r2);
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = AnonymousClass001.A0F(statusPlaybackActivity);
    }

    public int A0H() {
        AnonymousClass3G6 r2;
        StatusPlaybackActivity statusPlaybackActivity = (StatusPlaybackActivity) this.A00.get();
        if (statusPlaybackActivity == null || (r2 = statusPlaybackActivity.A0D) == null || !statusPlaybackActivity.A03) {
            return 0;
        }
        return r2.A01.size();
    }

    public /* bridge */ /* synthetic */ int A0L(Object obj) {
        AnonymousClass02E r6 = (AnonymousClass02E) obj;
        AnonymousClass00C.A0D(r6, 0);
        StatusPlaybackActivity statusPlaybackActivity = (StatusPlaybackActivity) this.A00.get();
        if (statusPlaybackActivity != null) {
            AnonymousClass3G6 r3 = statusPlaybackActivity.A0D;
            if (r6 instanceof StatusPlaybackFragment) {
                int A002 = r3.A00(((StatusPlaybackFragment) r6).A1Z());
                Integer valueOf = Integer.valueOf(A002);
                if (A002 < 0 || A002 >= r3.A01.size() || valueOf == null) {
                    return -2;
                }
                return A002;
            }
        }
        return -2;
    }

    public long A0Q(int i) {
        StatusPlaybackActivity statusPlaybackActivity = (StatusPlaybackActivity) this.A00.get();
        if (statusPlaybackActivity == null) {
            return 0;
        }
        AnonymousClass3G6 r0 = statusPlaybackActivity.A0D;
        Number A10 = C36441kJ.A10(((AnonymousClass332) r0.A01.get(i)).A00.A09.getRawString(), r0.A00);
        if (A10 != null) {
            return A10.longValue();
        }
        return -2;
    }

    public AnonymousClass02E A0R(int i) {
        Bundle A0B;
        StatusPlaybackActivity statusPlaybackActivity = (StatusPlaybackActivity) this.A00.get();
        if (statusPlaybackActivity != null) {
            AnonymousClass332 r0 = (AnonymousClass332) statusPlaybackActivity.A0D.A01.get(i);
            if (r0 != null) {
                C64933Qa r1 = statusPlaybackActivity.A00;
                UserJid userJid = r0.A00.A09;
                if (r1 == null) {
                    AnonymousClass00C.A08(userJid);
                    boolean z = statusPlaybackActivity.A0J;
                    A0B = C36351kA.A0B(userJid, "jid");
                    A0B.putBoolean("unseen_only", z);
                } else {
                    AnonymousClass00C.A08(userJid);
                    C64933Qa r12 = statusPlaybackActivity.A00;
                    if (r12 != null) {
                        A0B = C36351kA.A0B(userJid, "jid");
                        AnonymousClass3UJ.A08(A0B, r12);
                    } else {
                        throw C36381kD.A0k();
                    }
                }
                StatusPlaybackContactFragment statusPlaybackContactFragment = new StatusPlaybackContactFragment();
                statusPlaybackContactFragment.A17(A0B);
                Rect rect = statusPlaybackActivity.A0P;
                AnonymousClass00C.A07(rect);
                statusPlaybackContactFragment.A1e(rect);
                return statusPlaybackContactFragment;
            }
            throw AnonymousClass001.A08("Unsupported StatusItem instance");
        }
        throw AnonymousClass001.A08("Unsupported StatusItem instance");
    }
}
