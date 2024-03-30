package X;

import android.text.TextUtils;
import android.text.format.DateUtils;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.audiopicker.AudioPickerActivity;

/* renamed from: X.3Ac  reason: invalid class name and case insensitive filesystem */
public class C60983Ac {
    public final int A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final int A06;
    public final String A07;
    public final /* synthetic */ AudioPickerActivity A08;

    public C60983Ac(AudioPickerActivity audioPickerActivity, String str, String str2, String str3, int i, int i2, int i3) {
        int i4 = i3;
        this.A08 = audioPickerActivity;
        this.A06 = i;
        this.A01 = (TextUtils.isEmpty(str) || str.equalsIgnoreCase("<unknown>")) ? null : str;
        this.A07 = str2;
        this.A02 = str3;
        this.A00 = i4;
        int i5 = i2;
        this.A04 = DateUtils.formatElapsedTime(C36391kE.A0B((long) i5));
        C18820ts r8 = audioPickerActivity.A00;
        long A0B = C36441kJ.A0B(audioPickerActivity.A0D, 3657) * SearchActionVerificationClientService.MS_TO_NS;
        long j = (long) i4;
        if (j >= A0B - 60000 && j < A0B) {
            i4 = (int) (j - 60000);
        }
        this.A05 = (String) AnonymousClass3TF.A00(r8, (long) i4, true, false).first;
        this.A03 = AnonymousClass3UY.A0A(audioPickerActivity.A00, (long) Math.max(0, i5));
    }
}
