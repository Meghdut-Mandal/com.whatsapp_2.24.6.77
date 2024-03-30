package X;

import android.graphics.Rect;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.whatsapp.status.playback.StatusPlaybackActivity;
import com.whatsapp.status.playback.fragment.StatusPlaybackBaseFragment;
import com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment;
import com.whatsapp.status.playback.fragment.StatusPlaybackFragment;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3be  reason: invalid class name and case insensitive filesystem */
public final class C68283be implements AnonymousClass02G {
    public boolean A00;
    public int A01 = -1;
    public StatusPlaybackFragment A02;
    public final Rect A03 = AnonymousClass001.A06();
    public final Rect A04 = AnonymousClass001.A06();
    public final WeakReference A05;

    public void BcA(int i) {
        int i2;
        WeakReference weakReference = this.A05;
        StatusPlaybackActivity statusPlaybackActivity = (StatusPlaybackActivity) weakReference.get();
        if (statusPlaybackActivity != null) {
            if (i == 0) {
                statusPlaybackActivity.A04 = false;
                this.A01 = -1;
                this.A00 = false;
                this.A02 = null;
                C225314u A0W = C36411kG.A0W(weakReference);
                if (A0W != null) {
                    List A2m = A0W.A2m();
                    ArrayList A0I = AnonymousClass001.A0I();
                    for (Object next : A2m) {
                        if ((next instanceof StatusPlaybackFragment) && next != null) {
                            A0I.add(next);
                        }
                    }
                    ArrayList<StatusPlaybackFragment> A0I2 = AnonymousClass001.A0I();
                    for (Object next2 : A0I) {
                        C36391kE.A1V(next2, A0I2, ((StatusPlaybackFragment) next2).A00 ? 1 : 0);
                    }
                    for (StatusPlaybackFragment statusPlaybackFragment : A0I2) {
                        AnonymousClass3LC A052 = StatusPlaybackContactFragment.A05((StatusPlaybackContactFragment) statusPlaybackFragment);
                        if (A052 != null && A052.A05) {
                            C47592fB r1 = (C47592fB) A052;
                            r1.A05 = false;
                            r1.A0L(0);
                        }
                    }
                    this.A00 = false;
                }
                Runnable runnable = statusPlaybackActivity.A01;
                if (runnable != null) {
                    runnable.run();
                }
                statusPlaybackActivity.A01 = null;
                i2 = 0;
            } else {
                if (!statusPlaybackActivity.A04) {
                    statusPlaybackActivity.A04 = true;
                    this.A01 = statusPlaybackActivity.A08.getCurrentItem();
                }
                i2 = 2;
                if (i == 1) {
                    i2 = 1;
                } else if (i != 2) {
                    throw AnonymousClass001.A09("Invalid scrollState value from ViewPager");
                }
            }
            C225314u A0W2 = C36411kG.A0W(weakReference);
            if (A0W2 != null) {
                List A2m2 = A0W2.A2m();
                ArrayList<StatusPlaybackFragment> A0I3 = AnonymousClass001.A0I();
                for (Object next3 : A2m2) {
                    if ((next3 instanceof StatusPlaybackFragment) && next3 != null) {
                        A0I3.add(next3);
                    }
                }
                for (StatusPlaybackFragment statusPlaybackFragment2 : A0I3) {
                    boolean A1P = AnonymousClass000.A1P(i2);
                    AnonymousClass3LC A053 = StatusPlaybackContactFragment.A05((StatusPlaybackContactFragment) ((StatusPlaybackBaseFragment) statusPlaybackFragment2));
                    if (A053 != null) {
                        ((C47592fB) A053).A0D().A0I(A1P);
                    }
                }
            }
        }
    }

