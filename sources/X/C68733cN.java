package X;

import android.content.Intent;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.contact.picker.ContactPickerFragment;

/* renamed from: X.3cN  reason: invalid class name and case insensitive filesystem */
public class C68733cN implements C225014r {
    public final C100804vn A00;

    public static AnonymousClass07B A00(ContactPickerFragment contactPickerFragment) {
        return contactPickerFragment.A0w.A00.getSupportActionBar();
    }

    public static void A01(ContactPickerFragment contactPickerFragment) {
        contactPickerFragment.A0w.A02();
    }

    public void A02() {
        this.A00.finish();
    }

    public void A03(Intent intent) {
        this.A00.setResult(-1, intent);
    }

    public boolean BLh() {
        return this.A00.BLh();
    }

    public void BO5(int i) {
        this.A00.BO5(i);
    }

    public void BO6(String str) {
        this.A00.BO6(str);
    }

    public void BO7(String str, String str2) {
        this.A00.BO7(str, str2);
    }

    public void BO8(C22908AyK ayK, Object[] objArr, int i, int i2, int i3) {
        this.A00.BO8(ayK, objArr, i, i2, i3);
    }

    public void BO9(Object[] objArr, int i, int i2) {
        this.A00.BO9(objArr, i, i2);
    }

    public void Bnv() {
        this.A00.Bnv();
    }

    public void Btl(DialogFragment dialogFragment, String str) {
        this.A00.Btl(dialogFragment, str);
    }

    public void Btm(DialogFragment dialogFragment) {
        this.A00.Btm(dialogFragment);
    }

    public void Btn(DialogFragment dialogFragment, String str) {
        this.A00.Btn(dialogFragment, "BrazilPaymentIncomeCollectionBottomSheet");
    }

    public void Bu2(int i, int i2) {
        this.A00.Bu2(i, i2);
    }

    public void Bwu(String str) {
        this.A00.Bwu(str);
    }

    public C68733cN(C100804vn r1) {
        this.A00 = r1;
    }
}
