package com.whatsapp.polls;

import X.AnonymousClass00C;
import X.AnonymousClass01z;
import X.AnonymousClass060;
import X.AnonymousClass07B;
import X.AnonymousClass0I4;
import X.AnonymousClass11F;
import X.AnonymousClass2bS;
import X.AnonymousClass3MR;
import X.AnonymousClass3SJ;
import X.AnonymousClass5HF;
import X.AnonymousClass5ZU;
import X.C011004s;
import X.C012005e;
import X.C100964wK;
import X.C115285id;
import X.C115295ie;
import X.C165187t1;
import X.C18740tg;
import X.C36321k7;
import X.C36331k8;
import X.C36361kB;
import X.C36431kI;
import X.C36441kJ;
import X.C45462Rl;
import X.C48762i0;
import X.C64813Pn;
import X.C64953Qc;
import X.C65443Sb;
import X.C65493Sh;
import X.C90504aG;
import X.C95664lz;
import X.C95714m7;
import X.C95814mK;
import android.os.Bundle;
import android.os.Vibrator;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.R;
import com.whatsapp.filter.SmoothScrollLinearLayoutManager;
import java.util.List;

public class PollCreatorActivity extends C100964wK {
    public long A00;
    public Vibrator A01;
    public InputMethodManager A02;
    public SwitchCompat A03;
    public NestedScrollView A04;
    public RecyclerView A05;
    public AnonymousClass060 A06;
    public C115285id A07;
    public C115295ie A08;
    public C64953Qc A09;
    public AnonymousClass11F A0A;
    public C95814mK A0B;
    public PollCreatorViewModel A0C;
    public C65493Sh A0D;
    public C64813Pn A0E;
    public boolean A0F;
    public BottomSheetBehavior A0G;

    public void BQ6(String str) {
        if (str.equals("discard_edits")) {
            finish();
        }
    }

    public void onBackPressed() {
        PollCreatorViewModel pollCreatorViewModel = this.A0C;
        if (pollCreatorViewModel.A07.A00.isEmpty()) {
            for (AnonymousClass5HF r0 : pollCreatorViewModel.A0D) {
                if (!r0.A00.isEmpty()) {
                }
            }
            super.onBackPressed();
            return;
        }
        A07();
    }

    private void A07() {
        if (!AnonymousClass3SJ.A04(this)) {
            C65443Sb.A01(AnonymousClass5ZU.A00((AnonymousClass01z) null, Integer.valueOf(R.string.f12nameremoved), Integer.valueOf(R.string.f12nameremoved), Integer.valueOf(R.string.f12nameremoved), Integer.valueOf(R.color.f6nameremoved), "discard_edits", (String) null, (List) null, R.string.f12nameremoved), getSupportFragmentManager());
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A0F = AnonymousClass3MR.A00(this.A0D);
        setTitle(R.string.f12nameremoved);
        boolean z = this.A0F;
        int i = R.layout.f9nameremoved;
        if (z) {
            i = R.layout.f9nameremoved;
        }
        AnonymousClass07B A0Q = C36431kI.A0Q(this, C36361kB.A0O(this, i));
        C18740tg.A06(A0Q);
        A0Q.A0U(true);
        A0Q.A0I(R.string.f12nameremoved);
        this.A0A = C36331k8.A0F(this);
        this.A04 = (NestedScrollView) C012005e.A02(this.A00, R.id.poll_creator_container);
        this.A00 = getIntent().getLongExtra("quoted_message_row_id", 0);
        PollCreatorViewModel pollCreatorViewModel = (PollCreatorViewModel) C36441kJ.A0b(this).A00(PollCreatorViewModel.class);
        this.A0C = pollCreatorViewModel;
        C165187t1.A00(this, pollCreatorViewModel.A03, 33);
        C165187t1.A00(this, this.A0C.A0A, 31);
        C165187t1.A00(this, this.A0C.A0B, 34);
        C165187t1.A00(this, this.A0C.A09, 30);
        C165187t1.A00(this, this.A0C.A02, 32);
        String stringExtra = getIntent().getStringExtra("entry_string_text");
        if (!TextUtils.isEmpty(stringExtra)) {
            this.A0C.A07.A00 = stringExtra;
            getIntent().removeExtra("entry_string_text");
        }
        SwitchCompat switchCompat = (SwitchCompat) C012005e.A02(this.A00, R.id.single_option_control_switch);
        this.A03 = switchCompat;
        switchCompat.setText(R.string.f12nameremoved);
        RecyclerView A0J = C90504aG.A0J(this.A00, R.id.poll_creator_options_recycler_view);
        this.A05 = A0J;
        C011004s.A09(A0J, false);
        this.A01 = (Vibrator) getSystemService("vibrator");
        this.A02 = (InputMethodManager) getSystemService("input_method");
        new AnonymousClass0I4(new C95714m7(this)).A0D(this.A05);
        this.A05.setLayoutManager(new SmoothScrollLinearLayoutManager(1));
        C95814mK r1 = new C95814mK(new C95664lz(), this.A07, this.A08, this.A0C);
        this.A0B = r1;
        this.A05.setAdapter(r1);
        AnonymousClass060 r3 = (AnonymousClass060) C012005e.A02(this.A00, R.id.poll_create_button);
        this.A06 = r3;
        C36321k7.A0L(r3.getContext(), r3, this.A00, R.drawable.input_send);
        C48762i0.A00(this.A06, this, 11);
        C65493Sh r32 = this.A0D;
        AnonymousClass11F r2 = this.A0A;
        AnonymousClass00C.A0D(r2, 0);
        C45462Rl r12 = new C45462Rl();
        r12.A04 = C36361kB.A0i();
        C65493Sh.A00(r12, r2, r32);
        C65493Sh.A01(r12, r2, (AnonymousClass2bS) null);
        r32.A00.Bly(r12);
        if (this.A0F) {
            View A022 = C012005e.A02(this.A00, R.id.main);
            BottomSheetBehavior bottomSheetBehavior = new BottomSheetBehavior();
            this.A0G = bottomSheetBehavior;
            this.A0E.A02(A022, bottomSheetBehavior, this, this.A0C);
            C64813Pn.A00(this, A0Q);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.A09.A02(10);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        PollCreatorViewModel pollCreatorViewModel = this.A0C;
        if (pollCreatorViewModel.A07.A00.isEmpty()) {
            for (AnonymousClass5HF r0 : pollCreatorViewModel.A0D) {
                if (!r0.A00.isEmpty()) {
                }
            }
            finish();
            return true;
        }
        A07();
        return true;
    }

    public void onStart() {
        super.onStart();
        if (this.A0F) {
            this.A0E.A03(this.A0G, this);
        }
    }
}
