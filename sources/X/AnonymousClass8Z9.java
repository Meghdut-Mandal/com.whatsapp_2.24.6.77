package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.data.ProfilePhotoChange;

/* renamed from: X.8Z9  reason: invalid class name */
public class AnonymousClass8Z9 extends AnonymousClass2I4 {
    public C27731Pn A00;
    public boolean A01;
    public final ImageView A02 = C36391kE.A0N(this, R.id.photo_new);
    public final ImageView A03 = C36391kE.A0N(this, R.id.photo_old);
    public final ImageView A04;

    public int getBackgroundResource() {
        return 0;
    }

    private void A0B() {
        ProfilePhotoChange profilePhotoChange;
        byte[] bArr;
        ImageView imageView;
        ImageView imageView2;
        AnonymousClass2bI r2 = (AnonymousClass2bI) this.A0K;
        C64933Qa r6 = r2.A1J;
        if (!(!r6.A02 || r2.A00 != 6 || (profilePhotoChange = ((C181238n9) r2).A00) == null || (bArr = profilePhotoChange.newPhoto) == null || profilePhotoChange.oldPhoto == null)) {
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
            byte[] bArr2 = profilePhotoChange.oldPhoto;
            Bitmap decodeByteArray2 = BitmapFactory.decodeByteArray(bArr2, 0, bArr2.length);
            if (!(decodeByteArray == null || decodeByteArray2 == null)) {
                if (this.A0K.A06(C65533Sl.A01(r6.A00))) {
                    Bitmap A002 = C27731Pn.A00(decodeByteArray2, -2.14748365E9f, decodeByteArray2.getWidth());
                    Bitmap A003 = C27731Pn.A00(decodeByteArray, -2.14748365E9f, decodeByteArray.getWidth());
                    imageView = this.A03;
                    imageView.setImageBitmap(A002);
                    imageView2 = this.A02;
                    imageView2.setImageBitmap(A003);
                } else {
                    C03220Dq r22 = new C03220Dq(C36341k9.A0F(this), decodeByteArray2);
                    C03220Dq r0 = new C03220Dq(C36341k9.A0F(this), decodeByteArray);
                    r22.A01();
                    r0.A01();
                    imageView = this.A03;
                    imageView.setImageDrawable(r22);
                    imageView2 = this.A02;
                    imageView2.setImageDrawable(r0);
                }
                imageView.setVisibility(0);
                imageView2.setVisibility(0);
                this.A04.setVisibility(0);
                return;
            }
        }
        this.A03.setVisibility(8);
        this.A02.setVisibility(8);
        this.A04.setVisibility(8);
    }

    public void A16() {
        if (!this.A01) {
            this.A01 = true;
            C27861Qc A0n = C175108Zr.A0n(this);
            C18800tq r4 = A0n.A0M;
            C27111My A0m = C175108Zr.A0m(r4, A0n, this);
            C18830tt r2 = r4.A00;
            C175108Zr.A0y(r4, r2, r2, this);
            C175108Zr.A11(r4, this);
            C175108Zr.A14(r4, this, C165597tg.A0h(r4));
            C175108Zr.A12(r4, this);
            C175108Zr.A10(r4, r2, this, C175108Zr.A0q(r4));
            C175108Zr.A13(r4, this);
            C19470v6 A0k = C175108Zr.A0k(A0m, r4, r2, this, C165577te.A0U(r4));
            C175108Zr.A0v(A0k, r4, r2, this, C175108Zr.A0o(r4, this));
            C175108Zr.A0w(A0m, r4, r2, this);
            C175108Zr.A0z(r4, r2, A0n, this, C175108Zr.A0p(r2));
            C175108Zr.A0x(A0m, A0n, this);
            C175108Zr.A0u(A0k, r4, r2, A0n, this);
            AnonymousClass8YV.A0H(A0k, r4, this);
            AnonymousClass8YV.A0G(A0k, A0m, r4, A0n, this);
            AnonymousClass8YV.A0I(r4, r2, A0n, this);
            this.A00 = C165577te.A0Q(r4);
        }
    }

    public void A22(AnonymousClass3T1 r2, boolean z) {
        boolean A1W = C36371kC.A1W(r2, this.A0K);
        super.A22(r2, z);
        if (z || A1W) {
            A0B();
        }
    }

    public AnonymousClass8Z9(Context context, C89004Uw r5, AnonymousClass2bI r6) {
        super(context, r5, r6);
        A16();
        ImageView A0N = C36391kE.A0N(this, R.id.arrow);
        this.A04 = A0N;
        C36321k7.A0L(context, A0N, this.A0E, R.drawable.ic_chat_icon_change_arrow);
        A0B();
    }

    public void A1Y() {
        A0B();
        super.A1Y();
    }

    public int getCenteredLayoutId() {
        return R.layout.f9nameremoved;
    }

    public int getIncomingLayoutId() {
        return R.layout.f9nameremoved;
    }

    public int getOutgoingLayoutId() {
        return R.layout.f9nameremoved;
    }
}
