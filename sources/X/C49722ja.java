package X;

import android.graphics.drawable.ColorDrawable;
import android.os.SystemClock;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.acceptinvitelink.AcceptInviteLinkActivity;
import com.whatsapp.components.button.ThumbnailButton;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;

/* renamed from: X.2ja  reason: invalid class name and case insensitive filesystem */
public class C49722ja extends C132446Tt {
    public int A00;
    public AnonymousClass3B2 A01;
    public final C20350xQ A02;
    public final C20510xg A03;
    public final AnonymousClass19A A04;
    public final String A05;
    public final WeakReference A06;
    public final C19970wo A07;

    public C49722ja(AcceptInviteLinkActivity acceptInviteLinkActivity, C19970wo r3, C20350xQ r4, C20510xg r5, AnonymousClass19A r6, String str) {
        super(acceptInviteLinkActivity, true);
        this.A07 = r3;
        this.A04 = r6;
        this.A02 = r4;
        this.A03 = r5;
        this.A06 = AnonymousClass001.A0F(acceptInviteLinkActivity);
        this.A05 = str;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        try {
            this.A04.A0B(32000);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                this.A03.A04(new AnonymousClass4ZR(this, 0), this.A05).get(32000, TimeUnit.MILLISECONDS);
                long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                if (elapsedRealtime2 < 500) {
                    SystemClock.sleep(500 - elapsedRealtime2);
                    return null;
                }
            } catch (Exception e) {
                Log.w("acceptlink/failed/timeout", e);
            }
        } catch (C33111ej unused) {
        }
        return null;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        boolean z;
        int i;
        AcceptInviteLinkActivity acceptInviteLinkActivity = (AcceptInviteLinkActivity) this.A06.get();
        if (acceptInviteLinkActivity != null) {
            String str = this.A05;
            AnonymousClass3B2 r3 = this.A01;
            int i2 = this.A00;
            if (r3 != null) {
                AnonymousClass1EM r0 = acceptInviteLinkActivity.A0I;
                int i3 = r3.A02;
                if (r0.A03(i3)) {
                    View A0B = C03570Gk.A0B(acceptInviteLinkActivity, R.id.group_photo_container);
                    C27751Pr r6 = acceptInviteLinkActivity.A0B;
                    ColorDrawable colorDrawable = new ColorDrawable(C015006m.A00(acceptInviteLinkActivity.getTheme(), acceptInviteLinkActivity.getResources(), C36411kG.A01(acceptInviteLinkActivity)));
                    C68443bu r1 = C68443bu.A00;
                    A0B.setBackground(C36371kC.A0F(colorDrawable, r1, r6));
                    ((ThumbnailButton) C03570Gk.A0B(acceptInviteLinkActivity, R.id.group_photo)).A05 = r1;
                }
                C220412q r02 = acceptInviteLinkActivity.A06;
                AnonymousClass147 r4 = r3.A05;
                if (!r02.A0M(r4) || !acceptInviteLinkActivity.A08.A0C(r4)) {
                    boolean BLh = acceptInviteLinkActivity.BLh();
                    StringBuilder A0u = AnonymousClass000.A0u();
                    if (!BLh) {
                        C36321k7.A1K(r4, "acceptlink/processcode/showconfirmation/", A0u);
                        z = false;
                    } else {
                        C36321k7.A1K(r4, "acceptlink/processcode/activityended/", A0u);
                        return;
                    }
                } else {
                    C36321k7.A1K(r4, "acceptlink/processcode/exists/", AnonymousClass000.A0u());
                    boolean A032 = acceptInviteLinkActivity.A0I.A03(i3);
                    AnonymousClass17Y r12 = acceptInviteLinkActivity.A05;
                    int i4 = R.string.f12nameremoved;
                    if (A032) {
                        i4 = R.string.f12nameremoved;
                    }
                    z = true;
                    r12.A06(i4, 1);
                }
                acceptInviteLinkActivity.A0G.A01(r3, 0);
                C62393Fz r8 = new C62393Fz(new C75263mw(acceptInviteLinkActivity), acceptInviteLinkActivity.A0H);
                r8.A00((GroupJid) null, (GroupJid) null, r8.A00.A09(), str, (String) null, "preview", "blob");
                TextView A0H = C36401kF.A0H(acceptInviteLinkActivity, R.id.invite_accept);
                if (z) {
                    i = R.string.f12nameremoved;
                } else {
                    boolean A033 = acceptInviteLinkActivity.A0I.A03(i3);
                    i = R.string.f12nameremoved;
                    if (A033) {
                        i = R.string.f12nameremoved;
                    }
                }
                A0H.setText(i);
                A0H.setOnClickListener(new AnonymousClass3YN(acceptInviteLinkActivity, r3, str, z));
                AcceptInviteLinkActivity.A01(acceptInviteLinkActivity);
                return;
            }
            C36321k7.A1S("acceptlink/processcode/failed/", AnonymousClass000.A0u(), i2);
            int i5 = R.string.f12nameremoved;
            if (i2 != 0) {
                i5 = R.string.f12nameremoved;
                if (i2 != 401) {
                    i5 = R.string.f12nameremoved;
                    if (i2 != 404) {
                        i5 = R.string.f12nameremoved;
                        if (i2 != 406) {
                            i5 = R.string.f12nameremoved;
                            if (i2 != 410) {
                                i5 = R.string.f12nameremoved;
                                if (i2 != 419) {
                                    i5 = R.string.f12nameremoved;
                                    if (i2 == 436) {
                                        AcceptInviteLinkActivity.A07(acceptInviteLinkActivity, R.string.f12nameremoved);
                                        C36401kF.A1B(acceptInviteLinkActivity, R.id.learn_more);
                                        acceptInviteLinkActivity.findViewById(R.id.learn_more).setOnClickListener(new C48922iH(acceptInviteLinkActivity));
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            AcceptInviteLinkActivity.A07(acceptInviteLinkActivity, i5);
        }
    }
}
