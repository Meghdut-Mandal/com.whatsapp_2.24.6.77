package X;

import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Base64;
import com.whatsapp.R;
import java.math.BigDecimal;
import java.util.Map;

/* renamed from: X.AHe  reason: case insensitive filesystem */
public final class C21326AHe implements C159667jj {
    public final C19630wG A00;
    public final C24601Db A01;
    public final C24631De A02;
    public final C199849g7 A03;

    public Class B7I() {
        return AnonymousClass91N.class;
    }

    public /* bridge */ /* synthetic */ Object Bod(Enum enumR, Object obj, Map map) {
        boolean z;
        C202159l8 A022;
        AnonymousClass16U r1;
        int i;
        C207249un r8 = (C207249un) obj;
        AnonymousClass91N r7 = (AnonymousClass91N) enumR;
        boolean A1a = C36341k9.A1a(r8, r7);
        boolean z2 = true;
        switch (r7.ordinal()) {
            case 0:
                return r8.A0A;
            case 1:
                String str = r8.A07.A03;
                if (!"UNSET".equals(str)) {
                    return str;
                }
                C202159l8 A023 = this.A02.A02();
                if (A023 != null) {
                    return A023.A03;
                }
                return null;
            case 2:
                return this.A03.A02(r8, false);
            case 3:
                return r8.A0B;
            case 4:
                int A09 = r8.A09();
                if (Integer.valueOf(A09) == null) {
                    return "UNKNOWN";
                }
                if (A09 == A1a) {
                    return "DEBIT";
                }
                if (A09 == 2) {
                    return "BANK";
                }
                if (A09 == 3) {
                    return "WALLET";
                }
                if (A09 == 4) {
                    return "CREDIT";
                }
                if (A09 == 5) {
                    return "MERCHANT";
                }
                if (A09 == 6) {
                    return "COMBO";
                }
                if (A09 == 7) {
                    return "CARD_UNSET";
                }
                if (A09 == 8) {
                    return "PREPAID";
                }
                return "UNKNOWN";
            case 5:
                return "UNKNOWN";
            case 6:
                return Long.valueOf(r8.A05);
            case 7:
                return Long.valueOf(r8.A06);
            case 8:
                i = r8.A01;
                break;
            case 9:
                i = r8.A00;
                break;
            case 10:
                i = r8.A03;
                break;
            case 11:
                i = r8.A02;
                break;
            case 12:
                if (!(r8 instanceof C175778b2) || (A022 = this.A02.A02()) == null || (r1 = A022.A02) == null) {
                    return null;
                }
                C199449fK r3 = new C199449fK();
                r3.A02 = r1;
                BigDecimal bigDecimal = ((C175778b2) r8).A01.A00;
                int i2 = ((AnonymousClass16V) r1).A01;
                r3.A01 = bigDecimal.scaleByPowerOfTen(i2).longValue();
                r3.A00 = new BigDecimal(A1a ? 1 : 0).scaleByPowerOfTen(i2).intValue();
                return r3.A01();
            case 13:
                if (r8 instanceof C175778b2) {
                    return Long.valueOf(((C175778b2) r8).A00);
                }
                return null;
            case 14:
                byte[] bArr = r8.A0D;
                if (bArr != null) {
                    return Base64.encodeToString(bArr, 2);
                }
                if (r8 instanceof C175798b4) {
                    return AnonymousClass6Y8.A0B(BitmapFactory.decodeResource(C36421kH.A0B(this.A00), R.drawable.av_card));
                }
                if (r8 instanceof C175748az) {
                    return AnonymousClass6Y8.A0B(BitmapFactory.decodeResource(C36421kH.A0B(this.A00), R.drawable.av_bank));
                }
                return null;
            case 15:
                C24601Db r0 = this.A01;
                String str2 = r8.A0A;
                String[] split = r0.A03().getString("payments_sent_payment_with_account", "").split(";");
                int length = split.length;
                int i3 = 0;
                while (true) {
                    if (i3 < length) {
                        String str3 = split[i3];
                        if (TextUtils.isEmpty(str3) || !str3.equalsIgnoreCase(str2)) {
                            i3++;
                        } else {
                            z = true;
                        }
                    } else {
                        z = false;
                    }
                }
                return Boolean.valueOf(z);
            case 16:
                return r8.A08;
            default:
                throw C36441kJ.A18();
        }
        if (i != 2) {
            z2 = false;
        }
        return Boolean.valueOf(z2);
    }

    public C21326AHe(C19630wG r1, C24601Db r2, C24631De r3, C199849g7 r4) {
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = r4;
        this.A02 = r3;
    }
}
