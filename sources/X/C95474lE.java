package X;

import android.content.Intent;
import com.whatsapp.R;
import com.whatsapp.inappsupport.ui.SupportBkLayoutViewModel;
import com.whatsapp.shops.ShopsBkLayoutViewModel;
import com.whatsapp.util.Log;
import com.whatsapp.wabloks.base.GenericBkLayoutViewModel;
import com.whatsapp.wabloks.base.GenericBkLayoutViewModelWithReload;
import com.whatsapp.wabloks.commerce.ui.viewmodel.WaBkExtensionsLayoutViewModel;

/* renamed from: X.4lE  reason: invalid class name and case insensitive filesystem */
public abstract class C95474lE extends AnonymousClass04R {
    public C001600r A00;
    public C001700s A01;
    public boolean A02;
    public final AnonymousClass005 A03;

    public final void A0S() {
        if (!this.A02) {
            throw AnonymousClass001.A09("BkLayoutViewModel must be initialized");
        }
    }

    public void A0T(AnonymousClass65A r9, C134906bn r10, String str, String str2, String str3) {
        if (!this.A02) {
            this.A02 = true;
            AnonymousClass08S r3 = new AnonymousClass08S();
            C001700s A0S = C36431kI.A0S();
            this.A01 = A0S;
            r3.A0F(A0S, new C165217t4(r3, this, 2));
            this.A00 = r3;
            ((C131556Pn) this.A03.get()).A03(r10, new AnonymousClass71J(this.A01, r9), (Boolean) null, str, str2, str3);
        }
    }

    public boolean A0U(C122855vX r8) {
        boolean z;
        String A0r;
        String str;
        String str2;
        String str3;
        if (this instanceof WaBkExtensionsLayoutViewModel) {
            WaBkExtensionsLayoutViewModel waBkExtensionsLayoutViewModel = (WaBkExtensionsLayoutViewModel) this;
            int i = r8.A00;
            if (i == 1) {
                str2 = "extensions-layout-request-error";
            } else if (i == 3) {
                str2 = "extensions-layout-null-error";
            } else if (i == 4) {
                waBkExtensionsLayoutViewModel.A01.A0E(3228);
                str2 = "extensions-layout-unexpected-error";
            } else if (i == 6) {
                str2 = "extensions-layout-bloks-internal-error";
            } else if (i != 7) {
                str2 = "extensions-layout-undefined-error";
            } else {
                str2 = "extensions-layout-network-error";
            }
            int i2 = r8.A00;
            if (i2 == 1 || i2 == 3 || i2 == 4 || i2 == 6 || i2 == 7) {
                Exception exc = r8.A02;
                if (exc == null) {
                    str3 = null;
                } else if (exc instanceof AnonymousClass5V0) {
                    str3 = ((AnonymousClass5V0) exc).error.toString();
                } else {
                    str3 = exc.toString();
                }
                AnonymousClass17Z r0 = AnonymousClass17Z.$redex_init_class;
                C28201Rs r2 = waBkExtensionsLayoutViewModel.A02;
                boolean A09 = waBkExtensionsLayoutViewModel.A00.A09();
                int i3 = R.string.f12nameremoved;
                if (A09) {
                    i3 = R.string.f12nameremoved;
                }
                r2.A0D(new C128206Bi(i3, str2, str3));
                return false;
            }
            C18740tg.A0D(false, "BkLayoutViewModel: invalid error status");
            return false;
        } else if (this instanceof GenericBkLayoutViewModelWithReload) {
            ((GenericBkLayoutViewModelWithReload) this).A01.A0C(new AnonymousClass5OA(r8.A00));
            return false;
        } else if (this instanceof GenericBkLayoutViewModel) {
            GenericBkLayoutViewModel genericBkLayoutViewModel = (GenericBkLayoutViewModel) this;
            int i4 = r8.A00;
            if (i4 == 1 || i4 == 3 || i4 == 4 || i4 == 6 || i4 == 7) {
                boolean A092 = genericBkLayoutViewModel.A00.A09();
                int i5 = R.string.f12nameremoved;
                if (A092) {
                    i5 = R.string.f12nameremoved;
                }
                Log.e("BkLayoutViewModel: layout fetch error");
                C36341k9.A16(genericBkLayoutViewModel.A01, i5);
                return false;
            }
            C18740tg.A0D(false, "BkLayoutViewModel: invalid error status");
            return false;
        } else if (this instanceof ShopsBkLayoutViewModel) {
            ShopsBkLayoutViewModel shopsBkLayoutViewModel = (ShopsBkLayoutViewModel) this;
            int i6 = r8.A00;
            if (i6 != 1) {
                if (i6 == 2) {
                    Intent A0D = C36431kI.A0D();
                    A0D.putExtra("error_code", 475);
                    shopsBkLayoutViewModel.A01.A0D(A0D);
                    return false;
                } else if (!(i6 == 3 || i6 == 4 || i6 == 6 || i6 == 7)) {
                    C18740tg.A0D(false, "BkLayoutViewModel: invalid error status");
                    return false;
                }
            }
            Log.e("BkLayoutViewModel: layout fetch error");
            boolean A093 = shopsBkLayoutViewModel.A00.A09();
            int i7 = R.string.f12nameremoved;
            if (A093) {
                i7 = R.string.f12nameremoved;
            }
            Log.e("BkLayoutViewModel: layout fetch error");
            C36341k9.A16(shopsBkLayoutViewModel.A02, i7);
            return false;
        } else {
            if (this instanceof SupportBkLayoutViewModel) {
                SupportBkLayoutViewModel supportBkLayoutViewModel = (SupportBkLayoutViewModel) this;
                z = false;
                int i8 = r8.A00;
                if (i8 == 1) {
                    str = "REQUEST_FAILED";
                } else if (i8 == 3) {
                    str = "NULL_LAYOUT";
                } else if (i8 == 4) {
                    str = "UNEXPECTED_ERROR";
                } else if (i8 == 6) {
                    str = "UNKNOWN";
                } else if (i8 != 7) {
                    SupportBkLayoutViewModel.A01(supportBkLayoutViewModel, "UNKNOWN", 2);
                    supportBkLayoutViewModel.A02.A0D(C104595Aj.A00);
                    A0r = "SupportBkLayoutViewModel/handleError: Error status unknown";
                } else {
                    SupportBkLayoutViewModel.A01(supportBkLayoutViewModel, (String) null, 1);
                    Log.e("SupportBkLayoutViewModel/handleError: layout network");
                    supportBkLayoutViewModel.A02.A0D(C104585Ai.A00);
                    return false;
                }
                SupportBkLayoutViewModel.A01(supportBkLayoutViewModel, str, 2);
                supportBkLayoutViewModel.A02.A0D(C104575Ah.A00);
                A0r = AnonymousClass000.A0p("SupportBkLayoutViewModel/handleError: layout fetch error. Status: ", str, AnonymousClass000.A0u());
            } else {
                z = false;
                int i9 = r8.A00;
                if (i9 == 7) {
                    A0r = "Common/handleError: layout network";
                } else {
                    A0r = AnonymousClass000.A0r("Common/handleError: Something went wrong ", AnonymousClass000.A0u(), i9);
                }
            }
            Log.e(A0r);
            return z;
        }
    }

    public C95474lE(AnonymousClass005 r1) {
        this.A03 = r1;
    }
}
