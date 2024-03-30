package com.whatsapp.biz.catalog.view;

import X.AnonymousClass00E;
import X.AnonymousClass141;
import X.AnonymousClass14B;
import X.AnonymousClass164;
import X.AnonymousClass16D;
import X.AnonymousClass171;
import X.AnonymousClass185;
import X.AnonymousClass1JZ;
import X.AnonymousClass1KK;
import X.AnonymousClass3L0;
import X.AnonymousClass3UF;
import X.AnonymousClass5M5;
import X.C012005e;
import X.C165247t7;
import X.C18820ts;
import X.C19730wQ;
import X.C19770wU;
import X.C27761Ps;
import X.C31751cK;
import X.C33541fX;
import X.C36391kE;
import X.C36401kF;
import X.C65103Qt;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.jid.UserJid;
import com.whatsapp.jobqueue.job.GetVNameCertificateJob;

public class CatalogHeader extends AspectRatioFrameLayout implements C31751cK {
    public ImageView A00;
    public C19730wQ A01;
    public TextEmojiLabel A02;
    public AnonymousClass164 A03;
    public AnonymousClass1KK A04;
    public AnonymousClass16D A05;
    public AnonymousClass185 A06;
    public AnonymousClass171 A07;
    public C27761Ps A08;
    public C18820ts A09;
    public C19770wU A0A;
    public boolean A0B;
    public boolean A0C;
    public TextView A0D;
    public GetVNameCertificateJob A0E;

    public void BYZ() {
    }

    public void BYa() {
    }

    public void setOnTextClickListener(C33541fX r2) {
        TextView textView = this.A0D;
        if (textView != null && !TextUtils.isEmpty(textView.getText())) {
            this.A0D.setOnClickListener(r2);
        }
        TextEmojiLabel textEmojiLabel = this.A02;
        if (textEmojiLabel != null && !TextUtils.isEmpty(textEmojiLabel.getText())) {
            this.A02.setOnClickListener(r2);
        }
    }

    public CatalogHeader(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A01();
        A02(context, attributeSet);
    }

    public float getAspectRatio() {
        return this.A00;
    }

    public void setUp(UserJid userJid) {
        String str;
        this.A00 = C36391kE.A0N(this, R.id.catalog_list_header_image);
        TextView A0P = C36391kE.A0P(this, R.id.catalog_list_header_business_name);
        this.A0D = A0P;
        C012005e.A0a(A0P, true);
        if (!this.A01.A0M(userJid)) {
            AnonymousClass3UF.A08(AnonymousClass00E.A00(getContext(), R.drawable.chevron_right), -1);
            AnonymousClass1JZ.A0B(this.A0D, this.A09, R.drawable.chevron_right);
            TextView textView = this.A0D;
            if (textView != null) {
                textView.setCompoundDrawablePadding(C65103Qt.A01(getContext(), 8.0f));
            }
        }
        TextEmojiLabel A0P2 = C36401kF.A0P(this, R.id.catalog_list_header_business_description);
        this.A02 = A0P2;
        C012005e.A0a(A0P2, true);
        AnonymousClass3L0 A022 = this.A06.A02(userJid);
        if (A022 == null) {
            if (this.A0E == null) {
                GetVNameCertificateJob getVNameCertificateJob = new GetVNameCertificateJob(userJid);
                this.A0E = getVNameCertificateJob;
                this.A03.A01(getVNameCertificateJob);
            }
            str = null;
        } else {
            str = A022.A08;
        }
        AnonymousClass141 A0D2 = this.A05.A0D(userJid);
        TextView textView2 = this.A0D;
        if (textView2 != null) {
            if (AnonymousClass14B.A0F(str)) {
                str = this.A07.A0H(A0D2);
            }
            textView2.setText(str);
        }
        this.A04.A0C(new C165247t7(this, userJid, 0), userJid);
        C36391kE.A1Q(new AnonymousClass5M5(this, this.A08, A0D2), this.A0A);
    }

    public CatalogHeader(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CatalogHeader(Context context) {
        this(context, (AttributeSet) null);
    }
}
