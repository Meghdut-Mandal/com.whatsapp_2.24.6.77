package X;

import android.view.View;

/* renamed from: X.3Q9  reason: invalid class name */
public final class AnonymousClass3Q9 {
    public final View.OnClickListener A00;
    public final View.OnLongClickListener A01;
    public final Integer A02;
    public final boolean A03;

    public AnonymousClass3Q9(View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener, Integer num, boolean z) {
        AnonymousClass00C.A0D(onLongClickListener, 3);
        this.A02 = num;
        this.A00 = onClickListener;
        this.A01 = onLongClickListener;
        this.A03 = z;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3Q9) {
                AnonymousClass3Q9 r5 = (AnonymousClass3Q9) obj;
                if (this.A02 != r5.A02 || !AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01) || this.A03 != r5.A03) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Integer num = this.A02;
        return C36351kA.A05(this.A01, C36351kA.A05(this.A00, (A00(num).hashCode() + num.intValue()) * 31)) + C36341k9.A01(this.A03 ? 1 : 0);
    }

    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "INFO";
            case 1:
                return "SEARCH";
            case 2:
                return "FORWARD";
            case 3:
                return "AVATAR";
            case 4:
                return "FUN_STICKER";
            case 5:
                return "MARKETING_OPT_OUT";
            case 6:
                return "HOVER_ACTION";
            default:
                return "REPLY_WITH_PTV";
        }
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ActionButton(actionButtonType=");
        A0u.append(A00(this.A02));
        A0u.append(", onClickListener=");
        A0u.append(this.A00);
        A0u.append(", onLongClickListener=");
        A0u.append(this.A01);
        A0u.append(", isMarketingOptOut=");
        return C36321k7.A0H(A0u, this.A03);
    }
}
