package X;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import com.whatsapp.ListItemWithLeftIcon;
import com.whatsapp.ListItemWithRightIcon;
import com.whatsapp.R;
import com.whatsapp.wds.components.toggle.WDSSwitch;

/* renamed from: X.3PA  reason: invalid class name */
public final class AnonymousClass3PA {
    public TextView A00;
    public SwitchCompat A01;
    public TextView A02;
    public final Context A03;
    public final C009904e A04;
    public final AnonymousClass3MH A05 = new AnonymousClass3MH(this, 1);
    public final AnonymousClass3MH A06 = new AnonymousClass3MH(this, 2);
    public final AnonymousClass22V A07;
    public final AnonymousClass3L5 A08;
    public final C220412q A09;
    public final AnonymousClass11F A0A;
    public final AnonymousClass005 A0B;

    public static final void A00(AnonymousClass3PA r3, C51832oS r4) {
        if (r4 == C51832oS.ERROR_AUTH_NOT_SETUP) {
            C235718z A0a = C36411kG.A0a(r3.A0B);
            Activity A002 = C24801Dv.A00(r3.A03);
            AnonymousClass00C.A0E(A002, "null cannot be cast to non-null type com.whatsapp.WaBaseActivity");
            A0a.A0E((AnonymousClass155) A002, r3.A0A);
        }
        SwitchCompat switchCompat = r3.A01;
        if (switchCompat != null) {
            C235718z A0a2 = C36411kG.A0a(r3.A0B);
            switchCompat.setChecked(A0a2.A06.A0Q(r3.A0A));
        }
    }

    public final void A01() {
        C65073Qp A0W = C36371kC.A0W(this.A09, this.A0A);
        AnonymousClass22V r1 = this.A07;
        if (r1 != null) {
            AnonymousClass005 r2 = this.A0B;
            if (C36411kG.A0a(r2).A0O() && A0W != null) {
                this.A02 = C36391kE.A0O(r1, R.id.list_item_title);
                this.A00 = C36391kE.A0O(r1, R.id.list_item_description);
                this.A01 = (SwitchCompat) r1.findViewById(R.id.chat_lock_view_switch);
                if (C36411kG.A0a(r2).A08.A0E(5498)) {
                    Context context = this.A03;
                    Activity A002 = C24801Dv.A00(context);
                    AnonymousClass00C.A0E(A002, "null cannot be cast to non-null type com.whatsapp.WaBaseActivity");
                    if (this.A01 == null) {
                        LinearLayout.LayoutParams A0N = C36371kC.A0N();
                        WDSSwitch wDSSwitch = new WDSSwitch(context, (AttributeSet) null, 0, 6, (C05250Oz) null);
                        wDSSwitch.setId(R.id.chat_lock_view_switch);
                        wDSSwitch.setLayoutParams(A0N);
                        if (this.A01 == null) {
                            if (r1 instanceof ListItemWithLeftIcon) {
                                ((ListItemWithLeftIcon) r1).A07(wDSSwitch);
                            } else if (r1 instanceof ListItemWithRightIcon) {
                                C36411kG.A0O(r1, R.id.left_view_container).addView(wDSSwitch);
                            }
                        }
                        this.A01 = wDSSwitch;
                    }
                    r1.setVisibility(0);
                    SwitchCompat switchCompat = this.A01;
                    if (switchCompat != null) {
                        switchCompat.setChecked(A0W.A0j);
                    }
                    SwitchCompat switchCompat2 = this.A01;
                    if (switchCompat2 != null) {
                        C48812i6.A00(switchCompat2, this, A002, 29);
                    }
                    TextView textView = this.A00;
                    if (textView != null) {
                        textView.setText(R.string.f12nameremoved);
                        return;
                    }
                    return;
                }
                r1.setVisibility(8);
            }
        }
    }

    public AnonymousClass3PA(Context context, C009904e r4, AnonymousClass22V r5, AnonymousClass3L5 r6, C220412q r7, AnonymousClass11F r8, AnonymousClass005 r9) {
        C36321k7.A1B(r7, r6, r9, context, r8);
        this.A09 = r7;
        this.A08 = r6;
        this.A0B = r9;
        this.A03 = context;
        this.A0A = r8;
        this.A07 = r5;
        this.A04 = r4;
    }
}
