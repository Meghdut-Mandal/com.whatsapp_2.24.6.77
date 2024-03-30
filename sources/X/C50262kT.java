package X;

import android.os.SystemClock;
import com.whatsapp.R;
import com.whatsapp.invites.ViewGroupInviteActivity;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* renamed from: X.2kT  reason: invalid class name and case insensitive filesystem */
public class C50262kT extends C132446Tt {
    public int A00;
    public AnonymousClass3B2 A01;
    public final AnonymousClass16D A02;
    public final AnonymousClass171 A03;
    public final C220412q A04;
    public final AnonymousClass17X A05;
    public final C20510xg A06;
    public final AnonymousClass19A A07;
    public final C605738j A08;
    public final AnonymousClass2bQ A09;
    public final WeakReference A0A;
    public final C19730wQ A0B;
    public final C19970wo A0C;
    public final C19630wG A0D;
    public final C20810yC A0E;

    public static void A00(C50262kT r13, AnonymousClass147 r14, UserJid userJid, AnonymousClass3QL r16, String str, String str2, Collection collection, int i, int i2, int i3, long j) {
        String str3 = str;
        ArrayList A14 = C36441kJ.A14(collection.size());
        ArrayList A0I = AnonymousClass001.A0I();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            AnonymousClass141 A082 = r13.A02.A08(C36401kF.A0a(it));
            if (!(A082 == null || A082.A0F == null)) {
                A14.add(A082);
                A0I.add(A082.A0J());
            }
        }
        Collections.sort(A14, new AnonymousClass2VK(r13.A0B, r13.A03, r13));
        AnonymousClass147 r2 = r14;
        if (AnonymousClass3M0.A00(r13.A02.A0D(r14), r13.A0E)) {
            str3 = AnonymousClass3SP.A02(r13.A0D, A0I, collection.size());
        }
        r13.A01 = new AnonymousClass3B2(r2, userJid, r16, str3, str2, A14, i, i2, i3, j);
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        AnonymousClass141 A082;
        if (this.A09.A1J.A02) {
            AnonymousClass147 A022 = C65533Sl.A02(this.A08.A01);
            AnonymousClass16D r0 = this.A02;
            AnonymousClass141 A0D2 = r0.A0D(A022);
            UserJid userJid = null;
            if (!(A022 == null || (A082 = r0.A08(A022)) == null)) {
                userJid = A082.A0I;
            }
            C20760y7 A0R = C36381kD.A0R(this.A05, A022);
            HashSet hashSet = new HashSet(A0R.size());
            C225614x it = A0R.iterator();
            while (it.hasNext()) {
                hashSet.add(((AnonymousClass6PM) it.next()).A03);
            }
            long A012 = AnonymousClass6R8.A01(A0D2.A0V, Long.MIN_VALUE);
            A00(this, A022, userJid, A0D2.A0K, this.A03.A0H(A0D2), (String) null, hashSet, hashSet.size(), this.A04.A05(A022), 0, A012);
            return null;
        }
        try {
            this.A07.A0B(32000);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                this.A06.A03(new AnonymousClass4ZR(this, 3), this.A08).get(32000, TimeUnit.MILLISECONDS);
                long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                if (elapsedRealtime2 < 500) {
                    SystemClock.sleep(500 - elapsedRealtime2);
                }
            } catch (Exception e) {
                Log.w("ViewGroupInviteActivity/failed/timeout", e);
                return null;
            }
        } catch (C33111ej unused) {
        }
        return null;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        AnonymousClass141 A082;
        ViewGroupInviteActivity viewGroupInviteActivity = (ViewGroupInviteActivity) this.A0A.get();
        if (viewGroupInviteActivity != null) {
            AnonymousClass3B2 r6 = this.A01;
            int i = this.A00;
            if (r6 != null) {
                viewGroupInviteActivity.A01.setVisibility(0);
                AnonymousClass3HI r5 = viewGroupInviteActivity.A0F;
                C605738j r0 = viewGroupInviteActivity.A0I;
                C18740tg.A06(r0);
                r5.A01(r6, r0.A00 * 1000);
                viewGroupInviteActivity.A02.setVisibility(8);
                C605738j r3 = viewGroupInviteActivity.A0I;
                if (r3 == null) {
                    return;
                }
                if (!viewGroupInviteActivity.A0N || (A082 = viewGroupInviteActivity.A05.A08(r3.A01)) == null) {
                    viewGroupInviteActivity.A0E.A0D(new C75203mq(viewGroupInviteActivity), viewGroupInviteActivity.A0I);
                    return;
                }
                viewGroupInviteActivity.A07.A08(viewGroupInviteActivity.A03, A082);
                return;
            }
            viewGroupInviteActivity.A01.setVisibility(4);
            viewGroupInviteActivity.A02.setVisibility(4);
            int i2 = R.string.f12nameremoved;
            if (i != 403) {
                if (i == 404 || i == 406) {
                    boolean A032 = viewGroupInviteActivity.A0L.A03(viewGroupInviteActivity.A00);
                    i2 = R.string.f12nameremoved;
                    if (A032) {
                        i2 = R.string.f12nameremoved;
                    }
                } else {
                    boolean A033 = viewGroupInviteActivity.A0L.A03(viewGroupInviteActivity.A00);
                    i2 = R.string.f12nameremoved;
                    if (A033) {
                        i2 = R.string.f12nameremoved;
                    }
                }
            }
            ViewGroupInviteActivity.A01(viewGroupInviteActivity, i2);
        }
    }

    public C50262kT(C19730wQ r2, AnonymousClass16D r3, AnonymousClass171 r4, C19970wo r5, C19630wG r6, C220412q r7, AnonymousClass17X r8, C20810yC r9, C20510xg r10, ViewGroupInviteActivity viewGroupInviteActivity, AnonymousClass19A r12, C605738j r13, AnonymousClass2bQ r14) {
        this.A0C = r5;
        this.A0E = r9;
        this.A0B = r2;
        this.A0D = r6;
        this.A04 = r7;
        this.A07 = r12;
        this.A02 = r3;
        this.A03 = r4;
        this.A06 = r10;
        this.A05 = r8;
        this.A0A = AnonymousClass001.A0F(viewGroupInviteActivity);
        this.A09 = r14;
        this.A08 = r13;
    }
}
