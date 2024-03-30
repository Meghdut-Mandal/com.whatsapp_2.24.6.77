package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.1mm  reason: invalid class name and case insensitive filesystem */
public abstract class C37541mm extends ViewGroup implements C18700tb {
    public AnonymousClass1QZ A00;

    public abstract void A16();

    public static UserJid A01(AnonymousClass2IS r1) {
        C222813r r0 = UserJid.Companion;
        return C222813r.A00(r1.A0K.A1J.A00);
    }

    public static void A02(TextView textView) {
        if (textView != null) {
            textView.setEnabled(true);
            textView.setSelectAllOnFocus(true);
            textView.setTextIsSelectable(true);
        }
    }

    public static void A03(C65013Qj r3, AnonymousClass2bU r4, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("viewmessage/ from_me:");
        sb.append(z);
        sb.append(" type:");
        sb.append(r4.A1I);
        sb.append(" url:");
        sb.append(AnonymousClass6H5.A00(r4.A07));
        sb.append(" file:");
        sb.append(r3.A0I);
        sb.append(" progress:");
        sb.append(r3.A0E);
        sb.append(" transferred:");
        sb.append(r3.A0V);
        sb.append(" transferring:");
        sb.append(r3.A0f);
        sb.append(" fileSize:");
        sb.append(r3.A0C);
        sb.append(" media_size:");
        sb.append(r4.A00);
        sb.append(" timestamp:");
        sb.append(r4.A0I);
        Log.i(sb.toString());
    }

    public static void A04(AnonymousClass2IR r2, AnonymousClass3T1 r3) {
        C011004s.A08(r2.A0G, AnonymousClass3RL.A00(r3));
        ImageView imageView = r2.A0C;
        if (imageView != null) {
            C011004s.A08(imageView, AnonymousClass2IQ.A0N(r3));
        }
    }

    public static boolean A07(AnonymousClass2IS r2) {
        return r2.A0d.BLu(r2.A0K);
    }

    public static boolean A08(AnonymousClass2IR r3) {
        AnonymousClass005 r2 = r3.A25;
        return C66013Ui.A0X(r3.A0j, r3.A0K, r2);
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A00;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public C37541mm(Context context) {
        super(context);
        A16();
    }

    public static int A00(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public static void A05(C43352He r2) {
        r2.A2H();
        r2.getCarouselRecyclerView().A17(r2.getCarouselRecyclerView().getCurrentPosition());
    }

    public static boolean A06(AnonymousClass2IS r0) {
        return r0.getFMessage().A1J.A02;
    }

    public static boolean A09(AnonymousClass2IQ r0) {
        return C66013Ui.A10(r0.getFMessage());
    }

    public static boolean A0A(AnonymousClass2IQ r3) {
        return RequestPermissionActivity.A0B.A0J(r3.getContext(), r3.A02);
    }
}
