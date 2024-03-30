package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.calling.controls.viewmodel.ParticipantsListViewModel;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.VoipCallControlBottomSheetV2;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4mS  reason: invalid class name and case insensitive filesystem */
public class C95894mS extends C02920Ck {
    public static final C95624lv A0D = new C95624lv();
    public AnonymousClass1LI A00;
    public ParticipantsListViewModel A01;
    public AnonymousClass16D A02;
    public AnonymousClass171 A03;
    public C21060yb A04;
    public C18820ts A05;
    public C20350xQ A06;
    public UserJid A07;
    public AnonymousClass1C6 A08;
    public C117955n6 A09;
    public RecyclerView A0A;
    public final C88514Sz A0B;
    public final AnonymousClass1RY A0C;

    public C95894mS(Context context, AnonymousClass1Pp r4, C27731Pn r5) {
        super((C02830Cb) A0D);
        this.A0B = new AnonymousClass3U5(r4, 1);
        this.A0C = r5.A05(context, "voip-call-control-bottom-sheet");
        A0B(true);
    }

    private void A00(int i) {
        C117955n6 r0 = this.A09;
        if (r0 != null) {
            VoipCallControlBottomSheetV2 voipCallControlBottomSheetV2 = r0.A00;
            if (voipCallControlBottomSheetV2.A0F != null && voipCallControlBottomSheetV2.A0E != null) {
                C36321k7.A1T("voip/VoipCallControlBottomSheetV2 scroll to position: ", AnonymousClass000.A0u(), i);
                voipCallControlBottomSheetV2.A0M.A07 = null;
                voipCallControlBottomSheetV2.A0F.post(new C81293wm((Object) voipCallControlBottomSheetV2, i, 22));
            }
        }
    }

    public void A0I(RecyclerView recyclerView) {
        Log.i("voip/ParticipantsListAdapter/onDetachedFromRecyclerView");
        this.A0C.A02();
    }

    public /* bridge */ /* synthetic */ void A0K(AnonymousClass0D3 r3) {
        C97014oG r32 = (C97014oG) r3;
        if (r32 instanceof C1029452q) {
            C1029452q r33 = (C1029452q) r32;
            r33.A0C();
            r33.A00 = null;
            AnonymousClass1RJ r1 = r33.A09;
            if (r1.A00 != null) {
                r1.A01().removeCallbacks(r33.A0A);
            }
        }
    }

    public void A0M(List list) {
        ArrayList A15;
        if (list == null) {
            A15 = null;
        } else {
            A15 = C36441kJ.A15(list);
        }
        super.A0M(A15);
    }

    public void A0N() {
        if (this.A0A != null) {
            for (int i = 0; i < A0J(); i++) {
                C1275168p r2 = (C1275168p) super.A0L(i);
                if (r2.A00 == 4) {
                    AnonymousClass0D3 A0Q = this.A0A.A0Q(i);
                    if (A0Q instanceof C97014oG) {
                        ((C97014oG) A0Q).A0B(r2);
                        return;
                    }
                    return;
                }
            }
        }
    }

    public void A0O(UserJid userJid) {
        this.A07 = userJid;
        if (userJid != null) {
            for (int i = 0; i < A0J(); i++) {
                C1275168p r1 = (C1275168p) super.A0L(i);
                if ((r1 instanceof C1029752t) && ((C1029752t) r1).A02.equals(this.A07)) {
                    A00(i);
                }
            }
        }
    }

    public /* bridge */ /* synthetic */ void BSE(AnonymousClass0D3 r3, int i) {
        C1275168p r1 = (C1275168p) super.A0L(i);
        C18740tg.A06(r1);
        ((C97014oG) r3).A0B(r1);
        if ((r1 instanceof C1029752t) && ((C1029752t) r1).A02.equals(this.A07)) {
            A00(i);
        }
    }

