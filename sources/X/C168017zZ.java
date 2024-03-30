package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import java.util.List;

/* renamed from: X.7zZ  reason: invalid class name and case insensitive filesystem */
public class C168017zZ extends AnonymousClass0CZ {
    public final C18820ts A00;
    public final List A01;

    public AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new AnonymousClass800(C36351kA.A0C(viewGroup).inflate(R.layout.f9nameremoved, viewGroup, false), this);
        }
        LayoutInflater A0C = C36351kA.A0C(viewGroup);
        if (i != 1) {
            return new AnonymousClass801(A0C.inflate(R.layout.f9nameremoved, viewGroup, false), this);
        }
        return new C168217zt(A0C.inflate(R.layout.f9nameremoved, viewGroup, false));
    }

    public int A0J() {
        return this.A01.size();
    }

    public void BSE(AnonymousClass0D3 r7, int i) {
        C135506co r2;
        View view;
        int i2 = r7.A01;
        boolean z = true;
        if (i2 == 0) {
            AnonymousClass800 r72 = (AnonymousClass800) r7;
            AnonymousClass9EG r0 = (AnonymousClass9EG) this.A01.get(i);
            if (i == 0) {
                z = false;
            }
            r72.A01.setText(r0.A00);
            View view2 = r72.A00;
            int i3 = 8;
            if (z) {
                i3 = 0;
            }
            view2.setVisibility(i3);
        } else if (i2 == 1) {
            ((C168217zt) r7).A00.setText(((AnonymousClass9EG) this.A01.get(i)).A00);
        } else if (i2 == 2) {
            AnonymousClass801 r73 = (AnonymousClass801) r7;
            AnonymousClass8WE r5 = (AnonymousClass8WE) ((AnonymousClass9EG) this.A01.get(i));
            r73.A01.setText(r5.A00);
            WaTextView waTextView = r73.A02;
            String str = r5.A01;
            waTextView.setText(str);
            int i4 = r5.A00;
            if (i4 == 1) {
                C36331k8.A0r(waTextView.getContext(), waTextView, C224514j.A00(waTextView.getContext(), R.attr.f4nameremoved, R.color.f6nameremoved));
                r2 = new C135506co(r73, r5, 16);
                view = waTextView;
            } else if (i4 == 2) {
                waTextView.setText(r73.A03.A00.A0H(AnonymousClass3U8.A01(C203559oI.A00(), str)));
                View view3 = r73.A00;
                Context context = view3.getContext();
                Intent intent = new Intent("android.intent.action.DIAL", Uri.fromParts("tel", str, (String) null));
                if (intent.resolveActivity(context.getPackageManager()) != null) {
                    view3.setVisibility(0);
                    r2 = new C135506co(context, intent, 15);
                    view = view3;
                } else {
                    return;
                }
            } else {
                return;
            }
            view.setOnClickListener(r2);
        }
    }

    public int getItemViewType(int i) {
        List list = this.A01;
        if (list.get(i) instanceof AnonymousClass8WD) {
            return 0;
        }
        if (list.get(i) instanceof AnonymousClass8WC) {
            return 1;
        }
        return 2;
    }

    public C168017zZ(C18820ts r1, List list) {
        this.A01 = list;
        this.A00 = r1;
    }
}
