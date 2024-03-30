package com.whatsapp.glasses;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass00S;
import X.AnonymousClass3US;
import X.C18740tg;
import X.C19420v0;
import X.C20830yE;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36371kC;
import X.C48742hy;
import X.C48822i7;
import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.Arrays;

public final class BluetoothPermissionDialogFragment extends Hilt_BluetoothPermissionDialogFragment {
    public Dialog A00;
    public TextView A01;
    public C20830yE A02;
    public C19420v0 A03;
    public AnonymousClass00S A04;
    public boolean A05;
    public String[] A06 = new String[0];

    public void A0s(int i, String[] strArr, int[] iArr) {
        AnonymousClass00C.A0D(strArr, 1);
        if (i != 100) {
            C18740tg.A0D(false, "Unknown request code");
            return;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("BTPermissionDialogFragment/onRequestPermissionsResult permissions: ");
        A0u.append(Arrays.toString(strArr));
        A0u.append(", grantResults: ");
        C36321k7.A1a(A0u, Arrays.toString(iArr));
        int length = iArr.length;
        if (length != 0) {
            int i2 = 0;
            while (iArr[i2] == 0) {
                i2++;
                if (i2 >= length) {
                    AnonymousClass00S r0 = this.A04;
                    if (r0 != null) {
                        r0.invoke();
                        return;
                    }
                    return;
                }
            }
        }
    }

    public void A1H() {
        super.A1H();
        Dialog dialog = this.A00;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    public void A1L() {
        super.A1L();
        if (this.A05) {
            String[] strArr = this.A06;
            int length = strArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    Dialog dialog = this.A00;
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                    AnonymousClass00S r0 = this.A04;
                    if (r0 != null) {
                        r0.invoke();
                    }
                } else {
                    String str = strArr[i];
                    C20830yE r02 = this.A02;
                    if (r02 != null) {
                        if (r02.A02(str) != 0) {
                            break;
                        }
                        i++;
                    } else {
                        throw C36331k8.A0d("waPermissionsHelper");
                    }
                }
            }
            this.A05 = false;
        }
    }

    public void A1M() {
        Window window;
        super.A1M();
        Dialog dialog = this.A00;
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setLayout(C36341k9.A0G(this).getDisplayMetrics().widthPixels, C36341k9.A0G(this).getDisplayMetrics().heightPixels);
        }
    }

    public void A1Q(Bundle bundle) {
        super.A1Q(bundle);
        boolean z = A0b().getBoolean("bluetooth");
        C18740tg.A0D(z, "bluetooth permission is needed");
        ArrayList A0I = AnonymousClass001.A0I();
        if (z && Build.VERSION.SDK_INT >= 31) {
            A0I.add("android.permission.BLUETOOTH_CONNECT");
        }
        boolean z2 = false;
        this.A06 = C36371kC.A1b(A0I, 0);
        Dialog dialog = new Dialog(A0i());
        dialog.requestWindowFeature(1);
        Window window = dialog.getWindow();
        C18740tg.A06(window);
        C36371kC.A1G(window, 0);
        dialog.setCancelable(false);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setContentView(R.layout.f9nameremoved);
        ImageView imageView = (ImageView) dialog.findViewById(R.id.permission_image);
        imageView.setImageResource(R.drawable.vec_ic_calling_bluetooth);
        imageView.setVisibility(0);
        C48742hy.A01(dialog.findViewById(R.id.cancel), this, 43);
        this.A00 = dialog;
        View findViewById = dialog.findViewById(R.id.submit);
        AnonymousClass00C.A08(findViewById);
        TextView textView = (TextView) findViewById;
        this.A01 = (TextView) dialog.findViewById(R.id.permission_message);
        boolean A09 = AnonymousClass3US.A09(A0i(), this.A06);
        C19420v0 r1 = this.A03;
        if (r1 != null) {
            boolean A0A = AnonymousClass3US.A0A(r1, this.A06);
            if (!A09 && !A0A) {
                z2 = true;
            }
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("BTPermissionDialogFragment/permissions needBluetoothPermission=");
            A0u.append(z);
            A0u.append(", showRational=");
            A0u.append(A09);
            A0u.append(", isFistTimeRequest=");
            A0u.append(A0A);
            C36321k7.A1X(", permanentDenial=", A0u, z2);
            TextView textView2 = this.A01;
            if (textView2 != null) {
                textView2.setText(R.string.f12nameremoved);
            }
            if (z2) {
                textView.setText(R.string.f12nameremoved);
            }
            textView.setOnClickListener(new C48822i7(this, dialog, 0, z2));
            dialog.show();
            return;
        }
        throw C36331k8.A0d("waSharedPreferences");
    }
}