    public long A0E(int i) {
        int i2;
        C1275168p r1 = (C1275168p) super.A0L(i);
        if (r1 instanceof C1029752t) {
            i2 = ((C1029752t) r1).A02.hashCode();
        } else {
            i2 = r1.A00;
        }
        return (long) i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0032, code lost:
        r5 = (X.C1029452q) r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0P(com.whatsapp.jid.UserJid r8) {
        /*
            r7 = this;
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "voip/ParticipantsListAdapter/updateProfilePhoto "
            X.C36321k7.A1K(r8, r0, r1)
            r6 = 0
        L_0x000a:
            int r0 = r7.A0J()
            if (r6 >= r0) goto L_0x0047
            java.lang.Object r1 = super.A0L(r6)
            X.68p r1 = (X.C1275168p) r1
            boolean r0 = r1 instanceof X.C1029752t
            if (r0 == 0) goto L_0x0044
            androidx.recyclerview.widget.RecyclerView r0 = r7.A0A
            if (r0 == 0) goto L_0x0044
            X.52t r1 = (X.C1029752t) r1
            com.whatsapp.jid.UserJid r0 = r1.A02
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x0044
            androidx.recyclerview.widget.RecyclerView r0 = r7.A0A
            X.0D3 r5 = r0.A0Q(r6)
            boolean r0 = r5 instanceof X.C1029452q
            if (r0 == 0) goto L_0x0044
            X.52q r5 = (X.C1029452q) r5
            X.52t r0 = r5.A00
            if (r0 == 0) goto L_0x0044
            X.1RY r4 = r5.A06
            X.141 r3 = r0.A01
            android.widget.ImageView r2 = r5.A02
            r1 = 1
            X.4Sz r0 = r5.A05
            r4.A06(r2, r0, r3, r1)
        L_0x0044:
            int r6 = r6 + 1
            goto L_0x000a
        L_0x0047:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C95894mS.A0P(com.whatsapp.jid.UserJid):void");
    }

    public /* bridge */ /* synthetic */ AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        LayoutInflater A0C2 = C36351kA.A0C(viewGroup);
        if (i == 0) {
            List list = AnonymousClass0D3.A0I;
            return new C1028852k(A0C2.inflate(R.layout.f9nameremoved, viewGroup, false), this.A01);
        } else if (i == 2) {
            List list2 = AnonymousClass0D3.A0I;
            return new C1028952l(A0C2.inflate(R.layout.f9nameremoved, viewGroup, false), this.A01);
        } else if (i == 4) {
            List list3 = AnonymousClass0D3.A0I;
            return new C1029352p(A0C2.inflate(R.layout.f9nameremoved, viewGroup, false), this.A01, this.A02, this.A03, this.A06, this.A08);
        } else if (i == 5) {
            List list4 = AnonymousClass0D3.A0I;
            return new C1029252o(A0C2.inflate(R.layout.f9nameremoved, viewGroup, false), this.A01);
        } else if (i == 6) {
            List list5 = AnonymousClass0D3.A0I;
            return new C1029052m(A0C2.inflate(R.layout.f9nameremoved, viewGroup, false), this.A01);
        } else if (i != 7) {
            C18740tg.A0D(AnonymousClass000.A1O(i), "Unknown list item type");
            List list6 = AnonymousClass0D3.A0I;
            View inflate = A0C2.inflate(R.layout.f9nameremoved, viewGroup, false);
            ParticipantsListViewModel participantsListViewModel = this.A01;
            AnonymousClass171 r6 = this.A03;
            C21060yb r9 = this.A04;
            return new C1029452q(inflate, this.A00, participantsListViewModel, r6, this.A0B, this.A0C, r9);
        } else {
            List list7 = AnonymousClass0D3.A0I;
            return new C1029152n(A0C2.inflate(R.layout.f9nameremoved, viewGroup, false), this.A01);
        }
    }

    public int getItemViewType(int i) {
        C1275168p r0 = (C1275168p) super.A0L(i);
        C18740tg.A06(r0);
        return r0.A00;
    }

    public void A0H(RecyclerView recyclerView) {
        this.A0A = recyclerView;
    }
}
