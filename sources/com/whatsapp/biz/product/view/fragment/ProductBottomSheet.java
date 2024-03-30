package com.whatsapp.biz.product.view.fragment;

import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass09Y;
import X.AnonymousClass97B;
import X.AnonymousClass9UA;
import X.BA7;
import X.C135436ch;
import X.C163537qM;
import X.C18820ts;
import X.C19770wU;
import X.C198909eO;
import X.C207589vS;
import X.C222813r;
import X.C23228BAk;
import X.C36331k8;
import X.C36341k9;
import X.C36381kD;
import X.C36411kG;
import X.C36441kJ;
import X.C64183Mz;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentContainerView;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.biz.catalog.view.variants.VariantsCarouselFragment;
import com.whatsapp.biz.catalog.view.variants.VariantsCarouselFragmentViewModel;
import com.whatsapp.biz.catalog.view.widgets.QuantitySelector;
import com.whatsapp.biz.product.viewmodel.ProductBottomSheetViewModel;
import com.whatsapp.jid.UserJid;
import com.whatsapp.wds.components.button.WDSButton;

public final class ProductBottomSheet extends Hilt_ProductBottomSheet {
    public View A00;
    public Toolbar A01;
    public WaTextView A02;
    public WaTextView A03;
    public AnonymousClass9UA A04;
    public VariantsCarouselFragment A05;
    public C198909eO A06;
    public QuantitySelector A07;
    public ProductBottomSheetViewModel A08;
    public C18820ts A09;
    public UserJid A0A;
    public C19770wU A0B;
    public WDSButton A0C;
    public View A0D;
    public String A0E;

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass00C.A0D(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.f9nameremoved, viewGroup, false);
        this.A03 = C36411kG.A0Z(inflate, R.id.title);
        this.A02 = C36411kG.A0Z(inflate, R.id.price);
        this.A00 = inflate.findViewById(R.id.cart_container);
        this.A0C = (WDSButton) inflate.findViewById(R.id.action_button);
        this.A07 = (QuantitySelector) inflate.findViewById(R.id.quantity_selector);
        this.A0D = inflate.findViewById(R.id.loading_indicator);
        QuantitySelector quantitySelector = this.A07;
        if (quantitySelector != null) {
            quantitySelector.A03 = new C23228BAk(this, 1);
            quantitySelector.A04 = new C163537qM(this, 1);
        }
        Toolbar toolbar = (Toolbar) inflate.findViewById(R.id.toolbar);
        this.A01 = toolbar;
        if (toolbar != null) {
            toolbar.setNavigationIcon((int) R.drawable.ic_close);
            toolbar.setNavigationOnClickListener(new C135436ch(this, 8));
            toolbar.A0G(R.menu.f11nameremoved);
            toolbar.A0C = new C207589vS(this);
        }
        return inflate;
    }

    public void A1S(Bundle bundle, View view) {
        AnonymousClass00C.A0D(view, 0);
        super.A1S(bundle, view);
        AnonymousClass09Y r6 = new AnonymousClass09Y(A0k());
        r6.A0G = true;
        UserJid userJid = this.A0A;
        if (userJid == null) {
            throw C36331k8.A0d("productOwnerJid");
        }
        VariantsCarouselFragment variantsCarouselFragment = new VariantsCarouselFragment();
        Bundle A072 = AnonymousClass001.A07();
        A072.putParcelable("extra_product_owner_jid", userJid);
        variantsCarouselFragment.A17(A072);
        r6.A0E(variantsCarouselFragment, (String) null, R.id.variants_carousel_fragment);
        r6.A03();
    }

    public void onDismiss(DialogInterface dialogInterface) {
        AnonymousClass00C.A0D(dialogInterface, 0);
        super.onDismiss(dialogInterface);
        C36341k9.A15(this);
    }

    public static final void A03(ProductBottomSheet productBottomSheet, boolean z) {
        View view = productBottomSheet.A0D;
        int i = 0;
        if (view != null) {
            view.setVisibility(C36381kD.A00(z ^ true ? 1 : 0));
        }
        WaTextView waTextView = productBottomSheet.A03;
        if (waTextView != null) {
            int i2 = 0;
            if (z) {
                i2 = 4;
            }
            waTextView.setVisibility(i2);
        }
        WaTextView waTextView2 = productBottomSheet.A02;
        if (waTextView2 != null) {
            if (z) {
                i = 4;
            }
            waTextView2.setVisibility(i);
        }
    }

    public void A1M() {
        FragmentContainerView fragmentContainerView;
        super.A1M();
        if (this.A05 == null) {
            View view = this.A0F;
            VariantsCarouselFragment variantsCarouselFragment = null;
            if (!(view == null || (fragmentContainerView = (FragmentContainerView) view.findViewById(R.id.variants_carousel_fragment)) == null)) {
                variantsCarouselFragment = (VariantsCarouselFragment) fragmentContainerView.getFragment();
            }
            this.A05 = variantsCarouselFragment;
            if (variantsCarouselFragment != null) {
                VariantsCarouselFragmentViewModel variantsCarouselFragmentViewModel = variantsCarouselFragment.A03;
                if (variantsCarouselFragmentViewModel == null) {
                    throw C36331k8.A0a();
                }
                variantsCarouselFragmentViewModel.A03 = true;
            }
            ProductBottomSheetViewModel productBottomSheetViewModel = this.A08;
            if (productBottomSheetViewModel == null) {
                throw C36331k8.A0d("viewModel");
            }
            BA7.A01(this, productBottomSheetViewModel.A0E, AnonymousClass97B.A00(this, 23), 16);
            ProductBottomSheetViewModel productBottomSheetViewModel2 = this.A08;
            if (productBottomSheetViewModel2 == null) {
                throw C36331k8.A0d("viewModel");
            }
            BA7.A01(this, productBottomSheetViewModel2.A0D, AnonymousClass97B.A00(this, 24), 17);
            ProductBottomSheetViewModel productBottomSheetViewModel3 = this.A08;
            if (productBottomSheetViewModel3 == null) {
                throw C36331k8.A0d("viewModel");
            }
            UserJid userJid = this.A0A;
            if (userJid == null) {
                throw C36331k8.A0d("productOwnerJid");
            }
            String str = this.A0E;
            if (str == null) {
                throw C36331k8.A0d("productId");
            }
            productBottomSheetViewModel3.A0T(userJid, str);
        }
    }

    public void A1Q(Bundle bundle) {
        String string;
        super.A1Q(bundle);
        C222813r r2 = UserJid.Companion;
        Bundle bundle2 = this.A0A;
        String str = null;
        if (bundle2 != null) {
            str = bundle2.getString("extra_product_owner_jid");
        }
        UserJid A022 = r2.A02(str);
        if (A022 != null) {
            this.A0A = A022;
            Bundle bundle3 = this.A0A;
            if (bundle3 == null || (string = bundle3.getString("extra_product_id")) == null) {
                throw AnonymousClass001.A09("ProductBottomSheet requires a product id");
            }
            this.A0E = string;
            ProductBottomSheetViewModel productBottomSheetViewModel = (ProductBottomSheetViewModel) C36441kJ.A0b(this).A00(ProductBottomSheetViewModel.class);
            this.A08 = productBottomSheetViewModel;
            if (productBottomSheetViewModel == null) {
                throw C36331k8.A0a();
            }
            UserJid userJid = this.A0A;
            if (userJid == null) {
                throw C36331k8.A0d("productOwnerJid");
            }
            C64183Mz.A00(productBottomSheetViewModel.A0L, userJid, 44);
            C198909eO r1 = this.A06;
            if (r1 != null) {
                UserJid userJid2 = this.A0A;
                if (userJid2 == null) {
                    throw C36331k8.A0d("productOwnerJid");
                }
                r1.A01(userJid2);
                return;
            }
            throw C36331k8.A0d("openVariantsPageLogger");
        }
        throw AnonymousClass001.A09("ProductBottomSheet requires a product owner id");
    }
}
