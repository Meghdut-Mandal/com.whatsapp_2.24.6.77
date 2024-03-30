package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.bridge.wfal.WfalManager;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.3PF  reason: invalid class name */
public final class AnonymousClass3PF {
    public ImageView A00;
    public C40771w5 A01;
    public boolean A02;
    public final ViewStub A03;
    public final TextView A04;
    public final RecyclerView A05;
    public final AnonymousClass17Y A06;
    public final WaTextView A07;
    public final WfalManager A08;
    public final C32001cn A09;
    public final C24361Cd A0A;
    public final AnonymousClass16D A0B;
    public final C226815j A0C;
    public final AnonymousClass16I A0D;
    public final AnonymousClass171 A0E;
    public final C19970wo A0F;
    public final C18820ts A0G;
    public final C24511Cs A0H;
    public final C233117z A0I;
    public final AnonymousClass334 A0J;
    public final C28781Ua A0K;
    public final Boolean A0L;
    public final Runnable A0M = new C81173wa((Object) this, 40);
    public final AnonymousClass00T A0N;

    public static final void A00(AnonymousClass3PF r8) {
        AnonymousClass17Y r7 = r8.A06;
        Runnable runnable = r8.A0M;
        r7.A0G(runnable);
        C40771w5 r1 = r8.A01;
        if (r1 == null) {
            throw C36331k8.A0d("adapter");
        } else if (r1.A00.size() > 0) {
            Iterator it = r1.A00.iterator();
            if (it.hasNext()) {
                long j = ((C597635e) it.next()).A00;
                while (it.hasNext()) {
                    long j2 = ((C597635e) it.next()).A00;
                    if (j < j2) {
                        j = j2;
                    }
                }
                r7.A0I(runnable, C36401kF.A03(j));
                return;
            }
            throw new NoSuchElementException();
        }
    }

    public AnonymousClass3PF(ViewGroup viewGroup, AnonymousClass17Y r13, WfalManager wfalManager, C24361Cd r15, AnonymousClass16D r16, AnonymousClass16I r17, AnonymousClass171 r18, C27731Pn r19, C19970wo r20, C19420v0 r21, C18820ts r22, C233117z r23, AnonymousClass334 r24, AnonymousClass33O r25, C28781Ua r26, Boolean bool) {
        C27731Pn r5 = r19;
        AnonymousClass00C.A0D(r5, 1);
        C19970wo r4 = r20;
        C19420v0 r6 = r21;
        C36321k7.A19(r6, r25, viewGroup, r4);
        C18820ts r1 = r22;
        C28781Ua r9 = r26;
        AnonymousClass171 r7 = r18;
        AnonymousClass16D r10 = r16;
        C36321k7.A1C(r13, r9, r10, r7, r1);
        AnonymousClass16I r3 = r17;
        AnonymousClass00C.A0D(r3, 11);
        AnonymousClass00C.A0D(r15, 13);
        C233117z r2 = r23;
        AnonymousClass334 r0 = r24;
        C36361kB.A1L(r2, r0);
        this.A0F = r4;
        this.A06 = r13;
        this.A0K = r9;
        this.A0B = r10;
        this.A0E = r7;
        this.A0G = r1;
        this.A0D = r3;
        this.A08 = wfalManager;
        this.A0A = r15;
        this.A0I = r2;
        this.A0J = r0;
        this.A0L = bool;
        this.A0N = C36431kI.A1I(new AnonymousClass4HH(viewGroup, r5));
        AnonymousClass4W3 A002 = AnonymousClass4W3.A00(this, 38);
        this.A0C = A002;
        AnonymousClass4W0 r42 = new AnonymousClass4W0(this, 17);
        this.A09 = r42;
        AnonymousClass4WB r12 = new AnonymousClass4WB(this, 23);
        this.A0H = r12;
        View inflate = C36351kA.A0C(viewGroup).inflate(R.layout.f9nameremoved, viewGroup, true);
        if (inflate != null) {
            ViewStub A0M2 = C36431kI.A0M(inflate, R.id.panel_action_buttons);
            if (r9.A00()) {
                AnonymousClass00C.A0B(A0M2);
                View A0E2 = C36401kF.A0E(A0M2, R.layout.f9nameremoved);
                Boolean bool2 = this.A0L;
                if (bool2 != null && this.A0K.A02()) {
                    AnonymousClass00C.A0B(A0E2);
                    ImageView A0N2 = C36391kE.A0N(C36431kI.A0M(A0E2, R.id.status_details_action_buttons_xfamily_crossposting_stub).inflate(), R.id.status_details_action_buttons_xfamily_fb_crossposting_icon);
                    A0N2.setColorFilter(AnonymousClass00F.A00(A0E2.getContext(), R.color.f6nameremoved));
                    C48772i1.A00(A0N2, this, 8);
                    this.A00 = A0N2;
                    if (this.A0K.A02()) {
                        A0N2.setVisibility(C36351kA.A00(bool2.booleanValue() ? 1 : 0));
                    }
                }
            } else {
                A0M2.setLayoutResource(R.layout.f9nameremoved);
                A0M2.inflate();
            }
            RecyclerView recyclerView = (RecyclerView) C36361kB.A0F(inflate, 16908298);
            this.A05 = recyclerView;
            viewGroup.getContext();
            C36321k7.A0Q(recyclerView);
            this.A03 = (ViewStub) C36361kB.A0G(inflate, R.id.list_container_header_stub);
            View findViewById = inflate.findViewById(16908292);
            TextView textView = (TextView) findViewById;
            textView.setText(r6.A2L() ? R.string.f12nameremoved : R.string.f12nameremoved);
            AnonymousClass00C.A08(findViewById);
            this.A04 = textView;
            this.A01 = new C40771w5(this);
            WaTextView A0Q = C36351kA.A0Q(viewGroup, R.id.title);
            this.A07 = A0Q;
            C33511fU.A03(A0Q);
            recyclerView.setAdapter(this.A01);
            r3.registerObserver(A002);
            r15.registerObserver(r42);
            r2.registerObserver(r12);
            return;
        }
        throw C36381kD.A0k();
    }
}
