package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: X.3TV  reason: invalid class name */
public class AnonymousClass3TV {
    public View A00;
    public C07200Ws A01;
    public C07200Ws A02;
    public C07200Ws A03;
    public final int A04;
    public final C19730wQ A05;
    public final C88454St A06;
    public final AnonymousClass17X A07;
    public final AnonymousClass141 A08;
    public final C20810yC A09;
    public final AnonymousClass11F A0A;
    public final WeakReference A0B;
    public final C53452rL A0C;
    public final AnonymousClass1LV A0D;
    public final C220412q A0E;
    public final C232317r A0F;

    private void A02(Menu menu, int i, int i2) {
        menu.add(0, 2, i2, i).setIcon(A00(R.drawable.ic_btn_call_video));
    }

    private void A03(Menu menu, int i, int i2) {
        C18740tg.A0B(true);
        if (C34681hT.A0L(this.A09) && this.A0F.A0M(this.A0A)) {
            menu.add(0, i, i2, R.string.f12nameremoved).setIcon(A00(R.drawable.vec_ic_schedule_call_24dp));
        }
    }

    private Drawable A00(int i) {
        Context A0G = C36441kJ.A0G(this.A0B);
        if (A0G != null) {
            return AnonymousClass3UF.A03(A0G, i, AnonymousClass1MI.A01(this.A09));
        }
        return null;
    }

    private C07200Ws A01(View view) {
        C20810yC r3 = this.A09;
        boolean A022 = AnonymousClass1MI.A02(r3, (C21000yV) null, 4864);
        int i = R.style.f13nameremoved;
        if (A022) {
            i = R.style.f13nameremoved;
        }
        C07200Ws r4 = new C07200Ws(C36441kJ.A0G(this.A0B), view, 0, 0, i);
        C016307a r1 = r4.A03;
        if (AnonymousClass1MI.A02(r3, (C21000yV) null, 4497)) {
            r1.A0C = true;
        }
        r4.A01 = new AnonymousClass4Y5(this, 0);
        r4.A00 = new C89974Yp(this, 1);
        return r4;
    }

    public void A04(View view, int i) {
        C07200Ws r4;
        MenuItem add;
        int i2;
        WeakReference weakReference = this.A0B;
        if (weakReference.get() == null || C36441kJ.A0D(weakReference).isFinishing()) {
            Log.w("GroupCallMenuHelper/launchPopupMenu activity is finished/finishing");
            return;
        }
        this.A00 = view;
        view.setAlpha(0.5f);
        if (i == 0) {
            r4 = this.A03;
            if (r4 == null) {
                r4 = A01(view);
                C016307a r3 = r4.A03;
                r3.add(0, 1, 1, (int) R.string.f12nameremoved).setIcon(A00(R.drawable.ic_btn_call_audio));
                A03(r3, 3, 2);
                this.A03 = r4;
            }
        } else if (i != 1) {
            r4 = this.A01;
            if (i != 2) {
                if (r4 == null) {
                    r4 = A01(view);
                    C016307a r2 = r4.A03;
                    A02(r2, R.string.f12nameremoved, 1);
                    A03(r2, 5, 2);
                }
            } else if (r4 == null) {
                r4 = A01(view);
                C016307a r5 = r4.A03;
                AnonymousClass11F r6 = this.A0A;
                if (r6 instanceof AnonymousClass147) {
                    C20810yC r22 = this.A09;
                    if (C34681hT.A0C(this.A05, r22, this.A07.A07.A0B((AnonymousClass144) r6))) {
                        add = r5.add(0, 6, 1, (int) R.string.f12nameremoved);
                        i2 = R.drawable.vec_ic_action_voicechat;
                        add.setIcon(A00(i2));
                        A02(r5, R.string.f12nameremoved, 2);
                        A03(r5, 5, 3);
                    }
                }
                add = r5.add(0, 1, 1, (int) R.string.f12nameremoved);
                i2 = R.drawable.ic_btn_call_audio;
                add.setIcon(A00(i2));
                A02(r5, R.string.f12nameremoved, 2);
                A03(r5, 5, 3);
            }
            this.A01 = r4;
        } else {
            r4 = this.A02;
            if (r4 == null) {
                r4 = A01(view);
                C016307a r23 = r4.A03;
                A02(r23, R.string.f12nameremoved, 1);
                A03(r23, 4, 2);
                this.A02 = r4;
            }
        }
        r4.A00();
    }

    public AnonymousClass3TV(AnonymousClass01L r2, C19730wQ r3, C88454St r4, C53452rL r5, AnonymousClass1LV r6, C220412q r7, AnonymousClass1A5 r8, AnonymousClass17X r9, C232317r r10, C20810yC r11, AnonymousClass11F r12, int i) {
        this.A09 = r11;
        this.A05 = r3;
        this.A0E = r7;
        this.A0D = r6;
        this.A0F = r10;
        this.A0C = r5;
        this.A0A = r12;
        this.A0B = AnonymousClass001.A0F(r2);
        this.A06 = r4;
        this.A04 = i;
        this.A07 = r9;
        this.A08 = r8.A01(r12);
    }
}
