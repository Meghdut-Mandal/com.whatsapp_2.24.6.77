package com.whatsapp.payments.ui;

import X.AVY;
import X.AVb;
import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass02E;
import X.AnonymousClass17Y;
import X.AnonymousClass1A1;
import X.AnonymousClass1EU;
import X.AnonymousClass1FR;
import X.AnonymousClass2ZN;
import X.AnonymousClass3UJ;
import X.AnonymousClass753;
import X.AnonymousClass9FW;
import X.B6J;
import X.B7G;
import X.B9W;
import X.C012005e;
import X.C013105r;
import X.C111245by;
import X.C131606Ps;
import X.C135916dT;
import X.C165567td;
import X.C168117zj;
import X.C175758b0;
import X.C175898bF;
import X.C179048iy;
import X.C179068j0;
import X.C180188lL;
import X.C180198lM;
import X.C180208lN;
import X.C180218lO;
import X.C18740tg;
import X.C18820ts;
import X.C193169Kc;
import X.C193639Mg;
import X.C19770wU;
import X.C199849g7;
import X.C201659k4;
import X.C20310xM;
import X.C203449o2;
import X.C206909uC;
import X.C207119ua;
import X.C207199ui;
import X.C207249un;
import X.C207349ux;
import X.C20810yC;
import X.C21333AHl;
import X.C21334AHm;
import X.C23158B7s;
import X.C23159B7t;
import X.C23203B9l;
import X.C24601Db;
import X.C29121Vk;
import X.C32681e1;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36361kB;
import X.C36371kC;
import X.C36391kE;
import X.C36401kF;
import X.C36431kI;
import X.C61233Bb;
import X.C64933Qa;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import androidx.fragment.app.DialogFragment;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.WaButtonWithLoader;
import com.whatsapp.payments.ui.widget.PaymentMethodRow;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class HybridPaymentMethodPickerFragment extends Hilt_HybridPaymentMethodPickerFragment implements B6J {
    public AnonymousClass17Y A00;
    public WaButtonWithLoader A01;
    public C18820ts A02;
    public C20310xM A03;
    public C207249un A04;
    public C20810yC A05;
    public AnonymousClass2ZN A06;
    public C24601Db A07;
    public C29121Vk A08;
    public AnonymousClass1EU A09;
    public C168117zj A0A;
    public C193169Kc A0B;
    public C193639Mg A0C;
    public C199849g7 A0D;
    public AnonymousClass1FR A0E;
    public C207199ui A0F;
    public C64933Qa A0G;
    public AnonymousClass1A1 A0H;
    public C32681e1 A0I;
    public C19770wU A0J;
    public List A0K;
    public List A0L;
    public boolean A0M;
    public boolean A0N;
    public final List A0O = AnonymousClass001.A0I();
    public final C61233Bb A0P = new B7G(this, 2);

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass00C.A0D(layoutInflater, 0);
        return layoutInflater.inflate(R.layout.f9nameremoved, viewGroup, false);
    }

    public void A1S(Bundle bundle, View view) {
        int i;
        AnonymousClass00C.A0D(view, 0);
        ImageView imageView = (ImageView) C36361kB.A0G(view, R.id.nav_icon);
        AnonymousClass02E r0 = this.A0I;
        if (r0 == null || r0.A0k().A0I() <= 1) {
            imageView.setImageDrawable(C013105r.A01(view.getContext(), R.drawable.ic_close));
            i = 34;
        } else {
            imageView.setImageDrawable(C013105r.A01(view.getContext(), R.drawable.ic_back));
            i = 33;
        }
        C36391kE.A1I(imageView, this, i);
        C18820ts r4 = this.A02;
        if (r4 != null) {
            AnonymousClass1EU r3 = this.A09;
            if (r3 != null) {
                C199849g7 r2 = this.A0D;
                if (r2 != null) {
                    this.A0A = new C168117zj(r4, r3, new C23203B9l(this, 1), r2);
                    RecyclerView recyclerView = (RecyclerView) C012005e.A02(view, R.id.methods_list);
                    C168117zj r02 = this.A0A;
                    if (r02 == null) {
                        throw C36331k8.A0d("methodListAdapter");
                    }
                    recyclerView.setAdapter(r02);
                    View A0G2 = C36361kB.A0G(view, R.id.terms_of_services_footer);
                    if (this.A0G != null) {
                        C19770wU r22 = this.A0J;
                        if (r22 != null) {
                            r22.Bp1(new AVb(this, A0G2, 30));
                        } else {
                            throw C36331k8.A0d("waWorkers");
                        }
                    }
                    C168117zj r1 = this.A0A;
                    if (r1 == null) {
                        throw C36331k8.A0d("methodListAdapter");
                    }
                    r1.A0L(A00(this));
                    WaButtonWithLoader waButtonWithLoader = (WaButtonWithLoader) C012005e.A02(view, R.id.continue_button);
                    this.A01 = waButtonWithLoader;
                    if (waButtonWithLoader != null) {
                        waButtonWithLoader.setButtonText((int) R.string.f12nameremoved);
                    }
                    WaButtonWithLoader waButtonWithLoader2 = this.A01;
                    if (waButtonWithLoader2 != null) {
                        waButtonWithLoader2.A00 = new C207349ux(this, 36);
                    }
                    ViewGroup viewGroup = (ViewGroup) C36361kB.A0G(view, R.id.footer_view);
                    C193169Kc r03 = this.A0B;
                    if (r03 != null) {
                        LayoutInflater A0c = A0c();
                        AnonymousClass00C.A08(A0c);
                        r03.A00.BOo((C131606Ps) null, 0, (Integer) null, "payment_method_prompt");
                        View inflate = A0c.inflate(R.layout.f9nameremoved, viewGroup, false);
                        if (inflate != null) {
                            viewGroup.addView(inflate);
                            viewGroup.setVisibility(0);
                        }
                    }
                    ScrollView scrollView = (ScrollView) C36361kB.A0G(view, R.id.content_scrollview);
                    scrollView.getViewTreeObserver().addOnScrollChangedListener(new C135916dT((LinearLayout) C36361kB.A0G(view, R.id.footer_container), (RelativeLayout) C36361kB.A0G(view, R.id.action_bar), scrollView, C36341k9.A0G(this).getDimension(R.dimen.f7nameremoved)));
                    return;
                }
                throw C36331k8.A0d("paymentMethodPresenter");
            }
            throw C36331k8.A0d("paymentsManager");
        }
        throw C36321k7.A09();
    }

    public String BEC(C207249un r4) {
        AnonymousClass00C.A0D(r4, 0);
        C193169Kc r2 = this.A0B;
        if (r2 != null && ((r4 instanceof C175758b0) || C201659k4.A01(r2.A00.A0i))) {
            return "";
        }
        Context A0a = A0a();
        C175898bF r0 = r4.A08;
        C18740tg.A06(r0);
        if (!r0.A09()) {
            return A0a.getString(R.string.f12nameremoved);
        }
        if (C203449o2.A03(A0a, r4) != null) {
            return C203449o2.A03(A0a, r4);
        }
        return "";
    }

    public String BED(C207249un r3) {
        AnonymousClass00C.A0D(r3, 0);
        C199849g7 r0 = this.A0D;
        if (r0 != null) {
            return r0.A02(r3, false);
        }
        throw C36331k8.A0d("paymentMethodPresenter");
    }

    public boolean Bt7(C207249un r2) {
        return false;
    }

    public boolean BtK() {
        return false;
    }

    public /* synthetic */ void Bti(C207249un r1, PaymentMethodRow paymentMethodRow) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00de  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List A00(com.whatsapp.payments.ui.HybridPaymentMethodPickerFragment r6) {
        /*
            java.util.List r4 = r6.A0O
            r4.clear()
            java.util.List r0 = r6.A0K
            java.lang.String r3 = "nativePaymentMethods"
            if (r0 != 0) goto L_0x0010
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r3)
            throw r0
        L_0x0010:
            boolean r0 = r0.isEmpty()
            r2 = 1
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0055
            r0 = 2131892030(0x7f12173e, float:1.9418797E38)
            java.lang.String r1 = X.C36421kH.A0a(r6, r0)
            X.8lK r0 = new X.8lK
            r0.<init>(r1)
            r4.add(r0)
            java.util.List r0 = r6.A0K
            if (r0 != 0) goto L_0x0031
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r3)
            throw r0
        L_0x0031:
            java.util.Iterator r3 = r0.iterator()
        L_0x0035:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0060
            X.9un r0 = X.C165607th.A0S(r3)
            X.9un r2 = r6.A04
            X.8lO r1 = new X.8lO
            r1.<init>(r0, r6)
            X.9un r0 = r1.A01
            boolean r0 = X.AnonymousClass00C.A0J(r0, r2)
            if (r0 == 0) goto L_0x0051
            r0 = 1
            r1.A00 = r0
        L_0x0051:
            r4.add(r1)
            goto L_0x0035
        L_0x0055:
            X.9un r0 = r6.A04
            if (r0 == 0) goto L_0x005a
            r2 = 0
        L_0x005a:
            X.8lM r1 = new X.8lM
            r1.<init>(r2)
            goto L_0x00ca
        L_0x0060:
            r0 = 35
            X.9ux r1 = new X.9ux
            r1.<init>(r6, r0)
            X.8lI r0 = new X.8lI
            r0.<init>(r1)
            r4.add(r0)
            X.9Kc r5 = r6.A0B
            if (r5 == 0) goto L_0x00ae
            android.view.LayoutInflater r2 = r6.A0c()
            X.AnonymousClass00C.A08(r2)
            X.8j0 r3 = r5.A00
            r1 = 0
            java.util.List r0 = r3.A0i
            int r0 = r0.size()
            if (r0 == 0) goto L_0x00ae
            r0 = 2131625230(0x7f0e050e, float:1.8877662E38)
            android.view.View r2 = r2.inflate(r0, r1)
            r0 = 2131102239(0x7f060a1f, float:1.781691E38)
            int r1 = X.AnonymousClass00F.A00(r3, r0)
            r0 = 2131428810(0x7f0b05ca, float:1.8479275E38)
            X.C165567td.A0n(r2, r0, r1)
            if (r2 == 0) goto L_0x00ae
            r0 = 2131428809(0x7f0b05c9, float:1.8479273E38)
            X.C36351kA.A19(r2, r0)
            r0 = 19
            X.C207359uy.A00(r2, r5, r0)
            X.8lJ r0 = new X.8lJ
            r0.<init>(r2)
            r4.add(r0)
        L_0x00ae:
            X.9Kc r1 = r6.A0B
            if (r1 == 0) goto L_0x00cd
            boolean r0 = r1.A02
            if (r0 != 0) goto L_0x00d8
            boolean r0 = r1.A01
            if (r0 != 0) goto L_0x00d8
            X.8j0 r1 = r1.A00
            r0 = 2131892027(0x7f12173b, float:1.941879E38)
        L_0x00bf:
            java.lang.String r0 = r1.getString(r0)
            if (r0 == 0) goto L_0x00cd
            X.8lK r1 = new X.8lK
            r1.<init>(r0)
        L_0x00ca:
            r4.add(r1)
        L_0x00cd:
            java.util.List r0 = r6.A0L
            if (r0 != 0) goto L_0x00de
            java.lang.String r0 = "externalPaymentOptions"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x00d8:
            X.8j0 r1 = r1.A00
            r0 = 2131892028(0x7f12173c, float:1.9418793E38)
            goto L_0x00bf
        L_0x00de:
            java.util.Iterator r3 = r0.iterator()
        L_0x00e2:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0102
            X.9un r0 = X.C165607th.A0S(r3)
            X.9un r2 = r6.A04
            X.8lO r1 = new X.8lO
            r1.<init>(r0, r6)
            X.9un r0 = r1.A01
            boolean r0 = X.AnonymousClass00C.A0J(r0, r2)
            if (r0 == 0) goto L_0x00fe
            r0 = 1
            r1.A00 = r0
        L_0x00fe:
            r4.add(r1)
            goto L_0x00e2
        L_0x0102:
            boolean r0 = r6.A0N
            if (r0 == 0) goto L_0x010f
            X.8lL r0 = new X.8lL
            r0.<init>()
        L_0x010b:
            r4.add(r0)
        L_0x010e:
            return r4
        L_0x010f:
            boolean r0 = r6.A0M
            if (r0 == 0) goto L_0x010e
            X.8lN r0 = new X.8lN
            r0.<init>()
            goto L_0x010b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.HybridPaymentMethodPickerFragment.A00(com.whatsapp.payments.ui.HybridPaymentMethodPickerFragment):java.util.List");
    }

    public static final void A03(HybridPaymentMethodPickerFragment hybridPaymentMethodPickerFragment, int i) {
        C193639Mg r6;
        C179068j0 r0;
        C131606Ps A0F2;
        String str;
        String str2;
        HybridPaymentMethodPickerFragment hybridPaymentMethodPickerFragment2 = hybridPaymentMethodPickerFragment;
        AnonymousClass9FW r1 = (AnonymousClass9FW) hybridPaymentMethodPickerFragment2.A0O.get(i);
        if (r1 instanceof C180218lO) {
            C207249un r10 = ((C180218lO) r1).A01;
            hybridPaymentMethodPickerFragment2.A04 = r10;
            C193639Mg r3 = hybridPaymentMethodPickerFragment2.A0C;
            if (r3 != null) {
                r0 = r3.A02;
                C207119ua r8 = r3.A00;
                PaymentBottomSheet paymentBottomSheet = r3.A03;
                HybridPaymentMethodPickerFragment hybridPaymentMethodPickerFragment3 = r3.A01;
                if (r0 instanceof C179048iy) {
                    C179048iy r7 = (C179048iy) r0;
                    WaButtonWithLoader waButtonWithLoader = hybridPaymentMethodPickerFragment3.A01;
                    if (waButtonWithLoader != null) {
                        waButtonWithLoader.A02();
                    }
                    AnonymousClass753 r5 = new AnonymousClass753(hybridPaymentMethodPickerFragment3, r7, r8, paymentBottomSheet, r10, 17);
                    B9W b9w = new B9W(hybridPaymentMethodPickerFragment3, r7, 1);
                    Objects.requireNonNull(hybridPaymentMethodPickerFragment3);
                    C179048iy r11 = r7;
                    C207119ua r12 = r8;
                    r11.A4r(r12, new C23159B7t(r10, r8, r7, 1), b9w, paymentBottomSheet, r5, new AVY(hybridPaymentMethodPickerFragment3, 4));
                } else {
                    AnonymousClass00C.A0D(r8, 0);
                    r0.A4m(r10, r8, paymentBottomSheet);
                }
                A0F2 = r0.A0S.A05(r10, (C131606Ps) null);
                A0F2.A03("available_payment_methods", TextUtils.join(",", r3.A04));
            } else {
                return;
            }
        } else if (r1 instanceof C180198lM) {
            AnonymousClass02E r13 = hybridPaymentMethodPickerFragment2.A0I;
            AnonymousClass00C.A0E(r13, "null cannot be cast to non-null type com.whatsapp.payments.ui.PaymentBottomSheet");
            C36431kI.A1N(r13);
            C193639Mg r02 = hybridPaymentMethodPickerFragment2.A0C;
            if (r02 != null) {
                r02.A02.A4n(r02.A00);
                return;
            }
            return;
        } else {
            if (r1 instanceof C180188lL) {
                C193639Mg r32 = hybridPaymentMethodPickerFragment2.A0C;
                if (r32 != null) {
                    r0 = r32.A02;
                    C207119ua r4 = r32.A00;
                    HybridPaymentMethodPickerFragment hybridPaymentMethodPickerFragment4 = r32.A01;
                    if (r0 instanceof C179048iy) {
                        C179048iy r62 = (C179048iy) r0;
                        WaButtonWithLoader waButtonWithLoader2 = hybridPaymentMethodPickerFragment4.A01;
                        if (waButtonWithLoader2 != null) {
                            waButtonWithLoader2.A02();
                        }
                        Objects.requireNonNull(hybridPaymentMethodPickerFragment4);
                        AVY avy = new AVY(hybridPaymentMethodPickerFragment4, 4);
                        Objects.requireNonNull(hybridPaymentMethodPickerFragment4);
                        AVY avy2 = new AVY(hybridPaymentMethodPickerFragment4, 4);
                        C179048iy.A11(r4, new C23158B7s(r4, r62, 0), r62, (PaymentBottomSheet) hybridPaymentMethodPickerFragment4.A0f(), avy, avy2);
                    }
                    A0F2 = C165567td.A0F();
                    A0F2.A03("available_payment_methods", TextUtils.join(",", r32.A04));
                    str = "payment_method";
                    str2 = "hpp";
                } else {
                    return;
                }
            } else if ((r1 instanceof C180208lN) && (r6 = hybridPaymentMethodPickerFragment2.A0C) != null) {
                r0 = r6.A02;
                HybridPaymentMethodPickerFragment hybridPaymentMethodPickerFragment5 = r6.A01;
                if (r0 instanceof C179048iy) {
                    C179048iy r52 = (C179048iy) r0;
                    Objects.requireNonNull(r52.A09);
                    C18740tg.A0B(C36401kF.A1a(r52.A09));
                    C21334AHm aHm = (C21334AHm) ((C206909uC) r52.A09.get(0)).A00;
                    Objects.requireNonNull(aHm);
                    C21333AHl aHl = aHm.A00;
                    DialogFragment dialogFragment = (DialogFragment) hybridPaymentMethodPickerFragment5.A0f();
                    if (dialogFragment != null) {
                        dialogFragment.A1b();
                    }
                    String str3 = aHl.A02;
                    r52.BuO(C111245by.A00(r52, r52.A0D, C36401kF.A0b(r52.A04.A00), str3), 0);
                }
                A0F2 = C165567td.A0F();
                A0F2.A03("available_payment_methods", TextUtils.join(",", r6.A04));
                str = "payment_method";
                str2 = "payment_link";
            } else {
                return;
            }
            A0F2.A03(str, str2);
        }
        r0.BOo(A0F2, C36361kB.A0i(), C36371kC.A0p(), "payment_method_prompt");
    }

    public void A1H() {
        super.A1H();
        AnonymousClass2ZN r1 = this.A06;
        if (r1 != null) {
            r1.unregisterObserver(this.A0P);
            return;
        }
        throw C36331k8.A0d("accountObservers");
    }

    public void A1Q(Bundle bundle) {
        super.A1Q(bundle);
        Bundle A0b = A0b();
        ArrayList parcelableArrayList = A0b.getParcelableArrayList("arg_native_methods");
        C18740tg.A06(parcelableArrayList);
        AnonymousClass00C.A08(parcelableArrayList);
        this.A0K = parcelableArrayList;
        ArrayList parcelableArrayList2 = A0b.getParcelableArrayList("arg_external_methods");
        C18740tg.A06(parcelableArrayList2);
        AnonymousClass00C.A08(parcelableArrayList2);
        this.A0L = parcelableArrayList2;
        this.A04 = (C207249un) A0b.getParcelable("arg_selected_method");
        this.A0N = A0b.getBoolean("arg_hpp_checkout_enabled");
        this.A0G = AnonymousClass3UJ.A03(A0b, "");
        this.A0M = A0b.getBoolean("arg_has_merchant_configuration_payment_link");
        AnonymousClass2ZN r1 = this.A06;
        if (r1 != null) {
            r1.registerObserver(this.A0P);
            return;
        }
        throw C36331k8.A0d("accountObservers");
    }

    public /* synthetic */ boolean BtO() {
        return false;
    }

    public /* synthetic */ int BEA(C207249un r2) {
        return 0;
    }
}