    public void BcC(int i) {
        boolean z;
        WeakReference weakReference = this.A05;
        StatusPlaybackActivity statusPlaybackActivity = (StatusPlaybackActivity) weakReference.get();
        if (statusPlaybackActivity != null && i != statusPlaybackActivity.A05) {
            statusPlaybackActivity.A02 = false;
            StatusPlaybackActivity statusPlaybackActivity2 = (StatusPlaybackActivity) weakReference.get();
            if (statusPlaybackActivity2 != null) {
                AnonymousClass332 r9 = (AnonymousClass332) statusPlaybackActivity2.A0D.A01.get(i);
                List A2m = statusPlaybackActivity2.A2m();
                ArrayList A0I = AnonymousClass001.A0I();
                for (Object next : A2m) {
                    if ((next instanceof StatusPlaybackFragment) && next != null) {
                        A0I.add(next);
                    }
                }
                ArrayList A0I2 = AnonymousClass001.A0I();
                Iterator it = A0I.iterator();
                while (true) {
                    z = true;
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next2 = it.next();
                    StatusPlaybackFragment statusPlaybackFragment = (StatusPlaybackFragment) next2;
                    if (!AnonymousClass00C.A0J(statusPlaybackFragment.A1Z(), r9.A00.A09.getRawString()) && statusPlaybackFragment.A00) {
                        A0I2.add(next2);
                    }
                }
                Iterator it2 = A0I2.iterator();
                while (it2.hasNext()) {
                    StatusPlaybackFragment statusPlaybackFragment2 = (StatusPlaybackFragment) it2.next();
                    boolean z2 = false;
                    if (i > statusPlaybackActivity2.A05) {
                        z2 = true;
                    }
                    int i2 = statusPlaybackActivity2.A07;
                    if (i2 != 0) {
                        statusPlaybackActivity2.A07 = 0;
                    } else {
                        i2 = 6;
                        if (z2) {
                            i2 = 7;
                        }
                    }
                    AnonymousClass3LC A052 = StatusPlaybackContactFragment.A05((StatusPlaybackContactFragment) statusPlaybackFragment2);
                    if (A052 != null && A052.A05) {
                        C47592fB r1 = (C47592fB) A052;
                        r1.A05 = false;
                        r1.A0L(i2);
                    }
                    statusPlaybackFragment2.A1c();
                }
                StatusPlaybackFragment A3j = statusPlaybackActivity2.A3j(r9);
                if (!(A3j == null || A3j.A00)) {
                    A3j.A1b();
                    if (i <= statusPlaybackActivity2.A05) {
                        z = false;
                    }
                    int i3 = statusPlaybackActivity2.A06;
                    if (i3 != 0) {
                        statusPlaybackActivity2.A06 = 0;
                    } else {
                        i3 = 2;
                        if (z) {
                            i3 = 3;
                        }
                    }
                    A3j.A1d(i3);
                }
            }
            statusPlaybackActivity.A05 = i;
        }
    }

    public C68283be(StatusPlaybackActivity statusPlaybackActivity) {
        this.A05 = AnonymousClass001.A0F(statusPlaybackActivity);
    }

    public void BcB(int i, float f, int i2) {
        View view;
        ViewPager viewPager;
        if (!Float.isNaN(f) && f != 0.0f && f != 1.0f) {
            boolean A1S = AnonymousClass000.A1S(i, this.A01);
            StatusPlaybackActivity statusPlaybackActivity = (StatusPlaybackActivity) this.A05.get();
            if (statusPlaybackActivity != null && !this.A00) {
                StatusPlaybackFragment statusPlaybackFragment = this.A02;
                if (statusPlaybackFragment == null) {
                    if (A1S) {
                        i++;
                    }
                    statusPlaybackFragment = statusPlaybackActivity.A3i(i);
                    this.A02 = statusPlaybackFragment;
                    if (statusPlaybackFragment == null) {
                        return;
                    }
                }
                if (statusPlaybackFragment.A00 && (view = statusPlaybackFragment.A0F) != null && (viewPager = statusPlaybackActivity.A08) != null && viewPager.isShown() && view.isShown()) {
                    Rect rect = this.A04;
                    viewPager.getGlobalVisibleRect(rect);
                    Rect rect2 = this.A03;
                    view.getGlobalVisibleRect(rect2);
                    if (rect.intersect(rect2)) {
                        int i3 = statusPlaybackActivity.A06;
                        if (i3 != 0) {
                            statusPlaybackActivity.A06 = 0;
                        } else {
                            i3 = 2;
                            if (A1S) {
                                i3 = 3;
                            }
                        }
                        statusPlaybackFragment.A1d(i3);
                        this.A00 = true;
                    }
                }
            }
        }
    }
}
