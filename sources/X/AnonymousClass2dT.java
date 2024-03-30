package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import java.util.List;
import java.util.Set;

/* renamed from: X.2dT  reason: invalid class name */
public class AnonymousClass2dT extends C47162dZ {
    public View A00;
    public C32691e2 A01;
    public WaImageView A02;
    public C18820ts A03;
    public C32731e6 A04;
    public C20810yC A05;
    public AnonymousClass1DU A06;
    public C38711pZ A07;
    public AnonymousClass1EM A08;
    public boolean A09;

    private void setPreviewClickListener(String str, Set set, AnonymousClass2bV r10) {
        String str2 = str;
        Set set2 = set;
        if (set != null) {
            setOnClickListener(new AnonymousClass3YS(this, set2, r10, str2, 8));
        } else {
            setOnClickListener(new C48922iH(6, str, this));
        }
    }

    public AnonymousClass2dT(Context context) {
        super(context);
        A02();
        A03();
    }

    public void setMessage(AnonymousClass2bV r13, List list) {
        String str;
        Bitmap decodeByteArray;
        C64373Ns A002 = C64373Ns.A00(getContext(), this.A04, this.A06, r13, 0, this.A08.A01());
        AnonymousClass37O r7 = A002.A00;
        String str2 = r7.A01;
        C20810yC r2 = this.A05;
        String str3 = A002.A04;
        if (str3 == null) {
            str3 = "";
        }
        String A003 = C55742v7.A00(r2, str3, 2);
        Set set = r7.A02;
        setPreviewClickListener(str2, set, r13);
        int i = 0;
        boolean A1V = AnonymousClass000.A1V(set);
        byte[] A1c = r13.A1c();
        if (A1c == null || (decodeByteArray = BitmapFactory.decodeByteArray(A1c, 0, A1c.length)) == null || A1V) {
            AnonymousClass3UF.A0B(getContext(), this.A02, R.drawable.ic_group_invite_link, R.color.f6nameremoved);
            C36441kJ.A1D(this.A02);
            this.A02.setScaleX(1.5f);
            this.A02.setScaleY(1.5f);
            C36341k9.A0q(getContext(), this.A02, R.color.f6nameremoved);
        } else {
            this.A02.setImageBitmap(decodeByteArray);
            C36411kG.A1D(this.A02);
        }
        if (set != null) {
            str = null;
        } else {
            str = A002.A03;
        }
        this.A07.setTitleAndDescription(A003, str, list);
        this.A07.setSubText(C55742v7.A00(this.A05, r7.A00, 1), list);
        View view = this.A00;
        if (set == null) {
            i = 8;
        }
        view.setVisibility(i);
    }
}
