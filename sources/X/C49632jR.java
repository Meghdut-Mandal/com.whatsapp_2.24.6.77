package X;

import android.content.Intent;
import android.os.SystemClock;
import com.whatsapp.R;
import com.whatsapp.acceptinvitelink.AcceptInviteLinkActivity;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;

/* renamed from: X.2jR  reason: invalid class name and case insensitive filesystem */
public class C49632jR extends C132446Tt {
    public int A00;
    public AnonymousClass147 A01;
    public final int A02;
    public final C20510xg A03;
    public final String A04;
    public final WeakReference A05;
    public final C19970wo A06;

    public C49632jR(AcceptInviteLinkActivity acceptInviteLinkActivity, C19970wo r3, C20510xg r4, String str, int i) {
        super(acceptInviteLinkActivity, true);
        this.A06 = r3;
        this.A03 = r4;
        this.A05 = AnonymousClass001.A0F(acceptInviteLinkActivity);
        this.A04 = str;
        this.A02 = i;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        int i;
        AcceptInviteLinkActivity acceptInviteLinkActivity = (AcceptInviteLinkActivity) this.A05.get();
        if (acceptInviteLinkActivity != null) {
            AnonymousClass147 r7 = this.A01;
            int i2 = this.A00;
            int i3 = this.A02;
            if (r7 == null) {
                C36321k7.A1S("acceptlink/sendjoin/failed/", AnonymousClass000.A0u(), i2);
                boolean A032 = acceptInviteLinkActivity.A0I.A03(i3);
                if (i2 == 401) {
                    i = R.string.f12nameremoved;
                    if (A032) {
                        i = R.string.f12nameremoved;
                    }
                } else if (i2 == 404) {
                    i = R.string.f12nameremoved;
                    if (A032) {
                        i = R.string.f12nameremoved;
                    }
                } else if (i2 != 419) {
                    i = R.string.f12nameremoved;
                    if (i2 != 429) {
                        if (i2 == 436) {
                            AcceptInviteLinkActivity.A07(acceptInviteLinkActivity, R.string.f12nameremoved);
                            C36401kF.A1B(acceptInviteLinkActivity, R.id.learn_more);
                            acceptInviteLinkActivity.findViewById(R.id.learn_more).setOnClickListener(new C48922iH(acceptInviteLinkActivity));
                            return;
                        } else if (i2 == 409) {
                            AnonymousClass11F r3 = (AnonymousClass11F) acceptInviteLinkActivity.A0N.get();
                            Intent A0D = C36371kC.A0D(acceptInviteLinkActivity, r3);
                            AnonymousClass3M9.A01(A0D, "AcceptInviteLinkActivity");
                            acceptInviteLinkActivity.A33(A0D, true);
                            if (r3 != null) {
                                acceptInviteLinkActivity.A04.Boy(new AnonymousClass74N(acceptInviteLinkActivity, r3, 30));
                                return;
                            }
                            return;
                        } else if (i2 != 410) {
                            i = R.string.f12nameremoved;
                        } else {
                            i = R.string.f12nameremoved;
                            if (A032) {
                                i = R.string.f12nameremoved;
                            }
                        }
                    }
                } else {
                    i = R.string.f12nameremoved;
                    if (A032) {
                        i = R.string.f12nameremoved;
                    }
                }
                AcceptInviteLinkActivity.A07(acceptInviteLinkActivity, i);
            } else if (!acceptInviteLinkActivity.A06.A0M(r7) || !acceptInviteLinkActivity.A08.A0C(r7)) {
                C36321k7.A1K(r7, "acceptlink/sendjoin/willwait/", AnonymousClass000.A0u());
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("acceptlink/wait/");
                C36321k7.A1N(acceptInviteLinkActivity.A0N.get(), A0u);
                Runnable runnable = acceptInviteLinkActivity.A0J;
                if (runnable == null) {
                    runnable = new C1496972k(acceptInviteLinkActivity, 12);
                    acceptInviteLinkActivity.A0J = runnable;
                }
                acceptInviteLinkActivity.A05.A0I(runnable, 32000);
            } else {
                C36321k7.A1K(r7, "acceptlink/processcode/exists/", AnonymousClass000.A0u());
                Intent A0D2 = C36371kC.A0D(acceptInviteLinkActivity, r7);
                AnonymousClass3M9.A01(A0D2, "AcceptInviteLinkActivity");
                acceptInviteLinkActivity.A33(A0D2, true);
            }
        }
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            this.A03.A08(new AnonymousClass4ZU(this, 0), new AnonymousClass4ZS(this, 0), this.A04).get(32000, TimeUnit.MILLISECONDS);
            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
            if (elapsedRealtime2 < 500) {
                SystemClock.sleep(500 - elapsedRealtime2);
                return null;
            }
        } catch (Exception e) {
            Log.w("acceptlink/sendjoin/failed/timeout", e);
        }
        return null;
    }
}
