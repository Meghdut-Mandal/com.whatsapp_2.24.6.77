package X;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.2dU  reason: invalid class name and case insensitive filesystem */
public class C47112dU extends C47162dZ {
    public C19730wQ A00;
    public AnonymousClass1Pp A01;
    public C19970wo A02;
    public C18820ts A03;
    public AnonymousClass1A5 A04;
    public C20810yC A05;
    public AnonymousClass1P5 A06;
    public AnonymousClass2XH A07;
    public C38711pZ A08;
    public C38391og A09;
    public boolean A0A;
    public final AnonymousClass1RY A0B;

    public void setMessage(AnonymousClass2bL r13, List list) {
        String string;
        long A0I;
        String A012;
        String str = "";
        if (r13 instanceof C46912bs) {
            C46912bs r5 = (C46912bs) r13;
            C20810yC r1 = this.A05;
            String str2 = r5.A01;
            if (str2 == null) {
                str2 = str;
            }
            string = C55742v7.A00(r1, str2, 2);
            A012 = C55742v7.A00(this.A05, r5.A00, 2);
            String A1Z = r5.A1Z();
            if (A1Z != null) {
                Uri parse = Uri.parse(A1Z);
                if (parse.getHost() != null) {
                    str = parse.getHost();
                }
            }
            if (TextUtils.isEmpty(string) && TextUtils.isEmpty(A012)) {
                string = getContext().getString(R.string.f12nameremoved);
            }
        } else {
            C46902br r10 = (C46902br) r13;
            string = getContext().getString(R.string.f12nameremoved);
            AnonymousClass1P5 r12 = this.A06;
            if (r10.A1J.A02) {
                A0I = r12.A0J(r10);
            } else {
                A0I = r12.A0I(r10);
            }
            boolean A022 = AnonymousClass3ST.A02(this.A02, r10, A0I);
            A012 = AnonymousClass3ST.A01(getContext(), this.A00, this.A02, this.A03, this.A06, r10, A022);
        }
        this.A08.setTitleAndDescription(string, A012, list);
        if (str != null) {
            this.A08.setSubText(str, (List) null);
        }
        this.A09.setMessage(r13);
    }

    public C47112dU(Context context, AnonymousClass1RY r2) {
        super(context);
        A02();
        this.A0B = r2;
        A03();
    }
}
