package X;

import android.content.Context;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import com.whatsapp.R;
import com.whatsapp.WaButtonWithLoader;
import com.whatsapp.payments.ui.BrazilPaymentIncomeCollectionBottomSheet;
import com.whatsapp.payments.ui.viewmodel.BrazilIncomeCollectionViewModel;
import com.whatsapp.util.Log;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.2ZT  reason: invalid class name */
public final class AnonymousClass2ZT extends AIB {
    public final /* synthetic */ AnonymousClass4TR A00;
    public final /* synthetic */ BrazilIncomeCollectionViewModel A01;
    public final /* synthetic */ C186018vH A02;

    public void A07(C203399nx r16) {
        AnonymousClass4TR r4;
        C24601Db r3;
        long j;
        String str;
        String A0q;
        C203399nx r8 = r16;
        AnonymousClass00C.A0D(r8, 0);
        C186018vH r32 = this.A02;
        ArrayList arrayList = AnonymousClass2lM.A00;
        List<C184818t3> list = null;
        C203399nx.A0A(r8, "iq");
        C203399nx r5 = r32.A00;
        C203379ns.A03(r8, String.class, -9007199254740991L, 9007199254740991L, "br-get-info-for-income-collection", new String[]{"account", "action"}, false);
        Number number = (Number) C203539oF.A07(r8, Long.class, C36411kG.A0t(), 9007199254740991L, (Object) null, new String[]{"account", "income_collection_ts"}, false);
        String A0A = C203379ns.A0A(r8, AnonymousClass2lM.A00, new String[]{"account", "is_income_already_collected"});
        C203539oF.A06(r8, new AnonymousClass3DU(r5, 0), new String[0]);
        C184038rn r52 = (C184038rn) C203379ns.A02(r8, C76973pk.A00, new String[]{"account", "income_ranges"});
        C203539oF.A09(r8, C76983pl.A00, new String[]{"account"}, 1, 1).get(0);
        ArrayList arrayList2 = null;
        if (r52 != null) {
            list = (List) r52.A00;
        }
        if (AnonymousClass00C.A0J(A0A, "1")) {
            r3 = this.A01.A04;
            r3.A0N("collected");
            r4 = this.A00;
        } else {
            if (number != null) {
                BrazilIncomeCollectionViewModel brazilIncomeCollectionViewModel = this.A01;
                C19420v0 r9 = brazilIncomeCollectionViewModel.A01;
                r9.A1h("payments_income_collection_timestamp", TimeUnit.SECONDS.toMillis(number.longValue()));
                boolean A1P = C36431kI.A1P((System.currentTimeMillis() > r9.A0V("payments_income_collection_timestamp") ? 1 : (System.currentTimeMillis() == r9.A0V("payments_income_collection_timestamp") ? 0 : -1)));
                C24601Db r42 = brazilIncomeCollectionViewModel.A04;
                if (A1P) {
                    str = "not_required";
                } else {
                    str = "pending";
                }
                r42.A0N(str);
            }
            if (list != null) {
                BrazilIncomeCollectionViewModel brazilIncomeCollectionViewModel2 = this.A01;
                arrayList2 = AnonymousClass001.A0I();
                for (C184818t3 r33 : list) {
                    Number number2 = (Number) r33.A01;
                    AnonymousClass00C.A08(number2);
                    long longValue = number2.longValue();
                    Number number3 = (Number) r33.A00;
                    if (number3 != null) {
                        j = number3.longValue();
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    arrayList2.add(new AnonymousClass35D(longValue, j));
                }
                r4 = this.A00;
                r3 = brazilIncomeCollectionViewModel2.A04;
            } else {
                Log.i("PAY: BrazilSaveIncomeInformationAction/getIncomeCollectionInfo onResponseSuccess: income ranges are empty");
                this.A00.BWY();
                return;
            }
        }
        String string = r3.A03().getString("pref_income_verification_state", "not_required");
        AnonymousClass00C.A08(string);
        AnonymousClass4X3 r43 = (AnonymousClass4X3) r4;
        if (string.equals("collected") || string.equals("not_required")) {
            r43.BZ8();
        } else if (!string.equals("pending") || arrayList2 == null) {
            r43.BWY();
        } else {
            BrazilPaymentIncomeCollectionBottomSheet.A05 = arrayList2;
            BrazilPaymentIncomeCollectionBottomSheet brazilPaymentIncomeCollectionBottomSheet = (BrazilPaymentIncomeCollectionBottomSheet) r43.A01;
            View view = (View) r43.A00;
            C36381kD.A1B(C36361kB.A0G(view, R.id.br_bottom_sheet_slab_container), C36361kB.A0G(view, R.id.get_income_info_progress_container));
            RadioGroup radioGroup = (RadioGroup) C36361kB.A0G(view, R.id.income_collection_slabs_radio_group);
            int size = BrazilPaymentIncomeCollectionBottomSheet.A05.size();
            for (int i = 0; i < size; i++) {
                RadioButton radioButton = new RadioButton(view.getContext());
                radioButton.setId(i);
                Object obj = BrazilPaymentIncomeCollectionBottomSheet.A05.get(i);
                AnonymousClass00C.A08(obj);
                AnonymousClass35D r0 = (AnonymousClass35D) obj;
                AnonymousClass00C.A0D(r0, 0);
                long j2 = r0.A00;
                if (j2 == Long.MAX_VALUE) {
                    Object[] A0L = AnonymousClass001.A0L();
                    AnonymousClass1FR r13 = brazilPaymentIncomeCollectionBottomSheet.A03;
                    if (r13 != null) {
                        A0q = C36401kF.A0q(brazilPaymentIncomeCollectionBottomSheet, AnonymousClass16W.A04.B7d(r13.A05, new AnonymousClass16X(new BigDecimal(r0.A01), 0)), A0L, 0, R.string.f12nameremoved);
                        AnonymousClass00C.A08(A0q);
                    } else {
                        throw C36331k8.A0d("paymentsUtils");
                    }
                } else {
                    StringBuilder A0u = AnonymousClass000.A0u();
                    AnonymousClass1FR r14 = brazilPaymentIncomeCollectionBottomSheet.A03;
                    if (r14 != null) {
                        AnonymousClass16U r12 = AnonymousClass16W.A04;
                        A0u.append(r12.B7d(r14.A05, new AnonymousClass16X(new BigDecimal(r0.A01), 0)));
                        A0u.append(" - ");
                        AnonymousClass1FR r132 = brazilPaymentIncomeCollectionBottomSheet.A03;
                        if (r132 != null) {
                            A0q = AnonymousClass000.A0q(r12.B7d(r132.A05, new AnonymousClass16X(new BigDecimal(j2), 0)), A0u);
                        } else {
                            throw C36331k8.A0d("paymentsUtils");
                        }
                    } else {
                        throw C36331k8.A0d("paymentsUtils");
                    }
                }
                radioButton.setText(A0q);
                radioButton.setTextSize(16.0f);
                C36401kF.A17(radioButton);
                radioButton.setLayoutDirection(1);
                radioButton.setPadding(0, C65103Qt.A01(view.getContext(), 12.0f), 0, C65103Qt.A01(view.getContext(), 12.0f));
                radioButton.setGravity(16);
                radioGroup.addView(radioButton);
            }
            String str2 = brazilPaymentIncomeCollectionBottomSheet.A04;
            C23075B3f b3f = brazilPaymentIncomeCollectionBottomSheet.A00;
            if (b3f == null) {
                throw C36331k8.A0d("paymentFieldStatsLogger");
            }
            C203049nB.A04((C131606Ps) null, b3f, "income_collection_prompt", str2);
            WaButtonWithLoader waButtonWithLoader = (WaButtonWithLoader) C36361kB.A0G(view, R.id.income_collection_continue_button);
            waButtonWithLoader.setButtonText((int) R.string.f12nameremoved);
            waButtonWithLoader.setEnabled(false);
            radioGroup.setOnCheckedChangeListener(new C89654Xj(waButtonWithLoader, 4));
            waButtonWithLoader.A01();
            waButtonWithLoader.A00 = new AnonymousClass3YM(waButtonWithLoader, brazilPaymentIncomeCollectionBottomSheet, radioGroup, 8);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2ZT(Context context, AnonymousClass17Y r2, C29221Vu r3, AnonymousClass4TR r4, BrazilIncomeCollectionViewModel brazilIncomeCollectionViewModel, C186018vH r6) {
        super(context, r3, r2);
        this.A00 = r4;
        this.A02 = r6;
        this.A01 = brazilIncomeCollectionViewModel;
    }

    public void A05(C202059ky r3) {
        C36321k7.A1K(r3, "PAY: BrazilSaveIncomeInformationAction/getIncomeCollectionInfo onRequestError: ", C36341k9.A0i(r3));
        this.A00.BWY();
    }

    public void A06(C202059ky r3) {
        C36321k7.A1K(r3, "PAY: BrazilSaveIncomeInformationAction/getIncomeCollectionInfo onResponseError: ", C36341k9.A0i(r3));
        this.A00.BWY();
    }
}
