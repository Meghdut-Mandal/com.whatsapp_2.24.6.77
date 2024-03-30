package X;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.WaEditText;
import com.whatsapp.calling.callhistory.CallLogActivity;
import com.whatsapp.community.CommunityDeleteDialogFragment;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;

/* renamed from: X.4YO  reason: invalid class name */
public class AnonymousClass4YO implements C021809f {
    public Object A00;
    public final int A01;

    public AnonymousClass4YO(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public boolean BQg(MenuItem menuItem, AnonymousClass0V9 r7) {
        switch (this.A01) {
            case 0:
                if (menuItem.getItemId() == R.id.menuitem_clear_selected_calls_from_call_log) {
                    CallLogActivity callLogActivity = (CallLogActivity) this.A00;
                    if (callLogActivity.A0Y != null) {
                        HashSet hashSet = callLogActivity.A0k;
                        if (!hashSet.isEmpty()) {
                            hashSet.size();
                            callLogActivity.A0Y.size();
                            callLogActivity.A0K.A0B(C36441kJ.A15(hashSet));
                            callLogActivity.A0Y.removeAll(hashSet);
                            ArrayList arrayList = callLogActivity.A0Y;
                            if (arrayList == null || arrayList.isEmpty()) {
                                callLogActivity.finish();
                                return true;
                            }
                            AnonymousClass0V9 r0 = callLogActivity.A04;
                            if (r0 == null) {
                                return true;
                            }
                            r0.A05();
                            return true;
                        }
                    }
                    if (callLogActivity.A0Y == null) {
                        Log.e("callLogActivity/onActionItemClicked/delete: Calls are null");
                    }
                    if (!callLogActivity.A0k.isEmpty()) {
                        return true;
                    }
                    Log.e("callLogActivity/onActionItemClicked/delete: no calls selected");
                    return true;
                } else if (menuItem.getItemId() != R.id.menuitem_call_log_bugnub) {
                    return false;
                } else {
                    CallLogActivity callLogActivity2 = (CallLogActivity) this.A00;
                    callLogActivity2.startActivity(AnonymousClass190.A0Q(callLogActivity2, (Uri) null, callLogActivity2.A00, true));
                    return true;
                }
            case 1:
                AnonymousClass00C.A0D(menuItem, 1);
                if (menuItem.getItemId() != R.id.menuitem_delete) {
                    return false;
                }
                C608239m r2 = (C608239m) this.A00;
                ArrayList A15 = C36441kJ.A15(((AnonymousClass3I2) r2.A04.A04()).A00);
                AnonymousClass00C.A0D(A15, 0);
                CommunityDeleteDialogFragment communityDeleteDialogFragment = new CommunityDeleteDialogFragment();
                Bundle A07 = AnonymousClass001.A07();
                A07.putStringArrayList("selectedParentJids", AnonymousClass143.A07(A15));
                communityDeleteDialogFragment.A17(A07);
                ((C225314u) C36381kD.A0A(r2.A01)).Btm(communityDeleteDialogFragment);
                return true;
            default:
                return false;
        }
    }

    public boolean BUq(Menu menu, AnonymousClass0V9 r6) {
        int i;
        int i2;
        switch (this.A01) {
            case 0:
                if (((C225314u) this.A00).A0D.A0E(3321)) {
                    AnonymousClass17Z r0 = AnonymousClass17Z.$redex_init_class;
                }
                i = R.id.menuitem_clear_selected_calls_from_call_log;
                i2 = R.string.f12nameremoved;
                break;
            case 1:
                AnonymousClass00C.A0D(menu, 1);
                i = R.id.menuitem_delete;
                i2 = R.string.f12nameremoved;
                break;
            default:
                C70803fk r2 = (C70803fk) this.A00;
                View A0E = C36361kB.A0E(LayoutInflater.from(r2.A2l.getSupportActionBar().A0A()), (ViewGroup) null, R.layout.f9nameremoved);
                AnonymousClass155 A0C = C70803fk.A0C(r2);
                r6.A09(A0E);
                if (r2.A3z.A09() && (A0C instanceof AnonymousClass15G)) {
                    AnonymousClass15G.A0F((AnonymousClass15G) A0C, 8);
                }
                WaEditText waEditText = (WaEditText) A0E.findViewById(R.id.search_src_text);
                r2.A1g = waEditText;
                if (waEditText == null) {
                    return false;
                }
                C89574Xb.A00(waEditText, this, 4);
                r2.A1g.addTextChangedListener(r2.A6z);
                C89384Wi.A00(r2.A1g, this, 3);
                View A02 = C012005e.A02(A0E, R.id.search_up);
                r2.A0L = A02;
                C66963Xz.A00(A02, this, 26);
                View A022 = C012005e.A02(A0E, R.id.search_down);
                r2.A0J = A022;
                C66963Xz.A00(A022, this, 27);
                r2.A0M = C012005e.A02(A0E, R.id.search_up_progress_bar);
                r2.A0K = C012005e.A02(A0E, R.id.search_down_progress_bar);
                r2.A1g.setText(r2.A2x.A0H);
                r2.A1g.selectAll();
                r2.A1g.requestFocus();
                r2.A1g.setSelected(true);
                return true;
        }
        menu.add(0, i, 0, i2).setIcon(R.drawable.ic_action_delete).setShowAsAction(2);
        return true;
    }

    public void BVS(AnonymousClass0V9 r6) {
        Object tag;
        switch (this.A01) {
            case 0:
                CallLogActivity callLogActivity = (CallLogActivity) this.A00;
                if (!callLogActivity.isFinishing()) {
                    HashSet hashSet = callLogActivity.A0k;
                    if (hashSet.size() > 0) {
                        hashSet.clear();
                        for (int i = 0; i < callLogActivity.A02.getChildCount(); i++) {
                            View childAt = callLogActivity.A02.getChildAt(i);
                            if (!(childAt == null || (tag = childAt.getTag()) == null || !(tag instanceof AnonymousClass3FG))) {
                                ((AnonymousClass3FG) tag).A00(false, true, false);
                            }
                        }
                    }
                    callLogActivity.A04 = null;
                    return;
                }
                return;
            case 1:
                C608239m r1 = (C608239m) this.A00;
                ((AnonymousClass3I2) r1.A04.A04()).A01.invoke();
                r1.A00 = null;
                return;
            default:
                r6.A09((View) null);
                C70803fk r0 = (C70803fk) this.A00;
                r0.A0i = null;
                C70803fk.A0m(r0);
                return;
        }
    }

    public boolean BdJ(Menu menu, AnonymousClass0V9 r8) {
        switch (this.A01) {
            case 0:
                CallLogActivity callLogActivity = (CallLogActivity) this.A00;
                Locale A0x = C36401kF.A0x(callLogActivity.A00);
                Object[] A0L = AnonymousClass001.A0L();
                AnonymousClass000.A1J(A0L, callLogActivity.A0k.size());
                r8.A0B(String.format(A0x, "%d", A0L));
                return true;
            case 1:
                AnonymousClass00C.A0D(r8, 0);
                C608239m r4 = (C608239m) this.A00;
                Locale A0x2 = C36401kF.A0x(r4.A03);
                Object[] objArr = new Object[1];
                AnonymousClass000.A1L(objArr, ((AnonymousClass3I2) r4.A04.A04()).A00.size(), 0);
                String format = String.format(A0x2, "%d", Arrays.copyOf(objArr, 1));
                AnonymousClass00C.A08(format);
                r8.A0B(format);
                AnonymousClass01L r2 = r4.A01;
                C24801Dv.A03(C36361kB.A0H(r2, R.id.action_mode_bar), r2.getWindowManager());
                return true;
            default:
                return false;
        }
    }
}
