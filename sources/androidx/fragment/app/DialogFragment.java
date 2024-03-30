package androidx.fragment.app;

import X.AnonymousClass01z;
import X.AnonymousClass02E;
import X.AnonymousClass04S;
import X.AnonymousClass09Y;
import X.AnonymousClass0DU;
import X.AnonymousClass0ZP;
import X.AnonymousClass0ZR;
import X.C004201w;
import X.C023209t;
import X.C03640Hc;
import X.C09840d4;
import X.C09850dG;
import X.C11220fv;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.whatsapp.R;

public abstract class DialogFragment extends AnonymousClass02E implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public int A00 = -1;
    public int A01 = 0;
    public Dialog A02;
    public DialogInterface.OnCancelListener A03 = new AnonymousClass0ZP(this);
    public DialogInterface.OnDismissListener A04 = new AnonymousClass0ZR(this);
    public boolean A05 = true;
    public boolean A06;
    public boolean A07 = false;
    public boolean A08;
    public boolean A09;
    public boolean A0A = true;
    public boolean A0B;
    public int A0C = 0;
    public Handler A0D;
    public AnonymousClass04S A0E = new C09850dG(this);
    public Runnable A0F = new C11220fv(this);

    public void A19() {
        this.A0Y = true;
        if (!this.A09 && !this.A08) {
            this.A08 = true;
        }
        this.A0Q.A0B(this.A0E);
    }

    public void A1A(Bundle bundle) {
        Bundle bundle2;
        this.A0Y = true;
        if (this.A02 != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.A02.onRestoreInstanceState(bundle2);
        }
    }

    public void A1B() {
        this.A0Y = true;
        Dialog dialog = this.A02;
        if (dialog != null) {
            dialog.hide();
        }
    }

    public void A1J() {
        this.A0Y = true;
        Dialog dialog = this.A02;
        if (dialog != null) {
            this.A0B = true;
            dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
            this.A02.dismiss();
            if (!this.A08) {
                onDismiss(this.A02);
            }
            this.A02 = null;
            this.A07 = false;
        }
    }

    public void A1M() {
        this.A0Y = true;
        Dialog dialog = this.A02;
        if (dialog != null) {
            this.A0B = false;
            dialog.show();
            View decorView = this.A02.getWindow().getDecorView();
            decorView.setTag(R.id.view_tree_lifecycle_owner, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
        }
    }

    public Dialog A1a(Bundle bundle) {
        if (AnonymousClass01z.A0E(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("onCreateDialog called for DialogFragment ");
            sb.append(this);
            Log.d("FragmentManager", sb.toString());
        }
        return new AnonymousClass0DU(A0a(), A1Y());
    }

    public void A1b() {
        A00(this, false, false);
    }

    public void A1c() {
        A00(this, true, false);
    }

    public void A1d(int i, int i2) {
        if (AnonymousClass01z.A0E(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Setting style and theme for DialogFragment ");
            sb.append(this);
            sb.append(" to ");
            sb.append(i);
            sb.append(", ");
            sb.append(i2);
            Log.d("FragmentManager", sb.toString());
        }
        this.A01 = i;
        if (i == 2) {
            this.A0C = 16973913;
        }
        if (i2 != 0) {
            this.A0C = i2;
        }
    }

    public void A1e(int i, Dialog dialog) {
        if (!(i == 1 || i == 2)) {
            if (i == 3) {
                Window window = dialog.getWindow();
                if (window != null) {
                    window.addFlags(24);
                }
            } else {
                return;
            }
        }
        dialog.requestWindowFeature(1);
    }

    public void A1f(AnonymousClass01z r3, String str) {
        this.A08 = false;
        this.A09 = true;
        AnonymousClass09Y r1 = new AnonymousClass09Y(r3);
        r1.A0G = true;
        r1.A0D(this, str);
        r1.A00(false);
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    public static void A00(DialogFragment dialogFragment, boolean z, boolean z2) {
        if (!dialogFragment.A08) {
            dialogFragment.A08 = true;
            dialogFragment.A09 = false;
            Dialog dialog = dialogFragment.A02;
            if (dialog != null) {
                dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
                dialogFragment.A02.dismiss();
                if (!z2) {
                    if (Looper.myLooper() == dialogFragment.A0D.getLooper()) {
                        dialogFragment.onDismiss(dialogFragment.A02);
                    } else {
                        dialogFragment.A0D.post(dialogFragment.A0F);
                    }
                }
            }
            dialogFragment.A0B = true;
            if (dialogFragment.A00 >= 0) {
                AnonymousClass01z A0l = dialogFragment.A0l();
                int i = dialogFragment.A00;
                if (i >= 0) {
                    A0l.A0k(new C09840d4(A0l, (String) null, i, 1), z);
                    dialogFragment.A00 = -1;
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Bad id: ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
            }
            AnonymousClass09Y r1 = new AnonymousClass09Y(dialogFragment.A0l());
            r1.A0G = true;
            r1.A08(dialogFragment);
            if (z) {
                r1.A00(true);
            } else {
                r1.A00(false);
            }
        }
    }

    public C004201w A0j() {
        return new C03640Hc(this, new C023209t(this));
    }

    public void A1R(Bundle bundle) {
        Dialog dialog = this.A02;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i = this.A01;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.A0C;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.A05;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.A0A;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.A00;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    public final Dialog A1Z() {
        Dialog dialog = this.A02;
        if (dialog != null) {
            return dialog;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("DialogFragment ");
        sb.append(this);
        sb.append(" does not have a Dialog.");
        throw new IllegalStateException(sb.toString());
    }

    public void A1g(boolean z) {
        this.A05 = z;
        Dialog dialog = this.A02;
        if (dialog != null) {
            dialog.setCancelable(z);
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.A0B) {
            if (AnonymousClass01z.A0E(3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("onDismiss called for DialogFragment ");
                sb.append(this);
                Log.d("FragmentManager", sb.toString());
            }
            A00(this, true, true);
        }
    }

    public DialogFragment(int i) {
        this.A06 = i;
    }

    public void A0w(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Bundle bundle2;
        super.A0w(bundle, layoutInflater, viewGroup);
        if (this.A0F == null && this.A02 != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.A02.onRestoreInstanceState(bundle2);
        }
    }

    /* JADX INFO: finally extract failed */
    public LayoutInflater A1E(Bundle bundle) {
        StringBuilder sb;
        String str;
        LayoutInflater A1E = super.A1E(bundle);
        if (this.A0A && !this.A06) {
            if (!this.A07) {
                try {
                    this.A06 = true;
                    Dialog A1a = A1a(bundle);
                    this.A02 = A1a;
                    if (this.A0A) {
                        A1e(this.A01, A1a);
                        Context A1D = A1D();
                        if (A1D instanceof Activity) {
                            this.A02.setOwnerActivity((Activity) A1D);
                        }
                        this.A02.setCancelable(this.A05);
                        this.A02.setOnCancelListener(this.A03);
                        this.A02.setOnDismissListener(this.A04);
                        this.A07 = true;
                    } else {
                        this.A02 = null;
                    }
                    this.A06 = false;
                } catch (Throwable th) {
                    this.A06 = false;
                    throw th;
                }
            }
            if (AnonymousClass01z.A0E(2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("get layout inflater for DialogFragment ");
                sb2.append(this);
                sb2.append(" from dialog context");
                Log.d("FragmentManager", sb2.toString());
            }
            Dialog dialog = this.A02;
            if (dialog != null) {
                return A1E.cloneInContext(dialog.getContext());
            }
        } else if (AnonymousClass01z.A0E(2)) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("getting layout inflater for DialogFragment ");
            sb3.append(this);
            String obj = sb3.toString();
            if (!this.A0A) {
                str = "mShowsDialog = false: ";
            } else {
                sb = new StringBuilder();
                str = "mCreatingDialog = true: ";
            }
            sb.append(str);
            sb.append(obj);
            Log.d("FragmentManager", sb.toString());
        }
        return A1E;
    }

    public void A1O(Context context) {
        super.A1O(context);
        this.A0Q.A0A(this.A0E);
        if (!this.A09) {
            this.A08 = false;
        }
    }

    public void A1Q(Bundle bundle) {
        super.A1Q(bundle);
        this.A0D = new Handler();
        boolean z = false;
        if (this.A05 == 0) {
            z = true;
        }
        this.A0A = z;
        if (bundle != null) {
            this.A01 = bundle.getInt("android:style", 0);
            this.A0C = bundle.getInt("android:theme", 0);
            this.A05 = bundle.getBoolean("android:cancelable", true);
            this.A0A = bundle.getBoolean("android:showsDialog", this.A0A);
            this.A00 = bundle.getInt("android:backStackId", -1);
        }
    }

    public int A1Y() {
        return this.A0C;
    }

    public DialogFragment() {
    }
}
