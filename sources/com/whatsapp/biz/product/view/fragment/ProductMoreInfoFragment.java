package com.whatsapp.biz.product.view.fragment;

import X.AnonymousClass1M4;
import X.AnonymousClass751;
import X.AnonymousClass9NZ;
import X.AnonymousClass9W6;
import X.BA7;
import X.C001700s;
import X.C012005e;
import X.C16550pQ;
import X.C18820ts;
import X.C36331k8;
import X.C36341k9;
import X.C36401kF;
import X.C36441kJ;
import X.C48892iE;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.Group;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaTextView;
import com.whatsapp.biz.product.viewmodel.ComplianceInfoViewModel;
import com.whatsapp.jid.UserJid;

public class ProductMoreInfoFragment extends Hilt_ProductMoreInfoFragment implements C16550pQ {
    public ProgressBar A00;
    public Group A01;
    public Group A02;
    public Group A03;
    public TextEmojiLabel A04;
    public TextEmojiLabel A05;
    public TextEmojiLabel A06;
    public WaTextView A07;
    public ComplianceInfoViewModel A08;
    public C18820ts A09;
    public AnonymousClass1M4 A0A;

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.f9nameremoved, viewGroup, false);
        View A022 = C012005e.A02(inflate, R.id.close_button);
        C36331k8.A0q(A0a(), A022, R.string.f12nameremoved);
        C48892iE.A00(A022, this, 3);
        this.A00 = (ProgressBar) C012005e.A02(inflate, R.id.more_info_progress);
        this.A04 = C36401kF.A0O(inflate, R.id.more_info_country_description);
        this.A06 = C36401kF.A0O(inflate, R.id.more_info_name_description);
        this.A05 = C36401kF.A0O(inflate, R.id.more_info_address_description);
        this.A02 = (Group) C012005e.A02(inflate, R.id.importer_country_group);
        this.A03 = (Group) C012005e.A02(inflate, R.id.importer_name_group);
        this.A01 = (Group) C012005e.A02(inflate, R.id.importer_address_group);
        this.A07 = C36401kF.A0Q(inflate, R.id.compliance_network_error_info);
        String string = A0b().getString("product_id");
        ComplianceInfoViewModel complianceInfoViewModel = this.A08;
        C001700s r2 = complianceInfoViewModel.A01;
        r2.A0D(0);
        if (!complianceInfoViewModel.A04.A0A(new AnonymousClass9NZ((AnonymousClass9W6) null, (UserJid) A0b().getParcelable("product_owner_jid"), 0, (Integer) null, string, complianceInfoViewModel.A03.A02, true))) {
            C36341k9.A16(r2, 3);
        } else {
            complianceInfoViewModel.A05.Boy(new AnonymousClass751(23, string, complianceInfoViewModel));
        }
        BA7.A01(A0m(), this.A08.A00, this, 18);
        BA7.A01(A0m(), this.A08.A01, this, 19);
        return inflate;
    }

    public void A1Q(Bundle bundle) {
        super.A1Q(bundle);
        this.A08 = (ComplianceInfoViewModel) C36441kJ.A0b(this).A00(ComplianceInfoViewModel.class);
    }
}
