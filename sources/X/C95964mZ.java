package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import java.util.Calendar;
import java.util.List;

/* renamed from: X.4mZ  reason: invalid class name and case insensitive filesystem */
public class C95964mZ extends AnonymousClass0CZ {
    public final List A00;
    public final boolean A01;
    public final /* synthetic */ C142466ov A02;

    public /* bridge */ /* synthetic */ AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        int i2;
        if (i == 0) {
            i2 = R.layout.f9nameremoved;
        } else if (i == 1) {
            i2 = R.layout.f9nameremoved;
        } else if (i != 3) {
            i2 = R.layout.f9nameremoved;
            if (i != 4) {
                i2 = R.layout.f9nameremoved;
            }
        } else {
            i2 = R.layout.f9nameremoved;
        }
        C142466ov r2 = this.A02;
        View A0E = C36361kB.A0E(r2.A05.getLayoutInflater(), viewGroup, i2);
        if (i == 2) {
            return new AnonymousClass5B6(A0E, r2);
        }
        if (i == 3) {
            return new AnonymousClass5B4(A0E, r2);
        }
        if (i != 4) {
            return new AnonymousClass5B7(A0E, r2);
        }
        return new AnonymousClass5B5(A0E, r2);
    }

    public C95964mZ(C142466ov r1, List list, boolean z) {
        this.A02 = r1;
        this.A00 = list;
        this.A01 = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        if (r3.A01 != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A0J() {
        /*
            r3 = this;
            java.util.List r0 = r3.A00
            int r2 = r0.size()
            X.6ov r1 = r3.A02
            X.3Kq r0 = r1.A0P
            if (r0 != 0) goto L_0x0015
            X.3Kq r0 = r1.A0O
            if (r0 != 0) goto L_0x0015
            boolean r1 = r3.A01
            r0 = 1
            if (r1 == 0) goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            int r2 = r2 + r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C95964mZ.A0J():int");
    }

    public /* bridge */ /* synthetic */ void BSE(AnonymousClass0D3 r14, int i) {
        List list;
        String A0v;
        int i2;
        TextView textView;
        String A0v2;
        C96984oD r142 = (C96984oD) r14;
        C142466ov r1 = this.A02;
        if (r1.A0P != null || r1.A0O != null || this.A01) {
            list = this.A00;
        } else if (i != 0) {
            list = this.A00;
            i--;
        } else {
            return;
        }
        C63593Kq r3 = (C63593Kq) list.get(i);
        AnonymousClass141 A08 = r1.A0y.A08(r3.A06);
        if (A08 == null) {
            return;
        }
        if (r142 instanceof AnonymousClass5B6) {
            AnonymousClass5B6 r143 = (AnonymousClass5B6) r142;
            r143.A00 = A08;
            AnonymousClass3YG.A00(r143.A0H, r143, r3, 40);
            AnonymousClass141 r12 = r143.A00;
            C142466ov r5 = r143.A04;
            C19730wQ r0 = r5.A0x;
            r0.A0G();
            boolean equals = r12.equals(r0.A0E);
            TextEmojiLabel textEmojiLabel = r143.A02;
            if (equals) {
                textEmojiLabel.setText(R.string.f12nameremoved);
                String A0C = AnonymousClass3UY.A0C(r5.A11, r5.A12.A0H(r5.A0I) - C19970wo.A00(r5.A10));
                TextEmojiLabel textEmojiLabel2 = r143.A03;
                textEmojiLabel2.setText(A0C);
                textEmojiLabel2.setVisibility(0);
            } else {
                AnonymousClass171 r32 = r5.A0z;
                textEmojiLabel.A0I(r32.A0H(r143.A00));
                boolean A0g = r32.A0g(r143.A00, -1);
                TextEmojiLabel textEmojiLabel3 = r143.A03;
                if (A0g) {
                    textEmojiLabel3.setVisibility(0);
                    textEmojiLabel3.A0I(AnonymousClass171.A03(r32, r143.A00, R.string.f12nameremoved));
                } else {
                    textEmojiLabel3.setVisibility(8);
                }
            }
            r5.A0H.A0B(r143.A01, r143.A00, false);
        } else if (r142 instanceof AnonymousClass5B7) {
            AnonymousClass5B7 r144 = (AnonymousClass5B7) r142;
            r144.A00 = A08;
            AnonymousClass3YG.A00(r144.A0H, r144, r3, 39);
            C142466ov r7 = r144.A06;
            C19970wo r10 = r7.A10;
            long A002 = C19970wo.A00(r10);
            AnonymousClass141 r13 = r144.A00;
            C19730wQ r02 = r7.A0x;
            r02.A0G();
            boolean equals2 = r13.equals(r02.A0E);
            TextEmojiLabel textEmojiLabel4 = r144.A04;
            if (equals2) {
                textEmojiLabel4.setText(R.string.f12nameremoved);
                C48752hz.A00(r144.A02, r144, 27);
                long A0H = r7.A12.A0H(r7.A0I) - A002;
                if (A0H >= 0) {
                    String A0C2 = AnonymousClass3UY.A0C(r7.A11, A0H);
                    TextView textView2 = r144.A03;
                    textView2.setText(A0C2);
                    textView2.setVisibility(0);
                } else {
                    textView = r144.A03;
                    textView.setVisibility(8);
                }
            } else {
                AnonymousClass171 r9 = r7.A0z;
                textEmojiLabel4.A0I(r9.A0H(r144.A00));
                long j = r3.A05;
                if (A002 - j < 60000) {
                    A0v2 = r7.A05.getString(R.string.f12nameremoved);
                } else {
                    A0v2 = C36391kE.A0v(r7.A05, AnonymousClass3UM.A00(r7.A11, r10.A08(j)), AnonymousClass001.A0L(), 0, R.string.f12nameremoved);
                }
                r144.A02.setText(A0v2);
                boolean A0g2 = r9.A0g(r144.A00, -1);
                TextEmojiLabel textEmojiLabel5 = r144.A05;
                textView = textEmojiLabel5;
                if (A0g2) {
                    textEmojiLabel5.setVisibility(0);
                    textEmojiLabel5.A0I(AnonymousClass171.A03(r9, r144.A00, R.string.f12nameremoved));
                }
                textView.setVisibility(8);
            }
            r7.A0H.A0B(r144.A01, r144.A00, false);
        } else if (r142 instanceof AnonymousClass5B5) {
            AnonymousClass5B5 r145 = (AnonymousClass5B5) r142;
            TextView textView3 = r145.A00;
            C142466ov r102 = r145.A01;
            C19970wo r2 = r102.A10;
            long A082 = r2.A08(r3.A05);
            int A003 = AnonymousClass6XI.A00(C19970wo.A00(r2), A082);
            if (A003 <= 6) {
                if (A003 != 0) {
                    if (A003 != 1) {
                        Calendar instance = Calendar.getInstance();
                        instance.setTimeInMillis(A082);
                        switch (instance.get(7)) {
                            case 1:
                                i2 = R.string.f12nameremoved;
                                break;
                            case 2:
                                i2 = R.string.f12nameremoved;
                                break;
                            case 3:
                                i2 = R.string.f12nameremoved;
                                break;
                            case 4:
                                i2 = R.string.f12nameremoved;
                                break;
                            case 5:
                                i2 = R.string.f12nameremoved;
                                break;
                            case 6:
                                i2 = R.string.f12nameremoved;
                                break;
                            case 7:
                                i2 = R.string.f12nameremoved;
                                break;
                            default:
                                i2 = 0;
                                break;
                        }
                    } else {
                        i2 = R.string.f12nameremoved;
                    }
                } else {
                    i2 = R.string.f12nameremoved;
                }
                C18820ts r52 = r102.A11;
                A0v = AnonymousClass3UM.A01(r52, C36391kE.A0v(r102.A05, AnonymousClass3UM.A00(r52, A082), new Object[1], 0, i2), A082);
            } else {
                A0v = C36391kE.A0v(r102.A05, AnonymousClass3UY.A05(r102.A11, A003, A082), new Object[1], 0, R.string.f12nameremoved);
            }
            textView3.setText(A0v);
        }
    }

    public int getItemViewType(int i) {
        if (this.A01) {
            return 2;
        }
        C142466ov r3 = this.A02;
        if (r3.A0P == null && r3.A0O == null) {
            if (i == 0) {
                return 3;
            }
            i--;
        }
        List list = this.A00;
        if (list.get(i) == r3.A0O) {
            return 4;
        }
        if (list.get(i) == r3.A0P) {
            return 0;
        }
        return 1;
    }
}
