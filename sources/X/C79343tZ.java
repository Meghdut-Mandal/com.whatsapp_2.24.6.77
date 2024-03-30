package X;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.conversation.conversationrow.ConversationRowImage$RowImageView;

/* renamed from: X.3tZ  reason: invalid class name and case insensitive filesystem */
public class C79343tZ implements C160527l9 {
    public final /* synthetic */ AnonymousClass2IB A00;

    public C79343tZ(AnonymousClass2IB r1) {
        this.A00 = r1;
    }

    public void A00() {
        AnonymousClass2IB r4 = this.A00;
        ConversationRowImage$RowImageView conversationRowImage$RowImageView = r4.A09;
        C36441kJ.A1D(conversationRowImage$RowImageView);
        C36391kE.A1C(r4.getResources(), conversationRowImage$RowImageView, R.color.f6nameremoved);
        AnonymousClass3UF.A0B(r4.getContext(), conversationRowImage$RowImageView, R.drawable.camera, R.color.f6nameremoved);
        r4.A0H = false;
    }

    public int BHb() {
        return C65023Qk.A01(this.A00.A09.A0B);
    }

    public void BXv() {
        this.A00.A2J();
    }

    public void Bte(Bitmap bitmap, View view, AnonymousClass3T1 r6) {
        if (this instanceof C43412Hk) {
            C43412Hk r2 = (C43412Hk) this;
            if (bitmap == null || !(r6 instanceof AnonymousClass2bU)) {
                r2.A00();
                return;
            }
            r2.A01((AnonymousClass2bU) r6);
            AnonymousClass4W6 r22 = (AnonymousClass4W6) r2;
            int i = r22.A01;
            AnonymousClass2IB r0 = (AnonymousClass2IB) r22.A00;
            if (i != 0) {
                AnonymousClass2IB.A0E(bitmap, r0);
            } else {
                AnonymousClass2IB.A0F(bitmap, r0);
            }
        } else if (bitmap == null || !(r6 instanceof AnonymousClass2bU)) {
            A00();
        } else {
            A01((AnonymousClass2bU) r6);
            this.A00.A09.setImageBitmap(bitmap);
        }
    }

    public void Btu(View view) {
        AnonymousClass2IB r1 = this.A00;
        r1.A0H = false;
        r1.A09.setBackgroundColor(-7829368);
    }

    public void A01(AnonymousClass2bU r6) {
        int i;
        ImageView.ScaleType scaleType;
        C65013Qj A002 = AnonymousClass2bU.A00(r6);
        int i2 = A002.A0A;
        if (i2 != 0 && (i = A002.A06) != 0) {
            AnonymousClass2IB r0 = this.A00;
            boolean z = r0 instanceof AnonymousClass2IA;
            ConversationRowImage$RowImageView conversationRowImage$RowImageView = r0.A09;
            conversationRowImage$RowImageView.A04(i2, i);
            if (r0.A0O || z) {
                scaleType = ImageView.ScaleType.CENTER_CROP;
            } else {
                scaleType = ImageView.ScaleType.MATRIX;
            }
            conversationRowImage$RowImageView.setScaleType(scaleType);
        }
    }
}
