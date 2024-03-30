package X;

import android.content.Intent;
import android.os.SystemClock;
import com.whatsapp.R;
import com.whatsapp.invites.ViewGroupInviteActivity;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.button.WDSButton;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;

/* renamed from: X.2jY  reason: invalid class name and case insensitive filesystem */
public class C49702jY extends C132446Tt {
    public int A00;
    public int A01;
    public AnonymousClass147 A02;
    public final C20510xg A03;
    public final C605738j A04;
    public final WeakReference A05;
    public final C19970wo A06;

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        int i;
        ViewGroupInviteActivity viewGroupInviteActivity = (ViewGroupInviteActivity) this.A05.get();
        if (viewGroupInviteActivity != null) {
            AnonymousClass147 r1 = this.A02;
            int i2 = this.A00;
            int i3 = this.A01;
            if (r1 == null) {
                if (i2 != 400) {
                    i = R.string.f12nameremoved;
                    if (i2 != 419) {
                        if (i2 != 500) {
                            i = R.string.f12nameremoved;
                            if (i2 != 404) {
                                i = R.string.f12nameremoved;
                                if (i2 != 405) {
                                    i = R.string.f12nameremoved;
                                    if (i2 != 409) {
                                        i = R.string.f12nameremoved;
                                        if (i2 != 410) {
                                            i = R.string.f12nameremoved;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    ViewGroupInviteActivity.A01(viewGroupInviteActivity, i);
                }
                i = R.string.f12nameremoved;
                ViewGroupInviteActivity.A01(viewGroupInviteActivity, i);
            } else if (i3 == 1) {
                viewGroupInviteActivity.A02.setVisibility(4);
                viewGroupInviteActivity.A01.setVisibility(0);
                AnonymousClass3HI r2 = viewGroupInviteActivity.A0F;
                r2.A07.setText(R.string.f12nameremoved);
                WDSButton wDSButton = r2.A0C;
                wDSButton.setText(R.string.f12nameremoved);
                wDSButton.setEnabled(false);
                r2.A0D.setVisibility(8);
            } else if (!viewGroupInviteActivity.A0B.A0M(r1) || !viewGroupInviteActivity.A0D.A0C(r1)) {
                Runnable runnable = viewGroupInviteActivity.A0M;
                if (runnable == null) {
                    runnable = new C80253v6(viewGroupInviteActivity, 41);
                    viewGroupInviteActivity.A0M = runnable;
                }
                viewGroupInviteActivity.A05.A0I(runnable, 32000);
            } else {
                Intent A0D = C36371kC.A0D(viewGroupInviteActivity, r1);
                AnonymousClass3M9.A01(A0D, "ViewGroupInviteActivity:onGroupJoined");
                viewGroupInviteActivity.A33(A0D, true);
            }
        }
    }

    public C49702jY(C19970wo r2, C20510xg r3, ViewGroupInviteActivity viewGroupInviteActivity, C605738j r5) {
        this.A06 = r2;
        this.A03 = r3;
        this.A05 = AnonymousClass001.A0F(viewGroupInviteActivity);
        this.A04 = r5;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            this.A03.A07(new AnonymousClass4ZU(this, 2), new AnonymousClass4ZS(this, 2), this.A04).get(32000, TimeUnit.MILLISECONDS);
            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
            if (elapsedRealtime2 < 500) {
                SystemClock.sleep(500 - elapsedRealtime2);
                return null;
            }
        } catch (Exception e) {
            Log.w("ViewGroupInviteActivityJoinGroupTask send join timed out", e);
        }
        return null;
    }
}
