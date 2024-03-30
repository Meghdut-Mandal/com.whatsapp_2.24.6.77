package X;

import android.app.Activity;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import androidx.appcompat.widget.SearchView;
import com.whatsapp.R;
import com.whatsapp.blocklist.UnblockDialogFragment;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.IndiaUpiPaymentMethodSelectionActivity;
import com.whatsapp.payments.ui.PaymentSettingsFragment;
import com.whatsapp.profile.AboutStatusBlockListPickerActivity;
import com.whatsapp.profile.ProfilePhotoBlockListPickerActivity;
import com.whatsapp.status.audienceselector.StatusRecipientsActivity;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class B89 implements AdapterView.OnItemClickListener {
    public Object A00;
    public final int A01;

    public B89(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        SearchView searchView;
        switch (this.A01) {
            case 0:
                C173788Ta r4 = (C173788Ta) this.A00;
                if (view.getTag() instanceof AnonymousClass9LY) {
                    UserJid userJid = ((AnonymousClass9LY) view.getTag()).A03;
                    if (!r4.A05.A0O(userJid)) {
                        Set set = r4.A0S;
                        if (set.contains(userJid)) {
                            set.remove(userJid);
                        } else {
                            set.add(userJid);
                        }
                        if (!TextUtils.isEmpty(r4.A0G) && set.contains(userJid) && (searchView = r4.A0E.A00) != null) {
                            EditText editText = (EditText) searchView.findViewById(R.id.search_src_text);
                            editText.setSelection(0, editText.length());
                        }
                        r4.A0R.add(userJid);
                        Handler handler = r4.A0N;
                        Runnable runnable = r4.A0P;
                        handler.removeCallbacks(runnable);
                        handler.postDelayed(runnable, 200);
                        r4.A3m();
                        r4.A0O.notifyDataSetChanged();
                        return;
                    } else if (r4 instanceof StatusRecipientsActivity) {
                        AnonymousClass141 A0D = r4.A08.A0D(userJid);
                        C36331k8.A12(UnblockDialogFragment.A03(new A9Z(r4, A0D), C36391kE.A0v(r4, r4.A0A.A0H(A0D), AnonymousClass001.A0L(), 0, R.string.f12nameremoved), R.string.f12nameremoved, false), r4);
                        return;
                    } else if (!(r4 instanceof ProfilePhotoBlockListPickerActivity) && !(r4 instanceof AboutStatusBlockListPickerActivity)) {
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 1:
                ((Activity) this.A00).openContextMenu(view);
                return;
            case 2:
                C178808hb r1 = (C178808hb) this.A00;
                r1.BcR((C207249un) r1.A0C.A00.get(i));
                return;
            case 3:
                IndiaUpiPaymentMethodSelectionActivity indiaUpiPaymentMethodSelectionActivity = (IndiaUpiPaymentMethodSelectionActivity) this.A00;
                C207249un r2 = (C207249un) indiaUpiPaymentMethodSelectionActivity.A01.A00.get(i);
                C175818b6 r0 = (C175818b6) r2.A08;
                if (r0 == null || C175818b6.A00(r0)) {
                    C128166Be r7 = new C128166Be("upi_p2p_check_balance", (String) null, (Map) null);
                    HashMap A0J = AnonymousClass001.A0J();
                    A0J.put("credential_id", r2.A0A);
                    indiaUpiPaymentMethodSelectionActivity.A05.A05(0, R.string.f12nameremoved);
                    ((AnonymousClass627) indiaUpiPaymentMethodSelectionActivity.A02.get()).A00(new C23218BAa(indiaUpiPaymentMethodSelectionActivity, 6), new C203569oK(indiaUpiPaymentMethodSelectionActivity, 2), r7, "payment_method_picker", A0J);
                    return;
                }
                AnonymousClass3SJ.A01(indiaUpiPaymentMethodSelectionActivity, 29);
                return;
            default:
                PaymentSettingsFragment paymentSettingsFragment = (PaymentSettingsFragment) this.A00;
                paymentSettingsFragment.BcR((C207249un) paymentSettingsFragment.A0j.A00.get(i));
                C23075B3f b3f = paymentSettingsFragment.A0m.A09;
                C18740tg.A06(b3f);
                b3f.BOm(1, 181, "payment_home", "payment_home");
                return;
        }
    }
}
