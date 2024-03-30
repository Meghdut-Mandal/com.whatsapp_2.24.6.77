package X;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.components.button.ThumbnailButton;
import java.util.List;

/* renamed from: X.2dS  reason: invalid class name */
public class AnonymousClass2dS extends C47152dY {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public FrameLayout A04;
    public AnonymousClass17Y A05;
    public WaImageView A06;
    public WaImageView A07;
    public AnonymousClass1Pp A08;
    public C18820ts A09;
    public C38711pZ A0A;
    public List A0B;
    public boolean A0C;
    public AnonymousClass28m A0D;
    public final AnonymousClass1RY A0E;
    public final AnonymousClass2XJ A0F;

    public static ThumbnailButton A00(Context context, AnonymousClass2dS r6, int i) {
        ThumbnailButton thumbnailButton = new ThumbnailButton(context);
        thumbnailButton.setLayoutParams(new FrameLayout.LayoutParams(i, i));
        thumbnailButton.setScaleType(ImageView.ScaleType.FIT_CENTER);
        thumbnailButton.A02 = C36351kA.A02(r6.getContext(), r6.getContext(), R.attr.f4nameremoved, R.color.f6nameremoved);
        thumbnailButton.A00 = (float) r6.A00;
        thumbnailButton.A01 = (float) r6.A02;
        thumbnailButton.A06 = false;
        C011504z.A06(thumbnailButton, 2);
        return thumbnailButton;
    }

    public void A04(AnonymousClass3T1 r4, List list) {
        this.A0A.setSubText((String) null, (List) null);
        AnonymousClass28m r1 = this.A0D;
        if (r1 != null) {
            this.A0F.A07(r1);
        }
        AnonymousClass28m r2 = (AnonymousClass28m) this.A0F.A02(r4);
        this.A0D = r2;
        r2.A0B(new AnonymousClass4CB(list, this, r4, 1), this.A05.A04);
    }

    public void setMessage(AnonymousClass2bX r7, List list) {
        C18820ts r1 = this.A09;
        FrameLayout frameLayout = this.A04;
        int i = this.A01;
        AnonymousClass1JZ.A06(frameLayout, r1, i, i, i, i);
        this.A08.A06(this.A07, R.drawable.avatar_contact);
        String A012 = AnonymousClass3RN.A01(C36431kI.A0A(this.A06, this, 8), r7);
        if (A012 == null) {
            A012 = "";
        }
        this.A0A.setTitleAndDescription(AnonymousClass14B.A0C(A012, 128), (String) null, list);
        A04(r7, list);
    }

    public AnonymousClass2dS(Context context, AnonymousClass1RY r2, AnonymousClass2XJ r3) {
        super(context);
        A02();
        this.A0F = r3;
        this.A0E = r2;
        A03();
    }

    public void setMessage(AnonymousClass2bW r7, List list) {
        int i = this.A01;
        int i2 = ((i * 2) - this.A03) / 2;
        AnonymousClass1JZ.A06(this.A04, this.A09, i2, i, i2, i);
        this.A08.A06(this.A07, R.drawable.avatar_contact);
        this.A08.A06(this.A06, R.drawable.avatar_contact);
        this.A06.setVisibility(0);
        this.A07.setVisibility(0);
        A04(r7, list);
    }
}
