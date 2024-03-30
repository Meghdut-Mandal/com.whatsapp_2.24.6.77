package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.whatsapp.R;

/* renamed from: X.3KS  reason: invalid class name */
public final class AnonymousClass3KS {
    public final Context A00;
    public final C18820ts A01;
    public final AnonymousClass1DU A02;
    public final C160527l9 A03;
    public final AnonymousClass1SV A04;
    public final C19970wo A05;
    public final AnonymousClass1GQ A06;
    public final AnonymousClass1ZS A07;

    public final String A02(C48162go r8) {
        Context context;
        int i;
        Context context2;
        int i2;
        int i3;
        String string;
        C44072La r5 = r8.A04;
        AnonymousClass3T1 r3 = r8.A05;
        AnonymousClass1GQ r1 = this.A06;
        if (r5.A0R(r1)) {
            return this.A00.getString(R.string.f12nameremoved);
        }
        if (r5.A0Q(r1)) {
            AnonymousClass1ZS r12 = this.A07;
            String A012 = r12.A01(r12.A00());
            Context context3 = this.A00;
            if (A012 == null) {
                return context3.getString(R.string.f12nameremoved);
            }
            return C36351kA.A0w(context3, A012, 1, R.string.f12nameremoved);
        }
        if (r5.A0N) {
            context = this.A00;
            i = R.string.f12nameremoved;
        } else if (r3 != null) {
            if (r3 instanceof AnonymousClass2bV) {
                return ((AnonymousClass2bV) r3).A1Y();
            }
            if (r3 instanceof C46882bp) {
                return AnonymousClass3T9.A01(this.A00, (C46882bp) r3);
            }
            if (r3 instanceof C181798o3) {
                return AnonymousClass3T9.A02(this.A00, (C181798o3) r3);
            }
            if (r3 instanceof C181788o2) {
                Context context4 = this.A00;
                AnonymousClass2bU r32 = (AnonymousClass2bU) r3;
                if (AnonymousClass2bU.A02(r32)) {
                    return context4.getString(R.string.f12nameremoved);
                }
                return r32.A1a();
            }
            if (r3 instanceof C46962bx) {
                context2 = this.A00;
                i2 = R.string.f12nameremoved;
            } else if (r3 instanceof C46812bi) {
                AnonymousClass2bU r33 = (AnonymousClass2bU) r3;
                Context context5 = this.A00;
                if (r33.A09 != 1) {
                    i3 = R.string.f12nameremoved;
                    string = context5.getString(i3);
                } else if (r33.A0B != 0) {
                    string = AnonymousClass3UY.A07(this.A01, (long) r33.A0B);
                } else {
                    i3 = R.string.f12nameremoved;
                    string = context5.getString(i3);
                }
                AnonymousClass00C.A0B(string);
                return string;
            } else if (r3 instanceof AnonymousClass2bO) {
                C64933Qa r2 = r3.A1J;
                boolean z = r2.A00 instanceof C28981Uw;
                boolean z2 = r2.A02;
                context2 = this.A00;
                if (z) {
                    i2 = R.string.f12nameremoved;
                    if (z2) {
                        i2 = R.string.f12nameremoved;
                    }
                } else {
                    i2 = R.string.f12nameremoved;
                    if (z2) {
                        i2 = R.string.f12nameremoved;
                    }
                }
            } else if (r3 instanceof AnonymousClass2bS) {
                return ((AnonymousClass2bS) r3).A03;
            } else {
                if (!(r3 instanceof AnonymousClass2bK) || !C64933Qa.A04(r3)) {
                    return null;
                }
                context2 = this.A00;
                i2 = R.string.f12nameremoved;
            }
            return context2.getString(i2);
        } else if (r5.A0L()) {
            context = this.A00;
            i = R.string.f12nameremoved;
        } else if (!r5.A0M()) {
            return null;
        } else {
            context = this.A00;
            i = R.string.f12nameremoved;
        }
        return C36391kE.A0v(context, r5.A0K, new Object[1], 0, i);
    }

    public final Drawable A00(C48162go r5) {
        int i;
        C44072La r2 = r5.A04;
        AnonymousClass3T1 r3 = r5.A05;
        AnonymousClass1GQ r1 = this.A06;
        if (!r2.A0R(r1) && !r2.A0Q(r1)) {
            if (r3 == null) {
                return null;
            }
            if (r3 instanceof C46882bp) {
                i = R.drawable.msg_status_image_filled_wds;
            } else if (r3 instanceof C181798o3) {
                i = R.drawable.msg_status_video_filled_wds;
            } else if (r3 instanceof C181788o2) {
                i = R.drawable.msg_status_gif_filled_wds;
            } else if (r3 instanceof C46962bx) {
                i = R.drawable.msg_status_sticker_filled_wds;
            } else if (r3 instanceof AnonymousClass2bV) {
                AnonymousClass2bV r32 = (AnonymousClass2bV) r3;
                if (r32.A1c() == null || this.A02.A03(r32.A1Y()) == null) {
                    return null;
                }
                i = R.drawable.ic_action_link;
            } else if (r3 instanceof C46812bi) {
                return AnonymousClass3R0.A00(this.A00, (C46812bi) r3);
            } else if (!(r3 instanceof AnonymousClass2bO)) {
                if (r3 instanceof AnonymousClass2bK) {
                    i = R.drawable.msg_status_unsupported_normal_wds;
                } else if (!(r3 instanceof AnonymousClass2bS)) {
                    return null;
                } else {
                    i = R.drawable.msg_status_poll_v2_wds;
                }
            }
            return AnonymousClass3UF.A01(this.A00, i, R.color.f6nameremoved);
        }
        i = R.drawable.msg_status_client_revoked;
        return AnonymousClass3UF.A01(this.A00, i, R.color.f6nameremoved);
    }

    public final Drawable A01(C48162go r5) {
        AnonymousClass3T1 r0;
        AnonymousClass3T1 r2;
        C44072La r1 = r5.A04;
        if (r1.A0L()) {
            synchronized (r1) {
                r0 = r1.A0c;
            }
            if ((r0 == null || !r0.A1P) && (r2 = r5.A05) != null) {
                return AnonymousClass3T9.A00(this.A00, this.A05, r2);
            }
        }
        return null;
    }

    public AnonymousClass3KS(C19970wo r3, C19630wG r4, C18820ts r5, AnonymousClass1DU r6, AnonymousClass1GQ r7, AnonymousClass1ZS r8, AnonymousClass1SV r9) {
        C36321k7.A1B(r4, r3, r6, r5, r7);
        C36321k7.A10(r9, r8);
        this.A05 = r3;
        this.A02 = r6;
        this.A01 = r5;
        this.A06 = r7;
        this.A04 = r9;
        this.A07 = r8;
        Context context = r4.A00;
        AnonymousClass00C.A08(context);
        this.A00 = context;
        this.A03 = new C53702rk(r4, 14);
    }
}
