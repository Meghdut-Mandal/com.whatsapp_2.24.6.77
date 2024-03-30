package X;

import android.content.Context;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.UnderlineSpan;
import android.util.Pair;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.whatsapp.status.widget.StatusEditText;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.2g6  reason: invalid class name */
public class AnonymousClass2g6 extends C66803Xj {
    public final /* synthetic */ AnonymousClass3OJ A00;

    public void afterTextChanged(Editable editable) {
        String str;
        Editable editable2 = editable;
        for (UnderlineSpan removeSpan : (UnderlineSpan[]) editable.getSpans(0, editable.length(), UnderlineSpan.class)) {
            editable.removeSpan(removeSpan);
        }
        AnonymousClass3OJ r5 = this.A00;
        StatusEditText statusEditText = r5.A0L;
        Context context = statusEditText.getContext();
        AnonymousClass1H2 r6 = r5.A0D;
        C21060yb r3 = r5.A0B;
        C19890wg r2 = r5.A0H;
        TextPaint paint = statusEditText.getPaint();
        C36331k8.A1G(context, 1, r6);
        AnonymousClass3UG.A07(context, paint, editable, r6, 1.1f);
        AnonymousClass6YV.A0M(editable, false);
        AnonymousClass6YV.A09(r3, r2, editable, paint.getColor(), true);
        String obj = editable.toString();
        r5.A0N.A06.A01(obj);
        boolean A1R = AnonymousClass000.A1R(TextUtils.getTrimmedLength(obj));
        if (r5.A0J.A00() && A1R && !r5.A04) {
            C29761Xw r62 = r5.A0K.A0A;
            if (r62.A04.A00()) {
                AnonymousClass2SV A002 = C29761Xw.A00(r62);
                A002.A03 = C36431kI.A13();
                C29771Xx r1 = r62.A05;
                A002.A02 = r1.A01;
                A002.A01 = r1.A00;
                r62.A02.Blw(A002);
            }
            r5.A04 = true;
        }
        String A03 = r5.A0F.A03(obj);
        int length = obj.length();
        C36341k9.A16(r5.A08, AnonymousClass3UN.A03(obj, 0, length));
        if (!r5.A05) {
            C39471sS r7 = r5.A0A;
            AnonymousClass005 r10 = r5.A02;
            if (r10 == null) {
                r10 = C36431kI.A0x(new C65873Tu(r5, 7));
                r5.A02 = r10;
            }
            r7.A0S(editable2, r5.A0E, r10, true, false);
        }
        int length2 = editable.length();
        int A01 = C63883Lu.A01(editable, 0, length2) + (AnonymousClass3OJ.A00(editable, 0, length2) * 49);
        int i = 700;
        if (A03 != null && !A03.equals(r5.A03) && !r5.A05) {
            i = 350;
        }
        if (A01 >= i && r5.A00 == 0) {
            int inputType = statusEditText.getInputType();
            r5.A00 = inputType;
            if (inputType != 0) {
                statusEditText.setInputType(inputType | 524288);
                statusEditText.setText(obj);
                statusEditText.setCursorPosition(length);
            }
        }
        ArrayList arrayList = null;
        if (!TextUtils.isEmpty(obj)) {
            Pattern pattern = C56852wz.A01;
            if (length > 4096) {
                str = obj.substring(0, ZipDecompressor.UNZIP_BUFFER_SIZE);
            } else {
                str = obj;
            }
            Matcher matcher = pattern.matcher(str);
            while (matcher.find()) {
                Pair A003 = AnonymousClass1DU.A00(obj, matcher.start(), matcher.end());
                if (A003 != null) {
                    String substring = obj.substring(C36381kD.A04(A003), C36381kD.A03(A003));
                    String[] strArr = C56852wz.A03;
                    int i2 = 0;
                    while (true) {
                        if (!AnonymousClass1DU.A02(substring, strArr[i2])) {
                            i2++;
                            if (i2 >= 2) {
                                break;
                            }
                        } else {
                            if (arrayList == null) {
                                arrayList = AnonymousClass001.A0I();
                            }
                            if (!arrayList.contains(A003)) {
                                arrayList.add(A003);
                            }
                        }
                    }
                }
            }
        }
        if (A03 != null && arrayList != null && arrayList.size() > 0 && statusEditText.getText() != null) {
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                int A06 = C36381kD.A06(statusEditText);
                if (C36381kD.A04((Pair) arrayList.get(i3)) < A06 && C36381kD.A03((Pair) arrayList.get(i3)) < A06) {
                    statusEditText.getText().setSpan(new UnderlineSpan(), C36381kD.A04((Pair) arrayList.get(i3)), C36381kD.A03((Pair) arrayList.get(i3)), 33);
                }
            }
        }
    }

    public AnonymousClass2g6(AnonymousClass3OJ r1) {
        this.A00 = r1;
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int codePointCount;
        AnonymousClass3OJ r4 = this.A00;
        r4.A0G.A00(C177528dw.A00);
        C39471sS r3 = r4.A0A;
        boolean z = false;
        if (i3 > i2 && ((codePointCount = Character.codePointCount(charSequence, i, i3 + i)) > 1 || (codePointCount == 1 && Character.isWhitespace(Character.codePointAt(charSequence, i))))) {
            z = true;
        }
        r3.A08 = z;
        StatusEditText statusEditText = r4.A0L;
        if (statusEditText.getText() != null && i + i3 == C36381kD.A06(statusEditText)) {
            r4.A07.post(C81183wb.A00(this, 23));
        }
    }
}
